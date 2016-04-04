package mvc;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import database.FacadeDatabase;

public class Controller {
	private static final Controller controller = new Controller(View.getInstance(), ModelTable.getInstance(),
			FacadeDatabase.getInstance());

	private final String TRUE = "1";
	private final String FALSE = "2";

	private final String equipmentsSelect =	", agriequip1, agriequip1_nown"
											+ ", agriequip2, agriequip2_nown"
											+ ", agriequip3, agriequip3_nown"
											+ ", agriequip4, agriequip4_nown"
											+ ", agriequip5, agriequip5_nown"
											+ ", agriequip6, agriequip6_nown"
											+ ", agriequip7, agriequip7_nown"
											+ ", agriequip8, agriequip8_nown"
											+ ", agriequip9, agriequip9_nown"
											+ ", agriequip10, agriequip10_nown"
											+ ", agriequip11, agriequip11_nown"
											+ ", agriequip12, agriequip12_nown"
											+ ", agriequip13, agriequip13_nown"
											+ ", agriequip14, agriequip14_nown"
											+ ", agriequip15, agriequip15_nown"
											+ ", agriequip16, agriequip16_nown"
											+ ", agriequip17, agriequip17_nown"
											+ ", agriequip18, agriequip18_nown";
	
	private final String cropsSelect = ", croptype";
	
	private final String agriculturalStatusSelect = ", u_chng_scrop, u_chng_scrop_y"
													+ ", u_chng_pcrop, u_chng_pcrop_y"
													+ ", u_low_harv, low_wsupp"
													+ ", flood_freq, drought, drought_duration"
													+ ", prog_arcdp, irfa_agriequip, irfa_crop, cropind";
	
	private final String HOUSEHOLDAGRICULTURALLIVELIHOOD = "household_agricultural_livelihood";

	private final String PUROK = "purok";
	private final String BARANGAY = "barangay";
	private final String ZONE = "zone";
	private final String MUNICIPALITY = "municipality";
	private final String PROVINCE = "province";

	private final String CROPS = "CROPS";

	private final String AGRICULTURALSTATUS = "agricultural_status";
	private final String CROPCHANGE = "crop_change";
	private final String SAMECROP = "same_crop";
	private final String PRIMARYCROP = "primary_crop";
	private final String COMPLICATIONS = "complication";
	private final String DROUGHT = "drought";
	private final String FLOOD = "flood";
	private final String LOWHARVEST = "low_harvest";
	private final String LOWWATER = "low_water";

	private final String EQUIPMENTS = "equipments";
	private final String BEASTOFBURDEN = "beast_of_burden";
	private final String PLOW = "plow";
	private final String HARROW = "harrow";
	private final String MOWER = "mower";
	private final String THRESHER = "thresher";
	private final String INSECTICIDE = "insecticide";
	private final String FARMTRACTOR = "farm_tractor";
	private final String HANDTRACTOR = "hand_tractor";
	private final String MUDBOAT = "mudboat";
	private final String PLANTER = "planter";
	private final String MECHANICALDRYER = "mechanical_dryer";
	private final String DRYINGPAVEMENT = "drying_pavement";
	private final String FEEDMILL = "feed_mill";
	private final String HARVESTER = "harvester";
	private final String WAREHOUSEGRANARY = "warehouse_granary";
	private final String FARMSHED = "farmshed";
	private final String IRRIGATIONPUMP = "irrigation_pump";
	private final String OTHERS = "other_equipment";

	private ArrayList<String> tablesGeo;
	private ArrayList<String> tablesEquipment;
	private ArrayList<String> tablesAgriculturalStatus;
	private ArrayList<String> tablesCrop;

	//private ArrayList<String> attributesEquipment;
	//private ArrayList<String> attributesAgriculturalStatus;
	//private ArrayList<String> attributesCrop;

	private final View view;
	private final ModelTable modelTable;
	private final FacadeDatabase facadeDatabase;

	public static Controller getInstance() {
		return controller;
	}

