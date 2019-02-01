package com.lyadev.Android_sqlite_db_create;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
public class Hello extends JFrame {

	private static final long serialVersionUID = 7967660398436301959L;
	private JPanel contentPane;
	private JTextField txtPath;;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Hello() {
	
		super("Hello");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,555, 103);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtPath = new JTextField();
		txtPath.setEnabled(false);
		txtPath.setText("path");
		txtPath.setColumns(10);
		
		JTextPane txtpnImportSqliteDb = new JTextPane();
		txtpnImportSqliteDb.setEditable(false);
		txtpnImportSqliteDb.setText("Import or create SQLite DB");
		
		JButton btnImport = new JButton("Import");
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener((ActionListener) new OpenL());
		JButton btnCreate = new JButton("Create");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtpnImportSqliteDb, GroupLayout.PREFERRED_SIZE, 437, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtPath, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnBrowse)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCreate)
							.addGap(6)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImport)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtpnImportSqliteDb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBrowse)
						.addComponent(btnCreate)
						.addComponent(btnImport))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	  public class OpenL implements ActionListener {
		    public void actionPerformed(ActionEvent e) {
		      JFileChooser c = new JFileChooser();
		      // Demonstrate "Open" dialog:
		      int rVal = c.showOpenDialog(Hello.this);
		      if (rVal == JFileChooser.APPROVE_OPTION) {
		        //txtPath.setText(c.getSelectedFile().getName());
		        txtPath.setText(c.getCurrentDirectory().toString() + '/' + c.getSelectedFile().getName());
		      }
		      if (rVal == JFileChooser.CANCEL_OPTION) {
		        //filename.setText("You pressed cancel");
		        txtPath.setText("");
		      }
		    }
		  }
}
