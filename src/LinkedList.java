public class LinkedList {
    private Node head;

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head; //tao ban sao cho head
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addIndex(int data, int index){
        Node newNode = new Node(data);
        if (index < 0) {
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        } 
        else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }
    // BTVN: Viet code cho cac ham sau
    // 1. public int length()
    // 2. public void display()
    // 3. public void deleteFirst()
    public int length(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void deleteFirst(){
        Node newNode = new Node();
        if (isEmpty()) {
            head = newNode;
        }
        else{
            head = head.next;
        }
    }




    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("After addFirst:");
        linkedList.addFirst(7);
        linkedList.addFirst(8);
        linkedList.addFirst(9);
        linkedList.display();
        //9->8->7
        System.out.println("After addLast:");
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.display();
        //1->2->3
        System.out.println("After addIndex:");
        linkedList.addIndex(10, 4);
        linkedList.display();
        //1->2->3->10->9->8->7
        System.out.println("Length: " + linkedList.length());
        linkedList.deleteFirst();
        System.out.println("After deleteFirst: ");
        linkedList.display();
        //1->2->3->10->8->7
       
}

