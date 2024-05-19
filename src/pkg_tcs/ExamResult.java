package pkg_tcs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class ExamResult extends JFrame implements ActionListener{
    JTextField search;
    JButton result,cancle;
    JTable table;
    ExamResult(){
        setLayout(null);
        
        JPanel c1=new JPanel();
	c1.setBounds(0,0,1550,70);
	c1.setBackground(new Color(7,94,84));
	c1.setLayout(null);
	add(c1);
        
        JLabel heading=new JLabel("Check Your Result");
        heading.setBounds(600, 5, 500, 50);
        heading.setFont(new Font("Tahoma",Font.BOLD,22));
        heading.setForeground(Color.BLACK);
        c1.add(heading);
        
        JLabel head=new JLabel("Please Enter Your RollNo.:");
        head.setBounds(0, 70, 300, 50);
        head.setFont(new Font("Tahoma",Font.BOLD,20));
        head.setForeground(Color.BLACK);
        add(head);
        
        search=new JTextField();
        search.setBounds(280, 75, 250, 30);
        search.setFont(new Font("Raleway",Font.BOLD,18));
        add(search);
        
        result=new JButton("Result");
        result.setBounds(200, 120, 120, 25);
        result.setBackground(new Color(12,89,96));
        result.setForeground(Color.WHITE);
        result.addActionListener(this);
        result.setFont(new Font("Tahoma",Font.BOLD,18));
        add(result);
        
        cancle=new JButton("Cancle");
        cancle.setBounds(340, 120, 120, 25);
        cancle.setBackground(new Color(12,89,96));
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Tahoma",Font.BOLD,18));
        cancle.addActionListener(this);
        add(cancle);
        
        table=new JTable();
        table.setFont(new Font("Raleway",Font.PLAIN,20));
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0, 150, 1550, 600);
        add(jsp);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }
        table.addMouseListener(new MouseAdapter(){
            
            public void mouseClicked(MouseEvent me){
                int row=table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row, 2).toString());
            }
            
            
        });
        
        
    getContentPane().setBackground(new Color(46,132,121));
    setSize(1000,475);
    setLocation(300,100);
    setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==result){
            new Marks(search.getText());
            setVisible(false);
        }else{
            setVisible(false);
        }
    }
    public static void main (String[] args){
        new ExamResult();
    }
}

