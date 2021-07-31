
public class SNodeSingly{
    SNode head;
    //Insertion of data 
    public void insert(int data){
        SNode n1=new SNode();
        n1.data=data;
        n1.next=null;
        if(head==null){        
            head=n1;
        }
        else{
            SNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n1;
        }
    }
    
    //Insert at specific index    
    public void insertAt(int data,int index){
    SNode n1=new SNode();
    n1.data=data;
    n1.next=null;
    SNode temp=head;
    if(index==0){
        n1.next=temp;
        head=n1;

    }
    else{
        int count=0;
        while(count!=index-1){
            temp=temp.next;
            count=count+1;
        }
        SNode linkadd=temp.next;
        temp.next=n1;
        n1.next=linkadd;

    }

    }
    //remove at specific index
    public void remove(int index){
        SNode temp=head;
        SNode PrevNode=head;
        if(index==0){
            temp=temp.next;
            head=temp;
            PrevNode.next=null;
        }
        else{
            int count=0;
            while(count<index){
                PrevNode=temp;
                temp=temp.next;
            }
        }
    }
    //Code for traversal
    public void show(){
        SNode temp=head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}