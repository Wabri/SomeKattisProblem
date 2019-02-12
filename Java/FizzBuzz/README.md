# FizzBuzz

[![:cat:](https://open.kattis.com/favicon)](https://open.kattis.com/problems/fizzbuzz)

According to Wikipedia, FizzBuzz is a group word game for children to teach them about division. This may or may not be true, but this question is generally used to torture screen young computer science graduates during programming interviews.

Basically, this is how it works: you print the integers from 11 to NN, replacing any of them divisible by XX with Fizz or, if they are divisible by YY, with Buzz. If the number is divisible by both XX and YY, you print FizzBuzz instead.

Check the samples for further clarification.

## Input

Input contains a single test case. Each test case contains three integers on a single line, XX, YY and NN (1≤X<Y≤N≤1001 \leq X < Y \leq N \leq 100).

## Output

Print integers from 11 to NN in order, each on its own line, replacing the ones divisible by XX with Fizz, the ones divisible by YY with Buzz and ones divisible by both XX and YY with FizzBuzz.

Sample Input 1
```
2 3 7
```
Sample Output 1
```
1
Fizz
Buzz
Fizz
5
FizzBuzz
7
```

Sample Input 2
```
2 4 7
```
Sample Output 2
```
1
Fizz
3
FizzBuzz
5
Fizz
7
```

Sample Input 3
```
3 5 7
```
Sample Output 3
```
1
2
Fizz
4
Buzz
Fizz
7
```
