package OtherProjects.lab01;
import javax.swing.JOptionPane;
public class MathOperations {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "";
        strNum1 = JOptionPane.showInputDialog(
            null,
            "Please input the first number: ", "Input the first number",
            JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        
        strNum2 = JOptionPane.showInputDialog(null,
        "Please input the second number: ", "Input the second number",
        JOptionPane.INFORMATION_MESSAGE
        );

        double num2 = Double.parseDouble(strNum2);

        if (num2 == 0) {
            strNotification = "sum: "+(num1 + num2) + ", difference: "+ (num1 - num2) + ", product: " + (num1 * num2) + ", Cannot divide by zero";
        }
        else {
            strNotification = "sum: "+(num1 + num2) + ", difference: "+ (num1 - num2) + ", product: " + (num1 * num2) + ", Quotient: " + (num1/num2);
        }

        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
