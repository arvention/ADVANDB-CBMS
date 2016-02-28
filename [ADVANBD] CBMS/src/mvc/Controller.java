package mvc;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import database.FacadeDatabase;

public class Controller {
	private static final Controller controller = new Controller(View.getInstance(), ModelTable.getInstance(), FacadeDatabase.getInstance());
	
	private final String TRUE = "1";
	private final String FALSE = "2";
	
	private final View view;
	private final ModelTable modelTable;
	private final FacadeDatabase facadeDatabase;
	
	public static Controller getInstance(){
		return controller;
	}
	
	public Controller(View view, ModelTable modelTable, FacadeDatabase facadeDatabase){
		this.view = view;
		this.modelTable = modelTable;
		this.facadeDatabase = facadeDatabase;
		addListeners();
		
		this.view.setVisible(true);
	}

	public View getView() {
		return view;
	}

	public ModelTable getModelTable() {
		return modelTable;
	}
	
	public FacadeDatabase getFacadeDatabase() {
		return facadeDatabase;
	}
	
	public void addListeners(){
		view.getButtonQuery1().addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_query1");
		      }
		});
		
		view.getButtonQuery2().addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_query2");
		      }
		});
		
		view.getButtonQuery1Back().addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_main");
		      }
		});
		
		view.getSpinnerQuery1BagyoFrequencyLower().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1BagyoFrequencyLower(), view.getSpinnerQuery1BagyoFrequencyUpper());
			}
        });
		
		view.getSpinnerQuery1BagyoFrequencyUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1BagyoFrequencyLower(), view.getSpinnerQuery1BagyoFrequencyUpper());
			}
		});
		
		view.getSpinnerQuery1BahaFrequencyLower().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1BahaFrequencyLower(), view.getSpinnerQuery1BahaFrequencyUpper());
			}
        });
		
		view.getSpinnerQuery1BahaFrequencyUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1BahaFrequencyLower(), view.getSpinnerQuery1BahaFrequencyUpper());
			}
		});
		
		view.getSpinnerQuery1TagtuyotFrequencyLower().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1TagtuyotFrequencyLower(), view.getSpinnerQuery1TagtuyotFrequencyUpper());
			}
        });
		
		view.getSpinnerQuery1TagtuyotFrequencyUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1TagtuyotFrequencyLower(), view.getSpinnerQuery1TagtuyotFrequencyUpper());
			}
		});
		
		view.getSpinnerQuery1LindolFrequencyLower().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1LindolFrequencyLower(), view.getSpinnerQuery1LindolFrequencyUpper());
			}
        });
		
		view.getSpinnerQuery1LindolFrequencyUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1LindolFrequencyLower(), view.getSpinnerQuery1LindolFrequencyUpper());
			}
		});
		
		view.getSpinnerQuery1BulkanFrequencyLower().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1BulkanFrequencyLower(), view.getSpinnerQuery1BulkanFrequencyUpper());
			}
        });
		
		view.getSpinnerQuery1BulkanFrequencyUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1BulkanFrequencyLower(), view.getSpinnerQuery1BulkanFrequencyUpper());
			}
		});
		
		view.getSpinnerQuery1LandslideFrequencyLower().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1LandslideFrequencyLower(), view.getSpinnerQuery1LandslideFrequencyUpper());
			}
        });
		
		view.getSpinnerQuery1LandslideFrequencyUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1LandslideFrequencyLower(), view.getSpinnerQuery1LandslideFrequencyUpper());
			}
		});
		
		view.getSpinnerQuery1TsunamiFrequencyLower().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1TsunamiFrequencyLower(), view.getSpinnerQuery1TsunamiFrequencyUpper());
			}
        });
		
		view.getSpinnerQuery1TsunamiFrequencyUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1TsunamiFrequencyLower(), view.getSpinnerQuery1TsunamiFrequencyUpper());
			}
		});
		
		view.getSpinnerQuery1SunogFrequencyLower().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1SunogFrequencyLower(), view.getSpinnerQuery1SunogFrequencyUpper());
			}
        });
		
		view.getSpinnerQuery1SunogFrequencyUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1SunogFrequencyLower(), view.getSpinnerQuery1SunogFrequencyUpper());
			}
		});
		
		view.getSpinnerQuery1ForestFireFrequencyLower().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1ForestFireFrequencyLower(), view.getSpinnerQuery1ForestFireFrequencyUpper());
			}
        });
		
		view.getSpinnerQuery1ForestFireFrequencyUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1ForestFireFrequencyLower(), view.getSpinnerQuery1ForestFireFrequencyUpper());
			}
		});
		
		view.getSpinnerQuery1DigmaanFrequencyLower().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1DigmaanFrequencyLower(), view.getSpinnerQuery1DigmaanFrequencyUpper());
			}
        });
		
		view.getSpinnerQuery1DigmaanFrequencyUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1DigmaanFrequencyLower(), view.getSpinnerQuery1DigmaanFrequencyUpper());
			}
		});
		
		view.getButtonQuery1Query().addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				
				String sql = query1Builder();
				System.out.println(sql);
				
				long startTime = System.nanoTime();
				facadeDatabase.getResult(sql, modelTable);
				long endTime = System.nanoTime() - startTime;
				double seconds = endTime / 1.0E09;
				
				view.getLabelQuery1Status().setText("Rows returned: " + modelTable.getData().length + " | Running time: " + seconds + " seconds");
				DefaultTableModel dtm = new DefaultTableModel(modelTable.getData(), modelTable.getColumnName());
				view.getTableQuery1ResultTable().setModel(dtm);
			}
		});
		
		view.getButtonQuery2Back().addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				CardLayout cardLayout = (CardLayout)view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_main");
			}
		});
		
		view.getSpinnerQuery2SLPNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2SLPNumLower(), view.getSpinnerQuery2SLPNumUpper());
			}
		});
		
		view.getSpinnerQuery2SLPNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2SLPNumLower(), view.getSpinnerQuery2SLPNumUpper());
			}
		});
		
		view.getSpinnerQuery2FFSPNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2FFSPNumLower(), view.getSpinnerQuery2FFSPNumUpper());
			}
		});
		
		view.getSpinnerQuery2FFSPNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2FFSPNumLower(), view.getSpinnerQuery2FFSPNumUpper());
			}
		});
		
		view.getSpinnerQuery2FFWPNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2FFWPNumLower(), view.getSpinnerQuery2FFWPNumUpper());
			}
		});
		
		view.getSpinnerQuery2FFWPNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2FFWPNumLower(), view.getSpinnerQuery2FFWPNumUpper());
			}
		});
		
		view.getSpinnerQuery2CFWPNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2CFWPNumLower(), view.getSpinnerQuery2CFWPNumUpper());
			}
		});
		
		view.getSpinnerQuery2CFWPNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2CFWPNumLower(), view.getSpinnerQuery2CFWPNumUpper());
			}
		});
		
		view.getSpinnerQuery2SPISCNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2SPISCNumLower(), view.getSpinnerQuery2SPISCNumUpper());
			}
		});
		
		view.getSpinnerQuery2SPISCNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2SPISCNumLower(), view.getSpinnerQuery2SPISCNumUpper());
			}
		});
		
		view.getSpinnerQuery2CCTNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2CCTNumLower(), view.getSpinnerQuery2CCTNumUpper());
			}
		});
		
		view.getSpinnerQuery2CCTNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2CCTNumLower(), view.getSpinnerQuery2CCTNumUpper());
			}
		});
		
		view.getSpinnerQuery2ARCDPNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2ARCDPNumLower(), view.getSpinnerQuery2ARCDPNumUpper());
			}
		});
		
		view.getSpinnerQuery2ARCDPNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2ARCDPNumLower(), view.getSpinnerQuery2ARCDPNumUpper());
			}
		});
		
		view.getSpinnerQuery2CBEPNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2CBEPNumLower(), view.getSpinnerQuery2CBEPNumUpper());
			}
		});
		
		view.getSpinnerQuery2CBEPNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2CBEPNumLower(), view.getSpinnerQuery2CBEPNumUpper());
			}
		});
		
		view.getSpinnerQuery2PHOFWNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2PHOFWNumLower(), view.getSpinnerQuery2PHOFWNumUpper());
			}
		});
		
		view.getSpinnerQuery2PHOFWNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2PHOFWNumLower(), view.getSpinnerQuery2PHOFWNumUpper());
			}
		});
		
		view.getSpinnerQuery2PHENumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2PHENumLower(), view.getSpinnerQuery2PHENumUpper());
			}
		});
		
		view.getSpinnerQuery2PHENumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2PHENumLower(), view.getSpinnerQuery2PHENumUpper());
			}
		});
		
		view.getSpinnerQuery2PHIPNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2PHIPNumLower(), view.getSpinnerQuery2PHIPNumUpper());
			}
		});
		
		view.getSpinnerQuery2PHIPNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2PHIPNumLower(), view.getSpinnerQuery2PHIPNumUpper());
			}
		});
		
		view.getSpinnerQuery2PHSNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2PHSNumLower(), view.getSpinnerQuery2PHSNumUpper());
			}
		});
		
		view.getSpinnerQuery2PHSNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2PHSNumLower(), view.getSpinnerQuery2PHSNumUpper());
			}
		});
		
		view.getSpinnerQuery2PHLNumLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2PHLNumLower(), view.getSpinnerQuery2PHLNumUpper());
			}
		});
		
		view.getSpinnerQuery2PHLNumUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2PHLNumLower(), view.getSpinnerQuery2PHLNumUpper());
			}
		});
		
		view.getSpinnerQuery2OtherProgramsLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2OtherProgramsLower(), view.getSpinnerQuery2OtherProgramsUpper());
			}
		});
		
		view.getSpinnerQuery2OtherProgramsUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2OtherProgramsLower(), view.getSpinnerQuery2OtherProgramsUpper());
			}
		});
		
		view.getButtonQuery2Query().addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				
				String sql = query2Builder();
				System.out.println(sql);
				
				long startTime = System.nanoTime();
				facadeDatabase.getResult(sql, modelTable);
				long endTime = System.nanoTime() - startTime;
				double seconds = endTime / 1.0E09;
				view.getLabelQuery2Status().setText("Rows returned: " + modelTable.getData().length + " | Running time: " + seconds + " seconds");
				//view.getLabelQuery2Status().setText("Running time: " + seconds + " seconds");
				DefaultTableModel dtm = new DefaultTableModel(modelTable.getData(), modelTable.getColumnName());
				view.getTableQuery2ResultTable().setModel(dtm);
			}
		});
	}
	
	public void changeUpperBound(JSpinner lowerSpinner, JSpinner upperSpinner){
		int lower = Integer.parseInt(lowerSpinner.getValue().toString());
		int upper = Integer.parseInt(upperSpinner.getValue().toString());
		if(lower > upper)
			upperSpinner.setValue(lower);
	}
	
	public void changeLowerBound(JSpinner lowerSpinner, JSpinner upperSpinner){
		int lower = Integer.parseInt(lowerSpinner.getValue().toString());
		int upper = Integer.parseInt(upperSpinner.getValue().toString());
		if(upper < lower)
			lowerSpinner.setValue(upper);
	}
	
	public String appendWhereChecker(String sql){
		String query = sql;
		if(!query.contains("where"))
			query += "where ";
		else
			query += " and ";
		return query;
	}
	
	public String query1Builder(){
		String sql = "Select id as ID, mun as Municipality, zone as Zone, brgy as Barangay, "
				+ "purok as Purok, house_type_o as 'House Type', nbr as 'House Number', "
				+ "roof as Roof, wall as Wall, nofw as 'Number of OFW', nnucfam as 'Number of Families', "
				+ "calam1_hus_aid_o as 'Tumulong Noong May Bagyo', calam2_hus_aid_o as 'Tumulong Noong May Baha', "
				+ "calam3_hus_aid_o as 'Tumulong Noong May Tagtuyot', calam4_hus_aid_o as 'Tumulong Noong Lindol', "
				+ "calam5_hus_aid_o as 'Tumulong Noong Sumabog ang Bulkan', "
				+ "calam6_hus_aid_o as 'Tumulong Noong May Landslide', calam7_hus_aid_o as 'Tumulong Noong May Tsunami', "
				+ "calam8_hus_aid_o as 'Tumulong Noong May Sunog', calam9_hus_aid_o as 'Tumulong Noong May Forest Fire', "
				+ "calam10_hus_aid_o as 'Tumulong Noong May Digmaan' from hpq_hh ";
		
		if(view.getComboBoxQuery1Municipality().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			sql += "mun = " + view.getComboBoxQuery1Municipality().getSelectedItem().toString();
		}
		
		if(view.getComboBoxQuery1Zone().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			sql += "zone = " + view.getComboBoxQuery1Zone().getSelectedItem().toString();
		}
		
		if(view.getComboBoxQuery1Barangay().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			sql += "brgy = " + view.getComboBoxQuery1Barangay().getSelectedItem().toString();
		}
		
		if(view.getComboBoxQuery1Purok().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			sql += "purok = " + view.getComboBoxQuery1Purok().getSelectedItem().toString();
		}
		
		if(view.getComboBoxQuery1HouseType().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1HouseType().getSelectedItem().toString().equals("Single"))
				sql += "house_type = 1";
			else if(view.getComboBoxQuery1HouseType().getSelectedItem().toString().equals("Duplex"))
				sql += "house_type = 2";
			else if(view.getComboBoxQuery1HouseType().getSelectedItem().toString().equals("Multi-unit"))
				sql += "house_type = 3";
			else if(view.getComboBoxQuery1HouseType().getSelectedItem().toString().equals("Commercial"))
				sql += "house_type = 4";
			else if(view.getComboBoxQuery1HouseType().getSelectedItem().toString().equals("Others"))
				sql += "house_type = 5";
		}
		
		if(view.getComboBoxQuery1Bagyo().getSelectedIndex() != 0 ){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1Bagyo().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam1 = " + TRUE;
			else if(view.getComboBoxQuery1Bagyo().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam1 = " + FALSE;
		}
		
		if(!view.getSpinnerQuery1BagyoFrequencyLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam1_hwmny > " + view.getSpinnerQuery1BagyoFrequencyLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery1BagyoFrequencyUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam1_hwmny <= " + view.getSpinnerQuery1BagyoFrequencyUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery1BagyoAid().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1BagyoAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam1_aid = " + TRUE;
			else if(view.getComboBoxQuery1BagyoAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam1_aid = " + FALSE;
		}
		
		if(view.getComboBoxQuery1Baha().getSelectedIndex() != 0 ){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1Baha().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam2 = " + TRUE;
			else if(view.getComboBoxQuery1Baha().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam2 = " + FALSE;
		}
		
		if(!view.getSpinnerQuery1BahaFrequencyLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam2_hwmny > " + view.getSpinnerQuery1BahaFrequencyLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery1BahaFrequencyUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam2_hwmny <= " + view.getSpinnerQuery1BahaFrequencyUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery1BahaAid().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1BahaAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam2_aid = " + TRUE;
			else if(view.getComboBoxQuery1BahaAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam2_aid = " + FALSE;
		}
		
		if(view.getComboBoxQuery1Tagtuyot().getSelectedIndex() != 0 ){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1Tagtuyot().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam3 = " + TRUE;
			else if(view.getComboBoxQuery1Tagtuyot().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam3 = " + FALSE;
		}
		
		if(!view.getSpinnerQuery1TagtuyotFrequencyLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam3_hwmny > " + view.getSpinnerQuery1TagtuyotFrequencyLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery1TagtuyotFrequencyUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam3_hwmny <= " + view.getSpinnerQuery1TagtuyotFrequencyUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery1TagtuyotAid().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1TagtuyotAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam3_aid = " + TRUE;
			else if(view.getComboBoxQuery1TagtuyotAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam3_aid = " + FALSE;
		}
		
		if(view.getComboBoxQuery1Lindol().getSelectedIndex() != 0 ){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1Lindol().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam4 = " + TRUE;
			else if(view.getComboBoxQuery1Lindol().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam4 = " + FALSE;
		}
		
		if(!view.getSpinnerQuery1LindolFrequencyLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam4_hwmny > " + view.getSpinnerQuery1LindolFrequencyLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery1LindolFrequencyUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam4_hwmny <= " + view.getSpinnerQuery1LindolFrequencyUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery1LindolAid().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1LindolAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam4_aid = " + TRUE;
			else if(view.getComboBoxQuery1LindolAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam4_aid = " + FALSE;
		}
		
		if(view.getComboBoxQuery1Bulkan().getSelectedIndex() != 0 ){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1Bulkan().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam5 = " + TRUE;
			else if(view.getComboBoxQuery1Bulkan().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam5 = " + FALSE;
		}
		
		if(!view.getSpinnerQuery1BulkanFrequencyLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam5_hwmny > " + view.getSpinnerQuery1BulkanFrequencyLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery1BulkanFrequencyUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam5_hwmny <= " + view.getSpinnerQuery1BulkanFrequencyUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery1BulkanAid().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1BulkanAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam5_aid = " + TRUE;
			else if(view.getComboBoxQuery1BulkanAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam5_aid = " + FALSE;
		}
		
		if(view.getComboBoxQuery1Landslide().getSelectedIndex() != 0 ){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1Landslide().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam6 = " + TRUE;
			else if(view.getComboBoxQuery1Landslide().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam6 = " + FALSE;
		}
		
		if(!view.getSpinnerQuery1LandslideFrequencyLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam6_hwmny > " + view.getSpinnerQuery1LandslideFrequencyLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery1LandslideFrequencyUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam6_hwmny <= " + view.getSpinnerQuery1LandslideFrequencyUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery1LandslideAid().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1LandslideAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam6_aid = " + TRUE;
			else if(view.getComboBoxQuery1LandslideAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam6_aid = " + FALSE;
		}
		
		if(view.getComboBoxQuery1Tsunami().getSelectedIndex() != 0 ){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1Tsunami().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam7 = " + TRUE;
			else if(view.getComboBoxQuery1Tsunami().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam7 = " + FALSE;
		}
		
		if(!view.getSpinnerQuery1TsunamiFrequencyLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam7_hwmny > " + view.getSpinnerQuery1TsunamiFrequencyLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery1TsunamiFrequencyUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam7_hwmny <= " + view.getSpinnerQuery1TsunamiFrequencyUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery1TsunamiAid().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1TsunamiAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam7_aid = " + TRUE;
			else if(view.getComboBoxQuery1TsunamiAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam7_aid = " + FALSE;
		}
		
		if(view.getComboBoxQuery1Sunog().getSelectedIndex() != 0 ){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1Sunog().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam8 = " + TRUE;
			else if(view.getComboBoxQuery1Sunog().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam8 = " + FALSE;
		}
		
		if(!view.getSpinnerQuery1SunogFrequencyLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam8_hwmny > " + view.getSpinnerQuery1SunogFrequencyLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery1SunogFrequencyUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam8_hwmny <= " + view.getSpinnerQuery1SunogFrequencyUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery1SunogAid().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1SunogAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam8_aid = " + TRUE;
			else if(view.getComboBoxQuery1SunogAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam8_aid = " + FALSE;
		}
		
		if(view.getComboBoxQuery1ForestFire().getSelectedIndex() != 0 ){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1ForestFire().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam9 = " + TRUE;
			else if(view.getComboBoxQuery1ForestFire().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam9 = " + FALSE;
		}
		
		if(!view.getSpinnerQuery1ForestFireFrequencyLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam9_hwmny > " + view.getSpinnerQuery1ForestFireFrequencyLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery1ForestFireFrequencyUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam9_hwmny <= " + view.getSpinnerQuery1ForestFireFrequencyUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery1ForestFireAid().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1ForestFireAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam9_aid = " + TRUE;
			else if(view.getComboBoxQuery1ForestFireAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam9_aid = " + FALSE;
		}
		
		if(view.getComboBoxQuery1Digmaan().getSelectedIndex() != 0 ){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1Digmaan().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam10 = " + TRUE;
			else if(view.getComboBoxQuery1Digmaan().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam10 = " + FALSE;
		}
		
		if(!view.getSpinnerQuery1DigmaanFrequencyLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam10_hwmny > " + view.getSpinnerQuery1DigmaanFrequencyLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery1DigmaanFrequencyUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "calam10_hwmny <= " + view.getSpinnerQuery1DigmaanFrequencyUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery1DigmaanAid().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery1DigmaanAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam10_aid = " + TRUE;
			else if(view.getComboBoxQuery1DigmaanAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam10_aid = " + FALSE;
		}
		
		return sql;
	}
	
	public String query2Builder(){
		String sql = "Select id as ID, mun as Municipality, zone as Zone, brgy as Barangay, purok as Purok, "
				+ "house_type_o as 'House Type', nbr as 'House Number', roof as Roof, wall as Wall, "
				+ "nofw as 'Number of OFW', nnucfam as 'Number of Families', "
				+ "prog_slp_nmem as 'Bilang ng Nakikinabang sa Sustainable Livelihood Program', "
				+ "prog_fudforsch_nmem as 'Bilang ng Nakikinabang sa Food for School Program', "
				+ "prog_fudforwrk_nmem as 'Bilang ng Nakikinabang sa Food for Work Program', "
				+ "prog_cshforwrk_nmem as 'Bilang ng Nakikinabang sa Cash For Work Program', "
				+ "prog_spisc_nmem as 'Bilang ng Nakikinabang sa Social Pension for the Indigent Senior Citizens', "
				+ "prog_cct_nmem as 'Bilang ng Nakikinabang sa Pantawid Pamilyang Pilipino Program', "
				+ "prog_arcdp_nmem as 'Bilang ng Nakikinabang sa Agrarian Reform Community Development Program', "
				+ "prog_cbep_nmem as 'Bilang ng Nakikinabang sa Community-Based Employment Program', "
				+ "prog_phiheal_ofw_nmem as 'Bilang ng Nakikinabang sa Philhealth - OFW', "
				+ "prog_phiheal_empl_nmem as 'Bilang ng Nakikinabang sa Philhealth - Employed', "
				+ "prog_phiheal_indiv_nmem as 'Bilang ng Nakikinabang sa Philhealth - Individually Paying', "
				+ "prog_phiheal_spon_nmem as 'Bilang ng Nakikinabang sa Philhealth - Sponsored', "
				+ "prog_phiheal_life_nmem as 'Bilang ng Nakikinabang sa Philhealth - Lifetime', "
				+ "nprog as 'Bilang ng iba pang Programang Nakinabang ang Sambahayan' from hpq_hh ";
		
		if(view.getComboBoxQuery2Municipality().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			sql += "mun = " + view.getComboBoxQuery2Municipality().getSelectedItem().toString();
		}
		
		if(view.getComboBoxQuery2Zone().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			sql += "zone = " + view.getComboBoxQuery2Zone().getSelectedItem().toString();
		}
		
		if(view.getComboBoxQuery2Barangay().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			sql += "brgy = " + view.getComboBoxQuery2Barangay().getSelectedItem().toString();
		}
		
		if(view.getComboBoxQuery2Purok().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			sql += "purok = " + view.getComboBoxQuery2Purok().getSelectedItem().toString();
		}
		
		if(view.getComboBoxQuery2HouseType().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2HouseType().getSelectedItem().toString().equals("Single"))
				sql += "house_type = 1";
			else if(view.getComboBoxQuery2HouseType().getSelectedItem().toString().equals("Duplex"))
				sql += "house_type = 2";
			else if(view.getComboBoxQuery2HouseType().getSelectedItem().toString().equals("Multi-unit"))
				sql += "house_type = 3";
			else if(view.getComboBoxQuery2HouseType().getSelectedItem().toString().equals("Commercial"))
				sql += "house_type = 4";
			else if(view.getComboBoxQuery2HouseType().getSelectedItem().toString().equals("Others"))
				sql += "house_type = 5";
		}
		
		if(view.getComboBoxQuery2SLP().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2SLP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_slp = " + TRUE;
			else if(view.getComboBoxQuery2SLP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_slp = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2SLPNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_slp_nmem > " + view.getSpinnerQuery2SLPNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2SLPNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_slp_nmem <= " + view.getSpinnerQuery2SLPNumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2FFSP().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2FFSP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_fudforsch = " + TRUE;
			else if(view.getComboBoxQuery2FFSP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_fudforsch = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2FFSPNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_fudforsch_nmem > " + view.getSpinnerQuery2FFSPNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2FFSPNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_fudforsch_nmem <= " + view.getSpinnerQuery2FFSPNumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2FFWP().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2FFWP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_fudforwrk = " + TRUE;
			else if(view.getComboBoxQuery2FFWP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_fudforwrk = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2FFWPNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_fudforwrk_nmem > " + view.getSpinnerQuery2FFWPNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2FFWPNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_fudforwrk_nmem <= " + view.getSpinnerQuery2FFWPNumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2CFWP().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2CFWP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_cshforwrk = " + TRUE;
			else if(view.getComboBoxQuery2CFWP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_cshforwrk = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2CFWPNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_cshforwrk_nmem > " + view.getSpinnerQuery2CFWPNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2CFWPNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_cshforwrk_nmem <= " + view.getSpinnerQuery2CFWPNumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2SPISC().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2SPISC().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_spisc = " + TRUE;
			else if(view.getComboBoxQuery2SPISC().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_spisc = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2SPISCNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_spisc_nmem > " + view.getSpinnerQuery2SPISCNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2SPISCNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_spisc_nmem <= " + view.getSpinnerQuery2SPISCNumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2CCT().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2CCT().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_cct = " + TRUE;
			else if(view.getComboBoxQuery2CCT().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_cct = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2CCTNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_cct_nmem > " + view.getSpinnerQuery2CCTNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2CCTNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_cct_nmem <= " + view.getSpinnerQuery2CCTNumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2ARCDP().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2ARCDP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_arcdp = " + TRUE;
			else if(view.getComboBoxQuery2ARCDP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_arcdp = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2ARCDPNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_arcdp_nmem > " + view.getSpinnerQuery2ARCDPNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2ARCDPNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_arcdp_nmem <= " + view.getSpinnerQuery2ARCDPNumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2CBEP().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2CBEP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_cbep = " + TRUE;
			else if(view.getComboBoxQuery2CBEP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_cbep = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2CBEPNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_cbep_nmem > " + view.getSpinnerQuery2CBEPNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2CBEPNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_cbep_nmem <= " + view.getSpinnerQuery2CBEPNumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2PHOFW().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2PHOFW().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_philheal_ofw = " + TRUE;
			else if(view.getComboBoxQuery2PHOFW().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_philheal_ofw = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2PHOFWNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_ofw_nmem > " + view.getSpinnerQuery2PHOFWNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2PHOFWNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_ofw_nmem <= " + view.getSpinnerQuery2PHOFWNumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2PHE().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2PHE().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_philheal_empl = " + TRUE;
			else if(view.getComboBoxQuery2PHE().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_philheal_empl = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2PHENumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_empl_nmem > " + view.getSpinnerQuery2PHENumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2PHENumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_empl_nmem <= " + view.getSpinnerQuery2PHENumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2PHIP().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2PHIP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_philheal_indiv = " + TRUE;
			else if(view.getComboBoxQuery2PHIP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_philheal_indiv = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2PHIPNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_indiv_nmem > " + view.getSpinnerQuery2PHIPNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2PHIPNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_indiv_nmem <= " + view.getSpinnerQuery2PHIPNumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2PHS().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2PHS().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_philheal_spon = " + TRUE;
			else if(view.getComboBoxQuery2PHS().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_philheal_spon = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2PHSNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_spon_nmem > " + view.getSpinnerQuery2PHSNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2PHSNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_spon_nmem <= " + view.getSpinnerQuery2PHSNumUpper().getValue().toString();
		}
		
		if(view.getComboBoxQuery2PHL().getSelectedIndex() != 0){
			sql = appendWhereChecker(sql);
			if(view.getComboBoxQuery2PHL().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_philheal_life = " + TRUE;
			else if(view.getComboBoxQuery2PHL().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_philheal_life = 1" + FALSE;
		}
		
		if(!view.getSpinnerQuery2PHLNumLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_life_nmem > " + view.getSpinnerQuery2PHLNumLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2PHLNumUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_life_nmem <= " + view.getSpinnerQuery2PHLNumUpper().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2OtherProgramsLower().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "nprog > " + view.getSpinnerQuery2OtherProgramsLower().getValue().toString();
		}
		
		if(!view.getSpinnerQuery2OtherProgramsUpper().getValue().toString().equals("-1")){
			sql = appendWhereChecker(sql);
			sql += "nprog <= " + view.getSpinnerQuery2OtherProgramsUpper().getValue().toString();
		}
		
		return sql;
	}
	
}
