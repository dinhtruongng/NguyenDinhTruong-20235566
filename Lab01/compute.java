package Lab01;
import javax.swing.JOptionPane;

public class compute {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, 
        "Please input the first number: ", "Input the first number",
        JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ",
        "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "Sum " + sum, "Compute",
        JOptionPane.INFORMATION_MESSAGE);
        double diff = Math.abs(num1 - num2);
        JOptionPane.showMessageDialog(null, "diff " + diff, "Compute",
        JOptionPane.INFORMATION_MESSAGE);
        double product = num1 * num2;
        JOptionPane.showMessageDialog(null, "product " + product, "Compute",
        JOptionPane.INFORMATION_MESSAGE);
        if (num2==0) {
            JOptionPane.showMessageDialog(null, "Cannot divide by 0", "Compute error", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            double quo = num1 / num2;
            JOptionPane.showMessageDialog(null, "Div " + quo, "Compute",
        JOptionPane.INFORMATION_MESSAGE);
        }
        

        System.exit(0);
    }
    

}
