public class Nodo {
    private int dato;
    private Nodo derecha; // REFERENCIA
    private Nodo izquierda;

    // CONSTRUCTORES
    public Nodo (){
        this.derecha = null;
        this.izquierda = izquierda;
    }

    public Nodo(int dato) {
        this.dato = dato;
    }

    //get y set
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
}
