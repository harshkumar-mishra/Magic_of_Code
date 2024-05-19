package pkg_tcs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EmpLogin extends JFrame implements ActionListener{
    JTextField user;
    JButton save,cancle,clear;
    JPasswordField passwor;
    EmpLogin(){
      setLayout(null);
      
        JPanel c1=new JPanel();
	c1.setBounds(270,0,1550,110);
	c1.setBackground(new Color(14,100,118));
	c1.setLayout(null);
	add(c1);
        
        JPanel c2=new JPanel();
	c2.setBounds(0,0,300,250);
	c2.setBackground(new Color(14,100,118));
	c2.setLayout(null);
	add(c2);
        
        JLabel com=new JLabel("DR.C.V.Raman University Vaishali (Bihar)");
        com.setBounds(350, 10, 600, 30);
        com.setFont(new Font("Raleway",Font.BOLD,24));
        com.setBackground(Color.WHITE);
        com.setForeground(Color.BLACK);
        c1.add(com);
        JLabel coad=new JLabel("Add a new Employee and UserId Password");
        coad.setBounds(270, 50, 600, 30);
        coad.setFont(new Font("Edwardian Script ITC",Font.BOLD,24));
        coad.setBackground(Color.WHITE);
        coad.setForeground(Color.BLACK);
        c1.add(coad);
        
        JLabel name=new JLabel("Created and design by Harsh Kumar Mishra & Team");
        name.setBounds(20, 700, 600, 30);
        name.setFont(new Font("Edwardian Script ITC",Font.BOLD,24));
        name.setForeground(Color.BLACK);
        add(name);
        
        JLabel name1=new JLabel("[Note:- Please Fill Strong Password like.(HaRsH@12365)]");
        name1.setBounds(300, 215, 600, 30);
        name1.setFont(new Font("Raleway",Font.PLAIN,20));
        name1.setForeground(Color.BLACK);
        add(name1);
        
        
        JLabel name2=new JLabel("Thank You !!!");
        name2.setBounds(1300, 700, 600, 30);
        name2.setFont(new Font("Edwardian Script ITC",Font.BOLD,24));
        name2.setForeground(Color.BLACK);
        add(name2);
        
        
        
        
        
        JLabel create=new JLabel("Create a Username:-");
        create.setBounds(400, 120, 200, 30);
        create.setFont(new Font("Raleway",Font.BOLD,20));
        create.setBackground(Color.WHITE);
        create.setForeground(Color.BLACK);
        add(create);
        
        
        user=new JTextField();
        user.setBounds(610, 120, 250, 25);
        user.setForeground(Color.BLACK);
        user.setFont(new Font("Raleway",Font.BOLD,16));
        user.setBackground(Color.WHITE);
        add(user);
        
        JLabel pass=new JLabel("Create a Password:-");
        pass.setBounds(400, 170, 200, 30);
        pass.setFont(new Font("Raleway",Font.BOLD,20));
        pass.setBackground(Color.WHITE);
        pass.setForeground(Color.BLACK);
        add(pass);
        
        
        passwor=new JPasswordField();
        passwor.setBounds(610, 170, 250, 25);
        passwor.setForeground(Color.BLACK);
        passwor.setFont(new Font("Raleway",Font.BOLD,16));
        passwor.setBackground(Color.WHITE);
        add(passwor);
        
        save=new JButton("ADD");
        save.setBounds(500, 260, 120, 30);
        save.setBackground(Color.BLACK);
        save.setForeground(Color.WHITE);
        save.addActionListener(this);
        save.setFont(new Font("Tahoma",Font.BOLD,18));
        add(save);
        
        cancle=new JButton("Cancle");
        cancle.setBounds(640, 260, 120, 30);
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Tahoma",Font.BOLD,18));
        cancle.addActionListener(this);
        add(cancle);
        
        clear=new JButton("Clear");
        clear.setBounds(550, 310, 120, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        clear.setFont(new Font("Tahoma",Font.BOLD,18));
        add(clear);
        
        
        
        
        
        ImageIcon i6=new ImageIcon(ClassLoader.getSystemResource("icons/logo2.png"));
        Image i7=i6.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i8=new ImageIcon(i7);
        JLabel img=new JLabel(i8);
        img.setBounds(0, 0, 300, 250);
        c2.add(img);
        
      getContentPane().setBackground(new Color(41,205,220));
        setSize(1000,700);
        setLocation(300,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==save){
            String username= user.getText();
            String password= passwor.getText();
             try{
            if(username.equals("")){
                JOptionPane.showMessageDialog(null, "Please fill Username is Required.");
            }else if(password.equals("")){
                JOptionPane.showMessageDialog(null, "Password are Required.");
            }else{
                Conn c= new Conn();
                String query="insert into login values('"+username+"','"+password+"')";
                c.s.executeUpdate(query);
                
                
                setVisible(false);
                new Project().setVisible(true);
            }
            
        }catch (Exception e){
            System.out.println(e);
        }  
        }else if (ae.getSource()==clear){
            user.setText("");
            passwor.setText("");
        }else{
            setVisible(false);
        }
    }
   public static void main(String args[]){
       new EmpLogin();
   }
}
