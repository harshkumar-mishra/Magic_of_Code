package pkg_tcs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class UpdateStudent extends JFrame implements ActionListener{
    JTextField tfcourse,tfaddress,tfphone,tfemail,tfbranch,tfrollno;
    JLabel labelrollno;
    JButton submit,cancle;
    Choice crollno;
   
    UpdateStudent(){
        setLayout(null);
        getContentPane().setBackground(new Color(7,94,84));
        
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
        
        JLabel heading=new JLabel("<html> DR.C.V.Raman University Vaishali (Bihar)<br>!!!!!!  Update Student Details !!!!!!</html>");
        heading.setBounds(350, 0, 500, 70);
        heading.setFont(new Font("Raleway",Font.BOLD,22));
        heading.setForeground(Color.WHITE);
        c1.add(heading);
        JLabel lblrollno=new JLabel("Select by roll no");
        lblrollno.setBounds(300, 100, 200, 20);
        lblrollno.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblrollno);
        
        crollno=new Choice();
        crollno.setBounds(510,100,200,20);
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
        
        
        JLabel lblname=new JLabel("Name:-");
        lblname.setBounds(300, 150, 100, 30);
        lblname.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(420, 150, 200, 30);
        labelname.setFont(new Font("Raleway",Font.BOLD,16));
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
        
        JLabel lblrollnumber=new JLabel("Roll No:-");
        lblrollnumber.setBounds(300, 200, 200, 30);
        lblrollnumber.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblrollnumber);
        tfrollno=new JTextField();
        tfrollno.setBounds(420, 200, 200, 30);
        tfrollno.setFont(new Font("Raleway",Font.BOLD,18));
        add(tfrollno);
        
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
        
         
        JLabel lblx=new JLabel("Class X(%):-");
        lblx.setBounds(650, 300, 200, 30);
        lblx.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblx);
        
        JLabel labelx=new JLabel();
        labelx.setBounds(860, 300, 200, 30);
        labelx.setFont(new Font("Raleway",Font.PLAIN,18));
        labelx.setForeground(Color.WHITE);
        add(labelx);
         
        JLabel lblxii=new JLabel("Class XII(%):- ");
        lblxii.setBounds(300, 350, 200, 30);
        lblxii.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblxii);
        
        JLabel labelxii=new JLabel();
        labelxii.setBounds(425, 350, 200, 30);
        labelxii.setFont(new Font("Raleway",Font.PLAIN,18));
        labelxii.setForeground(Color.WHITE);
        add(labelxii);
        
         
        JLabel lblaadhar=new JLabel("Aadhar No:-");
        lblaadhar.setBounds(650, 350, 200, 30);
        lblaadhar.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblaadhar);
        
        JLabel labelaadhar=new JLabel();
        labelaadhar.setBounds(860, 350, 200, 30);
        labelaadhar.setFont(new Font("Raleway",Font.PLAIN,18));
        labelaadhar.setForeground(Color.WHITE);
        add(labelaadhar);
        
        
        JLabel lblcourse=new JLabel("Course");
        lblcourse.setBounds(300, 400, 200, 30);
        lblcourse.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblcourse);
        
        
        tfcourse=new JTextField();
        tfcourse.setBounds(420, 400, 200, 30);
        tfcourse.setBackground(Color.WHITE);
        tfcourse.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfcourse);
        
        JLabel lblbranch=new JLabel("Branch");
        lblbranch.setBounds(650, 400, 200, 30);
        lblbranch.setFont(new Font("Raleway",Font.BOLD,20));
        add(lblbranch);
        
       
        tfbranch=new JTextField();
        tfbranch.setBounds(860, 400, 200, 30);
        tfbranch.setFont(new Font("Raleway",Font.BOLD,16));
        add(tfbranch);
        
        try{
            Conn c=new Conn();
            String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("dob"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelxii.setText(rs.getString("class_xii"));
                labelaadhar.setText(rs.getString("aadhar"));
               // labelrollno.setText(rs.getString("rollno"));
                tfcourse.setText(rs.getString("course"));
                tfbranch.setText(rs.getString("branch"));
                tfrollno.setText(rs.getString("rollno"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        crollno.addItemListener(new ItemListener() {
        
  public void itemStateChanged(ItemEvent ie){
                 try{
             Conn c=new Conn();
             String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
             ResultSet rs=c.s.executeQuery(query);
             while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("dob"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelxii.setText(rs.getString("class_xii"));
                labelaadhar.setText(rs.getString("aadhar"));
                //labelrollno.setText(rs.getString("rollno"));
                tfcourse.setText(rs.getString("course"));
                tfbranch.setText(rs.getString("branch"));
                tfrollno.setText(rs.getString("rollno"));
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
        
        
        setSize(900,650);
        setLocation(300,100);
        setVisible(true);
    }
   @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
           
            String rollno=tfrollno.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String course =tfcourse.getText();
            String branch=tfbranch.getText();
            
            
            try{
                String query ="update student set address ='"+address+"', phone='"+phone+"', email='"+email+"',course='"+course+"',branch='"+branch+"',rollno='"+rollno+"' where rollno='"+rollno+"' ";
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
        new UpdateStudent();
    }
}


