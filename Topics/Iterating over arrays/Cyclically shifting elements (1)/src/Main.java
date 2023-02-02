import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();// put your code here
        int[] numbers = new int[len];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
        int temp = numbers[numbers.length-1];
        numbers[numbers.length-1] = numbers[i];
        numbers[i] = temp;
            System.out.print(numbers[i] + " ");
        /*if (i == numbers.length-1) {
            temp = numbers[numbers.length-1];
            numbers[numbers.length-1] = numbers[0];
            numbers[0] = temp;
        }*/
        }   //System.out.println(Arrays.toString(numbers));
    }
}