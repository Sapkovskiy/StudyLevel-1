package Task1;

/**
 * 1. Написать программу высчитывающую факториал числа. Рекурсия.
 */
public class RecursionExampl {
    public static void main(String[] args) {
        int factorial = factorial(15);
        System.out.println(factorial);
    }
    public static int factorial(int value){
        if (value==1){
            return 1;
        }
        return value * factorial(value-1);
    }
}
