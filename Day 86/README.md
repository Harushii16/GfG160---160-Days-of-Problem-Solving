Tree Boundary Traversal

Difficulty: MediumAccuracy: 23.33%Submissions: 515K+Points: 4Average Time: 35m
Given a root of a Binary Tree, return its boundary traversal in the following order:

Left Boundary: Nodes from the root to the leftmost leaf (prefer left child over right). Exclude leaf nodes.

Leaf Nodes: All leaf nodes from left to right, excluding those already in the left or right boundary.

Reverse Right Boundary: Nodes from the rightmost leaf to the root (prefer right child over left). Exclude the root if already included in the left boundary.

Note: If the root has no left or right subtree, consider the root itself as part of the respective boundary.

Examples:

Input: root = [1, 2, 3, 4, 5, 6, 7, N, N, 8, 9, N, N, N, N]
Output: [1, 2, 4, 8, 9, 6, 7, 3]
Explanation:

Input: root = [1, N, 2, N, 3, N, 4, N, N] 
Output: [1, 4, 3, 2]
Explanation:

Left boundary: [1] (as there is no left subtree)
Leaf nodes: [4]
Right boundary: [3, 2] (in reverse order)
Final traversal: [1, 4, 3, 2]
Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105

