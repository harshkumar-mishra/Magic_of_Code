
package pkg_tcs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CreateMain extends JFrame implements ActionListener{

    JButton login,back;
    JTextField j1,j3;
    CreateMain(){
      
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
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/harsh1.jpg"));
	Image i2=i1.getImage().getScaledInstance(1680,1050, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 1680, 1050);
        add(image);
        
        
        
        JLabel heading =new JLabel("Welcome To Dr.C.V.Raman university Login ");
        heading.setBounds(350, 0, 550, 60);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Raleway",Font.BOLD,24));
        c1.add(heading);
        
        
        JLabel headin =new JLabel("Hello Faculty!");
        headin.setBounds(280, 60, 200, 50);
        headin.setForeground(Color.BLACK);
        headin.setFont(new Font("Edwardian Script ITC",Font.BOLD,28));
        c1.add(headin);
        
        JLabel head =new JLabel("Please Enter Your Name:-");
        head.setBounds(330, 170, 300, 30);
        head.setForeground(Color.WHITE);
        head.setFont(new Font("Sitka Text",Font.BOLD,22));
        image.add(head);
        
        j1=new JTextField();
        j1.setBounds(650,170,300,30);
        j1.setForeground(Color.BLACK);
        j1.setBackground(Color.WHITE);
        j1.setFont(new Font("Raleway",Font.BOLD,20));
         image. add(j1);
         
         
         
        JLabel info =new JLabel("How are you:-");
        info.setBounds(330, 220, 200, 50);
        info.setForeground(Color.WHITE);
        info.setFont(new Font("Sitka Text",Font.BOLD,22));
        image.add(info);
        
        j3=new JTextField();
        j3.setBounds(650,220,300,30);
        j3.setForeground(Color.BLACK);
        j3.setBackground(Color.WHITE);
        j3.setFont(new Font("Raleway",Font.BOLD,20));
        image. add(j3);
        
        
        JLabel name=new JLabel("Created and design by Harsh Kumar Mishra & Team");
        name.setBounds(20, 700, 600, 30);
        name.setFont(new Font("Edwardian Script ITC",Font.BOLD,24));
        name.setForeground(Color.WHITE);
        image.add(name);
        
        
        
        login=new JButton("Faculty");
        login.setBounds(500, 300, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma",Font.BOLD,18));
        image.add(login);
        
       
        
        back=new JButton("Cancle");
        back.setBounds(680, 300, 120, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,18));
        back.addActionListener(this);
        image.add(back);
        
      
        setSize(1000,800);
        setLocation(300,100);
        setVisible(true); 
   }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            String name= j1.getText();
	     setVisible(false);
            
            new LoginTeacher(name);
        
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new CreateMain();
    }
}


