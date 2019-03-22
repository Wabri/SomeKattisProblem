import sys

n_test_case = 0
n_cities = 0
cities = []
for i in sys.stdin:
    input_data = i.split()[0]
    if n_test_case == 0:
        n_test_case = (int)(input_data)
    elif n_cities == 0:
        n_cities = (int)(input_data)
    else:
        if input_data not in cities:
            cities.append(input_data)
        n_cities -= 1
        if n_cities == 0:
            print(len(cities))
            n_test_case -= 1
            cities = []
            if n_test_case == 0:
                exit()
