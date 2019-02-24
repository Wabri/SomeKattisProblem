# BatterUp

[![:cat:](https://open.kattis.com/favicon)](https://open.kattis.com/problems/batterup)

While the Chicago Cubs were ecstatic with their 2016 World Series championship, they were eliminated from the playoffs in 2017. Looking ahead to 2018 they are beginning to embrace the more data-driven analysis of player’s values known as Sabermetrics.

For example, a player’s batting average is calculated by dividing the total number of base hits by the total number of official at-bats. One limitation of using the batting average to evaluate players is that it treats all hits equally, rather than taking into account doubles, triples or home runs. For this reason, analysts often prefer to consider what is known as the slugging percentage, which distinguishes between different hit outcomes. To calculate the slugging percentage, the total number of bases of all hits is divided by the total numbers of time at bat, that did not result in walks, or at-bats.

More specifically, an at-bat can earn 00, 11, 22, 33 or 44 bases (these are referred to as official at-bats). Furthermore, some at-bats, such as those that result in a base-on-balls (i.e., a “walk”) are not considered in either the player’s batting average or slugging percentage.

For example, if a player hits a triple (33 bases), strikes out (00 bases), and hits a double (22 bases), their slugging percentage would be 3+0+23≈1.6667\frac{3+0+2}{3} \approx 1.6667. If a player hits a single (11 base), walks, and hits a home run (44 bases), the slugging level would be 1+42=2.5\frac{1 + 4}{2}=2.5. Notice that in this case, the denominator is two, not three, because the walk does not count towards the slugging percentage.

## Input

The input is composed of two lines. The first line contains a single positive integer nn (1≤n≤1001 \le n \le 100) that specifies the number of at-bats. The second line contains nn integers, separated by spaces, each describing one of those at-bats. Strike-outs, singles, doubles, triples, and home runs are represented as 0, 1, 2, 3, 4, respectively. Walks are represented as -1. You may assume that there will always be at least one official at-bat (i.e., at least one at-bat will not be a walk).

## Output

Display the player’s slugging percentage as a real number, accurate to within an absolute or relative error of 10−310^{-3}. We recommend that you do not round the value that you calculate.

Sample Input 1 	
```
3
3 0 2
```

Sample Output 1
```
1.6666666666666667
```

Sample Input 2 	
```
3
1 -1 4
```

Sample Output 2
```
2.5
```

Sample Input 3 	
```
11
-1 -1 -1 -1 0 0 0 0 0 0 1
```

Sample Output 3
```
0.14285714285714285
```

