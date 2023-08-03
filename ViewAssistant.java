package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


public class ViewAssistant extends JFrame implements ActionListener{
	JTable table;
	JButton btnBack;
	DefaultTableModel model;
	
	public ViewAssistant() {
		
	        getContentPane().setLayout(null);
	        
	        table = new JTable();
	        table.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        
	        Object [] columns = {"ID","Name","Password","Gmail","Contact No."};
	        DefaultTableModel model = new DefaultTableModel();
	        model.setColumnIdentifiers(columns);
	        table.setModel(model);
	        
	        JScrollPane pane = new JScrollPane(table);
	        pane.setBounds(10, 29, 686, 368);
	        
	        table.setBounds(39, 10, 638, 380);
	        getContentPane().add(pane);
	        
	        btnBack = new JButton("back");
	        btnBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
	        btnBack.setBounds(524, 415, 153, 42);
	        getContentPane().add(btnBack);
	        btnBack.addActionListener(this);
	        
	        Object rowData[] = new Object[5];
			for (int i =0; i< Assistant.assistantList.size(); i++) {
				rowData[0]= Assistant.assistantList.get(i).getId();
				rowData[1]= Assistant.assistantList.get(i).getName();
				rowData[2]= Assistant.assistantList.get(i).getPass();
				rowData[3]= Assistant.assistantList.get(i).getEmail();
				rowData[4]= Assistant.assistantList.get(i).getContact();
				
				model.addRow(rowData);
			}

	        setVisible(true);
	        setBounds(390, 180, 725, 515);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnBack) {
			dispose();
			AdminSection ad = new AdminSection();
			ad.setVisible(true);
		}
	}
}
