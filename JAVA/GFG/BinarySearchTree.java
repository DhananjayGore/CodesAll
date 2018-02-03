public class BinarySearchTree {


    class Node {
        int key;
        Node left, right;
 
        public Node(int value) {
            key = value;
            left = right = null;
        }
    }

    Node root;
 
    // Constructor
    BinarySearchTree() { 
        root = null; 
    }

    void insert(int key) {
       root = insertRec(root, key);
    }

    Node insertRec(Node x, int key) {
 
        /* If the tree is empty, return a new node */
        if (x == null) {
            x = new Node(key);
            return x;
        }
 
        /* Otherwise, recur down the tree */
        if (key < x.key)
            x.left = insertRec(x.left, key);
        else if (key > x.key)
            x.right = insertRec(x.right, key);
 
        /* return the (unchanged) node pointer */
        return x;
    }

    int height(){
        return recheight(root);
    }

    int recheight(Node x){
        if (x==null) {
            return 0;
        }
        else{
            int x1=recheight(x.left);
            int y1=recheight(x.right);
            if (x1>y1) {
                return (1+x1);
            }
            else {
                return (1+y1);
            }
        }
    }

    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

    void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

    Node deleteKey(Node x, int key)
    {
        /* Base Case: If the tree is empty */
        if (x == null)  return x;
 
        /* Otherwise, recur down the tree */
        if (key < x.key)
            x.left = deleteKey(x.left, key);
        else if (key > x.key)
            x.right = deleteKey(x.right, key);
 
        // if key is same as x's key, then This is the node
        // to be deleted
        else
        {
            // node with only one child or no child
            if (x.left == null)
                return x.right;
            else if (x.right == null)
                return x.left;
 
            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            x.key = minValue(x.right);
 
            // Delete the inorder successor
            x.right = deleteKey(x.right, x.key);
        }
 
        return x;
    }

    int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    void inorder(Node x) {
        if (x != null) {
            inorder(x.left);
            System.out.println(x.key);
            inorder(x.right);
        }
    }

     public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        // print inorder traversal of the BST
        tree.inorder(tree.root);
        System.out.println(tree.height());
    }
    
}