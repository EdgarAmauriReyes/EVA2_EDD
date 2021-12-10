public class Main {
    public static void main(String[] args) {
        ArbolBinario arbolB = new ArbolBinario();
        arbolB.add(13);
        arbolB.add(10);
        arbolB.add(18);
        arbolB.add(2);
        arbolB.add(11);
        arbolB.add(17);
        arbolB.add(20);
        arbolB.add(16);
        //pre Order
        System.out.println("PRE ORDER: ");
        arbolB.printPreOrder();
        System.out.println("");
        System.out.println("IN ORDER: ");
        arbolB.printinOrder();
        System.out.println("");
        System.out.println("POST ORDER: ");
        arbolB.printPostOrder();
    }
}
