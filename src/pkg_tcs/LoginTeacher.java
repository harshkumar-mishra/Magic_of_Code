
package pkg_tcs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class LoginTeacher extends JFrame implements ActionListener{

    JButton login,cancle,back;
     JTextField tfusername;
     JPasswordField tfpassword;
     String name;
    LoginTeacher(String name){
        setLayout(null);
         JPanel c1=new JPanel();
	c1.setBounds(270,0,1550,150);
	c1.setBackground(new Color(14,100,118));
	c1.setLayout(null);
	add(c1);
        
        JPanel c2=new JPanel();
	c2.setBounds(0,0,300,250);
	c2.setBackground(new Color(14,100,118));
	c2.setLayout(null);
	add(c2);
        
        
        
        
        ImageIcon i6=new ImageIcon(ClassLoader.getSystemResource("icons/logo2.png"));
        Image i7=i6.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i8=new ImageIcon(i7);
        JLabel img=new JLabel(i8);
        img.setBounds(0, 0, 300, 250);
        c2.add(img);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/hii.jpeg"));
	Image i2=i1.getImage().getScaledInstance(1680,1050, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 1680, 1050);
        add(image);
        
        JLabel heading =new JLabel("Welcome To Dr.C.V.Raman university (Faculty Login) ");
        heading.setBounds(350, 0, 550, 60);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Raleway",Font.BOLD,20));
        c1.add(heading);
        
                JLabel head= new JLabel("Welcome "+ name +" Sir  now You can use This Application");
		head.setBounds(50, 80, 700, 30);
		head.setFont(new Font("Edwardian Script ITC",Font.BOLD,28));
		head.setForeground(Color.WHITE);
		c1.add(head);
        
        
        JLabel lblusername=new JLabel("Username:-");
        lblusername.setBounds(350,160, 150, 30);
        lblusername.setFont(new Font("Raleway",Font.BOLD,20));
        lblusername.setForeground(Color.WHITE);
        image.add(lblusername);
        
        
        tfusername=new JTextField();
        tfusername.setBounds(520, 160, 250, 30);
        tfusername.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(tfusername);
        
        JLabel lblpassword=new JLabel("Password:-");
        lblpassword.setBounds(350, 210, 150, 30);
        lblpassword.setForeground(Color.WHITE);
        lblpassword.setFont(new Font("Raleway",Font.BOLD,20));
        image.add(lblpassword);
        
        
        tfpassword=new JPasswordField();
        tfpassword.setBounds(520, 210, 250, 30);
        tfpassword.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(tfpassword);
        
        JLabel nam=new JLabel("Created and design by Harsh Kumar Mishra & Team");
        nam.setBounds(20, 700, 600, 30);
        nam.setFont(new Font("Edwardian Script ITC",Font.BOLD,28));
        nam.setForeground(Color.WHITE);
        image.add(nam);
        
        
        login=new JButton("Login");
        login.setBounds(400, 260, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma",Font.BOLD,18));
        image.add(login);
        
        cancle=new JButton("Cancle");
        cancle.setBounds(540, 260, 120, 30);
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Tahoma",Font.BOLD,18));
        cancle.addActionListener(this);
        image.add(cancle);
        
      
        
        
        
        
        getContentPane().setBackground(new Color(41,205,220));
        setSize(1000,850);
        setLocation(300,100);
        setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            String username=tfusername.getText();
            String password=tfpassword.getText();
            
            String query="select * from login where username = '"+username+"'and password='"+password+"'";
            try{
                Conn c=new Conn();
               ResultSet rs= c.s.executeQuery(query);
               
               if(rs.next()){
                   setVisible(false);
                   new Project();
                   JOptionPane.showMessageDialog(null, "you are login sucessfully");
               }else{
                  JOptionPane.showMessageDialog(null,"Your username and password are wrong"); 
                  setVisible(false);
               }
               c.s.close();
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            
        }else if(ae.getSource()==cancle){
            setVisible(false);
            new CreateMain();
        }
        
    }
    public static void main(String[] args){
        new LoginTeacher("name");
    }
}


