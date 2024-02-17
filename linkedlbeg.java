public class linkedlbeg {
    Node head,tail;

    public linkedlbeg(){
        head = tail = null;
    }
    public class  Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void  create(int s){
        Node n = new Node(s);
        if(head == null){
            tail = head = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
    }
    public void printlist(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while(head!=null){
            System.out.println(head.data);
            head = head.next;
          }
        }
    }
    public void addbeg(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        else{
            n.next = head;
            head = n;
        }
    }
    public static void main(String args[]){
        linkedlbeg list = new linkedlbeg();
        list.create(1);
        list.create(2);
        list.create(3);
        list.printlist(list.head);
        list.addbeg(9);
        list.printlist(list.head);
    }
}