import sys

for i in sys.stdin:
    ab = i.split()
    stars = int(ab[0])
    right = (int)(stars/2)
    left = (int)(stars/2) + (int)(stars % 2)

    result = []
    print("{}:".format(stars))
    result.append("{},{}".format(left, right))

    while True:
        stars_temp = stars
        if (left > right):
            left -= 1
        elif (left == right):
            right -= 1
        if (right*left > 1):
            bit = False
            while stars_temp > 0:
                if not bit:
                    stars_temp -= left
                    bit = True
                else:
                    stars_temp -= right
                    bit = False
        else:
            break
        if stars_temp == 0:
            result.append("{},{}".format(left, right))
    for element in result[::-1]:
        print(element)
    exit()
