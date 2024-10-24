package Lab01.add_matrices.src;

import java.util.Scanner;

public class add_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrices: ");
        int row = sc.nextInt();
        int colum = sc.nextInt();
        int[][] m0 = new int[row][colum];
        int[][] m1 = new int[row][colum];
        int[][] result = new int[row][colum];
        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                m0[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                result[i][j] = m0[i][j] + m1[i][j];
            }
        }
        System.out.println("Result: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
