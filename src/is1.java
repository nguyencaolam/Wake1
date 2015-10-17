//  boi nguyen tinh www.cntt34.com va congthuong.net

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class is1 implements ActionListener{
    JFrame frame = new JFrame("may tinh ca nhan");// tao 1 frame
    JPanel panel = new JPanel(new FlowLayout());//tao 1 panel
    JTextArea show = new JTextArea(2,16);//tao 1 textarea
    //tao cac nut cho may tinh
    // cac nut van con chua duoc hop le. cac ban sap xep vi tri lai cho no dep nha
    JButton bt1= new JButton("1");// ghi ten cho cac button
    JButton bt2= new JButton("2");
    JButton bt3= new JButton("3");
    JButton bt4= new JButton("4");
    JButton bt5= new JButton("5");
    JButton bt6= new JButton("6");
    JButton bt7= new JButton("7");
    JButton bt8= new JButton("8");
    JButton bt9= new JButton("9");
    JButton bt0= new JButton("0");
    JButton btadd= new JButton("+");
    JButton btsub= new JButton("-");
    JButton btmulti= new JButton("x");
    JButton btdiv= new JButton("/");
    JButton btclear= new JButton("C");
    JButton btkq= new JButton("=");
    double num1,num2,resurt;
    int add=0;// cong = 0. lat nua neu no thay doi thi thuc hien phep toan
    int sub=0;// y nhu tren nhe
    int multi=0;
    int div=0;
    public static void main(String[] args) {
        is1 N = new is1();
        N.is1();
    }

    public void is1(){
        frame.setVisible(true);//goi frame
        frame.setSize(400,400);//kich thuoc cua frame
        frame.add(panel);// add panel vao frame
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE  );
        // bay gio khoa no frame lai ko cho thay doi size
        frame.setResizable(false);
        //khoa textarea lai
        show.setEditable(false);
        //them textarer vao panel
        panel.add(show);
        //add cac button vao tron panel
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        panel.add(btadd);
        panel.add(bt4);
        panel.add(bt5);
        panel.add(bt6);
        panel.add(btsub);
        panel.add(bt7);
        panel.add(bt8);
        panel.add(bt9);
        panel.add(btmulti);
        panel.add(bt0);    
        panel.add(btclear);
        panel.add(btkq);
        panel.add(btdiv);
        //dua cac button vao acctionListener
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt0.addActionListener(this);
        // dua cac button khac vao luon
        btadd.addActionListener(this);
        btsub.addActionListener(this);
        btmulti.addActionListener(this);
        btdiv.addActionListener(this);
        btclear.addActionListener(this);
        btkq.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == btclear)
        {
            show.setText("");
            num1=0;
            num2=0;
        }
        if(source == bt1)// neu source =1 thi cho hien thi len testarea
            show.append("1");
        if(source == bt2)
            show.append("2");
        if(source == bt3)
            show.append("3");
        if(source == bt4)
            show.append("4");
        if(source == bt5)
            show.append("5");
        if(source == bt6)
            show.append("6");
        if(source == bt7)
            show.append("7");
        if(source == bt8)
            show.append("8");
        if(source == bt9)
            show.append("9");
        if(source == bt0)
            show.append("0");
        if(source==btadd)// neu chon buttion add thi sao?
        {
            //no xoa roi nen moi dua vao hen chi sai ^^
            num1=Read();
            // quen nua thieu cho nay
            show.setText("");
            //ak quen, neu khai bao o tren truoc
            // lay gia tri hien tai cua textarer gan vao sum1.
            add=1;// gan = 1 de lat nua neu no bang 1 thi cong.
            sub = 0;
            div=0;
            multi=0;
        }
        if(source == btsub)// neu chon button tru thi ran sub =1
        {
            num1=Read();
            show.setText("");
            add=0;
            sub=1;
            div=0;
            multi=0;
        }
        if(source == btmulti)
        {
            num1=Read();
            show.setText("");
            add=0;
            sub=0;
            div=0;
            multi=1;
        }
        if(source == btdiv)
        {
            num1=Read();
            show.setText("");
            add=0;
            sub=0;
            div=1;
            multi=0;
        }
        if(source == btkq)// neu chon button = thi se thuc hien phep toan
        {
            //lay gia tri chuoi trong textarea chuyen sang double gan vap num2
            num2=Double.valueOf(show.getText());
            if(add>0)
            {
                resurt = num1 + num2;
                //sai cai gi vay troi
                //ak hieu roi
                //set la dua vao trong text choi moi dc
                //con kieu so k dc dua vao trong textarea
                //vi the truoc khi dua tao ta chuyen sang kieu string
                show.setText(Double.toString(resurt));
                //chay thu phep cong truoc nhe.
            }
            if(sub>0)
            {
                resurt = num1- num2;
                show.setText(Double.toString(resurt));
            }
            if(multi>0)
            {
                resurt = num1 * num2;
                show.setText(Double.toString(resurt));
            }
            if(div>0)
            {
                resurt = num1 / num2;
                show.setText(Double.toString(resurt));
            }
        }
    }
    public double Read()
    {
        double num;
        String s;
        s=show.getText();// lay gia tri chuoi trong textarer dua vao s
        // toi day sao troi. ^^
        num = Double.valueOf(s);// chuyen kieu chuoi s sang kieu double va gan vao num
        return num;
    }

} 