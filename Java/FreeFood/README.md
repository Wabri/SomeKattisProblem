# FreeFood

[![:cat:](https://open.kattis.com/favicon)](https://open.kattis.com/problems/freefood)

Do you know what attracts almost any college student to participate in an event? Yes, free food. It doesn’t matter whether the event involves a long (sometimes boring) seminar. As long as free food is served for the event, then students will surely come.

Suppose there are N events to be held this year. The ith event is scheduled from day si to day ti, and free food is served for that event every day from day si to day ti (inclusive). Your task in this problem is to find out how many days there are in which free food is served by at least one event.

For example, let there be N=3 events. The first event is held from day 10 to 14, the second event is held from day 13 to 17, and the third event is held from day 25 to 26. The days in which free food is served by at least one event are 10,11,12,13,14,15,16,17,25,26, for a total of 10 days. Note that both events serve free food on days 13 and 14.

## Input

The first line contains an integer N (1≤N≤100) denoting the number of events. Each of the next N lines contains two integers si and ti (1≤si≤ti≤365) denoting that the ith event will be held from si to ti (inclusive), and free food is served for all of those days.

## Output

The output contains an integer denoting the number of days in which free food is served by at least one event.

Sample Input 1
```
3
10 14
13 17
25 26
```
Sample Output 1
```
10
```

Sample Input 2
```
2
1 365
20 28
```
Sample Output 2
```
365
```

Sample Input 3
```
4
29 29
48 48
102 102
94 94
```
Sample Output 3
```
4
```
