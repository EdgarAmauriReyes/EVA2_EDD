public class Main {
    public static void main(String[] args) {
        Prueba <Integer> prueba = new Prueba();
        prueba.setValor(100);
        System.out.println(prueba);

    }
}


class Prueba <T>{
    private T valor;

    public Prueba(T valor) {
        this.valor = valor;
    }

    public Prueba (){

    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}