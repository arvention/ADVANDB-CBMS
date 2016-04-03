package mvc;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class InteractivePanel extends JPanel {

	private static InteractivePanel interactivePanel = new InteractivePanel();
	private static final long serialVersionUID = 1L;
	private JLabel labelAGRISYS;
	private JPanel panelGeo;
	private JLabel labelProvince;
	private JComboBox<String> comboBoxProvince;
	private JLabel labelMunicipality;
	private JComboBox<String> comboBoxMunicipality;
	private JLabel labelZone;
	private JComboBox<String> comboBoxZone;
	private JLabel labelBarangay;
	private JComboBox<String> comboBoxBarangay;
	private JLabel labelPurok;
	private JComboBox<String> comboBoxPurok;
	private JPanel panelAgri;
	private JLabel labelIndustry;
	private JComboBox<String> comboBoxIndustry;
	private JLabel labelARCDP;
	private JComboBox<String> comboBoxARCDP;
	private JLabel labelCropInsurance;
	private JComboBox<String> comboBoxCropInsurance;
	private JLabel labelAgriculturalInsurance;
	private JComboBox<String> comboBoxAgriculturalInsurance;
	private JLabel labelChangePrimaryCrop;
	private JComboBox<String> comboBoxChangePrimaryCrop;
	private JLabel labelReasonChangePrimaryCrop;
	private JComboBox<String> comboBoxReasonChangePrimaryCrop;
	private JLabel labelChangeSameCrop;
	private JComboBox<String> comboBoxChangeSameCrop;
	private JLabel labelReasonChangeSameCrop;
	private JComboBox<String> comboBoxReasonChangeSameCrop;
	private JLabel labelLowHarvest;
	private JComboBox<String> comboBoxLowHarvest;
	private JLabel labelWaterSupply;
	private JComboBox<String> comboBoxWaterSupply;
	private JLabel labelDrought;
	private JComboBox<String> comboBoxDrought;
	private JLabel labelDuration;
	private JComboBox<String> comboBoxDuration;
	private JLabel labelFlood;
	private JComboBox<String> comboBoxFlood;
	private JLabel labelCropType;
	private JComboBox<String> comboBoxCropType;
	private JPanel panelResources;
	private JLabel labelBeastOfBurden;
	private JComboBox<String> comboBoxBeastOfBurden;
	private JLabel labelCountBeastOfBurden;
	private JSpinner spinnerCountBeastOfBurdenLower;
	private JSpinner spinnerCountBeastOfBurdenUpper;
	private JLabel labelPlow;
	private JComboBox<String> comboBoxPlow;
	private JLabel labelCountPlow;
	private JSpinner spinnerCountPlowLower;
	private JSpinner spinnerCountPlowUpper;
	private JLabel labelHarrow;
	private JComboBox<String> comboBoxHarrow;
	private JLabel labelCountHarrow;
	private JSpinner spinnerCountHarrowLower;
	private JSpinner spinnerCountHarrowUpper;
	private JLabel labelMower;
	private JComboBox<String> comboBoxMower;
	private JLabel labelCountMower;
	private JSpinner spinnerCountMowerLower;
	private JSpinner spinnerCountMowerUpper;
	private JLabel labelThresher;
	private JComboBox<String> comboBoxThresher;
	private JLabel labelCountThresher;
	private JSpinner spinnerCountThresherLower;
	private JSpinner spinnerCountThresherUpper;
	private JLabel labelSprayer;
	private JComboBox<String> comboBoxSprayer;
	private JLabel labelCountSprayer;
	private JSpinner spinnerCountSprayerLower;
	private JSpinner spinnerCountSprayerUpper;
	private JLabel labelFarmTractor;
	private JComboBox<String> comboBoxFarmTractor;
	private JLabel labelCountFarmTractor;
	private JSpinner spinnerCountFarmTractorLower;
	private JSpinner spinnerCountFarmTractorUpper;
	private JLabel labelHandTractor;
	private JComboBox<String> comboBoxHandTractor;
	private JLabel labelCountHandTractor;
	private JSpinner spinnerCountHandTractorLower;
	private JSpinner spinnerCountHandTractorUpper;
	private JLabel labelMudboat;
	private JComboBox<String> comboBoxMudboat;
	private JLabel labelCountMudboat;
	private JSpinner spinnerCountMudboatLower;
	private JSpinner spinnerCountMudboatUpper;
	private JLabel labelPlanter;
	private JComboBox<String> comboBoxPlanter;
	private JLabel labelCountPlanter;
	private JSpinner spinnerCountPlanterLower;
	private JSpinner spinnerCountPlanterUpper;
	private JLabel labelMechanicalDryer;
	private JComboBox<String> comboBoxMechanicalDryer;
	private JLabel labelCountMechanicalDryer;
	private JSpinner spinnerCountMechanicalDryerLower;
	private JSpinner spinnerCountMechanicalDryerUpper;
	private JLabel labelDryingPavement;
	private JComboBox<String> comboBoxDryingPavement;
	private JLabel labelCountDryingPavement;
	private JSpinner spinnerCountDryingPavementLower;
	private JSpinner spinnerCountDryingPavementUpper;
	private JLabel labelFeedMill;
	private JComboBox<String> comboBoxFeedMill;
	private JLabel labelCountFeedMill;
	private JSpinner spinnerCountFeedMillLower;
	private JSpinner spinnerCountFeedMillUpper;
	private JLabel labelHarvester;
	private JComboBox<String> comboBoxHarvester;
	private JLabel labelCountHarvester;
	private JSpinner spinnerCountHarvesterLower;
	private JSpinner spinnerCountHarvesterUpper;
	private JLabel labelGranary;
	private JComboBox<String> comboBoxGranary;
	private JLabel labelCountGranary;
	private JSpinner spinnerCountGranaryLower;
	private JSpinner spinnerCountGranaryUpper;
	private JLabel labelFarmshed;
	private JComboBox<String> comboBoxFarmshed;
	private JLabel labelCountFarmshed;
	private JSpinner spinnerCountFarmshedLower;
	private JSpinner spinnerCountFarmshedUpper;
	private JLabel labelIrrigationPump;
	private JComboBox<String> comboBoxIrrigationPump;
	private JLabel labelCountIrrigationPump;
	private JSpinner spinnerCountIrrigationPumpLower;
	private JSpinner spinnerCountIrrigationPumpUpper;
	private JLabel labelOthers;
	private JComboBox<String> comboBoxOthers;
	private JLabel labelCountOthers;
	private JSpinner spinnerCountOthersLower;
	private JSpinner spinnerCountOthersUpper;
	private JLabel labelStatus;
	private JButton buttonInfer;

	public static InteractivePanel getInstance(){
		return interactivePanel;
	}
	
	private InteractivePanel() {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		} 
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {520, 80};
		gridBagLayout.rowHeights = new int[]{40, 50, 50, 260, 20, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		labelAGRISYS = new JLabel("AGRISYS - Agricultural Geo Resource Inference System");
		labelAGRISYS.setFont(new Font("Rockwell", Font.PLAIN, 22));
		GridBagConstraints gbc_labelAGRISYS = new GridBagConstraints();
		gbc_labelAGRISYS.gridwidth = 2;
		gbc_labelAGRISYS.insets = new Insets(0, 0, 5, 0);
		gbc_labelAGRISYS.gridx = 0;
		gbc_labelAGRISYS.gridy = 0;
		add(labelAGRISYS, gbc_labelAGRISYS);
		
		panelGeo = new JPanel();
		panelGeo.setBorder(new TitledBorder(null, "Geographic Location", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelGeo = new GridBagConstraints();
		gbc_panelGeo.gridwidth = 2;
		gbc_panelGeo.fill = GridBagConstraints.BOTH;
		gbc_panelGeo.insets = new Insets(0, 0, 5, 0);
		gbc_panelGeo.gridx = 0;
		gbc_panelGeo.gridy = 1;
		add(panelGeo, gbc_panelGeo);
		GridBagLayout gbl_panelGeo = new GridBagLayout();
		gbl_panelGeo.columnWidths = new int[]{58, 58, 58, 58, 40, 58, 58, 58, 40, 58};
		gbl_panelGeo.rowHeights = new int[]{0, 0};
		gbl_panelGeo.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0};
		gbl_panelGeo.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelGeo.setLayout(gbl_panelGeo);
		
		labelProvince = new JLabel("Province");
		GridBagConstraints gbc_labelProvince = new GridBagConstraints();
		gbc_labelProvince.anchor = GridBagConstraints.EAST;
		gbc_labelProvince.insets = new Insets(0, 0, 0, 5);
		gbc_labelProvince.gridx = 0;
		gbc_labelProvince.gridy = 0;
		panelGeo.add(labelProvince, gbc_labelProvince);
		
		comboBoxProvince = new JComboBox<>();
		comboBoxProvince.setModel(new DefaultComboBoxModel<>(new String[] {"SELECT", "1", "2"}));
		GridBagConstraints gbc_comboBoxProvince = new GridBagConstraints();
		gbc_comboBoxProvince.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxProvince.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxProvince.gridx = 1;
		gbc_comboBoxProvince.gridy = 0;
		panelGeo.add(comboBoxProvince, gbc_comboBoxProvince);
		
		labelMunicipality = new JLabel("Municipality");
		GridBagConstraints gbc_labelMunicipality = new GridBagConstraints();
		gbc_labelMunicipality.insets = new Insets(0, 0, 0, 5);
		gbc_labelMunicipality.anchor = GridBagConstraints.EAST;
		gbc_labelMunicipality.gridx = 2;
		gbc_labelMunicipality.gridy = 0;
		panelGeo.add(labelMunicipality, gbc_labelMunicipality);
		
		comboBoxMunicipality = new JComboBox<>();
		comboBoxMunicipality.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		GridBagConstraints gbc_comboBoxMunicipality = new GridBagConstraints();
		gbc_comboBoxMunicipality.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxMunicipality.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMunicipality.gridx = 3;
		gbc_comboBoxMunicipality.gridy = 0;
		panelGeo.add(comboBoxMunicipality, gbc_comboBoxMunicipality);
		
		labelZone = new JLabel("Zone");
		GridBagConstraints gbc_labelZone = new GridBagConstraints();
		gbc_labelZone.insets = new Insets(0, 0, 0, 5);
		gbc_labelZone.anchor = GridBagConstraints.EAST;
		gbc_labelZone.gridx = 4;
		gbc_labelZone.gridy = 0;
		panelGeo.add(labelZone, gbc_labelZone);
		
		comboBoxZone = new JComboBox<>();
		comboBoxZone.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "12", "13", "14", "15", "16", "17", "18", "19", "99"}));
		GridBagConstraints gbc_comboBoxZone = new GridBagConstraints();
		gbc_comboBoxZone.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxZone.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxZone.gridx = 5;
		gbc_comboBoxZone.gridy = 0;
		panelGeo.add(comboBoxZone, gbc_comboBoxZone);
		
		labelBarangay = new JLabel("Barangay");
		GridBagConstraints gbc_labelBarangay = new GridBagConstraints();
		gbc_labelBarangay.insets = new Insets(0, 0, 0, 5);
		gbc_labelBarangay.anchor = GridBagConstraints.EAST;
		gbc_labelBarangay.gridx = 6;
		gbc_labelBarangay.gridy = 0;
		panelGeo.add(labelBarangay, gbc_labelBarangay);
		
		comboBoxBarangay = new JComboBox<>();
		comboBoxBarangay.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61"}));
		GridBagConstraints gbc_comboBoxBarangay = new GridBagConstraints();
		gbc_comboBoxBarangay.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxBarangay.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxBarangay.gridx = 7;
		gbc_comboBoxBarangay.gridy = 0;
		panelGeo.add(comboBoxBarangay, gbc_comboBoxBarangay);
		
		labelPurok = new JLabel("Purok");
		GridBagConstraints gbc_labelPurok = new GridBagConstraints();
		gbc_labelPurok.insets = new Insets(0, 0, 0, 5);
		gbc_labelPurok.anchor = GridBagConstraints.EAST;
		gbc_labelPurok.gridx = 8;
		gbc_labelPurok.gridy = 0;
		panelGeo.add(labelPurok, gbc_labelPurok);
		
		comboBoxPurok = new JComboBox<>();
		comboBoxPurok.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "26", "99"}));
		GridBagConstraints gbc_comboBoxPurok = new GridBagConstraints();
		gbc_comboBoxPurok.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxPurok.gridx = 9;
		gbc_comboBoxPurok.gridy = 0;
		panelGeo.add(comboBoxPurok, gbc_comboBoxPurok);
		
		panelAgri = new JPanel();
		panelAgri.setBorder(new TitledBorder(null, "Agricultural Status", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelAgri = new GridBagConstraints();
		gbc_panelAgri.gridwidth = 2;
		gbc_panelAgri.insets = new Insets(0, 0, 5, 0);
		gbc_panelAgri.fill = GridBagConstraints.BOTH;
		gbc_panelAgri.gridx = 0;
		gbc_panelAgri.gridy = 2;
		add(panelAgri, gbc_panelAgri);
		GridBagLayout gbl_panelAgri = new GridBagLayout();
		gbl_panelAgri.columnWidths = new int[]{135, 135, 135, 135, 0};
		gbl_panelAgri.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelAgri.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelAgri.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelAgri.setLayout(gbl_panelAgri);
		
		labelIndustry = new JLabel("Part of the Crop Industry");
		GridBagConstraints gbc_labelIndustry = new GridBagConstraints();
		gbc_labelIndustry.insets = new Insets(0, 0, 5, 5);
		gbc_labelIndustry.anchor = GridBagConstraints.EAST;
		gbc_labelIndustry.gridx = 0;
		gbc_labelIndustry.gridy = 0;
		panelAgri.add(labelIndustry, gbc_labelIndustry);
		
		comboBoxIndustry = new JComboBox<>();
		comboBoxIndustry.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Yes", "No"}));
		GridBagConstraints gbc_comboBoxIndustry = new GridBagConstraints();
		gbc_comboBoxIndustry.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxIndustry.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxIndustry.gridx = 1;
		gbc_comboBoxIndustry.gridy = 0;
		panelAgri.add(comboBoxIndustry, gbc_comboBoxIndustry);
		
		labelARCDP = new JLabel("ARCDP Recipient");
		GridBagConstraints gbc_labelARCDP = new GridBagConstraints();
		gbc_labelARCDP.anchor = GridBagConstraints.EAST;
		gbc_labelARCDP.insets = new Insets(0, 0, 5, 5);
		gbc_labelARCDP.gridx = 2;
		gbc_labelARCDP.gridy = 0;
		panelAgri.add(labelARCDP, gbc_labelARCDP);
		
		comboBoxARCDP = new JComboBox<>();
		comboBoxARCDP.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Yes", "No"}));
		GridBagConstraints gbc_comboBoxARCDP = new GridBagConstraints();
		gbc_comboBoxARCDP.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxARCDP.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxARCDP.gridx = 3;
		gbc_comboBoxARCDP.gridy = 0;
		panelAgri.add(comboBoxARCDP, gbc_comboBoxARCDP);
		
		labelCropInsurance = new JLabel("Crop Insurance");
		GridBagConstraints gbc_labelCropInsurance = new GridBagConstraints();
		gbc_labelCropInsurance.anchor = GridBagConstraints.EAST;
		gbc_labelCropInsurance.insets = new Insets(0, 0, 5, 5);
		gbc_labelCropInsurance.gridx = 0;
		gbc_labelCropInsurance.gridy = 1;
		panelAgri.add(labelCropInsurance, gbc_labelCropInsurance);
		
		comboBoxCropInsurance = new JComboBox<>();
		comboBoxCropInsurance.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Yes", "No"}));
		GridBagConstraints gbc_comboBoxCropInsurance = new GridBagConstraints();
		gbc_comboBoxCropInsurance.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxCropInsurance.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxCropInsurance.gridx = 1;
		gbc_comboBoxCropInsurance.gridy = 1;
		panelAgri.add(comboBoxCropInsurance, gbc_comboBoxCropInsurance);
		
		labelAgriculturalInsurance = new JLabel("Agricultural Equipment Insurance");
		GridBagConstraints gbc_labelAgriculturalInsurance = new GridBagConstraints();
		gbc_labelAgriculturalInsurance.anchor = GridBagConstraints.EAST;
		gbc_labelAgriculturalInsurance.insets = new Insets(0, 0, 5, 5);
		gbc_labelAgriculturalInsurance.gridx = 2;
		gbc_labelAgriculturalInsurance.gridy = 1;
		panelAgri.add(labelAgriculturalInsurance, gbc_labelAgriculturalInsurance);
		
		comboBoxAgriculturalInsurance = new JComboBox<>();
		comboBoxAgriculturalInsurance.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Yes", "No"}));
		GridBagConstraints gbc_comboBoxAgriculturalInsurance = new GridBagConstraints();
		gbc_comboBoxAgriculturalInsurance.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxAgriculturalInsurance.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxAgriculturalInsurance.gridx = 3;
		gbc_comboBoxAgriculturalInsurance.gridy = 1;
		panelAgri.add(comboBoxAgriculturalInsurance, gbc_comboBoxAgriculturalInsurance);
		
		labelChangePrimaryCrop = new JLabel("Change Primary Crop");
		GridBagConstraints gbc_labelChangePrimaryCrop = new GridBagConstraints();
		gbc_labelChangePrimaryCrop.anchor = GridBagConstraints.EAST;
		gbc_labelChangePrimaryCrop.insets = new Insets(0, 0, 5, 5);
		gbc_labelChangePrimaryCrop.gridx = 0;
		gbc_labelChangePrimaryCrop.gridy = 2;
		panelAgri.add(labelChangePrimaryCrop, gbc_labelChangePrimaryCrop);
		
		comboBoxChangePrimaryCrop = new JComboBox<>();
		comboBoxChangePrimaryCrop.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Yes", "No"}));
		GridBagConstraints gbc_comboBoxChangePrimaryCrop = new GridBagConstraints();
		gbc_comboBoxChangePrimaryCrop.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxChangePrimaryCrop.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxChangePrimaryCrop.gridx = 1;
		gbc_comboBoxChangePrimaryCrop.gridy = 2;
		panelAgri.add(comboBoxChangePrimaryCrop, gbc_comboBoxChangePrimaryCrop);
		
		labelReasonChangePrimaryCrop = new JLabel("Reason");
		GridBagConstraints gbc_labelReasonChangePrimaryCrop = new GridBagConstraints();
		gbc_labelReasonChangePrimaryCrop.anchor = GridBagConstraints.EAST;
		gbc_labelReasonChangePrimaryCrop.insets = new Insets(0, 0, 5, 5);
		gbc_labelReasonChangePrimaryCrop.gridx = 2;
		gbc_labelReasonChangePrimaryCrop.gridy = 2;
		panelAgri.add(labelReasonChangePrimaryCrop, gbc_labelReasonChangePrimaryCrop);
		
		comboBoxReasonChangePrimaryCrop = new JComboBox<>();
		comboBoxReasonChangePrimaryCrop.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "More cheap", "More resistant to pest", "Less water", "More profitable", "Availability", "Others"}));
		GridBagConstraints gbc_comboBoxReasonChangePrimaryCrop = new GridBagConstraints();
		gbc_comboBoxReasonChangePrimaryCrop.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxReasonChangePrimaryCrop.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxReasonChangePrimaryCrop.gridx = 3;
		gbc_comboBoxReasonChangePrimaryCrop.gridy = 2;
		panelAgri.add(comboBoxReasonChangePrimaryCrop, gbc_comboBoxReasonChangePrimaryCrop);
		
		labelChangeSameCrop = new JLabel("Change Same Crop");
		GridBagConstraints gbc_labelChangeSameCrop = new GridBagConstraints();
		gbc_labelChangeSameCrop.anchor = GridBagConstraints.EAST;
		gbc_labelChangeSameCrop.insets = new Insets(0, 0, 5, 5);
		gbc_labelChangeSameCrop.gridx = 0;
		gbc_labelChangeSameCrop.gridy = 3;
		panelAgri.add(labelChangeSameCrop, gbc_labelChangeSameCrop);
		
		comboBoxChangeSameCrop = new JComboBox<>();
		comboBoxChangeSameCrop.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Yes", "No"}));
		GridBagConstraints gbc_comboBoxChangeSameCrop = new GridBagConstraints();
		gbc_comboBoxChangeSameCrop.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxChangeSameCrop.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxChangeSameCrop.gridx = 1;
		gbc_comboBoxChangeSameCrop.gridy = 3;
		panelAgri.add(comboBoxChangeSameCrop, gbc_comboBoxChangeSameCrop);
		
		labelReasonChangeSameCrop = new JLabel("Reason");
		GridBagConstraints gbc_labelReasonChangeSameCrop = new GridBagConstraints();
		gbc_labelReasonChangeSameCrop.anchor = GridBagConstraints.EAST;
		gbc_labelReasonChangeSameCrop.insets = new Insets(0, 0, 5, 5);
		gbc_labelReasonChangeSameCrop.gridx = 2;
		gbc_labelReasonChangeSameCrop.gridy = 3;
		panelAgri.add(labelReasonChangeSameCrop, gbc_labelReasonChangeSameCrop);
		
		comboBoxReasonChangeSameCrop = new JComboBox<>();
		comboBoxReasonChangeSameCrop.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "More cheap", "More resistant to pest", "Less water", "More profitable", "Availability", "Others"}));
		GridBagConstraints gbc_comboBoxReasonChangeSameCrop = new GridBagConstraints();
		gbc_comboBoxReasonChangeSameCrop.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxReasonChangeSameCrop.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxReasonChangeSameCrop.gridx = 3;
		gbc_comboBoxReasonChangeSameCrop.gridy = 3;
		panelAgri.add(comboBoxReasonChangeSameCrop, gbc_comboBoxReasonChangeSameCrop);
		
		labelLowHarvest = new JLabel("Reason for Low Harvest");
		GridBagConstraints gbc_labelLowHarvest = new GridBagConstraints();
		gbc_labelLowHarvest.anchor = GridBagConstraints.EAST;
		gbc_labelLowHarvest.insets = new Insets(0, 0, 5, 5);
		gbc_labelLowHarvest.gridx = 0;
		gbc_labelLowHarvest.gridy = 4;
		panelAgri.add(labelLowHarvest, gbc_labelLowHarvest);
		
		comboBoxLowHarvest = new JComboBox<>();
		comboBoxLowHarvest.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Price increase on inputs", "Drought", "Typhoon", "Flood", "Pests", "Decrease in water supply", "Change in occupation", "Others"}));
		GridBagConstraints gbc_comboBoxLowHarvest = new GridBagConstraints();
		gbc_comboBoxLowHarvest.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxLowHarvest.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxLowHarvest.gridx = 1;
		gbc_comboBoxLowHarvest.gridy = 4;
		panelAgri.add(comboBoxLowHarvest, gbc_comboBoxLowHarvest);
		
		labelWaterSupply = new JLabel("Reason for Low Water Supply");
		GridBagConstraints gbc_labelWaterSupply = new GridBagConstraints();
		gbc_labelWaterSupply.anchor = GridBagConstraints.EAST;
		gbc_labelWaterSupply.insets = new Insets(0, 0, 5, 5);
		gbc_labelWaterSupply.gridx = 2;
		gbc_labelWaterSupply.gridy = 4;
		panelAgri.add(labelWaterSupply, gbc_labelWaterSupply);
		
		comboBoxWaterSupply = new JComboBox<>();
		comboBoxWaterSupply.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Drought", "Broken pump", "Dam water level", "Tanker Truck", "Increase of Customers"}));
		GridBagConstraints gbc_comboBoxWaterSupply = new GridBagConstraints();
		gbc_comboBoxWaterSupply.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxWaterSupply.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxWaterSupply.gridx = 3;
		gbc_comboBoxWaterSupply.gridy = 4;
		panelAgri.add(comboBoxWaterSupply, gbc_comboBoxWaterSupply);
		
		labelDrought = new JLabel("Experienced Drought");
		GridBagConstraints gbc_labelDrought = new GridBagConstraints();
		gbc_labelDrought.anchor = GridBagConstraints.EAST;
		gbc_labelDrought.insets = new Insets(0, 0, 5, 5);
		gbc_labelDrought.gridx = 0;
		gbc_labelDrought.gridy = 5;
		panelAgri.add(labelDrought, gbc_labelDrought);
		
		comboBoxDrought = new JComboBox<>();
		comboBoxDrought.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Yes", "No"}));
		GridBagConstraints gbc_comboBoxDrought = new GridBagConstraints();
		gbc_comboBoxDrought.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxDrought.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxDrought.gridx = 1;
		gbc_comboBoxDrought.gridy = 5;
		panelAgri.add(comboBoxDrought, gbc_comboBoxDrought);
		
		labelDuration = new JLabel("Duration");
		GridBagConstraints gbc_labelDuration = new GridBagConstraints();
		gbc_labelDuration.anchor = GridBagConstraints.EAST;
		gbc_labelDuration.insets = new Insets(0, 0, 5, 5);
		gbc_labelDuration.gridx = 2;
		gbc_labelDuration.gridy = 5;
		panelAgri.add(labelDuration, gbc_labelDuration);
		
		comboBoxDuration = new JComboBox<>();
		comboBoxDuration.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "< 1 Month", "1 Month < 2 Months", "2 Months < 3 Months", "3 Months < 4 Months", "4 Months < 5 Months", "5 Months or more"}));
		GridBagConstraints gbc_comboBoxDuration = new GridBagConstraints();
		gbc_comboBoxDuration.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxDuration.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxDuration.gridx = 3;
		gbc_comboBoxDuration.gridy = 5;
		panelAgri.add(comboBoxDuration, gbc_comboBoxDuration);
		
		labelFlood = new JLabel("Experienced Flood");
		GridBagConstraints gbc_labelFlood = new GridBagConstraints();
		gbc_labelFlood.anchor = GridBagConstraints.EAST;
		gbc_labelFlood.insets = new Insets(0, 0, 0, 5);
		gbc_labelFlood.gridx = 0;
		gbc_labelFlood.gridy = 6;
		panelAgri.add(labelFlood, gbc_labelFlood);
		
		comboBoxFlood = new JComboBox<>();
		comboBoxFlood.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Yes", "No"}));
		GridBagConstraints gbc_comboBoxFlood = new GridBagConstraints();
		gbc_comboBoxFlood.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxFlood.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxFlood.gridx = 1;
		gbc_comboBoxFlood.gridy = 6;
		panelAgri.add(comboBoxFlood, gbc_comboBoxFlood);
		
		labelCropType = new JLabel("Crop Type");
		GridBagConstraints gbc_labelCropType = new GridBagConstraints();
		gbc_labelCropType.anchor = GridBagConstraints.EAST;
		gbc_labelCropType.insets = new Insets(0, 0, 0, 5);
		gbc_labelCropType.gridx = 2;
		gbc_labelCropType.gridy = 6;
		panelAgri.add(labelCropType, gbc_labelCropType);
		
		comboBoxCropType = new JComboBox<>();
		comboBoxCropType.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Sugar Cane", "Palay", "Corn", "Coffee", "Others"}));
		GridBagConstraints gbc_comboBoxCropType = new GridBagConstraints();
		gbc_comboBoxCropType.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxCropType.gridx = 3;
		gbc_comboBoxCropType.gridy = 6;
		panelAgri.add(comboBoxCropType, gbc_comboBoxCropType);
		
		panelResources = new JPanel();
		panelResources.setBorder(new TitledBorder(null, "Resources", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelResources = new GridBagConstraints();
		gbc_panelResources.gridwidth = 2;
		gbc_panelResources.insets = new Insets(0, 0, 5, 0);
		gbc_panelResources.fill = GridBagConstraints.BOTH;
		gbc_panelResources.gridx = 0;
		gbc_panelResources.gridy = 3;
		add(panelResources, gbc_panelResources);
		GridBagLayout gbl_panelResources = new GridBagLayout();
		gbl_panelResources.columnWidths = new int[]{70, 70, 35, 35, 35, 70, 70, 35, 35, 35, 0};
		gbl_panelResources.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelResources.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelResources.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelResources.setLayout(gbl_panelResources);
		
		labelBeastOfBurden = new JLabel("Beast of Burden");
		GridBagConstraints gbc_labelBeastOfBurden = new GridBagConstraints();
		gbc_labelBeastOfBurden.insets = new Insets(0, 0, 5, 5);
		gbc_labelBeastOfBurden.anchor = GridBagConstraints.EAST;
		gbc_labelBeastOfBurden.gridx = 0;
		gbc_labelBeastOfBurden.gridy = 0;
		panelResources.add(labelBeastOfBurden, gbc_labelBeastOfBurden);
		
		comboBoxBeastOfBurden = new JComboBox<>();
		comboBoxBeastOfBurden.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxBeastOfBurden = new GridBagConstraints();
		gbc_comboBoxBeastOfBurden.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxBeastOfBurden.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxBeastOfBurden.gridx = 1;
		gbc_comboBoxBeastOfBurden.gridy = 0;
		panelResources.add(comboBoxBeastOfBurden, gbc_comboBoxBeastOfBurden);
		
		labelCountBeastOfBurden = new JLabel("Count");
		GridBagConstraints gbc_labelCountBeastOfBurden = new GridBagConstraints();
		gbc_labelCountBeastOfBurden.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountBeastOfBurden.anchor = GridBagConstraints.EAST;
		gbc_labelCountBeastOfBurden.gridx = 2;
		gbc_labelCountBeastOfBurden.gridy = 0;
		panelResources.add(labelCountBeastOfBurden, gbc_labelCountBeastOfBurden);
		
		spinnerCountBeastOfBurdenLower = new JSpinner();
		spinnerCountBeastOfBurdenLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountBeastOfBurdenLower = new GridBagConstraints();
		gbc_spinnerCountBeastOfBurdenLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountBeastOfBurdenLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountBeastOfBurdenLower.gridx = 3;
		gbc_spinnerCountBeastOfBurdenLower.gridy = 0;
		panelResources.add(spinnerCountBeastOfBurdenLower, gbc_spinnerCountBeastOfBurdenLower);
		
		spinnerCountBeastOfBurdenUpper = new JSpinner();
		spinnerCountBeastOfBurdenUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountBeastOfBurdenUpper = new GridBagConstraints();
		gbc_spinnerCountBeastOfBurdenUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountBeastOfBurdenUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountBeastOfBurdenUpper.gridx = 4;
		gbc_spinnerCountBeastOfBurdenUpper.gridy = 0;
		panelResources.add(spinnerCountBeastOfBurdenUpper, gbc_spinnerCountBeastOfBurdenUpper);
		
		labelPlow = new JLabel("Plow");
		GridBagConstraints gbc_labelPlow = new GridBagConstraints();
		gbc_labelPlow.insets = new Insets(0, 0, 5, 5);
		gbc_labelPlow.anchor = GridBagConstraints.EAST;
		gbc_labelPlow.gridx = 5;
		gbc_labelPlow.gridy = 0;
		panelResources.add(labelPlow, gbc_labelPlow);
		
		comboBoxPlow = new JComboBox<>();
		comboBoxPlow.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxPlow = new GridBagConstraints();
		gbc_comboBoxPlow.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxPlow.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxPlow.gridx = 6;
		gbc_comboBoxPlow.gridy = 0;
		panelResources.add(comboBoxPlow, gbc_comboBoxPlow);
		
		labelCountPlow = new JLabel("Count");
		GridBagConstraints gbc_labelCountPlow = new GridBagConstraints();
		gbc_labelCountPlow.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountPlow.anchor = GridBagConstraints.EAST;
		gbc_labelCountPlow.gridx = 7;
		gbc_labelCountPlow.gridy = 0;
		panelResources.add(labelCountPlow, gbc_labelCountPlow);
		
		spinnerCountPlowLower = new JSpinner();
		spinnerCountPlowLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountPlowLower = new GridBagConstraints();
		gbc_spinnerCountPlowLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountPlowLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountPlowLower.gridx = 8;
		gbc_spinnerCountPlowLower.gridy = 0;
		panelResources.add(spinnerCountPlowLower, gbc_spinnerCountPlowLower);
		
		spinnerCountPlowUpper = new JSpinner();
		spinnerCountPlowUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountPlowUpper = new GridBagConstraints();
		gbc_spinnerCountPlowUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountPlowUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerCountPlowUpper.gridx = 9;
		gbc_spinnerCountPlowUpper.gridy = 0;
		panelResources.add(spinnerCountPlowUpper, gbc_spinnerCountPlowUpper);
		
		labelHarrow = new JLabel("Harrow");
		GridBagConstraints gbc_labelHarrow = new GridBagConstraints();
		gbc_labelHarrow.anchor = GridBagConstraints.EAST;
		gbc_labelHarrow.insets = new Insets(0, 0, 5, 5);
		gbc_labelHarrow.gridx = 0;
		gbc_labelHarrow.gridy = 1;
		panelResources.add(labelHarrow, gbc_labelHarrow);
		
		comboBoxHarrow = new JComboBox<>();
		comboBoxHarrow.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxHarrow = new GridBagConstraints();
		gbc_comboBoxHarrow.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxHarrow.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxHarrow.gridx = 1;
		gbc_comboBoxHarrow.gridy = 1;
		panelResources.add(comboBoxHarrow, gbc_comboBoxHarrow);
		
		labelCountHarrow = new JLabel("Count");
		GridBagConstraints gbc_labelCountHarrow = new GridBagConstraints();
		gbc_labelCountHarrow.anchor = GridBagConstraints.EAST;
		gbc_labelCountHarrow.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountHarrow.gridx = 2;
		gbc_labelCountHarrow.gridy = 1;
		panelResources.add(labelCountHarrow, gbc_labelCountHarrow);
		
		spinnerCountHarrowLower = new JSpinner();
		spinnerCountHarrowLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountHarrowLower = new GridBagConstraints();
		gbc_spinnerCountHarrowLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountHarrowLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountHarrowLower.gridx = 3;
		gbc_spinnerCountHarrowLower.gridy = 1;
		panelResources.add(spinnerCountHarrowLower, gbc_spinnerCountHarrowLower);
		
		spinnerCountHarrowUpper = new JSpinner();
		spinnerCountHarrowUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountHarrowUpper = new GridBagConstraints();
		gbc_spinnerCountHarrowUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountHarrowUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountHarrowUpper.gridx = 4;
		gbc_spinnerCountHarrowUpper.gridy = 1;
		panelResources.add(spinnerCountHarrowUpper, gbc_spinnerCountHarrowUpper);
		
		labelMower = new JLabel("Mower");
		GridBagConstraints gbc_labelMower = new GridBagConstraints();
		gbc_labelMower.anchor = GridBagConstraints.EAST;
		gbc_labelMower.insets = new Insets(0, 0, 5, 5);
		gbc_labelMower.gridx = 5;
		gbc_labelMower.gridy = 1;
		panelResources.add(labelMower, gbc_labelMower);
		
		comboBoxMower = new JComboBox<>();
		comboBoxMower.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxMower = new GridBagConstraints();
		gbc_comboBoxMower.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxMower.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMower.gridx = 6;
		gbc_comboBoxMower.gridy = 1;
		panelResources.add(comboBoxMower, gbc_comboBoxMower);
		
		labelCountMower = new JLabel("Count");
		GridBagConstraints gbc_labelCountMower = new GridBagConstraints();
		gbc_labelCountMower.anchor = GridBagConstraints.EAST;
		gbc_labelCountMower.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountMower.gridx = 7;
		gbc_labelCountMower.gridy = 1;
		panelResources.add(labelCountMower, gbc_labelCountMower);
		
		spinnerCountMowerLower = new JSpinner();
		spinnerCountMowerLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountMowerLower = new GridBagConstraints();
		gbc_spinnerCountMowerLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountMowerLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountMowerLower.gridx = 8;
		gbc_spinnerCountMowerLower.gridy = 1;
		panelResources.add(spinnerCountMowerLower, gbc_spinnerCountMowerLower);
		
		spinnerCountMowerUpper = new JSpinner();
		spinnerCountMowerUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountMowerUpper = new GridBagConstraints();
		gbc_spinnerCountMowerUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountMowerUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerCountMowerUpper.gridx = 9;
		gbc_spinnerCountMowerUpper.gridy = 1;
		panelResources.add(spinnerCountMowerUpper, gbc_spinnerCountMowerUpper);
		
		labelThresher = new JLabel("Thresher");
		GridBagConstraints gbc_labelThresher = new GridBagConstraints();
		gbc_labelThresher.anchor = GridBagConstraints.EAST;
		gbc_labelThresher.insets = new Insets(0, 0, 5, 5);
		gbc_labelThresher.gridx = 0;
		gbc_labelThresher.gridy = 2;
		panelResources.add(labelThresher, gbc_labelThresher);
		
		comboBoxThresher = new JComboBox<>();
		comboBoxThresher.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxThresher = new GridBagConstraints();
		gbc_comboBoxThresher.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxThresher.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxThresher.gridx = 1;
		gbc_comboBoxThresher.gridy = 2;
		panelResources.add(comboBoxThresher, gbc_comboBoxThresher);
		
		labelCountThresher = new JLabel("Count");
		GridBagConstraints gbc_labelCountThresher = new GridBagConstraints();
		gbc_labelCountThresher.anchor = GridBagConstraints.EAST;
		gbc_labelCountThresher.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountThresher.gridx = 2;
		gbc_labelCountThresher.gridy = 2;
		panelResources.add(labelCountThresher, gbc_labelCountThresher);
		
		spinnerCountThresherLower = new JSpinner();
		spinnerCountThresherLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountThresherLower = new GridBagConstraints();
		gbc_spinnerCountThresherLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountThresherLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountThresherLower.gridx = 3;
		gbc_spinnerCountThresherLower.gridy = 2;
		panelResources.add(spinnerCountThresherLower, gbc_spinnerCountThresherLower);
		
		spinnerCountThresherUpper = new JSpinner();
		spinnerCountThresherUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountThresherUpper = new GridBagConstraints();
		gbc_spinnerCountThresherUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountThresherUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountThresherUpper.gridx = 4;
		gbc_spinnerCountThresherUpper.gridy = 2;
		panelResources.add(spinnerCountThresherUpper, gbc_spinnerCountThresherUpper);
		
		labelSprayer = new JLabel("Sprayer");
		GridBagConstraints gbc_labelSprayer = new GridBagConstraints();
		gbc_labelSprayer.anchor = GridBagConstraints.EAST;
		gbc_labelSprayer.insets = new Insets(0, 0, 5, 5);
		gbc_labelSprayer.gridx = 5;
		gbc_labelSprayer.gridy = 2;
		panelResources.add(labelSprayer, gbc_labelSprayer);
		
		comboBoxSprayer = new JComboBox<>();
		comboBoxSprayer.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxSprayer = new GridBagConstraints();
		gbc_comboBoxSprayer.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxSprayer.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxSprayer.gridx = 6;
		gbc_comboBoxSprayer.gridy = 2;
		panelResources.add(comboBoxSprayer, gbc_comboBoxSprayer);
		
		labelCountSprayer = new JLabel("Count");
		GridBagConstraints gbc_labelCountSprayer = new GridBagConstraints();
		gbc_labelCountSprayer.anchor = GridBagConstraints.EAST;
		gbc_labelCountSprayer.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountSprayer.gridx = 7;
		gbc_labelCountSprayer.gridy = 2;
		panelResources.add(labelCountSprayer, gbc_labelCountSprayer);
		
		spinnerCountSprayerLower = new JSpinner();
		spinnerCountSprayerLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountSprayerLower = new GridBagConstraints();
		gbc_spinnerCountSprayerLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountSprayerLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountSprayerLower.gridx = 8;
		gbc_spinnerCountSprayerLower.gridy = 2;
		panelResources.add(spinnerCountSprayerLower, gbc_spinnerCountSprayerLower);
		
		spinnerCountSprayerUpper = new JSpinner();
		spinnerCountSprayerUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountSprayerUpper = new GridBagConstraints();
		gbc_spinnerCountSprayerUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountSprayerUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerCountSprayerUpper.gridx = 9;
		gbc_spinnerCountSprayerUpper.gridy = 2;
		panelResources.add(spinnerCountSprayerUpper, gbc_spinnerCountSprayerUpper);
		
		labelFarmTractor = new JLabel("Farm Tractor");
		GridBagConstraints gbc_labelFarmTractor = new GridBagConstraints();
		gbc_labelFarmTractor.anchor = GridBagConstraints.EAST;
		gbc_labelFarmTractor.insets = new Insets(0, 0, 5, 5);
		gbc_labelFarmTractor.gridx = 0;
		gbc_labelFarmTractor.gridy = 3;
		panelResources.add(labelFarmTractor, gbc_labelFarmTractor);
		
		comboBoxFarmTractor = new JComboBox<>();
		comboBoxFarmTractor.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxFarmTractor = new GridBagConstraints();
		gbc_comboBoxFarmTractor.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxFarmTractor.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxFarmTractor.gridx = 1;
		gbc_comboBoxFarmTractor.gridy = 3;
		panelResources.add(comboBoxFarmTractor, gbc_comboBoxFarmTractor);
		
		labelCountFarmTractor = new JLabel("Count");
		GridBagConstraints gbc_labelCountFarmTractor = new GridBagConstraints();
		gbc_labelCountFarmTractor.anchor = GridBagConstraints.EAST;
		gbc_labelCountFarmTractor.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountFarmTractor.gridx = 2;
		gbc_labelCountFarmTractor.gridy = 3;
		panelResources.add(labelCountFarmTractor, gbc_labelCountFarmTractor);
		
		spinnerCountFarmTractorLower = new JSpinner();
		spinnerCountFarmTractorLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountFarmTractorLower = new GridBagConstraints();
		gbc_spinnerCountFarmTractorLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountFarmTractorLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountFarmTractorLower.gridx = 3;
		gbc_spinnerCountFarmTractorLower.gridy = 3;
		panelResources.add(spinnerCountFarmTractorLower, gbc_spinnerCountFarmTractorLower);
		
		spinnerCountFarmTractorUpper = new JSpinner();
		spinnerCountFarmTractorUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountFarmTractorUpper = new GridBagConstraints();
		gbc_spinnerCountFarmTractorUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountFarmTractorUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountFarmTractorUpper.gridx = 4;
		gbc_spinnerCountFarmTractorUpper.gridy = 3;
		panelResources.add(spinnerCountFarmTractorUpper, gbc_spinnerCountFarmTractorUpper);
		
		labelHandTractor = new JLabel("Hand Tractor");
		GridBagConstraints gbc_labelHandTractor = new GridBagConstraints();
		gbc_labelHandTractor.anchor = GridBagConstraints.EAST;
		gbc_labelHandTractor.insets = new Insets(0, 0, 5, 5);
		gbc_labelHandTractor.gridx = 5;
		gbc_labelHandTractor.gridy = 3;
		panelResources.add(labelHandTractor, gbc_labelHandTractor);
		
		comboBoxHandTractor = new JComboBox<>();
		comboBoxHandTractor.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxHandTractor = new GridBagConstraints();
		gbc_comboBoxHandTractor.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxHandTractor.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxHandTractor.gridx = 6;
		gbc_comboBoxHandTractor.gridy = 3;
		panelResources.add(comboBoxHandTractor, gbc_comboBoxHandTractor);
		
		labelCountHandTractor = new JLabel("Count");
		GridBagConstraints gbc_labelCountHandTractor = new GridBagConstraints();
		gbc_labelCountHandTractor.anchor = GridBagConstraints.EAST;
		gbc_labelCountHandTractor.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountHandTractor.gridx = 7;
		gbc_labelCountHandTractor.gridy = 3;
		panelResources.add(labelCountHandTractor, gbc_labelCountHandTractor);
		
		spinnerCountHandTractorLower = new JSpinner();
		spinnerCountHandTractorLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountHandTractorLower = new GridBagConstraints();
		gbc_spinnerCountHandTractorLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountHandTractorLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountHandTractorLower.gridx = 8;
		gbc_spinnerCountHandTractorLower.gridy = 3;
		panelResources.add(spinnerCountHandTractorLower, gbc_spinnerCountHandTractorLower);
		
		spinnerCountHandTractorUpper = new JSpinner();
		spinnerCountHandTractorUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountHandTractorUpper = new GridBagConstraints();
		gbc_spinnerCountHandTractorUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountHandTractorUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerCountHandTractorUpper.gridx = 9;
		gbc_spinnerCountHandTractorUpper.gridy = 3;
		panelResources.add(spinnerCountHandTractorUpper, gbc_spinnerCountHandTractorUpper);
		
		labelMudboat = new JLabel("Mudboat");
		GridBagConstraints gbc_labelMudboat = new GridBagConstraints();
		gbc_labelMudboat.anchor = GridBagConstraints.EAST;
		gbc_labelMudboat.insets = new Insets(0, 0, 5, 5);
		gbc_labelMudboat.gridx = 0;
		gbc_labelMudboat.gridy = 4;
		panelResources.add(labelMudboat, gbc_labelMudboat);
		
		comboBoxMudboat = new JComboBox<>();
		comboBoxMudboat.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxMudboat = new GridBagConstraints();
		gbc_comboBoxMudboat.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxMudboat.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMudboat.gridx = 1;
		gbc_comboBoxMudboat.gridy = 4;
		panelResources.add(comboBoxMudboat, gbc_comboBoxMudboat);
		
		labelCountMudboat = new JLabel("Count");
		GridBagConstraints gbc_labelCountMudboat = new GridBagConstraints();
		gbc_labelCountMudboat.anchor = GridBagConstraints.EAST;
		gbc_labelCountMudboat.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountMudboat.gridx = 2;
		gbc_labelCountMudboat.gridy = 4;
		panelResources.add(labelCountMudboat, gbc_labelCountMudboat);
		
		spinnerCountMudboatLower = new JSpinner();
		spinnerCountMudboatLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountMudboatLower = new GridBagConstraints();
		gbc_spinnerCountMudboatLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountMudboatLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountMudboatLower.gridx = 3;
		gbc_spinnerCountMudboatLower.gridy = 4;
		panelResources.add(spinnerCountMudboatLower, gbc_spinnerCountMudboatLower);
		
		spinnerCountMudboatUpper = new JSpinner();
		spinnerCountMudboatUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountMudboatUpper = new GridBagConstraints();
		gbc_spinnerCountMudboatUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountMudboatUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountMudboatUpper.gridx = 4;
		gbc_spinnerCountMudboatUpper.gridy = 4;
		panelResources.add(spinnerCountMudboatUpper, gbc_spinnerCountMudboatUpper);
		
		labelPlanter = new JLabel("Planter");
		GridBagConstraints gbc_labelPlanter = new GridBagConstraints();
		gbc_labelPlanter.anchor = GridBagConstraints.EAST;
		gbc_labelPlanter.insets = new Insets(0, 0, 5, 5);
		gbc_labelPlanter.gridx = 5;
		gbc_labelPlanter.gridy = 4;
		panelResources.add(labelPlanter, gbc_labelPlanter);
		
		comboBoxPlanter = new JComboBox<>();
		comboBoxPlanter.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxPlanter = new GridBagConstraints();
		gbc_comboBoxPlanter.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxPlanter.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxPlanter.gridx = 6;
		gbc_comboBoxPlanter.gridy = 4;
		panelResources.add(comboBoxPlanter, gbc_comboBoxPlanter);
		
		labelCountPlanter = new JLabel("Count");
		GridBagConstraints gbc_labelCountPlanter = new GridBagConstraints();
		gbc_labelCountPlanter.anchor = GridBagConstraints.EAST;
		gbc_labelCountPlanter.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountPlanter.gridx = 7;
		gbc_labelCountPlanter.gridy = 4;
		panelResources.add(labelCountPlanter, gbc_labelCountPlanter);
		
		spinnerCountPlanterLower = new JSpinner();
		spinnerCountPlanterLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountPlanterLower = new GridBagConstraints();
		gbc_spinnerCountPlanterLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountPlanterLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountPlanterLower.gridx = 8;
		gbc_spinnerCountPlanterLower.gridy = 4;
		panelResources.add(spinnerCountPlanterLower, gbc_spinnerCountPlanterLower);
		
		spinnerCountPlanterUpper = new JSpinner();
		spinnerCountPlanterUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountPlanterUpper = new GridBagConstraints();
		gbc_spinnerCountPlanterUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountPlanterUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerCountPlanterUpper.gridx = 9;
		gbc_spinnerCountPlanterUpper.gridy = 4;
		panelResources.add(spinnerCountPlanterUpper, gbc_spinnerCountPlanterUpper);
		
		labelMechanicalDryer = new JLabel("Mechanical Dryer");
		GridBagConstraints gbc_labelMechanicalDryer = new GridBagConstraints();
		gbc_labelMechanicalDryer.anchor = GridBagConstraints.EAST;
		gbc_labelMechanicalDryer.insets = new Insets(0, 0, 5, 5);
		gbc_labelMechanicalDryer.gridx = 0;
		gbc_labelMechanicalDryer.gridy = 5;
		panelResources.add(labelMechanicalDryer, gbc_labelMechanicalDryer);
		
		comboBoxMechanicalDryer = new JComboBox<>();
		comboBoxMechanicalDryer.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxMechanicalDryer = new GridBagConstraints();
		gbc_comboBoxMechanicalDryer.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxMechanicalDryer.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMechanicalDryer.gridx = 1;
		gbc_comboBoxMechanicalDryer.gridy = 5;
		panelResources.add(comboBoxMechanicalDryer, gbc_comboBoxMechanicalDryer);
		
		labelCountMechanicalDryer = new JLabel("Count");
		GridBagConstraints gbc_labelCountMechanicalDryer = new GridBagConstraints();
		gbc_labelCountMechanicalDryer.anchor = GridBagConstraints.EAST;
		gbc_labelCountMechanicalDryer.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountMechanicalDryer.gridx = 2;
		gbc_labelCountMechanicalDryer.gridy = 5;
		panelResources.add(labelCountMechanicalDryer, gbc_labelCountMechanicalDryer);
		
		spinnerCountMechanicalDryerLower = new JSpinner();
		spinnerCountMechanicalDryerLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountMechanicalDryerLower = new GridBagConstraints();
		gbc_spinnerCountMechanicalDryerLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountMechanicalDryerLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountMechanicalDryerLower.gridx = 3;
		gbc_spinnerCountMechanicalDryerLower.gridy = 5;
		panelResources.add(spinnerCountMechanicalDryerLower, gbc_spinnerCountMechanicalDryerLower);
		
		spinnerCountMechanicalDryerUpper = new JSpinner();
		spinnerCountMechanicalDryerUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountMechanicalDryerUpper = new GridBagConstraints();
		gbc_spinnerCountMechanicalDryerUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountMechanicalDryerUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountMechanicalDryerUpper.gridx = 4;
		gbc_spinnerCountMechanicalDryerUpper.gridy = 5;
		panelResources.add(spinnerCountMechanicalDryerUpper, gbc_spinnerCountMechanicalDryerUpper);
		
		labelDryingPavement = new JLabel("Drying Pavement");
		GridBagConstraints gbc_labelDryingPavement = new GridBagConstraints();
		gbc_labelDryingPavement.anchor = GridBagConstraints.EAST;
		gbc_labelDryingPavement.insets = new Insets(0, 0, 5, 5);
		gbc_labelDryingPavement.gridx = 5;
		gbc_labelDryingPavement.gridy = 5;
		panelResources.add(labelDryingPavement, gbc_labelDryingPavement);
		
		comboBoxDryingPavement = new JComboBox<>();
		comboBoxDryingPavement.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxDryingPavement = new GridBagConstraints();
		gbc_comboBoxDryingPavement.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxDryingPavement.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxDryingPavement.gridx = 6;
		gbc_comboBoxDryingPavement.gridy = 5;
		panelResources.add(comboBoxDryingPavement, gbc_comboBoxDryingPavement);
		
		labelCountDryingPavement = new JLabel("Count");
		GridBagConstraints gbc_labelCountDryingPavement = new GridBagConstraints();
		gbc_labelCountDryingPavement.anchor = GridBagConstraints.EAST;
		gbc_labelCountDryingPavement.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountDryingPavement.gridx = 7;
		gbc_labelCountDryingPavement.gridy = 5;
		panelResources.add(labelCountDryingPavement, gbc_labelCountDryingPavement);
		
		spinnerCountDryingPavementLower = new JSpinner();
		spinnerCountDryingPavementLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountDryingPavementLower = new GridBagConstraints();
		gbc_spinnerCountDryingPavementLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountDryingPavementLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountDryingPavementLower.gridx = 8;
		gbc_spinnerCountDryingPavementLower.gridy = 5;
		panelResources.add(spinnerCountDryingPavementLower, gbc_spinnerCountDryingPavementLower);
		
		spinnerCountDryingPavementUpper = new JSpinner();
		spinnerCountDryingPavementUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountDryingPavementUpper = new GridBagConstraints();
		gbc_spinnerCountDryingPavementUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountDryingPavementUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerCountDryingPavementUpper.gridx = 9;
		gbc_spinnerCountDryingPavementUpper.gridy = 5;
		panelResources.add(spinnerCountDryingPavementUpper, gbc_spinnerCountDryingPavementUpper);
		
		labelFeedMill = new JLabel("Feed Mill");
		GridBagConstraints gbc_labelFeedMill = new GridBagConstraints();
		gbc_labelFeedMill.anchor = GridBagConstraints.EAST;
		gbc_labelFeedMill.insets = new Insets(0, 0, 5, 5);
		gbc_labelFeedMill.gridx = 0;
		gbc_labelFeedMill.gridy = 6;
		panelResources.add(labelFeedMill, gbc_labelFeedMill);
		
		comboBoxFeedMill = new JComboBox<>();
		comboBoxFeedMill.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxFeedMill = new GridBagConstraints();
		gbc_comboBoxFeedMill.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxFeedMill.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxFeedMill.gridx = 1;
		gbc_comboBoxFeedMill.gridy = 6;
		panelResources.add(comboBoxFeedMill, gbc_comboBoxFeedMill);
		
		labelCountFeedMill = new JLabel("Count");
		GridBagConstraints gbc_labelCountFeedMill = new GridBagConstraints();
		gbc_labelCountFeedMill.anchor = GridBagConstraints.EAST;
		gbc_labelCountFeedMill.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountFeedMill.gridx = 2;
		gbc_labelCountFeedMill.gridy = 6;
		panelResources.add(labelCountFeedMill, gbc_labelCountFeedMill);
		
		spinnerCountFeedMillLower = new JSpinner();
		spinnerCountFeedMillLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountFeedMillLower = new GridBagConstraints();
		gbc_spinnerCountFeedMillLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountFeedMillLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountFeedMillLower.gridx = 3;
		gbc_spinnerCountFeedMillLower.gridy = 6;
		panelResources.add(spinnerCountFeedMillLower, gbc_spinnerCountFeedMillLower);
		
		spinnerCountFeedMillUpper = new JSpinner();
		spinnerCountFeedMillUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountFeedMillUpper = new GridBagConstraints();
		gbc_spinnerCountFeedMillUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountFeedMillUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountFeedMillUpper.gridx = 4;
		gbc_spinnerCountFeedMillUpper.gridy = 6;
		panelResources.add(spinnerCountFeedMillUpper, gbc_spinnerCountFeedMillUpper);
		
		labelHarvester = new JLabel("Harvester");
		GridBagConstraints gbc_labelHarvester = new GridBagConstraints();
		gbc_labelHarvester.anchor = GridBagConstraints.EAST;
		gbc_labelHarvester.insets = new Insets(0, 0, 5, 5);
		gbc_labelHarvester.gridx = 5;
		gbc_labelHarvester.gridy = 6;
		panelResources.add(labelHarvester, gbc_labelHarvester);
		
		comboBoxHarvester = new JComboBox<>();
		comboBoxHarvester.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxHarvester = new GridBagConstraints();
		gbc_comboBoxHarvester.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxHarvester.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxHarvester.gridx = 6;
		gbc_comboBoxHarvester.gridy = 6;
		panelResources.add(comboBoxHarvester, gbc_comboBoxHarvester);
		
		labelCountHarvester = new JLabel("Count");
		GridBagConstraints gbc_labelCountHarvester = new GridBagConstraints();
		gbc_labelCountHarvester.anchor = GridBagConstraints.EAST;
		gbc_labelCountHarvester.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountHarvester.gridx = 7;
		gbc_labelCountHarvester.gridy = 6;
		panelResources.add(labelCountHarvester, gbc_labelCountHarvester);
		
		spinnerCountHarvesterLower = new JSpinner();
		spinnerCountHarvesterLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountHarvesterLower = new GridBagConstraints();
		gbc_spinnerCountHarvesterLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountHarvesterLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountHarvesterLower.gridx = 8;
		gbc_spinnerCountHarvesterLower.gridy = 6;
		panelResources.add(spinnerCountHarvesterLower, gbc_spinnerCountHarvesterLower);
		
		spinnerCountHarvesterUpper = new JSpinner();
		spinnerCountHarvesterUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountHarvesterUpper = new GridBagConstraints();
		gbc_spinnerCountHarvesterUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountHarvesterUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerCountHarvesterUpper.gridx = 9;
		gbc_spinnerCountHarvesterUpper.gridy = 6;
		panelResources.add(spinnerCountHarvesterUpper, gbc_spinnerCountHarvesterUpper);
		
		labelGranary = new JLabel("Granary");
		GridBagConstraints gbc_labelGranary = new GridBagConstraints();
		gbc_labelGranary.anchor = GridBagConstraints.EAST;
		gbc_labelGranary.insets = new Insets(0, 0, 5, 5);
		gbc_labelGranary.gridx = 0;
		gbc_labelGranary.gridy = 7;
		panelResources.add(labelGranary, gbc_labelGranary);
		
		comboBoxGranary = new JComboBox<>();
		comboBoxGranary.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxGranary = new GridBagConstraints();
		gbc_comboBoxGranary.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxGranary.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxGranary.gridx = 1;
		gbc_comboBoxGranary.gridy = 7;
		panelResources.add(comboBoxGranary, gbc_comboBoxGranary);
		
		labelCountGranary = new JLabel("Count");
		GridBagConstraints gbc_labelCountGranary = new GridBagConstraints();
		gbc_labelCountGranary.anchor = GridBagConstraints.EAST;
		gbc_labelCountGranary.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountGranary.gridx = 2;
		gbc_labelCountGranary.gridy = 7;
		panelResources.add(labelCountGranary, gbc_labelCountGranary);
		
		spinnerCountGranaryLower = new JSpinner();
		spinnerCountGranaryLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountGranaryLower = new GridBagConstraints();
		gbc_spinnerCountGranaryLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountGranaryLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountGranaryLower.gridx = 3;
		gbc_spinnerCountGranaryLower.gridy = 7;
		panelResources.add(spinnerCountGranaryLower, gbc_spinnerCountGranaryLower);
		
		spinnerCountGranaryUpper = new JSpinner();
		spinnerCountGranaryUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountGranaryUpper = new GridBagConstraints();
		gbc_spinnerCountGranaryUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountGranaryUpper.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountGranaryUpper.gridx = 4;
		gbc_spinnerCountGranaryUpper.gridy = 7;
		panelResources.add(spinnerCountGranaryUpper, gbc_spinnerCountGranaryUpper);
		
		labelFarmshed = new JLabel("Farmshed");
		GridBagConstraints gbc_labelFarmshed = new GridBagConstraints();
		gbc_labelFarmshed.anchor = GridBagConstraints.EAST;
		gbc_labelFarmshed.insets = new Insets(0, 0, 5, 5);
		gbc_labelFarmshed.gridx = 5;
		gbc_labelFarmshed.gridy = 7;
		panelResources.add(labelFarmshed, gbc_labelFarmshed);
		
		comboBoxFarmshed = new JComboBox<>();
		comboBoxFarmshed.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxFarmshed = new GridBagConstraints();
		gbc_comboBoxFarmshed.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxFarmshed.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxFarmshed.gridx = 6;
		gbc_comboBoxFarmshed.gridy = 7;
		panelResources.add(comboBoxFarmshed, gbc_comboBoxFarmshed);
		
		labelCountFarmshed = new JLabel("Count");
		GridBagConstraints gbc_labelCountFarmshed = new GridBagConstraints();
		gbc_labelCountFarmshed.anchor = GridBagConstraints.EAST;
		gbc_labelCountFarmshed.insets = new Insets(0, 0, 5, 5);
		gbc_labelCountFarmshed.gridx = 7;
		gbc_labelCountFarmshed.gridy = 7;
		panelResources.add(labelCountFarmshed, gbc_labelCountFarmshed);
		
		spinnerCountFarmshedLower = new JSpinner();
		spinnerCountFarmshedLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountFarmshedLower = new GridBagConstraints();
		gbc_spinnerCountFarmshedLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountFarmshedLower.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerCountFarmshedLower.gridx = 8;
		gbc_spinnerCountFarmshedLower.gridy = 7;
		panelResources.add(spinnerCountFarmshedLower, gbc_spinnerCountFarmshedLower);
		
		spinnerCountFarmshedUpper = new JSpinner();
		spinnerCountFarmshedUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountFarmshedUpper = new GridBagConstraints();
		gbc_spinnerCountFarmshedUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountFarmshedUpper.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerCountFarmshedUpper.gridx = 9;
		gbc_spinnerCountFarmshedUpper.gridy = 7;
		panelResources.add(spinnerCountFarmshedUpper, gbc_spinnerCountFarmshedUpper);
		
		labelIrrigationPump = new JLabel("Irrigation Pump");
		GridBagConstraints gbc_labelIrrigationPump = new GridBagConstraints();
		gbc_labelIrrigationPump.anchor = GridBagConstraints.EAST;
		gbc_labelIrrigationPump.insets = new Insets(0, 0, 0, 5);
		gbc_labelIrrigationPump.gridx = 0;
		gbc_labelIrrigationPump.gridy = 8;
		panelResources.add(labelIrrigationPump, gbc_labelIrrigationPump);
		
		comboBoxIrrigationPump = new JComboBox<>();
		comboBoxIrrigationPump.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxIrrigationPump = new GridBagConstraints();
		gbc_comboBoxIrrigationPump.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxIrrigationPump.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxIrrigationPump.gridx = 1;
		gbc_comboBoxIrrigationPump.gridy = 8;
		panelResources.add(comboBoxIrrigationPump, gbc_comboBoxIrrigationPump);
		
		labelCountIrrigationPump = new JLabel("Count");
		GridBagConstraints gbc_labelCountIrrigationPump = new GridBagConstraints();
		gbc_labelCountIrrigationPump.anchor = GridBagConstraints.EAST;
		gbc_labelCountIrrigationPump.insets = new Insets(0, 0, 0, 5);
		gbc_labelCountIrrigationPump.gridx = 2;
		gbc_labelCountIrrigationPump.gridy = 8;
		panelResources.add(labelCountIrrigationPump, gbc_labelCountIrrigationPump);
		
		spinnerCountIrrigationPumpLower = new JSpinner();
		spinnerCountIrrigationPumpLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountIrrigationPumpLower = new GridBagConstraints();
		gbc_spinnerCountIrrigationPumpLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountIrrigationPumpLower.insets = new Insets(0, 0, 0, 5);
		gbc_spinnerCountIrrigationPumpLower.gridx = 3;
		gbc_spinnerCountIrrigationPumpLower.gridy = 8;
		panelResources.add(spinnerCountIrrigationPumpLower, gbc_spinnerCountIrrigationPumpLower);
		
		spinnerCountIrrigationPumpUpper = new JSpinner();
		spinnerCountIrrigationPumpUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountIrrigationPumpUpper = new GridBagConstraints();
		gbc_spinnerCountIrrigationPumpUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountIrrigationPumpUpper.insets = new Insets(0, 0, 0, 5);
		gbc_spinnerCountIrrigationPumpUpper.gridx = 4;
		gbc_spinnerCountIrrigationPumpUpper.gridy = 8;
		panelResources.add(spinnerCountIrrigationPumpUpper, gbc_spinnerCountIrrigationPumpUpper);
		
		labelOthers = new JLabel("Others");
		GridBagConstraints gbc_labelOthers = new GridBagConstraints();
		gbc_labelOthers.anchor = GridBagConstraints.EAST;
		gbc_labelOthers.insets = new Insets(0, 0, 0, 5);
		gbc_labelOthers.gridx = 5;
		gbc_labelOthers.gridy = 8;
		panelResources.add(labelOthers, gbc_labelOthers);
		
		comboBoxOthers = new JComboBox<>();
		comboBoxOthers.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECT", "Owned", "Not Owned"}));
		GridBagConstraints gbc_comboBoxOthers = new GridBagConstraints();
		gbc_comboBoxOthers.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxOthers.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOthers.gridx = 6;
		gbc_comboBoxOthers.gridy = 8;
		panelResources.add(comboBoxOthers, gbc_comboBoxOthers);
		
		labelCountOthers = new JLabel("Count");
		GridBagConstraints gbc_labelCountOthers = new GridBagConstraints();
		gbc_labelCountOthers.anchor = GridBagConstraints.EAST;
		gbc_labelCountOthers.insets = new Insets(0, 0, 0, 5);
		gbc_labelCountOthers.gridx = 7;
		gbc_labelCountOthers.gridy = 8;
		panelResources.add(labelCountOthers, gbc_labelCountOthers);
		
		spinnerCountOthersLower = new JSpinner();
		spinnerCountOthersLower.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountOthersLower = new GridBagConstraints();
		gbc_spinnerCountOthersLower.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountOthersLower.insets = new Insets(0, 0, 0, 5);
		gbc_spinnerCountOthersLower.gridx = 8;
		gbc_spinnerCountOthersLower.gridy = 8;
		panelResources.add(spinnerCountOthersLower, gbc_spinnerCountOthersLower);
		
		spinnerCountOthersUpper = new JSpinner();
		spinnerCountOthersUpper.setModel(new SpinnerNumberModel(new Integer(-1), new Integer(-1), null, new Integer(1)));
		GridBagConstraints gbc_spinnerCountOthersUpper = new GridBagConstraints();
		gbc_spinnerCountOthersUpper.fill = GridBagConstraints.BOTH;
		gbc_spinnerCountOthersUpper.gridx = 9;
		gbc_spinnerCountOthersUpper.gridy = 8;
		panelResources.add(spinnerCountOthersUpper, gbc_spinnerCountOthersUpper);
		
		labelStatus = new JLabel("");
		GridBagConstraints gbc_labelStatus = new GridBagConstraints();
		gbc_labelStatus.anchor = GridBagConstraints.WEST;
		gbc_labelStatus.insets = new Insets(0, 0, 0, 5);
		gbc_labelStatus.gridx = 0;
		gbc_labelStatus.gridy = 4;
		add(labelStatus, gbc_labelStatus);
		
		buttonInfer = new JButton("Infer");
		GridBagConstraints gbc_buttonInfer = new GridBagConstraints();
		gbc_buttonInfer.fill = GridBagConstraints.BOTH;
		gbc_buttonInfer.gridx = 1;
		gbc_buttonInfer.gridy = 4;
		add(buttonInfer, gbc_buttonInfer);

	}

	public static InteractivePanel getInteractivePanel() {
		return interactivePanel;
	}

	public JLabel getLabelAGRISYS() {
		return labelAGRISYS;
	}

	public JPanel getPanelGeo() {
		return panelGeo;
	}

	public JLabel getLabelProvince() {
		return labelProvince;
	}

	public JComboBox<String> getComboBoxProvince() {
		return comboBoxProvince;
	}

	public JLabel getLabelMunicipality() {
		return labelMunicipality;
	}

	public JComboBox<String> getComboBoxMunicipality() {
		return comboBoxMunicipality;
	}

	public JLabel getLabelZone() {
		return labelZone;
	}

	public JComboBox<String> getComboBoxZone() {
		return comboBoxZone;
	}

	public JLabel getLabelBarangay() {
		return labelBarangay;
	}

	public JComboBox<String> getComboBoxBarangay() {
		return comboBoxBarangay;
	}

	public JLabel getLabelPurok() {
		return labelPurok;
	}

	public JComboBox<String> getComboBoxPurok() {
		return comboBoxPurok;
	}

	public JPanel getPanelAgri() {
		return panelAgri;
	}

	public JLabel getLabelIndustry() {
		return labelIndustry;
	}

	public JComboBox<String> getComboBoxIndustry() {
		return comboBoxIndustry;
	}

	public JLabel getLabelARCDP() {
		return labelARCDP;
	}

	public JComboBox<String> getComboBoxARCDP() {
		return comboBoxARCDP;
	}

	public JLabel getLabelCropInsurance() {
		return labelCropInsurance;
	}

	public JComboBox<String> getComboBoxCropInsurance() {
		return comboBoxCropInsurance;
	}

	public JLabel getLabelAgriculturalInsurance() {
		return labelAgriculturalInsurance;
	}

	public JComboBox<String> getComboBoxAgriculturalInsurance() {
		return comboBoxAgriculturalInsurance;
	}

	public JLabel getLabelChangePrimaryCrop() {
		return labelChangePrimaryCrop;
	}

	public JComboBox<String> getComboBoxChangePrimaryCrop() {
		return comboBoxChangePrimaryCrop;
	}

	public JLabel getLabelReasonChangePrimaryCrop() {
		return labelReasonChangePrimaryCrop;
	}

	public JComboBox<String> getComboBoxReasonChangePrimaryCrop() {
		return comboBoxReasonChangePrimaryCrop;
	}

	public JLabel getLabelChangeSameCrop() {
		return labelChangeSameCrop;
	}

	public JComboBox<String> getComboBoxChangeSameCrop() {
		return comboBoxChangeSameCrop;
	}

	public JLabel getLabelReasonChangeSameCrop() {
		return labelReasonChangeSameCrop;
	}

	public JComboBox<String> getComboBoxReasonChangeSameCrop() {
		return comboBoxReasonChangeSameCrop;
	}

	public JLabel getLabelLowHarvest() {
		return labelLowHarvest;
	}

	public JComboBox<String> getComboBoxLowHarvest() {
		return comboBoxLowHarvest;
	}

	public JLabel getLabelWaterSupply() {
		return labelWaterSupply;
	}

	public JComboBox<String> getComboBoxWaterSupply() {
		return comboBoxWaterSupply;
	}

	public JLabel getLabelDrought() {
		return labelDrought;
	}

	public JComboBox<String> getComboBoxDrought() {
		return comboBoxDrought;
	}

	public JLabel getLabelDuration() {
		return labelDuration;
	}

	public JComboBox<String> getComboBoxDuration() {
		return comboBoxDuration;
	}

	public JLabel getLabelFlood() {
		return labelFlood;
	}

	public JComboBox<String> getComboBoxFlood() {
		return comboBoxFlood;
	}

	public JLabel getLabelCropType() {
		return labelCropType;
	}

	public JComboBox<String> getComboBoxCropType() {
		return comboBoxCropType;
	}

	public JPanel getPanelResources() {
		return panelResources;
	}

	public JLabel getLabelBeastOfBurden() {
		return labelBeastOfBurden;
	}

	public JComboBox<String> getComboBoxBeastOfBurden() {
		return comboBoxBeastOfBurden;
	}

	public JLabel getLabelCountBeastOfBurden() {
		return labelCountBeastOfBurden;
	}

	public JSpinner getSpinnerCountBeastOfBurdenLower() {
		return spinnerCountBeastOfBurdenLower;
	}

	public JSpinner getSpinnerCountBeastOfBurdenUpper() {
		return spinnerCountBeastOfBurdenUpper;
	}

	public JLabel getLabelPlow() {
		return labelPlow;
	}

	public JComboBox<String> getComboBoxPlow() {
		return comboBoxPlow;
	}

	public JLabel getLabelCountPlow() {
		return labelCountPlow;
	}

	public JSpinner getSpinnerCountPlowLower() {
		return spinnerCountPlowLower;
	}

	public JSpinner getSpinnerCountPlowUpper() {
		return spinnerCountPlowUpper;
	}

	public JLabel getLabelHarrow() {
		return labelHarrow;
	}

	public JComboBox<String> getComboBoxHarrow() {
		return comboBoxHarrow;
	}

	public JLabel getLabelCountHarrow() {
		return labelCountHarrow;
	}

	public JSpinner getSpinnerCountHarrowLower() {
		return spinnerCountHarrowLower;
	}

	public JSpinner getSpinnerCountHarrowUpper() {
		return spinnerCountHarrowUpper;
	}

	public JLabel getLabelMower() {
		return labelMower;
	}

	public JComboBox<String> getComboBoxMower() {
		return comboBoxMower;
	}

	public JLabel getLabelCountMower() {
		return labelCountMower;
	}

	public JSpinner getSpinnerCountMowerLower() {
		return spinnerCountMowerLower;
	}

	public JSpinner getSpinnerCountMowerUpper() {
		return spinnerCountMowerUpper;
	}

	public JLabel getLabelThresher() {
		return labelThresher;
	}

	public JComboBox<String> getComboBoxThresher() {
		return comboBoxThresher;
	}

	public JLabel getLabelCountThresher() {
		return labelCountThresher;
	}

	public JSpinner getSpinnerCountThresherLower() {
		return spinnerCountThresherLower;
	}

	public JSpinner getSpinnerCountThresherUpper() {
		return spinnerCountThresherUpper;
	}

	public JLabel getLabelSprayer() {
		return labelSprayer;
	}

	public JComboBox<String> getComboBoxSprayer() {
		return comboBoxSprayer;
	}

	public JLabel getLabelCountSprayer() {
		return labelCountSprayer;
	}

	public JSpinner getSpinnerCountSprayerLower() {
		return spinnerCountSprayerLower;
	}

	public JSpinner getSpinnerCountSprayerUpper() {
		return spinnerCountSprayerUpper;
	}

	public JLabel getLabelFarmTractor() {
		return labelFarmTractor;
	}

	public JComboBox<String> getComboBoxFarmTractor() {
		return comboBoxFarmTractor;
	}

	public JLabel getLabelCountFarmTractor() {
		return labelCountFarmTractor;
	}

	public JSpinner getSpinnerCountFarmTractorLower() {
		return spinnerCountFarmTractorLower;
	}

	public JSpinner getSpinnerCountFarmTractorUpper() {
		return spinnerCountFarmTractorUpper;
	}

	public JLabel getLabelHandTractor() {
		return labelHandTractor;
	}

	public JComboBox<String> getComboBoxHandTractor() {
		return comboBoxHandTractor;
	}

	public JLabel getLabelCountHandTractor() {
		return labelCountHandTractor;
	}

	public JSpinner getSpinnerCountHandTractorLower() {
		return spinnerCountHandTractorLower;
	}

	public JSpinner getSpinnerCountHandTractorUpper() {
		return spinnerCountHandTractorUpper;
	}

	public JLabel getLabelMudboat() {
		return labelMudboat;
	}

	public JComboBox<String> getComboBoxMudboat() {
		return comboBoxMudboat;
	}

	public JLabel getLabelCountMudboat() {
		return labelCountMudboat;
	}

	public JSpinner getSpinnerCountMudboatLower() {
		return spinnerCountMudboatLower;
	}

	public JSpinner getSpinnerCountMudboatUpper() {
		return spinnerCountMudboatUpper;
	}

	public JLabel getLabelPlanter() {
		return labelPlanter;
	}

	public JComboBox<String> getComboBoxPlanter() {
		return comboBoxPlanter;
	}

	public JLabel getLabelCountPlanter() {
		return labelCountPlanter;
	}

	public JSpinner getSpinnerCountPlanterLower() {
		return spinnerCountPlanterLower;
	}

	public JSpinner getSpinnerCountPlanterUpper() {
		return spinnerCountPlanterUpper;
	}

	public JLabel getLabelMechanicalDryer() {
		return labelMechanicalDryer;
	}

	public JComboBox<String> getComboBoxMechanicalDryer() {
		return comboBoxMechanicalDryer;
	}

	public JLabel getLabelCountMechanicalDryer() {
		return labelCountMechanicalDryer;
	}

	public JSpinner getSpinnerCountMechanicalDryerLower() {
		return spinnerCountMechanicalDryerLower;
	}

	public JSpinner getSpinnerCountMechanicalDryerUpper() {
		return spinnerCountMechanicalDryerUpper;
	}

	public JLabel getLabelDryingPavement() {
		return labelDryingPavement;
	}

	public JComboBox<String> getComboBoxDryingPavement() {
		return comboBoxDryingPavement;
	}

	public JLabel getLabelCountDryingPavement() {
		return labelCountDryingPavement;
	}

	public JSpinner getSpinnerCountDryingPavementLower() {
		return spinnerCountDryingPavementLower;
	}

	public JSpinner getSpinnerCountDryingPavementUpper() {
		return spinnerCountDryingPavementUpper;
	}

	public JLabel getLabelFeedMill() {
		return labelFeedMill;
	}

	public JComboBox<String> getComboBoxFeedMill() {
		return comboBoxFeedMill;
	}

	public JLabel getLabelCountFeedMill() {
		return labelCountFeedMill;
	}

	public JSpinner getSpinnerCountFeedMillLower() {
		return spinnerCountFeedMillLower;
	}

	public JSpinner getSpinnerCountFeedMillUpper() {
		return spinnerCountFeedMillUpper;
	}

	public JLabel getLabelHarvester() {
		return labelHarvester;
	}

	public JComboBox<String> getComboBoxHarvester() {
		return comboBoxHarvester;
	}

	public JLabel getLabelCountHarvester() {
		return labelCountHarvester;
	}

	public JSpinner getSpinnerCountHarvesterLower() {
		return spinnerCountHarvesterLower;
	}

	public JSpinner getSpinnerCountHarvesterUpper() {
		return spinnerCountHarvesterUpper;
	}

	public JLabel getLabelGranary() {
		return labelGranary;
	}

	public JComboBox<String> getComboBoxGranary() {
		return comboBoxGranary;
	}

	public JLabel getLabelCountGranary() {
		return labelCountGranary;
	}

	public JSpinner getSpinnerCountGranaryLower() {
		return spinnerCountGranaryLower;
	}

	public JSpinner getSpinnerCountGranaryUpper() {
		return spinnerCountGranaryUpper;
	}

	public JLabel getLabelFarmshed() {
		return labelFarmshed;
	}

	public JComboBox<String> getComboBoxFarmshed() {
		return comboBoxFarmshed;
	}

	public JLabel getLabelCountFarmshed() {
		return labelCountFarmshed;
	}

	public JSpinner getSpinnerCountFarmshedLower() {
		return spinnerCountFarmshedLower;
	}

	public JSpinner getSpinnerCountFarmshedUpper() {
		return spinnerCountFarmshedUpper;
	}

	public JLabel getLabelIrrigationPump() {
		return labelIrrigationPump;
	}

	public JComboBox<String> getComboBoxIrrigationPump() {
		return comboBoxIrrigationPump;
	}

	public JLabel getLabelCountIrrigationPump() {
		return labelCountIrrigationPump;
	}

	public JSpinner getSpinnerCountIrrigationPumpLower() {
		return spinnerCountIrrigationPumpLower;
	}

	public JSpinner getSpinnerCountIrrigationPumpUpper() {
		return spinnerCountIrrigationPumpUpper;
	}

	public JLabel getLabelOthers() {
		return labelOthers;
	}

	public JComboBox<String> getComboBoxOthers() {
		return comboBoxOthers;
	}

	public JLabel getLabelCountOthers() {
		return labelCountOthers;
	}

	public JSpinner getSpinnerCountOthersLower() {
		return spinnerCountOthersLower;
	}

	public JSpinner getSpinnerCountOthersUpper() {
		return spinnerCountOthersUpper;
	}

	public JLabel getLabelStatus() {
		return labelStatus;
	}

	public JButton getButtonInfer() {
		return buttonInfer;
	}

}