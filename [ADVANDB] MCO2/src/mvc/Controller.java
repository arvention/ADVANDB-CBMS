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
		String query = "";
		
		if(view.getInteractivePanel().getComboBoxProvince().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			query += "prov = " + view.getInteractivePanel().getComboBoxProvince().getSelectedItem().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxMunicipality().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			query += "mun = " + view.getInteractivePanel().getComboBoxProvince().getSelectedItem().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxZone().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			query += "zone = " + view.getInteractivePanel().getComboBoxZone().getSelectedItem().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxBarangay().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			query += "brgy = " + view.getInteractivePanel().getComboBoxBarangay().getSelectedItem().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxPurok().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			query += "purok = " + view.getInteractivePanel().getComboBoxPurok().getSelectedItem().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxIndustry().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxIndustry().getSelectedItem().toString().equals("Yes"))
				query += "cropind = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxIndustry().getSelectedItem().toString().equals("No"))
				query += "cropind = " + FALSE;
		}
		
		if(view.getInteractivePanel().getComboBoxARCDP().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxARCDP().getSelectedItem().toString().equals("Yes"))
				query += "prog_arcdp = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxARCDP().getSelectedItem().toString().equals("No"))
				query += "prog_arcdp = " + FALSE;
		}
		
		if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedItem().toString().equals("Yes"))
				query += "irfa_crop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedItem().toString().equals("No"))
				query += "irfa_crop = " + FALSE;
		}
		
		if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedItem().toString().equals("Yes"))
				query += "irfa_agriequip = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedItem().toString().equals("No"))
				query += "irfa_agriequip = " + FALSE;
		}
		
		if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Yes"))
				query += "u_chng_pcrop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("No"))
				query += "u_chng_pcrop = " + FALSE;
		}
		
		if(view.getInteractivePanel().getComboBoxReasonChangePrimaryCrop().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Cheaper")){
				query += "u_chng_pcrop_y = 1";
			} else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("More resistant to pest")){
				query += "u_chng_pcrop_y = 2";
			} else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Less water")){
				query += "u_chng_pcrop_y = 3";
			} else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("More profitable")){
				query += "u_chng_pcrop_y = 4";
			} else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Availability")){
				query += "u_chng_pcrop_y = 5";
			} else if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedItem().toString().equals("Others")){
				query += "u_chng_pcrop_y = 6";
			}
		}
		
		if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Yes"))
				query += "u_chng_scrop = " + TRUE;
			else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("No"))
				query += "u_chng_scrop = " + FALSE;
		}
		
		if(view.getInteractivePanel().getComboBoxReasonChangeSameCrop().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Cheaper")){
				query += "u_chng_scrop_y = 1";
			} else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("More resistant to pest")){
				query += "u_chng_scrop_y = 2";
			} else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Less water")){
				query += "u_chng_scrop_y = 3";
			} else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("More profitable")){
				query += "u_chng_scrop_y = 4";
			} else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Availability")){
				query += "u_chng_scrop_y = 5";
			} else if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedItem().toString().equals("Others")){
				query += "u_chng_scrop_y = 6";
			}
		}
		
		if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Price increase on inputs")){
				query += "u_low_harv = 1";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Drought")){
				query += "u_low_harv = 2";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Typhoon")){
				query += "u_low_harv = 3";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Flood")){
				query += "u_low_harv = 4";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Pests")){
				query += "u_low_harv = 5";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Decrease in water supply")){
				query += "u_low_harv = 6";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Change in occupation")){
				query += "u_low_harv = 7";
			} else if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedItem().toString().equals("Others")){
				query += "u_low_harv = 8";
			}
		}
		
		if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Drought")){
				query += "low_wsupp = 1";
			} else if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Broken pump")){
				query += "low_wsupp = 2";
			} else if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Dam water level")){
				query += "low_wsupp = 3";
			} else if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Tanker truck")){
				query += "low_wsupp = 4";
			} else if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Increase in customers")){
				query += "low_wsupp = 5";
			} else if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedItem().toString().equals("Others")){
				query += "low_wsupp = 6";
			}
		}
		
		if(view.getInteractivePanel().getComboBoxDrought().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxDrought().getSelectedItem().toString().equals("Yes")){
				query += "drought = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxDrought().getSelectedItem().toString().equals("No")){
				query += "drought = " + FALSE;
			}
		}
		
		if(view.getInteractivePanel().getComboBoxDuration().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("< 1 Month")){
				query += "drought_duration = 1";
			} else if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("1 Month < 2 Months")){
				query += "drought_duration = 2";
			} else if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("2 Months < 3 Months")){
				query += "drought_duration = 3";
			} else if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("3 Months < 4 Months")){
				query += "drought_duration = 4";
			} else if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("4 Months < 5 Months")){
				query += "drought_duration = 5";
			} else if(view.getInteractivePanel().getComboBoxDuration().getSelectedItem().toString().equals("5 Months or more")){
				query += "drought_duration = 6";
			}
		}
		
		if(view.getInteractivePanel().getComboBoxFlood().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxFlood().getSelectedItem().toString().equals("Yes")){
				query += "flood_freq = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFlood().getSelectedItem().toString().equals("No")){
				query += "flod_freq = " + FALSE;
			}
		}
		
		if(view.getInteractivePanel().getComboBoxCropType().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxCropType().getSelectedItem().toString().equals("Sugar Cane")){
				query += "croptype = 1";
			} else if(view.getInteractivePanel().getComboBoxCropType().getSelectedItem().toString().equals("Palay")){
				query += "croptype = 2";
			} else if(view.getInteractivePanel().getComboBoxCropType().getSelectedItem().toString().equals("Corn")){
				query += "croptype = 3";
			} else if(view.getInteractivePanel().getComboBoxCropType().getSelectedItem().toString().equals("Coffee")){
				query += "croptype = 4";
			} else if(view.getInteractivePanel().getComboBoxCropType().getSelectedItem().toString().equals("Other")){
				query += "croptype = 5";
			}
		}
		
		if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedItem().toString().equals("Owned")){
				query += "agriequip1 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip1 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip1_nown > " + view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip1_nown <= " + view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxPlow().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxPlow().getSelectedItem().toString().equals("Owned")){
				query += "agriequip2 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxPlow().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip2 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip2_nown > " + view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip2_nown <= " + view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxHarrow().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxHarrow().getSelectedItem().toString().equals("Owned")){
				query += "agriequip3 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHarrow().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip3 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip3_nown > " + view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip3_nown <= " + view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxMower().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxMower().getSelectedItem().toString().equals("Owned")){
				query += "agriequip4 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMower().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip4 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip4_nown > " + view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip4_nown <= " + view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxThresher().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxThresher().getSelectedItem().toString().equals("Owned")){
				query += "agriequip5 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxThresher().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip5 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip5_nown > " + view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip5_nown <= " + view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxSprayer().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxSprayer().getSelectedItem().toString().equals("Owned")){
				query += "agriequip6 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxSprayer().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip6 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip6_nown > " + view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip6_nown <= " + view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedItem().toString().equals("Owned")){
				query += "agriequip7 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip7 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip7_nown > " + view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip7_nown <= " + view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedItem().toString().equals("Owned")){
				query += "agriequip8 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip8 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip8_nown > " + view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip8_nown <= " + view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxMudboat().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxMudboat().getSelectedItem().toString().equals("Owned")){
				query += "agriequip9 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMudboat().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip9 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip9_nown > " + view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip9_nown <= " + view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString();	
		}
		
		if(view.getInteractivePanel().getComboBoxPlanter().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxPlanter().getSelectedItem().toString().equals("Owned")){
				query += "agriequip10 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxPlanter().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip10 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip10_nown > " + view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip10_nown <= " + view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedItem().toString().equals("Owned")){
				query += "agriequip11 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip11 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip11_nown > " + view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip11_nown <= " + view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedItem().toString().equals("Owned")){
				query += "agriequip12 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip12 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip12_nown > " + view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip12_nown <= " + view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedItem().toString().equals("Owned")){
				query += "agriequip13 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip13 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip13_nown > " + view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip13_nown <= " + view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxHarvester().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxHarvester().getSelectedItem().toString().equals("Owned")){
				query += "agriequip14 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxHarvester().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip14 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip14_nown > " + view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip14_nown <= " + view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxGranary().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxGranary().getSelectedItem().toString().equals("Owned")){
				query += "agriequip15 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxGranary().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip15 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip15_nown > " + view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip15_nown <= " + view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedItem().toString().equals("Owned")){
				query += "agriequip16 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip16 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip16_nown > " + view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip16_nown <= " + view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedItem().toString().equals("Owned")){
				query += "agriequip17 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip17 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip17_nown > " + view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip17_nown <= " + view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString();
		}
		
		if(view.getInteractivePanel().getComboBoxOthers().getSelectedIndex() != 0){
			query = appendWhereChecker(query);
			if(view.getInteractivePanel().getComboBoxOthers().getSelectedItem().toString().equals("Owned")){
				query += "agriequip18 = " + TRUE;
			} else if(view.getInteractivePanel().getComboBoxOthers().getSelectedItem().toString().equals("Not Owned")){
				query += "agriequip18 = " + FALSE;
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountOthersLower().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip18_nown > " + view.getInteractivePanel().getSpinnerCountOthersLower().getValue().toString();
		}
		
		if(!view.getInteractivePanel().getSpinnerCountOthersUpper().getValue().toString().equals("-1")){
			query = appendWhereChecker(query);
			query += "agriequip18_nown <= " + view.getInteractivePanel().getSpinnerCountOthersUpper().getValue().toString();
		}
		
		return query;
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
			query += "where ";
		else
			query += " and ";
		return query;
	}

	/*private String appendGroupByChecker(String sql) {
		String query = sql;
		if (!query.contains("group by"))
			query += " group by ";
		else
			query += ", ";

		return query;
	}
	*/
}
