package structures;

public class TreeNode {
    @TreeInfo(info = "This is the left child node.")
    private TreeNode left;
    @TreeInfo(info = "This is the right child node.")
    private TreeNode right;
    private int value;

    public TreeNode(int value) {
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }
    @TreeOperation(description = "Finds a node in binary tree.")
    public TreeNode find(int value) {
        if(this.value == value) {
            return this;
        } else if(value < this.value && left != null) {
            return left.find(value);
        } else if(value > this.value && right != null) {
            return right.find(value);
        }
        return null;
    }
    @TreeOperation(description = "Inserts a new node in the binary tree.")
    public void insert(int newValue) {
        if(value == newValue) {
            System.out.println("Error a new value.");
            return;
        }
        if(newValue < this.value) {
            if(left == null) {
                left = new TreeNode(newValue);
            } else {
                left.insert(newValue);
            }
        } else {
            if(right == null) {
                right = new TreeNode(newValue);
            } else {
                right.insert(newValue);
            }
        }
    }
}
