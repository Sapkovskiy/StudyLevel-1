package lesson7;

/**
 *
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] values={1,2,3,4,5};
        values[3]=10;
  //      System.out.println(values[3]);
        int[] values2=new int[11];
        for (int i = 0; i < values2.length; i++) {
            System.out.println(i+" "+values2[i]);

        }
    }
}
