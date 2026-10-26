import javax.swing.JOptionPane;

public class main2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name: ");
        int score1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your first score :"));
        int score2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your second score :"));
        int score3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your last score :"));

        int average = (score1 + score2 + score3) / 3;
        String results;

        if (average > 75 ) {
            results = "You passed";
        }
        else {
            results = "You failed";

            JOptionPane.showMessageDialog(null, "Name : " + name 
                + "\n" + "Average : " + average
                + "\n" + results);
        } 

    }
    
}
