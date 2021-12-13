import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //lista enlazada --> LinkedList
        LinkedList<Integer> linkedList =new LinkedList();
        //SIMPLE? -->
        //DOBLE? <-->
        //<> Tipos de datos genericos
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        linkedList.add(700);
        System.out.println(linkedList);
        System.out.println( linkedList.get(4) );
        linkedList.remove(4);
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);

    }
}
