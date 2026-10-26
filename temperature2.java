import javax.swing.JOptionPane;

public class temperature2 {
    public static void main(String[] args) {
    double t = Double.parseDouble(JOptionPane.showInputDialog(null, "Temperature (C):"));

    String message;

    if (t < 18) {
        message = "Cold";
    }
    else if (t <28) {
        message = "Comfortable";
    }
    else if (t < 37) {
        message = "Warm";
    }
    else {
        message = "Heat Warning!";
    }

    JOptionPane.showMessageDialog(null, "Temperature : " + t + 
        "\n" + "Advisory : " + message);
    }
}