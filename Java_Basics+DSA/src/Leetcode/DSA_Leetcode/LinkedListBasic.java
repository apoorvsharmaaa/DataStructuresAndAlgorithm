package Leetcode.DSA_Leetcode;


class LinkedListBasic {

    private Node head;
    private Node tail;
    private int size;

    public LinkedListBasic() {
        this.size = 0;
    }


    private class Node {
        private String data;
        private Node next;
        private int integer;

        public Node(int integer){
            this.integer = integer;
            size++;
        }

        public Node(String data) {
            this.data = data;
            size++;
        }

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int integer, Node next) {
            this.integer = integer;
            this.next = next;
        }
    }

//FOR STRING
    //Add -> first , last

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //ADD --> last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //PRINT
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //DELETE --> FIRST
    public void deleteFirst(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //DELETE --> LAST
    public void deleteLast(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next ==null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    //FOR INT
    //Add -> first , last
    public void addFirst(int integer){
        Node newNode = new Node(integer);
        if (head == null){
            head = newNode;
            return;
        }
            newNode.next = head;
            head = newNode;
    }

    //ADD--> LAST
    public void addLast(int integer){
        Node newNode = new Node(integer);
        if (tail == head){
            addFirst(integer);
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

//BICH MAI KAHI

    public void insert(int integer , int index){
        if (index == 0){
            addFirst(integer);
            return;
        }
        if (index == size){
            addLast(integer);
            return;
        }
        Node temp = head;
        for (int i=1 ; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(integer , temp.next);
        temp.next = node;
        size++;
    }


    public void displayList(){
        if(head == null){
            System.out.println("list is empty");
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.integer + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //SIZE
    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if (head == null || head.next == null){
            return;
        }
        Node prevNode = head;
         Node currNode = head.next;
         while (currNode != null){
             Node nextNode = currNode.next;
             currNode.next = prevNode;

             //UPDATE
             prevNode = currNode;
             currNode = nextNode;
         }
         head.next = null;
         head = prevNode;
    }

    public static void main(String args[]) {
        LinkedListBasic list = new LinkedListBasic();
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.insert(7,4);
        list.displayList();
//        list.deleteFirst();
//        list.displayList();
//        list.addFirst("a");
//        list.addFirst("is");
//        list.printList();
//        list.addLast("list");
//        list.printList();
//        list.addFirst("this");
//        list.printList();
//
//        list.deleteFirst();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();
//
//        System.out.println(list.getSize());
//
//        list.reverseIterate();
//        list.printList();
    }
}
//        LinkedList<String> list = new LinkedList<String>();
//        list.add("is");
//        list.add("a");
//        list.addLast("list");
//        list.addFirst("this");
//        list.add(3, "linked");
//        System.out.println(list);
//
//
//        System.out.println(list.get(0));
//        System.out.println(list.size());
//        list.remove(3);
//        list.removeFirst();
//        list.removeLast();
////
//        System.out.println(list);
//    }
//}
