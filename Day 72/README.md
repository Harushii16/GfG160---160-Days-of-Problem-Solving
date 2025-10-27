Find the first node of loop in linked list

Difficulty: MediumAccuracy: 55.49%Submissions: 91K+Points: 4
You are given the head of a singly linked list. If a loop is present in the linked list then return the first node of the loop else return -1.

Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null, indicating there is no loop. Note that pos is not passed as a parameter.

Examples:

Input: pos = 2,
   
Output: 3
Explanation: We can see that there exists a loop in the given linked list and the first node of the loop is 3.
Input: pos = 0,
   
Output: -1
Explanation: No loop exists in the above linked list. So the output is -1.
Constraints:
1 ≤ no. of nodes ≤ 106
1 ≤ node->data ≤ 106 
