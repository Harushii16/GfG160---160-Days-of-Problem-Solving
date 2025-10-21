/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/


class Solution {
    
    public Node getkthnode(Node head,int d){
        Node tem=head;
        while(tem!=null && d>0){
            d--;
            tem=tem.next;
        }
        return tem;
    }
    public Node rotate(Node head, int k) {
        // code here
        if(head==null || head.next==null) return head;
        Node temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        k=k%count;
        if(k==0) return head;
        // int d=count-k;
        Node prev=head;
        for(int i=1;i<k;i++){
            prev=prev.next;
        }
        
        Node newHead=prev.next;
        prev.next=null;
        temp.next=head;
        return newHead;
        
        
        
   
    }
}
