import structures.Tree;
import structures.TreeInfo;
import structures.TreeNode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Tree tree = new Tree(10);
        tree.insert(8);
        tree.insert(4);
        tree.insert(7);
        tree.insert(11);
        tree.insert(15);
        tree.insert(5);
        tree.insert(17);
        tree.insert(9);
        tree.insert(1);
        tree.insert(12);

        //tree.PrintMinMax(tree.find(10));
        //tree.PrintMaxMin(tree.find(10));

        TreeNode node = tree.find(10);
        if(node != null) {
            TreeInfo leftInfo = node
                    .getLeft()
                    .getClass()
                    .getDeclaredField("left")
                    .getAnnotation(TreeInfo.class);
            System.out.println(leftInfo.info());
        }
    }
}