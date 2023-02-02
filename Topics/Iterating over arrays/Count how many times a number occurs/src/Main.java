import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int [] numbers = new int[scanner.nextInt()];
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
            counter++;
        }

        }    System.out.println(counter);
    }
}

