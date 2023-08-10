/*Denzel Chike
 *10/20/2020
 *JDK 1.8
 *Rating tips using conditionals 
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class TipRater {

    public static void main(String[] args) {
        String input= JOptionPane.showInputDialog(null, "What was the total bill?");
        double totalBill = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null,"How much tip did you leave?");
        double tipAmount = Double.parseDouble(input);
        double tip = tipAmount/totalBill;
        DecimalFormat df = new DecimalFormat ("##.##%");
        String message = null;
      
         if (tip < 0 || tip > 1) {
            message = "Invalid tip percentage";
        }else if (tip >= 0 && tip <= 0.05) {
            message = "Your tip rank is D";
        }else if (tip > 0.5 && tip <= 0.1) {
            message = "Your tip rank is C";
        }else if ( tip > 0.1 && tip <= 0.2) {
            message = "Your tip rank is B";
        }else if (tip > 0.2 && tip <= 0.3) {
            message = "Your tip rank is A";
        }else if (tip > 0.3) {
            message = "Your tip rank is A+";
        }
    JOptionPane.showMessageDialog(null, "You left a " + String.format("%.1f", (tip * 100))+"% tip.\n"+ message);
    }
    
}
