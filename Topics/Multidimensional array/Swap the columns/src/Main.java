import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int indI = sc.nextInt();
        int indJ = sc.nextInt();

        swapColumns(array, indI, indJ);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }   System.out.println();
        }
        //Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);

        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    int temp = array[i][indI];
                    array[i][indI] = array[i][indJ];
                    array[i][indJ] = temp;
                System.out.print(array[i][j] + " ");
            }   System.out.println();
        }*/
    }
    public static void swapColumns(int[][] arr, int column1, int column2) {
        Arrays.stream(arr).forEach(row -> {
            int temp = row[column2];
            row[column2] = row[column1];
            row[column1] = temp;
        });
    }

    }