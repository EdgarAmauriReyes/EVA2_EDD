public class ArbolBinario {
    private Nodo root;

    public ArbolBinario(){
        this.root = null; //Arbol vacio
    }

    // A PARTIR DE AQUI TODO ES RECURSIVO
    // AGREGAR UN NODO
    public void add(int valor){
        Nodo nuevo = new Nodo(valor);
        //Verificamos si hay nodods en el arbol
        if (root == null){ //Arbol vacio
            root = nuevo;
        }else {//HAY NODOS
            //Metodo resursivo para agregar nodos
            addRecu(root, nuevo);
        }
    }
    //metodod recursivo (nodo actual, nodo nuevo)
    private void addRecu (Nodo actual, Nodo nuevo){
        //VERIFICAR A QUE LADO VA EL NODO (SI ES MAYOR O ES MENOR), NO PUEDE HABER VALORES REPETIDOS
        if(nuevo.getDato() < actual.getDato() ){//IZQ
            if(actual.getIzquierda() == null){//Tenemso espacio, aqui insertamos
                actual.setIzquierda(nuevo);
            }else{//Llamr de nuevo al metodo recursivo, paro movernos a la izq
                addRecu(actual.getIzquierda(),nuevo);
            }
        }else if(nuevo.getDato() > actual.getDato()){//Derecha
            if(actual.getDerecha() == null){//Tenemso espacio, aqui insertamos
                actual.setDerecha(nuevo);
            }else{//Llamr de nuevo al metodo recursivo, paro movernos a la izq
                addRecu(actual.getDerecha(),nuevo);
            }
        }else {//Valor igual al actual
            System.out.println("El valor ya existe en el arbol");
        }

    }

    //IMPRIMIR NODOS DEL ARBOL
    public void printPreOrder(){
        preOrder(root);//llama al metodo recursivo pre order
    }

    private void preOrder(Nodo actual){
        if(actual != null){
            System.out.print("[" + actual.getDato() + "]");//Visit node
            preOrder(actual.getIzquierda()); //travers left subtree
            preOrder(actual.getDerecha());//travers right subtree
        }
    }
    //Post order
    public void printPostOrder(){
        postOrder(root);//llama al metodo recursivo pre order
    }

    private void postOrder(Nodo actual){
        if(actual != null){
            postOrder(actual.getIzquierda()); //travers left subtree
            postOrder(actual.getDerecha());//travers right subtree
            System.out.print("[" + actual.getDato() + "]");//Visit node
        }
    }

    //In order
    public void printinOrder(){
        inOrder(root);//llama al metodo recursivo pre order
    }

    private void inOrder(Nodo actual){
        if(actual != null){
            inOrder(actual.getIzquierda()); //travers left subtree
            System.out.print("[" + actual.getDato() + "]");//Visit node
            inOrder(actual.getDerecha());//travers right subtre
        }
    }


}
