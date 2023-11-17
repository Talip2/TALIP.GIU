import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simple_Calculator extends JFrame {
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel lblResult;
    private JLabel OneNum;
    private JLabel TwoNum;
    private JPanel panel1;
    private JLabel lblRes;


    public Simple_Calculator() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numInput = tfNumber1.getText();
                int n1 = Integer.parseInt(numInput);
                String numInput1 = tfNumber2.getText();
                int n2 = Integer.parseInt(numInput1);
                int op = cbOperations.getSelectedIndex();

                switch (op){
                    case 0:{
                        JOptionPane.showMessageDialog(null, "Please enter an operation!");
                    }
                    case 1:
                        lblRes.setText(String.valueOf(n1+n2));
                        break;
                    case 2:
                        lblRes.setText(String.valueOf(n1-n2));
                        break;
                    case 3:
                        lblRes.setText(String.valueOf(n1*n2));
                        break;
                    case 4:

                        if(n2 == 0){
                            JOptionPane.showMessageDialog(null, "You can't divide by 0");
                        }
                        lblRes.setText(String.valueOf(n1/n2));
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        Simple_Calculator app = new Simple_Calculator();
        app.setContentPane(app.panel1);
        app.setSize(700,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
