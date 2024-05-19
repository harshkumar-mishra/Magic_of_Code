package pkg_tcs;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
public class StudentLeaveDetails extends JFrame implements ActionListener{
    Choice crollno;
    JTable table;
    JButton search,print,cancel;
    StudentLeaveDetails(){
        setLayout(null);
        JLabel heading=new JLabel("Search by Roll No.:-");
        heading.setBounds(20, 10, 250, 30);
        heading.setFont(new Font("Raleway",Font.BOLD,22));
        add(heading);
        
        crollno=new Choice();
        crollno.setBounds(280,20,200,30);
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
        table= new JTable();
        try{
           Conn c=new Conn();
           ResultSet rs=c.s.executeQuery("select * from studentleave");
           table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (Exception e){
            e.printStackTrace();
        }
        
        
        JScrollPane jsp= new JScrollPane(table);
        jsp.setBounds(0, 100, 1550, 600);
        add(jsp);
        
        search=new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);
        add(search);
        
        print=new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);
        
      
        
        cancel=new JButton("Cancel");
        cancel.setBounds(220, 70, 80, 20);
        cancel.addActionListener(this);
        add(cancel);
        
        JLabel info=new JLabel("Thank You for Using This Application");
        info.setBounds(900,750,700,30);
        info.setFont(new Font("Edwardian Script ITC",Font.BOLD,28));
        add(info);
        
        
        
        
        
        getContentPane().setBackground(new Color(46,132,121));
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== search){
            String query = "select * from studentleave where rollno = '"+crollno.getSelectedItem()+"'";
            try{
                Conn c= new Conn();
                ResultSet rs=c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==print){
            try{
               table.print();
            }catch(Exception e){
                e.printStackTrace();
            }
       
        }else {
           setVisible(false); 
        }
    }
    public static void main(String[] args){
        new StudentLeaveDetails();
    }
}


