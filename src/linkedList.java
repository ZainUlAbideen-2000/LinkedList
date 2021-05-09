public class linkedList{
    nodeClass head;

    public void insert(int data){
        nodeClass node = new nodeClass();
        node.data = data;
        node.next = null;
        
        if(head==null){
            head = node;
        }else{
            nodeClass n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void display(){
        nodeClass node = head;

        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void insertAtStart(int data){
        nodeClass node = new nodeClass();
        node.data = data;
        node.next = null;
        node.next = head;

        head = node;

    }

    public void insertAt(int data, int index){
        nodeClass node = new nodeClass();
        node.data = data;
        node.next = null;

        if(index==0){
            insertAtStart(data);
        }
        else{
            nodeClass n = head;
            for(int i=0;i<index-1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void delete(int index){
        if(index==0){
            head = head.next;
        }else{
            nodeClass n = head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            nodeClass n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }
}