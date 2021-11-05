package bst;
import java.util.Arrays;

public class Treesort {
    public static void main(String[] args) {
        int[] arr = {65, 68, 82, 42, 10, 75, 25, 47, 32, 72};
        System.out.println("Original array- " + Arrays.toString(arr));
        // start creating tree with element at index 0 as root node
        BST bst = new BST(arr[0]);
        for(int num : arr){
            bst.insert(bst.node, num);
        }
        System.out.print("Sorted Array after Tree sort- ");
        bst.Treesort(bst.node);
        System.out.println();
    }
}