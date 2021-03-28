package mandeep_c0788287_a8;
import javax.swing.*;
public class temperatureTest {
    public static void temperatureTest(String[] days, double[] temp, double[] speed){
        for (int i = 0; i < days.length; i++){
            double tempFeel = temp[i] - (temp[i] * speed[i])/100;
            JOptionPane.showMessageDialog(null, "The temperature feels like on " + days[i] + " is " + String.format("%.2f", tempFeel));
        }
    }
}


