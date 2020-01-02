package chp7;

public class TreeNode{
    private Integer data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(Integer data){

        this.data = data;
    }

    public TreeNode find(Integer data){
        //Recursive search for data
        if (this.data == data) {
            return this;
        }
        // Avoid null pointer exception if left child is null
        else if (this.data > data && this.leftNode != null) {
            return this.leftNode.find(data);
        }
        // Data is greater than current node date and right node is not null
        else if (this.rightNode != null) {
            return  this.rightNode.find(data);
        }
        else{
            return null;
        }

    }
    //Insert data, maintaining the Binary search condition
    public void insert(Integer data){
        //Recursively call insert() to insert data into appropriate child
        if (this.data > data){
            if(this.rightNode == null){
                this.rightNode = new TreeNode(data);
            }
            else{
                this.rightNode.insert(data);
            }
        }
        else{
            if(this.leftNode == null){
                this.leftNode = new TreeNode(data);
            }
            else{
                this.leftNode.insert(data);
            }
        }
    }
    public Integer getData() {
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