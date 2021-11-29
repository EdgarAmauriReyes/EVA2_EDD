public class main {
    public static void main(String[] args) {
        //CREAR UUNA LISTA
        Lista miLista = new Lista(); // Creamos una lista
       /* int[] miAreglo = new int [1000000];
        for (int i = 0; i< miAreglo.length; i++){
            miAreglo[i]= (int)(Math.random()*1000);
        }
        for (int i = 0; i< 1000000; i++){
            miLista.add(new Nodo(1));
        }*/
        miLista.add(100);
        miLista.add(200);
        miLista.add((300));
        miLista.add((400));
        miLista.add((500));
        miLista.printList();
        System.out.println("Conteo: "+ miLista.length());
        System.out.println("Cantidad de nodos "  + miLista.length() );
        try {
            System.out.println("posicion  " + miLista.get(1));
        } catch (Exception e) {
            e.printStackTrace();// IMPRIME EL ERROOR
        }
        // EL TRY-CATCH EVISTA QUE EL PROGRAMA SE DETIENE
        //SEGUIR CON EL PROGRAMA
        System.out.println("EL PROGRAMA CONTINUA ");
        System.out.println(" \n Despues de insertar ");
        miLista.insertAt(4, (999) );
        miLista.printList();
        System.out.println("\n Despues de borrar");
        miLista.delateAt(4);
        miLista.printList();

        for (int i = miLista.length()-1; i>=0; i--){
            try{
                System.out.println(miLista.get(i) + " - ");
            }catch (){
                System.out.println();
            }
        }

    }

}
