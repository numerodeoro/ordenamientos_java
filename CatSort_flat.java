import java.util.*;

public class CatSort_flat {
    public static void main(String[] args) {
        Object[] lista = { 2, "hola", 2, "A", 1, 1, "*", "HOla", "a" };
        List<String> catSortedList = catSort_flat(lista);
        System.out.println(catSortedList);
    }

    public static List<String> catSort_flat(Object[] lista) {
        List<String> normalizada = new ArrayList<>();
        List<String> categorias = new ArrayList<>();
        List<Integer> frecuencias = new ArrayList<>();

        for (int i = 0; i <= lista.length - 1; i++) {
            if (categorias.contains(lista[i].toString().trim().toUpperCase())) {
                int x = categorias.indexOf(lista[i].toString().trim().toUpperCase());
                frecuencias.set(x, frecuencias.get(x) + 1);
            } else {
                categorias.add(lista[i].toString().trim().toUpperCase());
                frecuencias.add(1);
            }
        }
        for (int i = 0; i <= frecuencias.size() - 1; i++) {
            for (int j = 0; j < frecuencias.get(i); j++) {
                normalizada.add(categorias.get(i));
            }
        }
        return normalizada;
    }

}
