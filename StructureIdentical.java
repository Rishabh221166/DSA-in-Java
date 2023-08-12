class Solution{
    boolean strctureIdentical(Node node1, Node node2){
        if (node1 == null && node2 == null) return false;
        if(node1 == null || node2 == null) return false;
        return strctureIdentical(node1.right, node2.right) && strctureIdentical(node1.right, node2.right);
    }
}