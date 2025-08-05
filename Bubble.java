import java.util.Arrays;
public class Bubble{
  public static void main(String args[]){
    boolean orden = false;
    int[] lista = {1,5,3,4,5,10,7,8,9,0};
    while (orden == false){
      orden = true;
      for(int i=0; i<=lista.length-2; i++){
        if(lista[i+1]<lista[i]){
          int aux = lista [i];
          lista[i] = lista[i+1];
          lista[i+1] = aux;
          orden = false;
        }
      
      }
    }
    System.out.println(Arrays.toString(lista));
  }
}


