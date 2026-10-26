import javax.swing.JOptionPane;

public class second {
    public static void main(String[] args) {
        double quiz1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Quiz 1 score: "));
      
        double quiz2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Quiz 2 score: "));

        double quiz3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Quiz 3 score: "));

        double average = (quiz1 + quiz2 +quiz3) / 3;
        String result; 

        if (average >= 75) {
            result = "Passed";
        }
        else {
            result = "Failed";
        }

        JOptionPane.showMessageDialog(null, "Average: " + average + "\n" + "Result" + result);
    }

    
}
