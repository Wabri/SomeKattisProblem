import sys

for i in sys.stdin:
    ab = i.split()
    n = int(ab[0])
    h = int(ab[1])
    v = int(ab[2])

    print(max(h, n - h) * max(v, n - v) * 4)

