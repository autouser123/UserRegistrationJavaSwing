package com.java.swing.project.javaswing;
import javax.swing.*;

import com.java.swing.project.h2DB.H2DataBase;

import java.awt.*;  
import java.awt.event.*;  
import java.sql.*;  
public class RegistrationForm extends JFrame implements ActionListener   
{  
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;  
    JTextField txt1, txt2, txt5, txt6, txt7;  
    JButton btn1, btn2;  
    JPasswordField txtPwd1, txtPwd2;  
    RegistrationForm()  
    {      
        l1 = new JLabel("Registration Form in Windows Form:");  
        l1.setForeground(Color.blue);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        l2 = new JLabel("Name:");  
        l3 = new JLabel("Email-ID:");  
        l4 = new JLabel("Create Passowrd:");  
        l5 = new JLabel("Confirm Password:");  
        l6 = new JLabel("Country:");  
        l7 = new JLabel("State:");  
        l8 = new JLabel("Phone No:");   
        txt1 = new JTextField();  
        txt2 = new JTextField();  
        txtPwd1 = new JPasswordField();  
        txtPwd2 = new JPasswordField();  
        txt5 = new JTextField();  
        txt6 = new JTextField();  
        txt7 = new JTextField();  
        btn1 = new JButton("Submit");  
        btn2 = new JButton("Clear");  
        btn1.addActionListener(this);  
        btn2.addActionListener(this);  
        l1.setBounds(100, 30, 400, 30);  
        l2.setBounds(80, 70, 200, 30);  
        l3.setBounds(80, 110, 200, 30);  
        l4.setBounds(80, 150, 200, 30);  
        l5.setBounds(80, 190, 200, 30);  
        l6.setBounds(80, 230, 200, 30);  
        l7.setBounds(80, 270, 200, 30);  
        l8.setBounds(80, 310, 200, 30);  
        txt1.setBounds(300, 70, 200, 30);  
        txt2.setBounds(300, 110, 200, 30);  
        txtPwd1.setBounds(300, 150, 200, 30);  
        txtPwd2.setBounds(300, 190, 200, 30);  
        txt5.setBounds(300, 230, 200, 30);  
        txt6.setBounds(300, 270, 200, 30);  
        txt7.setBounds(300, 310, 200, 30);  
        btn1.setBounds(50, 350, 100, 30);  
        btn2.setBounds(170, 350, 100, 30);  
        add(l1);  
        add(l2);  
        add(txt1);  
        add(l3);  
        add(txt2);  
        add(l4);  
        add(txtPwd1);  
        add(l5);  
        add(txtPwd2);  
        add(l6);  
        add(txt5);  
        add(l7);  
        add(txt6);  
        add(l8);  
        add(txt7);  
        add(btn1);  
        add(btn2);  
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        //setTitle("Registration Form in Java");
    }  
    public void actionPerformed(ActionEvent e)   
    {  
        if (e.getSource() == btn1)  
         {  
            //int x = 0;  
            String s1 = txt1.getText();  
            String s2 = txt2.getText();  
            char[] s3 = txtPwd1.getPassword();  
            char[] s4 = txtPwd2.getPassword();   
            String s8 = new String(s3);  
            String s9 = new String(s4);  
            String s5 = txt5.getText();  
            String s6 = txt6.getText();  
            String s7 = txt7.getText();
            if(s1.isEmpty() && s2.isEmpty() && s8.isEmpty() && s9.isEmpty() && s5.isEmpty() && s6.isEmpty() && s7.isEmpty()) {
            	JOptionPane.showMessageDialog(btn1, "Fields are empty");
            }else if(s1.isEmpty()) {
            	JOptionPane.showMessageDialog(btn1, "Name is empty");
            }else if(s2.isEmpty()) {
            	JOptionPane.showMessageDialog(btn1, "Email id is empty");
            }else if(s8.isEmpty()) {
            	JOptionPane.showMessageDialog(btn1, "Create password is empty");
            }else if(s9.isEmpty()) {
            	JOptionPane.showMessageDialog(btn1, "Confirm password is empty");
            }else if(s5.isEmpty()) {
            	JOptionPane.showMessageDialog(btn1, "County is empty");
            }else if(s6.isEmpty()) {
            	JOptionPane.showMessageDialog(btn1, "State is empty");
            }else if(s7.isEmpty()) {
            	JOptionPane.showMessageDialog(btn1, "Phone No. is empty");
            }else if(s7.length()!=10){
                JOptionPane.showMessageDialog(btn1, "Enter a valid mobile number of 10 digit");
            }else {            
           
            	if (s8.equals(s9)){                	
                    try  
                    {  
                        //Class.forName("oracle.jdbc.driver.OracleDriver");  
                    	H2DataBase db = new H2DataBase();            	
                    	int x =db.insertRecord(s1, s2, s8, s5, s6, s7);         
                        if (x > 0)   
                        {  
                            JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");  
                        }  
                    }  
                    catch (Exception ex)   
                    {  
                        System.out.println(ex);  
                    }  
                }else  
                {  
                    JOptionPane.showMessageDialog(btn1, "Password Does Not Match");  
                }
            }            
               
          }   
          else  
          {  
            txt1.setText("");  
            txt2.setText("");  
            txtPwd1.setText("");  
            txtPwd2.setText("");  
            txt5.setText("");  
            txt6.setText("");  
            txt7.setText("");  
          }
            
    }   
    public static void main(String args[])  
    {  
        new RegistrationForm();  
    }  
}  