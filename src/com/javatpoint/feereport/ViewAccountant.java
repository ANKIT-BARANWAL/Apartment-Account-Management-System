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

public class ViewAccountant extends JFrame {
	static ViewAccountant frame;
	public ViewAccountant() {
		//Code to view data in JTable
		List<Accountant> list=AccountantDao.view();
		int size=list.size();
		
		String data[][]=new String[size][8];
		int row=0;
		for(Accountant a:list){
			data[row][0]=String.valueOf(a.getId());
			data[row][1]=a.getName();
			data[row][2]=a.getPassword();
			data[row][3]=a.getEmail();
			data[row][4]=a.getaddress();
			data[row][5]=a.getgender();
			data[row][6]=a.getqualification();
			data[row][7]=a.getContactno();
			row++;
		}
		String columnNames[]={"Id","Name","Password","Email","Address","Gender","Qualification","ContactNo"};
		
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
					frame = new ViewAccountant();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
