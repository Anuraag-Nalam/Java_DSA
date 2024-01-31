package anuraag;

import java.util.Scanner;

//Implementation of tree using pointers (Objects and references)-?Using Linked representation
//2) using array->sequential implementation is used for complete binary trees -> Heaps
public class Tree {

    private static class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }

    private static Node root;

    public static void populate(Scanner s) {
        System.out.println("Enter the root node ");
        int rootVal = s.nextInt();
        root = new Node(rootVal);
        populate(s, root);
    }

    public static void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the value to the left of " + node.value);
            int valueLeft = scanner.nextInt();
            node.left = new Node(valueLeft);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("enter the value to the right of " + node.value);
            int valueRight = scanner.nextInt();
            node.right = new Node(valueRight);
            populate(scanner, node.right);
        }
    }

    public static void display() {
        display(root, "");
    }

    private static void display(Node node, String indent) {
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
        //new commit
    }
public void prettyDisplay(){
        
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Tree tree=new Tree();
        tree.populate(s);
        tree.display();
    }
}
