import javax.swing.JOptionPane;

public class SPEED {
    public static void main(String[] args) {
        int speed = Integer.parseInt (JOptionPane.showInputDialog(null, "Enter your speed :"));

        String result;

        if (speed > 60) {
            result = "You are speedind!";
        } else {
            result = " You are not speeding";

        }
        JOptionPane.showMessageDialog(null, "Your speed is :" + speed + "\n" + result);
    }
    
}
