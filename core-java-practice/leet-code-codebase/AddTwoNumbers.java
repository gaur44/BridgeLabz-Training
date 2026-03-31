class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNodes(l1,l2, false);
    }

    private ListNode addTwoNodes(ListNode node1, ListNode node2, boolean addTenForPrevLevel) {
        if (!addTenForPrevLevel && node1 == null && node2 == null){
            return null;
        }

        int sum = ((addTenForPrevLevel ? 1 : 0) + (node1 == null ? 0 : node1.val) + (node2 == null ? 0 : node2.val)) ;
        ListNode nextNode = addTwoNodes(node1== null ? null : node1.next, node2== null ? null : node2.next, sum >= 10);
        return new ListNode(sum % 10, nextNode);
    } 
}
