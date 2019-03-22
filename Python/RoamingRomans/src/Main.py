import sys

for i in sys.stdin:
    e_mile = (float)(i.split()[0])
    conversion = 1000*(5280/4854)
    r_mile = e_mile*conversion
    decimal_r_mile = r_mile % (int)(r_mile) * 10
    if decimal_r_mile > 5:
        r_mile = r_mile+1
    print((int)(r_mile))
    exit()
