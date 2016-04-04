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
	private final String COMPLICATIONS = "complications";
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
	private final String OTHERS = "others";
	
	private ArrayList<String> tablesGeo;
	private ArrayList<String> tablesEquipment;
	private ArrayList<String> tablesAgriculturalStatus;
	private ArrayList<String> tablesCrop;
	
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
				String query = queryBuilder();
				System.out.println(query);
				
				long startTime = System.nanoTime();
				facadeDatabase.getResult(query, modelTable);
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
		from += "join " + PROVINCE + " on " + MUNICIPALITY + ".ProvinceID = " + PROVINCE + ".ProvinceID";
		
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
		}
		
		if(view.getInteractivePanel().getComboBoxARCDP().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxARCDP().getSelectedItem().toString().equals("Yes"))
				where += "prog_arcdp = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxARCDP().getSelectedItem().toString().equals("No"))
				where += "prog_arcdp = " + FALSE;
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
		}
		
		if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedItem().toString().equals("Yes"))
				where += "irfa_crop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedItem().toString().equals("No"))
				where += "irfa_crop = " + FALSE;
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
		}
		
		if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedItem().toString().equals("Yes"))
				where += "irfa_agriequip = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedItem().toString().equals("No"))
				where += "irfa_agriequip = " + FALSE;
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
		}
		
		if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Yes"))
				where += "u_chng_pcrop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("No"))
				where += "u_chng_pcrop = " + FALSE;
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, PRIMARYCROP);
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
		}
		
		if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Yes"))
				where += "u_chng_scrop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("No"))
				where += "u_chng_scrop = " + FALSE;
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, SAMECROP);
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
		}
		
		if(view.getInteractivePanel().getComboBoxDrought().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxDrought().getSelectedItem().toString().equals("Yes")){
				where += "drought = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxDrought().getSelectedItem().toString().equals("No")){
				where += "drought = " + FALSE;
			}
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, DROUGHT);
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
		}
		
		if(view.getInteractivePanel().getComboBoxFlood().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFlood().getSelectedItem().toString().equals("Yes")){
				where += "flood_freq = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFlood().getSelectedItem().toString().equals("No")){
				where += "flood_freq = " + FALSE;
			}
			
			agriculturalStatusTableAdder(tablesAgriculturalStatus, FLOOD);
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
		}
		
		if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedItem().toString().equals("Owned")){
				where += "agriequip1 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip1 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, BEASTOFBURDEN);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip1_nown > " + view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, BEASTOFBURDEN);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip1_nown <= " + view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, BEASTOFBURDEN);
		}
		
		if(view.getInteractivePanel().getComboBoxPlow().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxPlow().getSelectedItem().toString().equals("Owned")){
				where += "agriequip2 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxPlow().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip2 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, PLOW);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip2_nown > " + view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, PLOW);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip2_nown <= " + view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, PLOW);
		}
		
		if(view.getInteractivePanel().getComboBoxHarrow().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxHarrow().getSelectedItem().toString().equals("Owned")){
				where += "agriequip3 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHarrow().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip3 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, HARROW);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip3_nown > " + view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, HARROW);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip3_nown <= " + view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, HARROW);
		}
		
		if(view.getInteractivePanel().getComboBoxMower().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxMower().getSelectedItem().toString().equals("Owned")){
				where += "agriequip4 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMower().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip4 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, MOWER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip4_nown > " + view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, MOWER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip4_nown <= " + view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, MOWER);
		}
		
		if(view.getInteractivePanel().getComboBoxThresher().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxThresher().getSelectedItem().toString().equals("Owned")){
				where += "agriequip5 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxThresher().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip5 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, THRESHER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip5_nown > " + view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, THRESHER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip5_nown <= " + view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, THRESHER);
		}
		
		if(view.getInteractivePanel().getComboBoxSprayer().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxSprayer().getSelectedItem().toString().equals("Owned")){
				where += "agriequip6 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxSprayer().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip6 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, INSECTICIDE);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip6_nown > " + view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, INSECTICIDE);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip6_nown <= " + view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, INSECTICIDE);
		}
		
		if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedItem().toString().equals("Owned")){
				where += "agriequip7 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip7 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, FARMTRACTOR);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip7_nown > " + view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, FARMTRACTOR);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip7_nown <= " + view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, FARMTRACTOR);
		}
		
		if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedItem().toString().equals("Owned")){
				where += "agriequip8 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip8 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, HANDTRACTOR);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip8_nown > " + view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, HANDTRACTOR);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip8_nown <= " + view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, HANDTRACTOR);
		}
		
		if(view.getInteractivePanel().getComboBoxMudboat().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxMudboat().getSelectedItem().toString().equals("Owned")){
				where += "agriequip9 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMudboat().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip9 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, MUDBOAT);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip9_nown > " + view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, MUDBOAT);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip9_nown <= " + view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, MUDBOAT);
		}
		
		if(view.getInteractivePanel().getComboBoxPlanter().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxPlanter().getSelectedItem().toString().equals("Owned")){
				where += "agriequip10 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxPlanter().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip10 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, PLANTER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip10_nown > " + view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, PLANTER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip10_nown <= " + view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, PLANTER);
		}
		
		if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedItem().toString().equals("Owned")){
				where += "agriequip11 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip11 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, MECHANICALDRYER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip11_nown > " + view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, MECHANICALDRYER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip11_nown <= " + view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString();
			
			equipmentTableAdder(tablesEquipment, MECHANICALDRYER);
		}
		
		if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedItem().toString().equals("Owned")){
				where += "agriequip12 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip12 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, DRYINGPAVEMENT);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip12_nown > " + view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, DRYINGPAVEMENT);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip12_nown <= " + view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, DRYINGPAVEMENT);
		}
		
		if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedItem().toString().equals("Owned")){
				where += "agriequip13 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip13 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, FEEDMILL);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip13_nown > " + view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, FEEDMILL);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip13_nown <= " + view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, FEEDMILL);
		}
		
		if(view.getInteractivePanel().getComboBoxHarvester().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxHarvester().getSelectedItem().toString().equals("Owned")){
				where += "agriequip14 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHarvester().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip14 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, HARVESTER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip14_nown > " + view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, HARVESTER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip14_nown <= " + view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, HARVESTER);
		}
		
		if(view.getInteractivePanel().getComboBoxGranary().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxGranary().getSelectedItem().toString().equals("Owned")){
				where += "agriequip15 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxGranary().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip15 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, WAREHOUSEGRANARY);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip15_nown > " + view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, WAREHOUSEGRANARY);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip15_nown <= " + view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, WAREHOUSEGRANARY);
		}
		
		if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedItem().toString().equals("Owned")){
				where += "agriequip16 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip16 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, FARMSHED);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip16_nown > " + view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, FARMSHED);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip16_nown <= " + view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, FARMSHED);
		}
		
		if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedItem().toString().equals("Owned")){
				where += "agriequip17 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip17 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, IRRIGATIONPUMP);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip17_nown > " + view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, IRRIGATIONPUMP);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip17_nown <= " + view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, IRRIGATIONPUMP);
		}
		
		if(view.getInteractivePanel().getComboBoxOthers().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxOthers().getSelectedItem().toString().equals("Owned")){
				where += "agriequip18 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxOthers().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip18 = " + FALSE;
			}
			
			equipmentTableAdder(tablesEquipment, OTHERS);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountOthersLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip18_nown > " + view.getInteractivePanel().getSpinnerCountOthersLower().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, OTHERS);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountOthersUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip18_nown <= " + view.getInteractivePanel().getSpinnerCountOthersUpper().getValue().toString();
		
			equipmentTableAdder(tablesEquipment, OTHERS);
		}
		
		// GROUP BY CLAUSE
		
		if(view.getInteractivePanel().getCheckBoxProvince().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "prov";
			
			select += ", prov";
			geoTableAdder(tablesGeo, PROVINCE);
		}
		
		if(view.getInteractivePanel().getCheckBoxMunicipality().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "mun";
			
			select += ", mun";
			geoTableAdder(tablesGeo, MUNICIPALITY);
		}
		
		if(view.getInteractivePanel().getCheckBoxZone().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "zone";
			
			select += ", zone";
			geoTableAdder(tablesGeo, ZONE);
		}
		
		if(view.getInteractivePanel().getCheckBoxBarangay().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "brgy";
			
			select += ", brgy";
			geoTableAdder(tablesGeo, BARANGAY);
		}
		
		if(view.getInteractivePanel().getCheckBoxPurok().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "purok";
			
			select += ", purok";
			geoTableAdder(tablesGeo, PUROK);
		}
		
		if(view.getInteractivePanel().getCheckBoxIndustry().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "cropind";
			
			select += ", cropind";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
		}
		
		if(view.getInteractivePanel().getCheckBoxARCDP().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "prog_arcdp";
			
			select += ", prog_arcdp";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
		}
		
		if(view.getInteractivePanel().getCheckBoxCropInsurance().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "irfa_crop";
			
			select += ", irfa_crop";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
		}
		
		if(view.getInteractivePanel().getCheckBoxAgriculturalInsurance().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "irfa_agriequip";
			
			select += ", irfa_agriequip";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, AGRICULTURALSTATUS);
		}
		
		if(view.getInteractivePanel().getCheckBoxChangePrimaryCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_pcrop";
			
			select += ", u_chng_pcrop";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, PRIMARYCROP);
		}
		
		if(view.getInteractivePanel().getCheckBoxReasonChangePrimaryCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_pcrop_y";
			
			select += ", u_chng_pcrop_y";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, PRIMARYCROP);
		}
		
		if(view.getInteractivePanel().getCheckBoxChangeSameCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_scrop";
			
			select += ", u_chng_scrop";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, SAMECROP);
		}
		
		if(view.getInteractivePanel().getCheckBoxReasonChangeSameCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_scrop_y";
			
			select += ", u_chng_scrop_y";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, SAMECROP);
		}
		
		if(view.getInteractivePanel().getCheckBoxLowHarvest().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_low_harv";
			
			select += ", u_low_harv";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, LOWHARVEST);
		}
		
		if(view.getInteractivePanel().getCheckBoxWaterSupply().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "low_wsupp";
			
			select += ", low_wsupp";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, LOWWATER);
		}
		
		if(view.getInteractivePanel().getCheckBoxDrought().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "drought";
			
			select += ", drought";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, DROUGHT);
		}
		
		if(view.getInteractivePanel().getCheckBoxDuration().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "drought_duration";
			
			select += ", drought_duration";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, DROUGHT);
		}
		
		if(view.getInteractivePanel().getCheckBoxFlood().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "flood_freq";
			
			select += ", flood_freq";
			agriculturalStatusTableAdder(tablesAgriculturalStatus, FLOOD);
		}
		
		if(view.getInteractivePanel().getCheckBoxCropType().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "croptype";
			
			select += ", croptype";
			tablesCrop.add(CROPS);
		}
		
		if(view.getInteractivePanel().getCheckBoxBeastOfBurden().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip1";
			
			select += ", agriequip1";
			
			equipmentTableAdder(tablesEquipment, BEASTOFBURDEN);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString().equals("-1")){
				select += ", agriequip1_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxPlow().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip2";
			
			select += ", agriequip2";
			
			equipmentTableAdder(tablesEquipment, PLOW);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString().equals("-1")){
				select += ", agriequip2_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxHarrow().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip3";
			
			select += ", agriequip3";
			
			equipmentTableAdder(tablesEquipment, HARROW);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString().equals("-1")){
				select += ", agriequip3_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxMower().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip4";
			
			select += ", agriequip4";
			
			equipmentTableAdder(tablesEquipment, MOWER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString().equals("-1")){
				select += ", agriequip4_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxThresher().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip5";
			
			select += ", agriequip5";
			
			equipmentTableAdder(tablesEquipment, THRESHER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString().equals("-1")){
				select += ", agriequip5_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxSprayer().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip6";
			
			select += ", agriequip6";
			
			equipmentTableAdder(tablesEquipment, INSECTICIDE);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString().equals("-1")){
				select += ", agriequip6_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxFarmTractor().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip7";
			
			select += ", agriequip7";
			
			equipmentTableAdder(tablesEquipment, FARMTRACTOR);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString().equals("-1")){
				select += ", agriequip7_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxHandTractor().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip8";
			
			select += ", agriequip8";
			
			equipmentTableAdder(tablesEquipment, HANDTRACTOR);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString().equals("-1")){
				select += ", agriequip8_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxMudboat().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip9";
			
			select += ", agriequip9";
			
			equipmentTableAdder(tablesEquipment, MUDBOAT);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString().equals("-1")){
				select += ", agriequip9_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxPlanter().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip10";
			
			select += ", agriequip10";
			
			equipmentTableAdder(tablesEquipment, PLANTER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString().equals("-1")){
				select += ", agriequip10_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxMechanicalDryer().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip11";
			
			select += ", agriequip11";
			
			equipmentTableAdder(tablesEquipment, MECHANICALDRYER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString().equals("-1")){
				select += ", agriequip11_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxDryingPavement().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip12";
			
			select += ", agriequip12";
			
			equipmentTableAdder(tablesEquipment, DRYINGPAVEMENT);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString().equals("-1")){
				select += ", agriequip12_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxFeedMill().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip13";
			
			select += ", agriequip13";
			
			equipmentTableAdder(tablesEquipment, FEEDMILL);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString().equals("-1")){
				select += ", agriequip13_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxHarvester().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip14";
			
			select += ", agriequip14";
			
			equipmentTableAdder(tablesEquipment, HARVESTER);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString().equals("-1")){
				select += ", agriequip14_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxGranary().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip15";
			
			select += ", agriequip15";
			
			equipmentTableAdder(tablesEquipment, WAREHOUSEGRANARY);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString().equals("-1")){
				select += ", agriequip15_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxFarmshed().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip16";
			
			select += ", agriequip16";
			
			equipmentTableAdder(tablesEquipment, FARMSHED);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString().equals("-1")){
				select += ", agriequip16_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxIrrigationPump().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip17";
			
			select += ", agriequip17";
			
			equipmentTableAdder(tablesEquipment, IRRIGATIONPUMP);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString().equals("-1")){
				select += ", agriequip17_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxOthers().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip18";
			
			select += ", agriequip18";
			
			equipmentTableAdder(tablesEquipment, OTHERS);
		}
		
		if(!view.getInteractivePanel().getSpinnerCountOthersLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountOthersUpper().getValue().toString().equals("-1")){
				select += ", agriequip18_nown";
		}
		
		if(view.getInteractivePanel().getComboBoxOLAP().getSelectedIndex() != 0){
			groupby += " with rollup";
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
			tables.contains(AGRICULTURALSTATUS);
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
}
