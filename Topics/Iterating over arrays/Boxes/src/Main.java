import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int sidesNumber = 3;
        int [] firstBoxSides = new int[sidesNumber];
        int [] secondBoxSides = new int[sidesNumber];

        for (int i = 0; i < sidesNumber; i++) {
            firstBoxSides[i] = scanner.nextInt();

        }
        for (int i = 0; i < sidesNumber; i++) {
            secondBoxSides[i] = scanner.nextInt();

        } Arrays.sort(firstBoxSides);
        Arrays.sort(secondBoxSides);
         if (firstBoxSides[0] < secondBoxSides[0] && firstBoxSides[1] < secondBoxSides[1] &&
                 firstBoxSides[2] < secondBoxSides[2]) {
             System.out.println("Box 1 < Box 2");
         } else if (firstBoxSides[0] > secondBoxSides[0] && firstBoxSides[1] > secondBoxSides[1] &&
                 firstBoxSides[2] > secondBoxSides[2]) {
                 System.out.println("Box 1 > Box 2");
         } else {
             System.out.println("Incompatible");
         }
    }
}
