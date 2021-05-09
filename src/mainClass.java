public class mainClass{
    public static void main(String[] args) {

        linkedList obj = new linkedList();
        obj.insert(5);
        obj.insert(2);
        obj.insert(4);
        obj.insert(6);
        obj.insertAtStart(1);
        obj.insertAt(3,2);

        obj.delete(2);
        obj.display();

    }
}