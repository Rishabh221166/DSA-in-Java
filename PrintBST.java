
class Node
{
    int data;
    Node left, right;
 
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
 
class PrintBST{

    static void print(Node root){
        if(root == null) return;
        print(root.left);
        System.out.print(root.data+",");
        print(root.right);
    }
}
