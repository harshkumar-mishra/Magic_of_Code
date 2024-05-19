package pkg_tcs;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Marks extends JFrame implements ActionListener{
    String rollno;
    JButton cancle;
    JLabel lblrollno,lblsemester,sub1;
    Marks(String rollno){
        this.rollno=rollno;
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
        
        JLabel heading=new JLabel("DR.C.V.Raman University Vaishali Bihar");
        heading.setBounds(350, 0, 500, 50);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        heading.setForeground(Color.WHITE);
        c1.add(heading);
        
        JLabel subheading=new JLabel("Result of Examination 2023");
        subheading.setBounds(350, 70, 500, 30);
        subheading.setFont(new Font("Tahoma",Font.BOLD,16));
        subheading.setForeground(Color.BLACK);
        c1.add(subheading);
       
        lblrollno=new JLabel("Roll No."+rollno);
        lblrollno.setBounds(300, 100, 200, 20);
        lblrollno.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblrollno.setForeground(Color.WHITE);
        add(lblrollno);
        
        lblsemester=new JLabel();
        lblsemester.setBounds(300, 150, 100, 30);
        lblsemester.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblsemester.setForeground(Color.WHITE);
        add(lblsemester);
        
        JLabel sub1=new JLabel();
        sub1.setBounds(300, 200, 500, 50);
        sub1.setFont(new Font("Tahoma",Font.PLAIN,18));
        sub1.setForeground(Color.WHITE);
        add(sub1);
        
        JLabel sub2=new JLabel();
        sub2.setBounds(300, 230, 500, 50);
        sub2.setFont(new Font("Tahoma",Font.PLAIN,18));
        sub2.setForeground(Color.WHITE);
        add(sub2);
        
        JLabel sub3=new JLabel();
        sub3.setBounds(300, 260, 500, 50);
        sub3.setFont(new Font("Tahoma",Font.PLAIN,18));
        sub3.setForeground(Color.WHITE);
        add(sub3);
        
        JLabel sub4=new JLabel();
        sub4.setBounds(300, 290, 500, 50);
        sub4.setFont(new Font("Tahoma",Font.PLAIN,18));
        sub4.setForeground(Color.WHITE);
        add(sub4);
        
        JLabel sub5=new JLabel();
        sub5.setBounds(300, 320, 500, 50);
        sub5.setFont(new Font("Tahoma",Font.PLAIN,18));
        sub5.setForeground(Color.WHITE);
        add(sub5);
        try{
            Conn c=new Conn();
            ResultSet rs1=c.s.executeQuery("select * from subject where rollno ='"+rollno+"' ");
            while(rs1.next()){
                sub1.setText(rs1.getString("subject1"));
                sub2.setText(rs1.getString("subject2"));
                sub3.setText(rs1.getString("subject3"));
                sub4.setText(rs1.getString("subject4"));
                sub5.setText(rs1.getString("subjec5"));
            }
             ResultSet rs2=c.s.executeQuery("select * from marks where rollno ='"+rollno+"' ");
             while(rs2.next()){
                 sub1.setText(sub1.getText()+"------------------"+rs2.getString("marks1"));
                 sub2.setText(sub2.getText()+"------------------"+rs2.getString("marks2"));
                 sub3.setText(sub3.getText()+"------------------"+rs2.getString("marks3"));
                 sub4.setText(sub4.getText()+"------------------"+rs2.getString("marks4"));
                 sub5.setText(sub5.getText()+"------------------"+rs2.getString("marks5"));
                 lblsemester.setText("Semester"+rs2.getString("semester"));
             }
        }catch(Exception e){
            e.printStackTrace();
        }
        
         
        
        
        
        cancle=new JButton("Cancle");
        cancle.setBounds(440, 500, 120, 30);
        cancle.setBackground(new Color(12,89,96));
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Tahoma",Font.BOLD,18));
        cancle.addActionListener(this);
        add(cancle);
        
        
        
        getContentPane().setBackground(new Color(7,94,84));
        setSize(500,600);
        setLocation(300,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args){
        new Marks("");
    }
}


