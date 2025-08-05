import java.util.Arrays;
public class Selection {
    public static void main(String[] args) {
        int[] lista = {1,5,3,4,5,10,7,8,9,0};
        for(int i = 0; i < lista.length; i++){
            int pos_min = i;
            for(int j = i+1; j < lista.length; j++){
                if(lista[j] < lista[pos_min]){
                    pos_min = j;
                }
            }
            int aux = lista [i];
            lista[i]=lista[pos_min];
            lista[pos_min]= aux;

        }
        System.out.println(Arrays.toString(lista));
        
    }
    
}
