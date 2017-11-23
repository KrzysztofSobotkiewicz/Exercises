package zad3;

/**
 * Created by Suchoklates on 22.11.2017.
 */
public class tableAdder {


    public static void main(String[] args) {
        int[] array1= {1,1 ,1};
        int[] array2= {2,2 ,2};

        int arrayAdder= 0;
        for( int index : array1){
            arrayAdder += index;
        }
        for( int index : array2){
            arrayAdder += index;
        }
        System.out.println("Suma tablic to: " + arrayAdder);
    }
}
