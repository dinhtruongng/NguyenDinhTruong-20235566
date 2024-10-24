package star.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many lines are there?");
        int n = keyboard.nextInt();
        keyboard.close();
        int a = 2*n-1;
        for(int i = 1; i<n+1; i++){
            int b = 2*i-1;
            int c = (a-b)/2;
            String space = " ".repeat(c);
            String ast = "*".repeat(b);
            System.out.println(space + ast + space);
        }

    }
}
