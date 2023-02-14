package electricitybillingsystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


//package electricitybillingsystem;



import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;



//package electricitybillingsystem;


/**
 *
 * @author sunet
 */
public class ElectricityBillingSystem  {
    private JFrame frame;
    private JPanel panel;
    private JLabel label1,label2,label3,label4 = new JLabel();
    

    /**
     * @param args the command line arguments
     */
    public ElectricityBillingSystem() {
        frame = new JFrame();
        panel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel("Electricity Billing System", JLabel.CENTER);
        label4 = new JLabel();
        
        
        
        JButton btnReg = new JButton("LOGIN");
        //btnReg.addActionListener(this);
        
        btnReg.addActionListener(new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                SignInMain signin = new SignInMain();
                signin.setVisible(true);
            }});
     
        JButton btnLin = new JButton("REGISTER");
        //btnLin.addActionListener(this);
        JButton btnAdm = new JButton("ADMIN");
        //btnAdm.addActionListener(this);
        btnAdm.addActionListener(new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String message = "Please enter admin password.";
                String APass = JOptionPane.showInputDialog(frame, message,"Login", JOptionPane.OK_CANCEL_OPTION);
                label4.setText(APass);
                if (APass == "1234") {
                    frame.dispose();
                    AdminPanel APanel = new AdminPanel();
                    APanel.setVisible(true);
                
                }
                
                //frame.dispose();
//                String APass = JOptionPane.showInputDialog("Enter Admin Password");
//                String APasss = JOptionPane.showConfirmDialog("Enter Admin Password", "Enter Password");
//                label4.setText(APass);
                
            }});   
        
        
        panel.setBorder(BorderFactory.createEmptyBorder(50,100,30,100));
        panel.setLayout(new GridLayout(7,1));
        panel.add(label3);
        panel.add(label4);
        panel.add(btnReg);
        panel.add(label1);
        panel.add(btnLin);
        panel.add(label2);
        panel.add(btnAdm);
        
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("E-BILL");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 300);
        label3.setFont(new Font("Verdana", Font.PLAIN, 18));
        frame.setLocationRelativeTo(null);
        
                   
        
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new ElectricityBillingSystem();
    }

    


    
}
