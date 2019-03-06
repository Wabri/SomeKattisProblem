import sys

number_of_cases = 0
is_done = False
for i in sys.stdin:
    if not is_done:
        number_of_cases = (int)(i.split()[0])
        is_done = True
    elif not number_of_cases == 0:
        cases = []
        inputCases = i.split()
        for case in inputCases:
            cases.append((int)(case))
        old_case = cases[0]
        not_born = 0
        for case in cases[1:]:
            if (case == 0):
                break
            else:
                if (case - old_case*2 > 0):
                    not_born += case - old_case*2
                old_case = case
        print(not_born)
        number_of_cases -= 1
    else:
        exit()
