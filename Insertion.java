// archivo: Insertion.java
// autor: María Marta Torres
// descripción: ordenamiento insertion clásico

import java.util.ArrayList;
import java.util.List;
public class Insertion {
    public static void main(String[] args) {
        int[] lista = {1,5,3,4,5,10,7,8,9,0};
        List<Integer> InsertionSortedList = insertion(lista);
        System.out.println("Lista ordenada: " + InsertionSortedList);
    }
    public static List<Integer> insertion(int[] lista){
        List<Integer> ordenada = new ArrayList<>();
        for (int num : lista) {
            ordenada.add(num);
        }

        for(int i = 1; i< lista.length; i++){
            int aux = ordenada.get(i);
            int j = i-1;
            while(j >= 0 && ordenada.get(j)>aux){
                ordenada.set(j+1, ordenada.get(j));
                j = j-1;
            }
            ordenada.set(j+1, aux);
        }
    return ordenada;

    }
}

