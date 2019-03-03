# SymmetricOrder

[![:cat:](https://open.kattis.com/favicon)](https://open.kattis.com/problems/symmetricorder)

In your job at Albatross Circus Management (yes, it’s run by a bunch of clowns), you have just finished writing a program whose output is a list of names in nondescending order by length (so that each name is at least as long as the one preceding it). However, your boss does not like the way the output looks, and instead wants the output to appear more symmetric, with the shorter strings at the top and bottom and the longer strings in the middle. His rule is that each pair of names belongs on opposite ends of the list, and the first name in the pair is always in the top part of the list. In the first example set below, Bo and Pat are the first pair, Jean and Kevin the second pair, etc.

## Input

The input consists of one or more sets of strings, followed by a final line containing only the value 00. Each set starts with a line containing an integer, nn, which is the number of strings in the set, followed by nn strings, one per line, sorted in nondescending order by length. None of the strings contain spaces. There is at least one and no more than 1515 strings per set. Each string is at most 2525 characters long.

## Output

For each input set print “SET nn” on a line, where nn starts at 1, followed by the output set as shown in the sample output.

Sample Input 1 	
```
7
Bo
Pat
Jean
Kevin
Claude
William
Marybeth
6
Jim
Ben
Zoe
Joey
Frederick
Annabelle
5
John
Bill
Fran
Stan
Cece
0
```

Sample Output 1
```
SET 1
Bo
Jean
Claude
Marybeth
William
Kevin
Pat
SET 2
Jim
Zoe
Frederick
Annabelle
Joey
Ben
SET 3
John
Fran
Cece
Stan
Bill
```
