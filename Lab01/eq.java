package Lab01;

import javax.swing.JOptionPane;

public class eq {
    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog(null, "1. first degree\n" 
    + "2. system of first degree\n" 
    + "3. second degree",
    "Please choose the type of function", 
    JOptionPane.INFORMATION_MESSAGE);
    if (option.equals("1")) {
        String num1, num2;

        num1 = JOptionPane.showInputDialog(null, 
        "Please input the first coefficient: ", "Input the first coefficient",
        JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(num1);

        num2 = JOptionPane.showInputDialog(null, "Please input the second coefficient: ",
        "Input the second coefficient", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(num2);

        if (a>0) {
            double root = (-1*b)/a;
            JOptionPane.showMessageDialog(null, "Root: " + root, "Compute",
        JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            if (b==0) {
                JOptionPane.showMessageDialog(null, "Root: " + "There are infinitely many solutions", "Compute",
        JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "Root: " + "There is no feasible solution", "Compute",
        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } else if (option.equals("2")) {
        String num1, num2, num3, num4, num5, num6;
        num1 = JOptionPane.showInputDialog(null, 
        "Please input the first coefficient of first eq: ", "Input the first coefficient",
        JOptionPane.INFORMATION_MESSAGE);
        double a11 = Double.parseDouble(num1);

        num2 = JOptionPane.showInputDialog(null, "Please input the second coefficient: ",
        "Input the second coefficient of second eq", JOptionPane.INFORMATION_MESSAGE);
        double a12 = Double.parseDouble(num2);

        num5 = JOptionPane.showInputDialog(null, 
        "Please input the third coefficient of first eq: ", "Input the third coefficient",
        JOptionPane.INFORMATION_MESSAGE);
        double b1 = Double.parseDouble(num5);

        num3 = JOptionPane.showInputDialog(null, 
        "Please input the first coefficient of second eq: ", "Input the first coefficient",
        JOptionPane.INFORMATION_MESSAGE);
        double a21 = Double.parseDouble(num3);

        num4 = JOptionPane.showInputDialog(null, 
        "Please input the second coefficient of second eq: ", "Input the second coefficient",
        JOptionPane.INFORMATION_MESSAGE);
        double a22 = Double.parseDouble(num4);

        num6 = JOptionPane.showInputDialog(null, 
        "Please input the third coefficient of second eq: ", "Input the third coefficient",
        JOptionPane.INFORMATION_MESSAGE);
        double b2 = Double.parseDouble(num6);

        double d = a11*a22 - a21*a12;
        double d1 = b1*a22 - b2*a12;
        double d2 = a11*b2 - a21*b1;

        if (d==0) {
            if (a11*a22 == a12*a21 && a11*b2==b1*a21) {
                JOptionPane.showMessageDialog(null, "Root: " + "There are infinitely many solutions", "Compute",
        JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Root: " + "There are no feasible solution", "Compute",
        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            double x = d1/d;
            double y = d2/d;
            JOptionPane.showMessageDialog(null, "Root: " + "x=" + x + "y=" + y, "Compute",
        JOptionPane.INFORMATION_MESSAGE); 
        }
    } else{
        String num1, num2, num3;
        num1 = JOptionPane.showInputDialog(null, 
        "Please input the first coefficient of first eq: ", "Input the first coefficient",
        JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(num1);

        num2 = JOptionPane.showInputDialog(null, "Please input the second coefficient: ",
        "Input the second coefficient of second eq", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(num2);

        num3 = JOptionPane.showInputDialog(null, 
        "Please input the third coefficient of first eq: ", "Input the third coefficient",
        JOptionPane.INFORMATION_MESSAGE);
        double c = Double.parseDouble(num3);

        double d = b*b - 4*a*c;
        
        if (a!=0) {
            if (d>0) {
                double r1 = (-b + Math.sqrt(d)) / (2*a);
                double r2 = (-b - Math.sqrt(d)) / (2*a);
                JOptionPane.showMessageDialog(null, "First: " + r1 + "Second: " + r2, "Compute",
        JOptionPane.INFORMATION_MESSAGE);
            }
            else if (d==0) {
                double r = -b / (2*a);
                JOptionPane.showMessageDialog(null, "Root: " + r, "Compute",
        JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "There is no feasible solution", "Compute",
        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            if (b>0) {
                double root = (-1*c)/b;
                JOptionPane.showMessageDialog(null, "Root: " + root, "Compute",
            JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                if (c==0) {
                    JOptionPane.showMessageDialog(null, "Root: " + "There are infinitely many solutions", "Compute",
            JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "Root: " + "There is no feasible solution", "Compute",
            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }
    }
    
    
}
