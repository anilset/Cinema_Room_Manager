import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrelsNumber = scanner.nextInt();
        int nutsNumber = scanner.nextInt(); // put your code here
        int result = nutsNumber / squirrelsNumber;
        System.out.println(result);
    }
}
