import sys

rows = 0
columns = 0
rows_scanner = 0
columns_scanner = 0
for i in sys.stdin:
    parameters = i.split()
    if rows_scanner*columns_scanner*rows == 0:
        rows = (int)(parameters[0])
        columns = (int)(parameters[1])
        rows_scanner = (int)(parameters[2])
        columns_scanner = (int)(parameters[3])
    else:
        parameters = (str)(parameters[0])
        result = {}
        for row in range(rows_scanner):
            result_list = []
            for character in parameters:
                for column in range(columns_scanner):
                    result_list.append(character)
            result = ""
            for character in result_list:
                result += character
            print(result)
        rows -= 1
        if (rows == 0):
            exit()
