package bst;
import java.util.Arrays;
// Class for Binary Search Tree
class BST{
    Node node;
    BST(int value){
        node = new Node(value);
    }
    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        // Move to left for value less than parent node
        if(value < node.value){
            node.left = insert(node.left, value);
        }
        // Move to right for value greater than parent node
        else if(value > node.value){
            node.right = insert(node.right, value);
        }
        return node;
    }

    // For traversing in order
    public void Treesort(Node node){
        if(node != null){
            // recursively traverse left subtree
            Treesort(node.left);
            System.out.print(node.value + " ");
            // recursively traverse right subtree
            Treesort(node.right);
        }
    }
}