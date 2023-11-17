import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

public class LeapYearChecker extends JFrame{
    private JTextField tfYear;
    private JPanel panel1;
    private JButton btnCheckYear;


    public LeapYearChecker() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GregorianCalendar calendar = new GregorianCalendar();
                String numInput = tfYear.getText();
                int yr = Integer.parseInt(numInput);

                if (calendar.isLeapYear(yr)) {
                    JOptionPane.showMessageDialog(null, "The year " +yr + " is a Leap Year");
                }
                else{
                    JOptionPane.showMessageDialog(null, "The year " +yr + " is not a Leap Year");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.panel1);
        app.setSize(300,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);





    }
}


