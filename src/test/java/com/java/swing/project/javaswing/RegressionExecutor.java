package com.java.swing.project.javaswing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RegressionExecutor {
	
	JFrame frame;
	JComboBox cb;
	JLabel l1;
	public RegressionExecutor() {
		l1 = new JLabel("Registration Form in Windows Form:");  
        l1.setForeground(Color.blue);  
        l1.setFont(new Font("Serif", Font.BOLD, 20)); 
		frame = new JFrame("Regression executor for WizNG application");		
		String[] modName= {"Demographic","CRA","Peer","Import","Create Area"};
		String[] envName= {"Redsox","Patriots","Vikings","Bruins","Revolution"};				
		ComboBox(frame,envName,50,120,"Environment Name");
		ComboBox(frame,modName,50,180,"Module Name");
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
		
	}
	
	public void ComboBox(JFrame f,String[] modules,int x,int y,String lb){
		final JLabel lbl = new JLabel(lb);
	    lbl.setBounds(x, y-60, 80, 20);  
	    lbl.setSize(400, 100);
		cb = new JComboBox(modules);
		cb.setBounds(x,y,120,20);    
		f.add(cb); 
		f.add(lbl);
	}
	public static void main(String[] args) {
		new RegressionExecutor();

	}

}
