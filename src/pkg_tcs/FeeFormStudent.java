package pkg_tcs;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class FeeFormStudent extends JFrame implements ActionListener{
    JTextField tfrollno;
    JButton search, pay,cancle;
    JLabel labeltotal;
    JComboBox jbx,cbcourse,cbbranch;
           
       
      
   FeeFormStudent(){
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
        
        JLabel heading=new JLabel("<html>DR.C.V.Raman University Vaishali(Bihar)<br>Pay Fee </html>");
        heading.setBounds(300, 0, 700, 100);
        heading.setFont(new Font("Raleway",Font.BOLD,24));
        heading.setForeground(Color.BLACK);
        c2.add(heading);
       
       
       
        JLabel lblrollno=new JLabel("Select by roll no");
        lblrollno.setBounds(400,110,200,30);
        lblrollno.setFont(new Font("Raleway",Font.BOLD,16));
        add(lblrollno);
        
        tfrollno=new JTextField();
        tfrollno.setBounds(620,110,200,30);
        add(tfrollno);
        
        try{
            Conn c= new Conn();
            ResultSet rs=c.s.executeQuery("select * from student");
            
            while(rs.next()){
                tfrollno.setText(" ");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
         
        
          JLabel lblcourse=new JLabel("Course");
        lblcourse.setBounds(400,150,200,30);
        lblcourse.setFont(new Font("Raleway",Font.BOLD,18));
        add(lblcourse);
        
        String course[]={"B.TECH","B.sc","B.A","B.Ed","B.Com","M.B.A","M.A"};
        cbcourse=new JComboBox(course);
        cbcourse.setBounds(620,150,200,25);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        JLabel lblbranch=new JLabel("Branch");
        lblbranch.setBounds(400,190,200,30);
        lblbranch.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblbranch);
        
        String branch[]={"Select your Branch ","C.S.E","M.E","CIVIL","E.E"};
        cbbranch=new JComboBox(branch);
        cbbranch.setBounds(620,190,200,30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        
        JLabel lblsemester=new JLabel("Select Semester");
        lblsemester.setBounds(400,230,200,30);
        lblsemester.setFont(new Font("Raleway",Font.BOLD,16));
        add(lblsemester);
        
        
        String sem[]={"Semester1","Semester2","Semester3","Semester4","Semester5","Semeste6","Semester7","Semester8"};
        jbx=new JComboBox(sem);
        jbx.setBounds(620,230,200,30);
        jbx.setBackground(Color.WHITE);
        add(jbx);
        
        JLabel lbltotal=new JLabel("Total Fee for pay");
        lbltotal.setBounds(400, 270, 200, 30);
        lbltotal.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbltotal);
        
        labeltotal=new JLabel();
        labeltotal.setBounds(620, 270, 200, 30);
        labeltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labeltotal);
        
        
        search=new JButton("Search");
        search.setBounds(490, 330, 120, 30);
        search.setBackground(new Color(12,89,96));
        search.setForeground(Color.WHITE);
        search.addActionListener(this);
        search.setFont(new Font("Tahoma",Font.BOLD,18));
        add(search);
        
       
         pay=new JButton("Pay Fee");
        pay.setBounds(620, 330, 120, 30);
        pay.setBackground(new Color(12,89,96));
        pay.setForeground(Color.WHITE);
        pay.setFont(new Font("Tahoma",Font.BOLD,18));
        pay.addActionListener(this);
        add(pay);
        cancle=new JButton("Back");
        cancle.setBounds(750, 330, 120, 25);
        cancle.setBackground(new Color(12,89,96));
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Tahoma",Font.BOLD,18));
        cancle.addActionListener(this);
        add(cancle);
        
       
       getContentPane().setBackground(new Color(18,168,98));
       setSize(900,500);
       setLocation(300,100);
       setVisible(true);
   } 
   public void actionPerformed(ActionEvent ae){
          if(ae.getSource()==search){
            String course=(String)cbcourse.getSelectedItem();
            String semester=(String)jbx.getSelectedItem();
            try{
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery("select * from fee where course='"+course+"'");
                while(rs.next()){
                    labeltotal.setText(rs.getString(semester));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
        }else if(ae.getSource()==pay){
            String rollno  =   tfrollno.getText();
            String course  =   (String)cbcourse.getSelectedItem();
            String semester= (String)jbx.getSelectedItem();
            String branch=(String) cbbranch.getSelectedItem();
            String total=labeltotal.getText();
            try{
                Conn c=new Conn();
                String query = "insert into collegefee values('"+rollno+"','"+course+"','"+branch+"','"+semester+"','"+total+"')";
                c.s.executeUpdate(query);
              JOptionPane.showMessageDialog(null, "College fee Submited Sucessfully");
              setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
   }
    public static void main(String[] args){
        new FeeFormStudent();
    }
}


