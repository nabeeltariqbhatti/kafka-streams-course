// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    //(7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
    static Node addTwoLists(Node first, Node second){
        StringBuilder firstNumber = new StringBuilder();
        StringBuilder secondNumber = new StringBuilder();
        
        Node head=first;
        Node head2=second;
        

        while(head!=null){
            
            firstNumber.append(String.valueOf(head.data));
            head=head.next;
        }
          while(head2!=null){
            
            secondNumber.append(String.valueOf(head2.data));
            head2=head2.next;
        }
        firstNumber.reverse();
        secondNumber.reverse();
     
        
        int sum = Integer.parseInt(firstNumber.toString()) +  Integer.parseInt(secondNumber.toString());
    
        
        Node reverser = null;
        Node rT=reverser;
        
        while(sum>0){
            int n = sum%10;
            sum = sum/10;
            if(reverser==null){
                reverser = new Node(n);
                rT= reverser;
            }else{
                rT.next= new Node(n);
                rT= rT.next;
                
            }
        }
        return reverser;
        
    }
}
