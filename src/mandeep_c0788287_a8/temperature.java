package mandeep_c0788287_a8;
import javax.swing.*;
import java.util.*;
public class temperature {
    static int  n = Integer.parseInt(JOptionPane.showInputDialog("Enter total number of days"));
    String[] days = new String[n];
    double[] temp = new double[n];
    double[] speed = new double[n];
    public static void main(String[] args) {
        temperature temperature = new temperature();
        for (int i = 0; i< temperature.n; i++) {
            String day = temperature.getDay();
            double temp = temperature.getTemperature(day);
            double speed = temperature.getWindSpeed(day);
            temperature.temp[i] = temp;
            temperature.days[i] = day;
            temperature.speed[i] = speed;
            System.out.println(day);
            System.out.println(temp);
            System.out.println(speed);
        }
        temperatureTest.temperatureTest(temperature.days,temperature.temp,temperature.speed);
        System.out.println(Arrays.toString(temperature.temp));
        System.out.println(Arrays.toString(temperature.speed));
        System.out.println(Arrays.toString(temperature.days));
    }
    public double getTemperature(String day){
        double temp = 0;
        temp = Double.parseDouble(JOptionPane.showInputDialog("Please enter the temperature of the " + day));
        return temp;
    }
    public String getDay(){
        String  day = "";
        day = JOptionPane.showInputDialog("Please enter the Day: ");
        return day;
    }
    public double getWindSpeed(String day){
        double speed = 0;
        speed = Double.parseDouble(JOptionPane.showInputDialog("Please enter the Wind Speed of the " + day));
        return speed;
    }
}


