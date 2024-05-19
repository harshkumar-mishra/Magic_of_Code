package pkg_tcs;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class FeeStructure extends JFrame{
    FeeStructure(){
        setLayout(null);
        JPanel c1=new JPanel();
	c1.setBounds(0,0,1550,100);
	c1.setBackground(new Color(14,100,118));
	c1.setLayout(null);
	add(c1);
        JLabel heading=new JLabel("Fee Structure");
        heading.setBounds(650, 10, 400, 30);
        heading.setFont(new Font("Tahoma",Font.BOLD,24));
        heading.setForeground(Color.WHITE);
        c1.add(heading);
        
        
        JTable table=new JTable();
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0, 100, 1550, 600);
        add(jsp);
        
        
        
        
        
        getContentPane().setBackground(new Color(7,94,74));
        setSize(1000,700);
        setLocation(300,100);
        setVisible(true);
                
        
    }
    public static void main(String[] args){
        new FeeStructure();
    }
}


