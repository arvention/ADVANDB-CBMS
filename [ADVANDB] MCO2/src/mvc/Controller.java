package mvc;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import database.FacadeDatabase;

public class Controller {
	private static final Controller controller = new Controller(View.getInstance(), ModelTable.getInstance(),
			FacadeDatabase.getInstance());
	
	private final String TRUE = "1";
	private final String FALSE = "2";

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
		String from = " from "; // add fact table later
		String where = "";
		String groupby = "";
		
		// WHERE CLAUSE
		if(view.getInteractivePanel().getComboBoxProvince().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			where += "prov = " + view.getInteractivePanel().getComboBoxProvince().getSelectedItem().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxMunicipality().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			where += "mun = " + view.getInteractivePanel().getComboBoxProvince().getSelectedItem().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxZone().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			where += "zone = " + view.getInteractivePanel().getComboBoxZone().getSelectedItem().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxBarangay().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			where += "brgy = " + view.getInteractivePanel().getComboBoxBarangay().getSelectedItem().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxPurok().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			where += "purok = " + view.getInteractivePanel().getComboBoxPurok().getSelectedItem().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxIndustry().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxIndustry().getSelectedItem().toString().equals("Yes"))
				where += "cropind = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxIndustry().getSelectedItem().toString().equals("No"))
				where += "cropind = " + FALSE;
		}
		
		if(view.getInteractivePanel().getComboBoxARCDP().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxARCDP().getSelectedItem().toString().equals("Yes"))
				where += "prog_arcdp = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxARCDP().getSelectedItem().toString().equals("No"))
				where += "prog_arcdp = " + FALSE;
		}
		
		if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedItem().toString().equals("Yes"))
				where += "irfa_crop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedItem().toString().equals("No"))
				where += "irfa_crop = " + FALSE;
		}
		
		if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedItem().toString().equals("Yes"))
				where += "irfa_agriequip = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedItem().toString().equals("No"))
				where += "irfa_agriequip = " + FALSE;
		}
		
		if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Yes"))
				where += "u_chng_pcrop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("No"))
				where += "u_chng_pcrop = " + FALSE;
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
		}
		
		if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Yes"))
				where += "u_chng_scrop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("No"))
				where += "u_chng_scrop = " + FALSE;
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
		}
		
		if(view.getInteractivePanel().getComboBoxDrought().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxDrought().getSelectedItem().toString().equals("Yes")){
				where += "drought = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxDrought().getSelectedItem().toString().equals("No")){
				where += "drought = " + FALSE;
			}
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
		}
		
		if(view.getInteractivePanel().getComboBoxFlood().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFlood().getSelectedItem().toString().equals("Yes")){
				where += "flood_freq = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFlood().getSelectedItem().toString().equals("No")){
				where += "flood_freq = " + FALSE;
			}
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
		}
		
		if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedItem().toString().equals("Owned")){
				where += "agriequip1 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip1 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip1_nown > " + view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip1_nown <= " + view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxPlow().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxPlow().getSelectedItem().toString().equals("Owned")){
				where += "agriequip2 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxPlow().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip2 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip2_nown > " + view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip2_nown <= " + view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxHarrow().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxHarrow().getSelectedItem().toString().equals("Owned")){
				where += "agriequip3 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHarrow().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip3 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip3_nown > " + view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip3_nown <= " + view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxMower().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxMower().getSelectedItem().toString().equals("Owned")){
				where += "agriequip4 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMower().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip4 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip4_nown > " + view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip4_nown <= " + view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxThresher().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxThresher().getSelectedItem().toString().equals("Owned")){
				where += "agriequip5 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxThresher().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip5 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip5_nown > " + view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip5_nown <= " + view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxSprayer().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxSprayer().getSelectedItem().toString().equals("Owned")){
				where += "agriequip6 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxSprayer().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip6 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip6_nown > " + view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip6_nown <= " + view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedItem().toString().equals("Owned")){
				where += "agriequip7 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip7 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip7_nown > " + view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip7_nown <= " + view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedItem().toString().equals("Owned")){
				where += "agriequip8 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip8 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip8_nown > " + view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip8_nown <= " + view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxMudboat().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxMudboat().getSelectedItem().toString().equals("Owned")){
				where += "agriequip9 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMudboat().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip9 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip9_nown > " + view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip9_nown <= " + view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString();	
		}
		
		if(view.getInteractivePanel().getComboBoxPlanter().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxPlanter().getSelectedItem().toString().equals("Owned")){
				where += "agriequip10 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxPlanter().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip10 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip10_nown > " + view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip10_nown <= " + view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedItem().toString().equals("Owned")){
				where += "agriequip11 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip11 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip11_nown > " + view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip11_nown <= " + view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedItem().toString().equals("Owned")){
				where += "agriequip12 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip12 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip12_nown > " + view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip12_nown <= " + view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedItem().toString().equals("Owned")){
				where += "agriequip13 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip13 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip13_nown > " + view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip13_nown <= " + view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxHarvester().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxHarvester().getSelectedItem().toString().equals("Owned")){
				where += "agriequip14 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHarvester().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip14 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip14_nown > " + view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip14_nown <= " + view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxGranary().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxGranary().getSelectedItem().toString().equals("Owned")){
				where += "agriequip15 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxGranary().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip15 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip15_nown > " + view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip15_nown <= " + view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedItem().toString().equals("Owned")){
				where += "agriequip16 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip16 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip16_nown > " + view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip16_nown <= " + view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedItem().toString().equals("Owned")){
				where += "agriequip17 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip17 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip17_nown > " + view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip17_nown <= " + view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxOthers().getSelectedIndex() != 0){
			where = appendWhereChecker(where);
			if(view.getInteractivePanel().getComboBoxOthers().getSelectedItem().toString().equals("Owned")){
				where += "agriequip18 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxOthers().getSelectedItem().toString().equals("Not Owned")){
				where += "agriequip18 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountOthersLower().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip18_nown > " + view.getInteractivePanel().getSpinnerCountOthersLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountOthersUpper().getValue().toString().equals("-1")){
			where = appendWhereChecker(where);
			where += "agriequip18_nown <= " + view.getInteractivePanel().getSpinnerCountOthersUpper().getValue().toString();
		}
		
		// GROUP BY CLAUSE
		
		if(view.getInteractivePanel().getCheckBoxProvince().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "prov";
			
			select += ", prov";
		}
		
		if(view.getInteractivePanel().getCheckBoxMunicipality().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "mun";
			
			select += ", mun";
		}
		
		if(view.getInteractivePanel().getCheckBoxZone().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "zone";
			
			select += ", zone";
		}
		
		if(view.getInteractivePanel().getCheckBoxBarangay().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "brgy";
			
			select += ", brgy";
		}
		
		if(view.getInteractivePanel().getCheckBoxPurok().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "purok";
			
			select += ", purok";
		}
		
		if(view.getInteractivePanel().getCheckBoxIndustry().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "cropind";
			
			select += ", cropind";
		}
		
		if(view.getInteractivePanel().getCheckBoxARCDP().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "prog_arcdp";
			
			select += ", prog_arcdp";
		}
		
		if(view.getInteractivePanel().getCheckBoxCropInsurance().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "irfa_crop";
			
			select += ", irfa_crop";
		}
		
		if(view.getInteractivePanel().getCheckBoxAgriculturalInsurance().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "irfa_agriequip";
			
			select += ", irfa_agriequip";
		}
		
		if(view.getInteractivePanel().getCheckBoxChangePrimaryCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_pcrop";
			
			select += ", u_chng_pcrop";
		}
		
		if(view.getInteractivePanel().getCheckBoxReasonChangePrimaryCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_pcrop_y";
			
			select += ", u_chng_pcrop_y";
		}
		
		if(view.getInteractivePanel().getCheckBoxChangeSameCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_scrop";
			
			select += ", u_chng_scrop";
		}
		
		if(view.getInteractivePanel().getCheckBoxReasonChangeSameCrop().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_chng_scrop_y";
			
			select += ", u_chng_scrop_y";
		}
		
		if(view.getInteractivePanel().getCheckBoxLowHarvest().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "u_low_harv";
			
			select += ", u_low_harv";
		}
		
		if(view.getInteractivePanel().getCheckBoxWaterSupply().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "low_wsupp";
			
			select += ", low_wsupp";
		}
		
		if(view.getInteractivePanel().getCheckBoxDrought().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "drought";
			
			select += ", drought";
		}
		
		if(view.getInteractivePanel().getCheckBoxDuration().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "drought_duration";
			
			select += ", drought_duration";
		}
		
		if(view.getInteractivePanel().getCheckBoxFlood().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "flood_freq";
			
			select += ", flood_freq";
		}
		
		if(view.getInteractivePanel().getCheckBoxCropType().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "croptype";
			
			select += ", croptype";
		}
		
		if(view.getInteractivePanel().getCheckBoxBeastOfBurden().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip1";
			
			select += ", agriequip1";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString().equals("-1")){
				select += ", agriequip1_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxPlow().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip2";
			
			select += ", agriequip2";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString().equals("-1")){
				select += ", agriequip2_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxHarrow().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip3";
			
			select += ", agriequip3";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString().equals("-1")){
				select += ", agriequip3_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxMower().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip4";
			
			select += ", agriequip4";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString().equals("-1")){
				select += ", agriequip4_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxThresher().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip5";
			
			select += ", agriequip5";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString().equals("-1")){
				select += ", agriequip5_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxSprayer().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip6";
			
			select += ", agriequip6";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString().equals("-1")){
				select += ", agriequip6_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxFarmTractor().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip7";
			
			select += ", agriequip7";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString().equals("-1")){
				select += ", agriequip7_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxHandTractor().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip8";
			
			select += ", agriequip8";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString().equals("-1")){
				select += ", agriequip8_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxMudboat().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip9";
			
			select += ", agriequip9";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString().equals("-1")){
				select += ", agriequip9_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxPlanter().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip10";
			
			select += ", agriequip10";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString().equals("-1")){
				select += ", agriequip10_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxMechanicalDryer().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip11";
			
			select += ", agriequip11";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString().equals("-1")){
				select += ", agriequip11_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxDryingPavement().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip12";
			
			select += ", agriequip12";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString().equals("-1")){
				select += ", agriequip12_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxFeedMill().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip13";
			
			select += ", agriequip13";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString().equals("-1")){
				select += ", agriequip13_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxHarvester().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip14";
			
			select += ", agriequip14";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString().equals("-1")){
				select += ", agriequip14_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxGranary().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip15";
			
			select += ", agriequip15";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString().equals("-1")){
				select += ", agriequip15_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxFarmshed().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip16";
			
			select += ", agriequip16";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString().equals("-1")){
				select += ", agriequip16_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxIrrigationPump().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip17";
			
			select += ", agriequip17";
		}
		
		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString().equals("-1")
				|| !view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString().equals("-1")){
				select += ", agriequip17_nown";
		}
		
		if(view.getInteractivePanel().getCheckBoxOthers().isSelected()){
			groupby = appendGroupByChecker(groupby);
			groupby += "agriequip18";
			
			select += ", agriequip18";
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
}
