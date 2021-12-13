public class Main implements Algo {
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.algo();
    }

    @Override
    public void a() {

    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public boolean c() {
        return false;
    }
}

abstract class Prueba {
    abstract public void algo();

    public void d();{

    }
}

interface Algo {
    public void a();
    public int b();
    public boolean c();
}