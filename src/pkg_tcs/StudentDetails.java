package pkg_tcs;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
public class StudentDetails extends JFrame implements ActionListener{
    Choice crollno;
    JTable table;
    JButton search,print,update,add,cancel;
    StudentDetails(){
        setLayout(null);
        JPanel c2=new JPanel();
	c2.setBounds(0,0,1550,100);
	c2.setBackground(new Color(14,100,118));
	c2.setLayout(null);
	add(c2);
        JLabel heading=new JLabel("Search By Roll No:-");
        heading.setBounds(20, 20, 200, 30);
        heading.setFont(new Font("Raleway",Font.BOLD,18));
        c2.add(heading);
        
        crollno=new Choice();
        crollno.setBounds(230,20,150,30);
        c2.add(crollno);
        
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
           ResultSet rs=c.s.executeQuery("select * from student");
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
       c2.add(search);
        
        print=new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
       c2. add(print);
        
        update=new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        c2.add(update);
        
        add=new JButton("Add");
        add.setBounds(320, 70, 80, 20);
        update.addActionListener(this);
        c2.add(add);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(420, 70, 80, 20);
        cancel.addActionListener(this);
        c2.add(cancel);
        
        
        
        
        
        getContentPane().setBackground(new Color(7,94,74));
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== search){
            String query = "select * from student where rollno = '"+crollno.getSelectedItem()+"'";
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
        }else if(ae.getSource()== update){
          setVisible(false);
           new UpdateStudent();
        }else if(ae.getSource()==add){
            setVisible(false);
            new AddStudent();
        }else {
           setVisible(false); 
        }
    }
    public static void main(String[] args){
        new StudentDetails();
    }
}


