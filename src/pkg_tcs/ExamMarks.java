package pkg_tcs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class ExamMarks extends JFrame implements ActionListener{
    JButton submit,cancle; 
    Choice crollno;
    JComboBox jbx;
    JTextField tfsub1,tfsub2,tfsub3,tfsub4,tfsub5,tfmarks1,tfmarks2,tfmarks3,tfmarks4,tfmarks5;
   ExamMarks(){
       setLayout(null);
       
       
       
        JPanel c1=new JPanel();
	c1.setBounds(270,0,1550,100);
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
        
        
       
       
       
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/exam.jpg"));
	Image i2=i1.getImage().getScaledInstance(400,300, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
        image.setBounds(800, 75, 400, 300);
        add(image);
        
        JLabel heading=new JLabel("Enter Marks of Student");
        heading.setBounds(300, 5, 500, 50);
        heading.setFont(new Font("Raleway",Font.BOLD,30));
        c1.add(heading);
        JLabel lblrollno=new JLabel("Select by roll no");
        lblrollno.setBounds(300, 120, 200, 20);
        lblrollno.setFont(new Font("Raleway",Font.BOLD,18));
        add(lblrollno);
        
        crollno=new Choice();
        crollno.setBounds(510,120,200,20);
        add(crollno);
        
        try{
            Conn c= new Conn();
            ResultSet rs=c.s.executeQuery("select * from student");
            
            while(rs.next()){
                crollno.add(rs.getString("rollno"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        JLabel lblsemester=new JLabel("Select Semester ");
        lblsemester.setBounds(300, 150, 200, 25);
        lblsemester.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblsemester);
        
        
        String sem[]={"1st sem","2nd sem","3rd sem","4th sem","5th sem","6th sem","7th sem","8th sem"};
        jbx=new JComboBox(sem);
        jbx.setBounds(510, 150, 200, 25);
        jbx.setBackground(Color.WHITE);
        add(jbx);
        
         JLabel lblentersubject=new JLabel("Enter subject ");
        lblentersubject.setBounds(300, 185, 200, 25);
        lblentersubject.setFont(new Font("Raleway",Font.BOLD,16));
        add(lblentersubject);
        
         JLabel lblenterMarks=new JLabel("Enter Marks");
        lblenterMarks.setBounds(510, 185, 200, 25);
        lblenterMarks.setFont(new Font("Raleway",Font.BOLD,16));
        add(lblenterMarks);
        
        tfsub1=new JTextField();
        tfsub1.setBounds(300, 230, 200, 25);
        tfsub1.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfsub1);
        
        tfsub2=new JTextField();
        tfsub2.setBounds(300, 270, 200, 25);
        tfsub2.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfsub2);
        tfsub3=new JTextField();
        tfsub3.setBounds(300, 310, 200, 25);
        tfsub3.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfsub3);
        
        tfsub4=new JTextField();
        tfsub4.setBounds(300, 350, 200, 25);
        tfsub4.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfsub4);
        
        tfsub5=new JTextField();
        tfsub5.setBounds(300, 390, 200, 25);
        tfsub5.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfsub5);
        
         
        tfmarks1=new JTextField();
        tfmarks1.setBounds(510, 230, 100, 25);
        tfmarks1.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfmarks1);
        
        tfmarks2=new JTextField();
        tfmarks2.setBounds(510, 270, 100, 25);
        tfmarks2.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfmarks2);
        
        tfmarks3=new JTextField();
        tfmarks3.setBounds(510, 310, 100, 25);
        tfmarks3.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfmarks3);
        
        tfmarks4=new JTextField();
        tfmarks4.setBounds(510, 350, 100, 25);
        tfmarks4.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfmarks4);
        
        tfmarks5=new JTextField();
        tfmarks5.setBounds(510, 390, 100, 25);
        tfmarks5.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfmarks5);
        
        submit=new JButton("Submit");
        submit.setBounds(350, 435, 120, 30);
        submit.setBackground(new Color(12,89,96));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,18));
        add(submit);
        
        JLabel name=new JLabel("Created and design by Harsh Kumar Mishra & Team");
        name.setBounds(20, 700, 600, 30);
        name.setFont(new Font("Edwardian Script ITC",Font.BOLD,24));
        name.setForeground(Color.BLACK);
        add(name);
        
        cancle=new JButton("Cancle");
        cancle.setBounds(490, 435, 120, 30);
        cancle.setBackground(new Color(12,89,96));
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Tahoma",Font.BOLD,18));
        cancle.addActionListener(this);
        add(cancle);
        
       
       getContentPane().setBackground(Color.WHITE);
       setSize(1000,800);
       setLocation(300,100);
       setVisible(true);
   }
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==submit){
           try{
               Conn c=new Conn();
               String query1="insert into subject values('"+crollno.getSelectedItem()+"','"+jbx.getSelectedItem()+"','"+tfsub1.getText()+"','"+tfsub2.getText()+"','"+tfsub3.getText()+"','"+tfsub4.getText()+"','"+tfsub5.getText()+"')";
               String query2="insert into marks values('"+crollno.getSelectedItem()+"','"+jbx.getSelectedItem()+"','"+tfmarks1.getText()+"','"+tfmarks2.getText()+"','"+tfmarks3.getText()+"','"+tfmarks4.getText()+"','"+tfmarks5.getText()+"')";
               c.s.executeUpdate(query1);
               c.s.executeUpdate(query2);
               
               
               
               JOptionPane.showMessageDialog(null, "Marks inserted sucessfully");
               setVisible(false);
           }catch(Exception e){
               e.printStackTrace();
           }
       }else{
           setVisible(false);
       }
   }
   public static void main(String[] args){
       new ExamMarks();
   } 
}


