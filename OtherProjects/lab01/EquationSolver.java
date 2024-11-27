package OtherProjects.lab01;
import javax.swing.JOptionPane;  

public class EquationSolver {

    public static void main(String[] args) {

        String[] options = {"First-degree equation (ax + b = 0)", 
                            "System of two first-degree equations", 
                            "Second-degree equation (ax^2 + bx + c = 0)"};
        
        int choice = JOptionPane.showOptionDialog(null, 
                "Choose which type of equation to solve:", 
                "Equation Solver", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, options, options[0]);

        switch (choice) {
            case 0:
                solveFirstDegreeEquation();  
                break;
            case 1:
                solveSystemOfEquations();  
                break;
            case 2:
                solveSecondDegreeEquation(); 
                break;
            default:
                JOptionPane.showMessageDialog(null, "No valid option chosen.");
        }
    }

    public static void solveFirstDegreeEquation() {
        String aInput = JOptionPane.showInputDialog("Enter the coefficient 'a' (should not be 0):");
        String bInput = JOptionPane.showInputDialog("Enter the constant 'b':");
        double a = Double.parseDouble(aInput);
        double b = Double.parseDouble(bInput);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "This is not a valid linear equation because 'a' cannot be 0.");
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is: x = " + x);
        }
    }

    public static void solveSystemOfEquations() {
        // Input coefficients for both equations
        String a11Input = JOptionPane.showInputDialog("Enter a11 (coefficient of x1 in the first equation):");
        String a12Input = JOptionPane.showInputDialog("Enter a12 (coefficient of x2 in the first equation):");
        String b1Input = JOptionPane.showInputDialog("Enter b1 (constant term in the first equation):");

        String a21Input = JOptionPane.showInputDialog("Enter a21 (coefficient of x1 in the second equation):");
        String a22Input = JOptionPane.showInputDialog("Enter a22 (coefficient of x2 in the second equation):");
        String b2Input = JOptionPane.showInputDialog("Enter b2 (constant term in the second equation):");

        double a11 = Double.parseDouble(a11Input);
        double a12 = Double.parseDouble(a12Input);
        double b1 = Double.parseDouble(b1Input);
        double a21 = Double.parseDouble(a21Input);
        double a22 = Double.parseDouble(a22Input);
        double b2 = Double.parseDouble(b2Input);

        double determinant = a11 * a22 - a12 * a21;

        double det1 = b1 * a22 - b2 * a12;
        double det2 = a11 * b2 - a21 * b1;

        // Check for the type of solution based on the determinant values
        if (determinant == 0) {
            if (det1 == 0 && det2 == 0) {
                // If both det1 and det2 are also 0, there are infinitely many solutions
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                // If det1 and det2 are not zero, there is no solution
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            // If the determinant is non-zero, we have a unique solution
            double x1 = (b1 * a22 - b2 * a12) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;
            JOptionPane.showMessageDialog(null, "The solutions are: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Method to solve a second-degree equation (ax^2 + bx + c = 0)
    public static void solveSecondDegreeEquation() {
        // Input coefficients using dialog boxes
        String aInput = JOptionPane.showInputDialog("Enter the coefficient 'a' (should not be 0):");
        String bInput = JOptionPane.showInputDialog("Enter the coefficient 'b':");
        String cInput = JOptionPane.showInputDialog("Enter the constant 'c':");
        double a = Double.parseDouble(aInput);
        double b = Double.parseDouble(bInput);
        double c = Double.parseDouble(cInput);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "This is not a valid quadratic equation because 'a' cannot be 0.");
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                // Two real and distinct solutions
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has two distinct real solutions: x1 = " + x1 + ", x2 = " + x2);
            } else if (discriminant == 0) {
                // One real solution (double root)
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has one double root: x = " + x);
            } else {
                // No real solution
                JOptionPane.showMessageDialog(null, "The equation has no real solution.");
            }
        }
    }
}

