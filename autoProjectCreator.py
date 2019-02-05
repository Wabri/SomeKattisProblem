import os
import shutil
import sys

# test use:
# python3 autoProjectCreator.py java test test 2 9 44

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
while (fetch=="YES"):
	fetch = input("Did you pull from origin?")

projectName = sys.argv[2]
kattisName = sys.argv[3]

print("Creation of " + sys.argv[1] +
      " project named " + projectName)

if sys.argv[1] == "java":
    src = "autoProjectCreatorResources/Java"
    dest = "Java/" + projectName
    try:
        shutil.copytree(src, dest)
        os.chdir(dest)
        linesInFileProject = ""

        # .project eclipse metadata setup
        with open(".project", "r") as project:
            linesInFileProject = project.readlines()
        if '###' in linesInFileProject[2]:
            linesInFileProject[2] = linesInFileProject[2].replace(
                '###', projectName)
        with open(".project", "w") as project:
            for line in linesInFileProject:
                print(line, file=project, end='')

        # README.md of problem set up
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

        # README.md of repository update
        os.chdir("../../")
        steps = 0
        newSummaryProblems = "| [{}]".format(projectName) + \
            "(https://github.com/Wabri/AKattisProblemPerDay/blob/master/{}/{}) |".format(sys.argv[1].capitalize(), projectName) + \
            " [{0}](https://github.com/Wabri/AKattisProblemPerDay/blob/master/{0}/{1}/src/Main.java) |".format(sys.argv[1].capitalize(), projectName) + \
            " [Week {0}](#week-{0}) |".format(sys.argv[4]) + \
            " [![:cat:](https://open.kattis.com/favicon)](https://open.kattis.com/problems/{}) |\r\n".format(kattisName)
        newWeekProblem = "| {} | *{}* |".format(sys.argv[5], sys.argv[6]) + \
            " [{}](https://open.kattis.com/problems/{}) |".format(projectName, kattisName) + \
            " [{0}](https://github.com/Wabri/AKattisProblemPerDay/blob/master/{0}/{1}/src/Main.java) |\r\n".format(
                sys.argv[1].capitalize(), projectName)
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
                        # create new line of summery problems
                        linesInFileProject[index - 1] = newSummaryProblems
                    if steps == 4:
                        # create new line of week problem
                        linesInFileProject[index - 1] = newWeekProblem
        with open("README.md", "w") as readme:
            for line in linesInFileProject:
                print(line, file=readme, end='')

    except shutil.Error as e:
        print('Directory not copied. Error: %s' % e)
    except OSError as e:
        print('Directory not copied. Error: %s' % e)
