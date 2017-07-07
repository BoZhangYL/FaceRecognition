package ui;

import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DisplayData extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public DisplayData() {
		setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u573A\u666F", "\u7B97\u6CD5", "\u56FE\u7247\u603B\u6570", null, null, null, null, null, null, null},
				{"1", "facepp", null, null, null, null, null, null, null, null},
				{"1", "dlib", null, null, null, null, null, null, null, null},
				{"1", "sensetime", null, null, null, null, null, null, null, null},
				{"", null, null, null, null, null, null, null, null, null},
				{"", null, null, null, null, null, null, null, null, null},
				{"", null, null, null, null, null, null, null, null, null},
				{"", null, null, null, null, null, null, null, null, null},
				{"", null, null, null, null, null, null, null, null, null},
				{"", null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(56, 30, 342, 220);
		add(table);
		
		


	}
}
