/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* partition(ListNode* head, int x) {
    ListNode beforeHead(0);
    ListNode afterHead(0);
    ListNode* before = &beforeHead;
    ListNode* after = &afterHead;

    for (; head; head = head->next)
      if (head->val < x) {
        before->next = head;
        before = head;
      } else {
        after->next = head;
        after = head;
      }

    after->next = nullptr;
    before->next = afterHead.next;

    return beforeHead.next;
    }
};

// Path: Partition_List.cpp