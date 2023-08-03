package Project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewStudent extends JFrame implements ActionListener {
	JTable table;
	JButton btnBack;
	DefaultTableModel model;
	
	public ViewStudent() {
		getContentPane().setLayout(null);
        
        table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        Object [] columns = {"RollNo","Name","Faculty","Course","ID", "Level", "Class", "Lab Time"};
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
        
        Object rowData[] = new Object[8];
		for (int i =0; i< Student.studentList.size(); i++) {
			rowData[0]= Student.studentList.get(i).getRollNo();
			rowData[1]= Student.studentList.get(i).getName();
			rowData[2]= Student.studentList.get(i).getFaculty();
			rowData[3]= Student.studentList.get(i).getCourse();
			rowData[4]= Student.studentList.get(i).getId();
			rowData[5]= Student.studentList.get(i).getLevel();
			rowData[6]= Student.studentList.get(i).getsClass();
			rowData[7]= Student.studentList.get(i).getLabTime();
			model.addRow(rowData);
		}

        setVisible(true);
        setBounds(390, 180, 725, 515);

	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnBack) {
			dispose();
			AssistantSection ad = new AssistantSection();
			ad.setVisible(true);
		}
	}
	
}
