# Quadrant Selection

[![:cat:](https://open.kattis.com/favicon)](https://open.kattis.com/problems/quadrant)

A common problem in mathematics is to determine which quadrant a given point lies in. There are four quadrants, numbered from 1
to 4. For example, the point (12,5) lies in quadrant 1 since both its x and y values are positive, and point (-12,5) lies in quadrant 2 since its x value is negative and its y value is positive.

Your job is to take a point and determine the quadrant it is in. You can assume that neither of the two coordinates will be 0.

## Input

The first line of input contains the integer x
(−1000≤x≤1000;x≠0). The second line of input contains the integer y (−1000≤y≤1000;y≠0).

## Output
Output the quadrant number (1, 2, 3 or 4) for the point (x,y).

Sample Input 1
```
10
6
```
Sample Output 1
```
1
```
Sample Input 2
```
9
-13
```
Sample Output 2
```
4
```
