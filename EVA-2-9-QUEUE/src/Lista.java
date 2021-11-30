public class Lista {
    private Nodo inicio;// ACCESO A I LISTA, PUNTO DE PARTIDA
    private Nodo fin;
    private int tama;



    public Lista(){
        inicio = null;// LISTA VACIA
        fin = null;
        tama= 0 ;
    }
    //AGREGAR NODOS
    public void add(int valor ){
        Nodo nuevo = new Nodo(valor);
        //HAY NODOS EN LA LISTA?
        if(inicio == null){// LISTA VACIA
            inicio = nuevo; // CONECTAMOS EL PRIMER NODO A LA LISTA
            fin = nuevo;
        }else {// LISTA CON NODOS
            //HAY QUE MOVERNOS AL FINAL DE LA LISTA
            //USAMOS TMP, NODO PARA NODO HATA LLEGAR AL FINAL
           /* Nodo temp = inicio; // aqui empezamos
            // WHILE
            while(temp.getSiguiente() != null){//MIENTRAS TEMP.SIGUIENTE != NULL  NOS VAMOS A MOVER
                temp = temp.getSiguiente(); // nover a temp al siguiente nodo
            }
            temp.setSiguiente(nuevo);// coenectamos al final de la lista al nuevo nodo*/
            // Agregar el nodo al final de la lista:
            fin.setSiguiente(nuevo);
            fin = nuevo; // Nos movemos al final de la lista
        }
        tama++;
    }
    //IMPRIMIR DATOS
    public void printList(){ // O(n)
        Nodo temp = inicio; // aqui empezamos
        // WHILE
        while(temp != null){//MIENTRAS TEMP != NULL  NOS VAMOS A MOVER
            System.out.print(temp.getDato() + " - ");
            temp = temp.getSiguiente(); // nover a temp al siguiente nodo
        }
        System.out.println("");
    }
    //BORRAR LA LISTA
    public void clear (){ //O(1)
        inicio=null;
        fin=null;
    }

    //CONTAR LOS NODOS:
    public int length(){ // Es N
        int iCont = 0;
        Nodo temp = inicio;
        while(temp != null){//MIENTRAS TEMP != NULL  NOS VAMOS A MOVER
            iCont++;
            temp = temp.getSiguiente(); // nover a temp al siguiente nodo
        }
        return iCont;
    }

    public boolean isEmpty(){
        if (inicio == null)
            return true;
        else
            return false;
    }

    public int get(int pos) throws Exception { // O(n)
        //VERIFICACION
        if(isEmpty()){  //LISTA ESTE VACIA
            throw new Exception("No hay  valores almacenados en la lista!!");
        }else{//POCICION QUE NO EXISTE: POSICION NEGATIVA O QUE NOS PASEMOS
            //pos tiene que estar entre cero y N-1 ---> es el tamaño
            if((pos < 0) || (pos >= length())) //si pos es menor a cero o s es mayor o igual a N
                throw new Exception("El valor " + pos + " no es una posicion valida en la lista!!");
        }
        Nodo temp = inicio;
        for(int i=0; i < pos; i++){
            //movernos
            temp= temp.getSiguiente();
        }
        return temp.getDato();
    }

    public void insertAtBeginnig(Nodo nuevo){
        nuevo.setSiguiente(inicio);
        inicio = nuevo;

    }
    public void insertAt(int pos, int valor){ // O(n)
        Nodo nuevo = new Nodo (valor);
        //VALIDAR
        //SITUACIONES:
        //INSERTAR AL INICIO
        if(pos == 0){   //insertar a el inico
            insertAtBeginnig(nuevo);
        }else{ //CUALQUIER OTRO CASO
            //MOVERNOS AL NODO PREVIO A LA POSICION
            Nodo temp = inicio;
            for(int i=0; i < (pos - 1); i++){
                //movernos
                temp= temp.getSiguiente();// movernos a temp al siguiente nodo
            }
            //FALTA RECONECTAR
            //primero conectasmo el nuevo nodo
            nuevo.setSiguiente(temp.getSiguiente());
            //Conectamos la lista al nuevo nodo
            temp.setSiguiente(nuevo);
        }
        tama++;
    }


    public void delateAt(int pos){ //O(N)
        int iTamList = length();
        //Validar
        if(iTamList == 1){
            clear();
        }else {
            if(pos == 0){  //BORRAR AL INIICO
                inicio = inicio.getSiguiente();
            }else { //CUALQUIER OTRO CASO
                //MOVERNOS AL NODO PREVIO A LA POSICION
                Nodo temp = inicio;
                for (int i = 0; i < (pos - 1); i++) {
                    //movernos
                    temp = temp.getSiguiente();// movernos a temp al siguiente nodo
                }
                //FALTA RECONECTAR

                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if (pos == (iTamList - 1))//Verificacion si es el ultimo nodo de la lista
                    fin = temp;
            }

        }
    }
}


// Es la operacion mas cotoso en una lista simple

