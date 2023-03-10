# Linked List Random Node

 Return a random node from a linked list

Given a singly linked list, return a random node's value from the linked list. Each node must have the **same probability** of being chosen.

Implement the `Solution` class:

- `Solution(ListNode head)` Initializes the object with the head of the singly-linked list `head`.
- `int getRandom()` Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be chosen.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/16/getrand-linked-list.jpg)

**Input**
["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
[[[1, 2, 3]], [], [], [], [], []]
**Output**
[null, 1, 3, 2, 2, 3]

**Explanation**
Solution solution = new Solution([1, 2, 3]);
solution.getRandom(); // return 1
solution.getRandom(); // return 3
solution.getRandom(); // return 2
solution.getRandom(); // return 2
solution.getRandom(); // return 3
// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.

**Constraints:**

- The number of nodes in the linked list will be in the range `[1, 104]`.
- `-104 <= Node.val <= 104`
- At most `104` calls will be made to `getRandom`.



## Explanation & Solution

To solve the problem of selecting a random node from a linked list in Java, we can follow the below approach:

1. Traverse the linked list to count the total number of nodes present in the list.
2. Generate a random number between 0 and the total number of nodes (exclusive).
3. Traverse the linked list again and stop at the node corresponding to the random number generated in step 2.
4. Return the node obtained in step 3.

In this implementation, we have created two classes: `ListNode` to represent a node of the linked list, and `LinkedListRandomNode` to encapsulate the logic of selecting a random node.

The `LinkedListRandomNode` class has three instance variables: `head` to store the head of the linked list, `size` to store the total number of nodes in the linked list, and `random` to generate random numbers.

The `getSize` method is a helper method to count the total number of nodes in the linked list.

The `getRandom` method selects a random node from the linked list by generating a random index between 0 and `size - 1` and then traversing the linked list until the node at that index is reached. The value of that node is then returned.

Note that in this implementation, we assume that the linked list is not null and has at least one node. We can add error handling for these cases if needed.
