package org.aikopo;

import java.awt.EventQueue;

 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
 
public class GUIMain2 extends JFrame {
	private DBController DBC;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {           // 이 부분에 추가하여 실행시 자동으로 DB연동
				try {
					GUIMain2 frame = new GUIMain2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the frame.
	 */
	public GUIMain2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
 
		setContentPane(contentPane);
		JButton btnNewButton = new JButton("클릭");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DBC = new DBController();
				DBC.startConnection();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel);
		contentPane.add(btnNewButton);
		btnNewButton_1 = new JButton("추가");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String sql = "INSERT INTO book VALUES(99, '자바자바', '강자바', 4000)";
				DBC.ExetQry(sql);
			}
		});
		contentPane.add(btnNewButton_1);
	}
 
}
