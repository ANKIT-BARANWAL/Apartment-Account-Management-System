package com.javatpoint.feereport;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class DueFee extends JFrame {
	static DueFee frame;
	public DueFee() {
		//Code to view data in JTable
		List<Customer> list=CustomerDao.due();
		int size=list.size();
		
		String data[][]=new String[size][13];
		int row=0;
		for(Customer s:list){
			data[row][0]=String.valueOf(s.getid());
			data[row][1]=s.getName();
			data[row][2]=s.getpassword();
			data[row][3]=s.getEmail();
			data[row][4]=s.getage();
			data[row][5]=String.valueOf(s.getrent());
			data[row][6]=String.valueOf(s.getPaid());
			data[row][7]=String.valueOf(s.getDue());
			data[row][8]=s.getAddress();
			data[row][9]=s.getgender();
			data[row][10]=s.getState();
			data[row][11]=s.getflatno();
			data[row][12]=s.getContactno();
			
			row++;
		}
		String columnNames[]={"id","Name","Password","Email","Age","Rent","Paid","Due","Address","Gender","State","FlatNo","Contact No"};
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		sp.getViewport().setBackground(Color.orange);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new DueFee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
