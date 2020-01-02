package chp7;

// A binary tree where for all node the left child value is less than the parent, and right child value is greater than parent

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree(){
        super();
    }

    public TreeNode getRoot() {
        return root;
    }

    public void insert(Integer data){
        if (this.root == null){
            this.root = new TreeNode(data);
        }
        else {
            this.root.insert(data);
        }
    }

    public TreeNode find(Integer data){
        if(this.root != null){
            return this.root.find(data);
        }
        return null;
    }

    public void delete(Integer data){
        TreeNode parentNode = this.root;
        TreeNode currentNode = this.root;
        boolean isLeftNode = false;
        // Check to see if the tree is empty


        // Iterate through tree, keeping reference to parent node until at a leaf node
        while(currentNode != null && currentNode.getData() != data) {
            parentNode = currentNode;
            // If data is > current, set current it's right child
            if (data < currentNode.getData()) {
                currentNode = currentNode.getLeftNode();
                isLeftNode = true;
            } else{
                currentNode = currentNode.getRightNode();
                isLeftNode = false;
            }
        }

        if (currentNode == null){
            return;
        }

        if(currentNode.getRightNode() == null && currentNode.getLeftNode() == null){
            if (currentNode == root){
                root = null;
            }
            if(isLeftNode){
                parentNode.setLeftNode(null);
            }
            else{
                parentNode.setRightNode(null);
            }
        }
    }
}
