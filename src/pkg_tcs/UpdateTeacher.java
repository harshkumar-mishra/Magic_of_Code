package pkg_tcs;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class UpdateTeacher extends JFrame implements ActionListener{
    JTextField tfcourse,tfaddress,tfphone,tfemail,tfbranch,cbsalary;
    JLabel labelrollno;
    JButton submit,cancle;
    Choice cEmpId;
   
    UpdateTeacher(){
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
        
        JLabel heading=new JLabel("Update Teacher Details");
        heading.setBounds(350, 10, 500, 50);
        heading.setFont(new Font("Raleway",Font.BOLD,30));
        c1.add(heading);
        
        JLabel lblrollno=new JLabel("Select Employee Id");
        lblrollno.setBounds(300, 100, 200, 20);
        lblrollno.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblrollno);
        
        cEmpId=new Choice();
        cEmpId.setBounds(510,100,200,20);
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
        
        
        JLabel lblname=new JLabel("Name:-");
        lblname.setBounds(300, 150, 100, 30);
        lblname.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(420, 150, 200, 30);
        labelname.setFont(new Font("Raleway",Font.PLAIN,16));
        labelname.setForeground(Color.WHITE);
        add(labelname);
        
        JLabel lblfname=new JLabel("Father's Name:-");
        lblfname.setBounds(650, 150, 200, 30);
        lblfname.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblfname);
        
        JLabel labelfname=new JLabel();
        labelfname.setBounds(860, 150, 200, 30);
        labelfname.setFont(new Font("Raleway",Font.PLAIN,18));
        labelfname.setForeground(Color.WHITE);
        add(labelfname);
        
        JLabel lblrollnumber=new JLabel("Emp id:-");
        lblrollnumber.setBounds(300, 200, 200, 30);
        lblrollnumber.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblrollnumber);
        labelrollno=new JLabel();
        labelrollno.setBounds(420, 200, 200, 30);
        labelrollno.setFont(new Font("Raleway",Font.BOLD,18));
        labelrollno.setForeground(Color.WHITE);
        add(labelrollno);
        
        JLabel lbldob=new JLabel("Date Of Birth:-");
        lbldob.setBounds(650, 200, 200, 30);
        lbldob.setFont(new Font("Raleway",Font.BOLD,20));
        add(lbldob);
        
        JLabel labeldob=new JLabel();
        labeldob.setBounds(860,200,200,30);
        labeldob.setFont(new Font("Raleway",Font.PLAIN,18));
        labeldob.setForeground(Color.WHITE);
        add(labeldob);
         
        JLabel lbladdress=new JLabel("Address:-");
        lbladdress.setBounds(300, 250, 200, 30);
        lbladdress.setFont(new Font("Raleway",Font.BOLD,20));
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(420, 250, 200, 30);
        tfaddress.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfaddress);
        
        JLabel lblphone=new JLabel("Mobile No:-");
        lblphone.setBounds(650, 250, 200, 30);
        lblphone.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblphone);
        tfphone=new JTextField();
        tfphone.setBounds(860, 250, 200, 30);
        tfphone.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfphone);
        
         
        JLabel lblemail=new JLabel("Email i'd:-");
        lblemail.setBounds(300, 300, 200, 30);
        lblemail.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblemail);
        tfemail=new JTextField();
        tfemail.setBounds(420, 300, 200, 30);
        tfemail.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfemail);
       
        JLabel lblx=new JLabel("Pan No:-");
        lblx.setBounds(650, 300, 200, 30);
        lblx.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblx);
        
        JLabel tfpn=new JLabel();
        tfpn.setBounds(860, 300, 200, 30);
        tfpn.setFont(new Font("Raleway",Font.BOLD,16));
        tfpn.setForeground(Color.WHITE);
        add(tfpn);
         
        JLabel lblxii=new JLabel("Salary:-");
        lblxii.setBounds(300, 350, 200, 30);
        lblxii.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblxii);
        
        cbsalary=new JTextField();
        cbsalary.setBounds(420, 350, 200, 30);
        cbsalary.setBackground(Color.WHITE);
        cbsalary.setFont(new Font("Raleway",Font.BOLD,16));
        add(cbsalary);
        
         
        JLabel lblaadhar=new JLabel("Aadhar No:-");
        lblaadhar.setBounds(650, 350, 200, 30);
        lblaadhar.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblaadhar);
        
        JLabel labelaadhar=new JLabel();
        labelaadhar.setBounds(860, 350, 200, 30);
        labelaadhar.setFont(new Font("Raleway",Font.BOLD,18));
        labelaadhar.setForeground(Color.WHITE);
        add(labelaadhar);
        
        
        JLabel lblcourse=new JLabel("Qualification");
        lblcourse.setBounds(300, 400, 200, 30);
        lblcourse.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblcourse);
        
        
        tfcourse=new JTextField();
        tfcourse.setBounds(420, 400, 200, 30);
        tfcourse.setBackground(Color.WHITE);
        tfcourse.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfcourse);
        
        JLabel lblbranch=new JLabel("Department");
        lblbranch.setBounds(650, 400, 200, 30);
        lblbranch.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblbranch);
        
       
        tfbranch=new JTextField();
        tfbranch.setBounds(860, 400, 200, 30);
        tfbranch.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfbranch);
        
        try{
            Conn c=new Conn();
            String query="select * from teacher where empId='"+cEmpId.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("dob"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfpn.setText(rs.getString("panNo"));
                cbsalary.setText(rs.getString("salary"));
                labelaadhar.setText(rs.getString("aadhar"));
                labelrollno.setText(rs.getString("empId"));
                tfcourse.setText(rs.getString("qualification"));
                tfbranch.setText(rs.getString("department"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        cEmpId.addItemListener(new ItemListener() {
        
            public void itemStateChanged(ItemEvent ie){
                 try{
             Conn c=new Conn();
            String query="select * from teacher where empId='"+cEmpId.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("dob"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfpn.setText(rs.getString("panNo"));
                cbsalary.setText(rs.getString("salary"));
                labelaadhar.setText(rs.getString("aadhar"));
                labelrollno.setText(rs.getString("empId"));
                tfcourse.setText(rs.getString("qualification"));
                tfbranch.setText(rs.getString("department"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
            }
        
        
        
        
        });
        
         submit=new JButton("Update");
        submit.setBounds(440, 500, 120, 30);
        submit.setBackground(new Color(12,89,96));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,18));
        add(submit);
        
        cancle=new JButton("Cancle");
        cancle.setBounds(610, 500, 120, 30);
        cancle.setBackground(new Color(12,89,96));
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Tahoma",Font.BOLD,18));
        cancle.addActionListener(this);
        add(cancle);
        
        
        JLabel name=new JLabel("Created and design by Harsh Kumar Mishra & Team");
        name.setBounds(20, 700, 600, 30);
        name.setFont(new Font("Edwardian Script ITC",Font.BOLD,24));
        name.setForeground(Color.WHITE);
        add(name);
        
        getContentPane().setBackground(new Color(7,94,84));
        setSize(900,650);
        setLocation(300,100);
        setVisible(true);
    }
   @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
           
            String empId=labelrollno.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String qualification =tfcourse.getText();
            String department=tfbranch.getText();
            String salary=cbsalary.getText();
            
            
            
            try{
                String query ="update teacher set address ='"+address+"', phone='"+phone+"', email='"+email+"',qualification='"+qualification+"',salary='"+salary+"',department='"+department+"' where empId='"+empId+"' ";
                Conn con=new Conn();
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Student Details Updated Sucessfullly");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new UpdateTeacher();
    }
}





