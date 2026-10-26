import javax.swing.JOptionPane;

public class first {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer:"));

        String result;

        if (number > 0) {
            result = "The number is positive.";
        }
        else if (number < 0) {
            result = "The number is negative.";
        }
        else { 
            result = "The number is zero.";
        }
        
        JOptionPane.showMessageDialog(null, "Number : " + number + "\n" + result);
        

    }
    
}