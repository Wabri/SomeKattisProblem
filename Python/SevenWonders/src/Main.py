import sys

cardTypes = {"T": 0, "C": 0, "G": 0}

for i in sys.stdin:
    cardsInput = i.strip("\n")
    result = 0
    for card in cardsInput:
        cardTypes[card] += 1
    for card in cardTypes:
        totalCardsType = cardTypes[card]
        result += totalCardsType*totalCardsType
    zeroLess = False
    while True:
        for card in cardTypes:
            cardTypes[card] -= 1
            if cardTypes[card] < 0:
                zeroLess = True
                break
        if zeroLess:
            break
        else:
            result += 7
    print(result)
    exit()
