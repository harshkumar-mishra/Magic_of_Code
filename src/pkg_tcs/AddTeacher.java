package pkg_tcs;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class AddTeacher extends JFrame implements ActionListener{
    JTextField tfname,tffname,tfaddress,tfphone,tfemail,tfx,tfxii,tfaadhar;
    JLabel labelempId;
    JDateChooser dateChooser;
    JComboBox cbcourse,cbbranch,cbsalary;
    JButton submit,cancle;
    Random ran=new Random();
    long first4=Math.abs((ran.nextLong()%9000L)+1000L);
    AddTeacher(){
        
        setLayout(null);
        JPanel c1=new JPanel();
	c1.setBounds(0,0,900,70);
	c1.setBackground(new Color(7,94,84));
	c1.setLayout(null);
	add(c1);
        JLabel heading=new JLabel("New Teacher Details");
        heading.setBounds(310, 10, 500, 50);
        heading.setFont(new Font("Raleway",Font.BOLD,22));
        c1.add(heading);
        
        JLabel lblname=new JLabel("Name:-");
        lblname.setBounds(50, 130, 100, 30);
        lblname.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(200, 130, 280, 30);
        tfname.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfname);
        
        JLabel lblfname=new JLabel("Father's Name:-");
        lblfname.setBounds(50, 180, 200, 30);
        lblfname.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblfname);
        
        tffname=new JTextField();
        tffname.setBounds(200, 180, 280, 30);
        tffname.setFont(new Font("Raleway",Font.BOLD,16));
        add(tffname);
        
        JLabel lblempId=new JLabel("Employee Id:-");
        lblempId.setBounds(50, 230, 200, 30);
        lblempId.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblempId);
        labelempId=new JLabel("1010"+first4);
        labelempId.setBounds(200, 230, 200, 30);
        labelempId.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelempId);
        
        JLabel lbldob=new JLabel("Date Of Birth:-");
        lbldob.setBounds(50, 280, 200, 30);
        lbldob.setFont(new Font("Raleway",Font.BOLD,20));
        add(lbldob);
        dateChooser=new JDateChooser();
        dateChooser.setBounds(200,280,280,30);
        dateChooser.setForeground(Color.WHITE);
        dateChooser.setFont(new Font("Raleway",Font.BOLD,16));
        add(dateChooser);
         
        JLabel lbladdress=new JLabel("Address:-");
        lbladdress.setBounds(50, 310, 200, 30);
        lbladdress.setFont(new Font("Raleway",Font.BOLD,20));
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(200, 310, 280, 30);
        tfaddress.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfaddress);
        
        JLabel lblphone=new JLabel("Mobile No:-");
        lblphone.setBounds(50, 360, 200, 30);
        lblphone.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblphone);
        tfphone=new JTextField();
        tfphone.setBounds(200, 360, 280, 30);
        tfphone.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfphone);
        
         
        JLabel lblemail=new JLabel("Email i'd:-");
        lblemail.setBounds(50, 410, 200, 30);
        lblemail.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblemail);
        tfemail=new JTextField();
        tfemail.setBounds(200, 410, 280, 30);
        tfemail.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfemail);
        
         
        JLabel lblx=new JLabel("Pan No:-");
        lblx.setBounds(50, 460, 200, 30);
        lblx.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblx);
        tfx=new JTextField();
        tfx.setBounds(200, 460, 280, 30);
        tfx.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfx);
         
        JLabel lblxii=new JLabel("Salary:-");
        lblxii.setBounds(50, 510, 200, 30);
        lblxii.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblxii);
        String salary[]={"Select your Salary","25000","50000","75000","up to 1 lakh"};
        cbsalary=new JComboBox(salary);
        cbsalary.setBounds(200, 510, 280, 30);
        cbsalary.setBackground(Color.WHITE);
        cbsalary.setFont(new Font("Raleway",Font.BOLD,16));
        add(cbsalary);
        
        
         
        JLabel lblaadhar=new JLabel("Aadhar No:-");
        lblaadhar.setBounds(50, 560, 200, 30);
        lblaadhar.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblaadhar);
        tfaadhar=new JTextField();
        tfaadhar.setBounds(200, 560, 280, 30);
        tfaadhar.setFont(new Font("Raleway",Font.BOLD,20));
        add(tfaadhar);
        
        
        JLabel lblcourse=new JLabel("Qualification");
        lblcourse.setBounds(50, 610, 200, 30);
        lblcourse.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblcourse);
        
        String course[]={"Select your Qualification ","B.tech","P.HD","BCA","B.sc","B.A","M.sc","MBA","M.A","M.com"};
        cbcourse=new JComboBox(course);
        cbcourse.setBounds(200, 610, 280, 30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        JLabel lblbranch=new JLabel("Department");
        lblbranch.setBounds(50, 660, 200, 30);
        lblbranch.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblbranch);
        
        String branch[]={"Select your Department ","C.S.E","M.E","CIVIL","E.E"};
        cbbranch=new JComboBox(branch);
        cbbranch.setBounds(200, 660, 280, 30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
         submit=new JButton("Submit");
        submit.setBounds(220, 710, 120, 30);
       submit.setBackground(new Color(12,89,96));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,18));
        add(submit);
        
        cancle=new JButton("Cancle");
        cancle.setBounds(350, 710, 120, 30);
        cancle.setBackground(new Color(12,89,96));
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Tahoma",Font.BOLD,18));
        cancle.addActionListener(this);
        add(cancle);
        
        setSize(900,1000);
        setLocation(300,100);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String name= tfname.getText();
            String fname=tffname.getText();
            String empId=labelempId.getText();
            String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String  panNo=tfx.getText();
            String ssSalary=(String)cbsalary.getSelectedItem();
            String aadhar=tfaadhar.getText();
            String course =(String)cbcourse.getSelectedItem();
            String branch= (String)cbbranch.getSelectedItem();
            
            
            try{
                String query ="insert into teacher values('"+name+"', '"+fname+"','"+empId+"','"+dob+"', '"+address+"','"+phone+"','"+email+"','"+panNo+"','"+ssSalary+"','"+aadhar+"','"+course+"','"+branch+"' )";
                Conn con=new Conn();
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Teacher Details fill Sucessfullly");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AddTeacher();
    }
}

