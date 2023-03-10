import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        boolean symmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                if (i > j && matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                }
            }
        }
        System.out.println(symmetric ? "YES" : "NO");
        }
    }
