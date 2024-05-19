package pkg_tcs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Information extends JFrame implements ActionListener{
    JButton back;
    Information(){
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/000.jpg"));
	Image i2=i1.getImage().getScaledInstance(1680,1050, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 1680, 1050);
        add(image);
        
        JPanel c2=new JPanel();
	c2.setBounds(00,0,300,250);
	c2.setBackground(new Color(112,60,14));
	c2.setLayout(null);
	image.add(c2);
        
        ImageIcon i6=new ImageIcon(ClassLoader.getSystemResource("icons/logo2.png"));
        Image i7=i6.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i8=new ImageIcon(i7);
        JLabel img=new JLabel(i8);
        img.setBounds(0, 0, 300, 250);
        c2.add(img);
        
        JLabel motivate=new JLabel("<html><p align=justify>This application is design by Harsh Kumar Mishra & Team .this application are design from java Programming Language IT is use for multipurpose like add student paly quiz and gain some knowledge regarding java Programming. Student login by rollno and check result and know about college.</p></html>");
        motivate.setBounds(300, 200, 900, 160);
        motivate.setFont(new Font("Edwardian Script ITC",Font.BOLD,28));
        motivate.setForeground(Color.BLACK);
        image.add(motivate);
        
        JLabel thank=new JLabel("Thank You !!! ");
        thank.setBounds(700, 350, 500, 160);
       thank.setFont(new Font("Edwardian Script ITC",Font.BOLD,28));
        thank.setForeground(Color.BLACK);
        image.add(thank);
      
        
        
        JPanel c1=new JPanel();
	c1.setBounds(250,0,1680,70);
	c1.setBackground(new Color(112,60,14));
	c1.setLayout(null);
	image.add(c1);
        
        
        
        
        back=new JButton("Back Page");
        back.setBounds(850,700,150,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,20));
        back.addActionListener(this);
        image.add(back);
        
        setSize(1000,800);
        setLocation(300,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new About();
        }
    }
   public static void main(String args[]){
       new Information();
   } 
}


