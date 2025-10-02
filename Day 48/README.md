Print Anagrams Together

Problem Statement:
Given an array of strings, the task is to group all words that are anagrams of each other.
The order of strings inside each group should respect their order of appearance in the input array.

Example

Input:

["act", "god", "cat", "dog", "tac"]


Output:

[["act", "cat", "tac"], ["god", "dog"]]


Explanation:

"act", "cat", "tac" are anagrams.

"god", "dog" are anagrams.

Input:

["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]


Output:

[["abc", "cab", "bac"], ["listen", "silent", "enlist"], ["rat", "tar", "art"]]

Constraints

1 <= arr.size() <= 100

1 <= arr[i].size() <= 10
