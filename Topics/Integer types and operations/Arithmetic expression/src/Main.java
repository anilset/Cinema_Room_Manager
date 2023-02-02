import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // put your code here
        int[] iter = new int[n];
        int result = 0;
        for (int number : iter) {
            result += (n + 1) * n + 2;
        } System.out.println(result + 3);
    }
}
