package mvc;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final View view = new View();
	private JPanel contentPane;
	private JLabel labelCBMS;
	private JTable tableResults;
	private JScrollPane scrollPaneQuery;
	private JTextArea textAreaQuery;
	private JScrollPane scrollPaneResult;
	private JLabel lblRunningTime;

	
	private View() {
		setResizable(false);
		initializeComponents();
	}

	public static View getInstance(){
		return view;
	}
	
	private void initializeComponents(){
		// frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{268, 217, 0};
		gbl_contentPane.rowHeights = new int[]{45, 117, 179, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		labelCBMS = new JLabel("Community-Based Monitoring System");
		labelCBMS.setHorizontalAlignment(SwingConstants.CENTER);
		labelCBMS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_labelCBMS = new GridBagConstraints();
		gbc_labelCBMS.gridwidth = 2;
		gbc_labelCBMS.fill = GridBagConstraints.BOTH;
		gbc_labelCBMS.insets = new Insets(0, 0, 5, 5);
		gbc_labelCBMS.gridx = 0;
		gbc_labelCBMS.gridy = 0;
		contentPane.add(labelCBMS, gbc_labelCBMS);
		
		scrollPaneQuery = new JScrollPane();
		GridBagConstraints gbc_scrollPaneQuery = new GridBagConstraints();
		gbc_scrollPaneQuery.gridwidth = 2;
		gbc_scrollPaneQuery.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneQuery.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneQuery.gridx = 0;
		gbc_scrollPaneQuery.gridy = 1;
		contentPane.add(scrollPaneQuery, gbc_scrollPaneQuery);
		
		setTextAreaQuery(new JTextArea());
		getTextAreaQuery().setLineWrap(true);
		scrollPaneQuery.setViewportView(getTextAreaQuery());
		getTextAreaQuery().setWrapStyleWord(true);
		getTextAreaQuery().setText("Enter Query Here");
		
		scrollPaneResult = new JScrollPane();
		GridBagConstraints gbc_scrollPaneResult = new GridBagConstraints();
		gbc_scrollPaneResult.gridwidth = 2;
		gbc_scrollPaneResult.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneResult.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneResult.gridx = 0;
		gbc_scrollPaneResult.gridy = 2;
		contentPane.add(scrollPaneResult, gbc_scrollPaneResult);
		
		setTableResults(new JTable());
		scrollPaneResult.setViewportView(getTableResults());
		
		setLblRunningTime(new JLabel("Running Time"));
		getLblRunningTime().setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblRunningTime = new GridBagConstraints();
		gbc_lblRunningTime.anchor = GridBagConstraints.WEST;
		gbc_lblRunningTime.insets = new Insets(0, 0, 0, 5);
		gbc_lblRunningTime.gridx = 1;
		gbc_lblRunningTime.gridy = 3;
		contentPane.add(getLblRunningTime(), gbc_lblRunningTime);
		
	}

	public JTextArea getTextAreaQuery() {
		return textAreaQuery;
	}

	public void setTextAreaQuery(JTextArea textAreaQuery) {
		this.textAreaQuery = textAreaQuery;
	}

	public JTable getTableResults() {
		return tableResults;
	}

	public void setTableResults(JTable tableResults) {
		this.tableResults = tableResults;
	}

	public JLabel getLblRunningTime() {
		return lblRunningTime;
	}

	public void setLblRunningTime(JLabel lblRunningTime) {
		this.lblRunningTime = lblRunningTime;
	}
	
}
