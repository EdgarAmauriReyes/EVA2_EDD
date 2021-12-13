import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        System.out.println(arrayList);
        System.out.println(arrayList.get(4));
        arrayList.remove(4);
        System.out.println(arrayList);
        for (int i=0; i< arrayList.size(); i++){
            System.out.println("[" + arrayList.get(i) + "]");
        }

    }
}
