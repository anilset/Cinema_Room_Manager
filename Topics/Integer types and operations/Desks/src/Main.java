import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] groups = new int[3];
        int deskCount = 0;
        for (int i = 0; i < groups.length; i++) {
            groups[i] = scanner.nextInt();
            deskCount = deskCount + (groups[i] / 2 + groups[i] % 2);
        } System.out.println(deskCount);
    }
}
