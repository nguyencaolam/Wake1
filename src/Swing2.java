
import java.awt.AWTEventMulticaster;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vnam
 */
public class Swing2 extends JFrame{
    JLabel lblNumber = new JLabel("Num :"),
            lblText = new JLabel("Text: ");
    JTextField txtNumber = new JTextField(),
            txtText= new JTextField();
    JButton btnTrans = new JButton("Trans"),
            btnClear = new JButton("Clear");
    JButton btn0 = new JButton("0"),
            btn1 = new JButton("1"),
            btn2 = new JButton("2"),
            btn3 = new JButton("3"),
            btn4 = new JButton("4"),
            btn5 = new JButton("5"),
            btn6 = new JButton("6"),
            btn7 = new JButton("7"),
            btn8 = new JButton("8"),
            btn9 = new JButton("9"),
            btnA = new JButton("+"),
            btnS = new JButton("-"),
            btnM = new JButton("*"),
            btnD = new JButton("/");
            
            
    
    
    public Swing2(){
       setSize( 185,215);
       setTitle("Demo 01");
       setLayout(null);
        
       //add(lblText);
       //add( lblNumber);
       add(txtNumber);
       //add(txtText);
       //add(btnTrans);
       //add(btnClear);
       add(btn0);
       add(btn1);
       add(btn2);
       add(btn3); 
       add(btn4); 
       add(btn5); 
       add(btn6); 
       add(btn7); 
       add(btn8); 
       add(btn9); 
       add(btnA); 
       add(btnS); 
       add(btnM); 
       add(btnD); 
       
       Insets inThin= new Insets(1, 1, 1, 1);
       btn0.setMargin(inThin);
       btn1.setMargin(inThin);
       btn2.setMargin(inThin);
       btn3.setMargin(inThin);
       btn4.setMargin(inThin);
       btn5.setMargin(inThin);
       btn6.setMargin(inThin);
       btn7.setMargin(inThin);
       btn8.setMargin(inThin);
       btn9.setMargin(inThin);
       btnA.setMargin(inThin);
       btnS.setMargin(inThin);
       btnM.setMargin(inThin);
       btnD.setMargin(inThin);
       
       
       txtNumber.setBounds( 10, 10, 115, 25);
       btn1.setBounds(10, 40, 25, 25);
       btn2.setBounds(40, 40, 25, 25);
       btn3.setBounds(70, 40, 25, 25);
       btn4.setBounds(10, 70, 25, 25);
       btn5.setBounds(40, 70, 25, 25);
       btn6.setBounds(70, 70, 25, 25);
       btn7.setBounds(10, 100, 25, 25);
       btn8.setBounds(40, 100, 25, 25);
       btn9.setBounds(70, 100, 25, 25);
       btn0.setBounds(10, 130, 25, 25);
       btnM.setBounds(100, 40, 25, 25);
       btnD.setBounds(100, 70, 25, 25);
       btnS.setBounds(100, 100, 25, 25);
       btnA.setBounds(100, 130, 25, 25);
       
       // disable the textfied
       txtText.setEditable(false);
       
       // add action listenner to TRANS button
       btn1.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
                txtNumber.setText( txtNumber.getText()+"1");
            }
        });
       ActionListener actNumbers= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
                JButton btnActive = (JButton)e.getSource();
                txtNumber.setText( txtNumber.getText()+btnActive.getText());
            }
        };
       btn2.addActionListener( actNumbers);
       btn3.addActionListener( actNumbers);
       btn4.addActionListener( actNumbers);
       btn5.addActionListener( actNumbers);
       btn6.addActionListener( actNumbers);
       btn7.addActionListener( actNumbers);
       btn8.addActionListener( actNumbers);
       btn9.addActionListener( actNumbers);
       btn0.addActionListener( actNumbers);
       
       ActionListener actOperator = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
                JButton btnActive = (JButton)e.getSource();
                if( btnActive == btnA){
                    System.out.println("add");
                }
                if( btnActive == btnS){
                    System.out.println("sub");
                }
                if( btnActive == btnM){
                    System.out.println("mul");
                }
                if( btnActive == btnD){
                    System.out.println("div");
                }
            }
        };
       btnA.addActionListener(actOperator);
       btnS.addActionListener(actOperator);
       btnM.addActionListener(actOperator);
       btnD.addActionListener(actOperator);
    }

    private String readNumber(int n) {
        String sText = "";
        int iU = n%10; // hang don vi
        int iD= (n/10 ) %10; // hang chuc
        int iH= n%100 ;// hang tram
        String sU="", sD="", sH="";  
        if (iD != 1) {
            if (iU == 0) {
                if (iD > 0 && iH > 0) {
                    sU = "";
                } else {
                    sU = "zero";
                }
            }
            if (iU == 1) {
                sU = "one";
            }
            if (iU == 2) {
                sU = "two";
            }
            if (iU == 3) {
                sU = "three";
            }
            if (iU == 4) {
                sU = "four";
            }
            if (iU == 5) {
                sU = "five";
            }
            if (iU == 6) {
                sU = "six";
            }
            if (iU == 7) {
                sU = "seven";
            }
            if (iU == 8) {
                sU = "eight";
            }
            if (iU == 9) {
                sU = "nine";
            }
            //d
            if (iD == 0) {
               sD = "";
                
            }
            if (iD == 2) {
                sD = "twenty";
            }
            if (iD == 3) {
                sD = "thirdty";
            }
            if (iD == 4) {
                sD = "fourty";
            }
            if (iD == 5) {
                sD = "fifty";
            }
            if (iD == 6) {
                sD = "sixty";
            }
            if (iD == 7) {
                sD = "seventy";
            }
            if (iD == 8) {
                sD = "eighty";
            }
            if (iD == 9) {
                sD = "ninety";
            }
        }
        else{ //10 ->19
            if (iU == 0) {
                sU = "ten";
                           }
            if (iU == 1) {
                sU = "eleven";
            }
            if (iU == 2) {
                sU = "twelve";
            }
            if (iU == 3) {
                sU = "thirdteen";
            }
            if (iU == 4) {
                sU = "fourteen";
            }
            if (iU == 5) {
                sU = "fifteen";
            }
            if (iU == 6) {
                sU = "sixteen";
            }
            if (iU == 7) {
                sU = "seventeen";
            }
            if (iU == 8) {
                sU = "eighteen";
            }
            if (iU == 9) {
                sU = "nineteen";
            }
        }
        sText = sH+ " "+ sD+ " "+ sU;
        return sText.trim();
    }

    
     public static void main(String[] args) {
        // TODO code application logic here
        Swing2 mainWindow = new Swing2();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }
    
}
