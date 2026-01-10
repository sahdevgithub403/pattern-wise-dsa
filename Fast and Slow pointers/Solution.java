class Solution {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public boolean detectCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next; 

            if (slow == fast) {
                return true; 
            }
        }

        return false; 
    }

    public static void main(String[] args) {

        Solution sl = new Solution();

        sl.addNode(1);
        sl.addNode(4);
        sl.addNode(5);

        sl.head.next.next.next = sl.head;

        System.out.println("Cycle present: " + sl.detectCycle());
    }
}
