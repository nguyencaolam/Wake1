

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author Minh Le (T144231)
 *
 */
public class is2 extends JFrame {
	JLabel lb = new JLabel("Enter Your Number:");
	JTextField txt = new JTextField();
	JTextArea txt2 = new JTextArea();
	JButton btcheck = new JButton("Check"),
			btclear = new JButton("Clear");
	public is2(){
		setSize(250,350);
		setTitle("Check Number-T144231");
		setLocation(200, 200);
		setLayout(null);
		add(lb);
		add(txt);
		add(btcheck);
		add(btclear);
		add(txt2);
		lb.setBounds(20,20,150,25);
		txt.setBounds(20,40,200,25);
		txt2.setBounds(20,120,200,180);
		btcheck.setBounds(20,80,80,25);
		btclear.setBounds(140,80,80,25);
		btcheck.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String stmp = txt.getText();
				String stmp2 = stmp.trim();
				if (stmp.length() > stmp2.length() ){ 
					txt2.append("Invalid Input"+"\n");
				}else{
				try{
					Integer.parseInt(stmp);
					int n1= Integer.parseInt(stmp);
					if(n1>0){
						txt2.append(stmp+" is positive number"+" \n");
					}else{
						txt2.append(stmp+" is not number"+" \n");
					}
				}catch(Exception e){
					txt2.append("Invalid Input"+"\n");
					}
				}
			}
		});
		btclear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txt.setText("");
			}
		});
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		is2 wMain = new is2();
			wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
			wMain.setVisible(true);
		

	}

}
