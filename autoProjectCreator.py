import os
import shutil
import sys

# argv[x]
# 1 -> project language
# 2 -> project name lower
# 3 -> kattis problem name
# 4 -> week
# 5 -> number of week problem
# 6 -> day of the week

# TODO()
# 1 -> auto update number week
# 2 -> auto get number of week problem
# 3 -> auto get number of day of the week

fetch = ""
while ("YES" not in fetch):
    fetch = input("Did you pull from origin? ")

projectName = sys.argv[2]
kattisName = sys.argv[3]

print("Creation of " + sys.argv[1] +
      " project named " + projectName)

src = ""
dest = ""
lang = ""
extension = ""
if sys.argv[1] == "java" or sys.argv[1] == "j":
    lang = extension = "java"
    src = "autoProjectCreatorResources/{}".format(lang.capitalize())
    dest = lang.capitalize()+"/" + projectName
elif sys.argv[1] == "python" or sys.argv[1] == "py":
    lang = "python"
    extension = "py"
    src = "autoProjectCreatorResources/{}".format(lang.capitalize())
    dest = lang.capitalize() + "/" + projectName
else:
    print("No language with this name")
    exit()

# Creation of metadata of project
print("Creation of metadata of project")
try:
    shutil.copytree(src, dest)
    os.chdir(dest)
    linesInFileProject = ""

    # README.md set up
    with open("README.md", "r") as readme:
        linesInFileProject = readme.readlines()
    if '###' in linesInFileProject[0]:
        linesInFileProject[0] = linesInFileProject[0].replace(
            '###', projectName)
    if '###' in linesInFileProject[2]:
        linesInFileProject[2] = linesInFileProject[2].replace(
            '###', kattisName)
    with open("README.md", "w") as readme:
        for line in linesInFileProject:
            print(line, file=readme, end='')

    os.chdir("../../")
except shutil.Error as e:
    print('Directory not copied. Error: %s' % e)
    exit()
except OSError as e:
    print('Directory not copied. Error: %s' % e)
    exit()


# Global README.md setup
print("Global README.md setup")

newSummaryProblems = "| [{}]".format(projectName) + \
    "(https://github.com/Wabri/AKattisProblemPerDay/blob/master/{}/{}) |".format(lang.capitalize(), projectName) + \
    " [{0}](https://github.com/Wabri/AKattisProblemPerDay/blob/master/{0}/{1}/src/Main.{2}) |".format(lang.capitalize(), projectName, extension) + \
    " [Week {0}](#week-{0}) |".format(sys.argv[4]) + \
    " [![:cat:](https://open.kattis.com/favicon)](https://open.kattis.com/problems/{}) |".format(kattisName)
newWeekProblem = "| {} | *{}* |".format(sys.argv[5], sys.argv[6]) + \
    " [{}](https://open.kattis.com/problems/{}) |".format(projectName, kattisName) + \
    " [{0}](https://github.com/Wabri/AKattisProblemPerDay/blob/master/{0}/{1}/src/Main.{2}) |".format(
    lang.capitalize(), projectName, extension)

steps = 0
with open("README.md", "r") as readme:
    linesInFileProject = readme.readlines()
    for index in range(len(linesInFileProject)):
        if "----------------------" in linesInFileProject[index]:
            steps += 1
            if steps == 1:
                continue
            if steps == 2:
                continue
            if steps == 3:
                # Create new line of summery problems
                print("Create new line of summery problems")
                linesInFileProject[index -
                                   1] = newSummaryProblems + "\n" * 2
            if steps == 4:
                # create new line of week problem
                print("Create new line of week problems")
                linesInFileProject[index - 1] = newWeekProblem + "\n" * 2
with open("README.md", "w") as readme:
    for line in linesInFileProject:
        print(line, file=readme, end='')
