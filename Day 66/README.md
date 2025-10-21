Rotate a Linked List

Difficulty: MediumAccuracy: 39.95%Submissions: 308K+Points: 4Average Time: 30m
You are given the head of a singly linked list, you have to left rotate the linked list k times. Return the head of the modified linked list.

Examples:

Input: k = 4,
   
Output: 50 -> 10 -> 20 -> 30 -> 40
Explanation:
Rotate 1: 20 -> 30 -> 40 -> 50 -> 10
Rotate 2: 30 -> 40 -> 50 -> 10 -> 20
Rotate 3: 40 -> 50 -> 10 -> 20 -> 30
Rotate 4: 50 -> 10 -> 20 -> 30 -> 40
   
Input: k = 6,
   
Output: 30 -> 40 -> 10 -> 20 
   
Constraints:
1 ≤ number of nodes ≤ 105
0 ≤ k ≤ 109
0 ≤ node.data ≤ 109
