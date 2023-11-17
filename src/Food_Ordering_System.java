import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food_Ordering_System extends JFrame{
    private JPanel panel1;
    private JLabel lblFoods;
    private JLabel lblDisc;
    private JCheckBox cPizza;
    private JButton btnOrder;
    private JRadioButton rbDef;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JLabel lblPizza;
    private JLabel lblBurger;
    private JLabel lblFries;
    private JLabel lblSoftDrinks;
    private JLabel lblTea;
    private JLabel lblSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public Food_Ordering_System() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox[] orders = {
                        cPizza, cBurger,cFries,cSoftDrinks,cTea,cSundae
                };

                JRadioButton[] discounts = {
                        rbDef,rb5,rb10,rb15
                };
                double total = 0;
                double [] arr ={
                        100.00, 80.00, 65.00, 55.00, 50.00, 40.00
                };

                double [] disc ={
                        1.0,0.95,0.90,0.85
                };
                for(int i = 0; i < orders.length; i++){
                    if(orders[i].isSelected()){
                        total += arr[i];
                    }
                }

                for(int i = 0; i < discounts.length; i++){
                    if(discounts[i].isSelected()){
                        total *= disc[i];
                    }
                }

                JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", total));
            }
        });
    }

    public static void main(String[] args) {
        Food_Ordering_System app = new Food_Ordering_System();
        app.setContentPane(app.panel1);
        app.setSize(500,600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}
