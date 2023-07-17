package PivotTry;
// Java program to construct binary tree from
// given array in level order fashion
 
public class Tree {
    Node root;
 
    // Tree Node
    static class Node {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
 
    // Function to insert nodes in level order
    public Node insertLevelOrder(int[] arr, int i)
    {
          Node root = null;
        // Base case for recursion
        if (i < arr.length) {
            root = new Node(arr[i]);
 
            // insert left child
            root.left = insertLevelOrder(arr, 2 * i + 1);
 
            // insert right child
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root;
    }
 
    // Function to print tree nodes in InOrder fashion
    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
 
    // Driver program to test above function
    public static void main(String args[])
    {
        Tree t2 = new Tree();
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        t2.root = t2.insertLevelOrder(arr, 0);
        t2.inOrder(t2.root);
    }
}