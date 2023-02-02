import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt(); // put your code here
        int numberOfTens = userInput / 10;
        System.out.println(numberOfTens);
    }
}
