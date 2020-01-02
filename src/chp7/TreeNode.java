package chp7;

public class TreeNode{
    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }
    // Don't provide setter data, keep data immutable when node is set

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    
}