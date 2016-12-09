package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JList;

public class General_Interface {

	private JFrame frame;
	private JTabbedPane tabbedPane;
	private JPanel tab3;
	private JPanel tab2;
	private JPanel tab1;
	private JLabel lblPlateNumber;
	private JLabel lblDni;
	private JTextField txtPlateNumber;
	private JTextField txtDni;
	private JButton btnChOwner;
	private JToggleButton tglbtnNewToggleButton;
	private JLabel lblDni_1;
	private JTextField txtDni_1;
	private JButton btnFind;
	private JList list;
	private JLabel lblSelectedSanction;
	private JTextField txtSanction;
	private JButton btnPay;
	private JLabel lbEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					General_Interface window = new General_Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public General_Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.NORTH);
		
		tab1 = new JPanel();
		tabbedPane.addTab("Radar", null, tab1, null);
		
		tglbtnNewToggleButton = new JToggleButton("OFF");
		tglbtnNewToggleButton.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton.setForeground(Color.RED);
		tglbtnNewToggleButton.setFont(new Font("Dialog", Font.BOLD, 19));
		tglbtnNewToggleButton.addActionListener(new btnInsertInquiryInto());
		GroupLayout gl_tab1 = new GroupLayout(tab1);
		gl_tab1.setHorizontalGroup(
			gl_tab1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tab1.createSequentialGroup()
					.addGap(139)
					.addComponent(tglbtnNewToggleButton, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(141, Short.MAX_VALUE))
		);
		gl_tab1.setVerticalGroup(
			gl_tab1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tab1.createSequentialGroup()
					.addGap(67)
					.addComponent(tglbtnNewToggleButton, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(82, Short.MAX_VALUE))
		);
		tab1.setLayout(gl_tab1);
		
		tab2 = new JPanel();
		tabbedPane.addTab("Payment", null, tab2, null);
		
		lblDni_1 = new JLabel("DNI:");
		
		txtDni_1 = new JTextField();
		txtDni_1.setColumns(10);
		
		btnFind = new JButton("FIND");
		
		list = new JList();
		
		lblSelectedSanction = new JLabel("Selected sanction:");
		
		txtSanction = new JTextField();
		txtSanction.setColumns(10);
		
		btnPay = new JButton("PAY");
		
		lbEstado = new JLabel("");
		GroupLayout gl_tab2 = new GroupLayout(tab2);
		gl_tab2.setHorizontalGroup(
			gl_tab2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tab2.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_tab2.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_tab2.createSequentialGroup()
							.addComponent(lblDni_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDni_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(list, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(gl_tab2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tab2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_tab2.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
								.addComponent(lbEstado)
								.addGap(183))
							.addGroup(gl_tab2.createSequentialGroup()
								.addGap(18)
								.addComponent(btnFind)
								.addGap(52)))
						.addGroup(gl_tab2.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_tab2.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblSelectedSanction, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtSanction, Alignment.TRAILING))
							.addGap(19)
							.addComponent(btnPay)
							.addContainerGap())))
		);
		gl_tab2.setVerticalGroup(
			gl_tab2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tab2.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_tab2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDni_1)
						.addComponent(txtDni_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFind))
					.addGroup(gl_tab2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tab2.createSequentialGroup()
							.addGap(18)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tab2.createSequentialGroup()
							.addGap(55)
							.addComponent(lblSelectedSanction)
							.addGap(11)
							.addGroup(gl_tab2.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtSanction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPay))
							.addGap(68)
							.addComponent(lbEstado)))
					.addGap(61))
		);
		tab2.setLayout(gl_tab2);
		
		tab3 = new JPanel();
		tabbedPane.addTab("Management", null, tab3, null);
		
		lblPlateNumber = new JLabel("Plate number:");
		
		lblDni = new JLabel("DNI:");
		
		txtPlateNumber = new JTextField();
		txtPlateNumber.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		
		btnChOwner = new JButton("Change owner");
		btnChOwner.addActionListener(new btnChangeVehicleOwner());
		GroupLayout gl_tab3 = new GroupLayout(tab3);
		gl_tab3.setHorizontalGroup(
			gl_tab3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_tab3.createSequentialGroup()
					.addContainerGap(90, Short.MAX_VALUE)
					.addGroup(gl_tab3.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblDni)
						.addComponent(lblPlateNumber))
					.addGap(24)
					.addGroup(gl_tab3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnChOwner, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
						.addComponent(txtPlateNumber, Alignment.TRAILING)
						.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
					.addGap(89))
		);
		gl_tab3.setVerticalGroup(
			gl_tab3.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_tab3.createSequentialGroup()
					.addGap(64)
					.addGroup(gl_tab3.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPlateNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPlateNumber))
					.addGap(18)
					.addGroup(gl_tab3.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDni))
					.addGap(18)
					.addComponent(btnChOwner, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(100, Short.MAX_VALUE))
		);
		tab3.setLayout(gl_tab3);
	}
	private class btnChangeVehicleOwner implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class btnInsertInquiryInto implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected) {
				tglbtnNewToggleButton.setText("ON");
				
			} else {
				tglbtnNewToggleButton.setText("OFF");
			}
		}
	}
}