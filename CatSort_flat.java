import java.util.*;

public class CatSort_flat {
    public static void main(String[] args) {
        Object[] lista = { "mirror", "mirror", "plus", "intuitive", "PLus", "miRror", "*", "Intuitive", "Intuitive", " ", "PLUS" };
        Object[] categorias = {"intuitive", "mirror", "plus"};
        List<String> DefaultCatSortedList = catSort_flat(lista);
        System.out.println("ordenamiento por defecto: "+DefaultCatSortedList);
        List<String> CustomCatSortedList = catSort_flat(lista, categorias);
        System.out.println("ordenamiento personalizado: "+CustomCatSortedList);
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
        public static List<String> catSort_flat(Object[] lista, Object[] categorias) {
        List<String> normalizada = new ArrayList<>();
        List<Integer> frecuencias = new ArrayList<>();
        List<String> categoriasNormalizada = new ArrayList<>();
        for (Object cat : categorias) {
            categoriasNormalizada.add(cat.toString().trim().toUpperCase());
        }
        for(int i = 0; i < categorias.length; i++){
            frecuencias.add(0);
        }

        for (int i = 0; i < lista.length; i++) {
            if (categoriasNormalizada.contains(lista[i].toString().trim().toUpperCase())) {
                //esta parte se ejecuta si el elemento está en la lista de categorias
                int x = categoriasNormalizada.indexOf(lista[i].toString().trim().toUpperCase());
                frecuencias.set(x, frecuencias.get(x) + 1);
            } else if(categoriasNormalizada.contains("DEFAULT")){
                //esta parte se activa si el elemento no está en la lista de categorías pero ya esxiste la categoria default y entonces lo manda ahí
                int x = categoriasNormalizada.indexOf("DEFAULT");
                // categoriasNormalizada.add(lista[i].toString().trim().toUpperCase());
                frecuencias.set(x, frecuencias.get(x) + 1);
            } else {
                //esta parte se activa si el elemento no está en la lista de categorías y tampoco se había creado la categoria "DEFAULT"
                categoriasNormalizada.add("DEFAULT");
                // int x = categoriasNormalizada.indexOf("DEFAULT");
                //frecuencias.set(x, frecuencias.get(x) + 1);
                frecuencias.add(1);
            }

        }
        for (int i = 0; i <= frecuencias.size() - 1; i++) {
            for (int j = 0; j < frecuencias.get(i); j++) {
                normalizada.add(categoriasNormalizada.get(i));
            }
        }
        return normalizada;
    }

}

