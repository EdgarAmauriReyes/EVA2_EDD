public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(100);
        myQueue.add(200);
        myQueue.add(300);
        myQueue.add(400);
        myQueue.add(500);
        myQueue.printList();
        try {
            System.out.println("Primer elemento de la fila: " + myQueue.poll());
        } catch (Exception e) {
            e.printStackTrace();
        }
        myQueue.printList();
    }
}
