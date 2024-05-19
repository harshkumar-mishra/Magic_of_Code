package pkg_tcs;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class TeacherLeave extends JFrame implements ActionListener{
    Choice cEmpId, ctime;
    JDateChooser dateChooser;
    JButton submit,cancle;
    JTextField hodName;
    TeacherLeave(){
        setLayout(null);
        JPanel c1=new JPanel();
	c1.setBounds(0,0,300,250);
	c1.setBackground(new Color(7,94,84));
	c1.setLayout(null);
	add(c1);
        
        JPanel c2=new JPanel();
	c2.setBounds(300,0,1550,100);
	c2.setBackground(new Color(7,94,84));
	c2.setLayout(null);
	add(c2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo2.png"));
	Image i2=i1.getImage().getScaledInstance(300,250, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 300, 250);
        c1.add(image);
        
        JLabel heading=new JLabel("<html>DR.C.V.Raman University Vaishali(Bihar) <br>Apply For Leave (Only Teacher)</html>");
        heading.setBounds(300, 0, 700, 100);
        heading.setFont(new Font("Raleway",Font.BOLD,28));
        heading.setForeground(Color.BLACK);
        c2.add(heading);
        
        JLabel info=new JLabel("Thank You for Using This Application");
        info.setBounds(900,750,700,30);
        info.setFont(new Font("Edwardian Script ITC",Font.BOLD,28));
        add(info);
        
        JLabel infor=new JLabel("Welcome To DR.C.V. Raman University");
        infor.setBounds(0,750,700,30);
        infor.setFont(new Font("Edwardian Script ITC",Font.BOLD,28));
        add(infor);
        
        
        JLabel lblrollno=new JLabel("Search by Id:-");
        lblrollno.setBounds(300,110,200,30);
        lblrollno.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblrollno);
        
        cEmpId=new Choice();
        cEmpId.setBounds(520,110,200,30);
        add(cEmpId);
        
        try{
            Conn c= new Conn();
            ResultSet rs=c.s.executeQuery("select * from teacher");
            
            while(rs.next()){
                cEmpId.add(rs.getString("empId"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lbldate=new JLabel("Date:-");
        lbldate.setBounds(300,150,200,30);
        lbldate.setFont(new Font("Raleway",Font.BOLD,20));
        add(lbldate);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(520,150,200,25);
        dateChooser.setForeground(Color.WHITE);
        add(dateChooser);
        
        JLabel lbltime=new JLabel("Time Duration:-");
        lbltime.setBounds(300,190,200,30);
        lbltime.setFont(new Font("Raleway",Font.BOLD,20));
        add(lbltime);
        
        ctime=new Choice();
        ctime.setBounds(520,190,200,30);
        ctime.setFont(new Font("Tohma",Font.BOLD,16));
        ctime.add("select your duration");
        ctime.add("full day");
        ctime.add("Half Day");
        ctime.add("1 Week");
        ctime.add("15 Days");
        ctime.add("90 days");
        ctime.add("6 Months");
        add(ctime);
        
       
        
        JLabel hod=new JLabel("D.S.W Name:-");
        hod.setBounds(300,230,200,30);
        hod.setFont(new Font("Raleway",Font.BOLD,20));
        add(hod);
        
        hodName=new JTextField();
        hodName.setBounds(520,230,200,30);
        hodName.setFont(new Font("Tohma",Font.BOLD,18));
        add(hodName);
        
        
        
        submit=new JButton("Submit");
        submit.setBounds(370, 300, 120, 30);
        submit.setBackground(new Color(12,89,96));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,18));
        add(submit);
        
        cancle=new JButton("Cancle");
        cancle.setBounds(510, 300, 120, 30);
        cancle.setBackground(new Color(12,89,96));
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Tahoma",Font.BOLD,18));
        cancle.addActionListener(this);
        add(cancle);
        
        
        
        getContentPane().setBackground(new Color(46,132,121));
        setSize(500,550);
        setLocation(300,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String rollNo=cEmpId.getSelectedItem();
            String date=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
            String duration= ctime.getSelectedItem();
            
            String fhod=hodName.getText();
            
            
            String query="insert into teacherleave values('"+rollNo+"','"+date+"','"+duration+"','"+fhod+"')";
            try{
                Conn c=new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Leave Application is Send to Your D.S.W");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
            
        }else {
           setVisible(false); 
        }
    }
    public static void main(String[] args){
        new TeacherLeave();
    }
}


