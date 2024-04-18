package org.aikopo;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class GUITest1 extends JFrame{
	public GUITest1 () {
		
		setTitle("여기가 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,300);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		GUITest1 frame= new GUITest1();
	}
	
}
