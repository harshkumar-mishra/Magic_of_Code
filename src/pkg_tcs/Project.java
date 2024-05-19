package pkg_tcs;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/kjh.jpeg"));
	Image i2=i1.getImage().getScaledInstance(1500,750, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
        //image.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        add(image);
        JMenuBar jb= new JMenuBar();
        // new Information
        JMenu newInformation=new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        jb.add(newInformation);
        
        JMenuItem facultyInfo= new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo= new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        //details
        
        JMenu details=new JMenu(" View Details");
        details.setForeground(Color.RED);
        jb.add(details);
        
        JMenuItem facultyDetails= new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.WHITE);
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);
        
        JMenuItem studentDetails= new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.WHITE);
        studentDetails.addActionListener(this);
        details.add(studentDetails);
        
        //Apply Leave
        
        JMenu leave=new JMenu(" Apply Leave");
        leave.setForeground(Color.BLUE);
        jb.add(leave);
        
        JMenuItem facultyleave= new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave= new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        
        JMenu leavedetails=new JMenu(" Leave Deatils");
        leavedetails.setForeground(Color.RED);
        jb.add(leavedetails);
        
        JMenuItem facultyleavedetails= new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leavedetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails= new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        leavedetails.add(studentleavedetails);
        
        //exam
        JMenu exam=new JMenu(" Examination");
        exam.setForeground(Color.BLUE);
        jb.add(exam);
        
        JMenuItem examinationdetails= new JMenuItem("Examiantion Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks= new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        //updateinfo
         JMenu updateInfo=new JMenu("Update Info");
        updateInfo.setForeground(Color.RED);
        jb.add(updateInfo);
        
        JMenuItem updateFacultydetails= new JMenuItem("Update Faculty Details");
        updateFacultydetails.setBackground(Color.WHITE);
        updateFacultydetails.addActionListener(this);
        updateInfo.add(updateFacultydetails);
        
        JMenuItem updateStudentInfo= new JMenuItem("Update Student Details");
        updateStudentInfo.setBackground(Color.WHITE);
        updateStudentInfo.addActionListener(this);
        updateInfo.add(updateStudentInfo);
        
        //fee
        JMenu fee=new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        jb.add(fee);
        
        JMenuItem feeStructure= new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.WHITE);
        feeStructure.addActionListener(this);
        fee.add(feeStructure);
        
        JMenuItem feeForm= new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.WHITE);
        feeForm.addActionListener(this);
        fee.add(feeForm);
        
        //utility
        JMenu utility=new JMenu("Utility");
        utility.setForeground(Color.RED);
        jb.add(utility);
        
        JMenuItem notepad= new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem cal= new JMenuItem("Calculator");
        cal.setBackground(Color.WHITE);
        cal.addActionListener(this);
        utility.add(cal);
        
        //give Acces to another Teacher
        
        JMenu login=new JMenu("Login");
        login.setForeground(Color.BLUE);
        jb.add(login);
        
        
        JMenuItem abc= new JMenuItem("Login");
        abc.setBackground(Color.WHITE);
        abc.addActionListener(this);
        login.add(abc);
        
        
        
        //about
        JMenu about=new JMenu("About");
        about.setForeground(Color.RED);
        jb.add(about);
        
        
        JMenuItem ab= new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        //exit
        
        JMenu exit=new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        jb.add(exit);
        
        JMenuItem ex= new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
       
        
        
        
        setJMenuBar(jb);
        
        
        setSize(1540,850);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String msg= ae.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("Calc.exe");
            }catch(Exception e){
                
            }
           }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                
            
           }
        }else if(msg.equals("New Faculty Information")){
            new AddTeacher();
        }else if(msg.equals("New Student Information")){
            new AddStudent();
        }
        else if(msg.equals("View Faculty Details")){
            new TeacherDetails();
        }else if(msg.equals("View Student Details")){
            new StudentDetails();
        }else if(msg.equals("Faculty Leave")){
            new TeacherLeave();
        }else if(msg.equals("Student Leave")){
            new StudentLeave();
        }else if(msg.equals("Faculty Leave Details")){
            new TeacherLeaveDetails();
        }else if(msg.equals("Student Leave Details")){
            new StudentLeaveDetails();
        }else if(msg.equals("Update Faculty Details")){
            new UpdateTeacher();
        }else if(msg.equals("Update Student Details")){
            new UpdateStudent();
        }else if(msg.equals("Enter Marks")){
            new ExamMarks();
        }else if(msg.equals("Examiantion Results")){
            new ExamResult();
        }else if(msg.equals("Fee Structure")){
            new FeeStructure();
        }else if(msg.equals("About")){
            new About();
        }else if(msg.equals("Student Fee Form")){
            new FeeFormStudent();
        }else if(msg.equals("Login")){
            new EmpLogin();
            setVisible(false);
        }
}
    public static void main(String[] args){
        new Project();
    }
}


