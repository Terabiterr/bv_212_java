package structures;

public class Tree {
    private TreeNode root;
    public Tree(int rootValue) {
        root  = new TreeNode(rootValue);
    }
    @TreeOperation(description = "In-order traversal of the binary tree.")
    public void PrintMinMax(TreeNode node) {
        if(node != null) {
            PrintMinMax(node.getLeft());
            System.out.println("Node value: " + node.getValue());
            PrintMinMax(node.getRight());
        }
    }
    @TreeOperation(description = "Pre-order traversal of the binary tree.")
    public void PrintMaxMin(TreeNode node) {
        if(node != null) {
            PrintMaxMin(node.getRight());
            System.out.println("Node value: " + node.getValue());
            PrintMaxMin(node.getLeft());
        }
    }
    public void insert(int value) {
        root.insert(value);
    }
    public TreeNode find(int value) {
        return root.find(value);
    }
}
