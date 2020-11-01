package com.java.swing.project.javaswing;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ComboBox {
	JFrame f;
	public ComboBox() {
		f= new JFrame("Select Module");
		String[] modules= {"Demographic","CRA","Peer","Import","Create Area"};
		JComboBox cb = new JComboBox(modules);
		cb.setBounds(50, 50, 120, 30);
		f.add(cb);        
		f.setLayout(null);    
		f.setSize(400,500);    
		f.setVisible(true);   
	}
	public static void main(String[] args) {
		new ComboBox();

	}

}

public class ComboBoxExample {
	JFrame f;
	ComboBoxExample(){
		f = new JFrame("ComboBox example");
		final JLabel l = new JLabel();
	    l.setHorizontalAlignment(JLabel.CENTER);  
		l.setSize(400, 100);
		JButton btn = new JButton("Show");
		btn.setBounds(200,100,75,20);
		String[] modules= {"Demographic","CRA","Peer","Import","Create Area"};
		final JComboBox cb = new JComboBox(modules);
		cb.setBounds(50, 100,120,20);    
		f.add(cb); f.add(l); f.add(btn);    
		f.setLayout(null);    
		f.setSize(350,350);    
		f.setVisible(true);
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String data = "Module selected: "+ cb.getItemAt(cb.getSelectedIndex());
				l.setText(data);
				
			}
		});
	}
	public static void main(String[] args) {
		new ComboBoxExample();
	}
}
