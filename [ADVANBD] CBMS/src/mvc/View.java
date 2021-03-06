package mvc;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final View view = new View();
	private JPanel panel_main;
	private JLabel label;
	private JLabel labelCMBS;
	private JPanel contentPane;
	private JButton buttonQuery1;
	private JButton buttonQuery2;
	private JButton buttonQuery3;
	private JButton buttonQuery4;
	private JButton buttonQuery5;
	private JButton buttonQuery6;
	private JButton buttonQuery7;
	private JPanel panel_query1;
	private JButton buttonQuery1Back;
	private JLabel labelQuery1;
	private JComboBox<String> comboBoxQuery1Municipality;
	private JLabel labelQuery1Municipality;
	private JComboBox<String> comboBoxQuery1Zone;
	private JLabel labelQuery1Zone;
	private JComboBox<String> comboBoxQuery1Barangay;
	private JLabel labelQuery1Barangay;
	private JComboBox<String> comboBoxQuery1Purok;
	private JLabel labelQuery1Purok;
	private JComboBox<String> comboBoxQuery1HouseType;
	private JLabel labelQuery1HouseType;
	private JLabel labelQuery1CalamityExperiences;
	private JComboBox<String> comboBoxQuery1Bagyo;
	private JLabel labelQuery1Bagyo;
	private JSpinner spinnerQuery1BagyoFrequencyLower;
	private JSpinner spinnerQuery1BagyoFrequencyUpper;
	private JLabel labelQuery1BagyoFrequency;
	private JComboBox<String> comboBoxQuery1BagyoAid;
	private JLabel labelQuery1BagyoAid;
	private JComboBox<String> comboBoxQuery1Baha;
	private JLabel labelQuery1Baha;
	private JSpinner spinnerQuery1BahaFrequencyLower;
	private JSpinner spinnerQuery1BahaFrequencyUpper;
	private JLabel labelQuery1BahaFrequency;
	private JComboBox<String> comboBoxQuery1BahaAid;
	private JLabel labelQuery1BahaAid;
	private JComboBox<String> comboBoxQuery1Tagtuyot;
	private JLabel labelQuery1Tagtuyot;
	private JSpinner spinnerQuery1TagtuyotFrequencyLower;
	private JSpinner spinnerQuery1TagtuyotFrequencyUpper;
	private JLabel labelQuery1TagtuyotFrequency;
	private JComboBox<String> comboBoxQuery1TagtuyotAid;
	private JLabel labelQuery1TagtuyotAid;
	private JComboBox<String> comboBoxQuery1Lindol;
	private JLabel labelQuery1Lindol;
	private JSpinner spinnerQuery1LindolFrequencyLower;
	private JSpinner spinnerQuery1LindolFrequencyUpper;
	private JLabel labelQuery1LindolFrequency;
	private JComboBox<String> comboBoxQuery1LindolAid;
	private JLabel labelQuery1LindolAid;
	private JComboBox<String> comboBoxQuery1Sunog;
	private JLabel labelQuery1Sunog;
	private JSpinner spinnerQuery1SunogFrequencyLower;
	private JSpinner spinnerQuery1SunogFrequencyUpper;
	private JLabel labelQuery1SunogFrequency;
	private JLabel labelQuery1SunogAid;
	private JButton buttonQuery1Query;
	private JComboBox<String> comboBoxQuery1SunogAid;
	private JScrollPane scrollPaneQuery1ResultTable;
	private JTable tableQuery1ResultTable;
	private JLabel labelQuery1Status;
	private JPanel panel_query2;
	private JButton buttonQuery2Back;
	private JLabel labelQuery2;
	private JLabel labelQuery2Municipality;
	private JComboBox<String> comboBoxQuery2Municipality;
	private JLabel labelQuery2Zone;
	private JComboBox<String> comboBoxQuery2Zone;
	private JLabel labelQuery2Barangay;
	private JComboBox<String> comboBoxQuery2Barangay;
	private JLabel labelQuery2Purok;
	private JComboBox<String> comboBoxQuery2Purok;
	private JLabel lableQuery2GovernmentServices;
	private JLabel labelQuery2SLP;
	private JComboBox<String> comboBoxQuery2SLP;
	private JLabel labelQuery2SLPNum;
	private JLabel labelQuery2FFSP;
	private JComboBox<String> comboBoxQuery2FFSP;
	private JLabel labelQuery2FFSPNum;
	private JLabel labelQuery2FFWP;
	private JComboBox<String> comboBoxQuery2FFWP;
	private JLabel labelQuery2FFWPNum;
	private JLabel labelQuery2CFWP;
	private JComboBox<String> comboBoxQuery2CFWP;
	private JLabel labelQuery2CFWPNum;
	private JLabel labelQuery2SPISC;
	private JComboBox<String> comboBoxQuery2SPISC;
	private JLabel labelQuery2SPISCNum;
	private JButton buttonQuery2Query;
	private JLabel labelQuery2Status;
	private JComboBox<String> comboBoxQuery2CCT;
	private JLabel labelQuery2CCT;
	private JComboBox<String> comboBoxQuery2ARCDP;
	private JLabel labelQuery2ARCDP;
	private JComboBox<String> comboBoxQuery2CBEP;
	private JLabel labelQuery2CBEP;
	private JComboBox<String> comboBoxQuery2PHOFW;
	private JComboBox<String> comboBoxQuery2PHE;
	private JComboBox<String> comboBoxQuery2PHIP;
	private JLabel labelQuery2PHOFW;
	private JLabel labelQuery2PHE;
	private JLabel labelQuery2PHIP;
	private JComboBox<String> comboBoxQuery2PHS;
	private JLabel labelQuery2PHS;
	private JComboBox<String> comboBoxQuery2PHL;
	private JLabel labelQuery2PHL;
	private JLabel labelQuery2CCTNum;
	private JLabel labelQuery2ARCDPNum;
	private JLabel labelQuery2CBEPNum;
	private JLabel labelQuery2PHOFWNum;
	private JLabel labelQuery2PHENum;
	private JLabel labelQuery2PHIPNum;
	private JLabel labelQuery2PHSNum;
	private JLabel labellabelQuery2PHLNum;
	private JSpinner spinnerQuery2SLPNumLower;
	private JSpinner spinnerQuery2SLPNumUpper;
	private JSpinner spinnerQuery2FFSPNumLower;
	private JSpinner spinnerQuery2FFSPNumUpper;
	private JSpinner spinnerQuery2FFWPNumLower;
	private JSpinner spinnerQuery2FFWPNumUpper;
	private JSpinner spinnerQuery2CFWPNumLower;
	private JSpinner spinnerQuery2CFWPNumUpper;
	private JSpinner spinnerQuery2SPISCNumLower;
	private JSpinner spinnerQuery2SPISCNumUpper;
	private JSpinner spinnerQuery2CCTNumLower;
	private JSpinner spinnerQuery2CCTNumUpper;
	private JSpinner spinnerQuery2ARCDPNumLower;
	private JSpinner spinnerQuery2ARCDPNumUpper;
	private JSpinner spinnerQuery2CBEPNumLower;
	private JSpinner spinnerQuery2CBEPNumUpper;
	private JSpinner spinnerQuery2PHOFWNumLower;
	private JSpinner spinnerQuery2PHOFWNumUpper;
	private JSpinner spinnerQuery2PHENumLower;
	private JSpinner spinnerQuery2PHENumUpper;
	private JSpinner spinnerQuery2PHIPNumLower;
	private JSpinner spinnerQuery2PHIPNumUpper;
	private JSpinner spinnerQuery2PHSNumLower;
	private JSpinner spinnerQuery2PHSNumUpper;
	private JSpinner spinnerQuery2PHLNumLower;
	private JSpinner spinnerQuery2PHLNumUpper;
	private JTable tableQuery2ResultTable;
	private JScrollPane scrollPaneQuery2ResultTable;
	private JSpinner spinnerQuery2OtherProgramsLower;
	private JSpinner spinnerQuery2OtherProgramsUpper;
	private JLabel labelQuery2OtherPrograms;
	private JComboBox<String> comboBoxQuery1Bulkan;
	private JComboBox<String> comboBoxQuery1Landslide;
	private JComboBox<String> comboBoxQuery1Tsunami;
	private JComboBox<String> comboBoxQuery1ForestFire;
	private JComboBox<String> comboBoxQuery1Digmaan;
	private JComboBox<String> comboBoxQuery1BulkanAid;
	private JComboBox<String> comboBoxQuery1LandslideAid;
	private JComboBox<String> comboBoxQuery1TsunamiAid;
	private JComboBox<String> comboBoxQuery1ForestFireAid;
	private JComboBox<String> comboBoxQuery1DigmaanAid;
	private JLabel labelQuery1Bulkan;
	private JLabel labelQuery1Landslide;
	private JLabel labelQuery1Tsunami;
	private JLabel labelQuery1ForestFire;
	private JLabel labelQuery1Digmaan;
	private JSpinner spinnerQuery1BulkanFrequencyLower;
	private JSpinner spinnerQuery1BulkanFrequencyUpper;
	private JSpinner spinnerQuery1LandslideFrequencyLower;
	private JSpinner spinnerQuery1LandslideFrequencyUpper;
	private JSpinner spinnerQuery1TsunamiFrequencyLower;
	private JSpinner spinnerQuery1TsunamiFrequencyUpper;
	private JSpinner spinnerQuery1ForestFireFrequencyUpper;
	private JSpinner spinnerQuery1DigmaanFrequencyLower;
	private JSpinner spinnerQuery1DigmaanFrequencyUpper;
	private JLabel labelQuery1BulkanFrequency;
	private JLabel labelQuery1LandslideFrequency;
	private JLabel labelQuery1TsunamiFrequency;
	private JLabel labelQuery1ForestFireFrequency;
	private JLabel labelQuery1DigmaanFrequency;
	private JLabel labelQuery1BulkanAid;
	private JLabel labelQuery1LandslideAid;
	private JLabel labelQuery1TsunamiAid;
	private JLabel labelQuery1ForestFireAid;
	private JLabel labelQuery1DigmaanAid;
	private JSpinner spinnerQuery1ForestFireFrequencyLower;
	private JPanel panel_query3;
	private JButton buttonQuery3Back;
	private JLabel labelQuery3;
	private JLabel labelQuery3Municipality;
	private JComboBox<String> comboBoxQuery3Municipality;
	private JLabel labelQuery3Zone;
	private JComboBox<String> comboBoxQuery3Zone;
	private JLabel labelQuery3Barangay;
	private JComboBox<String> comboBoxQuery3Barangay;
	private JLabel labelQuery3Purok;
	private JComboBox<String> comboBoxQuery3Purok;
	private JLabel labelQuery3CropType;
	private JComboBox<String> comboBoxQuery3CropType;
	private JButton buttonQuery3Query;
	private JLabel labelQuery3Status;
	private JTable tableQuery3ResultTable;
	private JScrollPane scrollPaneQuery3ResultTable;
	private JCheckBox checkBoxQuery3Municipality;
	private JCheckBox checkBoxQuery3Purok;
	private JCheckBox checkBoxQuery3Zone;
	private JCheckBox checkBoxQuery3CropType;
	private JCheckBox checkBoxQuery3Barangay;
	private JPanel panel_query4;
	private JButton buttonQuery4Back;
	private JLabel labelQuery4;
	private JCheckBox checkBoxQuery4Municipality;
	private JLabel labelQuery4Municipality;
	private JComboBox<String> comboBoxQuery4Municipality;
	private JCheckBox checkBoxQuery4Zone;
	private JLabel labelQuery4Zone;
	private JComboBox<String> comboBoxQuery4Zone;
	private JCheckBox checkBoxQuery4Barangay;
	private JLabel labelQuery4Barangay;
	private JComboBox<String> comboBoxQuery4Barangay;
	private JCheckBox checkBoxQuery4Purok;
	private JLabel labelQuery4Purok;
	private JComboBox<String> comboBoxQuery4Purok;
	private JCheckBox checkBoxQuery4Pagkamatay;
	private JLabel labelQuery4Pagkamatay;
	private JComboBox<String> comboBoxQuery4Pagkamatay;
	private JButton buttonQuery4Query;
	private JLabel labelQuery4Status;
	private JTable tableQuery4ResultTable;
	private JScrollPane scrollPaneQuery4ResultTable;
	private JPanel panel_query5;
	private JButton buttonQuery5Back;
	private JLabel labelQuery5;
	private JCheckBox checkBoxQuery5Municipality;
	private JLabel labelQuery5Municipality;
	private JComboBox<String> comboBoxQuery5Municipality;
	private JCheckBox checkBoxQuery5Zone;
	private JLabel labelQuery5Zone;
	private JComboBox<String> comboBoxQuery5Zone;
	private JCheckBox checkBoxQuery5Barangay;
	private JLabel labelQuery5Barangay;
	private JComboBox<String> comboBoxQuery5Barangay;
	private JCheckBox checkBoxQuery5Purok;
	private JLabel labelQuery5Purok;
	private JComboBox<String> comboBoxQuery5Purok;
	private JCheckBox checkBoxQuery5Kagamitan;
	private JLabel labelQuery5Kagamitan;
	private JComboBox<String> comboBoxQuery5Kagamitan;
	private JButton buttonQuery5Query;
	private JLabel labelQuery5Status;
	private JTable tableQuery5ResultTable;
	private JScrollPane scrollPaneQuery5ResultTable;
	private JPanel panel_query6;
	private JButton buttonQuery6Back;
	private JLabel labelQuery6;
	private JCheckBox checkBoxQuery6Municipality;
	private JLabel labelQuery6Municipality;
	private JComboBox<String> comboBoxQuery6Municipality;
	private JCheckBox checkBoxQuery6Zone;
	private JLabel labelQuery6Zone;
	private JComboBox<String> comboBoxQuery6Zone;
	private JCheckBox checkBoxQuery6Barangay;
	private JLabel labelQuery6Barangay;
	private JComboBox<String> comboBoxQuery6Barangay;
	private JCheckBox checkBoxQuery6Purok;
	private JLabel labelQuery6Purok;
	private JComboBox<String> comboBoxQuery6Purok;
	private JButton buttonQuery6Query;
	private JLabel labelQuery6Status;
	private JTable tableQuery6ResultTable;
	private JScrollPane scrollPaneQuery6ResultTable;
	private JPanel panel_query7;
	private JButton buttonQuery7Back;
	private JLabel labelQuery7;
	private JCheckBox checkBoxQuery7Municipality;
	private JLabel labelQuery7Municipality;
	private JComboBox<String> comboBoxQuery7Municipality;
	private JCheckBox checkBoxQuery7Zone;
	private JLabel labelQuery7Zone;
	private JComboBox<String> comboBoxQuery7Zone;
	private JCheckBox checkBoxQuery7Barangay;
	private JLabel labelQuery7Barangay;
	private JComboBox<String> comboBoxQuery7Barangay;
	private JCheckBox checkBoxQuery7Purok;
	private JLabel labelQuery7Purok;
	private JComboBox<String> comboBoxQuery7Purok;
	private JCheckBox checkBoxQuery7CropType;
	private JLabel labelQuery7CropType;
	private JComboBox<String> comboBoxQuery7CropType;
	private JLabel labelQuery7Status;
	private JLabel labelQuery7AgriculturalRecord;
	private JLabel labelQuery7BeastOfBurden;
	private JComboBox<String> comboBoxQuery7BeastOfBurden;
	private JComboBox<String> comboBoxQuery7Plow;
	private JComboBox<String> comboBoxQuery7Harrow;
	private JLabel labelQuery7Plow;
	private JLabel labelQuery7Harrow;
	private JComboBox<String> comboBoxQuery7Mower;
	private JComboBox<String> comboBoxQuery7Thresher;
	private JComboBox<String> comboBoxQuery7InsecticideSprayer;
	private JLabel labelQuery7Mower;
	private JLabel labelQuery7Thresher;
	private JLabel labelQuery7InsecticideSprayer;
	private JComboBox<String> comboBoxQuery7FarmTractor;
	private JComboBox<String> comboBoxQuery7HandTractor;
	private JComboBox<String> comboBoxQuery7Mudboat;
	private JComboBox<String> comboBoxQuery7PlanterDryer;
	private JComboBox<String> comboBoxQuery7MechanicalDryer;
	private JComboBox<String> comboBoxQuery7DryingPavement;
	private JComboBox<String> comboBoxQuery7FeedMill;
	private JComboBox<String> comboBoxQuery7Harvester;
	private JComboBox<String> comboBoxQuery7WarehouseGranary;
	private JComboBox<String> comboBoxQuery7Farmshed;
	private JComboBox<String> comboBoxQuery7IrrigationPump;
	private JComboBox<String> comboBoxQuery7Others;
	private JLabel labelQuery7FarmTractor;
	private JLabel labelQuery7HandTractor;
	private JLabel labelQuery7Mudboat;
	private JLabel labelQuery7PlanterDryer;
	private JLabel labelQuery7MechanicalDryer;
	private JLabel labelQuery7DryingPavement;
	private JLabel labelQuery7FeedMill;
	private JLabel labelQuery7Harvester;
	private JLabel labelQuery7WarehouseGranary;
	private JLabel labelQuery7Farmshed;
	private JLabel labelQuery7IrrigationPump;
	private JLabel labelQuery7Others;
	private JLabel labelQuery7Age;
	private JSpinner spinnerQuery7AgeLower;
	private JSpinner spinnerQuery7AgeUpper;
	private JLabel labelQuery7YearFarming;
	private JSpinner spinnerQuery7YearFarmingLower;
	private JSpinner spinnerQuery7YearFarmingUpper;
	private JComboBox<String> comboBoxQuery7ARCDP;
	private JLabel labelQuery7ARCDP;
	private JLabel labelQuery7Dahilan;
	private JComboBox<String> comboBoxQuery7Dahilan;
	private JComboBox<String> comboBoxQuery7CropInsurance;
	private JComboBox<String> comboBoxQuery7EquipmentInsurance;
	private JLabel labelQuery7CropInsurance;
	private JLabel labelQuery7EquipmentInsurance;
	private JTable tableQuery7ResultTable;
	private JScrollPane scrollPaneQuery7ResultTable;
	private JButton buttonQuery7Query;
	
	private View() {
		setTitle("Community-Based Monitoring System");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/img/cbms_logo.png")));
		
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
		setBounds(100, 100, 600, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel_main = new JPanel();
		contentPane.add(panel_main, "panel_main");
		GridBagLayout gbl_panel_main = new GridBagLayout();
		gbl_panel_main.columnWidths = new int[]{50, 124, 125, 125, 125, 50, 0};
		gbl_panel_main.rowHeights = new int[]{205, 35, 85, 85, 85, 85, 0};
		gbl_panel_main.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_main.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_main.setLayout(gbl_panel_main);
		
		label = new JLabel("");
		ImageIcon imageIcon = new ImageIcon(View.class.getResource("/img/cbms_logo.png")); 
		Image image = imageIcon.getImage(); 
		Image newimg = image.getScaledInstance(160, 160,  java.awt.Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(newimg));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 2;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 0;
		panel_main.add(label, gbc_label);
		
		labelCMBS = new JLabel("Community-Based Monitoring System");
		labelCMBS.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_labelCMBS = new GridBagConstraints();
		gbc_labelCMBS.gridwidth = 4;
		gbc_labelCMBS.insets = new Insets(0, 0, 5, 5);
		gbc_labelCMBS.gridx = 1;
		gbc_labelCMBS.gridy = 1;
		panel_main.add(labelCMBS, gbc_labelCMBS);
		
		buttonQuery1 = new JButton("Calamity Report");
		getButtonQuery1().setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery1 = new GridBagConstraints();
		gbc_buttonQuery1.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery1.gridwidth = 2;
		gbc_buttonQuery1.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery1.gridx = 1;
		gbc_buttonQuery1.gridy = 2;
		panel_main.add(getButtonQuery1(), gbc_buttonQuery1);
		
		buttonQuery2 = new JButton("Government Services Report");
		buttonQuery2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery2 = new GridBagConstraints();
		gbc_buttonQuery2.gridwidth = 2;
		gbc_buttonQuery2.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery2.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery2.gridx = 3;
		gbc_buttonQuery2.gridy = 2;
		panel_main.add(buttonQuery2, gbc_buttonQuery2);
		
		buttonQuery3 = new JButton("Crop Area Report");
		buttonQuery3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery3 = new GridBagConstraints();
		gbc_buttonQuery3.gridwidth = 2;
		gbc_buttonQuery3.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery3.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery3.gridx = 1;
		gbc_buttonQuery3.gridy = 3;
		panel_main.add(buttonQuery3, gbc_buttonQuery3);
		
		buttonQuery4 = new JButton("Death Area Report");
		buttonQuery4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery4 = new GridBagConstraints();
		gbc_buttonQuery4.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery4.gridwidth = 2;
		gbc_buttonQuery4.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery4.gridx = 3;
		gbc_buttonQuery4.gridy = 3;
		panel_main.add(buttonQuery4, gbc_buttonQuery4);
		
		buttonQuery5 = new JButton("Fishing Equipment Area Report");
		buttonQuery5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery5 = new GridBagConstraints();
		gbc_buttonQuery5.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery5.gridwidth = 2;
		gbc_buttonQuery5.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery5.gridx = 1;
		gbc_buttonQuery5.gridy = 4;
		panel_main.add(buttonQuery5, gbc_buttonQuery5);
		
		buttonQuery6 = new JButton("Fishery and Crop Income Area Report");
		buttonQuery6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery6 = new GridBagConstraints();
		gbc_buttonQuery6.gridwidth = 2;
		gbc_buttonQuery6.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery6.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery6.gridx = 3;
		gbc_buttonQuery6.gridy = 4;
		panel_main.add(buttonQuery6, gbc_buttonQuery6);
		
		buttonQuery7 = new JButton("Agricultural Status Area Report");
		buttonQuery7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery7 = new GridBagConstraints();
		gbc_buttonQuery7.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery7.gridwidth = 4;
		gbc_buttonQuery7.insets = new Insets(0, 0, 0, 5);
		gbc_buttonQuery7.gridx = 1;
		gbc_buttonQuery7.gridy = 5;
		panel_main.add(buttonQuery7, gbc_buttonQuery7);
		
		panel_query1 = new JPanel();
		contentPane.add(getPanel_query1(), "panel_query1");
		GridBagLayout gbl_panel_query1 = new GridBagLayout();
		gbl_panel_query1.columnWidths = new int[]{70, 148, 60, 45, 45, 48, 98, 0};
		gbl_panel_query1.rowHeights = new int[]{50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 245, 185, 0};
		gbl_panel_query1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_query1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		getPanel_query1().setLayout(gbl_panel_query1);
		
		buttonQuery1Back = new JButton("<<");
		getButtonQuery1Back().setFont(new Font("SansSerif", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery1Back = new GridBagConstraints();
		gbc_buttonQuery1Back.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonQuery1Back.anchor = GridBagConstraints.WEST;
		gbc_buttonQuery1Back.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery1Back.gridx = 0;
		gbc_buttonQuery1Back.gridy = 0;
		getPanel_query1().add(getButtonQuery1Back(), gbc_buttonQuery1Back);
		
		labelQuery1 = new JLabel("Calamity Report");
		labelQuery1.setFont(new Font("SansSerif", Font.BOLD, 20));
		GridBagConstraints gbc_labelQuery1 = new GridBagConstraints();
		gbc_labelQuery1.anchor = GridBagConstraints.WEST;
		gbc_labelQuery1.fill = GridBagConstraints.VERTICAL;
		gbc_labelQuery1.gridwidth = 6;
		gbc_labelQuery1.insets = new Insets(0, 0, 5, 0);
		gbc_labelQuery1.gridx = 1;
		gbc_labelQuery1.gridy = 0;
		getPanel_query1().add(labelQuery1, gbc_labelQuery1);
		
		labelQuery1Municipality = new JLabel("Municipality");
		GridBagConstraints gbc_labelQuery1Municipality = new GridBagConstraints();
		gbc_labelQuery1Municipality.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Municipality.gridx = 0;
		gbc_labelQuery1Municipality.gridy = 1;
		getPanel_query1().add(labelQuery1Municipality, gbc_labelQuery1Municipality);
		
		comboBoxQuery1Municipality = new JComboBox<String>();
		comboBoxQuery1Municipality.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6"}));
		GridBagConstraints gbc_comboBoxQuery1Municipality = new GridBagConstraints();
		gbc_comboBoxQuery1Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Municipality.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Municipality.gridx = 1;
		gbc_comboBoxQuery1Municipality.gridy = 1;
		getPanel_query1().add(comboBoxQuery1Municipality, gbc_comboBoxQuery1Municipality);
		
		labelQuery1Zone = new JLabel("Zone");
		GridBagConstraints gbc_labelQuery1Zone = new GridBagConstraints();
		gbc_labelQuery1Zone.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Zone.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Zone.gridx = 2;
		gbc_labelQuery1Zone.gridy = 1;
		getPanel_query1().add(labelQuery1Zone, gbc_labelQuery1Zone);
		
		comboBoxQuery1Zone = new JComboBox<String>();
		comboBoxQuery1Zone.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "9", "13", "18", "19", "99"}));
		GridBagConstraints gbc_comboBoxQuery1Zone = new GridBagConstraints();
		gbc_comboBoxQuery1Zone.gridwidth = 2;
		gbc_comboBoxQuery1Zone.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Zone.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Zone.gridx = 3;
		gbc_comboBoxQuery1Zone.gridy = 1;
		getPanel_query1().add(comboBoxQuery1Zone, gbc_comboBoxQuery1Zone);
		
		labelQuery1Barangay = new JLabel("Barangay");
		GridBagConstraints gbc_labelQuery1Barangay = new GridBagConstraints();
		gbc_labelQuery1Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Barangay.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Barangay.gridx = 5;
		gbc_labelQuery1Barangay.gridy = 1;
		getPanel_query1().add(labelQuery1Barangay, gbc_labelQuery1Barangay);
		
		comboBoxQuery1Barangay = new JComboBox<String>();
		comboBoxQuery1Barangay.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61"}));
		GridBagConstraints gbc_comboBoxQuery1Barangay = new GridBagConstraints();
		gbc_comboBoxQuery1Barangay.fill = GridBagConstraints.BOTH;
		gbc_comboBoxQuery1Barangay.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery1Barangay.gridx = 6;
		gbc_comboBoxQuery1Barangay.gridy = 1;
		getPanel_query1().add(comboBoxQuery1Barangay, gbc_comboBoxQuery1Barangay);
		
		labelQuery1Purok = new JLabel("Purok");
		GridBagConstraints gbc_labelQuery1Purok = new GridBagConstraints();
		gbc_labelQuery1Purok.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Purok.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Purok.gridx = 0;
		gbc_labelQuery1Purok.gridy = 2;
		getPanel_query1().add(labelQuery1Purok, gbc_labelQuery1Purok);
		
		comboBoxQuery1Purok = new JComboBox<String>();
		comboBoxQuery1Purok.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "26", "99"}));
		GridBagConstraints gbc_comboBoxQuery1Purok = new GridBagConstraints();
		gbc_comboBoxQuery1Purok.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Purok.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Purok.gridx = 1;
		gbc_comboBoxQuery1Purok.gridy = 2;
		getPanel_query1().add(comboBoxQuery1Purok, gbc_comboBoxQuery1Purok);
		
		labelQuery1HouseType = new JLabel("House Type");
		GridBagConstraints gbc_labelQuery1HouseType = new GridBagConstraints();
		gbc_labelQuery1HouseType.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1HouseType.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1HouseType.gridx = 2;
		gbc_labelQuery1HouseType.gridy = 2;
		getPanel_query1().add(labelQuery1HouseType, gbc_labelQuery1HouseType);
		
		comboBoxQuery1HouseType = new JComboBox<String>();
		comboBoxQuery1HouseType.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Single", "Duplex", "Multi-unit", "Commercial", "Others"}));
		GridBagConstraints gbc_comboBoxQuery1HouseType = new GridBagConstraints();
		gbc_comboBoxQuery1HouseType.gridwidth = 2;
		gbc_comboBoxQuery1HouseType.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1HouseType.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1HouseType.gridx = 3;
		gbc_comboBoxQuery1HouseType.gridy = 2;
		getPanel_query1().add(comboBoxQuery1HouseType, gbc_comboBoxQuery1HouseType);
		
		labelQuery1CalamityExperiences = new JLabel("Calamity Experiences:");
		labelQuery1CalamityExperiences.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_labelQuery1CalamityExperiences = new GridBagConstraints();
		gbc_labelQuery1CalamityExperiences.gridwidth = 7;
		gbc_labelQuery1CalamityExperiences.insets = new Insets(0, 0, 5, 0);
		gbc_labelQuery1CalamityExperiences.gridx = 0;
		gbc_labelQuery1CalamityExperiences.gridy = 3;
		getPanel_query1().add(labelQuery1CalamityExperiences, gbc_labelQuery1CalamityExperiences);
		
		labelQuery1Bagyo = new JLabel("Bagyo");
		GridBagConstraints gbc_labelQuery1Bagyo = new GridBagConstraints();
		gbc_labelQuery1Bagyo.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Bagyo.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Bagyo.gridx = 0;
		gbc_labelQuery1Bagyo.gridy = 4;
		getPanel_query1().add(labelQuery1Bagyo, gbc_labelQuery1Bagyo);
		
		comboBoxQuery1Bagyo = new JComboBox<String>();
		comboBoxQuery1Bagyo.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Naranasan", "Hindi Naranasan"}));
		GridBagConstraints gbc_comboBoxQuery1Bagyo = new GridBagConstraints();
		gbc_comboBoxQuery1Bagyo.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Bagyo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Bagyo.gridx = 1;
		gbc_comboBoxQuery1Bagyo.gridy = 4;
		getPanel_query1().add(comboBoxQuery1Bagyo, gbc_comboBoxQuery1Bagyo);
		
		labelQuery1BagyoFrequency = new JLabel("Frequency");
		GridBagConstraints gbc_labelQuery1BagyoFrequency = new GridBagConstraints();
		gbc_labelQuery1BagyoFrequency.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1BagyoFrequency.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1BagyoFrequency.gridx = 2;
		gbc_labelQuery1BagyoFrequency.gridy = 4;
		getPanel_query1().add(labelQuery1BagyoFrequency, gbc_labelQuery1BagyoFrequency);
		
		spinnerQuery1BagyoFrequencyLower = new JSpinner();
		spinnerQuery1BagyoFrequencyLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1BagyoFrequencyLower = new GridBagConstraints();
		gbc_spinnerQuery1BagyoFrequencyLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1BagyoFrequencyLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1BagyoFrequencyLower.gridx = 3;
		gbc_spinnerQuery1BagyoFrequencyLower.gridy = 4;
		panel_query1.add(spinnerQuery1BagyoFrequencyLower, gbc_spinnerQuery1BagyoFrequencyLower);
		
		spinnerQuery1BagyoFrequencyUpper = new JSpinner();
		spinnerQuery1BagyoFrequencyUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1BagyoFrequencyUpper = new GridBagConstraints();
		gbc_spinnerQuery1BagyoFrequencyUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1BagyoFrequencyUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1BagyoFrequencyUpper.gridx = 4;
		gbc_spinnerQuery1BagyoFrequencyUpper.gridy = 4;
		panel_query1.add(spinnerQuery1BagyoFrequencyUpper, gbc_spinnerQuery1BagyoFrequencyUpper);
		
		labelQuery1BagyoAid = new JLabel("Aid");
		GridBagConstraints gbc_labelQuery1BagyoAid = new GridBagConstraints();
		gbc_labelQuery1BagyoAid.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1BagyoAid.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1BagyoAid.gridx = 5;
		gbc_labelQuery1BagyoAid.gridy = 4;
		getPanel_query1().add(labelQuery1BagyoAid, gbc_labelQuery1BagyoAid);
		
		comboBoxQuery1BagyoAid = new JComboBox<String>();
		comboBoxQuery1BagyoAid.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery1BagyoAid = new GridBagConstraints();
		gbc_comboBoxQuery1BagyoAid.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1BagyoAid.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery1BagyoAid.gridx = 6;
		gbc_comboBoxQuery1BagyoAid.gridy = 4;
		getPanel_query1().add(comboBoxQuery1BagyoAid, gbc_comboBoxQuery1BagyoAid);
		
		labelQuery1Baha = new JLabel("Baha");
		GridBagConstraints gbc_labelQuery1Baha = new GridBagConstraints();
		gbc_labelQuery1Baha.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Baha.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Baha.gridx = 0;
		gbc_labelQuery1Baha.gridy = 5;
		getPanel_query1().add(labelQuery1Baha, gbc_labelQuery1Baha);
		
		comboBoxQuery1Baha = new JComboBox<String>();
		comboBoxQuery1Baha.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Naranasan", "Hindi Naranasan"}));
		GridBagConstraints gbc_comboBoxQuery1Baha = new GridBagConstraints();
		gbc_comboBoxQuery1Baha.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Baha.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Baha.gridx = 1;
		gbc_comboBoxQuery1Baha.gridy = 5;
		getPanel_query1().add(comboBoxQuery1Baha, gbc_comboBoxQuery1Baha);
		
		labelQuery1BahaFrequency = new JLabel("Frequency");
		GridBagConstraints gbc_labelQuery1BahaFrequency = new GridBagConstraints();
		gbc_labelQuery1BahaFrequency.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1BahaFrequency.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1BahaFrequency.gridx = 2;
		gbc_labelQuery1BahaFrequency.gridy = 5;
		getPanel_query1().add(labelQuery1BahaFrequency, gbc_labelQuery1BahaFrequency);
		
		spinnerQuery1BahaFrequencyLower = new JSpinner();
		spinnerQuery1BahaFrequencyLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1BahaFrequencyLower = new GridBagConstraints();
		gbc_spinnerQuery1BahaFrequencyLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1BahaFrequencyLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1BahaFrequencyLower.gridx = 3;
		gbc_spinnerQuery1BahaFrequencyLower.gridy = 5;
		panel_query1.add(spinnerQuery1BahaFrequencyLower, gbc_spinnerQuery1BahaFrequencyLower);
		
		spinnerQuery1BahaFrequencyUpper = new JSpinner();
		spinnerQuery1BahaFrequencyUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1BahaFrequencyUpper = new GridBagConstraints();
		gbc_spinnerQuery1BahaFrequencyUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1BahaFrequencyUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1BahaFrequencyUpper.gridx = 4;
		gbc_spinnerQuery1BahaFrequencyUpper.gridy = 5;
		panel_query1.add(spinnerQuery1BahaFrequencyUpper, gbc_spinnerQuery1BahaFrequencyUpper);
		
		labelQuery1BahaAid = new JLabel("Aid");
		GridBagConstraints gbc_labelQuery1BahaAid = new GridBagConstraints();
		gbc_labelQuery1BahaAid.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1BahaAid.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1BahaAid.gridx = 5;
		gbc_labelQuery1BahaAid.gridy = 5;
		getPanel_query1().add(labelQuery1BahaAid, gbc_labelQuery1BahaAid);
		
		comboBoxQuery1BahaAid = new JComboBox<String>();
		comboBoxQuery1BahaAid.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery1BahaAid = new GridBagConstraints();
		gbc_comboBoxQuery1BahaAid.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1BahaAid.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery1BahaAid.gridx = 6;
		gbc_comboBoxQuery1BahaAid.gridy = 5;
		getPanel_query1().add(comboBoxQuery1BahaAid, gbc_comboBoxQuery1BahaAid);
		
		labelQuery1Tagtuyot = new JLabel("Tagtuyot");
		GridBagConstraints gbc_labelQuery1Tagtuyot = new GridBagConstraints();
		gbc_labelQuery1Tagtuyot.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Tagtuyot.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Tagtuyot.gridx = 0;
		gbc_labelQuery1Tagtuyot.gridy = 6;
		getPanel_query1().add(labelQuery1Tagtuyot, gbc_labelQuery1Tagtuyot);
		
		comboBoxQuery1Tagtuyot = new JComboBox<String>();
		comboBoxQuery1Tagtuyot.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Naranasan", "Hindi Naranasan"}));
		GridBagConstraints gbc_comboBoxQuery1Tagtuyot = new GridBagConstraints();
		gbc_comboBoxQuery1Tagtuyot.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Tagtuyot.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Tagtuyot.gridx = 1;
		gbc_comboBoxQuery1Tagtuyot.gridy = 6;
		getPanel_query1().add(comboBoxQuery1Tagtuyot, gbc_comboBoxQuery1Tagtuyot);
		
		labelQuery1TagtuyotFrequency = new JLabel("Frequency");
		GridBagConstraints gbc_labelQuery1TagtuyotFrequency = new GridBagConstraints();
		gbc_labelQuery1TagtuyotFrequency.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1TagtuyotFrequency.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1TagtuyotFrequency.gridx = 2;
		gbc_labelQuery1TagtuyotFrequency.gridy = 6;
		getPanel_query1().add(labelQuery1TagtuyotFrequency, gbc_labelQuery1TagtuyotFrequency);
		
		spinnerQuery1TagtuyotFrequencyLower = new JSpinner();
		spinnerQuery1TagtuyotFrequencyLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1TagtuyotFrequencyLower = new GridBagConstraints();
		gbc_spinnerQuery1TagtuyotFrequencyLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1TagtuyotFrequencyLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1TagtuyotFrequencyLower.gridx = 3;
		gbc_spinnerQuery1TagtuyotFrequencyLower.gridy = 6;
		panel_query1.add(spinnerQuery1TagtuyotFrequencyLower, gbc_spinnerQuery1TagtuyotFrequencyLower);
		
		spinnerQuery1TagtuyotFrequencyUpper = new JSpinner();
		spinnerQuery1TagtuyotFrequencyUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1TagtuyotFrequencyUpper = new GridBagConstraints();
		gbc_spinnerQuery1TagtuyotFrequencyUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1TagtuyotFrequencyUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1TagtuyotFrequencyUpper.gridx = 4;
		gbc_spinnerQuery1TagtuyotFrequencyUpper.gridy = 6;
		panel_query1.add(spinnerQuery1TagtuyotFrequencyUpper, gbc_spinnerQuery1TagtuyotFrequencyUpper);
		
		labelQuery1TagtuyotAid = new JLabel("Aid");
		GridBagConstraints gbc_labelQuery1TagtuyotAid = new GridBagConstraints();
		gbc_labelQuery1TagtuyotAid.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1TagtuyotAid.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1TagtuyotAid.gridx = 5;
		gbc_labelQuery1TagtuyotAid.gridy = 6;
		getPanel_query1().add(labelQuery1TagtuyotAid, gbc_labelQuery1TagtuyotAid);
		
		comboBoxQuery1TagtuyotAid = new JComboBox<String>();
		comboBoxQuery1TagtuyotAid.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery1TagtuyotAid = new GridBagConstraints();
		gbc_comboBoxQuery1TagtuyotAid.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1TagtuyotAid.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery1TagtuyotAid.gridx = 6;
		gbc_comboBoxQuery1TagtuyotAid.gridy = 6;
		getPanel_query1().add(comboBoxQuery1TagtuyotAid, gbc_comboBoxQuery1TagtuyotAid);
		
		labelQuery1Lindol = new JLabel("Lindol");
		GridBagConstraints gbc_labelQuery1Lindol = new GridBagConstraints();
		gbc_labelQuery1Lindol.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Lindol.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Lindol.gridx = 0;
		gbc_labelQuery1Lindol.gridy = 7;
		panel_query1.add(labelQuery1Lindol, gbc_labelQuery1Lindol);
		
		comboBoxQuery1Lindol = new JComboBox<String>();
		comboBoxQuery1Lindol.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Naranasan", "Hindi Naranasan"}));
		GridBagConstraints gbc_comboBoxQuery1Lindol = new GridBagConstraints();
		gbc_comboBoxQuery1Lindol.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Lindol.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Lindol.gridx = 1;
		gbc_comboBoxQuery1Lindol.gridy = 7;
		panel_query1.add(comboBoxQuery1Lindol, gbc_comboBoxQuery1Lindol);
		
		labelQuery1LindolFrequency = new JLabel("Frequency");
		GridBagConstraints gbc_labelQuery1LindolFrequency = new GridBagConstraints();
		gbc_labelQuery1LindolFrequency.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1LindolFrequency.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1LindolFrequency.gridx = 2;
		gbc_labelQuery1LindolFrequency.gridy = 7;
		panel_query1.add(labelQuery1LindolFrequency, gbc_labelQuery1LindolFrequency);
		
		spinnerQuery1LindolFrequencyLower = new JSpinner();
		spinnerQuery1LindolFrequencyLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1LindolFrequencyLower = new GridBagConstraints();
		gbc_spinnerQuery1LindolFrequencyLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1LindolFrequencyLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1LindolFrequencyLower.gridx = 3;
		gbc_spinnerQuery1LindolFrequencyLower.gridy = 7;
		panel_query1.add(spinnerQuery1LindolFrequencyLower, gbc_spinnerQuery1LindolFrequencyLower);
		
		spinnerQuery1LindolFrequencyUpper = new JSpinner();
		spinnerQuery1LindolFrequencyUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1LindolFrequencyUpper = new GridBagConstraints();
		gbc_spinnerQuery1LindolFrequencyUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1LindolFrequencyUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1LindolFrequencyUpper.gridx = 4;
		gbc_spinnerQuery1LindolFrequencyUpper.gridy = 7;
		panel_query1.add(spinnerQuery1LindolFrequencyUpper, gbc_spinnerQuery1LindolFrequencyUpper);
		
		labelQuery1LindolAid = new JLabel("Aid");
		GridBagConstraints gbc_labelQuery1LindolAid = new GridBagConstraints();
		gbc_labelQuery1LindolAid.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1LindolAid.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1LindolAid.gridx = 5;
		gbc_labelQuery1LindolAid.gridy = 7;
		panel_query1.add(labelQuery1LindolAid, gbc_labelQuery1LindolAid);
		
		comboBoxQuery1LindolAid = new JComboBox<String>();
		comboBoxQuery1LindolAid.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery1LindolAid = new GridBagConstraints();
		gbc_comboBoxQuery1LindolAid.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1LindolAid.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery1LindolAid.gridx = 6;
		gbc_comboBoxQuery1LindolAid.gridy = 7;
		panel_query1.add(comboBoxQuery1LindolAid, gbc_comboBoxQuery1LindolAid);
		
		labelQuery1Bulkan = new JLabel("Pagsabog ng Bulkan");
		GridBagConstraints gbc_labelQuery1Bulkan = new GridBagConstraints();
		gbc_labelQuery1Bulkan.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Bulkan.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Bulkan.gridx = 0;
		gbc_labelQuery1Bulkan.gridy = 8;
		panel_query1.add(labelQuery1Bulkan, gbc_labelQuery1Bulkan);
		
		comboBoxQuery1Bulkan = new JComboBox<String>();
		comboBoxQuery1Bulkan.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Naranasan", "Hindi Naranasan"}));
		GridBagConstraints gbc_comboBoxQuery1Bulkan = new GridBagConstraints();
		gbc_comboBoxQuery1Bulkan.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Bulkan.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Bulkan.gridx = 1;
		gbc_comboBoxQuery1Bulkan.gridy = 8;
		panel_query1.add(comboBoxQuery1Bulkan, gbc_comboBoxQuery1Bulkan);
		
		labelQuery1BulkanFrequency = new JLabel("Frequency");
		GridBagConstraints gbc_labelQuery1BulkanFrequency = new GridBagConstraints();
		gbc_labelQuery1BulkanFrequency.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1BulkanFrequency.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1BulkanFrequency.gridx = 2;
		gbc_labelQuery1BulkanFrequency.gridy = 8;
		panel_query1.add(labelQuery1BulkanFrequency, gbc_labelQuery1BulkanFrequency);
		
		spinnerQuery1BulkanFrequencyLower = new JSpinner();
		spinnerQuery1BulkanFrequencyLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1BulkanFrequencyLower = new GridBagConstraints();
		gbc_spinnerQuery1BulkanFrequencyLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1BulkanFrequencyLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1BulkanFrequencyLower.gridx = 3;
		gbc_spinnerQuery1BulkanFrequencyLower.gridy = 8;
		panel_query1.add(spinnerQuery1BulkanFrequencyLower, gbc_spinnerQuery1BulkanFrequencyLower);
		
		spinnerQuery1BulkanFrequencyUpper = new JSpinner();
		spinnerQuery1BulkanFrequencyUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1BulkanFrequencyUpper = new GridBagConstraints();
		gbc_spinnerQuery1BulkanFrequencyUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1BulkanFrequencyUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1BulkanFrequencyUpper.gridx = 4;
		gbc_spinnerQuery1BulkanFrequencyUpper.gridy = 8;
		panel_query1.add(spinnerQuery1BulkanFrequencyUpper, gbc_spinnerQuery1BulkanFrequencyUpper);
		
		labelQuery1BulkanAid = new JLabel("Aid");
		GridBagConstraints gbc_labelQuery1BulkanAid = new GridBagConstraints();
		gbc_labelQuery1BulkanAid.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1BulkanAid.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1BulkanAid.gridx = 5;
		gbc_labelQuery1BulkanAid.gridy = 8;
		panel_query1.add(labelQuery1BulkanAid, gbc_labelQuery1BulkanAid);
		
		comboBoxQuery1BulkanAid = new JComboBox<String>();
		comboBoxQuery1BulkanAid.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery1BulkanAid = new GridBagConstraints();
		gbc_comboBoxQuery1BulkanAid.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery1BulkanAid.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1BulkanAid.gridx = 6;
		gbc_comboBoxQuery1BulkanAid.gridy = 8;
		panel_query1.add(comboBoxQuery1BulkanAid, gbc_comboBoxQuery1BulkanAid);
		
		labelQuery1Landslide = new JLabel("Landslide");
		GridBagConstraints gbc_labelQuery1Landslide = new GridBagConstraints();
		gbc_labelQuery1Landslide.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Landslide.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Landslide.gridx = 0;
		gbc_labelQuery1Landslide.gridy = 9;
		panel_query1.add(labelQuery1Landslide, gbc_labelQuery1Landslide);
		
		comboBoxQuery1Landslide = new JComboBox<String>();
		comboBoxQuery1Landslide.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Naranasan", "Hindi Naranasan"}));
		GridBagConstraints gbc_comboBoxQuery1Landslide = new GridBagConstraints();
		gbc_comboBoxQuery1Landslide.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Landslide.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Landslide.gridx = 1;
		gbc_comboBoxQuery1Landslide.gridy = 9;
		panel_query1.add(comboBoxQuery1Landslide, gbc_comboBoxQuery1Landslide);
		
		labelQuery1LandslideFrequency = new JLabel("Frequency");
		GridBagConstraints gbc_labelQuery1LandslideFrequency = new GridBagConstraints();
		gbc_labelQuery1LandslideFrequency.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1LandslideFrequency.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1LandslideFrequency.gridx = 2;
		gbc_labelQuery1LandslideFrequency.gridy = 9;
		panel_query1.add(labelQuery1LandslideFrequency, gbc_labelQuery1LandslideFrequency);
		
		spinnerQuery1LandslideFrequencyLower = new JSpinner();
		spinnerQuery1LandslideFrequencyLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1LandslideFrequencyLower = new GridBagConstraints();
		gbc_spinnerQuery1LandslideFrequencyLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1LandslideFrequencyLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1LandslideFrequencyLower.gridx = 3;
		gbc_spinnerQuery1LandslideFrequencyLower.gridy = 9;
		panel_query1.add(spinnerQuery1LandslideFrequencyLower, gbc_spinnerQuery1LandslideFrequencyLower);
		
		spinnerQuery1LandslideFrequencyUpper = new JSpinner();
		spinnerQuery1LandslideFrequencyUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1LandslideFrequencyUpper = new GridBagConstraints();
		gbc_spinnerQuery1LandslideFrequencyUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1LandslideFrequencyUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1LandslideFrequencyUpper.gridx = 4;
		gbc_spinnerQuery1LandslideFrequencyUpper.gridy = 9;
		panel_query1.add(spinnerQuery1LandslideFrequencyUpper, gbc_spinnerQuery1LandslideFrequencyUpper);
		
		labelQuery1LandslideAid = new JLabel("Aid");
		GridBagConstraints gbc_labelQuery1LandslideAid = new GridBagConstraints();
		gbc_labelQuery1LandslideAid.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1LandslideAid.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1LandslideAid.gridx = 5;
		gbc_labelQuery1LandslideAid.gridy = 9;
		panel_query1.add(labelQuery1LandslideAid, gbc_labelQuery1LandslideAid);
		
		comboBoxQuery1LandslideAid = new JComboBox<String>();
		comboBoxQuery1LandslideAid.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery1LandslideAid = new GridBagConstraints();
		gbc_comboBoxQuery1LandslideAid.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery1LandslideAid.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1LandslideAid.gridx = 6;
		gbc_comboBoxQuery1LandslideAid.gridy = 9;
		panel_query1.add(comboBoxQuery1LandslideAid, gbc_comboBoxQuery1LandslideAid);
		
		labelQuery1Tsunami = new JLabel("Tsunami");
		GridBagConstraints gbc_labelQuery1Tsunami = new GridBagConstraints();
		gbc_labelQuery1Tsunami.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Tsunami.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Tsunami.gridx = 0;
		gbc_labelQuery1Tsunami.gridy = 10;
		panel_query1.add(labelQuery1Tsunami, gbc_labelQuery1Tsunami);
		
		comboBoxQuery1Tsunami = new JComboBox<String>();
		comboBoxQuery1Tsunami.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Naranasan", "Hindi Naranasan"}));
		GridBagConstraints gbc_comboBoxQuery1Tsunami = new GridBagConstraints();
		gbc_comboBoxQuery1Tsunami.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Tsunami.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Tsunami.gridx = 1;
		gbc_comboBoxQuery1Tsunami.gridy = 10;
		panel_query1.add(comboBoxQuery1Tsunami, gbc_comboBoxQuery1Tsunami);
		
		labelQuery1TsunamiFrequency = new JLabel("Frequency");
		GridBagConstraints gbc_labelQuery1TsunamiFrequency = new GridBagConstraints();
		gbc_labelQuery1TsunamiFrequency.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1TsunamiFrequency.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1TsunamiFrequency.gridx = 2;
		gbc_labelQuery1TsunamiFrequency.gridy = 10;
		panel_query1.add(labelQuery1TsunamiFrequency, gbc_labelQuery1TsunamiFrequency);
		
		spinnerQuery1TsunamiFrequencyLower = new JSpinner();
		spinnerQuery1TsunamiFrequencyLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1TsunamiFrequencyLower = new GridBagConstraints();
		gbc_spinnerQuery1TsunamiFrequencyLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1TsunamiFrequencyLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1TsunamiFrequencyLower.gridx = 3;
		gbc_spinnerQuery1TsunamiFrequencyLower.gridy = 10;
		panel_query1.add(spinnerQuery1TsunamiFrequencyLower, gbc_spinnerQuery1TsunamiFrequencyLower);
		
		spinnerQuery1TsunamiFrequencyUpper = new JSpinner();
		spinnerQuery1TsunamiFrequencyUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1TsunamiFrequencyUpper = new GridBagConstraints();
		gbc_spinnerQuery1TsunamiFrequencyUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1TsunamiFrequencyUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1TsunamiFrequencyUpper.gridx = 4;
		gbc_spinnerQuery1TsunamiFrequencyUpper.gridy = 10;
		panel_query1.add(spinnerQuery1TsunamiFrequencyUpper, gbc_spinnerQuery1TsunamiFrequencyUpper);
		
		labelQuery1TsunamiAid = new JLabel("Aid");
		GridBagConstraints gbc_labelQuery1TsunamiAid = new GridBagConstraints();
		gbc_labelQuery1TsunamiAid.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1TsunamiAid.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1TsunamiAid.gridx = 5;
		gbc_labelQuery1TsunamiAid.gridy = 10;
		panel_query1.add(labelQuery1TsunamiAid, gbc_labelQuery1TsunamiAid);
		
		comboBoxQuery1TsunamiAid = new JComboBox<String>();
		comboBoxQuery1TsunamiAid.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery1TsunamiAid = new GridBagConstraints();
		gbc_comboBoxQuery1TsunamiAid.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery1TsunamiAid.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1TsunamiAid.gridx = 6;
		gbc_comboBoxQuery1TsunamiAid.gridy = 10;
		panel_query1.add(comboBoxQuery1TsunamiAid, gbc_comboBoxQuery1TsunamiAid);
		
		labelQuery1Sunog = new JLabel("Sunog");
		GridBagConstraints gbc_labelQuery1Sunog = new GridBagConstraints();
		gbc_labelQuery1Sunog.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Sunog.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Sunog.gridx = 0;
		gbc_labelQuery1Sunog.gridy = 11;
		getPanel_query1().add(labelQuery1Sunog, gbc_labelQuery1Sunog);
		
		comboBoxQuery1Sunog = new JComboBox<String>();
		comboBoxQuery1Sunog.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Naranasan", "Hindi Naranasan"}));
		GridBagConstraints gbc_comboBoxQuery1Sunog = new GridBagConstraints();
		gbc_comboBoxQuery1Sunog.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Sunog.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Sunog.gridx = 1;
		gbc_comboBoxQuery1Sunog.gridy = 11;
		getPanel_query1().add(comboBoxQuery1Sunog, gbc_comboBoxQuery1Sunog);
		
		labelQuery1SunogFrequency = new JLabel("Frequency");
		GridBagConstraints gbc_labelQuery1SunogFrequency = new GridBagConstraints();
		gbc_labelQuery1SunogFrequency.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1SunogFrequency.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1SunogFrequency.gridx = 2;
		gbc_labelQuery1SunogFrequency.gridy = 11;
		getPanel_query1().add(labelQuery1SunogFrequency, gbc_labelQuery1SunogFrequency);
		
		spinnerQuery1SunogFrequencyLower = new JSpinner();
		spinnerQuery1SunogFrequencyLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1SunogFrequencyLower = new GridBagConstraints();
		gbc_spinnerQuery1SunogFrequencyLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1SunogFrequencyLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1SunogFrequencyLower.gridx = 3;
		gbc_spinnerQuery1SunogFrequencyLower.gridy = 11;
		panel_query1.add(spinnerQuery1SunogFrequencyLower, gbc_spinnerQuery1SunogFrequencyLower);
		
		spinnerQuery1SunogFrequencyUpper = new JSpinner();
		spinnerQuery1SunogFrequencyUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1SunogFrequencyUpper = new GridBagConstraints();
		gbc_spinnerQuery1SunogFrequencyUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1SunogFrequencyUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1SunogFrequencyUpper.gridx = 4;
		gbc_spinnerQuery1SunogFrequencyUpper.gridy = 11;
		panel_query1.add(spinnerQuery1SunogFrequencyUpper, gbc_spinnerQuery1SunogFrequencyUpper);
		
		labelQuery1SunogAid = new JLabel("Aid");
		GridBagConstraints gbc_labelQuery1SunogAid = new GridBagConstraints();
		gbc_labelQuery1SunogAid.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1SunogAid.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1SunogAid.gridx = 5;
		gbc_labelQuery1SunogAid.gridy = 11;
		getPanel_query1().add(labelQuery1SunogAid, gbc_labelQuery1SunogAid);
		
		comboBoxQuery1SunogAid = new JComboBox<String>();
		comboBoxQuery1SunogAid.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery1SunogAid = new GridBagConstraints();
		gbc_comboBoxQuery1SunogAid.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1SunogAid.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery1SunogAid.gridx = 6;
		gbc_comboBoxQuery1SunogAid.gridy = 11;
		getPanel_query1().add(comboBoxQuery1SunogAid, gbc_comboBoxQuery1SunogAid);
		
		labelQuery1ForestFire = new JLabel("Forest Fire");
		GridBagConstraints gbc_labelQuery1ForestFire = new GridBagConstraints();
		gbc_labelQuery1ForestFire.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1ForestFire.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1ForestFire.gridx = 0;
		gbc_labelQuery1ForestFire.gridy = 12;
		panel_query1.add(labelQuery1ForestFire, gbc_labelQuery1ForestFire);
		
		comboBoxQuery1ForestFire = new JComboBox<String>();
		comboBoxQuery1ForestFire.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Naranasan", "Hindi Naranasan"}));
		GridBagConstraints gbc_comboBoxQuery1ForestFire = new GridBagConstraints();
		gbc_comboBoxQuery1ForestFire.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1ForestFire.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1ForestFire.gridx = 1;
		gbc_comboBoxQuery1ForestFire.gridy = 12;
		panel_query1.add(comboBoxQuery1ForestFire, gbc_comboBoxQuery1ForestFire);
		
		labelQuery1ForestFireFrequency = new JLabel("Frequency");
		GridBagConstraints gbc_labelQuery1ForestFireFrequency = new GridBagConstraints();
		gbc_labelQuery1ForestFireFrequency.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1ForestFireFrequency.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1ForestFireFrequency.gridx = 2;
		gbc_labelQuery1ForestFireFrequency.gridy = 12;
		panel_query1.add(labelQuery1ForestFireFrequency, gbc_labelQuery1ForestFireFrequency);
		
		spinnerQuery1ForestFireFrequencyLower = new JSpinner();
		spinnerQuery1ForestFireFrequencyLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1ForestFireFrequencyLower = new GridBagConstraints();
		gbc_spinnerQuery1ForestFireFrequencyLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1ForestFireFrequencyLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1ForestFireFrequencyLower.gridx = 3;
		gbc_spinnerQuery1ForestFireFrequencyLower.gridy = 12;
		panel_query1.add(spinnerQuery1ForestFireFrequencyLower, gbc_spinnerQuery1ForestFireFrequencyLower);
		
		spinnerQuery1ForestFireFrequencyUpper = new JSpinner();
		spinnerQuery1ForestFireFrequencyUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1ForestFireFrequencyUpper = new GridBagConstraints();
		gbc_spinnerQuery1ForestFireFrequencyUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1ForestFireFrequencyUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1ForestFireFrequencyUpper.gridx = 4;
		gbc_spinnerQuery1ForestFireFrequencyUpper.gridy = 12;
		panel_query1.add(spinnerQuery1ForestFireFrequencyUpper, gbc_spinnerQuery1ForestFireFrequencyUpper);
		
		labelQuery1ForestFireAid = new JLabel("Aid");
		GridBagConstraints gbc_labelQuery1ForestFireAid = new GridBagConstraints();
		gbc_labelQuery1ForestFireAid.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1ForestFireAid.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1ForestFireAid.gridx = 5;
		gbc_labelQuery1ForestFireAid.gridy = 12;
		panel_query1.add(labelQuery1ForestFireAid, gbc_labelQuery1ForestFireAid);
		
		comboBoxQuery1ForestFireAid = new JComboBox<String>();
		comboBoxQuery1ForestFireAid.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery1ForestFireAid = new GridBagConstraints();
		gbc_comboBoxQuery1ForestFireAid.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery1ForestFireAid.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1ForestFireAid.gridx = 6;
		gbc_comboBoxQuery1ForestFireAid.gridy = 12;
		panel_query1.add(comboBoxQuery1ForestFireAid, gbc_comboBoxQuery1ForestFireAid);
		
		labelQuery1Digmaan = new JLabel("Digmaan");
		GridBagConstraints gbc_labelQuery1Digmaan = new GridBagConstraints();
		gbc_labelQuery1Digmaan.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1Digmaan.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1Digmaan.gridx = 0;
		gbc_labelQuery1Digmaan.gridy = 13;
		panel_query1.add(labelQuery1Digmaan, gbc_labelQuery1Digmaan);
		
		comboBoxQuery1Digmaan = new JComboBox<String>();
		comboBoxQuery1Digmaan.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Naranasan", "Hindi Naranasan"}));
		GridBagConstraints gbc_comboBoxQuery1Digmaan = new GridBagConstraints();
		gbc_comboBoxQuery1Digmaan.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery1Digmaan.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1Digmaan.gridx = 1;
		gbc_comboBoxQuery1Digmaan.gridy = 13;
		panel_query1.add(comboBoxQuery1Digmaan, gbc_comboBoxQuery1Digmaan);
		
		labelQuery1DigmaanFrequency = new JLabel("Frequency");
		GridBagConstraints gbc_labelQuery1DigmaanFrequency = new GridBagConstraints();
		gbc_labelQuery1DigmaanFrequency.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1DigmaanFrequency.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1DigmaanFrequency.gridx = 2;
		gbc_labelQuery1DigmaanFrequency.gridy = 13;
		panel_query1.add(labelQuery1DigmaanFrequency, gbc_labelQuery1DigmaanFrequency);
		
		spinnerQuery1DigmaanFrequencyLower = new JSpinner();
		spinnerQuery1DigmaanFrequencyLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1DigmaanFrequencyLower = new GridBagConstraints();
		gbc_spinnerQuery1DigmaanFrequencyLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1DigmaanFrequencyLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1DigmaanFrequencyLower.gridx = 3;
		gbc_spinnerQuery1DigmaanFrequencyLower.gridy = 13;
		panel_query1.add(spinnerQuery1DigmaanFrequencyLower, gbc_spinnerQuery1DigmaanFrequencyLower);
		
		spinnerQuery1DigmaanFrequencyUpper = new JSpinner();
		spinnerQuery1DigmaanFrequencyUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery1DigmaanFrequencyUpper = new GridBagConstraints();
		gbc_spinnerQuery1DigmaanFrequencyUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery1DigmaanFrequencyUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery1DigmaanFrequencyUpper.gridx = 4;
		gbc_spinnerQuery1DigmaanFrequencyUpper.gridy = 13;
		panel_query1.add(spinnerQuery1DigmaanFrequencyUpper, gbc_spinnerQuery1DigmaanFrequencyUpper);
		
		labelQuery1DigmaanAid = new JLabel("Aid");
		GridBagConstraints gbc_labelQuery1DigmaanAid = new GridBagConstraints();
		gbc_labelQuery1DigmaanAid.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery1DigmaanAid.anchor = GridBagConstraints.EAST;
		gbc_labelQuery1DigmaanAid.gridx = 5;
		gbc_labelQuery1DigmaanAid.gridy = 13;
		panel_query1.add(labelQuery1DigmaanAid, gbc_labelQuery1DigmaanAid);
		
		comboBoxQuery1DigmaanAid = new JComboBox<String>();
		comboBoxQuery1DigmaanAid.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery1DigmaanAid = new GridBagConstraints();
		gbc_comboBoxQuery1DigmaanAid.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery1DigmaanAid.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery1DigmaanAid.gridx = 6;
		gbc_comboBoxQuery1DigmaanAid.gridy = 13;
		panel_query1.add(comboBoxQuery1DigmaanAid, gbc_comboBoxQuery1DigmaanAid);
		
		buttonQuery1Query = new JButton("Query");
		GridBagConstraints gbc_buttonQuery1Query = new GridBagConstraints();
		gbc_buttonQuery1Query.insets = new Insets(0, 0, 5, 0);
		gbc_buttonQuery1Query.gridwidth = 2;
		gbc_buttonQuery1Query.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery1Query.gridx = 5;
		gbc_buttonQuery1Query.gridy = 14;
		getPanel_query1().add(buttonQuery1Query, gbc_buttonQuery1Query);
		
		scrollPaneQuery1ResultTable = new JScrollPane();
		GridBagConstraints gbc_scrollPaneQuery1ResultTable = new GridBagConstraints();
		gbc_scrollPaneQuery1ResultTable.anchor = GridBagConstraints.WEST;
		gbc_scrollPaneQuery1ResultTable.gridwidth = 7;
		gbc_scrollPaneQuery1ResultTable.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneQuery1ResultTable.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPaneQuery1ResultTable.gridx = 0;
		gbc_scrollPaneQuery1ResultTable.gridy = 15;
		getPanel_query1().add(scrollPaneQuery1ResultTable, gbc_scrollPaneQuery1ResultTable);
		
		tableQuery1ResultTable = new JTable(){
		    
			private static final long serialVersionUID = 1L;
			@Override
		       public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		           Component component = super.prepareRenderer(renderer, row, column);
		           int rendererWidth = component.getPreferredSize().width;
		           TableColumn tableColumn = getColumnModel().getColumn(column);
		           tableColumn.setPreferredWidth(Math.max(rendererWidth + getIntercellSpacing().width, tableColumn.getPreferredWidth()));
		           return component;
		        }
		    };
		tableQuery1ResultTable.setAutoCreateRowSorter(true);
		tableQuery1ResultTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //IMPORTANT
		scrollPaneQuery1ResultTable.setViewportView(tableQuery1ResultTable);
		
		labelQuery1Status = new JLabel("");
		GridBagConstraints gbc_labelQuery1Status = new GridBagConstraints();
		gbc_labelQuery1Status.gridwidth = 7;
		gbc_labelQuery1Status.anchor = GridBagConstraints.SOUTHWEST;
		gbc_labelQuery1Status.insets = new Insets(0, 0, 0, 5);
		gbc_labelQuery1Status.gridx = 0;
		gbc_labelQuery1Status.gridy = 16;
		getPanel_query1().add(labelQuery1Status, gbc_labelQuery1Status);
		
		panel_query2 = new JPanel();
		contentPane.add(panel_query2, "panel_query2");
		GridBagLayout gbl_panel_query2 = new GridBagLayout();
		gbl_panel_query2.columnWidths = new int[]{70, 80, 102, 130, 115, 45, 45, 0};
		gbl_panel_query2.rowHeights = new int[]{50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 145, 185, 0};
		gbl_panel_query2.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_query2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_query2.setLayout(gbl_panel_query2);
		
		buttonQuery2Back = new JButton("<<");
		buttonQuery2Back.setFont(new Font("SansSerif", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery2Back = new GridBagConstraints();
		gbc_buttonQuery2Back.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonQuery2Back.anchor = GridBagConstraints.WEST;
		gbc_buttonQuery2Back.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery2Back.gridx = 0;
		gbc_buttonQuery2Back.gridy = 0;
		panel_query2.add(buttonQuery2Back, gbc_buttonQuery2Back);
		
		labelQuery2 = new JLabel("Government Services Report");
		labelQuery2.setFont(new Font("SansSerif", Font.BOLD, 20));
		GridBagConstraints gbc_labelQuery2 = new GridBagConstraints();
		gbc_labelQuery2.fill = GridBagConstraints.VERTICAL;
		gbc_labelQuery2.anchor = GridBagConstraints.WEST;
		gbc_labelQuery2.gridwidth = 6;
		gbc_labelQuery2.insets = new Insets(0, 0, 5, 0);
		gbc_labelQuery2.gridx = 1;
		gbc_labelQuery2.gridy = 0;
		panel_query2.add(labelQuery2, gbc_labelQuery2);
		
		labelQuery2Municipality = new JLabel("Municipality");
		GridBagConstraints gbc_labelQuery2Municipality = new GridBagConstraints();
		gbc_labelQuery2Municipality.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2Municipality.gridx = 0;
		gbc_labelQuery2Municipality.gridy = 1;
		panel_query2.add(labelQuery2Municipality, gbc_labelQuery2Municipality);
		
		comboBoxQuery2Municipality = new JComboBox<String>();
		comboBoxQuery2Municipality.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6"}));
		GridBagConstraints gbc_comboBoxQuery2Municipality = new GridBagConstraints();
		gbc_comboBoxQuery2Municipality.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2Municipality.gridx = 1;
		gbc_comboBoxQuery2Municipality.gridy = 1;
		panel_query2.add(comboBoxQuery2Municipality, gbc_comboBoxQuery2Municipality);
		
		labelQuery2Zone = new JLabel("Zone");
		GridBagConstraints gbc_labelQuery2Zone = new GridBagConstraints();
		gbc_labelQuery2Zone.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2Zone.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2Zone.gridx = 2;
		gbc_labelQuery2Zone.gridy = 1;
		panel_query2.add(labelQuery2Zone, gbc_labelQuery2Zone);
		
		comboBoxQuery2Zone = new JComboBox<String>();
		comboBoxQuery2Zone.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "9", "13", "18", "19", "99"}));
		GridBagConstraints gbc_comboBoxQuery2Zone = new GridBagConstraints();
		gbc_comboBoxQuery2Zone.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2Zone.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2Zone.gridx = 3;
		gbc_comboBoxQuery2Zone.gridy = 1;
		panel_query2.add(comboBoxQuery2Zone, gbc_comboBoxQuery2Zone);
		
		labelQuery2Barangay = new JLabel("Barangay");
		GridBagConstraints gbc_labelQuery2Barangay = new GridBagConstraints();
		gbc_labelQuery2Barangay.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2Barangay.gridx = 4;
		gbc_labelQuery2Barangay.gridy = 1;
		panel_query2.add(labelQuery2Barangay, gbc_labelQuery2Barangay);
		
		comboBoxQuery2Barangay = new JComboBox<String>();
		comboBoxQuery2Barangay.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61"}));
		GridBagConstraints gbc_comboBoxQuery2Barangay = new GridBagConstraints();
		gbc_comboBoxQuery2Barangay.gridwidth = 2;
		gbc_comboBoxQuery2Barangay.fill = GridBagConstraints.BOTH;
		gbc_comboBoxQuery2Barangay.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery2Barangay.gridx = 5;
		gbc_comboBoxQuery2Barangay.gridy = 1;
		panel_query2.add(comboBoxQuery2Barangay, gbc_comboBoxQuery2Barangay);
		
		labelQuery2Purok = new JLabel("Purok");
		GridBagConstraints gbc_labelQuery2Purok = new GridBagConstraints();
		gbc_labelQuery2Purok.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2Purok.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2Purok.gridx = 0;
		gbc_labelQuery2Purok.gridy = 2;
		panel_query2.add(labelQuery2Purok, gbc_labelQuery2Purok);
		
		comboBoxQuery2Purok = new JComboBox<String>();
		comboBoxQuery2Purok.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "26", "99"}));
		GridBagConstraints gbc_comboBoxQuery2Purok = new GridBagConstraints();
		gbc_comboBoxQuery2Purok.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2Purok.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2Purok.gridx = 1;
		gbc_comboBoxQuery2Purok.gridy = 2;
		panel_query2.add(comboBoxQuery2Purok, gbc_comboBoxQuery2Purok);
		
		lableQuery2GovernmentServices = new JLabel("Government Services:");
		lableQuery2GovernmentServices.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lableQuery2GovernmentServices = new GridBagConstraints();
		gbc_lableQuery2GovernmentServices.gridwidth = 7;
		gbc_lableQuery2GovernmentServices.insets = new Insets(0, 0, 5, 0);
		gbc_lableQuery2GovernmentServices.gridx = 0;
		gbc_lableQuery2GovernmentServices.gridy = 3;
		panel_query2.add(lableQuery2GovernmentServices, gbc_lableQuery2GovernmentServices);
		
		labelQuery2SLP = new JLabel("Sustainable Livelihood Program");
		GridBagConstraints gbc_labelQuery2SLP = new GridBagConstraints();
		gbc_labelQuery2SLP.gridwidth = 3;
		gbc_labelQuery2SLP.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2SLP.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2SLP.gridx = 0;
		gbc_labelQuery2SLP.gridy = 4;
		panel_query2.add(labelQuery2SLP, gbc_labelQuery2SLP);
		
		comboBoxQuery2SLP = new JComboBox<String>();
		comboBoxQuery2SLP.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2SLP = new GridBagConstraints();
		gbc_comboBoxQuery2SLP.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2SLP.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2SLP.gridx = 3;
		gbc_comboBoxQuery2SLP.gridy = 4;
		panel_query2.add(comboBoxQuery2SLP, gbc_comboBoxQuery2SLP);
		
		labelQuery2SLPNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2SLPNum = new GridBagConstraints();
		gbc_labelQuery2SLPNum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2SLPNum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2SLPNum.gridx = 4;
		gbc_labelQuery2SLPNum.gridy = 4;
		panel_query2.add(labelQuery2SLPNum, gbc_labelQuery2SLPNum);
		
		spinnerQuery2SLPNumLower = new JSpinner();
		spinnerQuery2SLPNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2SLPNumLower = new GridBagConstraints();
		gbc_spinnerQuery2SLPNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2SLPNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2SLPNumLower.gridx = 5;
		gbc_spinnerQuery2SLPNumLower.gridy = 4;
		panel_query2.add(spinnerQuery2SLPNumLower, gbc_spinnerQuery2SLPNumLower);
		
		spinnerQuery2SLPNumUpper = new JSpinner();
		spinnerQuery2SLPNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2SLPNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2SLPNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2SLPNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2SLPNumUpper.gridx = 6;
		gbc_spinnerQuery2SLPNumUpper.gridy = 4;
		panel_query2.add(spinnerQuery2SLPNumUpper, gbc_spinnerQuery2SLPNumUpper);
		
		labelQuery2FFSP = new JLabel("Food For School Program");
		GridBagConstraints gbc_labelQuery2FFSP = new GridBagConstraints();
		gbc_labelQuery2FFSP.gridwidth = 3;
		gbc_labelQuery2FFSP.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2FFSP.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2FFSP.gridx = 0;
		gbc_labelQuery2FFSP.gridy = 5;
		panel_query2.add(labelQuery2FFSP, gbc_labelQuery2FFSP);
		
		comboBoxQuery2FFSP = new JComboBox<String>();
		comboBoxQuery2FFSP.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2FFSP = new GridBagConstraints();
		gbc_comboBoxQuery2FFSP.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2FFSP.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2FFSP.gridx = 3;
		gbc_comboBoxQuery2FFSP.gridy = 5;
		panel_query2.add(comboBoxQuery2FFSP, gbc_comboBoxQuery2FFSP);
		
		labelQuery2FFSPNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2FFSPNum = new GridBagConstraints();
		gbc_labelQuery2FFSPNum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2FFSPNum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2FFSPNum.gridx = 4;
		gbc_labelQuery2FFSPNum.gridy = 5;
		panel_query2.add(labelQuery2FFSPNum, gbc_labelQuery2FFSPNum);
		
		spinnerQuery2FFSPNumLower = new JSpinner();
		spinnerQuery2FFSPNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2FFSPNumLower = new GridBagConstraints();
		gbc_spinnerQuery2FFSPNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2FFSPNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2FFSPNumLower.gridx = 5;
		gbc_spinnerQuery2FFSPNumLower.gridy = 5;
		panel_query2.add(spinnerQuery2FFSPNumLower, gbc_spinnerQuery2FFSPNumLower);
		
		spinnerQuery2FFSPNumUpper = new JSpinner();
		spinnerQuery2FFSPNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2FFSPNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2FFSPNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2FFSPNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2FFSPNumUpper.gridx = 6;
		gbc_spinnerQuery2FFSPNumUpper.gridy = 5;
		panel_query2.add(spinnerQuery2FFSPNumUpper, gbc_spinnerQuery2FFSPNumUpper);
		
		labelQuery2FFWP = new JLabel("Food For Work Program");
		GridBagConstraints gbc_labelQuery2FFWP = new GridBagConstraints();
		gbc_labelQuery2FFWP.gridwidth = 3;
		gbc_labelQuery2FFWP.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2FFWP.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2FFWP.gridx = 0;
		gbc_labelQuery2FFWP.gridy = 6;
		panel_query2.add(labelQuery2FFWP, gbc_labelQuery2FFWP);
		
		comboBoxQuery2FFWP = new JComboBox<String>();
		comboBoxQuery2FFWP.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2FFWP = new GridBagConstraints();
		gbc_comboBoxQuery2FFWP.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2FFWP.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2FFWP.gridx = 3;
		gbc_comboBoxQuery2FFWP.gridy = 6;
		panel_query2.add(comboBoxQuery2FFWP, gbc_comboBoxQuery2FFWP);
		
		labelQuery2FFWPNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2FFWPNum = new GridBagConstraints();
		gbc_labelQuery2FFWPNum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2FFWPNum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2FFWPNum.gridx = 4;
		gbc_labelQuery2FFWPNum.gridy = 6;
		panel_query2.add(labelQuery2FFWPNum, gbc_labelQuery2FFWPNum);
		
		spinnerQuery2FFWPNumLower = new JSpinner();
		spinnerQuery2FFWPNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2FFWPNumLower = new GridBagConstraints();
		gbc_spinnerQuery2FFWPNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2FFWPNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2FFWPNumLower.gridx = 5;
		gbc_spinnerQuery2FFWPNumLower.gridy = 6;
		panel_query2.add(spinnerQuery2FFWPNumLower, gbc_spinnerQuery2FFWPNumLower);
		
		spinnerQuery2FFWPNumUpper = new JSpinner();
		spinnerQuery2FFWPNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2FFWPNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2FFWPNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2FFWPNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2FFWPNumUpper.gridx = 6;
		gbc_spinnerQuery2FFWPNumUpper.gridy = 6;
		panel_query2.add(spinnerQuery2FFWPNumUpper, gbc_spinnerQuery2FFWPNumUpper);
		
		labelQuery2CFWP = new JLabel("Cash For Work Program");
		GridBagConstraints gbc_labelQuery2CFWP = new GridBagConstraints();
		gbc_labelQuery2CFWP.gridwidth = 3;
		gbc_labelQuery2CFWP.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2CFWP.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2CFWP.gridx = 0;
		gbc_labelQuery2CFWP.gridy = 7;
		panel_query2.add(labelQuery2CFWP, gbc_labelQuery2CFWP);
		
		comboBoxQuery2CFWP = new JComboBox<String>();
		comboBoxQuery2CFWP.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2CFWP = new GridBagConstraints();
		gbc_comboBoxQuery2CFWP.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2CFWP.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2CFWP.gridx = 3;
		gbc_comboBoxQuery2CFWP.gridy = 7;
		panel_query2.add(comboBoxQuery2CFWP, gbc_comboBoxQuery2CFWP);
		
		labelQuery2CFWPNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2CFWPNum = new GridBagConstraints();
		gbc_labelQuery2CFWPNum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2CFWPNum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2CFWPNum.gridx = 4;
		gbc_labelQuery2CFWPNum.gridy = 7;
		panel_query2.add(labelQuery2CFWPNum, gbc_labelQuery2CFWPNum);
		
		spinnerQuery2CFWPNumLower = new JSpinner();
		spinnerQuery2CFWPNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2CFWPNumLower = new GridBagConstraints();
		gbc_spinnerQuery2CFWPNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2CFWPNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2CFWPNumLower.gridx = 5;
		gbc_spinnerQuery2CFWPNumLower.gridy = 7;
		panel_query2.add(spinnerQuery2CFWPNumLower, gbc_spinnerQuery2CFWPNumLower);
		
		spinnerQuery2CFWPNumUpper = new JSpinner();
		spinnerQuery2CFWPNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2CFWPNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2CFWPNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2CFWPNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2CFWPNumUpper.gridx = 6;
		gbc_spinnerQuery2CFWPNumUpper.gridy = 7;
		panel_query2.add(spinnerQuery2CFWPNumUpper, gbc_spinnerQuery2CFWPNumUpper);
		
		labelQuery2SPISC = new JLabel("Social Pension for the Indigent Senior Citizen");
		GridBagConstraints gbc_labelQuery2SPISC = new GridBagConstraints();
		gbc_labelQuery2SPISC.gridwidth = 3;
		gbc_labelQuery2SPISC.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2SPISC.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2SPISC.gridx = 0;
		gbc_labelQuery2SPISC.gridy = 8;
		panel_query2.add(labelQuery2SPISC, gbc_labelQuery2SPISC);
		
		comboBoxQuery2SPISC = new JComboBox<String>();
		comboBoxQuery2SPISC.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2SPISC = new GridBagConstraints();
		gbc_comboBoxQuery2SPISC.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2SPISC.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2SPISC.gridx = 3;
		gbc_comboBoxQuery2SPISC.gridy = 8;
		panel_query2.add(comboBoxQuery2SPISC, gbc_comboBoxQuery2SPISC);
		
		labelQuery2SPISCNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2SPISCNum = new GridBagConstraints();
		gbc_labelQuery2SPISCNum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2SPISCNum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2SPISCNum.gridx = 4;
		gbc_labelQuery2SPISCNum.gridy = 8;
		panel_query2.add(labelQuery2SPISCNum, gbc_labelQuery2SPISCNum);
		
		spinnerQuery2SPISCNumLower = new JSpinner();
		spinnerQuery2SPISCNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2SPISCNumLower = new GridBagConstraints();
		gbc_spinnerQuery2SPISCNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2SPISCNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2SPISCNumLower.gridx = 5;
		gbc_spinnerQuery2SPISCNumLower.gridy = 8;
		panel_query2.add(spinnerQuery2SPISCNumLower, gbc_spinnerQuery2SPISCNumLower);
		
		spinnerQuery2SPISCNumUpper = new JSpinner();
		spinnerQuery2SPISCNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2SPISCNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2SPISCNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2SPISCNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2SPISCNumUpper.gridx = 6;
		gbc_spinnerQuery2SPISCNumUpper.gridy = 8;
		panel_query2.add(spinnerQuery2SPISCNumUpper, gbc_spinnerQuery2SPISCNumUpper);
		
		labelQuery2CCT = new JLabel("Pantawid Pamilyang Pilipino Program-CCT");
		GridBagConstraints gbc_labelQuery2CCT = new GridBagConstraints();
		gbc_labelQuery2CCT.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2CCT.gridwidth = 3;
		gbc_labelQuery2CCT.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2CCT.gridx = 0;
		gbc_labelQuery2CCT.gridy = 9;
		panel_query2.add(labelQuery2CCT, gbc_labelQuery2CCT);
		
		comboBoxQuery2CCT = new JComboBox<String>();
		comboBoxQuery2CCT.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2CCT = new GridBagConstraints();
		gbc_comboBoxQuery2CCT.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2CCT.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2CCT.gridx = 3;
		gbc_comboBoxQuery2CCT.gridy = 9;
		panel_query2.add(comboBoxQuery2CCT, gbc_comboBoxQuery2CCT);
		
		labelQuery2CCTNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2CCTNum = new GridBagConstraints();
		gbc_labelQuery2CCTNum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2CCTNum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2CCTNum.gridx = 4;
		gbc_labelQuery2CCTNum.gridy = 9;
		panel_query2.add(labelQuery2CCTNum, gbc_labelQuery2CCTNum);
		
		spinnerQuery2CCTNumLower = new JSpinner();
		spinnerQuery2CCTNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2CCTNumLower = new GridBagConstraints();
		gbc_spinnerQuery2CCTNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2CCTNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2CCTNumLower.gridx = 5;
		gbc_spinnerQuery2CCTNumLower.gridy = 9;
		panel_query2.add(spinnerQuery2CCTNumLower, gbc_spinnerQuery2CCTNumLower);
		
		spinnerQuery2CCTNumUpper = new JSpinner();
		spinnerQuery2CCTNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2CCTNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2CCTNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2CCTNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2CCTNumUpper.gridx = 6;
		gbc_spinnerQuery2CCTNumUpper.gridy = 9;
		panel_query2.add(spinnerQuery2CCTNumUpper, gbc_spinnerQuery2CCTNumUpper);
		
		labelQuery2ARCDP = new JLabel("Agrarian Reform Community Development Program");
		GridBagConstraints gbc_labelQuery2ARCDP = new GridBagConstraints();
		gbc_labelQuery2ARCDP.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2ARCDP.gridwidth = 3;
		gbc_labelQuery2ARCDP.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2ARCDP.gridx = 0;
		gbc_labelQuery2ARCDP.gridy = 10;
		panel_query2.add(labelQuery2ARCDP, gbc_labelQuery2ARCDP);
		
		comboBoxQuery2ARCDP = new JComboBox<String>();
		comboBoxQuery2ARCDP.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2ARCDP = new GridBagConstraints();
		gbc_comboBoxQuery2ARCDP.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2ARCDP.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2ARCDP.gridx = 3;
		gbc_comboBoxQuery2ARCDP.gridy = 10;
		panel_query2.add(comboBoxQuery2ARCDP, gbc_comboBoxQuery2ARCDP);
		
		labelQuery2ARCDPNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2ARCDPNum = new GridBagConstraints();
		gbc_labelQuery2ARCDPNum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2ARCDPNum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2ARCDPNum.gridx = 4;
		gbc_labelQuery2ARCDPNum.gridy = 10;
		panel_query2.add(labelQuery2ARCDPNum, gbc_labelQuery2ARCDPNum);
		
		spinnerQuery2ARCDPNumLower = new JSpinner();
		spinnerQuery2ARCDPNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2ARCDPNumLower = new GridBagConstraints();
		gbc_spinnerQuery2ARCDPNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2ARCDPNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2ARCDPNumLower.gridx = 5;
		gbc_spinnerQuery2ARCDPNumLower.gridy = 10;
		panel_query2.add(spinnerQuery2ARCDPNumLower, gbc_spinnerQuery2ARCDPNumLower);
		
		spinnerQuery2ARCDPNumUpper = new JSpinner();
		spinnerQuery2ARCDPNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2ARCDPNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2ARCDPNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2ARCDPNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2ARCDPNumUpper.gridx = 6;
		gbc_spinnerQuery2ARCDPNumUpper.gridy = 10;
		panel_query2.add(spinnerQuery2ARCDPNumUpper, gbc_spinnerQuery2ARCDPNumUpper);
		
		labelQuery2CBEP = new JLabel("Community-Based Employment Program");
		GridBagConstraints gbc_labelQuery2CBEP = new GridBagConstraints();
		gbc_labelQuery2CBEP.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2CBEP.gridwidth = 3;
		gbc_labelQuery2CBEP.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2CBEP.gridx = 0;
		gbc_labelQuery2CBEP.gridy = 11;
		panel_query2.add(labelQuery2CBEP, gbc_labelQuery2CBEP);
		
		comboBoxQuery2CBEP = new JComboBox<String>();
		comboBoxQuery2CBEP.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2CBEP = new GridBagConstraints();
		gbc_comboBoxQuery2CBEP.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2CBEP.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2CBEP.gridx = 3;
		gbc_comboBoxQuery2CBEP.gridy = 11;
		panel_query2.add(comboBoxQuery2CBEP, gbc_comboBoxQuery2CBEP);
		
		labelQuery2CBEPNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2CBEPNum = new GridBagConstraints();
		gbc_labelQuery2CBEPNum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2CBEPNum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2CBEPNum.gridx = 4;
		gbc_labelQuery2CBEPNum.gridy = 11;
		panel_query2.add(labelQuery2CBEPNum, gbc_labelQuery2CBEPNum);
		
		spinnerQuery2CBEPNumLower = new JSpinner();
		spinnerQuery2CBEPNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2CBEPNumLower = new GridBagConstraints();
		gbc_spinnerQuery2CBEPNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2CBEPNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2CBEPNumLower.gridx = 5;
		gbc_spinnerQuery2CBEPNumLower.gridy = 11;
		panel_query2.add(spinnerQuery2CBEPNumLower, gbc_spinnerQuery2CBEPNumLower);
		
		spinnerQuery2CBEPNumUpper = new JSpinner();
		spinnerQuery2CBEPNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2CBEPNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2CBEPNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2CBEPNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2CBEPNumUpper.gridx = 6;
		gbc_spinnerQuery2CBEPNumUpper.gridy = 11;
		panel_query2.add(spinnerQuery2CBEPNumUpper, gbc_spinnerQuery2CBEPNumUpper);
		
		labelQuery2PHOFW = new JLabel("PhilHealth-OFW");
		GridBagConstraints gbc_labelQuery2PHOFW = new GridBagConstraints();
		gbc_labelQuery2PHOFW.gridwidth = 3;
		gbc_labelQuery2PHOFW.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2PHOFW.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2PHOFW.gridx = 0;
		gbc_labelQuery2PHOFW.gridy = 12;
		panel_query2.add(labelQuery2PHOFW, gbc_labelQuery2PHOFW);
		
		comboBoxQuery2PHOFW = new JComboBox<String>();
		comboBoxQuery2PHOFW.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2PHOFW = new GridBagConstraints();
		gbc_comboBoxQuery2PHOFW.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2PHOFW.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2PHOFW.gridx = 3;
		gbc_comboBoxQuery2PHOFW.gridy = 12;
		panel_query2.add(comboBoxQuery2PHOFW, gbc_comboBoxQuery2PHOFW);
		
		labelQuery2PHOFWNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2PHOFWNum = new GridBagConstraints();
		gbc_labelQuery2PHOFWNum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2PHOFWNum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2PHOFWNum.gridx = 4;
		gbc_labelQuery2PHOFWNum.gridy = 12;
		panel_query2.add(labelQuery2PHOFWNum, gbc_labelQuery2PHOFWNum);
		
		spinnerQuery2PHOFWNumLower = new JSpinner();
		spinnerQuery2PHOFWNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2PHOFWNumLower = new GridBagConstraints();
		gbc_spinnerQuery2PHOFWNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2PHOFWNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2PHOFWNumLower.gridx = 5;
		gbc_spinnerQuery2PHOFWNumLower.gridy = 12;
		panel_query2.add(spinnerQuery2PHOFWNumLower, gbc_spinnerQuery2PHOFWNumLower);
		
		spinnerQuery2PHOFWNumUpper = new JSpinner();
		spinnerQuery2PHOFWNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2PHOFWNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2PHOFWNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2PHOFWNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2PHOFWNumUpper.gridx = 6;
		gbc_spinnerQuery2PHOFWNumUpper.gridy = 12;
		panel_query2.add(spinnerQuery2PHOFWNumUpper, gbc_spinnerQuery2PHOFWNumUpper);
		
		labelQuery2PHE = new JLabel("PhilHealth-Employed");
		GridBagConstraints gbc_labelQuery2PHE = new GridBagConstraints();
		gbc_labelQuery2PHE.gridwidth = 3;
		gbc_labelQuery2PHE.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2PHE.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2PHE.gridx = 0;
		gbc_labelQuery2PHE.gridy = 13;
		panel_query2.add(labelQuery2PHE, gbc_labelQuery2PHE);
		
		comboBoxQuery2PHE = new JComboBox<String>();
		comboBoxQuery2PHE.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2PHE = new GridBagConstraints();
		gbc_comboBoxQuery2PHE.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2PHE.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2PHE.gridx = 3;
		gbc_comboBoxQuery2PHE.gridy = 13;
		panel_query2.add(comboBoxQuery2PHE, gbc_comboBoxQuery2PHE);
		
		labelQuery2PHENum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2PHENum = new GridBagConstraints();
		gbc_labelQuery2PHENum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2PHENum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2PHENum.gridx = 4;
		gbc_labelQuery2PHENum.gridy = 13;
		panel_query2.add(labelQuery2PHENum, gbc_labelQuery2PHENum);
		
		spinnerQuery2PHENumLower = new JSpinner();
		spinnerQuery2PHENumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2PHENumLower = new GridBagConstraints();
		gbc_spinnerQuery2PHENumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2PHENumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2PHENumLower.gridx = 5;
		gbc_spinnerQuery2PHENumLower.gridy = 13;
		panel_query2.add(spinnerQuery2PHENumLower, gbc_spinnerQuery2PHENumLower);
		
		spinnerQuery2PHENumUpper = new JSpinner();
		spinnerQuery2PHENumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2PHENumUpper = new GridBagConstraints();
		gbc_spinnerQuery2PHENumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2PHENumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2PHENumUpper.gridx = 6;
		gbc_spinnerQuery2PHENumUpper.gridy = 13;
		panel_query2.add(spinnerQuery2PHENumUpper, gbc_spinnerQuery2PHENumUpper);
		
		labelQuery2PHIP = new JLabel("PhilHealth-Individually Paying");
		GridBagConstraints gbc_labelQuery2PHIP = new GridBagConstraints();
		gbc_labelQuery2PHIP.gridwidth = 3;
		gbc_labelQuery2PHIP.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2PHIP.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2PHIP.gridx = 0;
		gbc_labelQuery2PHIP.gridy = 14;
		panel_query2.add(labelQuery2PHIP, gbc_labelQuery2PHIP);
		
		comboBoxQuery2PHIP = new JComboBox<String>();
		comboBoxQuery2PHIP.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2PHIP = new GridBagConstraints();
		gbc_comboBoxQuery2PHIP.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2PHIP.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2PHIP.gridx = 3;
		gbc_comboBoxQuery2PHIP.gridy = 14;
		panel_query2.add(comboBoxQuery2PHIP, gbc_comboBoxQuery2PHIP);
		
		labelQuery2PHIPNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2PHIPNum = new GridBagConstraints();
		gbc_labelQuery2PHIPNum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2PHIPNum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2PHIPNum.gridx = 4;
		gbc_labelQuery2PHIPNum.gridy = 14;
		panel_query2.add(labelQuery2PHIPNum, gbc_labelQuery2PHIPNum);
		
		spinnerQuery2PHIPNumLower = new JSpinner();
		spinnerQuery2PHIPNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2PHIPNumLower = new GridBagConstraints();
		gbc_spinnerQuery2PHIPNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2PHIPNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2PHIPNumLower.gridx = 5;
		gbc_spinnerQuery2PHIPNumLower.gridy = 14;
		panel_query2.add(spinnerQuery2PHIPNumLower, gbc_spinnerQuery2PHIPNumLower);
		
		spinnerQuery2PHIPNumUpper = new JSpinner();
		spinnerQuery2PHIPNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2PHIPNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2PHIPNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2PHIPNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2PHIPNumUpper.gridx = 6;
		gbc_spinnerQuery2PHIPNumUpper.gridy = 14;
		panel_query2.add(spinnerQuery2PHIPNumUpper, gbc_spinnerQuery2PHIPNumUpper);
		
		labelQuery2PHS = new JLabel("PhilHealth-Sponsored");
		GridBagConstraints gbc_labelQuery2PHS = new GridBagConstraints();
		gbc_labelQuery2PHS.gridwidth = 3;
		gbc_labelQuery2PHS.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2PHS.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2PHS.gridx = 0;
		gbc_labelQuery2PHS.gridy = 15;
		panel_query2.add(labelQuery2PHS, gbc_labelQuery2PHS);
		
		comboBoxQuery2PHS = new JComboBox<String>();
		comboBoxQuery2PHS.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2PHS = new GridBagConstraints();
		gbc_comboBoxQuery2PHS.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2PHS.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2PHS.gridx = 3;
		gbc_comboBoxQuery2PHS.gridy = 15;
		panel_query2.add(comboBoxQuery2PHS, gbc_comboBoxQuery2PHS);
		
		labelQuery2PHSNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labelQuery2PHSNum = new GridBagConstraints();
		gbc_labelQuery2PHSNum.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2PHSNum.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2PHSNum.gridx = 4;
		gbc_labelQuery2PHSNum.gridy = 15;
		panel_query2.add(labelQuery2PHSNum, gbc_labelQuery2PHSNum);
		
		spinnerQuery2PHSNumLower = new JSpinner();
		spinnerQuery2PHSNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2PHSNumLower = new GridBagConstraints();
		gbc_spinnerQuery2PHSNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2PHSNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2PHSNumLower.gridx = 5;
		gbc_spinnerQuery2PHSNumLower.gridy = 15;
		panel_query2.add(spinnerQuery2PHSNumLower, gbc_spinnerQuery2PHSNumLower);
		
		spinnerQuery2PHSNumUpper = new JSpinner();
		spinnerQuery2PHSNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2PHSNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2PHSNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2PHSNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2PHSNumUpper.gridx = 6;
		gbc_spinnerQuery2PHSNumUpper.gridy = 15;
		panel_query2.add(spinnerQuery2PHSNumUpper, gbc_spinnerQuery2PHSNumUpper);
		
		labelQuery2PHL = new JLabel("PhilHealth-Lifetime");
		GridBagConstraints gbc_labelQuery2PHL = new GridBagConstraints();
		gbc_labelQuery2PHL.gridwidth = 3;
		gbc_labelQuery2PHL.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2PHL.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2PHL.gridx = 0;
		gbc_labelQuery2PHL.gridy = 16;
		panel_query2.add(labelQuery2PHL, gbc_labelQuery2PHL);
		
		comboBoxQuery2PHL = new JComboBox<String>();
		comboBoxQuery2PHL.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery2PHL = new GridBagConstraints();
		gbc_comboBoxQuery2PHL.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery2PHL.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery2PHL.gridx = 3;
		gbc_comboBoxQuery2PHL.gridy = 16;
		panel_query2.add(comboBoxQuery2PHL, gbc_comboBoxQuery2PHL);
		
		labellabelQuery2PHLNum = new JLabel("Receipients per Family");
		GridBagConstraints gbc_labellabelQuery2PHLNum = new GridBagConstraints();
		gbc_labellabelQuery2PHLNum.anchor = GridBagConstraints.EAST;
		gbc_labellabelQuery2PHLNum.insets = new Insets(0, 0, 5, 5);
		gbc_labellabelQuery2PHLNum.gridx = 4;
		gbc_labellabelQuery2PHLNum.gridy = 16;
		panel_query2.add(labellabelQuery2PHLNum, gbc_labellabelQuery2PHLNum);
		
		spinnerQuery2PHLNumLower = new JSpinner();
		spinnerQuery2PHLNumLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2PHLNumLower = new GridBagConstraints();
		gbc_spinnerQuery2PHLNumLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2PHLNumLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2PHLNumLower.gridx = 5;
		gbc_spinnerQuery2PHLNumLower.gridy = 16;
		panel_query2.add(spinnerQuery2PHLNumLower, gbc_spinnerQuery2PHLNumLower);
		
		spinnerQuery2PHLNumUpper = new JSpinner();
		spinnerQuery2PHLNumUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2PHLNumUpper = new GridBagConstraints();
		gbc_spinnerQuery2PHLNumUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2PHLNumUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2PHLNumUpper.gridx = 6;
		gbc_spinnerQuery2PHLNumUpper.gridy = 16;
		panel_query2.add(spinnerQuery2PHLNumUpper, gbc_spinnerQuery2PHLNumUpper);
		
		labelQuery2OtherPrograms = new JLabel("Other Programs Count");
		GridBagConstraints gbc_labelQuery2OtherPrograms = new GridBagConstraints();
		gbc_labelQuery2OtherPrograms.anchor = GridBagConstraints.EAST;
		gbc_labelQuery2OtherPrograms.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery2OtherPrograms.gridx = 4;
		gbc_labelQuery2OtherPrograms.gridy = 17;
		panel_query2.add(labelQuery2OtherPrograms, gbc_labelQuery2OtherPrograms);
		
		spinnerQuery2OtherProgramsLower = new JSpinner();
		spinnerQuery2OtherProgramsLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2OtherProgramsLower = new GridBagConstraints();
		gbc_spinnerQuery2OtherProgramsLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2OtherProgramsLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery2OtherProgramsLower.gridx = 5;
		gbc_spinnerQuery2OtherProgramsLower.gridy = 17;
		panel_query2.add(spinnerQuery2OtherProgramsLower, gbc_spinnerQuery2OtherProgramsLower);
		
		spinnerQuery2OtherProgramsUpper = new JSpinner();
		spinnerQuery2OtherProgramsUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery2OtherProgramsUpper = new GridBagConstraints();
		gbc_spinnerQuery2OtherProgramsUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery2OtherProgramsUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerQuery2OtherProgramsUpper.gridx = 6;
		gbc_spinnerQuery2OtherProgramsUpper.gridy = 17;
		panel_query2.add(spinnerQuery2OtherProgramsUpper, gbc_spinnerQuery2OtherProgramsUpper);
		
		buttonQuery2Query = new JButton("Query");
		GridBagConstraints gbc_buttonQuery2Query = new GridBagConstraints();
		gbc_buttonQuery2Query.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery2Query.gridwidth = 3;
		gbc_buttonQuery2Query.insets = new Insets(0, 0, 5, 0);
		gbc_buttonQuery2Query.gridx = 4;
		gbc_buttonQuery2Query.gridy = 18;
		panel_query2.add(buttonQuery2Query, gbc_buttonQuery2Query);
		
		scrollPaneQuery2ResultTable = new JScrollPane();
		GridBagConstraints gbc_scrollPaneQuery2ResultTable = new GridBagConstraints();
		gbc_scrollPaneQuery2ResultTable.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneQuery2ResultTable.gridwidth = 7;
		gbc_scrollPaneQuery2ResultTable.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPaneQuery2ResultTable.gridx = 0;
		gbc_scrollPaneQuery2ResultTable.gridy = 19;
		panel_query2.add(scrollPaneQuery2ResultTable, gbc_scrollPaneQuery2ResultTable);
		
		tableQuery2ResultTable = new JTable(){
		    
			private static final long serialVersionUID = 1L;
			@Override
		       public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		           Component component = super.prepareRenderer(renderer, row, column);
		           int rendererWidth = component.getPreferredSize().width;
		           TableColumn tableColumn = getColumnModel().getColumn(column);
		           tableColumn.setPreferredWidth(Math.max(rendererWidth + getIntercellSpacing().width, tableColumn.getPreferredWidth()));
		           return component;
		        }
		    };
		tableQuery2ResultTable.setAutoCreateRowSorter(true);
		tableQuery2ResultTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //IMPORTANT
		scrollPaneQuery2ResultTable.setViewportView(tableQuery2ResultTable);
		
		labelQuery2Status = new JLabel("");
		GridBagConstraints gbc_labelQuery2Status = new GridBagConstraints();
		gbc_labelQuery2Status.anchor = GridBagConstraints.SOUTHWEST;
		gbc_labelQuery2Status.gridwidth = 7;
		gbc_labelQuery2Status.insets = new Insets(0, 0, 0, 5);
		gbc_labelQuery2Status.gridx = 0;
		gbc_labelQuery2Status.gridy = 20;
		panel_query2.add(labelQuery2Status, gbc_labelQuery2Status);
		
		panel_query3 = new JPanel();
		contentPane.add(panel_query3, "panel_query3");
		GridBagLayout gbl_panel_query3 = new GridBagLayout();
		gbl_panel_query3.columnWidths = new int[]{10, 70, 90, 10, 60, 100, 10, 64, 98, 0};
		gbl_panel_query3.rowHeights = new int[]{50, 0, 0, 0, 520, -63, 0};
		gbl_panel_query3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_query3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_query3.setLayout(gbl_panel_query3);
		
		buttonQuery3Back = new JButton("<<");
		buttonQuery3Back.setFont(new Font("SansSerif", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery3Back = new GridBagConstraints();
		gbc_buttonQuery3Back.gridwidth = 2;
		gbc_buttonQuery3Back.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonQuery3Back.anchor = GridBagConstraints.WEST;
		gbc_buttonQuery3Back.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery3Back.gridx = 0;
		gbc_buttonQuery3Back.gridy = 0;
		panel_query3.add(buttonQuery3Back, gbc_buttonQuery3Back);
		
		labelQuery3 = new JLabel("Crop Area Report");
		labelQuery3.setFont(new Font("SansSerif", Font.BOLD, 20));
		GridBagConstraints gbc_labelQuery3 = new GridBagConstraints();
		gbc_labelQuery3.fill = GridBagConstraints.VERTICAL;
		gbc_labelQuery3.anchor = GridBagConstraints.WEST;
		gbc_labelQuery3.gridwidth = 7;
		gbc_labelQuery3.insets = new Insets(0, 0, 5, 0);
		gbc_labelQuery3.gridx = 2;
		gbc_labelQuery3.gridy = 0;
		panel_query3.add(labelQuery3, gbc_labelQuery3);
		
		checkBoxQuery3Municipality = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery3Municipality = new GridBagConstraints();
		gbc_checkBoxQuery3Municipality.fill = GridBagConstraints.BOTH;
		gbc_checkBoxQuery3Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery3Municipality.gridx = 0;
		gbc_checkBoxQuery3Municipality.gridy = 1;
		panel_query3.add(checkBoxQuery3Municipality, gbc_checkBoxQuery3Municipality);
		
		labelQuery3Municipality = new JLabel("by Municipality");
		GridBagConstraints gbc_labelQuery3Municipality = new GridBagConstraints();
		gbc_labelQuery3Municipality.anchor = GridBagConstraints.WEST;
		gbc_labelQuery3Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery3Municipality.gridx = 1;
		gbc_labelQuery3Municipality.gridy = 1;
		panel_query3.add(labelQuery3Municipality, gbc_labelQuery3Municipality);
		
		comboBoxQuery3Municipality = new JComboBox<String>();
		comboBoxQuery3Municipality.setEnabled(false);
		comboBoxQuery3Municipality.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6"}));
		GridBagConstraints gbc_comboBoxQuery3Municipality = new GridBagConstraints();
		gbc_comboBoxQuery3Municipality.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery3Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery3Municipality.gridx = 2;
		gbc_comboBoxQuery3Municipality.gridy = 1;
		panel_query3.add(comboBoxQuery3Municipality, gbc_comboBoxQuery3Municipality);
		
		checkBoxQuery3Zone = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery3Zone = new GridBagConstraints();
		gbc_checkBoxQuery3Zone.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery3Zone.gridx = 3;
		gbc_checkBoxQuery3Zone.gridy = 1;
		panel_query3.add(checkBoxQuery3Zone, gbc_checkBoxQuery3Zone);
		
		labelQuery3Zone = new JLabel("by Zone");
		GridBagConstraints gbc_labelQuery3Zone = new GridBagConstraints();
		gbc_labelQuery3Zone.anchor = GridBagConstraints.WEST;
		gbc_labelQuery3Zone.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery3Zone.gridx = 4;
		gbc_labelQuery3Zone.gridy = 1;
		panel_query3.add(labelQuery3Zone, gbc_labelQuery3Zone);
		
		comboBoxQuery3Zone = new JComboBox<String>();
		comboBoxQuery3Zone.setEnabled(false);
		comboBoxQuery3Zone.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "9", "13", "18", "19", "99"}));
		GridBagConstraints gbc_comboBoxQuery3Zone = new GridBagConstraints();
		gbc_comboBoxQuery3Zone.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery3Zone.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery3Zone.gridx = 5;
		gbc_comboBoxQuery3Zone.gridy = 1;
		panel_query3.add(comboBoxQuery3Zone, gbc_comboBoxQuery3Zone);
		
		checkBoxQuery3Barangay = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery3Barangay = new GridBagConstraints();
		gbc_checkBoxQuery3Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery3Barangay.gridx = 6;
		gbc_checkBoxQuery3Barangay.gridy = 1;
		panel_query3.add(checkBoxQuery3Barangay, gbc_checkBoxQuery3Barangay);
		
		labelQuery3Barangay = new JLabel("by Barangay");
		GridBagConstraints gbc_labelQuery3Barangay = new GridBagConstraints();
		gbc_labelQuery3Barangay.anchor = GridBagConstraints.WEST;
		gbc_labelQuery3Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery3Barangay.gridx = 7;
		gbc_labelQuery3Barangay.gridy = 1;
		panel_query3.add(labelQuery3Barangay, gbc_labelQuery3Barangay);
		
		comboBoxQuery3Barangay = new JComboBox<String>();
		comboBoxQuery3Barangay.setEnabled(false);
		comboBoxQuery3Barangay.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61"}));
		GridBagConstraints gbc_comboBoxQuery3Barangay = new GridBagConstraints();
		gbc_comboBoxQuery3Barangay.fill = GridBagConstraints.BOTH;
		gbc_comboBoxQuery3Barangay.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery3Barangay.gridx = 8;
		gbc_comboBoxQuery3Barangay.gridy = 1;
		panel_query3.add(comboBoxQuery3Barangay, gbc_comboBoxQuery3Barangay);
		
		checkBoxQuery3Purok = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery3Purok = new GridBagConstraints();
		gbc_checkBoxQuery3Purok.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery3Purok.gridx = 0;
		gbc_checkBoxQuery3Purok.gridy = 2;
		panel_query3.add(checkBoxQuery3Purok, gbc_checkBoxQuery3Purok);
		
		labelQuery3Purok = new JLabel("by Purok");
		GridBagConstraints gbc_labelQuery3Purok = new GridBagConstraints();
		gbc_labelQuery3Purok.anchor = GridBagConstraints.WEST;
		gbc_labelQuery3Purok.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery3Purok.gridx = 1;
		gbc_labelQuery3Purok.gridy = 2;
		panel_query3.add(labelQuery3Purok, gbc_labelQuery3Purok);
		
		comboBoxQuery3Purok = new JComboBox<String>();
		comboBoxQuery3Purok.setEnabled(false);
		comboBoxQuery3Purok.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "26", "99"}));
		GridBagConstraints gbc_comboBoxQuery3Purok = new GridBagConstraints();
		gbc_comboBoxQuery3Purok.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery3Purok.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery3Purok.gridx = 2;
		gbc_comboBoxQuery3Purok.gridy = 2;
		panel_query3.add(comboBoxQuery3Purok, gbc_comboBoxQuery3Purok);
		
		checkBoxQuery3CropType = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery3CropType = new GridBagConstraints();
		gbc_checkBoxQuery3CropType.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery3CropType.gridx = 3;
		gbc_checkBoxQuery3CropType.gridy = 2;
		panel_query3.add(checkBoxQuery3CropType, gbc_checkBoxQuery3CropType);
		
		labelQuery3CropType = new JLabel("by Crop Type");
		GridBagConstraints gbc_labelQuery3CropType = new GridBagConstraints();
		gbc_labelQuery3CropType.anchor = GridBagConstraints.WEST;
		gbc_labelQuery3CropType.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery3CropType.gridx = 4;
		gbc_labelQuery3CropType.gridy = 2;
		panel_query3.add(labelQuery3CropType, gbc_labelQuery3CropType);
		
		comboBoxQuery3CropType = new JComboBox<String>();
		comboBoxQuery3CropType.setEnabled(false);
		comboBoxQuery3CropType.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Sugar Cane", "Palay", "Corn", "Coffee", "Other Crops"}));
		GridBagConstraints gbc_comboBoxQuery3CropType = new GridBagConstraints();
		gbc_comboBoxQuery3CropType.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery3CropType.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery3CropType.gridx = 5;
		gbc_comboBoxQuery3CropType.gridy = 2;
		panel_query3.add(comboBoxQuery3CropType, gbc_comboBoxQuery3CropType);
		
		buttonQuery3Query = new JButton("Query");
		GridBagConstraints gbc_buttonQuery3Query = new GridBagConstraints();
		gbc_buttonQuery3Query.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery3Query.gridwidth = 2;
		gbc_buttonQuery3Query.insets = new Insets(0, 0, 5, 0);
		gbc_buttonQuery3Query.gridx = 7;
		gbc_buttonQuery3Query.gridy = 3;
		panel_query3.add(buttonQuery3Query, gbc_buttonQuery3Query);
		
		scrollPaneQuery3ResultTable = new JScrollPane();
		GridBagConstraints gbc_scrollPaneQuery3ResultTable = new GridBagConstraints();
		gbc_scrollPaneQuery3ResultTable.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneQuery3ResultTable.gridwidth = 9;
		gbc_scrollPaneQuery3ResultTable.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPaneQuery3ResultTable.gridx = 0;
		gbc_scrollPaneQuery3ResultTable.gridy = 4;
		panel_query3.add(scrollPaneQuery3ResultTable, gbc_scrollPaneQuery3ResultTable);
		
		tableQuery3ResultTable = new JTable(){
		    
			private static final long serialVersionUID = 1L;
			@Override
		       public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		           Component component = super.prepareRenderer(renderer, row, column);
		           int rendererWidth = component.getPreferredSize().width;
		           TableColumn tableColumn = getColumnModel().getColumn(column);
		           tableColumn.setPreferredWidth(Math.max(rendererWidth + getIntercellSpacing().width, tableColumn.getPreferredWidth()));
		           return component;
		        }
		    };
		tableQuery3ResultTable.setAutoCreateRowSorter(true);
		tableQuery3ResultTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //IMPORTANT
		scrollPaneQuery3ResultTable.setViewportView(tableQuery3ResultTable);
		
		labelQuery3Status = new JLabel("");
		GridBagConstraints gbc_labelQuery3Status = new GridBagConstraints();
		gbc_labelQuery3Status.anchor = GridBagConstraints.SOUTHWEST;
		gbc_labelQuery3Status.gridwidth = 9;
		gbc_labelQuery3Status.insets = new Insets(0, 0, 0, 5);
		gbc_labelQuery3Status.gridx = 0;
		gbc_labelQuery3Status.gridy = 5;
		panel_query3.add(labelQuery3Status, gbc_labelQuery3Status);
		
		panel_query4 = new JPanel();
		contentPane.add(panel_query4, "panel_query4");
		GridBagLayout gbl_panel_query4 = new GridBagLayout();
		gbl_panel_query4.columnWidths = new int[]{10, 70, 80, 10, 60, 90, 10, 64, 71, 0};
		gbl_panel_query4.rowHeights = new int[]{50, 0, 0, 0, 520, -63, 0};
		gbl_panel_query4.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_query4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_query4.setLayout(gbl_panel_query4);
		
		buttonQuery4Back = new JButton("<<");
		buttonQuery4Back.setFont(new Font("SansSerif", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery4Back = new GridBagConstraints();
		gbc_buttonQuery4Back.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonQuery4Back.anchor = GridBagConstraints.WEST;
		gbc_buttonQuery4Back.gridwidth = 2;
		gbc_buttonQuery4Back.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery4Back.gridx = 0;
		gbc_buttonQuery4Back.gridy = 0;
		panel_query4.add(buttonQuery4Back, gbc_buttonQuery4Back);
		
		labelQuery4 = new JLabel("Death Area Report");
		labelQuery4.setFont(new Font("SansSerif", Font.BOLD, 20));
		GridBagConstraints gbc_labelQuery4 = new GridBagConstraints();
		gbc_labelQuery4.fill = GridBagConstraints.VERTICAL;
		gbc_labelQuery4.anchor = GridBagConstraints.WEST;
		gbc_labelQuery4.gridwidth = 7;
		gbc_labelQuery4.insets = new Insets(0, 0, 5, 0);
		gbc_labelQuery4.gridx = 2;
		gbc_labelQuery4.gridy = 0;
		panel_query4.add(labelQuery4, gbc_labelQuery4);
		
		checkBoxQuery4Municipality = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery4Municipality = new GridBagConstraints();
		gbc_checkBoxQuery4Municipality.fill = GridBagConstraints.BOTH;
		gbc_checkBoxQuery4Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery4Municipality.gridx = 0;
		gbc_checkBoxQuery4Municipality.gridy = 1;
		panel_query4.add(checkBoxQuery4Municipality, gbc_checkBoxQuery4Municipality);
		
		labelQuery4Municipality = new JLabel("by Municipality");
		GridBagConstraints gbc_labelQuery4Municipality = new GridBagConstraints();
		gbc_labelQuery4Municipality.anchor = GridBagConstraints.WEST;
		gbc_labelQuery4Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery4Municipality.gridx = 1;
		gbc_labelQuery4Municipality.gridy = 1;
		panel_query4.add(labelQuery4Municipality, gbc_labelQuery4Municipality);
		
		comboBoxQuery4Municipality = new JComboBox<String>();
		comboBoxQuery4Municipality.setEnabled(false);
		comboBoxQuery4Municipality.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6"}));
		GridBagConstraints gbc_comboBoxQuery4Municipality = new GridBagConstraints();
		gbc_comboBoxQuery4Municipality.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery4Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery4Municipality.gridx = 2;
		gbc_comboBoxQuery4Municipality.gridy = 1;
		panel_query4.add(comboBoxQuery4Municipality, gbc_comboBoxQuery4Municipality);
		
		checkBoxQuery4Zone = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery4Zone = new GridBagConstraints();
		gbc_checkBoxQuery4Zone.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery4Zone.gridx = 3;
		gbc_checkBoxQuery4Zone.gridy = 1;
		panel_query4.add(checkBoxQuery4Zone, gbc_checkBoxQuery4Zone);
		
		labelQuery4Zone = new JLabel("by Zone");
		GridBagConstraints gbc_labelQuery4Zone = new GridBagConstraints();
		gbc_labelQuery4Zone.anchor = GridBagConstraints.WEST;
		gbc_labelQuery4Zone.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery4Zone.gridx = 4;
		gbc_labelQuery4Zone.gridy = 1;
		panel_query4.add(labelQuery4Zone, gbc_labelQuery4Zone);
		
		comboBoxQuery4Zone = new JComboBox<String>();
		comboBoxQuery4Zone.setEnabled(false);
		comboBoxQuery4Zone.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "9", "13", "18", "19", "99"}));
		GridBagConstraints gbc_comboBoxQuery4Zone = new GridBagConstraints();
		gbc_comboBoxQuery4Zone.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery4Zone.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery4Zone.gridx = 5;
		gbc_comboBoxQuery4Zone.gridy = 1;
		panel_query4.add(comboBoxQuery4Zone, gbc_comboBoxQuery4Zone);
		
		checkBoxQuery4Barangay = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery4Barangay = new GridBagConstraints();
		gbc_checkBoxQuery4Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery4Barangay.gridx = 6;
		gbc_checkBoxQuery4Barangay.gridy = 1;
		panel_query4.add(checkBoxQuery4Barangay, gbc_checkBoxQuery4Barangay);
		
		labelQuery4Barangay = new JLabel("by Barangay");
		GridBagConstraints gbc_labelQuery4Barangay = new GridBagConstraints();
		gbc_labelQuery4Barangay.anchor = GridBagConstraints.EAST;
		gbc_labelQuery4Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery4Barangay.gridx = 7;
		gbc_labelQuery4Barangay.gridy = 1;
		panel_query4.add(labelQuery4Barangay, gbc_labelQuery4Barangay);
		
		comboBoxQuery4Barangay = new JComboBox<String>();
		comboBoxQuery4Barangay.setEnabled(false);
		comboBoxQuery4Barangay.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61"}));
		GridBagConstraints gbc_comboBoxQuery4Barangay = new GridBagConstraints();
		gbc_comboBoxQuery4Barangay.fill = GridBagConstraints.BOTH;
		gbc_comboBoxQuery4Barangay.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery4Barangay.gridx = 8;
		gbc_comboBoxQuery4Barangay.gridy = 1;
		panel_query4.add(comboBoxQuery4Barangay, gbc_comboBoxQuery4Barangay);
		
		checkBoxQuery4Purok = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery4Purok = new GridBagConstraints();
		gbc_checkBoxQuery4Purok.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery4Purok.gridx = 0;
		gbc_checkBoxQuery4Purok.gridy = 2;
		panel_query4.add(checkBoxQuery4Purok, gbc_checkBoxQuery4Purok);
		
		labelQuery4Purok = new JLabel("by Purok");
		GridBagConstraints gbc_labelQuery4Purok = new GridBagConstraints();
		gbc_labelQuery4Purok.anchor = GridBagConstraints.WEST;
		gbc_labelQuery4Purok.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery4Purok.gridx = 1;
		gbc_labelQuery4Purok.gridy = 2;
		panel_query4.add(labelQuery4Purok, gbc_labelQuery4Purok);
		
		comboBoxQuery4Purok = new JComboBox<String>();
		comboBoxQuery4Purok.setEnabled(false);
		comboBoxQuery4Purok.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "26", "99"}));
		GridBagConstraints gbc_comboBoxQuery4Purok = new GridBagConstraints();
		gbc_comboBoxQuery4Purok.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery4Purok.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery4Purok.gridx = 2;
		gbc_comboBoxQuery4Purok.gridy = 2;
		panel_query4.add(comboBoxQuery4Purok, gbc_comboBoxQuery4Purok);
		
		checkBoxQuery4Pagkamatay = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery4Pagkamatay = new GridBagConstraints();
		gbc_checkBoxQuery4Pagkamatay.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery4Pagkamatay.gridx = 3;
		gbc_checkBoxQuery4Pagkamatay.gridy = 2;
		panel_query4.add(checkBoxQuery4Pagkamatay, gbc_checkBoxQuery4Pagkamatay);
		
		labelQuery4Pagkamatay = new JLabel("by Sanhi ng Pagkamatay");
		GridBagConstraints gbc_labelQuery4Pagkamatay = new GridBagConstraints();
		gbc_labelQuery4Pagkamatay.anchor = GridBagConstraints.WEST;
		gbc_labelQuery4Pagkamatay.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery4Pagkamatay.gridx = 4;
		gbc_labelQuery4Pagkamatay.gridy = 2;
		panel_query4.add(labelQuery4Pagkamatay, gbc_labelQuery4Pagkamatay);
		
		comboBoxQuery4Pagkamatay = new JComboBox<String>();
		comboBoxQuery4Pagkamatay.setEnabled(false);
		comboBoxQuery4Pagkamatay.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Diseases of the heart", "Diseases of the vascular system", "Pneumonia", "Tuberculosis", "Cancer", "Diarrhea", "Measles", "Complication during pregnancy or childbirth", "Accident", "Diabetes", "Disease of the lungs", "Disease of the kidney", "Drowned from flood", "Victim of landslide", "Electrocuted during typhoon", "Murder", "Other Causes"}));
		GridBagConstraints gbc_comboBoxQuery4Pagkamatay = new GridBagConstraints();
		gbc_comboBoxQuery4Pagkamatay.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery4Pagkamatay.gridwidth = 4;
		gbc_comboBoxQuery4Pagkamatay.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery4Pagkamatay.gridx = 5;
		gbc_comboBoxQuery4Pagkamatay.gridy = 2;
		panel_query4.add(comboBoxQuery4Pagkamatay, gbc_comboBoxQuery4Pagkamatay);
		
		buttonQuery4Query = new JButton("Query");
		GridBagConstraints gbc_buttonQuery4Query = new GridBagConstraints();
		gbc_buttonQuery4Query.gridwidth = 2;
		gbc_buttonQuery4Query.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery4Query.insets = new Insets(0, 0, 5, 0);
		gbc_buttonQuery4Query.gridx = 7;
		gbc_buttonQuery4Query.gridy = 3;
		panel_query4.add(buttonQuery4Query, gbc_buttonQuery4Query);
		
		scrollPaneQuery4ResultTable = new JScrollPane();
		GridBagConstraints gbc_scrollPaneQuery4ResultTable = new GridBagConstraints();
		gbc_scrollPaneQuery4ResultTable.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneQuery4ResultTable.gridwidth = 9;
		gbc_scrollPaneQuery4ResultTable.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneQuery4ResultTable.gridx = 0;
		gbc_scrollPaneQuery4ResultTable.gridy = 4;
		panel_query4.add(scrollPaneQuery4ResultTable, gbc_scrollPaneQuery4ResultTable);
		
		tableQuery4ResultTable = new JTable(){
		    
			private static final long serialVersionUID = 1L;
			@Override
		       public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		           Component component = super.prepareRenderer(renderer, row, column);
		           int rendererWidth = component.getPreferredSize().width;
		           TableColumn tableColumn = getColumnModel().getColumn(column);
		           tableColumn.setPreferredWidth(Math.max(rendererWidth + getIntercellSpacing().width, tableColumn.getPreferredWidth()));
		           return component;
		        }
		    };
		tableQuery4ResultTable.setAutoCreateRowSorter(true);
		tableQuery4ResultTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //IMPORTANT
		scrollPaneQuery4ResultTable.setViewportView(tableQuery4ResultTable);
		
		labelQuery4Status = new JLabel("");
		GridBagConstraints gbc_labelQuery4Status = new GridBagConstraints();
		gbc_labelQuery4Status.anchor = GridBagConstraints.SOUTHWEST;
		gbc_labelQuery4Status.gridwidth = 9;
		gbc_labelQuery4Status.insets = new Insets(0, 0, 0, 5);
		gbc_labelQuery4Status.gridx = 0;
		gbc_labelQuery4Status.gridy = 5;
		panel_query4.add(labelQuery4Status, gbc_labelQuery4Status);
		
		panel_query5 = new JPanel();
		contentPane.add(panel_query5, "panel_query5");
		GridBagLayout gbl_panel_query5 = new GridBagLayout();
		gbl_panel_query5.columnWidths = new int[]{10, 70, 90, 10, 60, 100, 10, 64, 98, 0};
		gbl_panel_query5.rowHeights = new int[]{50, 0, 0, 0, 520, -63, 0};
		gbl_panel_query5.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_query5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_query5.setLayout(gbl_panel_query5);
		
		buttonQuery5Back = new JButton("<<");
		buttonQuery5Back.setFont(new Font("SansSerif", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery5Back = new GridBagConstraints();
		gbc_buttonQuery5Back.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonQuery5Back.anchor = GridBagConstraints.WEST;
		gbc_buttonQuery5Back.gridwidth = 2;
		gbc_buttonQuery5Back.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery5Back.gridx = 0;
		gbc_buttonQuery5Back.gridy = 0;
		panel_query5.add(buttonQuery5Back, gbc_buttonQuery5Back);
		
		labelQuery5 = new JLabel("Fishing Equipment Area Report");
		labelQuery5.setFont(new Font("SansSerif", Font.BOLD, 20));
		GridBagConstraints gbc_labelQuery5 = new GridBagConstraints();
		gbc_labelQuery5.fill = GridBagConstraints.VERTICAL;
		gbc_labelQuery5.anchor = GridBagConstraints.WEST;
		gbc_labelQuery5.gridwidth = 7;
		gbc_labelQuery5.insets = new Insets(0, 0, 5, 0);
		gbc_labelQuery5.gridx = 2;
		gbc_labelQuery5.gridy = 0;
		panel_query5.add(labelQuery5, gbc_labelQuery5);
		
		checkBoxQuery5Municipality = new JCheckBox("");
		checkBoxQuery5Municipality.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_checkBoxQuery5Municipality = new GridBagConstraints();
		gbc_checkBoxQuery5Municipality.fill = GridBagConstraints.BOTH;
		gbc_checkBoxQuery5Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery5Municipality.gridx = 0;
		gbc_checkBoxQuery5Municipality.gridy = 1;
		panel_query5.add(checkBoxQuery5Municipality, gbc_checkBoxQuery5Municipality);
		
		labelQuery5Municipality = new JLabel("by Municipality");
		GridBagConstraints gbc_labelQuery5Municipality = new GridBagConstraints();
		gbc_labelQuery5Municipality.anchor = GridBagConstraints.WEST;
		gbc_labelQuery5Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery5Municipality.gridx = 1;
		gbc_labelQuery5Municipality.gridy = 1;
		panel_query5.add(labelQuery5Municipality, gbc_labelQuery5Municipality);
		
		comboBoxQuery5Municipality = new JComboBox<String>();
		comboBoxQuery5Municipality.setEnabled(false);
		comboBoxQuery5Municipality.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6"}));
		GridBagConstraints gbc_comboBoxQuery5Municipality = new GridBagConstraints();
		gbc_comboBoxQuery5Municipality.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery5Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery5Municipality.gridx = 2;
		gbc_comboBoxQuery5Municipality.gridy = 1;
		panel_query5.add(comboBoxQuery5Municipality, gbc_comboBoxQuery5Municipality);
		
		checkBoxQuery5Zone = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery5Zone = new GridBagConstraints();
		gbc_checkBoxQuery5Zone.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery5Zone.gridx = 3;
		gbc_checkBoxQuery5Zone.gridy = 1;
		panel_query5.add(checkBoxQuery5Zone, gbc_checkBoxQuery5Zone);
		
		labelQuery5Zone = new JLabel("by Zone");
		GridBagConstraints gbc_labelQuery5Zone = new GridBagConstraints();
		gbc_labelQuery5Zone.anchor = GridBagConstraints.WEST;
		gbc_labelQuery5Zone.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery5Zone.gridx = 4;
		gbc_labelQuery5Zone.gridy = 1;
		panel_query5.add(labelQuery5Zone, gbc_labelQuery5Zone);
		
		comboBoxQuery5Zone = new JComboBox<String>();
		comboBoxQuery5Zone.setEnabled(false);
		comboBoxQuery5Zone.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "9", "13", "18", "19", "99"}));
		GridBagConstraints gbc_comboBoxQuery5Zone = new GridBagConstraints();
		gbc_comboBoxQuery5Zone.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery5Zone.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery5Zone.gridx = 5;
		gbc_comboBoxQuery5Zone.gridy = 1;
		panel_query5.add(comboBoxQuery5Zone, gbc_comboBoxQuery5Zone);
		
		checkBoxQuery5Barangay = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery5Barangay = new GridBagConstraints();
		gbc_checkBoxQuery5Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery5Barangay.gridx = 6;
		gbc_checkBoxQuery5Barangay.gridy = 1;
		panel_query5.add(checkBoxQuery5Barangay, gbc_checkBoxQuery5Barangay);
		
		labelQuery5Barangay = new JLabel("by Barangay");
		GridBagConstraints gbc_labelQuery5Barangay = new GridBagConstraints();
		gbc_labelQuery5Barangay.anchor = GridBagConstraints.WEST;
		gbc_labelQuery5Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery5Barangay.gridx = 7;
		gbc_labelQuery5Barangay.gridy = 1;
		panel_query5.add(labelQuery5Barangay, gbc_labelQuery5Barangay);
		
		comboBoxQuery5Barangay = new JComboBox<String>();
		comboBoxQuery5Barangay.setEnabled(false);
		comboBoxQuery5Barangay.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61"}));
		GridBagConstraints gbc_comboBoxQuery5Barangay = new GridBagConstraints();
		gbc_comboBoxQuery5Barangay.fill = GridBagConstraints.BOTH;
		gbc_comboBoxQuery5Barangay.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery5Barangay.gridx = 8;
		gbc_comboBoxQuery5Barangay.gridy = 1;
		panel_query5.add(comboBoxQuery5Barangay, gbc_comboBoxQuery5Barangay);
		
		checkBoxQuery5Purok = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery5Purok = new GridBagConstraints();
		gbc_checkBoxQuery5Purok.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery5Purok.gridx = 0;
		gbc_checkBoxQuery5Purok.gridy = 2;
		panel_query5.add(checkBoxQuery5Purok, gbc_checkBoxQuery5Purok);
		
		labelQuery5Purok = new JLabel("by Purok");
		GridBagConstraints gbc_labelQuery5Purok = new GridBagConstraints();
		gbc_labelQuery5Purok.anchor = GridBagConstraints.WEST;
		gbc_labelQuery5Purok.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery5Purok.gridx = 1;
		gbc_labelQuery5Purok.gridy = 2;
		panel_query5.add(labelQuery5Purok, gbc_labelQuery5Purok);
		
		comboBoxQuery5Purok = new JComboBox<String>();
		comboBoxQuery5Purok.setEnabled(false);
		comboBoxQuery5Purok.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "26", "99"}));
		GridBagConstraints gbc_comboBoxQuery5Purok = new GridBagConstraints();
		gbc_comboBoxQuery5Purok.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery5Purok.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery5Purok.gridx = 2;
		gbc_comboBoxQuery5Purok.gridy = 2;
		panel_query5.add(comboBoxQuery5Purok, gbc_comboBoxQuery5Purok);
		
		checkBoxQuery5Kagamitan = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery5Kagamitan = new GridBagConstraints();
		gbc_checkBoxQuery5Kagamitan.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery5Kagamitan.gridx = 3;
		gbc_checkBoxQuery5Kagamitan.gridy = 2;
		panel_query5.add(checkBoxQuery5Kagamitan, gbc_checkBoxQuery5Kagamitan);
		
		labelQuery5Kagamitan = new JLabel("by Uri ng Kagamitang Pangingisda");
		GridBagConstraints gbc_labelQuery5Kagamitan = new GridBagConstraints();
		gbc_labelQuery5Kagamitan.gridwidth = 2;
		gbc_labelQuery5Kagamitan.anchor = GridBagConstraints.WEST;
		gbc_labelQuery5Kagamitan.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery5Kagamitan.gridx = 4;
		gbc_labelQuery5Kagamitan.gridy = 2;
		panel_query5.add(labelQuery5Kagamitan, gbc_labelQuery5Kagamitan);
		
		comboBoxQuery5Kagamitan = new JComboBox<String>();
		comboBoxQuery5Kagamitan.setEnabled(false);
		comboBoxQuery5Kagamitan.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Fish net", "Electricity", "Bagnets", "Gillnets", "Traps", "Hooks and line", "Sift net", "Others"}));
		GridBagConstraints gbc_comboBoxQuery5Kagamitan = new GridBagConstraints();
		gbc_comboBoxQuery5Kagamitan.gridwidth = 3;
		gbc_comboBoxQuery5Kagamitan.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery5Kagamitan.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery5Kagamitan.gridx = 6;
		gbc_comboBoxQuery5Kagamitan.gridy = 2;
		panel_query5.add(comboBoxQuery5Kagamitan, gbc_comboBoxQuery5Kagamitan);
		
		buttonQuery5Query = new JButton("Query");
		GridBagConstraints gbc_buttonQuery5Query = new GridBagConstraints();
		gbc_buttonQuery5Query.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery5Query.gridwidth = 2;
		gbc_buttonQuery5Query.insets = new Insets(0, 0, 5, 0);
		gbc_buttonQuery5Query.gridx = 7;
		gbc_buttonQuery5Query.gridy = 3;
		panel_query5.add(buttonQuery5Query, gbc_buttonQuery5Query);
		
		scrollPaneQuery5ResultTable = new JScrollPane();
		GridBagConstraints gbc_scrollPaneQuery5ResultTable = new GridBagConstraints();
		gbc_scrollPaneQuery5ResultTable.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneQuery5ResultTable.gridwidth = 9;
		gbc_scrollPaneQuery5ResultTable.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneQuery5ResultTable.gridx = 0;
		gbc_scrollPaneQuery5ResultTable.gridy = 4;
		panel_query5.add(scrollPaneQuery5ResultTable, gbc_scrollPaneQuery5ResultTable);
		
		tableQuery5ResultTable = new JTable();
		tableQuery5ResultTable.setAutoCreateRowSorter(true);
		scrollPaneQuery5ResultTable.setViewportView(tableQuery5ResultTable);
		
		labelQuery5Status = new JLabel("");
		GridBagConstraints gbc_labelQuery5Status = new GridBagConstraints();
		gbc_labelQuery5Status.anchor = GridBagConstraints.SOUTHWEST;
		gbc_labelQuery5Status.gridwidth = 9;
		gbc_labelQuery5Status.insets = new Insets(0, 0, 0, 5);
		gbc_labelQuery5Status.gridx = 0;
		gbc_labelQuery5Status.gridy = 5;
		panel_query5.add(labelQuery5Status, gbc_labelQuery5Status);
		
		panel_query6 = new JPanel();
		contentPane.add(panel_query6, "panel_query6");
		GridBagLayout gbl_panel_query6 = new GridBagLayout();
		gbl_panel_query6.columnWidths = new int[]{10, 70, 90, 10, 60, 100, 10, 64, 98, 0};
		gbl_panel_query6.rowHeights = new int[]{50, 0, 0, 0, 520, -63, 0};
		gbl_panel_query6.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_query6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_query6.setLayout(gbl_panel_query6);
		
		buttonQuery6Back = new JButton("<<");
		buttonQuery6Back.setFont(new Font("SansSerif", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery6Back = new GridBagConstraints();
		gbc_buttonQuery6Back.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonQuery6Back.anchor = GridBagConstraints.WEST;
		gbc_buttonQuery6Back.gridwidth = 2;
		gbc_buttonQuery6Back.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery6Back.gridx = 0;
		gbc_buttonQuery6Back.gridy = 0;
		panel_query6.add(buttonQuery6Back, gbc_buttonQuery6Back);
		
		labelQuery6 = new JLabel("Fishery and Crop Income Area Report");
		labelQuery6.setFont(new Font("SansSerif", Font.BOLD, 20));
		GridBagConstraints gbc_labelQuery6 = new GridBagConstraints();
		gbc_labelQuery6.fill = GridBagConstraints.VERTICAL;
		gbc_labelQuery6.anchor = GridBagConstraints.WEST;
		gbc_labelQuery6.gridwidth = 7;
		gbc_labelQuery6.insets = new Insets(0, 0, 5, 0);
		gbc_labelQuery6.gridx = 2;
		gbc_labelQuery6.gridy = 0;
		panel_query6.add(labelQuery6, gbc_labelQuery6);
		
		checkBoxQuery6Municipality = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery6Municipality = new GridBagConstraints();
		gbc_checkBoxQuery6Municipality.fill = GridBagConstraints.VERTICAL;
		gbc_checkBoxQuery6Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery6Municipality.gridx = 0;
		gbc_checkBoxQuery6Municipality.gridy = 1;
		panel_query6.add(checkBoxQuery6Municipality, gbc_checkBoxQuery6Municipality);
		
		labelQuery6Municipality = new JLabel("by Municipality");
		GridBagConstraints gbc_labelQuery6Municipality = new GridBagConstraints();
		gbc_labelQuery6Municipality.anchor = GridBagConstraints.WEST;
		gbc_labelQuery6Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery6Municipality.gridx = 1;
		gbc_labelQuery6Municipality.gridy = 1;
		panel_query6.add(labelQuery6Municipality, gbc_labelQuery6Municipality);
		
		comboBoxQuery6Municipality = new JComboBox<String>();
		comboBoxQuery6Municipality.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6"}));
		comboBoxQuery6Municipality.setEnabled(false);
		GridBagConstraints gbc_comboBoxQuery6Municipality = new GridBagConstraints();
		gbc_comboBoxQuery6Municipality.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery6Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery6Municipality.gridx = 2;
		gbc_comboBoxQuery6Municipality.gridy = 1;
		panel_query6.add(comboBoxQuery6Municipality, gbc_comboBoxQuery6Municipality);
		
		checkBoxQuery6Zone = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery6Zone = new GridBagConstraints();
		gbc_checkBoxQuery6Zone.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery6Zone.gridx = 3;
		gbc_checkBoxQuery6Zone.gridy = 1;
		panel_query6.add(checkBoxQuery6Zone, gbc_checkBoxQuery6Zone);
		
		labelQuery6Zone = new JLabel("by Zone");
		GridBagConstraints gbc_labelQuery6Zone = new GridBagConstraints();
		gbc_labelQuery6Zone.anchor = GridBagConstraints.WEST;
		gbc_labelQuery6Zone.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery6Zone.gridx = 4;
		gbc_labelQuery6Zone.gridy = 1;
		panel_query6.add(labelQuery6Zone, gbc_labelQuery6Zone);
		
		comboBoxQuery6Zone = new JComboBox<String>();
		comboBoxQuery6Zone.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "9", "13", "18", "19", "99"}));
		comboBoxQuery6Zone.setEnabled(false);
		GridBagConstraints gbc_comboBoxQuery6Zone = new GridBagConstraints();
		gbc_comboBoxQuery6Zone.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery6Zone.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery6Zone.gridx = 5;
		gbc_comboBoxQuery6Zone.gridy = 1;
		panel_query6.add(comboBoxQuery6Zone, gbc_comboBoxQuery6Zone);
		
		checkBoxQuery6Barangay = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery6Barangay = new GridBagConstraints();
		gbc_checkBoxQuery6Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery6Barangay.gridx = 6;
		gbc_checkBoxQuery6Barangay.gridy = 1;
		panel_query6.add(checkBoxQuery6Barangay, gbc_checkBoxQuery6Barangay);
		
		labelQuery6Barangay = new JLabel("by Barangay");
		GridBagConstraints gbc_labelQuery6Barangay = new GridBagConstraints();
		gbc_labelQuery6Barangay.anchor = GridBagConstraints.WEST;
		gbc_labelQuery6Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery6Barangay.gridx = 7;
		gbc_labelQuery6Barangay.gridy = 1;
		panel_query6.add(labelQuery6Barangay, gbc_labelQuery6Barangay);
		
		comboBoxQuery6Barangay = new JComboBox<String>();
		comboBoxQuery6Barangay.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61"}));
		comboBoxQuery6Barangay.setEnabled(false);
		GridBagConstraints gbc_comboBoxQuery6Barangay = new GridBagConstraints();
		gbc_comboBoxQuery6Barangay.fill = GridBagConstraints.BOTH;
		gbc_comboBoxQuery6Barangay.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery6Barangay.gridx = 8;
		gbc_comboBoxQuery6Barangay.gridy = 1;
		panel_query6.add(comboBoxQuery6Barangay, gbc_comboBoxQuery6Barangay);
		
		checkBoxQuery6Purok = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery6Purok = new GridBagConstraints();
		gbc_checkBoxQuery6Purok.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery6Purok.gridx = 0;
		gbc_checkBoxQuery6Purok.gridy = 2;
		panel_query6.add(checkBoxQuery6Purok, gbc_checkBoxQuery6Purok);
		
		labelQuery6Purok = new JLabel("by Purok");
		GridBagConstraints gbc_labelQuery6Purok = new GridBagConstraints();
		gbc_labelQuery6Purok.anchor = GridBagConstraints.WEST;
		gbc_labelQuery6Purok.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery6Purok.gridx = 1;
		gbc_labelQuery6Purok.gridy = 2;
		panel_query6.add(labelQuery6Purok, gbc_labelQuery6Purok);
		
		comboBoxQuery6Purok = new JComboBox<String>();
		comboBoxQuery6Purok.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "26", "99"}));
		comboBoxQuery6Purok.setEnabled(false);
		GridBagConstraints gbc_comboBoxQuery6Purok = new GridBagConstraints();
		gbc_comboBoxQuery6Purok.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery6Purok.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery6Purok.gridx = 2;
		gbc_comboBoxQuery6Purok.gridy = 2;
		panel_query6.add(comboBoxQuery6Purok, gbc_comboBoxQuery6Purok);
		
		buttonQuery6Query = new JButton("Query");
		GridBagConstraints gbc_buttonQuery6Query = new GridBagConstraints();
		gbc_buttonQuery6Query.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery6Query.gridwidth = 2;
		gbc_buttonQuery6Query.insets = new Insets(0, 0, 5, 0);
		gbc_buttonQuery6Query.gridx = 7;
		gbc_buttonQuery6Query.gridy = 3;
		panel_query6.add(buttonQuery6Query, gbc_buttonQuery6Query);
		
		scrollPaneQuery6ResultTable = new JScrollPane();
		GridBagConstraints gbc_scrollPaneQuery6ResultTable = new GridBagConstraints();
		gbc_scrollPaneQuery6ResultTable.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneQuery6ResultTable.gridwidth = 9;
		gbc_scrollPaneQuery6ResultTable.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneQuery6ResultTable.gridx = 0;
		gbc_scrollPaneQuery6ResultTable.gridy = 4;
		panel_query6.add(scrollPaneQuery6ResultTable, gbc_scrollPaneQuery6ResultTable);
		
		tableQuery6ResultTable = new JTable(){
		    
			private static final long serialVersionUID = 1L;
			@Override
		       public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		           Component component = super.prepareRenderer(renderer, row, column);
		           int rendererWidth = component.getPreferredSize().width;
		           TableColumn tableColumn = getColumnModel().getColumn(column);
		           tableColumn.setPreferredWidth(Math.max(rendererWidth + getIntercellSpacing().width, tableColumn.getPreferredWidth()));
		           return component;
		        }
		    };
		tableQuery6ResultTable.setAutoCreateRowSorter(true);
		tableQuery6ResultTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //IMPORTANT
		tableQuery6ResultTable.setAutoCreateRowSorter(true);
		scrollPaneQuery6ResultTable.setViewportView(tableQuery6ResultTable);
		
		labelQuery6Status = new JLabel("");
		GridBagConstraints gbc_labelQuery6Status = new GridBagConstraints();
		gbc_labelQuery6Status.anchor = GridBagConstraints.SOUTHWEST;
		gbc_labelQuery6Status.gridwidth = 9;
		gbc_labelQuery6Status.insets = new Insets(0, 0, 0, 5);
		gbc_labelQuery6Status.gridx = 0;
		gbc_labelQuery6Status.gridy = 5;
		panel_query6.add(labelQuery6Status, gbc_labelQuery6Status);
		
		panel_query7 = new JPanel();
		contentPane.add(panel_query7, "panel_query7");
		GridBagLayout gbl_panel_query7 = new GridBagLayout();
		gbl_panel_query7.columnWidths = new int[]{35, 85, 40, 30, 10, 60, 30, 30, 10, 64, 98, 0};
		gbl_panel_query7.rowHeights = new int[]{50, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 295, -63, 0};
		gbl_panel_query7.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_query7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_query7.setLayout(gbl_panel_query7);
		
		buttonQuery7Back = new JButton("<<");
		buttonQuery7Back.setFont(new Font("SansSerif", Font.PLAIN, 14));
		GridBagConstraints gbc_buttonQuery7Back = new GridBagConstraints();
		gbc_buttonQuery7Back.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonQuery7Back.anchor = GridBagConstraints.WEST;
		gbc_buttonQuery7Back.gridwidth = 2;
		gbc_buttonQuery7Back.insets = new Insets(0, 0, 5, 5);
		gbc_buttonQuery7Back.gridx = 0;
		gbc_buttonQuery7Back.gridy = 0;
		panel_query7.add(buttonQuery7Back, gbc_buttonQuery7Back);
		
		labelQuery7 = new JLabel("Agricultural Status Area Report");
		labelQuery7.setFont(new Font("SansSerif", Font.BOLD, 20));
		GridBagConstraints gbc_labelQuery7 = new GridBagConstraints();
		gbc_labelQuery7.fill = GridBagConstraints.VERTICAL;
		gbc_labelQuery7.anchor = GridBagConstraints.WEST;
		gbc_labelQuery7.gridwidth = 9;
		gbc_labelQuery7.insets = new Insets(0, 0, 5, 0);
		gbc_labelQuery7.gridx = 2;
		gbc_labelQuery7.gridy = 0;
		panel_query7.add(labelQuery7, gbc_labelQuery7);
		
		checkBoxQuery7Municipality = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery7Municipality = new GridBagConstraints();
		gbc_checkBoxQuery7Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery7Municipality.gridx = 0;
		gbc_checkBoxQuery7Municipality.gridy = 1;
		panel_query7.add(checkBoxQuery7Municipality, gbc_checkBoxQuery7Municipality);
		
		labelQuery7Municipality = new JLabel("by Municipality");
		GridBagConstraints gbc_labelQuery7Municipality = new GridBagConstraints();
		gbc_labelQuery7Municipality.anchor = GridBagConstraints.WEST;
		gbc_labelQuery7Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Municipality.gridx = 1;
		gbc_labelQuery7Municipality.gridy = 1;
		panel_query7.add(labelQuery7Municipality, gbc_labelQuery7Municipality);
		
		comboBoxQuery7Municipality = new JComboBox<String>();
		comboBoxQuery7Municipality.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6"}));
		comboBoxQuery7Municipality.setEnabled(false);
		GridBagConstraints gbc_comboBoxQuery7Municipality = new GridBagConstraints();
		gbc_comboBoxQuery7Municipality.gridwidth = 2;
		gbc_comboBoxQuery7Municipality.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Municipality.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7Municipality.gridx = 2;
		gbc_comboBoxQuery7Municipality.gridy = 1;
		panel_query7.add(comboBoxQuery7Municipality, gbc_comboBoxQuery7Municipality);
		
		checkBoxQuery7Zone = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery7Zone = new GridBagConstraints();
		gbc_checkBoxQuery7Zone.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery7Zone.gridx = 4;
		gbc_checkBoxQuery7Zone.gridy = 1;
		panel_query7.add(checkBoxQuery7Zone, gbc_checkBoxQuery7Zone);
		
		labelQuery7Zone = new JLabel("by Zone");
		GridBagConstraints gbc_labelQuery7Zone = new GridBagConstraints();
		gbc_labelQuery7Zone.anchor = GridBagConstraints.WEST;
		gbc_labelQuery7Zone.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Zone.gridx = 5;
		gbc_labelQuery7Zone.gridy = 1;
		panel_query7.add(labelQuery7Zone, gbc_labelQuery7Zone);
		
		comboBoxQuery7Zone = new JComboBox<String>();
		comboBoxQuery7Zone.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "9", "13", "18", "19", "99"}));
		comboBoxQuery7Zone.setEnabled(false);
		GridBagConstraints gbc_comboBoxQuery7Zone = new GridBagConstraints();
		gbc_comboBoxQuery7Zone.gridwidth = 2;
		gbc_comboBoxQuery7Zone.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Zone.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7Zone.gridx = 6;
		gbc_comboBoxQuery7Zone.gridy = 1;
		panel_query7.add(comboBoxQuery7Zone, gbc_comboBoxQuery7Zone);
		
		checkBoxQuery7Barangay = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery7Barangay = new GridBagConstraints();
		gbc_checkBoxQuery7Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery7Barangay.gridx = 8;
		gbc_checkBoxQuery7Barangay.gridy = 1;
		panel_query7.add(checkBoxQuery7Barangay, gbc_checkBoxQuery7Barangay);
		
		labelQuery7Barangay = new JLabel("by Barangay");
		GridBagConstraints gbc_labelQuery7Barangay = new GridBagConstraints();
		gbc_labelQuery7Barangay.anchor = GridBagConstraints.WEST;
		gbc_labelQuery7Barangay.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Barangay.gridx = 9;
		gbc_labelQuery7Barangay.gridy = 1;
		panel_query7.add(labelQuery7Barangay, gbc_labelQuery7Barangay);
		
		comboBoxQuery7Barangay = new JComboBox<String>();
		comboBoxQuery7Barangay.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61"}));
		comboBoxQuery7Barangay.setEnabled(false);
		GridBagConstraints gbc_comboBoxQuery7Barangay = new GridBagConstraints();
		gbc_comboBoxQuery7Barangay.fill = GridBagConstraints.BOTH;
		gbc_comboBoxQuery7Barangay.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery7Barangay.gridx = 10;
		gbc_comboBoxQuery7Barangay.gridy = 1;
		panel_query7.add(comboBoxQuery7Barangay, gbc_comboBoxQuery7Barangay);
		
		checkBoxQuery7Purok = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery7Purok = new GridBagConstraints();
		gbc_checkBoxQuery7Purok.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery7Purok.gridx = 0;
		gbc_checkBoxQuery7Purok.gridy = 2;
		panel_query7.add(checkBoxQuery7Purok, gbc_checkBoxQuery7Purok);
		
		labelQuery7Purok = new JLabel("by Purok");
		GridBagConstraints gbc_labelQuery7Purok = new GridBagConstraints();
		gbc_labelQuery7Purok.anchor = GridBagConstraints.WEST;
		gbc_labelQuery7Purok.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Purok.gridx = 1;
		gbc_labelQuery7Purok.gridy = 2;
		panel_query7.add(labelQuery7Purok, gbc_labelQuery7Purok);
		
		comboBoxQuery7Purok = new JComboBox<String>();
		comboBoxQuery7Purok.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "26", "99"}));
		comboBoxQuery7Purok.setEnabled(false);
		GridBagConstraints gbc_comboBoxQuery7Purok = new GridBagConstraints();
		gbc_comboBoxQuery7Purok.gridwidth = 2;
		gbc_comboBoxQuery7Purok.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Purok.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7Purok.gridx = 2;
		gbc_comboBoxQuery7Purok.gridy = 2;
		panel_query7.add(comboBoxQuery7Purok, gbc_comboBoxQuery7Purok);
		
		checkBoxQuery7CropType = new JCheckBox("");
		GridBagConstraints gbc_checkBoxQuery7CropType = new GridBagConstraints();
		gbc_checkBoxQuery7CropType.insets = new Insets(0, 0, 5, 5);
		gbc_checkBoxQuery7CropType.gridx = 4;
		gbc_checkBoxQuery7CropType.gridy = 2;
		panel_query7.add(checkBoxQuery7CropType, gbc_checkBoxQuery7CropType);
		
		labelQuery7CropType = new JLabel("by Crop Type");
		GridBagConstraints gbc_labelQuery7CropType = new GridBagConstraints();
		gbc_labelQuery7CropType.anchor = GridBagConstraints.WEST;
		gbc_labelQuery7CropType.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7CropType.gridx = 5;
		gbc_labelQuery7CropType.gridy = 2;
		panel_query7.add(labelQuery7CropType, gbc_labelQuery7CropType);
		
		comboBoxQuery7CropType = new JComboBox<String>();
		comboBoxQuery7CropType.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Sugar Cane", "Palay", "Corn", "Coffee", "Other Crops"}));
		comboBoxQuery7CropType.setEnabled(false);
		GridBagConstraints gbc_comboBoxQuery7CropType = new GridBagConstraints();
		gbc_comboBoxQuery7CropType.gridwidth = 2;
		gbc_comboBoxQuery7CropType.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7CropType.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7CropType.gridx = 6;
		gbc_comboBoxQuery7CropType.gridy = 2;
		panel_query7.add(comboBoxQuery7CropType, gbc_comboBoxQuery7CropType);
		
		labelQuery7Age = new JLabel("Age of person");
		GridBagConstraints gbc_labelQuery7Age = new GridBagConstraints();
		gbc_labelQuery7Age.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7Age.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Age.gridx = 1;
		gbc_labelQuery7Age.gridy = 3;
		panel_query7.add(labelQuery7Age, gbc_labelQuery7Age);
		
		spinnerQuery7AgeLower = new JSpinner();
		spinnerQuery7AgeLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery7AgeLower = new GridBagConstraints();
		gbc_spinnerQuery7AgeLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery7AgeLower.anchor = GridBagConstraints.WEST;
		gbc_spinnerQuery7AgeLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery7AgeLower.gridx = 2;
		gbc_spinnerQuery7AgeLower.gridy = 3;
		panel_query7.add(spinnerQuery7AgeLower, gbc_spinnerQuery7AgeLower);
		
		spinnerQuery7AgeUpper = new JSpinner();
		spinnerQuery7AgeUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery7AgeUpper = new GridBagConstraints();
		gbc_spinnerQuery7AgeUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery7AgeUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery7AgeUpper.gridx = 3;
		gbc_spinnerQuery7AgeUpper.gridy = 3;
		panel_query7.add(spinnerQuery7AgeUpper, gbc_spinnerQuery7AgeUpper);
		
		labelQuery7YearFarming = new JLabel("Years Farming");
		GridBagConstraints gbc_labelQuery7YearFarming = new GridBagConstraints();
		gbc_labelQuery7YearFarming.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7YearFarming.gridx = 5;
		gbc_labelQuery7YearFarming.gridy = 3;
		panel_query7.add(labelQuery7YearFarming, gbc_labelQuery7YearFarming);
		
		spinnerQuery7YearFarmingLower = new JSpinner();
		spinnerQuery7YearFarmingLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery7YearFarmingLower = new GridBagConstraints();
		gbc_spinnerQuery7YearFarmingLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery7YearFarmingLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery7YearFarmingLower.gridx = 6;
		gbc_spinnerQuery7YearFarmingLower.gridy = 3;
		panel_query7.add(spinnerQuery7YearFarmingLower, gbc_spinnerQuery7YearFarmingLower);
		
		spinnerQuery7YearFarmingUpper = new JSpinner();
		spinnerQuery7YearFarmingUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerQuery7YearFarmingUpper = new GridBagConstraints();
		gbc_spinnerQuery7YearFarmingUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerQuery7YearFarmingUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerQuery7YearFarmingUpper.gridx = 7;
		gbc_spinnerQuery7YearFarmingUpper.gridy = 3;
		panel_query7.add(spinnerQuery7YearFarmingUpper, gbc_spinnerQuery7YearFarmingUpper);
		
		labelQuery7ARCDP = new JLabel("ARCDP");
		GridBagConstraints gbc_labelQuery7ARCDP = new GridBagConstraints();
		gbc_labelQuery7ARCDP.gridwidth = 2;
		gbc_labelQuery7ARCDP.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7ARCDP.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7ARCDP.gridx = 8;
		gbc_labelQuery7ARCDP.gridy = 3;
		panel_query7.add(labelQuery7ARCDP, gbc_labelQuery7ARCDP);
		
		comboBoxQuery7ARCDP = new JComboBox<String>();
		comboBoxQuery7ARCDP.setModel(new DefaultComboBoxModel<String>(new String[] {"Nakatanggap", "Hindi Nakatanggap"}));
		GridBagConstraints gbc_comboBoxQuery7ARCDP = new GridBagConstraints();
		gbc_comboBoxQuery7ARCDP.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery7ARCDP.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7ARCDP.gridx = 10;
		gbc_comboBoxQuery7ARCDP.gridy = 3;
		panel_query7.add(comboBoxQuery7ARCDP, gbc_comboBoxQuery7ARCDP);
		
		labelQuery7AgriculturalRecord = new JLabel("Agricultural Record");
		labelQuery7AgriculturalRecord.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_labelQuery7AgriculturalRecord = new GridBagConstraints();
		gbc_labelQuery7AgriculturalRecord.gridwidth = 11;
		gbc_labelQuery7AgriculturalRecord.insets = new Insets(0, 0, 5, 0);
		gbc_labelQuery7AgriculturalRecord.gridx = 0;
		gbc_labelQuery7AgriculturalRecord.gridy = 4;
		panel_query7.add(labelQuery7AgriculturalRecord, gbc_labelQuery7AgriculturalRecord);
		
		labelQuery7BeastOfBurden = new JLabel("Beast of Burden");
		GridBagConstraints gbc_labelQuery7BeastOfBurden = new GridBagConstraints();
		gbc_labelQuery7BeastOfBurden.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7BeastOfBurden.gridwidth = 2;
		gbc_labelQuery7BeastOfBurden.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7BeastOfBurden.gridx = 0;
		gbc_labelQuery7BeastOfBurden.gridy = 5;
		panel_query7.add(labelQuery7BeastOfBurden, gbc_labelQuery7BeastOfBurden);
		
		comboBoxQuery7BeastOfBurden = new JComboBox<String>();
		comboBoxQuery7BeastOfBurden.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7BeastOfBurden = new GridBagConstraints();
		gbc_comboBoxQuery7BeastOfBurden.gridwidth = 2;
		gbc_comboBoxQuery7BeastOfBurden.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7BeastOfBurden.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7BeastOfBurden.gridx = 2;
		gbc_comboBoxQuery7BeastOfBurden.gridy = 5;
		panel_query7.add(comboBoxQuery7BeastOfBurden, gbc_comboBoxQuery7BeastOfBurden);
		
		labelQuery7Plow = new JLabel("Plow");
		GridBagConstraints gbc_labelQuery7Plow = new GridBagConstraints();
		gbc_labelQuery7Plow.gridwidth = 2;
		gbc_labelQuery7Plow.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Plow.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7Plow.gridx = 4;
		gbc_labelQuery7Plow.gridy = 5;
		panel_query7.add(labelQuery7Plow, gbc_labelQuery7Plow);
		
		comboBoxQuery7Plow = new JComboBox<String>();
		comboBoxQuery7Plow.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7Plow = new GridBagConstraints();
		gbc_comboBoxQuery7Plow.gridwidth = 2;
		gbc_comboBoxQuery7Plow.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7Plow.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Plow.gridx = 6;
		gbc_comboBoxQuery7Plow.gridy = 5;
		panel_query7.add(comboBoxQuery7Plow, gbc_comboBoxQuery7Plow);
		
		labelQuery7Harrow = new JLabel("Harrow");
		GridBagConstraints gbc_labelQuery7Harrow = new GridBagConstraints();
		gbc_labelQuery7Harrow.gridwidth = 2;
		gbc_labelQuery7Harrow.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Harrow.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7Harrow.gridx = 8;
		gbc_labelQuery7Harrow.gridy = 5;
		panel_query7.add(labelQuery7Harrow, gbc_labelQuery7Harrow);
		
		comboBoxQuery7Harrow = new JComboBox<String>();
		comboBoxQuery7Harrow.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7Harrow = new GridBagConstraints();
		gbc_comboBoxQuery7Harrow.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery7Harrow.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Harrow.gridx = 10;
		gbc_comboBoxQuery7Harrow.gridy = 5;
		panel_query7.add(comboBoxQuery7Harrow, gbc_comboBoxQuery7Harrow);
		
		labelQuery7Mower = new JLabel("Mower");
		GridBagConstraints gbc_labelQuery7Mower = new GridBagConstraints();
		gbc_labelQuery7Mower.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Mower.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7Mower.gridx = 1;
		gbc_labelQuery7Mower.gridy = 6;
		panel_query7.add(labelQuery7Mower, gbc_labelQuery7Mower);
		
		comboBoxQuery7Mower = new JComboBox<String>();
		comboBoxQuery7Mower.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7Mower = new GridBagConstraints();
		gbc_comboBoxQuery7Mower.gridwidth = 2;
		gbc_comboBoxQuery7Mower.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7Mower.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Mower.gridx = 2;
		gbc_comboBoxQuery7Mower.gridy = 6;
		panel_query7.add(comboBoxQuery7Mower, gbc_comboBoxQuery7Mower);
		
		labelQuery7Thresher = new JLabel("Thresher");
		GridBagConstraints gbc_labelQuery7Thresher = new GridBagConstraints();
		gbc_labelQuery7Thresher.gridwidth = 2;
		gbc_labelQuery7Thresher.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Thresher.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7Thresher.gridx = 4;
		gbc_labelQuery7Thresher.gridy = 6;
		panel_query7.add(labelQuery7Thresher, gbc_labelQuery7Thresher);
		
		comboBoxQuery7Thresher = new JComboBox<String>();
		comboBoxQuery7Thresher.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7Thresher = new GridBagConstraints();
		gbc_comboBoxQuery7Thresher.gridwidth = 2;
		gbc_comboBoxQuery7Thresher.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7Thresher.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Thresher.gridx = 6;
		gbc_comboBoxQuery7Thresher.gridy = 6;
		panel_query7.add(comboBoxQuery7Thresher, gbc_comboBoxQuery7Thresher);
		
		labelQuery7InsecticideSprayer = new JLabel("Insecticide Sprayer");
		GridBagConstraints gbc_labelQuery7InsecticideSprayer = new GridBagConstraints();
		gbc_labelQuery7InsecticideSprayer.gridwidth = 2;
		gbc_labelQuery7InsecticideSprayer.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7InsecticideSprayer.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7InsecticideSprayer.gridx = 8;
		gbc_labelQuery7InsecticideSprayer.gridy = 6;
		panel_query7.add(labelQuery7InsecticideSprayer, gbc_labelQuery7InsecticideSprayer);
		
		comboBoxQuery7InsecticideSprayer = new JComboBox<String>();
		comboBoxQuery7InsecticideSprayer.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7InsecticideSprayer = new GridBagConstraints();
		gbc_comboBoxQuery7InsecticideSprayer.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery7InsecticideSprayer.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7InsecticideSprayer.gridx = 10;
		gbc_comboBoxQuery7InsecticideSprayer.gridy = 6;
		panel_query7.add(comboBoxQuery7InsecticideSprayer, gbc_comboBoxQuery7InsecticideSprayer);
		
		labelQuery7FarmTractor = new JLabel("Farm Tractor");
		GridBagConstraints gbc_labelQuery7FarmTractor = new GridBagConstraints();
		gbc_labelQuery7FarmTractor.gridwidth = 2;
		gbc_labelQuery7FarmTractor.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7FarmTractor.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7FarmTractor.gridx = 0;
		gbc_labelQuery7FarmTractor.gridy = 7;
		panel_query7.add(labelQuery7FarmTractor, gbc_labelQuery7FarmTractor);
		
		comboBoxQuery7FarmTractor = new JComboBox<String>();
		comboBoxQuery7FarmTractor.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7FarmTractor = new GridBagConstraints();
		gbc_comboBoxQuery7FarmTractor.gridwidth = 2;
		gbc_comboBoxQuery7FarmTractor.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7FarmTractor.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7FarmTractor.gridx = 2;
		gbc_comboBoxQuery7FarmTractor.gridy = 7;
		panel_query7.add(comboBoxQuery7FarmTractor, gbc_comboBoxQuery7FarmTractor);
		
		labelQuery7HandTractor = new JLabel("Hand Tractor");
		GridBagConstraints gbc_labelQuery7HandTractor = new GridBagConstraints();
		gbc_labelQuery7HandTractor.gridwidth = 2;
		gbc_labelQuery7HandTractor.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7HandTractor.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7HandTractor.gridx = 4;
		gbc_labelQuery7HandTractor.gridy = 7;
		panel_query7.add(labelQuery7HandTractor, gbc_labelQuery7HandTractor);
		
		comboBoxQuery7HandTractor = new JComboBox<String>();
		comboBoxQuery7HandTractor.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7HandTractor = new GridBagConstraints();
		gbc_comboBoxQuery7HandTractor.gridwidth = 2;
		gbc_comboBoxQuery7HandTractor.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7HandTractor.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7HandTractor.gridx = 6;
		gbc_comboBoxQuery7HandTractor.gridy = 7;
		panel_query7.add(comboBoxQuery7HandTractor, gbc_comboBoxQuery7HandTractor);
		
		labelQuery7Mudboat = new JLabel("Mudboat");
		GridBagConstraints gbc_labelQuery7Mudboat = new GridBagConstraints();
		gbc_labelQuery7Mudboat.gridwidth = 2;
		gbc_labelQuery7Mudboat.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Mudboat.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7Mudboat.gridx = 8;
		gbc_labelQuery7Mudboat.gridy = 7;
		panel_query7.add(labelQuery7Mudboat, gbc_labelQuery7Mudboat);
		
		comboBoxQuery7Mudboat = new JComboBox<String>();
		comboBoxQuery7Mudboat.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7Mudboat = new GridBagConstraints();
		gbc_comboBoxQuery7Mudboat.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery7Mudboat.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Mudboat.gridx = 10;
		gbc_comboBoxQuery7Mudboat.gridy = 7;
		panel_query7.add(comboBoxQuery7Mudboat, gbc_comboBoxQuery7Mudboat);
		
		labelQuery7PlanterDryer = new JLabel("Planter/Dryer");
		GridBagConstraints gbc_labelQuery7PlanterDryer = new GridBagConstraints();
		gbc_labelQuery7PlanterDryer.gridwidth = 2;
		gbc_labelQuery7PlanterDryer.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7PlanterDryer.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7PlanterDryer.gridx = 0;
		gbc_labelQuery7PlanterDryer.gridy = 8;
		panel_query7.add(labelQuery7PlanterDryer, gbc_labelQuery7PlanterDryer);
		
		comboBoxQuery7PlanterDryer = new JComboBox<String>();
		comboBoxQuery7PlanterDryer.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7PlanterDryer = new GridBagConstraints();
		gbc_comboBoxQuery7PlanterDryer.gridwidth = 2;
		gbc_comboBoxQuery7PlanterDryer.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7PlanterDryer.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7PlanterDryer.gridx = 2;
		gbc_comboBoxQuery7PlanterDryer.gridy = 8;
		panel_query7.add(comboBoxQuery7PlanterDryer, gbc_comboBoxQuery7PlanterDryer);
		
		labelQuery7MechanicalDryer = new JLabel("Mechanical Dryer");
		GridBagConstraints gbc_labelQuery7MechanicalDryer = new GridBagConstraints();
		gbc_labelQuery7MechanicalDryer.gridwidth = 2;
		gbc_labelQuery7MechanicalDryer.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7MechanicalDryer.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7MechanicalDryer.gridx = 4;
		gbc_labelQuery7MechanicalDryer.gridy = 8;
		panel_query7.add(labelQuery7MechanicalDryer, gbc_labelQuery7MechanicalDryer);
		
		comboBoxQuery7MechanicalDryer = new JComboBox<String>();
		comboBoxQuery7MechanicalDryer.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7MechanicalDryer = new GridBagConstraints();
		gbc_comboBoxQuery7MechanicalDryer.gridwidth = 2;
		gbc_comboBoxQuery7MechanicalDryer.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7MechanicalDryer.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7MechanicalDryer.gridx = 6;
		gbc_comboBoxQuery7MechanicalDryer.gridy = 8;
		panel_query7.add(comboBoxQuery7MechanicalDryer, gbc_comboBoxQuery7MechanicalDryer);
		
		labelQuery7DryingPavement = new JLabel("Drying Pavement");
		GridBagConstraints gbc_labelQuery7DryingPavement = new GridBagConstraints();
		gbc_labelQuery7DryingPavement.gridwidth = 2;
		gbc_labelQuery7DryingPavement.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7DryingPavement.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7DryingPavement.gridx = 8;
		gbc_labelQuery7DryingPavement.gridy = 8;
		panel_query7.add(labelQuery7DryingPavement, gbc_labelQuery7DryingPavement);
		
		comboBoxQuery7DryingPavement = new JComboBox<String>();
		comboBoxQuery7DryingPavement.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7DryingPavement = new GridBagConstraints();
		gbc_comboBoxQuery7DryingPavement.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery7DryingPavement.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7DryingPavement.gridx = 10;
		gbc_comboBoxQuery7DryingPavement.gridy = 8;
		panel_query7.add(comboBoxQuery7DryingPavement, gbc_comboBoxQuery7DryingPavement);
		
		labelQuery7FeedMill = new JLabel("Feed Mill");
		GridBagConstraints gbc_labelQuery7FeedMill = new GridBagConstraints();
		gbc_labelQuery7FeedMill.gridwidth = 2;
		gbc_labelQuery7FeedMill.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7FeedMill.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7FeedMill.gridx = 0;
		gbc_labelQuery7FeedMill.gridy = 9;
		panel_query7.add(labelQuery7FeedMill, gbc_labelQuery7FeedMill);
		
		comboBoxQuery7FeedMill = new JComboBox<String>();
		comboBoxQuery7FeedMill.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7FeedMill = new GridBagConstraints();
		gbc_comboBoxQuery7FeedMill.gridwidth = 2;
		gbc_comboBoxQuery7FeedMill.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7FeedMill.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7FeedMill.gridx = 2;
		gbc_comboBoxQuery7FeedMill.gridy = 9;
		panel_query7.add(comboBoxQuery7FeedMill, gbc_comboBoxQuery7FeedMill);
		
		labelQuery7Harvester = new JLabel("Harvester");
		GridBagConstraints gbc_labelQuery7Harvester = new GridBagConstraints();
		gbc_labelQuery7Harvester.gridwidth = 2;
		gbc_labelQuery7Harvester.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Harvester.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7Harvester.gridx = 4;
		gbc_labelQuery7Harvester.gridy = 9;
		panel_query7.add(labelQuery7Harvester, gbc_labelQuery7Harvester);
		
		comboBoxQuery7Harvester = new JComboBox<String>();
		comboBoxQuery7Harvester.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7Harvester = new GridBagConstraints();
		gbc_comboBoxQuery7Harvester.gridwidth = 2;
		gbc_comboBoxQuery7Harvester.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7Harvester.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Harvester.gridx = 6;
		gbc_comboBoxQuery7Harvester.gridy = 9;
		panel_query7.add(comboBoxQuery7Harvester, gbc_comboBoxQuery7Harvester);
		
		labelQuery7WarehouseGranary = new JLabel("Warehouse Granary");
		GridBagConstraints gbc_labelQuery7WarehouseGranary = new GridBagConstraints();
		gbc_labelQuery7WarehouseGranary.gridwidth = 2;
		gbc_labelQuery7WarehouseGranary.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7WarehouseGranary.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7WarehouseGranary.gridx = 8;
		gbc_labelQuery7WarehouseGranary.gridy = 9;
		panel_query7.add(labelQuery7WarehouseGranary, gbc_labelQuery7WarehouseGranary);
		
		comboBoxQuery7WarehouseGranary = new JComboBox<String>();
		comboBoxQuery7WarehouseGranary.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7WarehouseGranary = new GridBagConstraints();
		gbc_comboBoxQuery7WarehouseGranary.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery7WarehouseGranary.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7WarehouseGranary.gridx = 10;
		gbc_comboBoxQuery7WarehouseGranary.gridy = 9;
		panel_query7.add(comboBoxQuery7WarehouseGranary, gbc_comboBoxQuery7WarehouseGranary);
		
		labelQuery7Farmshed = new JLabel("Farmshed");
		GridBagConstraints gbc_labelQuery7Farmshed = new GridBagConstraints();
		gbc_labelQuery7Farmshed.gridwidth = 2;
		gbc_labelQuery7Farmshed.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Farmshed.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7Farmshed.gridx = 0;
		gbc_labelQuery7Farmshed.gridy = 10;
		panel_query7.add(labelQuery7Farmshed, gbc_labelQuery7Farmshed);
		
		comboBoxQuery7Farmshed = new JComboBox<String>();
		comboBoxQuery7Farmshed.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7Farmshed = new GridBagConstraints();
		gbc_comboBoxQuery7Farmshed.gridwidth = 2;
		gbc_comboBoxQuery7Farmshed.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7Farmshed.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Farmshed.gridx = 2;
		gbc_comboBoxQuery7Farmshed.gridy = 10;
		panel_query7.add(comboBoxQuery7Farmshed, gbc_comboBoxQuery7Farmshed);
		
		labelQuery7IrrigationPump = new JLabel("Irrigation Pump");
		GridBagConstraints gbc_labelQuery7IrrigationPump = new GridBagConstraints();
		gbc_labelQuery7IrrigationPump.gridwidth = 2;
		gbc_labelQuery7IrrigationPump.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7IrrigationPump.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7IrrigationPump.gridx = 4;
		gbc_labelQuery7IrrigationPump.gridy = 10;
		panel_query7.add(labelQuery7IrrigationPump, gbc_labelQuery7IrrigationPump);
		
		comboBoxQuery7IrrigationPump = new JComboBox<String>();
		comboBoxQuery7IrrigationPump.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7IrrigationPump = new GridBagConstraints();
		gbc_comboBoxQuery7IrrigationPump.gridwidth = 2;
		gbc_comboBoxQuery7IrrigationPump.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7IrrigationPump.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7IrrigationPump.gridx = 6;
		gbc_comboBoxQuery7IrrigationPump.gridy = 10;
		panel_query7.add(comboBoxQuery7IrrigationPump, gbc_comboBoxQuery7IrrigationPump);
		
		labelQuery7Others = new JLabel("Others");
		GridBagConstraints gbc_labelQuery7Others = new GridBagConstraints();
		gbc_labelQuery7Others.gridwidth = 2;
		gbc_labelQuery7Others.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Others.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7Others.gridx = 8;
		gbc_labelQuery7Others.gridy = 10;
		panel_query7.add(labelQuery7Others, gbc_labelQuery7Others);
		
		comboBoxQuery7Others = new JComboBox<String>();
		comboBoxQuery7Others.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7Others = new GridBagConstraints();
		gbc_comboBoxQuery7Others.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxQuery7Others.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Others.gridx = 10;
		gbc_comboBoxQuery7Others.gridy = 10;
		panel_query7.add(comboBoxQuery7Others, gbc_comboBoxQuery7Others);
		
		labelQuery7CropInsurance = new JLabel("Crop Insurance");
		GridBagConstraints gbc_labelQuery7CropInsurance = new GridBagConstraints();
		gbc_labelQuery7CropInsurance.gridwidth = 2;
		gbc_labelQuery7CropInsurance.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7CropInsurance.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7CropInsurance.gridx = 0;
		gbc_labelQuery7CropInsurance.gridy = 11;
		panel_query7.add(labelQuery7CropInsurance, gbc_labelQuery7CropInsurance);
		
		comboBoxQuery7CropInsurance = new JComboBox<String>();
		comboBoxQuery7CropInsurance.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7CropInsurance = new GridBagConstraints();
		gbc_comboBoxQuery7CropInsurance.gridwidth = 2;
		gbc_comboBoxQuery7CropInsurance.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7CropInsurance.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7CropInsurance.gridx = 2;
		gbc_comboBoxQuery7CropInsurance.gridy = 11;
		panel_query7.add(comboBoxQuery7CropInsurance, gbc_comboBoxQuery7CropInsurance);
		
		labelQuery7EquipmentInsurance = new JLabel("Equipment Insurance");
		GridBagConstraints gbc_labelQuery7EquipmentInsurance = new GridBagConstraints();
		gbc_labelQuery7EquipmentInsurance.gridwidth = 2;
		gbc_labelQuery7EquipmentInsurance.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7EquipmentInsurance.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7EquipmentInsurance.gridx = 4;
		gbc_labelQuery7EquipmentInsurance.gridy = 11;
		panel_query7.add(labelQuery7EquipmentInsurance, gbc_labelQuery7EquipmentInsurance);
		
		comboBoxQuery7EquipmentInsurance = new JComboBox<String>();
		comboBoxQuery7EquipmentInsurance.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Mayroon", "Wala"}));
		GridBagConstraints gbc_comboBoxQuery7EquipmentInsurance = new GridBagConstraints();
		gbc_comboBoxQuery7EquipmentInsurance.gridwidth = 2;
		gbc_comboBoxQuery7EquipmentInsurance.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7EquipmentInsurance.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7EquipmentInsurance.gridx = 6;
		gbc_comboBoxQuery7EquipmentInsurance.gridy = 11;
		panel_query7.add(comboBoxQuery7EquipmentInsurance, gbc_comboBoxQuery7EquipmentInsurance);
		
		labelQuery7Dahilan = new JLabel("Bumaba ang ani dahil");
		GridBagConstraints gbc_labelQuery7Dahilan = new GridBagConstraints();
		gbc_labelQuery7Dahilan.anchor = GridBagConstraints.EAST;
		gbc_labelQuery7Dahilan.gridwidth = 2;
		gbc_labelQuery7Dahilan.insets = new Insets(0, 0, 5, 5);
		gbc_labelQuery7Dahilan.gridx = 0;
		gbc_labelQuery7Dahilan.gridy = 12;
		panel_query7.add(labelQuery7Dahilan, gbc_labelQuery7Dahilan);
		
		comboBoxQuery7Dahilan = new JComboBox<String>();
		comboBoxQuery7Dahilan.setModel(new DefaultComboBoxModel<String>(new String[] {"[SELECT]", "Increase in cost", "Affected by drought", "Affected by typhoon", "Affected by flood", "Affected by pests", "Decrease in water from irrigation", "Change in primary occupation", "Others"}));
		GridBagConstraints gbc_comboBoxQuery7Dahilan = new GridBagConstraints();
		gbc_comboBoxQuery7Dahilan.gridwidth = 4;
		gbc_comboBoxQuery7Dahilan.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxQuery7Dahilan.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxQuery7Dahilan.gridx = 2;
		gbc_comboBoxQuery7Dahilan.gridy = 12;
		panel_query7.add(comboBoxQuery7Dahilan, gbc_comboBoxQuery7Dahilan);
		
		buttonQuery7Query = new JButton("Query");
		GridBagConstraints gbc_buttonQuery7Query = new GridBagConstraints();
		gbc_buttonQuery7Query.fill = GridBagConstraints.BOTH;
		gbc_buttonQuery7Query.insets = new Insets(0, 0, 5, 0);
		gbc_buttonQuery7Query.gridx = 10;
		gbc_buttonQuery7Query.gridy = 12;
		panel_query7.add(buttonQuery7Query, gbc_buttonQuery7Query);
		
		scrollPaneQuery7ResultTable = new JScrollPane();
		GridBagConstraints gbc_scrollPaneQuery7ResultTable = new GridBagConstraints();
		gbc_scrollPaneQuery7ResultTable.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneQuery7ResultTable.gridwidth = 11;
		gbc_scrollPaneQuery7ResultTable.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPaneQuery7ResultTable.gridx = 0;
		gbc_scrollPaneQuery7ResultTable.gridy = 13;
		panel_query7.add(scrollPaneQuery7ResultTable, gbc_scrollPaneQuery7ResultTable);
		
		tableQuery7ResultTable = new JTable(){
			private static final long serialVersionUID = 1L;
			@Override
		       public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		           Component component = super.prepareRenderer(renderer, row, column);
		           int rendererWidth = component.getPreferredSize().width;
		           TableColumn tableColumn = getColumnModel().getColumn(column);
		           tableColumn.setPreferredWidth(Math.max(rendererWidth + getIntercellSpacing().width, tableColumn.getPreferredWidth()));
		           return component;
		        }
		    };
		tableQuery7ResultTable.setAutoCreateRowSorter(true);
		tableQuery7ResultTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //IMPORTANT
		tableQuery7ResultTable.setAutoCreateRowSorter(true);
		scrollPaneQuery7ResultTable.setViewportView(tableQuery7ResultTable);
		
		labelQuery7Status = new JLabel("");
		GridBagConstraints gbc_labelQuery7Status = new GridBagConstraints();
		gbc_labelQuery7Status.anchor = GridBagConstraints.SOUTHWEST;
		gbc_labelQuery7Status.gridwidth = 11;
		gbc_labelQuery7Status.gridx = 0;
		gbc_labelQuery7Status.gridy = 14;
		panel_query7.add(labelQuery7Status, gbc_labelQuery7Status);
		
	}

	public JButton getButtonQuery7Query() {
		return buttonQuery7Query;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static View getView() {
		return view;
	}

	public JPanel getPanel_main() {
		return panel_main;
	}

	public JLabel getLabel() {
		return label;
	}

	public JLabel getLabelCMBS() {
		return labelCMBS;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JButton getButtonQuery1() {
		return buttonQuery1;
	}

	public JButton getButtonQuery2() {
		return buttonQuery2;
	}

	public JButton getButtonQuery3() {
		return buttonQuery3;
	}

	public JButton getButtonQuery4() {
		return buttonQuery4;
	}

	public JButton getButtonQuery5() {
		return buttonQuery5;
	}

	public JButton getButtonQuery6() {
		return buttonQuery6;
	}

	public JButton getButtonQuery7() {
		return buttonQuery7;
	}

	public JPanel getPanel_query1() {
		return panel_query1;
	}

	public JButton getButtonQuery1Back() {
		return buttonQuery1Back;
	}

	public JLabel getLabelQuery1() {
		return labelQuery1;
	}

	public JComboBox<String> getComboBoxQuery1Municipality() {
		return comboBoxQuery1Municipality;
	}

	public JLabel getLabelQuery1Municipality() {
		return labelQuery1Municipality;
	}

	public JComboBox<String> getComboBoxQuery1Zone() {
		return comboBoxQuery1Zone;
	}

	public JLabel getLabelQuery1Zone() {
		return labelQuery1Zone;
	}

	public JComboBox<String> getComboBoxQuery1Barangay() {
		return comboBoxQuery1Barangay;
	}

	public JLabel getLabelQuery1Barangay() {
		return labelQuery1Barangay;
	}

	public JComboBox<String> getComboBoxQuery1Purok() {
		return comboBoxQuery1Purok;
	}

	public JLabel getLabelQuery1Purok() {
		return labelQuery1Purok;
	}

	public JComboBox<String> getComboBoxQuery1HouseType() {
		return comboBoxQuery1HouseType;
	}

	public JLabel getLabelQuery1HouseType() {
		return labelQuery1HouseType;
	}

	public JLabel getLabelQuery1CalamityExperiences() {
		return labelQuery1CalamityExperiences;
	}

	public JComboBox<String> getComboBoxQuery1Bagyo() {
		return comboBoxQuery1Bagyo;
	}

	public JLabel getLabelQuery1Bagyo() {
		return labelQuery1Bagyo;
	}

	public JSpinner getSpinnerQuery1BagyoFrequencyLower() {
		return spinnerQuery1BagyoFrequencyLower;
	}

	public JSpinner getSpinnerQuery1BagyoFrequencyUpper() {
		return spinnerQuery1BagyoFrequencyUpper;
	}

	public JLabel getLabelQuery1BagyoFrequency() {
		return labelQuery1BagyoFrequency;
	}

	public JComboBox<String> getComboBoxQuery1BagyoAid() {
		return comboBoxQuery1BagyoAid;
	}

	public JLabel getLabelQuery1BagyoAid() {
		return labelQuery1BagyoAid;
	}

	public JComboBox<String> getComboBoxQuery1Baha() {
		return comboBoxQuery1Baha;
	}

	public JLabel getLabelQuery1Baha() {
		return labelQuery1Baha;
	}

	public JSpinner getSpinnerQuery1BahaFrequencyLower() {
		return spinnerQuery1BahaFrequencyLower;
	}

	public JSpinner getSpinnerQuery1BahaFrequencyUpper() {
		return spinnerQuery1BahaFrequencyUpper;
	}

	public JLabel getLabelQuery1BahaFrequency() {
		return labelQuery1BahaFrequency;
	}

	public JComboBox<String> getComboBoxQuery1BahaAid() {
		return comboBoxQuery1BahaAid;
	}

	public JLabel getLabelQuery1BahaAid() {
		return labelQuery1BahaAid;
	}

	public JComboBox<String> getComboBoxQuery1Tagtuyot() {
		return comboBoxQuery1Tagtuyot;
	}

	public JLabel getLabelQuery1Tagtuyot() {
		return labelQuery1Tagtuyot;
	}

	public JSpinner getSpinnerQuery1TagtuyotFrequencyLower() {
		return spinnerQuery1TagtuyotFrequencyLower;
	}

	public JSpinner getSpinnerQuery1TagtuyotFrequencyUpper() {
		return spinnerQuery1TagtuyotFrequencyUpper;
	}

	public JLabel getLabelQuery1TagtuyotFrequency() {
		return labelQuery1TagtuyotFrequency;
	}

	public JComboBox<String> getComboBoxQuery1TagtuyotAid() {
		return comboBoxQuery1TagtuyotAid;
	}

	public JLabel getLabelQuery1TagtuyotAid() {
		return labelQuery1TagtuyotAid;
	}

	public JComboBox<String> getComboBoxQuery1Lindol() {
		return comboBoxQuery1Lindol;
	}

	public JLabel getLabelQuery1Lindol() {
		return labelQuery1Lindol;
	}

	public JSpinner getSpinnerQuery1LindolFrequencyLower() {
		return spinnerQuery1LindolFrequencyLower;
	}

	public JSpinner getSpinnerQuery1LindolFrequencyUpper() {
		return spinnerQuery1LindolFrequencyUpper;
	}

	public JLabel getLabelQuery1LindolFrequency() {
		return labelQuery1LindolFrequency;
	}

	public JComboBox<String> getComboBoxQuery1LindolAid() {
		return comboBoxQuery1LindolAid;
	}

	public JLabel getLabelQuery1LindolAid() {
		return labelQuery1LindolAid;
	}

	public JComboBox<String> getComboBoxQuery1Sunog() {
		return comboBoxQuery1Sunog;
	}

	public JLabel getLabelQuery1Sunog() {
		return labelQuery1Sunog;
	}

	public JSpinner getSpinnerQuery1SunogFrequencyLower() {
		return spinnerQuery1SunogFrequencyLower;
	}

	public JSpinner getSpinnerQuery1SunogFrequencyUpper() {
		return spinnerQuery1SunogFrequencyUpper;
	}

	public JLabel getLabelQuery1SunogFrequency() {
		return labelQuery1SunogFrequency;
	}

	public JLabel getLabelQuery1SunogAid() {
		return labelQuery1SunogAid;
	}

	public JButton getButtonQuery1Query() {
		return buttonQuery1Query;
	}

	public JComboBox<String> getComboBoxQuery1SunogAid() {
		return comboBoxQuery1SunogAid;
	}

	public JScrollPane getScrollPaneQuery1ResultTable() {
		return scrollPaneQuery1ResultTable;
	}

	public JTable getTableQuery1ResultTable() {
		return tableQuery1ResultTable;
	}

	public JLabel getLabelQuery1Status() {
		return labelQuery1Status;
	}

	public JPanel getPanel_query2() {
		return panel_query2;
	}

	public JButton getButtonQuery2Back() {
		return buttonQuery2Back;
	}

	public JLabel getLabelQuery2() {
		return labelQuery2;
	}

	public JLabel getLabelQuery2Municipality() {
		return labelQuery2Municipality;
	}

	public JComboBox<String> getComboBoxQuery2Municipality() {
		return comboBoxQuery2Municipality;
	}

	public JLabel getLabelQuery2Zone() {
		return labelQuery2Zone;
	}

	public JComboBox<String> getComboBoxQuery2Zone() {
		return comboBoxQuery2Zone;
	}

	public JLabel getLabelQuery2Barangay() {
		return labelQuery2Barangay;
	}

	public JComboBox<String> getComboBoxQuery2Barangay() {
		return comboBoxQuery2Barangay;
	}

	public JLabel getLabelQuery2Purok() {
		return labelQuery2Purok;
	}

	public JComboBox<String> getComboBoxQuery2Purok() {
		return comboBoxQuery2Purok;
	}

	public JLabel getLableQuery2GovernmentServices() {
		return lableQuery2GovernmentServices;
	}

	public JLabel getLabelQuery2SLP() {
		return labelQuery2SLP;
	}

	public JComboBox<String> getComboBoxQuery2SLP() {
		return comboBoxQuery2SLP;
	}

	public JLabel getLabelQuery2SLPNum() {
		return labelQuery2SLPNum;
	}

	public JLabel getLabelQuery2FFSP() {
		return labelQuery2FFSP;
	}

	public JComboBox<String> getComboBoxQuery2FFSP() {
		return comboBoxQuery2FFSP;
	}

	public JLabel getLabelQuery2FFSPNum() {
		return labelQuery2FFSPNum;
	}

	public JLabel getLabelQuery2FFWP() {
		return labelQuery2FFWP;
	}

	public JComboBox<String> getComboBoxQuery2FFWP() {
		return comboBoxQuery2FFWP;
	}

	public JLabel getLabelQuery2FFWPNum() {
		return labelQuery2FFWPNum;
	}

	public JLabel getLabelQuery2CFWP() {
		return labelQuery2CFWP;
	}

	public JComboBox<String> getComboBoxQuery2CFWP() {
		return comboBoxQuery2CFWP;
	}

	public JLabel getLabelQuery2CFWPNum() {
		return labelQuery2CFWPNum;
	}

	public JLabel getLabelQuery2SPISC() {
		return labelQuery2SPISC;
	}

	public JComboBox<String> getComboBoxQuery2SPISC() {
		return comboBoxQuery2SPISC;
	}

	public JLabel getLabelQuery2SPISCNum() {
		return labelQuery2SPISCNum;
	}

	public JButton getButtonQuery2Query() {
		return buttonQuery2Query;
	}

	public JLabel getLabelQuery2Status() {
		return labelQuery2Status;
	}

	public JComboBox<String> getComboBoxQuery2CCT() {
		return comboBoxQuery2CCT;
	}

	public JLabel getLabelQuery2CCT() {
		return labelQuery2CCT;
	}

	public JComboBox<String> getComboBoxQuery2ARCDP() {
		return comboBoxQuery2ARCDP;
	}

	public JLabel getLabelQuery2ARCDP() {
		return labelQuery2ARCDP;
	}

	public JComboBox<String> getComboBoxQuery2CBEP() {
		return comboBoxQuery2CBEP;
	}

	public JLabel getLabelQuery2CBEP() {
		return labelQuery2CBEP;
	}

	public JComboBox<String> getComboBoxQuery2PHOFW() {
		return comboBoxQuery2PHOFW;
	}

	public JComboBox<String> getComboBoxQuery2PHE() {
		return comboBoxQuery2PHE;
	}

	public JComboBox<String> getComboBoxQuery2PHIP() {
		return comboBoxQuery2PHIP;
	}

	public JLabel getLabelQuery2PHOFW() {
		return labelQuery2PHOFW;
	}

	public JLabel getLabelQuery2PHE() {
		return labelQuery2PHE;
	}

	public JLabel getLabelQuery2PHIP() {
		return labelQuery2PHIP;
	}

	public JComboBox<String> getComboBoxQuery2PHS() {
		return comboBoxQuery2PHS;
	}

	public JLabel getLabelQuery2PHS() {
		return labelQuery2PHS;
	}

	public JComboBox<String> getComboBoxQuery2PHL() {
		return comboBoxQuery2PHL;
	}

	public JLabel getLabelQuery2PHL() {
		return labelQuery2PHL;
	}

	public JLabel getLabelQuery2CCTNum() {
		return labelQuery2CCTNum;
	}

	public JLabel getLabelQuery2ARCDPNum() {
		return labelQuery2ARCDPNum;
	}

	public JLabel getLabelQuery2CBEPNum() {
		return labelQuery2CBEPNum;
	}

	public JLabel getLabelQuery2PHOFWNum() {
		return labelQuery2PHOFWNum;
	}

	public JLabel getLabelQuery2PHENum() {
		return labelQuery2PHENum;
	}

	public JLabel getLabelQuery2PHIPNum() {
		return labelQuery2PHIPNum;
	}

	public JLabel getLabelQuery2PHSNum() {
		return labelQuery2PHSNum;
	}

	public JLabel getLabellabelQuery2PHLNum() {
		return labellabelQuery2PHLNum;
	}

	public JSpinner getSpinnerQuery2SLPNumLower() {
		return spinnerQuery2SLPNumLower;
	}

	public JSpinner getSpinnerQuery2SLPNumUpper() {
		return spinnerQuery2SLPNumUpper;
	}

	public JSpinner getSpinnerQuery2FFSPNumLower() {
		return spinnerQuery2FFSPNumLower;
	}

	public JSpinner getSpinnerQuery2FFSPNumUpper() {
		return spinnerQuery2FFSPNumUpper;
	}

	public JSpinner getSpinnerQuery2FFWPNumLower() {
		return spinnerQuery2FFWPNumLower;
	}

	public JSpinner getSpinnerQuery2FFWPNumUpper() {
		return spinnerQuery2FFWPNumUpper;
	}

	public JSpinner getSpinnerQuery2CFWPNumLower() {
		return spinnerQuery2CFWPNumLower;
	}

	public JSpinner getSpinnerQuery2CFWPNumUpper() {
		return spinnerQuery2CFWPNumUpper;
	}

	public JSpinner getSpinnerQuery2SPISCNumLower() {
		return spinnerQuery2SPISCNumLower;
	}

	public JSpinner getSpinnerQuery2SPISCNumUpper() {
		return spinnerQuery2SPISCNumUpper;
	}

	public JSpinner getSpinnerQuery2CCTNumLower() {
		return spinnerQuery2CCTNumLower;
	}

	public JSpinner getSpinnerQuery2CCTNumUpper() {
		return spinnerQuery2CCTNumUpper;
	}

	public JSpinner getSpinnerQuery2ARCDPNumLower() {
		return spinnerQuery2ARCDPNumLower;
	}

	public JSpinner getSpinnerQuery2ARCDPNumUpper() {
		return spinnerQuery2ARCDPNumUpper;
	}

	public JSpinner getSpinnerQuery2CBEPNumLower() {
		return spinnerQuery2CBEPNumLower;
	}

	public JSpinner getSpinnerQuery2CBEPNumUpper() {
		return spinnerQuery2CBEPNumUpper;
	}

	public JSpinner getSpinnerQuery2PHOFWNumLower() {
		return spinnerQuery2PHOFWNumLower;
	}

	public JSpinner getSpinnerQuery2PHOFWNumUpper() {
		return spinnerQuery2PHOFWNumUpper;
	}

	public JSpinner getSpinnerQuery2PHENumLower() {
		return spinnerQuery2PHENumLower;
	}

	public JSpinner getSpinnerQuery2PHENumUpper() {
		return spinnerQuery2PHENumUpper;
	}

	public JSpinner getSpinnerQuery2PHIPNumLower() {
		return spinnerQuery2PHIPNumLower;
	}

	public JSpinner getSpinnerQuery2PHIPNumUpper() {
		return spinnerQuery2PHIPNumUpper;
	}

	public JSpinner getSpinnerQuery2PHSNumLower() {
		return spinnerQuery2PHSNumLower;
	}

	public JSpinner getSpinnerQuery2PHSNumUpper() {
		return spinnerQuery2PHSNumUpper;
	}

	public JSpinner getSpinnerQuery2PHLNumLower() {
		return spinnerQuery2PHLNumLower;
	}

	public JSpinner getSpinnerQuery2PHLNumUpper() {
		return spinnerQuery2PHLNumUpper;
	}

	public JTable getTableQuery2ResultTable() {
		return tableQuery2ResultTable;
	}

	public JScrollPane getScrollPaneQuery2ResultTable() {
		return scrollPaneQuery2ResultTable;
	}

	public JSpinner getSpinnerQuery2OtherProgramsLower() {
		return spinnerQuery2OtherProgramsLower;
	}

	public JSpinner getSpinnerQuery2OtherProgramsUpper() {
		return spinnerQuery2OtherProgramsUpper;
	}

	public JLabel getLabelQuery2OtherPrograms() {
		return labelQuery2OtherPrograms;
	}

	public JComboBox<String> getComboBoxQuery1Bulkan() {
		return comboBoxQuery1Bulkan;
	}

	public JComboBox<String> getComboBoxQuery1Landslide() {
		return comboBoxQuery1Landslide;
	}

	public JComboBox<String> getComboBoxQuery1Tsunami() {
		return comboBoxQuery1Tsunami;
	}

	public JComboBox<String> getComboBoxQuery1ForestFire() {
		return comboBoxQuery1ForestFire;
	}

	public JComboBox<String> getComboBoxQuery1Digmaan() {
		return comboBoxQuery1Digmaan;
	}

	public JComboBox<String> getComboBoxQuery1BulkanAid() {
		return comboBoxQuery1BulkanAid;
	}

	public JComboBox<String> getComboBoxQuery1LandslideAid() {
		return comboBoxQuery1LandslideAid;
	}

	public JComboBox<String> getComboBoxQuery1TsunamiAid() {
		return comboBoxQuery1TsunamiAid;
	}

	public JComboBox<String> getComboBoxQuery1ForestFireAid() {
		return comboBoxQuery1ForestFireAid;
	}

	public JComboBox<String> getComboBoxQuery1DigmaanAid() {
		return comboBoxQuery1DigmaanAid;
	}

	public JLabel getLabelQuery1Bulkan() {
		return labelQuery1Bulkan;
	}

	public JLabel getLabelQuery1Landslide() {
		return labelQuery1Landslide;
	}

	public JLabel getLabelQuery1Tsunami() {
		return labelQuery1Tsunami;
	}

	public JLabel getLabelQuery1ForestFire() {
		return labelQuery1ForestFire;
	}

	public JLabel getLabelQuery1Digmaan() {
		return labelQuery1Digmaan;
	}

	public JSpinner getSpinnerQuery1BulkanFrequencyLower() {
		return spinnerQuery1BulkanFrequencyLower;
	}

	public JSpinner getSpinnerQuery1BulkanFrequencyUpper() {
		return spinnerQuery1BulkanFrequencyUpper;
	}

	public JSpinner getSpinnerQuery1LandslideFrequencyLower() {
		return spinnerQuery1LandslideFrequencyLower;
	}

	public JSpinner getSpinnerQuery1LandslideFrequencyUpper() {
		return spinnerQuery1LandslideFrequencyUpper;
	}

	public JSpinner getSpinnerQuery1TsunamiFrequencyLower() {
		return spinnerQuery1TsunamiFrequencyLower;
	}

	public JSpinner getSpinnerQuery1TsunamiFrequencyUpper() {
		return spinnerQuery1TsunamiFrequencyUpper;
	}

	public JSpinner getSpinnerQuery1ForestFireFrequencyUpper() {
		return spinnerQuery1ForestFireFrequencyUpper;
	}

	public JSpinner getSpinnerQuery1DigmaanFrequencyLower() {
		return spinnerQuery1DigmaanFrequencyLower;
	}

	public JSpinner getSpinnerQuery1DigmaanFrequencyUpper() {
		return spinnerQuery1DigmaanFrequencyUpper;
	}

	public JLabel getLabelQuery1BulkanFrequency() {
		return labelQuery1BulkanFrequency;
	}

	public JLabel getLabelQuery1LandslideFrequency() {
		return labelQuery1LandslideFrequency;
	}

	public JLabel getLabelQuery1TsunamiFrequency() {
		return labelQuery1TsunamiFrequency;
	}

	public JLabel getLabelQuery1ForestFireFrequency() {
		return labelQuery1ForestFireFrequency;
	}

	public JLabel getLabelQuery1DigmaanFrequency() {
		return labelQuery1DigmaanFrequency;
	}

	public JLabel getLabelQuery1BulkanAid() {
		return labelQuery1BulkanAid;
	}

	public JLabel getLabelQuery1LandslideAid() {
		return labelQuery1LandslideAid;
	}

	public JLabel getLabelQuery1TsunamiAid() {
		return labelQuery1TsunamiAid;
	}

	public JLabel getLabelQuery1ForestFireAid() {
		return labelQuery1ForestFireAid;
	}

	public JLabel getLabelQuery1DigmaanAid() {
		return labelQuery1DigmaanAid;
	}

	public JSpinner getSpinnerQuery1ForestFireFrequencyLower() {
		return spinnerQuery1ForestFireFrequencyLower;
	}

	public JPanel getPanel_query3() {
		return panel_query3;
	}

	public JButton getButtonQuery3Back() {
		return buttonQuery3Back;
	}

	public JLabel getLabelQuery3() {
		return labelQuery3;
	}

	public JLabel getLabelQuery3Municipality() {
		return labelQuery3Municipality;
	}

	public JComboBox<String> getComboBoxQuery3Municipality() {
		return comboBoxQuery3Municipality;
	}

	public JLabel getLabelQuery3Zone() {
		return labelQuery3Zone;
	}

	public JComboBox<String> getComboBoxQuery3Zone() {
		return comboBoxQuery3Zone;
	}

	public JLabel getLabelQuery3Barangay() {
		return labelQuery3Barangay;
	}

	public JComboBox<String> getComboBoxQuery3Barangay() {
		return comboBoxQuery3Barangay;
	}

	public JLabel getLabelQuery3Purok() {
		return labelQuery3Purok;
	}

	public JComboBox<String> getComboBoxQuery3Purok() {
		return comboBoxQuery3Purok;
	}

	public JLabel getLabelQuery3CropType() {
		return labelQuery3CropType;
	}

	public JComboBox<String> getComboBoxQuery3CropType() {
		return comboBoxQuery3CropType;
	}

	public JButton getButtonQuery3Query() {
		return buttonQuery3Query;
	}

	public JLabel getLabelQuery3Status() {
		return labelQuery3Status;
	}

	public JTable getTableQuery3ResultTable() {
		return tableQuery3ResultTable;
	}

	public JScrollPane getScrollPaneQuery3ResultTable() {
		return scrollPaneQuery3ResultTable;
	}

	public JCheckBox getCheckBoxQuery3Municipality() {
		return checkBoxQuery3Municipality;
	}

	public JCheckBox getCheckBoxQuery3Purok() {
		return checkBoxQuery3Purok;
	}

	public JCheckBox getCheckBoxQuery3Zone() {
		return checkBoxQuery3Zone;
	}

	public JCheckBox getCheckBoxQuery3CropType() {
		return checkBoxQuery3CropType;
	}

	public JCheckBox getCheckBoxQuery3Barangay() {
		return checkBoxQuery3Barangay;
	}

	public JPanel getPanel_query4() {
		return panel_query4;
	}

	public JButton getButtonQuery4Back() {
		return buttonQuery4Back;
	}

	public JLabel getLabelQuery4() {
		return labelQuery4;
	}

	public JCheckBox getCheckBoxQuery4Municipality() {
		return checkBoxQuery4Municipality;
	}

	public JLabel getLabelQuery4Municipality() {
		return labelQuery4Municipality;
	}

	public JComboBox<String> getComboBoxQuery4Municipality() {
		return comboBoxQuery4Municipality;
	}

	public JCheckBox getCheckBoxQuery4Zone() {
		return checkBoxQuery4Zone;
	}

	public JLabel getLabelQuery4Zone() {
		return labelQuery4Zone;
	}

	public JComboBox<String> getComboBoxQuery4Zone() {
		return comboBoxQuery4Zone;
	}

	public JCheckBox getCheckBoxQuery4Barangay() {
		return checkBoxQuery4Barangay;
	}

	public JLabel getLabelQuery4Barangay() {
		return labelQuery4Barangay;
	}

	public JComboBox<String> getComboBoxQuery4Barangay() {
		return comboBoxQuery4Barangay;
	}

	public JCheckBox getCheckBoxQuery4Purok() {
		return checkBoxQuery4Purok;
	}

	public JLabel getLabelQuery4Purok() {
		return labelQuery4Purok;
	}

	public JComboBox<String> getComboBoxQuery4Purok() {
		return comboBoxQuery4Purok;
	}

	public JCheckBox getCheckBoxQuery4Pagkamatay() {
		return checkBoxQuery4Pagkamatay;
	}

	public JLabel getLabelQuery4Pagkamatay() {
		return labelQuery4Pagkamatay;
	}

	public JComboBox<String> getComboBoxQuery4Pagkamatay() {
		return comboBoxQuery4Pagkamatay;
	}

	public JButton getButtonQuery4Query() {
		return buttonQuery4Query;
	}

	public JLabel getLabelQuery4Status() {
		return labelQuery4Status;
	}

	public JTable getTableQuery4ResultTable() {
		return tableQuery4ResultTable;
	}

	public JScrollPane getScrollPaneQuery4ResultTable() {
		return scrollPaneQuery4ResultTable;
	}

	public JPanel getPanel_query5() {
		return panel_query5;
	}

	public JButton getButtonQuery5Back() {
		return buttonQuery5Back;
	}

	public JLabel getLabelQuery5() {
		return labelQuery5;
	}

	public JCheckBox getCheckBoxQuery5Municipality() {
		return checkBoxQuery5Municipality;
	}

	public JLabel getLabelQuery5Municipality() {
		return labelQuery5Municipality;
	}

	public JComboBox<String> getComboBoxQuery5Municipality() {
		return comboBoxQuery5Municipality;
	}

	public JCheckBox getCheckBoxQuery5Zone() {
		return checkBoxQuery5Zone;
	}

	public JLabel getLabelQuery5Zone() {
		return labelQuery5Zone;
	}

	public JComboBox<String> getComboBoxQuery5Zone() {
		return comboBoxQuery5Zone;
	}

	public JCheckBox getCheckBoxQuery5Barangay() {
		return checkBoxQuery5Barangay;
	}

	public JLabel getLabelQuery5Barangay() {
		return labelQuery5Barangay;
	}

	public JComboBox<String> getComboBoxQuery5Barangay() {
		return comboBoxQuery5Barangay;
	}

	public JCheckBox getCheckBoxQuery5Purok() {
		return checkBoxQuery5Purok;
	}

	public JLabel getLabelQuery5Purok() {
		return labelQuery5Purok;
	}

	public JComboBox<String> getComboBoxQuery5Purok() {
		return comboBoxQuery5Purok;
	}

	public JCheckBox getCheckBoxQuery5Kagamitan() {
		return checkBoxQuery5Kagamitan;
	}

	public JLabel getLabelQuery5Kagamitan() {
		return labelQuery5Kagamitan;
	}

	public JComboBox<String> getComboBoxQuery5Kagamitan() {
		return comboBoxQuery5Kagamitan;
	}

	public JButton getButtonQuery5Query() {
		return buttonQuery5Query;
	}

	public JLabel getLabelQuery5Status() {
		return labelQuery5Status;
	}

	public JTable getTableQuery5ResultTable() {
		return tableQuery5ResultTable;
	}

	public JScrollPane getScrollPaneQuery5ResultTable() {
		return scrollPaneQuery5ResultTable;
	}

	public JPanel getPanel_query6() {
		return panel_query6;
	}

	public JButton getButtonQuery6Back() {
		return buttonQuery6Back;
	}

	public JLabel getLabelQuery6() {
		return labelQuery6;
	}

	public JCheckBox getCheckBoxQuery6Municipality() {
		return checkBoxQuery6Municipality;
	}

	public JLabel getLabelQuery6Municipality() {
		return labelQuery6Municipality;
	}

	public JComboBox<String> getComboBoxQuery6Municipality() {
		return comboBoxQuery6Municipality;
	}

	public JCheckBox getCheckBoxQuery6Zone() {
		return checkBoxQuery6Zone;
	}

	public JLabel getLabelQuery6Zone() {
		return labelQuery6Zone;
	}

	public JComboBox<String> getComboBoxQuery6Zone() {
		return comboBoxQuery6Zone;
	}

	public JCheckBox getCheckBoxQuery6Barangay() {
		return checkBoxQuery6Barangay;
	}

	public JLabel getLabelQuery6Barangay() {
		return labelQuery6Barangay;
	}

	public JComboBox<String> getComboBoxQuery6Barangay() {
		return comboBoxQuery6Barangay;
	}

	public JCheckBox getCheckBoxQuery6Purok() {
		return checkBoxQuery6Purok;
	}

	public JLabel getLabelQuery6Purok() {
		return labelQuery6Purok;
	}

	public JComboBox<String> getComboBoxQuery6Purok() {
		return comboBoxQuery6Purok;
	}

	public JButton getButtonQuery6Query() {
		return buttonQuery6Query;
	}

	public JLabel getLabelQuery6Status() {
		return labelQuery6Status;
	}

	public JTable getTableQuery6ResultTable() {
		return tableQuery6ResultTable;
	}

	public JScrollPane getScrollPaneQuery6ResultTable() {
		return scrollPaneQuery6ResultTable;
	}

	public JPanel getPanel_query7() {
		return panel_query7;
	}

	public JButton getButtonQuery7Back() {
		return buttonQuery7Back;
	}

	public JLabel getLabelQuery7() {
		return labelQuery7;
	}

	public JCheckBox getCheckBoxQuery7Municipality() {
		return checkBoxQuery7Municipality;
	}

	public JLabel getLabelQuery7Municipality() {
		return labelQuery7Municipality;
	}

	public JComboBox<String> getComboBoxQuery7Municipality() {
		return comboBoxQuery7Municipality;
	}

	public JCheckBox getCheckBoxQuery7Zone() {
		return checkBoxQuery7Zone;
	}

	public JLabel getLabelQuery7Zone() {
		return labelQuery7Zone;
	}

	public JComboBox<String> getComboBoxQuery7Zone() {
		return comboBoxQuery7Zone;
	}

	public JCheckBox getCheckBoxQuery7Barangay() {
		return checkBoxQuery7Barangay;
	}

	public JLabel getLabelQuery7Barangay() {
		return labelQuery7Barangay;
	}

	public JComboBox<String> getComboBoxQuery7Barangay() {
		return comboBoxQuery7Barangay;
	}

	public JCheckBox getCheckBoxQuery7Purok() {
		return checkBoxQuery7Purok;
	}

	public JLabel getLabelQuery7Purok() {
		return labelQuery7Purok;
	}

	public JComboBox<String> getComboBoxQuery7Purok() {
		return comboBoxQuery7Purok;
	}

	public JCheckBox getCheckBoxQuery7CropType() {
		return checkBoxQuery7CropType;
	}

	public JLabel getLabelQuery7CropType() {
		return labelQuery7CropType;
	}

	public JComboBox<String> getComboBoxQuery7CropType() {
		return comboBoxQuery7CropType;
	}

	public JLabel getLabelQuery7Status() {
		return labelQuery7Status;
	}

	public JLabel getLabelQuery7AgriculturalRecord() {
		return labelQuery7AgriculturalRecord;
	}

	public JLabel getLabelQuery7BeastOfBurden() {
		return labelQuery7BeastOfBurden;
	}

	public JComboBox<String> getComboBoxQuery7BeastOfBurden() {
		return comboBoxQuery7BeastOfBurden;
	}

	public JComboBox<String> getComboBoxQuery7Plow() {
		return comboBoxQuery7Plow;
	}

	public JComboBox<String> getComboBoxQuery7Harrow() {
		return comboBoxQuery7Harrow;
	}

	public JLabel getLabelQuery7Plow() {
		return labelQuery7Plow;
	}

	public JLabel getLabelQuery7Harrow() {
		return labelQuery7Harrow;
	}

	public JComboBox<String> getComboBoxQuery7Mower() {
		return comboBoxQuery7Mower;
	}

	public JComboBox<String> getComboBoxQuery7Thresher() {
		return comboBoxQuery7Thresher;
	}

	public JComboBox<String> getComboBoxQuery7InsecticideSprayer() {
		return comboBoxQuery7InsecticideSprayer;
	}

	public JLabel getLabelQuery7Mower() {
		return labelQuery7Mower;
	}

	public JLabel getLabelQuery7Thresher() {
		return labelQuery7Thresher;
	}

	public JLabel getLabelQuery7InsecticideSprayer() {
		return labelQuery7InsecticideSprayer;
	}

	public JComboBox<String> getComboBoxQuery7FarmTractor() {
		return comboBoxQuery7FarmTractor;
	}

	public JComboBox<String> getComboBoxQuery7HandTractor() {
		return comboBoxQuery7HandTractor;
	}

	public JComboBox<String> getComboBoxQuery7Mudboat() {
		return comboBoxQuery7Mudboat;
	}

	public JComboBox<String> getComboBoxQuery7PlanterDryer() {
		return comboBoxQuery7PlanterDryer;
	}

	public JComboBox<String> getComboBoxQuery7MechanicalDryer() {
		return comboBoxQuery7MechanicalDryer;
	}

	public JComboBox<String> getComboBoxQuery7DryingPavement() {
		return comboBoxQuery7DryingPavement;
	}

	public JComboBox<String> getComboBoxQuery7FeedMill() {
		return comboBoxQuery7FeedMill;
	}

	public JComboBox<String> getComboBoxQuery7Harvester() {
		return comboBoxQuery7Harvester;
	}

	public JComboBox<String> getComboBoxQuery7WarehouseGranary() {
		return comboBoxQuery7WarehouseGranary;
	}

	public JComboBox<String> getComboBoxQuery7Farmshed() {
		return comboBoxQuery7Farmshed;
	}

	public JComboBox<String> getComboBoxQuery7IrrigationPump() {
		return comboBoxQuery7IrrigationPump;
	}

	public JComboBox<String> getComboBoxQuery7Others() {
		return comboBoxQuery7Others;
	}

	public JLabel getLabelQuery7FarmTractor() {
		return labelQuery7FarmTractor;
	}

	public JLabel getLabelQuery7HandTractor() {
		return labelQuery7HandTractor;
	}

	public JLabel getLabelQuery7Mudboat() {
		return labelQuery7Mudboat;
	}

	public JLabel getLabelQuery7PlanterDryer() {
		return labelQuery7PlanterDryer;
	}

	public JLabel getLabelQuery7MechanicalDryer() {
		return labelQuery7MechanicalDryer;
	}

	public JLabel getLabelQuery7DryingPavement() {
		return labelQuery7DryingPavement;
	}

	public JLabel getLabelQuery7FeedMill() {
		return labelQuery7FeedMill;
	}

	public JLabel getLabelQuery7Harvester() {
		return labelQuery7Harvester;
	}

	public JLabel getLabelQuery7WarehouseGranary() {
		return labelQuery7WarehouseGranary;
	}

	public JLabel getLabelQuery7Farmshed() {
		return labelQuery7Farmshed;
	}

	public JLabel getLabelQuery7IrrigationPump() {
		return labelQuery7IrrigationPump;
	}

	public JLabel getLabelQuery7Others() {
		return labelQuery7Others;
	}

	public JLabel getLabelQuery7Age() {
		return labelQuery7Age;
	}

	public JSpinner getSpinnerQuery7AgeLower() {
		return spinnerQuery7AgeLower;
	}

	public JSpinner getSpinnerQuery7AgeUpper() {
		return spinnerQuery7AgeUpper;
	}

	public JLabel getLabelQuery7YearFarming() {
		return labelQuery7YearFarming;
	}

	public JSpinner getSpinnerQuery7YearFarmingLower() {
		return spinnerQuery7YearFarmingLower;
	}

	public JSpinner getSpinnerQuery7YearFarmingUpper() {
		return spinnerQuery7YearFarmingUpper;
	}

	public JComboBox<String> getComboBoxQuery7ARCDP() {
		return comboBoxQuery7ARCDP;
	}

	public JLabel getLabelQuery7ARCDP() {
		return labelQuery7ARCDP;
	}

	public JLabel getLabelQuery7Dahilan() {
		return labelQuery7Dahilan;
	}

	public JComboBox<String> getComboBoxQuery7Dahilan() {
		return comboBoxQuery7Dahilan;
	}

	public JComboBox<String> getComboBoxQuery7CropInsurance() {
		return comboBoxQuery7CropInsurance;
	}

	public JComboBox<String> getComboBoxQuery7EquipmentInsurance() {
		return comboBoxQuery7EquipmentInsurance;
	}

	public JLabel getLabelQuery7CropInsurance() {
		return labelQuery7CropInsurance;
	}

	public JLabel getLabelQuery7EquipmentInsurance() {
		return labelQuery7EquipmentInsurance;
	}

	public JTable getTableQuery7ResultTable() {
		return tableQuery7ResultTable;
	}

	public JScrollPane getScrollPaneQuery7ResultTable() {
		return scrollPaneQuery7ResultTable;
	}
}
