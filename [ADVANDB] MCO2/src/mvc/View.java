package mvc;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import java.awt.Insets;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final View view = new View();
	
	private JPanel contentPane;
	private InteractivePanel interactivePanel;
	private JTable table;

	private View() {
		setResizable(true);
		setTitle("AGRISYS - Agricultural Geo Resource Inference System");
		
		interactivePanel = new InteractivePanel();
		
		initializeComponents();
	}

	public static View getInstance(){
		return view;
	}
	
	private void initializeComponents(){
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		} 
		// frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1100, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {700, 400, 0};
		gbl_contentPane.rowHeights = new int[]{580, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 0;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		GridBagConstraints gbc_interactivePanel = new GridBagConstraints();
		gbc_interactivePanel.insets = new Insets(0, 0, 0, 5);
		gbc_interactivePanel.fill = GridBagConstraints.BOTH;
		gbc_interactivePanel.gridx = 0;
		gbc_interactivePanel.gridy = 0;
		contentPane.add(this.interactivePanel, gbc_interactivePanel);
	}

	public InteractivePanel getInteractivePanel() {
		return interactivePanel;
	}

	public JTable getTable() {
		return table;
	}

}
