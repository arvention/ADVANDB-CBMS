package mvc;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final View view = new View();
	private JPanel contentPane;
	private JLabel labelCBMS;
	private JTable tableResults;
	private JScrollPane scrollPaneQuery;
	private JTextArea textAreaQuery;
	private JScrollPane scrollPaneResult;
	private JLabel labelRunningTime;
	private JButton buttonExecuteQuery;

	
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
		setBounds(100, 100, 500, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{361, 122, 0};
		gbl_contentPane.rowHeights = new int[]{45, 117, 179, 15, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		labelCBMS = new JLabel("Community-Based Monitoring System");
		labelCBMS.setHorizontalAlignment(SwingConstants.CENTER);
		labelCBMS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_labelCBMS = new GridBagConstraints();
		gbc_labelCBMS.gridwidth = 2;
		gbc_labelCBMS.fill = GridBagConstraints.BOTH;
		gbc_labelCBMS.insets = new Insets(0, 0, 5, 0);
		gbc_labelCBMS.gridx = 0;
		gbc_labelCBMS.gridy = 0;
		contentPane.add(labelCBMS, gbc_labelCBMS);
		
		scrollPaneQuery = new JScrollPane();
		GridBagConstraints gbc_scrollPaneQuery = new GridBagConstraints();
		gbc_scrollPaneQuery.gridwidth = 2;
		gbc_scrollPaneQuery.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneQuery.insets = new Insets(0, 0, 5, 0);
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
		gbc_scrollPaneResult.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPaneResult.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneResult.gridx = 0;
		gbc_scrollPaneResult.gridy = 2;
		contentPane.add(scrollPaneResult, gbc_scrollPaneResult);
		
		setTableResults(new JTable(){
			private static final long serialVersionUID = 1L;
			@Override
		    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				Component component = super.prepareRenderer(renderer, row, column);
				int rendererWidth = component.getPreferredSize().width;
				TableColumn tableColumn = getColumnModel().getColumn(column);
				tableColumn.setPreferredWidth(Math.max(rendererWidth + getIntercellSpacing().width, tableColumn.getPreferredWidth()));
				return component;
			}
		});
		getTableResults().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPaneResult.setViewportView(getTableResults());
		
		setLabelRunningTime(new JLabel("Running time:"));
		getLabelRunningTime().setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_labelRunningTime = new GridBagConstraints();
		gbc_labelRunningTime.anchor = GridBagConstraints.WEST;
		gbc_labelRunningTime.insets = new Insets(0, 0, 0, 5);
		gbc_labelRunningTime.gridx = 0;
		gbc_labelRunningTime.gridy = 3;
		contentPane.add(getLabelRunningTime(), gbc_labelRunningTime);
		
		setButtonExecuteQuery(new JButton("Execute Query"));
		GridBagConstraints gbc_buttonExecuteQuery = new GridBagConstraints();
		gbc_buttonExecuteQuery.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonExecuteQuery.anchor = GridBagConstraints.EAST;
		gbc_buttonExecuteQuery.gridx = 1;
		gbc_buttonExecuteQuery.gridy = 3;
		contentPane.add(getButtonExecuteQuery(), gbc_buttonExecuteQuery);
		
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

	public JLabel getLabelRunningTime() {
		return labelRunningTime;
	}

	public void setLabelRunningTime(JLabel lblRunningTime) {
		this.labelRunningTime = lblRunningTime;
	}

	public JButton getButtonExecuteQuery() {
		return buttonExecuteQuery;
	}

	public void setButtonExecuteQuery(JButton btnExecuteQuery) {
		this.buttonExecuteQuery = btnExecuteQuery;
	}
	
}
