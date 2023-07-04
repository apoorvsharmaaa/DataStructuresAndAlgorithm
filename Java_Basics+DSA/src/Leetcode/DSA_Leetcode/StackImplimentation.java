package Leetcode.DSA_Leetcode;

import java.util.Stack;

public class StackImplimentation {


    //    Stack using collection framework
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
//        System.out.println(s);

//        while (!s.isEmpty()) {
//            System.out.println(s.peek());
//            s.pop();
//        }
    }
}



//    static class Node{


////        ARRAYLIST
//        static ArrayList<Integer> list = new ArrayList<>();
//        public static boolean isEmpty(){
//            return list.size() ==0;
//        }
//
////        PUSH
//        public static void push(int data){
//            list.add(data);
//        }
//
////        POP
//        public static int pop(){
//            if (isEmpty()){
//                return -1;
//            }
//            int top = list.get(list.size()-1);
//            list.remove(list.size()-1);
//            return top;
//        }
//
////        PEEK
//        public static int peek(){
//            if (isEmpty()) {
//                return -1;
//            }
//            return list.get(list.size()-1);
//        }
//    }



        //USING LINKED LIST
        //        int data;
//        Node next;
//        public Node(int data){
//            this.data = data;
//            next = null;
//        }
//    }
//    static class stack{
//        public static Node head;
//        public static boolean isEmpty(){
//            return head == null;
//        }
//        public static void push(int data){
//            Node newNode = new Node(data);
//            if (head == null){
//                head = newNode;
//                return;
//            }
//            newNode.next = head;
//            head = newNode;
//
//        }
//        public static int pop(){
//            if (isEmpty()){
//                return -1;
//            }
//            int top = head.data;
//            head = head.next;
//            return top;
//        }
//        public static int peek(){
//            if (isEmpty()){
//                return -1;
//            }
//            return head.data;
//
//        }
//    }

//    public static void main(String[] args) {
//        Stack s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
////        s.push(5);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}
