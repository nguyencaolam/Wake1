import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
 
/**
 * 
 */
 
/**
 * @author Admin
 *
 */
public class ww extends JPanel {
	/**
	 * 
	 */
	
	JLabel  lbl4 = new JLabel("Do"),
			lbl5 = new JLabel("Vang"), lbl6 = new JLabel("Xanh"),
			lblCounter1 = new JLabel();
	JLabel lblCounter2 = new JLabel();
	JLabel lblCounter3 = new JLabel();
	JTextField txtDo = new JTextField(), txtVang = new JTextField(),
			txtXanh = new JTextField();
	JButton btnApply = new JButton("Apply");
	Timer cTimer=null;
	int cTime=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ww t = new ww();
		//t.setDefaultCloseOperation(EXIT_ON_CLOSE);
		t.setVisible(true);
	}
 
	public ww() {
		setSize(300, 400);
		setLayout(null);
		//setTitle("Traffic Light");
		add(lbl4);add(lbl5);add(lbl6);
		add(txtDo);
		add(txtXanh);
		add(txtVang);
		add(btnApply);
//		lbl4.setBounds(10, 10, 70, 200);
//		lbl5.setBounds(90, 10, 70, 200);
//		lbl6.setBounds(170, 10, 70, 200);
		lbl4.setBounds(10, 10, 50, 25);
		txtDo.setBounds(70, 10, 35, 25);
		lbl5.setBounds(10, 40, 50, 25);
		txtVang.setBounds(70, 40, 35, 25);
		lbl6.setBounds(10, 70, 50, 25);
		txtXanh.setBounds(70, 70, 35, 25);
		btnApply.setBounds(10, 100, 80, 25);
		lblCounter1.setBounds(100, 130, 100, 25);
		cTimer = new Timer(1000, new ActionListener() {
 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(txtDo.getText());
				a++;
				lblCounter1.setText(String.valueOf(a));
 
			}
		});
		btnApply.addActionListener(new ActionListener() {
 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cTimer.start();
				
			}
		});
//		if(cTimer.isRunning()==true){
// 
//		}else{
// 
//		}
	}
 
}
 