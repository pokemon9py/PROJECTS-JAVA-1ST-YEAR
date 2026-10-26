import javax.swing.JOptionPane;

public class kwh {
    public static void main(String[] args) {
        double units = Double.parseDouble(JOptionPane.showInputDialog("Electricity use (kWh):"));

        String message;

        if (units < 0) {
            message = "Invalid consumption";
        } else {
            double rate;
        if (units <= 100) rate = 8;
        else if (units <= 300) rate = 10;
        else rate = 12;
        
        double bill = units * rate + 75;

            message = String.format("Rate: PHP %.2f/kWh\nBill: PHP %.2f", rate, bill);

        }

        JOptionPane.showMessageDialog(null, message);

    }

}
