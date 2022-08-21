package packa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Student1 {
	public void PHD() {
		JFrame frame = new JFrame("Data Entry Student");
		JLabel lb = new JLabel("Students Data Entry");
		lb.setFont(new Font("Verdana",Font.PLAIN,30));
		
		lb.setBounds(130,10, 400, 30);
		frame.add(lb);
		JSeparator sep = new JSeparator();
		sep.setBounds(0, 50, 550, 650);
		sep.setBackground(Color.BLACK);
		frame.add(sep);
		JSeparator sep1 = new JSeparator();
		sep1.setBounds(0, 80, 550, 650);
		sep1.setBackground(Color.BLACK);
		frame.add(sep1);
		JSeparator sep2 = new JSeparator();
		sep2.setBounds(0, 85, 550, 650);
		sep2.setBackground(Color.BLACK);
		frame.add(sep2);
		JSeparator sep3 = new JSeparator();
		sep3.setBounds(0, 549, 550, 650);
		sep3.setBackground(Color.BLACK);
		frame.add(sep3);
		
		
		
		JButton b1,b2,b3,b4;
		b1 = new JButton("UG");
		b1.setBounds(0, 50, 100, 30);
		frame.add(b1);
		b2 = new JButton("PHD");
		b2.setBounds(100, 50, 100, 30);
		frame.add(b2);
		b3 = new JButton("Master");
		b3.setBounds(200, 50, 100, 30);
		frame.add(b3);
		b4 = new JButton("Sientist");
		b4.setBounds(300, 50, 100, 30);
		frame.add(b4);
		
		
		
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		l1 = new JLabel("Name:");
		l1.setBounds(10,100, 100, 30);
		l1.setFont(new Font("Verdana",Font.PLAIN,18));
		l2 = new JLabel("RollNo:");
		l2.setBounds(10,150, 100, 30);
		l2.setFont(new Font("Verdana",Font.PLAIN,18));
		l3 = new JLabel("Course:");
		l3.setBounds(10,200, 100, 30);
		l3.setFont(new Font("Verdana",Font.PLAIN,18));
		l4 = new JLabel("Department:");
		l4.setBounds(10,250, 300, 30);
		l4.setFont(new Font("Verdana",Font.PLAIN,18));
		l5 = new JLabel("Branch:");
		l5.setBounds(10,300, 100, 30);
		l5.setFont(new Font("Verdana",Font.PLAIN,18));
		l6 = new JLabel("College:");
		l6.setBounds(10,350, 100, 30);
		l6.setFont(new Font("Verdana",Font.PLAIN,18));
		l7 = new JLabel("Topic:");
		l7.setBounds(10,400, 100, 30);
		l7.setFont(new Font("Verdana",Font.PLAIN,18));
		l8 = new JLabel("Supervisior:");
		l8.setBounds(10,450, 300, 30);
		l8.setFont(new Font("Verdana",Font.PLAIN,18));
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(l8);
		
		
		JTextField t1 ,t2,t3,t4,t5,t6,t7,t8;
		t1 = new JTextField();
		t1.setBounds(150,100, 350, 30);
		t2 = new JTextField();
		t2.setBounds(150,150, 350, 30);
		t3 = new JTextField();
		t3.setBounds(150,200, 350, 30);
		t4 = new JTextField();
		t4.setBounds(150,250, 350, 30);
		t5 = new JTextField();
		t5.setBounds(150,300, 350, 30);
		t6 = new JTextField();
		t6.setBounds(150,350, 350, 30);
		t7 = new JTextField();
		t7.setBounds(150,400, 350, 30);
		t8 = new JTextField();
		t8.setBounds(150,450, 350, 30);
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(t5);
		frame.add(t6);
		frame.add(t7);
		frame.add(t8);
		
		JButton btn1 = new JButton("Continue");
		btn1.setBounds(10,550, 100, 30);
		JButton btn2 = new JButton("Reset");
		btn2.setBounds(400,550, 100, 30);
		
		frame.add(btn1);
		frame.add(btn2);
		
		b2.setBackground(Color.white);
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 PHD();
				frame.dispose();
			}
			});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 PHD();
				frame.dispose();
			}
			});
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Student st = new Student();
				st.UG();
				frame.dispose();
			}
			});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PHD();
				frame.dispose();
			}
			});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Student2 st2 = new Student2();
				 st2.Master();
				frame.dispose();
			}
			});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Student3 st3 = new Student3();
				 st3.Scientist();
				frame.dispose();
			}
			});
		
		
		
		
		frame.setResizable(false);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.white);
		frame.setSize(550,650);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
