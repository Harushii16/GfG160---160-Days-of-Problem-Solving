/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null)return result;
        if(!isleaf(root))result.add(root.data);
        addleftboundary(root,result);
        addleaves(root,result);
        addrightboundary(root,result);
        return result;
    }
    
    
    
    
    
    
    boolean isleaf(Node root){
        return(root.left==null && root.right==null);
    }
    
    
    
    
    
    void addleftboundary(Node root,ArrayList<Integer> result){
        Node curr=root.left;
        while(curr!=null){
            if(!isleaf(curr))result.add(curr.data);
            if(curr.left!=null)curr=curr.left;
            else curr=curr.right;
        }
    }
    
    
    
    
    
    void addleaves(Node root,ArrayList<Integer> result){
        if(isleaf(root)){
            result.add(root.data);
            return;
        }
        if(root.left!=null)addleaves(root.left,result);
        if(root.right!=null)addleaves(root.right,result);
    }
    
    
    
    
    
    void addrightboundary(Node root,ArrayList<Integer> result){
        Node curr=root.right;
        ArrayList<Integer> temp=new ArrayList<>();
        while(curr!=null){
            if(!isleaf(curr))temp.add(curr.data);
            if(curr.right!=null)curr=curr.right;
            else curr=curr.left;
        }
        for(int i=temp.size()-1;i>=0;i--){
            result.add(temp.get(i));
        }
    }
    
    
    
    
}
