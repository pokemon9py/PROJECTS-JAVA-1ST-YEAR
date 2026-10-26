import javax.swing.JOptionPane;

public class temp {
    public static void main(String[] args) {
        float temperature = Float.parseFloat( JOptionPane.showInputDialog(null, "Enter the temperature in Celsius :"));

        String result;

        if (temperature > 30) {
            result = "Its too hot outside";
        }
        else if (temperature < 15) {
            result = "Its cold outside";
        }
        else { 
            result = "The weather is pleasant.";
        }

        JOptionPane.showMessageDialog(null, "The temperature is:" + temperature + "\n" + result);
    }
    
}