	public Controller(View view, ModelTable modelTable, FacadeDatabase facadeDatabase) {
		this.view = view;
		this.modelTable = modelTable;
		this.facadeDatabase = facadeDatabase;
		addListeners();

		tablesGeo = new ArrayList<>();
		tablesEquipment = new ArrayList<>();
		tablesAgriculturalStatus = new ArrayList<>();
		tablesCrop = new ArrayList<>();

		//attributesEquipment = new ArrayList<>();
		//attributesAgriculturalStatus = new ArrayList<>();
		//attributesCrop = new ArrayList<>();

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

	private void addListeners(){
		addSpinnerListeners();
		addButtonListener();
	}

	private void addSpinnerListeners(){
		view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower(), view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower(), view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountPlowLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountPlowLower(), view.getInteractivePanel().getSpinnerCountPlowUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountPlowUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountPlowLower(), view.getInteractivePanel().getSpinnerCountPlowUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountHarrowLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountHarrowLower(), view.getInteractivePanel().getSpinnerCountHarrowUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountHarrowUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountHarrowLower(), view.getInteractivePanel().getSpinnerCountHarrowUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountMowerLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountMowerLower(), view.getInteractivePanel().getSpinnerCountMowerUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountMowerUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountMowerLower(), view.getInteractivePanel().getSpinnerCountMowerUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountThresherLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountThresherLower(), view.getInteractivePanel().getSpinnerCountThresherUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountThresherUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountThresherLower(), view.getInteractivePanel().getSpinnerCountThresherUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountSprayerLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountSprayerLower(), view.getInteractivePanel().getSpinnerCountSprayerUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountSprayerUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountSprayerLower(), view.getInteractivePanel().getSpinnerCountSprayerUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountFarmTractorLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountFarmTractorLower(), view.getInteractivePanel().getSpinnerCountFarmTractorUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountFarmTractorUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountFarmTractorLower(), view.getInteractivePanel().getSpinnerCountFarmTractorUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountHandTractorLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountHandTractorLower(), view.getInteractivePanel().getSpinnerCountHandTractorUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountHandTractorUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountHandTractorLower(), view.getInteractivePanel().getSpinnerCountHandTractorUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountMudboatLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountMudboatLower(), view.getInteractivePanel().getSpinnerCountMudboatUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountMudboatUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountMudboatLower(), view.getInteractivePanel().getSpinnerCountMudboatUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountPlanterLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountPlanterLower(), view.getInteractivePanel().getSpinnerCountPlanterUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountPlanterUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountPlanterLower(), view.getInteractivePanel().getSpinnerCountPlanterUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountMechanicalDryerLower(), view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountMechanicalDryerLower(), view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountDryingPavementLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountDryingPavementLower(), view.getInteractivePanel().getSpinnerCountDryingPavementUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountDryingPavementUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountDryingPavementLower(), view.getInteractivePanel().getSpinnerCountDryingPavementUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountFeedMillLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountFeedMillLower(), view.getInteractivePanel().getSpinnerCountFeedMillUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountFeedMillUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountFeedMillLower(), view.getInteractivePanel().getSpinnerCountFeedMillUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountHarvesterLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountHarvesterLower(), view.getInteractivePanel().getSpinnerCountHarvesterUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountHarvesterUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountHarvesterLower(), view.getInteractivePanel().getSpinnerCountHarvesterUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountGranaryLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountGranaryLower(), view.getInteractivePanel().getSpinnerCountGranaryUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountGranaryUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountGranaryLower(), view.getInteractivePanel().getSpinnerCountGranaryUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountFarmshedLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountFarmshedLower(), view.getInteractivePanel().getSpinnerCountFarmshedUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountFarmshedUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountFarmshedLower(), view.getInteractivePanel().getSpinnerCountFarmshedUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountIrrigationPumpLower(), view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountIrrigationPumpLower(), view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountOthersLower().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeUpperBound(view.getInteractivePanel().getSpinnerCountOthersLower(), view.getInteractivePanel().getSpinnerCountOthersUpper());
			}
		});

		view.getInteractivePanel().getSpinnerCountOthersUpper().addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent ce) {
				changeLowerBound(view.getInteractivePanel().getSpinnerCountOthersLower(), view.getInteractivePanel().getSpinnerCountOthersUpper());
			}
		});
	}

	private void addButtonListener(){
		view.getInteractivePanel().getButtonInfer().addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {

				tablesGeo = new ArrayList<>();
				tablesEquipment = new ArrayList<>();
				tablesAgriculturalStatus = new ArrayList<>();
				tablesCrop = new ArrayList<>();

				//attributesEquipment = new ArrayList<>();
				//attributesAgriculturalStatus = new ArrayList<>();
				//attributesCrop = new ArrayList<>();

				String query = queryBuilder();
				System.out.println(query);

				long startTime = System.nanoTime();
				facadeDatabase.getResult(query, modelTable);
				ModelTable tempTable = new ModelTable();
				if(view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Drilldown")){
					tempTable.setColumnName(modelTable.getColumnName());
					tempTable.setData(modelTable.getData());
					
					modelTable.setData(new String[modelTable.getData().length][modelTable.getData()[0].length]);
					
					int index = 0;
					for(int i = tempTable.getData().length - 1; i >= 0; i--){
						modelTable.getData()[index] = tempTable.getData()[i];
						index++;
					}
				}
				long endTime = System.nanoTime() - startTime;
				double seconds = endTime / 1.0E09;

				view.getInteractivePanel().getLabelStatus().setText("Rows returned: " + modelTable.getData().length + " | Running time: " + seconds + " seconds");;
				DefaultTableModel dtm = new DefaultTableModel(modelTable.getData(), modelTable.getColumnName());
				view.getTable().setModel(dtm);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
	}

	private String queryBuilder(){
		String select = "select id";
		String from = " from " + HOUSEHOLDAGRICULTURALLIVELIHOOD + " "; 
		String where = "";
		String groupby = "";

		from += "join " + PUROK + " on " + HOUSEHOLDAGRICULTURALLIVELIHOOD + ".PurokID = " + PUROK + ".PurokID ";
		from += "join " + BARANGAY + " on " + PUROK + ".BarangayID = " + BARANGAY + ".BarangayID ";
		from += "join " + ZONE + " on " + BARANGAY + ".ZoneID = " + ZONE + ".ZoneID ";
		from += "join " + MUNICIPALITY + " on " + ZONE + ".MunicipalityID = " + MUNICIPALITY + ".MunicipalityID ";
		from += "join " + PROVINCE + " on " + MUNICIPALITY + ".ProvinceID = " + PROVINCE + ".ProvinceID ";

		// WHERE CLAUSE
		if(view.getInteractivePanel().getComboBoxProvince().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			where += "prov = " + view.getInteractivePanel().getComboBoxProvince().getSelectedItem().toString();

			geoTableAdder(tablesGeo, PROVINCE);
		}

		if(view.getInteractivePanel().getComboBoxMunicipality().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			where += "mun = " + view.getInteractivePanel().getComboBoxProvince().getSelectedItem().toString();

			geoTableAdder(tablesGeo, MUNICIPALITY);
		}

		if(view.getInteractivePanel().getComboBoxZone().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			where += "zone = " + view.getInteractivePanel().getComboBoxZone().getSelectedItem().toString();

			geoTableAdder(tablesGeo, ZONE);
		}

		if(view.getInteractivePanel().getComboBoxBarangay().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			where += "brgy = " + view.getInteractivePanel().getComboBoxBarangay().getSelectedItem().toString();

			geoTableAdder(tablesGeo, BARANGAY);
		}

		if(view.getInteractivePanel().getComboBoxPurok().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			where += "purok = " + view.getInteractivePanel().getComboBoxPurok().getSelectedItem().toString();

			geoTableAdder(tablesGeo, PUROK);
		}

		if(view.getInteractivePanel().getComboBoxIndustry().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxIndustry().getSelectedItem().toString().equals("Yes"))
				where += "cropind = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxIndustry().getSelectedItem().toString().equals("No"))
				where += "cropind = " + FALSE;

			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
			//attributesAgriculturalStatus.add("cropind");
		}

		if(view.getInteractivePanel().getComboBoxARCDP().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxARCDP().getSelectedItem().toString().equals("Yes"))
				where += "prog_arcdp = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxARCDP().getSelectedItem().toString().equals("No"))
				where += "prog_arcdp = " + FALSE;

			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
			//attributesAgriculturalStatus.add("prog_arcdp");
		}

		if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedItem().toString().equals("Yes"))
				where += "irfa_crop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedItem().toString().equals("No"))
				where += "irfa_crop = " + FALSE;

			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
			//attributesAgriculturalStatus.add("irfa_crop");
		}

		if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedItem().toString().equals("Yes"))
				where += "irfa_agriequip = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedItem().toString().equals("No"))
				where += "irfa_agriequip = " + FALSE;

			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
			//attributesAgriculturalStatus.add("irfa_agriequip");
		}

		if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Yes"))
				where += "u_chng_pcrop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("No"))
				where += "u_chng_pcrop = " + FALSE;

			agriculturalStatusTableAdder(tablesAgriculturalStatus, PRIMARYCROP);
			//attributesAgriculturalStatus.add("u_chng_pcrop");
		}

		if(view.getInteractivePanel().getComboBoxReasonChangePrimaryCrop().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Cheaper")){
				where += "u_chng_pcrop_y = 1";
			} else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("More resistant to pest")){
				where += "u_chng_pcrop_y = 2";
			} else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Less water")){
				where += "u_chng_pcrop_y = 3";
			} else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("More profitable")){
				where += "u_chng_pcrop_y = 4";
			} else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Availability")){
				where += "u_chng_pcrop_y = 5";
			} else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Others")){
				where += "u_chng_pcrop_y = 6";
			}

			agriculturalStatusTableAdder(tablesAgriculturalStatus, PRIMARYCROP);
			//attributesAgriculturalStatus.add("u_chng_pcrop_y");
		}

		if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Yes"))
				where += "u_chng_scrop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("No"))
				where += "u_chng_scrop = " + FALSE;

			agriculturalStatusTableAdder(tablesAgriculturalStatus, SAMECROP);
			//attributesAgriculturalStatus.add("u_chng_scrop");
		}

		if(view.getInteractivePanel().getComboBoxReasonChangeSameCrop().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Cheaper")){
				where += "u_chng_scrop_y = 1";
			} else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("More resistant to pest")){
				where += "u_chng_scrop_y = 2";
			} else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Less water")){
				where += "u_chng_scrop_y = 3";
			} else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("More profitable")){
				where += "u_chng_scrop_y = 4";
			} else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Availability")){
				where += "u_chng_scrop_y = 5";
			} else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Others")){
				where += "u_chng_scrop_y = 6";
			}

			agriculturalStatusTableAdder(tablesAgriculturalStatus, SAMECROP);
			//attributesAgriculturalStatus.add("u_chng_scrop_y");
		}

		if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Price increase on inputs")){
				where += "u_low_harv = 1";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Drought")){
				where += "u_low_harv = 2";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Typhoon")){
				where += "u_low_harv = 3";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Flood")){
				where += "u_low_harv = 4";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Pests")){
				where += "u_low_harv = 5";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Decrease in water supply")){
				where += "u_low_harv = 6";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Change in occupation")){
				where += "u_low_harv = 7";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Others")){
				where += "u_low_harv = 8";
			}

			agriculturalStatusTableAdder(tablesAgriculturalStatus, LOWHARVEST);
			//attributesAgriculturalStatus.add("u_low_harv");
		}

		if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Drought")){
				where += "low_wsupp = 1";
			} else if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Broken pump")){
				where += "low_wsupp = 2";
			} else if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Dam water level")){
				where += "low_wsupp = 3";
			} else if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Tanker truck")){
				where += "low_wsupp = 4";
			} else if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Increase in customers")){
				where += "low_wsupp = 5";
			} else if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Others")){
				where += "low_wsupp = 6";
			}

			agriculturalStatusTableAdder(tablesAgriculturalStatus, LOWWATER);
			//attributesAgriculturalStatus.add("low_wsupp");
		}

		if(view.getInteractivePanel().getComboBoxDrought().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxDrought().getSelectedItem().toString().equals("Yes")){
				where += "drought = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxDrought().getSelectedItem().toString().equals("No")){
				where += "drought = " + FALSE;
			}

			agriculturalStatusTableAdder(tablesAgriculturalStatus, DROUGHT);
			//attributesAgriculturalStatus.add("drought");
		}

		if(view.getInteractivePanel().getComboBoxDuration().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("< 1 Month")){
				where += "drought_duration = 1";
			} else if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("1 Month < 2 Months")){
				where += "drought_duration = 2";
			} else if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("2 Months < 3 Months")){
				where += "drought_duration = 3";
			} else if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("3 Months < 4 Months")){
				where += "drought_duration = 4";
			} else if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("4 Months < 5 Months")){
				where += "drought_duration = 5";
			} else if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("5 Months or more")){
				where += "drought_duration = 6";
			}

			agriculturalStatusTableAdder(tablesAgriculturalStatus, DROUGHT);
			//attributesAgriculturalStatus.add("drought_duration");
		}

		if(view.getInteractivePanel().getComboBoxFlood().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFlood().getSelectedItem().toString().equals("Yes")){
				where += "flood_freq = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFlood().getSelectedItem().toString().equals("No")){
				where += "flood_freq = " + FALSE;
			}

			agriculturalStatusTableAdder(tablesAgriculturalStatus, FLOOD);
			//attributesAgriculturalStatus.add("flood_freq");
		}

		if(view.getInteractivePanel().getComboBoxCropType().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxCropType().getSelectedItem().toString().equals("Sugar Cane")){
				where += "croptype = 1";
			} else if(view.getInteractivePanel().getComboBoxCropType().getSelectedItem().toString().equals("Palay")){
				where += "croptype = 2";
			} else if(view.getInteractivePanel().getComboBoxCropType().getSelectedItem().toString().equals("Corn")){
				where += "croptype = 3";
			} else if(view.getInteractivePanel().getComboBoxCropType().getSelectedItem().toString().equals("Coffee")){
				where += "croptype = 4";
			} else if(view.getInteractivePanel().getComboBoxCropType().getSelectedItem().toString().equals("Other")){
				where += "croptype = 5";
			} 
			tablesCrop.add(CROPS);
			//attributesCrop.add("croptype");
		}

		if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedItem().toString().equals("Owned")){
				where += "agriequip1 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip1 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, BEASTOFBURDEN);
			//attributesEquipment.add("agriequip1");
		}

		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip1_nown > " + view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, BEASTOFBURDEN);
			//if(!attributesEquipment.contains("agriequip1_nown"))
				//attributesEquipment.add("agriequip1_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip1_nown <= " + view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, BEASTOFBURDEN);
			//if(!attributesEquipment.contains("agriequip1_nown"))
				//attributesEquipment.add("agriequip1_nown");
		}

		if(view.getInteractivePanel().getComboBoxPlow().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxPlow().getSelectedItem().toString().equals("Owned")){
				where += "agriequip2 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxPlow().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip2 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, PLOW);
			//attributesEquipment.add("agriequip2");
		}

		if(!view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip2_nown > " + view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, PLOW);
			//if(!attributesEquipment.contains("agriequip2_nown"))
				//attributesEquipment.add("agriequip2_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip2_nown <= " + view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, PLOW);
			//if(!attributesEquipment.contains("agriequip2_nown"))
				//attributesEquipment.add("agriequip2_nown");
		}

		if(view.getInteractivePanel().getComboBoxHarrow().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxHarrow().getSelectedItem().toString().equals("Owned")){
				where += "agriequip3 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHarrow().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip3 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, HARROW);
			//attributesEquipment.add("agriequip3");
		}

		if(!view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip3_nown > " + view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, HARROW);
			//if(!attributesEquipment.contains("agriequip3_nown"))
				//attributesEquipment.add("agriequip3_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip3_nown <= " + view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, HARROW);
			//if(!attributesEquipment.contains("agriequip3_nown"))
				//attributesEquipment.add("agriequip3_nown");
		}

		if(view.getInteractivePanel().getComboBoxMower().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxMower().getSelectedItem().toString().equals("Owned")){
				where += "agriequip4 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMower().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip4 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, MOWER);
			//attributesEquipment.add("agriequip4");
		}

		if(!view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip4_nown > " + view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, MOWER);
			//if(!attributesEquipment.contains("agriequip4_nown"))
				//attributesEquipment.add("agriequip4_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip4_nown <= " + view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, MOWER);
			//if(!attributesEquipment.contains("agriequip4_nown"))
				//attributesEquipment.add("agriequip4_nown");
		}

		if(view.getInteractivePanel().getComboBoxThresher().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxThresher().getSelectedItem().toString().equals("Owned")){
				where += "agriequip5 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxThresher().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip5 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, THRESHER);
			//attributesEquipment.add("agriequip5");
		}

		if(!view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip5_nown > " + view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, THRESHER);
			//if(!attributesEquipment.contains("agriequip5_nown"))
				//attributesEquipment.add("agriequip5_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip5_nown <= " + view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, THRESHER);
			//if(!attributesEquipment.contains("agriequip5_nown"))
				//attributesEquipment.add("agriequip5_nown");
		}

		if(view.getInteractivePanel().getComboBoxSprayer().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxSprayer().getSelectedItem().toString().equals("Owned")){
				where += "agriequip6 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxSprayer().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip6 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, INSECTICIDE);
			//attributesEquipment.add("agriequip6");
		}

		if(!view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip6_nown > " + view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, INSECTICIDE);
			//if(!attributesEquipment.contains("agriequip6_nown"))
				//attributesEquipment.add("agriequip6_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip6_nown <= " + view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, INSECTICIDE);
			//if(!attributesEquipment.contains("agriequip6_nown"))
				//attributesEquipment.add("agriequip6_nown");
		}

		if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedItem().toString().equals("Owned")){
				where += "agriequip7 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip7 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, FARMTRACTOR);
			//attributesEquipment.add("agriequip7");
		}

		if(!view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip7_nown > " + view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, FARMTRACTOR);
			//if(!attributesEquipment.contains("agriequip7_nown"))
				//attributesEquipment.add("agriequip7_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip7_nown <= " + view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, FARMTRACTOR);
			//if(!attributesEquipment.contains("agriequip7_nown"))
				//attributesEquipment.add("agriequip7_nown");
		}

		if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedItem().toString().equals("Owned")){
				where += "agriequip8 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip8 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, HANDTRACTOR);
			//attributesEquipment.add("agriequip8");
		}

		if(!view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip8_nown > " + view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, HANDTRACTOR);
			//if(!attributesEquipment.contains("agriequip8_nown"))
				//attributesEquipment.add("agriequip8_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip8_nown <= " + view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, HANDTRACTOR);
			//if(!attributesEquipment.contains("agriequip8_nown"))
				//attributesEquipment.add("agriequip8_nown");
		}

		if(view.getInteractivePanel().getComboBoxMudboat().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxMudboat().getSelectedItem().toString().equals("Owned")){
				where += "agriequip9 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMudboat().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip9 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, MUDBOAT);
			//attributesEquipment.add("agriequip9");
		}

		if(!view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip9_nown > " + view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, MUDBOAT);
			//if(!attributesEquipment.contains("agriequip9_nown"))
				//attributesEquipment.add("agriequip9_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip9_nown <= " + view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, MUDBOAT);
			//if(!attributesEquipment.contains("agriequip9_nown"))
				//attributesEquipment.add("agriequip9_nown");
		}

		if(view.getInteractivePanel().getComboBoxPlanter().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxPlanter().getSelectedItem().toString().equals("Owned")){
				where += "agriequip10 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxPlanter().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip10 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, PLANTER);
			//attributesEquipment.add("agriequip10");
		}

		if(!view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip10_nown > " + view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, PLANTER);
			//if(!attributesEquipment.contains("agriequip10_nown"))
				//attributesEquipment.add("agriequip10_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip10_nown <= " + view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, PLANTER);
			//if(!attributesEquipment.contains("agriequip10_nown"))
				//attributesEquipment.add("agriequip10_nown");
		}

		if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedItem().toString().equals("Owned")){
				where += "agriequip11 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip11 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, MECHANICALDRYER);
			//attributesEquipment.add("agriequip11");
		}

		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip11_nown > " + view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, MECHANICALDRYER);
			//if(!attributesEquipment.contains("agriequip11_nown"))
				//attributesEquipment.add("agriequip11_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip11_nown <= " + view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, MECHANICALDRYER);
			//if(!attributesEquipment.contains("agriequip11_nown"))
				//attributesEquipment.add("agriequip11_nown");
		}

		if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedItem().toString().equals("Owned")){
				where += "agriequip12 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip12 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, DRYINGPAVEMENT);
			//attributesEquipment.add("agriequip12");
		}

		if(!view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip12_nown > " + view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, DRYINGPAVEMENT);
			//if(!attributesEquipment.contains("agriequip12_nown"))
				//attributesEquipment.add("agriequip12_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip12_nown <= " + view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, DRYINGPAVEMENT);
			//if(!attributesEquipment.contains("agriequip12_nown"))
				//attributesEquipment.add("agriequip12_nown");
		}

		if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedItem().toString().equals("Owned")){
				where += "agriequip13 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip13 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, FEEDMILL);
			//attributesEquipment.add("agriequip13");
		}

		if(!view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip13_nown > " + view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, FEEDMILL);
			//if(!attributesEquipment.contains("agriequip13_nown"))
				//attributesEquipment.add("agriequip13_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip13_nown <= " + view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, FEEDMILL);
			//if(!attributesEquipment.contains("agriequip13_nown"))
				//attributesEquipment.add("agriequip13_nown");
		}

		if(view.getInteractivePanel().getComboBoxHarvester().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxHarvester().getSelectedItem().toString().equals("Owned")){
				where += "agriequip14 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHarvester().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip14 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, HARVESTER);
			//attributesEquipment.add("agriequip14");
		}

		if(!view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip14_nown > " + view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, HARVESTER);
			//if(!attributesEquipment.contains("agriequip14_nown"))
				//attributesEquipment.add("agriequip14_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip14_nown <= " + view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, HARVESTER);
			//if(!attributesEquipment.contains("agriequip14_nown"))
				//attributesEquipment.add("agriequip14_nown");
		}

		if(view.getInteractivePanel().getComboBoxGranary().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxGranary().getSelectedItem().toString().equals("Owned")){
				where += "agriequip15 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxGranary().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip15 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, WAREHOUSEGRANARY);
			//attributesEquipment.add("agriequip15");
		}

		if(!view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip15_nown > " + view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, WAREHOUSEGRANARY);
			//if(!attributesEquipment.contains("agriequip15_nown"))
				//attributesEquipment.add("agriequip15_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip15_nown <= " + view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, WAREHOUSEGRANARY);
			//if(!attributesEquipment.contains("agriequip15_nown"))
				//attributesEquipment.add("agriequip15_nown");
		}

		if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedItem().toString().equals("Owned")){
				where += "agriequip16 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip16 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, FARMSHED);
			//attributesEquipment.add("agriequip16");
		}

		if(!view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip16_nown > " + view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, FARMSHED);
			//if(!attributesEquipment.contains("agriequip16_nown"))
				//attributesEquipment.add("agriequip16_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip16_nown <= " + view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, FARMSHED);
			//if(!attributesEquipment.contains("agriequip16_nown"))
				//attributesEquipment.add("agriequip16_nown");
		}

		if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedItem().toString().equals("Owned")){
				where += "agriequip17 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip17 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, IRRIGATIONPUMP);
			//attributesEquipment.add("agriequip17");
		}

		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip17_nown > " + view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, IRRIGATIONPUMP);
			//if(!attributesEquipment.contains("agriequip17_nown"))
				//attributesEquipment.add("agriequip17_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip17_nown <= " + view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, IRRIGATIONPUMP);
			//if(!attributesEquipment.contains("agriequip17_nown"))
				//attributesEquipment.add("agriequip17_nown");
		}

		if(view.getInteractivePanel().getComboBoxOthers().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxOthers().getSelectedItem().toString().equals("Owned")){
				where += "agriequip18 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxOthers().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip18 = " + FALSE;
			}

			equipmentTableAdder(tablesEquipment, OTHERS);
			//attributesEquipment.add("agriequip18");
		}

		if(!view.getInteractivePanel().getSpinnerCountOthersLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip18_nown > " + view.getInteractivePanel().getSpinnerCountOthersLower().getValue().toString();

			equipmentTableAdder(tablesEquipment, OTHERS);
			//if(!attributesEquipment.contains("agriequip18_nown"))
				//attributesEquipment.add("agriequip18_nown");
		}

		if(!view.getInteractivePanel().getSpinnerCountOthersUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip18_nown <= " + view.getInteractivePanel().getSpinnerCountOthersUpper().getValue().toString();

			equipmentTableAdder(tablesEquipment, OTHERS);
			//if(!attributesEquipment.contains("agriequip18_nown"))
				//attributesEquipment.add("agriequip18_nown");
		}

		// GROUP BY CLAUSE

		select += ", prov, mun, zone, brgy, purok";

		if(view.getInteractivePanel().getCheckBoxProvince().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "prov";

			//select += ", prov";
			geoTableAdder(tablesGeo, PROVINCE);
		}

		if(view.getInteractivePanel().getCheckBoxMunicipality().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "mun";

			//select += ", mun";
			geoTableAdder(tablesGeo, MUNICIPALITY);
		}

		if(view.getInteractivePanel().getCheckBoxZone().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "zone";

			//select += ", zone";
			geoTableAdder(tablesGeo, ZONE);
		}

		if(view.getInteractivePanel().getCheckBoxBarangay().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "brgy";

			//select += ", brgy";
			geoTableAdder(tablesGeo, BARANGAY);
		}

		if(view.getInteractivePanel().getCheckBoxPurok().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "purok";

			//select += ", purok";
			geoTableAdder(tablesGeo, PUROK);
		}

		if(view.getInteractivePanel().getCheckBoxIndustry().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "cropind";
			
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", cropind";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
		}

		if(view.getInteractivePanel().getCheckBoxARCDP().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "prog_arcdp";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", prog_arcdp";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
		}

		if(view.getInteractivePanel().getCheckBoxCropInsurance().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "irfa_crop";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", irfa_crop";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
		}

		if(view.getInteractivePanel().getCheckBoxAgriculturalInsurance().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "irfa_agriequip";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", irfa_agriequip";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
		}

		if(view.getInteractivePanel().getCheckBoxChangePrimaryCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_pcrop";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", u_chng_pcrop";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, PRIMARYCROP);
		}

		if(view.getInteractivePanel().getCheckBoxReasonChangePrimaryCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_pcrop_y";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", u_chng_pcrop_y";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, PRIMARYCROP);
		}

		if(view.getInteractivePanel().getCheckBoxChangeSameCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_scrop";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", u_chng_scrop";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, SAMECROP);
		}

		if(view.getInteractivePanel().getCheckBoxReasonChangeSameCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_scrop_y";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", u_chng_scrop_y";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, SAMECROP);
		}

		if(view.getInteractivePanel().getCheckBoxLowHarvest().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_low_harv";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", u_low_harv";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, LOWHARVEST);
		}

		if(view.getInteractivePanel().getCheckBoxWaterSupply().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "low_wsupp";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", low_wsupp";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, LOWWATER);
		}

		if(view.getInteractivePanel().getCheckBoxDrought().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "drought";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", drought";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, DROUGHT);
		}

		if(view.getInteractivePanel().getCheckBoxDuration().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "drought_duration";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", drought_duration";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, DROUGHT);
		}

		if(view.getInteractivePanel().getCheckBoxFlood().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "flood_freq";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", flood_freq";
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, FLOOD);
		}

		if(view.getInteractivePanel().getCheckBoxCropType().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "croptype";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", croptype";
			
			tablesCrop.add(CROPS);
		}

		if(view.getInteractivePanel().getCheckBoxBeastOfBurden().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip1";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip1";

			equipmentTableAdder(tablesEquipment, BEASTOFBURDEN);
		}

		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip1_nown";
		}

		if(view.getInteractivePanel().getCheckBoxPlow().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip2";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip2";

			equipmentTableAdder(tablesEquipment, PLOW);
		}

		if(!view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip2_nown";
		}

		if(view.getInteractivePanel().getCheckBoxHarrow().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip3";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip3";

			equipmentTableAdder(tablesEquipment, HARROW);
		}

		if(!view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip3_nown";
		}

		if(view.getInteractivePanel().getCheckBoxMower().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip4";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip4";

			equipmentTableAdder(tablesEquipment, MOWER);
		}

		if(!view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip4_nown";
		}

		if(view.getInteractivePanel().getCheckBoxThresher().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip5";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip5";

			equipmentTableAdder(tablesEquipment, THRESHER);
		}

		if(!view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip5_nown";
		}

		if(view.getInteractivePanel().getCheckBoxSprayer().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip6";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip6";

			equipmentTableAdder(tablesEquipment, INSECTICIDE);
		}

		if(!view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip6_nown";
		}

		if(view.getInteractivePanel().getCheckBoxFarmTractor().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip7";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip7";

			equipmentTableAdder(tablesEquipment, FARMTRACTOR);
		}

		if(!view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip7_nown";
		}

		if(view.getInteractivePanel().getCheckBoxHandTractor().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip8";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip8";

			equipmentTableAdder(tablesEquipment, HANDTRACTOR);
		}

		if(!view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip8_nown";
		}

		if(view.getInteractivePanel().getCheckBoxMudboat().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip9";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip9";

			equipmentTableAdder(tablesEquipment, MUDBOAT);
		}

		if(!view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip9_nown";
		}

		if(view.getInteractivePanel().getCheckBoxPlanter().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip10";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip10";

			equipmentTableAdder(tablesEquipment, PLANTER);
		}

		if(!view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip10_nown";
		}

		if(view.getInteractivePanel().getCheckBoxMechanicalDryer().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip11";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip11";

			equipmentTableAdder(tablesEquipment, MECHANICALDRYER);
		}

		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip11_nown";
		}

		if(view.getInteractivePanel().getCheckBoxDryingPavement().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip12";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip12";

			equipmentTableAdder(tablesEquipment, DRYINGPAVEMENT);
		}

		if(!view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip12_nown";
		}

		if(view.getInteractivePanel().getCheckBoxFeedMill().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip13";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip13";

			equipmentTableAdder(tablesEquipment, FEEDMILL);
		}

		if(!view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip13_nown";
		}

		if(view.getInteractivePanel().getCheckBoxHarvester().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip14";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip14";

			equipmentTableAdder(tablesEquipment, HARVESTER);
		}

		if(!view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip14_nown";
		}

		if(view.getInteractivePanel().getCheckBoxGranary().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip15";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip15";

			equipmentTableAdder(tablesEquipment, WAREHOUSEGRANARY);
		}

		if(!view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip15_nown";
		}

		if(view.getInteractivePanel().getCheckBoxFarmshed().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip16";
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip16";

			equipmentTableAdder(tablesEquipment, FARMSHED);
		}

		if(!view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip16_nown";
		}

		if(view.getInteractivePanel().getCheckBoxIrrigationPump().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip17";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip17";

			equipmentTableAdder(tablesEquipment, IRRIGATIONPUMP);
		}

		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip17_nown";
		}

		if(view.getInteractivePanel().getCheckBoxOthers().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip18";

			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip18";

			equipmentTableAdder(tablesEquipment, OTHERS);
		}

		if(!view.getInteractivePanel().getSpinnerCountOthersLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountOthersUpper().getValue().toString().equals("-1")){
			if(!view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice"))
				select += ", agriequip18_nown";
		}

		if(view.getInteractivePanel().getComboBoxOLAP().getSelectedIndex() != 0){
			groupby += " with rollup";
		}

		

		if(view.getInteractivePanel().getComboBoxOLAP().getSelectedItem().toString().equals("Slice/Dice")){
			//select += ", sum(crop_vol), sum(cropincsh), yrs_in_cropind ";
			/*if(attributesEquipment.isEmpty() && attributesAgriculturalStatus.isEmpty() && !attributesCrop.isEmpty()){
				for(String s : attributesCrop){
					select += ", " + s;
				}
				select += equipmentsSelect;
				select += agriculturalStatusSelect;
			} else if(attributesEquipment.isEmpty() && !attributesAgriculturalStatus.isEmpty() && attributesCrop.isEmpty()){
				for(String s : attributesAgriculturalStatus){
					select += ", " + s;
				}
				select += equipmentsSelect;
				select += cropsSelect;
			} else if(attributesEquipment.isEmpty() && !attributesAgriculturalStatus.isEmpty() && !attributesCrop.isEmpty()){
				for(String s : attributesAgriculturalStatus){
					select += ", " + s;
				}
				for(String s : attributesCrop){
					select += ", " + s;
				}
				select += equipmentsSelect;
			} else if(!attributesEquipment.isEmpty() && attributesAgriculturalStatus.isEmpty() && attributesCrop.isEmpty()){
				for(String s : attributesEquipment){
					select += ", " + s;
				}
				select += agriculturalStatusSelect;
				select += cropsSelect;
			} else if(!attributesEquipment.isEmpty() && attributesAgriculturalStatus.isEmpty() && !attributesCrop.isEmpty()){
				for(String s : attributesEquipment){
					select += ", " + s;
				}
				for(String s : attributesCrop){
					select += ", " + s;
				}
				select += agriculturalStatusSelect;
			} else if(!attributesEquipment.isEmpty() && !attributesAgriculturalStatus.isEmpty() && attributesCrop.isEmpty()){
				for(String s : attributesEquipment){
					select += ", " + s;
				}
				for(String s : attributesAgriculturalStatus){
					select += ", " + s;
				}
				select += cropsSelect;
			} else if(!attributesEquipment.isEmpty() && !attributesAgriculturalStatus.isEmpty() && !attributesCrop.isEmpty()){
				for(String s : attributesEquipment){
					select += ", " + s;
				}
				for(String s : attributesAgriculturalStatus){
					select += ", " + s;
				}
				for(String s : attributesCrop){
					select += ", " + s;
				}
			}*/
			select += cropsSelect;
			select += agriculturalStatusSelect;
			select += equipmentsSelect;
			
			from += "join " + CROPS + " on " + HOUSEHOLDAGRICULTURALLIVELIHOOD + ".CropID = " + CROPS + ".CropID ";
			
			from += "join " + AGRICULTURALSTATUS + " on " + HOUSEHOLDAGRICULTURALLIVELIHOOD + ".AgriculturalStatusID = " + AGRICULTURALSTATUS + ".AgriculturalStatusID ";
			from += "join " + CROPCHANGE + " on " + AGRICULTURALSTATUS + ".CropChangeID = " + CROPCHANGE + ".CropChangeID ";
			from += "join " + SAMECROP + " on " + CROPCHANGE + ".SameCropID = " + SAMECROP + ".SameCropID ";
			from += "join " + PRIMARYCROP + " on " + CROPCHANGE + ".PrimaryCropID = " + PRIMARYCROP + ".PrimaryCropID ";
			from += "join " + COMPLICATIONS + " on " + AGRICULTURALSTATUS + ".ComplicationID = " + COMPLICATIONS + ".ComplicationID ";
			from += "join " + DROUGHT + " on " + COMPLICATIONS + ".DroughtID = " + DROUGHT + ".DroughtID ";
			from += "join " + FLOOD + " on " + COMPLICATIONS + ".FloodID = " + FLOOD + ".FloodID ";
			from += "join " + LOWWATER + " on " + COMPLICATIONS + ".LowWaterID = " + LOWWATER + ".LowWaterID ";
			from += "join " + LOWHARVEST + " on " + COMPLICATIONS + ".LowHarvestID = " + LOWHARVEST + ".LowHarvestID ";
			
			from += "join " + EQUIPMENTS + " on " + HOUSEHOLDAGRICULTURALLIVELIHOOD + ".EquipmentID = " + EQUIPMENTS + ".EquipmentID ";
			from += "join " + BEASTOFBURDEN + " on " + EQUIPMENTS + ".BeastOfBurdenID = " + BEASTOFBURDEN + ".BeastOfBurdenID ";
			from += "join " + PLOW + " on " + EQUIPMENTS + ".PlowID = " + PLOW + ".PlowID ";
			from += "join " + HARROW + " on " + EQUIPMENTS + ".HarrowID = " + HARROW + ".HarrowID ";
			from += "join " + MOWER + " on " + EQUIPMENTS + ".MowerID = " + MOWER + ".MowerID ";
			from += "join " + THRESHER + " on " + EQUIPMENTS + ".ThresherID = " + THRESHER + ".ThresherID ";
			from += "join " + INSECTICIDE + " on " + EQUIPMENTS + ".InsecticideID = " + INSECTICIDE + ".InsecticideID ";
			from += "join " + FARMTRACTOR + " on " + EQUIPMENTS + ".FarmTractorID = " + FARMTRACTOR + ".FarmTractorID ";
			from += "join " + HANDTRACTOR + " on " + EQUIPMENTS + ".HandTractorID = " + HANDTRACTOR + ".HandTractorID ";
			from += "join " + MUDBOAT + " on " + EQUIPMENTS + ".MudboatID = " + MUDBOAT + ".MudboatID ";
			from += "join " + PLANTER + " on " + EQUIPMENTS + ".PlanterID = " + PLANTER + ".PlanterID ";
			from += "join " + MECHANICALDRYER + " on " + EQUIPMENTS + ".MechanicalDryerID = " + MECHANICALDRYER + ".MechanicalDryerID ";
			from += "join " + DRYINGPAVEMENT + " on " + EQUIPMENTS + ".DryingPavementID = " + DRYINGPAVEMENT + ".DryingPavementID ";
			from += "join " + FEEDMILL + " on " + EQUIPMENTS + ".FeedMillID = " + FEEDMILL + ".FeedMillID ";
			from += "join " + HARVESTER + " on " + EQUIPMENTS + ".HarvesterID = " + HARVESTER + ".HarvesterID ";
			from += "join " + WAREHOUSEGRANARY + " on " + EQUIPMENTS + ".WarehouseGranaryID = " + WAREHOUSEGRANARY + ".WarehouseGranaryID ";
			from += "join " + FARMSHED + " on " + EQUIPMENTS + ".FarmshedID = " + FARMSHED + ".FarmshedID ";
			from += "join " + IRRIGATIONPUMP + " on " + EQUIPMENTS + ".IrrigationPumpID = " + IRRIGATIONPUMP + ".IrrigationPumpID ";
			from += "join " + OTHERS + " on " + EQUIPMENTS + ".OthersID = " + OTHERS + ".OthersID ";
			
			groupby = appendGroupByChecker(groupby);
			groupby += "id, `hpq_crop.id`";
		}
		else{
			
			from = buildAgriculturalStatus(tablesAgriculturalStatus, from);
			from = buildEquipment(tablesEquipment, from);
			from = buildCrops(tablesCrop, from);
			
			select = "select " + select.substring(11);
			select += ", sum(crop_vol), sum(cropincsh) ";
		}

		return select + from + where + groupby;
	}

	private void changeUpperBound(JSpinner lowerSpinner, JSpinner upperSpinner) {
		int lower = Integer.parseInt(lowerSpinner.getValue().toString());
		int upper = Integer.parseInt(upperSpinner.getValue().toString());
		if (lower > upper)
			upperSpinner.setValue(lower);
	}

	private void changeLowerBound(JSpinner lowerSpinner, JSpinner upperSpinner) {
		int lower = Integer.parseInt(lowerSpinner.getValue().toString());
		int upper = Integer.parseInt(upperSpinner.getValue().toString());
		if (upper < lower)
			lowerSpinner.setValue(upper);
	}

	private String appendWhereChecker(String sql) {
		String query = sql;
		if (!query.contains("where"))
			query += " where ";
		else
			query += " and ";
		return query;
	}

	private String appendGroupByChecker(String sql) {
		String query = sql;
		if (!query.contains("group by"))
			query += " group by ";
		else
			query += ", ";

		return query;
	}

	private void geoTableAdder(ArrayList<String> tables, String root){
		if(root.equals(PROVINCE)){
			if(!tables.contains(PROVINCE))
				tables.add(PROVINCE);
			if(!tables.contains(MUNICIPALITY))
				tables.add(MUNICIPALITY);
			if(!tables.contains(ZONE))
				tables.add(ZONE);
			if(!tables.contains(BARANGAY))
				tables.add(BARANGAY);
			if(!tables.contains(PUROK))
				tables.add(PUROK);
		} else if(root.equals(MUNICIPALITY)){
			if(!tables.contains(MUNICIPALITY))
				tables.add(MUNICIPALITY);
			if(!tables.contains(ZONE))
				tables.add(ZONE);
			if(!tables.contains(BARANGAY))
				tables.add(BARANGAY);
			if(!tables.contains(PUROK))
				tables.add(PUROK);
		} else if(root.equals(ZONE)){
			if(!tables.contains(ZONE))
				tables.add(ZONE);
			if(!tables.contains(BARANGAY))
				tables.add(BARANGAY);
			if(!tables.contains(PUROK))
				tables.add(PUROK);
		} else if(root.equals(BARANGAY)){
			if(!tables.contains(BARANGAY))
				tables.add(BARANGAY);
			if(!tables.contains(PUROK))
				tables.add(PUROK);
		} else if(root.contains(PUROK)){
			if(!tables.contains(PUROK))
				tables.add(PUROK);
		}
	}

	private void agriculturalStatusTableAdder(ArrayList<String> tables, String root){
		if(root.equals(SAMECROP)){
			if(!tables.contains(SAMECROP))
				tables.add(SAMECROP);
			if(!tables.contains(CROPCHANGE))
				tables.add(CROPCHANGE);
			if(!tables.contains(AGRICULTURALSTATUS))
				tables.add(AGRICULTURALSTATUS);
		} else if(root.equals(PRIMARYCROP)){
			if(!tables.contains(PRIMARYCROP))
				tables.add(PRIMARYCROP);
			if(!tables.contains(CROPCHANGE))
				tables.add(CROPCHANGE);
			if(!tables.contains(AGRICULTURALSTATUS))
				tables.add(AGRICULTURALSTATUS);
		} else if(root.equals(LOWHARVEST)){
			if(!tables.contains(LOWHARVEST))
				tables.add(LOWHARVEST);
			if(!tables.contains(COMPLICATIONS))
				tables.add(COMPLICATIONS);
			if(!tables.contains(AGRICULTURALSTATUS))
				tables.add(AGRICULTURALSTATUS);
		} else if(root.equals(LOWWATER)){
			if(!tables.contains(LOWWATER))
				tables.add(LOWWATER);
			if(!tables.contains(COMPLICATIONS))
				tables.add(COMPLICATIONS);
			if(!tables.contains(AGRICULTURALSTATUS))
				tables.add(AGRICULTURALSTATUS);
		} else if(root.equals(FLOOD)){
			if(!tables.contains(FLOOD))
				tables.add(FLOOD);
			if(!tables.contains(COMPLICATIONS))
				tables.add(COMPLICATIONS);
			if(!tables.contains(AGRICULTURALSTATUS))
				tables.add(AGRICULTURALSTATUS);
		} else if(root.equals(DROUGHT)){
			if(!tables.contains(DROUGHT))
				tables.add(DROUGHT);
			if(!tables.contains(COMPLICATIONS))
				tables.add(COMPLICATIONS);
			if(!tables.contains(AGRICULTURALSTATUS))
				tables.add(AGRICULTURALSTATUS);
		} else if(root.equals(AGRICULTURALSTATUS)){
			tables.add(AGRICULTURALSTATUS);
		}
	}

	private void equipmentTableAdder(ArrayList<String> tables, String root){
		if(root.equals(BEASTOFBURDEN)){
			if(!tables.contains(BEASTOFBURDEN))
				tables.add(BEASTOFBURDEN);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(PLOW)){
			if(!tables.contains(PLOW))
				tables.add(PLOW);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(HARROW)){
			if(!tables.contains(HARROW))
				tables.add(HARROW);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(MOWER)){
			if(!tables.contains(MOWER))
				tables.add(MOWER);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(THRESHER)){
			if(!tables.contains(THRESHER))
				tables.add(THRESHER);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(INSECTICIDE)){
			if(!tables.contains(INSECTICIDE))
				tables.add(INSECTICIDE);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(FARMTRACTOR)){
			if(!tables.contains(FARMTRACTOR))
				tables.add(FARMTRACTOR);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(HANDTRACTOR)){
			if(!tables.contains(HANDTRACTOR))
				tables.add(HANDTRACTOR);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(MUDBOAT)){
			if(!tables.contains(MUDBOAT))
				tables.add(MUDBOAT);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(PLANTER)){
			if(!tables.contains(PLANTER))
				tables.add(PLANTER);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(MECHANICALDRYER)){
			if(!tables.contains(MECHANICALDRYER))
				tables.add(MECHANICALDRYER);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(DRYINGPAVEMENT)){
			if(!tables.contains(DRYINGPAVEMENT))
				tables.add(DRYINGPAVEMENT);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(FEEDMILL)){
			if(!tables.contains(FEEDMILL))
				tables.add(FEEDMILL);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(HARVESTER)){
			if(!tables.contains(HARVESTER))
				tables.add(HARVESTER);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(WAREHOUSEGRANARY)){
			if(!tables.contains(WAREHOUSEGRANARY))
				tables.add(WAREHOUSEGRANARY);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(FARMSHED)){
			if(!tables.contains(FARMSHED))
				tables.add(FARMSHED);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(IRRIGATIONPUMP)){
			if(!tables.contains(IRRIGATIONPUMP))
				tables.add(IRRIGATIONPUMP);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}

		else if(root.equals(OTHERS)){
			if(!tables.contains(OTHERS))
				tables.add(OTHERS);
			if(!tables.contains(EQUIPMENTS))
				tables.add(EQUIPMENTS);
		}
	}

	private String buildCrops(ArrayList<String> tables, String fromClause){
		String from = fromClause;
		if(tables.contains(CROPS)){
			from += "join " + CROPS + " on " + HOUSEHOLDAGRICULTURALLIVELIHOOD + ".CropID = " + CROPS + ".CropID ";
		}
		return from;
	}

	private String buildAgriculturalStatus(ArrayList<String> tables, String fromClause){
		String from = fromClause;
		if(!tables.isEmpty()){
			from += "join " + AGRICULTURALSTATUS + " on " + HOUSEHOLDAGRICULTURALLIVELIHOOD + ".AgriculturalStatusID = " + AGRICULTURALSTATUS + ".AgriculturalStatusID ";
			if(tables.contains(SAMECROP) || tables.contains(PRIMARYCROP)){
				from += "join " + CROPCHANGE + " on " + AGRICULTURALSTATUS + ".CropChangeID = " + CROPCHANGE + ".CropChangeID ";
				if(tables.contains(SAMECROP)){
					from += "join " + SAMECROP + " on " + CROPCHANGE + ".SameCropID = " + SAMECROP + ".SameCropID ";
				}

				if(tables.contains(PRIMARYCROP)){
					from += "join " + PRIMARYCROP + " on " + CROPCHANGE + ".PrimaryCropID = " + PRIMARYCROP + ".PrimaryCropID ";
				}
			}

			if(tables.contains(DROUGHT) || tables.contains(FLOOD) || tables.contains(LOWWATER) || tables.contains(LOWHARVEST)){
				from += "join " + COMPLICATIONS + " on " + AGRICULTURALSTATUS + ".ComplicationID = " + COMPLICATIONS + ".ComplicationID ";
				if(tables.contains(DROUGHT)){
					from += "join " + DROUGHT + " on " + COMPLICATIONS + ".DroughtID = " + DROUGHT + ".DroughtID ";
				}

				if(tables.contains(FLOOD)){
					from += "join " + FLOOD + " on " + COMPLICATIONS + ".FloodID = " + FLOOD + ".FloodID ";
				}

				if(tables.contains(LOWWATER)){
					from += "join " + LOWWATER + " on " + COMPLICATIONS + ".LowWaterID = " + LOWWATER + ".LowWaterID ";
				}

				if(tables.contains(LOWHARVEST)){
					from += "join " + LOWHARVEST + " on " + COMPLICATIONS + ".LowHarvestID = " + LOWHARVEST + ".LowHarvestID ";
				}
			}
		}
		return from;
	}

	private String buildEquipment(ArrayList<String> tables, String fromClause){
		String from = fromClause;
		if(!tables.isEmpty()){
			from += "join " + EQUIPMENTS + " on " + HOUSEHOLDAGRICULTURALLIVELIHOOD + ".EquipmentID = " + EQUIPMENTS + ".EquipmentID ";

			if(tables.contains(BEASTOFBURDEN)){
				from += "join " + BEASTOFBURDEN + " on " + EQUIPMENTS + ".BeastOfBurdenID = " + BEASTOFBURDEN + ".BeastOfBurdenID ";
			}

			if(tables.contains(PLOW)){
				from += "join " + PLOW + " on " + EQUIPMENTS + ".PlowID = " + PLOW + ".PlowID ";
			}

			if(tables.contains(HARROW)){
				from += "join " + HARROW + " on " + EQUIPMENTS + ".HarrowID = " + HARROW + ".HarrowID ";
			}

			if(tables.contains(MOWER)){
				from += "join " + MOWER + " on " + EQUIPMENTS + ".MowerID = " + MOWER + ".MowerID ";
			}

			if(tables.contains(THRESHER)){
				from += "join " + THRESHER + " on " + EQUIPMENTS + ".ThresherID = " + THRESHER + ".ThresherID ";
			}

			if(tables.contains(INSECTICIDE)){
				from += "join " + INSECTICIDE + " on " + EQUIPMENTS + ".InsecticideID = " + INSECTICIDE + ".InsecticideID ";
			}

			if(tables.contains(FARMTRACTOR)){
				from += "join " + FARMTRACTOR + " on " + EQUIPMENTS + ".FarmTractorID = " + FARMTRACTOR + ".FarmTractorID ";
			}

			if(tables.contains(HANDTRACTOR)){
				from += "join " + HANDTRACTOR + " on " + EQUIPMENTS + ".HandTractorID = " + HANDTRACTOR + ".HandTractorID ";
			}

			if(tables.contains(MUDBOAT)){
				from += "join " + MUDBOAT + " on " + EQUIPMENTS + ".MudboatID = " + MUDBOAT + ".MudboatID ";
			}

			if(tables.contains(PLANTER)){
				from += "join " + PLANTER + " on " + EQUIPMENTS + ".PlanterID = " + PLANTER + ".PlanterID ";
			}

			if(tables.contains(MECHANICALDRYER)){
				from += "join " + MECHANICALDRYER + " on " + EQUIPMENTS + ".MechanicalDryerID = " + MECHANICALDRYER + ".MechanicalDryerID ";
			}

			if(tables.contains(DRYINGPAVEMENT)){
				from += "join " + DRYINGPAVEMENT + " on " + EQUIPMENTS + ".DryingPavementID = " + DRYINGPAVEMENT + ".DryingPavementID ";
			}
			
			if(tables.contains(FEEDMILL)){
				from += "join " + FEEDMILL + " on " + EQUIPMENTS + ".FeedMillID = " + FEEDMILL + ".FeedMillID ";
			}

			if(tables.contains(HARVESTER)){
				from += "join " + HARVESTER + " on " + EQUIPMENTS + ".HarvesterID = " + HARVESTER + ".HarvesterID ";
			}

			if(tables.contains(WAREHOUSEGRANARY)){
				from += "join " + WAREHOUSEGRANARY + " on " + EQUIPMENTS + ".WarehouseGranaryID = " + WAREHOUSEGRANARY + ".WarehouseGranaryID ";
			}

			if(tables.contains(FARMSHED)){
				from += "join " + FARMSHED + " on " + EQUIPMENTS + ".FarmshedID = " + FARMSHED + ".FarmshedID ";
			}

			if(tables.contains(IRRIGATIONPUMP)){
				from += "join " + IRRIGATIONPUMP + " on " + EQUIPMENTS + ".IrrigationPumpID = " + IRRIGATIONPUMP + ".IrrigationPumpID ";
			}

			if(tables.contains(OTHERS)){
				from += "join " + OTHERS + " on " + EQUIPMENTS + ".OthersID = " + OTHERS + ".OthersID ";
			}
		}
		return from;
	}
}
