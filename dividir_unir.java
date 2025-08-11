// archivo: dividir_unir.java
// autor: María Marta Torres
// descripción: ordenamiento merge clásico, versión mm

import java.util.ArrayList;
import java.util.List;

public class Dividir_unir {
    public static void main(String[] args) {
        int[] listaArray = {1, 5, 3, 4, 5, 10, 7, 8, 9, 0, 10, 34, 45, 67};
        // Convertir array a lista para trabajar mejor
        List<Integer> lista = new ArrayList<>();
        for (int num : listaArray) {
            lista.add(num);
        }
        List<Integer> MergedLista = dividir_unir(lista);
        System.out.println("Lista ordenada: " + MergedLista);
    }  
    public static List<Integer> unir(List<Integer> lista1, List<Integer> lista2){
        List<Integer> unida = new ArrayList<>();

        int cont1 = 0, cont2 = 0;


        while (lista1.size() >=1 && lista2.size() >=1 && cont1<lista1.size() && cont2 < lista2.size()){
            if((lista1.get(cont1))<lista2.get(cont2)){
                unida.add(lista1.get(cont1));
                cont1++;
            }else{
                unida.add(lista2.get(cont2));
                cont2++;
            }
        }
        if(cont1 == lista1.size() && cont2 < lista2.size()){
            unida.addAll(lista2.subList(cont2, lista2.size()));
        }else{
            unida.addAll(lista1.subList(cont1, lista1.size()));
        }
        return unida;
    }  
    public static List<Integer> dividir_unir(List<Integer> lista){

        if (lista.size()<=1){
            return lista;
        }else{
            int pos_centro = (int) lista.size()/2;
            List<Integer> IZQ = dividir_unir(new ArrayList<>(lista.subList(0, pos_centro)));  
            List<Integer> DER = dividir_unir(new ArrayList<>(lista.subList(pos_centro, lista.size())));
            return unir(IZQ, DER);
        }
    }
}
    



// def dividir_unir(lista):
//     if len(lista) <= 1:
//         return lista
//     else:
//         pos_centro = int(len(lista)/2)
//         IZQ = dividir_unir(lista[:pos_centro])
//         DER = dividir_unir(lista[pos_centro:])
//         return unir(IZQ, DER)
// def unir(lista1,lista2):
//     unida = []
//     cont1 = 0
//     cont2 = 0
//     while len(lista1)>=1 and len(lista2)>=1 and cont1<len(lista1) and cont2<len(lista2):
//         if lista1[cont1]<=lista2[cont2]:
//             unida.append(lista1[cont1])
//             cont1+=1
//         else:
//             unida.append(lista2[cont2])
//             cont2+=1
//     if cont1==len(lista1) and cont2<len(lista2):
//         unida=unida+lista2[cont2:]
//     else:
//         unida=unida+lista1[cont1:]
//     return unida
