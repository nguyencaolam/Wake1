
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
public class Swing extends JFrame{
    JLabel lblNumber = new JLabel("Num :"),
            lblText = new JLabel("Text: ");
    JTextField txtNumber = new JTextField(),
            txtText= new JTextField();
    JButton btnTrans = new JButton("Trans"),
            btnClear = new JButton("Clear");
    public Swing(){
       setSize( 185,140);
       setTitle("Demo 01");
       setLayout(null);
        
       add(lblText);
       add( lblNumber);
       add(txtNumber);
       add(txtText);
       add(btnTrans);
       add(btnClear);
        
       lblText.setBounds(10, 10, 40, 25);
       lblNumber.setBounds(10, 40, 40, 25); // y= 60 = 30 + 25 +5
    
       txtNumber.setBounds( 60, 10, 100, 25);        
       txtText.setBounds( 60, 40, 100, 25);
        
       btnTrans.setBounds( 10, 70, 70, 25);
       btnClear.setBounds( 90, 70, 70, 25);
       // disable the textfied
       txtText.setEditable(false);
       
       // add action listenner to TRANS button
       btnTrans.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
                // get the input NUMBER
                String sNum = txtNumber.getText();
                
                int n= Integer.parseInt(sNum);
          
                String sText = readNumber(n);
                
                //print out to textfield
                txtText.setText(sText);
                
                //System.out.println( "Submit ME!");
            }

         });
       
       btnClear.addActionListener( new ActionListener() {
   
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
                txtNumber.setText("");
                txtText.setText("");
            }
        });
       
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
        Swing mainWindow = new Swing();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }
    
}
