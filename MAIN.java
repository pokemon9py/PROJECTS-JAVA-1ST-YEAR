import javax.swing.JOptionPane;

public class MAIN {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age: "));
        float height = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter you height in cm:"));

        String result; 

        if (age >= 18 && height >= 167) {
            result = "You can ride";
        }
        else {
            result = "You cannot ride me";
        }

        JOptionPane.showMessageDialog(null, "Your age is: " + age +
            "\n" + "Your height is :" + height +
            "\n" + result);
    }
    
}
