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
	
	//private final String TRUE = "1";
	//private final String FALSE = "2";

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
			
		}
		
		if(view.getInteractivePanel().getComboBoxMunicipality().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxZone().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxBarangay().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxPurok().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxIndustry().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxARCDP().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxCropInsurance().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxAgriculturalInsurance().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxChangePrimaryCrop().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxReasonChangePrimaryCrop().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxChangeSameCrop().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxReasonChangeSameCrop().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxLowHarvest().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxWaterSupply().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxDrought().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxDuration().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxFlood().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxCropType().getSelectedIndex() != 0){
			
		}
		
		if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxBeastOfBurden().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountBeastOfBurdenUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxPlow().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxPlow().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxPlow().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlowLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlowUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxHarrow().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxHarrow().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxHarrow().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarrowLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarrowUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxMower().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxMower().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxMower().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMowerLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMowerUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxThresher().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxThresher().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxThresher().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountThresherLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountThresherUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxSprayer().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxSprayer().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxSprayer().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountSprayerLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountSprayerUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxFarmTractor().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmTractorLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmTractorUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxHandTractor().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHandTractorLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHandTractorUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxMudboat().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxMudboat().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxMudboat().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMudboatLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMudboatUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxPlanter().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxPlanter().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxPlanter().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlanterLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountPlanterUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxMechanicalDryer().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountMechanicalDryerUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxDryingPavement().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountDryingPavementLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountDryingPavementUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxFeedMill().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFeedMillLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFeedMillUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxHarvester().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxHarvester().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxHarvester().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarvesterLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountHarvesterUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxGranary().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxGranary().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxGranary().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountGranaryLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountGranaryUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxFarmshed().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmshedLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountFarmshedUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxIrrigationPump().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountIrrigationPumpUpper().getValue().toString().equals("-1")){
			
		}
		
		if(view.getInteractivePanel().getComboBoxOthers().getSelectedIndex() != 0){
			if(view.getInteractivePanel().getComboBoxOthers().getSelectedItem().toString().equals("Owned")){
				
			} else if(view.getInteractivePanel().getComboBoxOthers().getSelectedItem().toString().equals("Not Owned")){
				
			}
		}
		
		if(!view.getInteractivePanel().getSpinnerCountOthersLower().getValue().toString().equals("-1")){
			
		}
		
		if(!view.getInteractivePanel().getSpinnerCountOthersUpper().getValue().toString().equals("-1")){
			
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

	private String appendGroupByChecker(String sql) {
		String query = sql;
		if (!query.contains("group by"))
			query += " group by ";
		else
			query += ", ";

		return query;
	}
}
