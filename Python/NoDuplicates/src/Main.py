import sys

for i in sys.stdin:
    phrase = i.split()
    words = []
    for word in phrase:
        if word in words:
            print("no")
            exit()
        words.append(word)
    print("yes")
    exit()
