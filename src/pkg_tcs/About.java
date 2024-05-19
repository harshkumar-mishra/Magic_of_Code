package pkg_tcs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener{
    JButton back,next;
    About(){
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
      
        
        
        JPanel c1=new JPanel();
	c1.setBounds(250,0,1680,70);
	c1.setBackground(new Color(112,60,14));
	c1.setLayout(null);
	image.add(c1);
        
        
        JLabel heading=new JLabel("<html>DR.C.V.Raman University Vaishali (Bihar)<br> About Pages</html>");
        heading.setBounds(350, 0, 600, 70);
        heading.setFont(new Font("Tahoma",Font.BOLD,24));
        heading.setForeground(Color.BLACK);
        c1.add(heading);
        
      
        
        JLabel motivate=new JLabel("<html>The Sun Has Not Set Yet Let It Be a Little Evening. <br> Will Return Home By MySelf Let Me Succed <br> The World Finds an Excuse To Defame Me, <br> I Will Be Infamous MySelf  First Let My Name Be...</html>");
        motivate.setBounds(700, 200, 500, 160);
        motivate.setFont(new Font("Edwardian Script ITC",Font.BOLD,24));
        motivate.setForeground(Color.BLACK);
        image.add(motivate);
        
        JLabel name=new JLabel("Created and design by Harsh Kumar Mishra");
        name.setBounds(20, 700, 600, 30);
        name.setFont(new Font("Tahoma",Font.BOLD,20));
        name.setForeground(Color.WHITE);
        image.add(name);
        
        JLabel contact=new JLabel("Contact:-6207812206,hm7148802@gmail.com");
        contact.setBounds(1000, 700, 600, 30);
        contact.setFont(new Font("Tahoma",Font.BOLD,20));
        contact.setForeground(Color.BLACK);
        image.add(contact);
        
        next=new JButton("next");
        next.setBounds(650,700,150,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Tahoma",Font.BOLD,20));
        next.addActionListener(this);
        image.add(next);
        
        back=new JButton("Back Page");
        back.setBounds(850,700,150,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,20));
        back.addActionListener(this);
        image.add(back);
        
      getContentPane().setBackground(Color.WHITE);
      
       setSize(1000,800);
       setLocation(300,100);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            
        }else{
            setVisible(false);
            new Information();
        }
    }
    public static void main(String[] args){
        new About();
    }
}


