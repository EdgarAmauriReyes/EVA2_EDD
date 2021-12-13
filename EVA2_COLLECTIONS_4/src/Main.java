import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //CONJUNTO: MATEMATICAS DISCRETAS --> NO TIENE ELEMENTOS REPETIDOS
        Set<Integer> conjuntos = new LinkedHashSet<>();
        conjuntos.add(100);
        conjuntos.add(200);
        conjuntos.add(300);
        conjuntos.add(400);
        conjuntos.add(100);
        conjuntos.add(200);
        conjuntos.add(300);
        System.out.println(conjuntos);
    }
}
