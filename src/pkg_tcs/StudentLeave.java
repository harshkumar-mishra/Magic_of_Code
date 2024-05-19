package pkg_tcs;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class StudentLeave extends JFrame implements ActionListener{
    Choice crollno, ctime;
    JDateChooser dateChooser;
    JButton submit,cancle;
    JComboBox cbcourse,cbbranch;
    JTextField hodName;
    StudentLeave(){
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
        
        JLabel heading=new JLabel("<html>Apply For Leave <br> (Only Student) </html>");
        heading.setBounds(300, 0, 700, 100);
        heading.setFont(new Font("Raleway",Font.BOLD,24));
        heading.setForeground(Color.WHITE);
        c2.add(heading);
        
        JLabel info=new JLabel("Thank You for Using This Application");
        info.setBounds(900,750,700,30);
        info.setFont(new Font("Edwardian Script ITC",Font.BOLD,28));
        info.setBackground(Color.BLACK);
        info.setForeground(Color.WHITE);
        add(info);
        
        JLabel infor=new JLabel("Welcome To DR.C.V. Raman University");
        infor.setBounds(0,750,700,30);
        infor.setFont(new Font("Edwardian Script ITC",Font.BOLD,28));
        infor.setBackground(Color.BLACK);
        infor.setForeground(Color.WHITE);
        add(infor);
        
        JLabel lblrollno=new JLabel("Search by roll no:-");
        lblrollno.setBounds(400,110,200,30);
        lblrollno.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblrollno);
        
        crollno=new Choice();
        crollno.setBounds(620,110,200,30);
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
        
        JLabel lbldate=new JLabel("Date:-");
        lbldate.setBounds(400,150,200,30);
        lbldate.setFont(new Font("Raleway",Font.BOLD,18));
        add(lbldate);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(620,150,200,25);
        dateChooser.setForeground(Color.WHITE);
        add(dateChooser);
        
        JLabel lbltime=new JLabel("Time Duration:-");
        lbltime.setBounds(400,190,200,30);
        lbltime.setFont(new Font("Raleway",Font.BOLD,18));
        add(lbltime);
        
        ctime=new Choice();
        ctime.setBounds(620,190,200,30);
        ctime.setFont(new Font("Tohma",Font.PLAIN,14));
        ctime.add("select your duration");
        ctime.add("full day");
        ctime.add("Half Day");
        ctime.add("1 Week");
        ctime.add("15 Days");
        ctime.add("90 days");
        ctime.add("1 Semester");
        add(ctime);
        
       
        
        JLabel lblcourse=new JLabel("Course");
        lblcourse.setBounds(400,230,200,30);
        lblcourse.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblcourse);
        
        String course[]={"Select your Course ","B.Tech","BBA","BCA","B.sc","B.A","M.sc","M.B.A","M.A","M.com"};
        cbcourse=new JComboBox(course);
        cbcourse.setBounds(620,230,200,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        JLabel lblbranch=new JLabel("Branch");
        lblbranch.setBounds(400, 270, 200, 30);
        lblbranch.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblbranch);
        
        String branch[]={"Select your Branch ","C.S.E","M.E","CIVIL","E.E"};
        cbbranch=new JComboBox(branch);
        cbbranch.setBounds(620, 270, 200, 30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        
        JLabel hod=new JLabel("H.O.D Name:-");
        hod.setBounds(400,310,200,30);
        hod.setFont(new Font("Raleway",Font.BOLD,20));
        add(hod);
        
        hodName=new JTextField();
        hodName.setBounds(620,310,200,30);
        hodName.setFont(new Font("Tohma",Font.PLAIN,16));
        add(hodName);
        
        submit=new JButton("Submit");
        submit.setBounds(490, 360, 120, 30);
        submit.setBackground(new Color(12,89,96));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,18));
        add(submit);
        
        cancle=new JButton("Back");
        cancle.setBounds(620, 360, 120, 30);
        cancle.setBackground(new Color(12,89,96));
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Tahoma",Font.BOLD,18));
        cancle.addActionListener(this);
        add(cancle);
        
       
        getContentPane().setBackground(new Color(18,168,98));
        setSize(500,950);
        setLocation(300,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String rollNo=crollno.getSelectedItem();
            String date=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
            String duration= ctime.getSelectedItem();
            String course=(String)cbcourse.getSelectedItem();
            String branch=(String)cbbranch.getSelectedItem();
            String fhod=hodName.getText();
            
            
            String query="insert into studentleave values('"+rollNo+"','"+date+"','"+duration+"','"+course+"','"+branch+"','"+fhod+"')";
            try{
                Conn c=new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Leave Application is Send to Your Hod");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
            
        }else {
           setVisible(false); 
        }
    }
    public static void main(String[] args){
        new StudentLeave();
    }
}


