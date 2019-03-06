# StandOnZanzibar

[![:cat:](https://open.kattis.com/favicon)](https://open.kattis.com/problems/zanzibar)

Turtles live long (and prosper). Turtles on the island Zanzibar are even immortal. Furthermore, they are asexual, and every year they give birth to at most one child. Apart from that, they do nothing. They never leave their tropical paradise.

Zanzi Bar, the first turtle on Zanzibar, has one further activity: it keeps track of the number of turtles on the island. Every New Year’s Day it counts the turtles, and writes the total number in a small booklet. After many years this booklet contains a non-decreasing sequence of integers, starting with one or more ones. (After emerging from its egg on Zanzibar’s beautiful beach, it took Zanzi some time to start a family on its own.)

One day Zanzi realizes that it could also be the case that turtles from abroad come to Zanzibar, by boat or plane. Now it wonders how many of the inhabitants were not born on Zanzibar. Unfortunately, it can only derive a lower bound from the sequence in the booklet. Indeed, if the number of turtles in a year is more than twice as big as the year before, the difference must be fully explained by import.

As soon as Zanzibar has 1000000 turtles, the island is totally covered with turtles, and both reproduction and import come to a halt. Please help Zanzi! Write a program that computes the lower bound of import turtles, given a sequence, as described above.

## Input

The input starts with a line containing an integer TT (1≤T≤13), the number of test cases. Then for each test case:

    One line containing a sequence of space-separated, positive integers (≤1000000), non-decreasing, starting with one or more ones. For convenience, a single space and a 0 are appended to the end of the sequence.

## Output

For each test case, output a line containing a single integer: the lower bound for the number of turtles not born on Zanzibar.

Sample Input 1
```
3
1 100 0
1 1 1 2 2 4 8 8 9 0
1 28 72 0
```

Sample Output 1
```
98
0
42
```
