public class main {
    public static void main(String[] args) {
    MyStack myStack = new MyStack();
    myStack.add(100);
    myStack.add(200);
    myStack.add(300);
    myStack.add(400);
    myStack.add(500);
    myStack.printList();
        try {
            System.out.println("Ultimo elemento de la pila: " + myStack.poll());
        } catch (Exception e) {
            e.printStackTrace();
        }
    myStack.printList();
    }
}
