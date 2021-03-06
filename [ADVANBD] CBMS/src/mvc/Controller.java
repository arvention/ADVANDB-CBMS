package mvc;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;

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

	public void addListeners() {
		addListenersMainPanel();
		addListenersBackButtons();
		addListenersQuery1Spinners();
		addListenersQuery2Spinners();
		addListenersQuery7Spinners();
		addListenersQuery3CheckBox();
		addListenersQuery4CheckBox();
		addListenersQuery5CheckBox();
		addListenersQuery6CheckBox();
		addListenersQuery7CheckBox();

		addListenersQueryButtons();
	}

	public void addListenersMainPanel() {
		view.getButtonQuery1().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_query1");
			}
		});

		view.getButtonQuery2().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_query2");
			}
		});

		view.getButtonQuery3().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_query3");
			}
		});

		view.getButtonQuery4().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_query4");
			}
		});

		view.getButtonQuery5().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_query5");
			}
		});

		view.getButtonQuery6().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_query6");
			}
		});

		view.getButtonQuery7().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_query7");
			}
		});
	}

	public void addListenersBackButtons() {
		view.getButtonQuery1Back().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_main");
			}
		});

		view.getButtonQuery2Back().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_main");
			}
		});

		view.getButtonQuery3Back().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_main");
			}
		});

		view.getButtonQuery4Back().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_main");
			}
		});

		view.getButtonQuery5Back().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_main");
			}
		});

		view.getButtonQuery6Back().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_main");
			}
		});

		view.getButtonQuery7Back().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) view.getContentPane().getLayout();
				cardLayout.show(view.getContentPane(), "panel_main");
			}
		});
	}

	public void addListenersQueryButtons() {
		view.getButtonQuery1Query().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				String sql = query1Builder();
				System.out.println(sql);

				long startTime = System.nanoTime();
				facadeDatabase.getResult(sql, modelTable);
				long endTime = System.nanoTime() - startTime;
				double seconds = endTime / 1.0E09;

				modelTableHouseTypeConverter();
				modelTableRoofCompositionConverter();
				modelTableWallCompositionConverter();

				view.getLabelQuery1Status().setText(
						"Rows returned: " + modelTable.getData().length + " | Running time: " + seconds + " seconds");
				DefaultTableModel dtm = new DefaultTableModel(modelTable.getData(), modelTable.getColumnName());
				view.getTableQuery1ResultTable().setModel(dtm);
			}
		});

		view.getButtonQuery2Query().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				String sql = query2Builder();
				System.out.println(sql);

				long startTime = System.nanoTime();
				facadeDatabase.getResult(sql, modelTable);
				long endTime = System.nanoTime() - startTime;
				double seconds = endTime / 1.0E09;

				view.getLabelQuery2Status().setText(
						"Rows returned: " + modelTable.getData().length + " | Running time: " + seconds + " seconds");
				DefaultTableModel dtm = new DefaultTableModel(modelTable.getData(), modelTable.getColumnName());
				view.getTableQuery2ResultTable().setModel(dtm);
			}
		});

		view.getButtonQuery3Query().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String sql = query3Builder();
				System.out.println(sql);
				long startTime = System.nanoTime();
				facadeDatabase.getResult(sql, modelTable);
				long endTime = System.nanoTime() - startTime;
				double seconds = endTime / 1.0E09;

				modelTableUriNgPananimConverter();

				view.getLabelQuery3Status().setText(
						"Rows returned: " + modelTable.getData().length + " | Running time: " + seconds + " seconds");
				DefaultTableModel dtm = new DefaultTableModel(modelTable.getData(), modelTable.getColumnName());
				view.getTableQuery3ResultTable().setModel(dtm);
			}
		});

		view.getButtonQuery4Query().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String sql = query4Builder();
				System.out.println(sql);
				long startTime = System.nanoTime();
				facadeDatabase.getResult(sql, modelTable);
				long endTime = System.nanoTime() - startTime;
				double seconds = endTime / 1.0E09;

				modelTableSanhiNgPagkamatayConverter();

				view.getLabelQuery4Status().setText(
						"Rows returned: " + modelTable.getData().length + " | Running time: " + seconds + " seconds");
				DefaultTableModel dtm = new DefaultTableModel(modelTable.getData(), modelTable.getColumnName());
				view.getTableQuery4ResultTable().setModel(dtm);
			}
		});

		view.getButtonQuery5Query().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String sql = query5Builder();
				System.out.println(sql);
				long startTime = System.nanoTime();
				facadeDatabase.getResult(sql, modelTable);
				long endTime = System.nanoTime() - startTime;
				double seconds = endTime / 1.0E09;

				modelTableGamitSaPangingisdaConverter();

				view.getLabelQuery5Status().setText(
						"Rows returned: " + modelTable.getData().length + " | Running time: " + seconds + " seconds");
				DefaultTableModel dtm = new DefaultTableModel(modelTable.getData(), modelTable.getColumnName());
				view.getTableQuery5ResultTable().setModel(dtm);
			}
		});

		view.getButtonQuery6Query().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String sql = query6Builder();
				System.out.println(sql);

				long startTime = System.nanoTime();
				facadeDatabase.getResult(sql, modelTable);
				long endTime = System.nanoTime() - startTime;
				double seconds = endTime / 1.0E09;
				view.getLabelQuery6Status().setText(
						"Rows returned: " + modelTable.getData().length + " | Running time: " + seconds + " seconds");
				DefaultTableModel dtm = new DefaultTableModel(modelTable.getData(), modelTable.getColumnName());
				view.getTableQuery6ResultTable().setModel(dtm);
			}
		});

		view.getButtonQuery7Query().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String sql = query7Builder();
				System.out.println(sql);

				long startTime = System.nanoTime();
				facadeDatabase.getResult(sql, modelTable);
				long endTime = System.nanoTime() - startTime;
				double seconds = endTime / 1.0E09;
				
				modelTableUriNgPananimConverter();
				view.getLabelQuery7Status().setText(
						"Rows returned: " + modelTable.getData().length + " | Running time: " + seconds + " seconds");
				DefaultTableModel dtm = new DefaultTableModel(modelTable.getData(), modelTable.getColumnName());
				view.getTableQuery7ResultTable().setModel(dtm);
			}
		});
	}

	public void addListenersQuery1Spinners() {
		view.getSpinnerQuery1BagyoFrequencyLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1BagyoFrequencyLower(),
						view.getSpinnerQuery1BagyoFrequencyUpper());
			}
		});

		view.getSpinnerQuery1BagyoFrequencyUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1BagyoFrequencyLower(),
						view.getSpinnerQuery1BagyoFrequencyUpper());
			}
		});

		view.getSpinnerQuery1BahaFrequencyLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1BahaFrequencyLower(), view.getSpinnerQuery1BahaFrequencyUpper());
			}
		});

		view.getSpinnerQuery1BahaFrequencyUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1BahaFrequencyLower(), view.getSpinnerQuery1BahaFrequencyUpper());
			}
		});

		view.getSpinnerQuery1TagtuyotFrequencyLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1TagtuyotFrequencyLower(),
						view.getSpinnerQuery1TagtuyotFrequencyUpper());
			}
		});

		view.getSpinnerQuery1TagtuyotFrequencyUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1TagtuyotFrequencyLower(),
						view.getSpinnerQuery1TagtuyotFrequencyUpper());
			}
		});

		view.getSpinnerQuery1LindolFrequencyLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1LindolFrequencyLower(),
						view.getSpinnerQuery1LindolFrequencyUpper());
			}
		});

		view.getSpinnerQuery1LindolFrequencyUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1LindolFrequencyLower(),
						view.getSpinnerQuery1LindolFrequencyUpper());
			}
		});

		view.getSpinnerQuery1BulkanFrequencyLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1BulkanFrequencyLower(),
						view.getSpinnerQuery1BulkanFrequencyUpper());
			}
		});

		view.getSpinnerQuery1BulkanFrequencyUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1BulkanFrequencyLower(),
						view.getSpinnerQuery1BulkanFrequencyUpper());
			}
		});

		view.getSpinnerQuery1LandslideFrequencyLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1LandslideFrequencyLower(),
						view.getSpinnerQuery1LandslideFrequencyUpper());
			}
		});

		view.getSpinnerQuery1LandslideFrequencyUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1LandslideFrequencyLower(),
						view.getSpinnerQuery1LandslideFrequencyUpper());
			}
		});

		view.getSpinnerQuery1TsunamiFrequencyLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1TsunamiFrequencyLower(),
						view.getSpinnerQuery1TsunamiFrequencyUpper());
			}
		});

		view.getSpinnerQuery1TsunamiFrequencyUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1TsunamiFrequencyLower(),
						view.getSpinnerQuery1TsunamiFrequencyUpper());
			}
		});

		view.getSpinnerQuery1SunogFrequencyLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1SunogFrequencyLower(),
						view.getSpinnerQuery1SunogFrequencyUpper());
			}
		});

		view.getSpinnerQuery1SunogFrequencyUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1SunogFrequencyLower(),
						view.getSpinnerQuery1SunogFrequencyUpper());
			}
		});

		view.getSpinnerQuery1ForestFireFrequencyLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1ForestFireFrequencyLower(),
						view.getSpinnerQuery1ForestFireFrequencyUpper());
			}
		});

		view.getSpinnerQuery1ForestFireFrequencyUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1ForestFireFrequencyLower(),
						view.getSpinnerQuery1ForestFireFrequencyUpper());
			}
		});

		view.getSpinnerQuery1DigmaanFrequencyLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeUpperBound(view.getSpinnerQuery1DigmaanFrequencyLower(),
						view.getSpinnerQuery1DigmaanFrequencyUpper());
			}
		});

		view.getSpinnerQuery1DigmaanFrequencyUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				changeLowerBound(view.getSpinnerQuery1DigmaanFrequencyLower(),
						view.getSpinnerQuery1DigmaanFrequencyUpper());
			}
		});
	}

	public void addListenersQuery2Spinners() {
		view.getSpinnerQuery2SLPNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2SLPNumLower(), view.getSpinnerQuery2SLPNumUpper());
			}
		});

		view.getSpinnerQuery2SLPNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2SLPNumLower(), view.getSpinnerQuery2SLPNumUpper());
			}
		});

		view.getSpinnerQuery2FFSPNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2FFSPNumLower(), view.getSpinnerQuery2FFSPNumUpper());
			}
		});

		view.getSpinnerQuery2FFSPNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2FFSPNumLower(), view.getSpinnerQuery2FFSPNumUpper());
			}
		});

		view.getSpinnerQuery2FFWPNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2FFWPNumLower(), view.getSpinnerQuery2FFWPNumUpper());
			}
		});

		view.getSpinnerQuery2FFWPNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2FFWPNumLower(), view.getSpinnerQuery2FFWPNumUpper());
			}
		});

		view.getSpinnerQuery2CFWPNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2CFWPNumLower(), view.getSpinnerQuery2CFWPNumUpper());
			}
		});

		view.getSpinnerQuery2CFWPNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2CFWPNumLower(), view.getSpinnerQuery2CFWPNumUpper());
			}
		});

		view.getSpinnerQuery2SPISCNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2SPISCNumLower(), view.getSpinnerQuery2SPISCNumUpper());
			}
		});

		view.getSpinnerQuery2SPISCNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2SPISCNumLower(), view.getSpinnerQuery2SPISCNumUpper());
			}
		});

		view.getSpinnerQuery2CCTNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2CCTNumLower(), view.getSpinnerQuery2CCTNumUpper());
			}
		});

		view.getSpinnerQuery2CCTNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2CCTNumLower(), view.getSpinnerQuery2CCTNumUpper());
			}
		});

		view.getSpinnerQuery2ARCDPNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2ARCDPNumLower(), view.getSpinnerQuery2ARCDPNumUpper());
			}
		});

		view.getSpinnerQuery2ARCDPNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2ARCDPNumLower(), view.getSpinnerQuery2ARCDPNumUpper());
			}
		});

		view.getSpinnerQuery2CBEPNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2CBEPNumLower(), view.getSpinnerQuery2CBEPNumUpper());
			}
		});

		view.getSpinnerQuery2CBEPNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2CBEPNumLower(), view.getSpinnerQuery2CBEPNumUpper());
			}
		});

		view.getSpinnerQuery2PHOFWNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2PHOFWNumLower(), view.getSpinnerQuery2PHOFWNumUpper());
			}
		});

		view.getSpinnerQuery2PHOFWNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2PHOFWNumLower(), view.getSpinnerQuery2PHOFWNumUpper());
			}
		});

		view.getSpinnerQuery2PHENumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2PHENumLower(), view.getSpinnerQuery2PHENumUpper());
			}
		});

		view.getSpinnerQuery2PHENumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2PHENumLower(), view.getSpinnerQuery2PHENumUpper());
			}
		});

		view.getSpinnerQuery2PHIPNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2PHIPNumLower(), view.getSpinnerQuery2PHIPNumUpper());
			}
		});

		view.getSpinnerQuery2PHIPNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2PHIPNumLower(), view.getSpinnerQuery2PHIPNumUpper());
			}
		});

		view.getSpinnerQuery2PHSNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2PHSNumLower(), view.getSpinnerQuery2PHSNumUpper());
			}
		});

		view.getSpinnerQuery2PHSNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2PHSNumLower(), view.getSpinnerQuery2PHSNumUpper());
			}
		});

		view.getSpinnerQuery2PHLNumLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2PHLNumLower(), view.getSpinnerQuery2PHLNumUpper());
			}
		});

		view.getSpinnerQuery2PHLNumUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2PHLNumLower(), view.getSpinnerQuery2PHLNumUpper());
			}
		});

		view.getSpinnerQuery2OtherProgramsLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery2OtherProgramsLower(), view.getSpinnerQuery2OtherProgramsUpper());
			}
		});

		view.getSpinnerQuery2OtherProgramsUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery2OtherProgramsLower(), view.getSpinnerQuery2OtherProgramsUpper());
			}
		});
	}

	public void addListenersQuery7Spinners() {
		view.getSpinnerQuery7AgeLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery7AgeLower(), view.getSpinnerQuery7AgeUpper());
			}
		});

		view.getSpinnerQuery7AgeUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery7AgeLower(), view.getSpinnerQuery7AgeLower());
			}
		});

		view.getSpinnerQuery7YearFarmingLower().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeUpperBound(view.getSpinnerQuery7YearFarmingLower(), view.getSpinnerQuery7YearFarmingUpper());
			}
		});

		view.getSpinnerQuery7YearFarmingUpper().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeLowerBound(view.getSpinnerQuery7YearFarmingLower(), view.getSpinnerQuery7YearFarmingLower());
			}
		});
	}

	public void addListenersQuery3CheckBox() {
		view.getCheckBoxQuery3Municipality().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery3Municipality().isSelected()) {
					view.getComboBoxQuery3Municipality().setEnabled(true);
				} else {
					view.getComboBoxQuery3Municipality().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery3Zone().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery3Zone().isSelected()) {
					view.getComboBoxQuery3Zone().setEnabled(true);
				} else {
					view.getComboBoxQuery3Zone().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery3Barangay().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery3Barangay().isSelected()) {
					view.getComboBoxQuery3Barangay().setEnabled(true);
				} else {
					view.getComboBoxQuery3Barangay().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery3Purok().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery3Purok().isSelected()) {
					view.getComboBoxQuery3Purok().setEnabled(true);
				} else {
					view.getComboBoxQuery3Purok().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery3CropType().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery3CropType().isSelected()) {
					view.getComboBoxQuery3CropType().setEnabled(true);
				} else {
					view.getComboBoxQuery3CropType().setEnabled(false);
				}
			}
		});
	}

	public void addListenersQuery4CheckBox() {
		view.getCheckBoxQuery4Municipality().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery4Municipality().isSelected()) {
					view.getComboBoxQuery4Municipality().setEnabled(true);
				} else {
					view.getComboBoxQuery4Municipality().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery4Zone().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery4Zone().isSelected()) {
					view.getComboBoxQuery4Zone().setEnabled(true);
				} else {
					view.getComboBoxQuery4Zone().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery4Barangay().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery4Barangay().isSelected()) {
					view.getComboBoxQuery4Barangay().setEnabled(true);
				} else {
					view.getComboBoxQuery4Barangay().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery4Purok().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery4Purok().isSelected()) {
					view.getComboBoxQuery4Purok().setEnabled(true);
				} else {
					view.getComboBoxQuery4Purok().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery4Pagkamatay().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery4Pagkamatay().isSelected()) {
					view.getComboBoxQuery4Pagkamatay().setEnabled(true);
				} else {
					view.getComboBoxQuery4Pagkamatay().setEnabled(false);
				}
			}
		});
	}

	public void addListenersQuery5CheckBox() {
		view.getCheckBoxQuery5Municipality().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery5Municipality().isSelected()) {
					view.getComboBoxQuery5Municipality().setEnabled(true);
				} else {
					view.getComboBoxQuery5Municipality().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery5Zone().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery5Zone().isSelected()) {
					view.getComboBoxQuery5Zone().setEnabled(true);
				} else {
					view.getComboBoxQuery5Zone().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery5Barangay().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery5Barangay().isSelected()) {
					view.getComboBoxQuery5Barangay().setEnabled(true);
				} else {
					view.getComboBoxQuery5Barangay().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery5Purok().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery5Purok().isSelected()) {
					view.getComboBoxQuery5Purok().setEnabled(true);
				} else {
					view.getComboBoxQuery5Purok().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery5Kagamitan().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery5Kagamitan().isSelected()) {
					view.getComboBoxQuery5Kagamitan().setEnabled(true);
				} else {
					view.getComboBoxQuery5Kagamitan().setEnabled(false);
				}
			}
		});
	}

	public void addListenersQuery6CheckBox() {
		view.getCheckBoxQuery6Municipality().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery6Municipality().isSelected()) {
					view.getComboBoxQuery6Municipality().setEnabled(true);
				} else {
					view.getComboBoxQuery6Municipality().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery6Zone().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery6Zone().isSelected()) {
					view.getComboBoxQuery6Zone().setEnabled(true);
				} else {
					view.getComboBoxQuery6Zone().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery6Barangay().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery6Barangay().isSelected()) {
					view.getComboBoxQuery6Barangay().setEnabled(true);
				} else {
					view.getComboBoxQuery6Barangay().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery6Purok().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery6Purok().isSelected()) {
					view.getComboBoxQuery6Purok().setEnabled(true);
				} else {
					view.getComboBoxQuery6Purok().setEnabled(false);
				}
			}
		});
	}

	public void addListenersQuery7CheckBox() {
		view.getCheckBoxQuery7Municipality().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery7Municipality().isSelected()) {
					view.getComboBoxQuery7Municipality().setEnabled(true);
				} else {
					view.getComboBoxQuery7Municipality().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery7Zone().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery7Zone().isSelected()) {
					view.getComboBoxQuery7Zone().setEnabled(true);
				} else {
					view.getComboBoxQuery7Zone().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery7Barangay().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery7Barangay().isSelected()) {
					view.getComboBoxQuery7Barangay().setEnabled(true);
				} else {
					view.getComboBoxQuery7Barangay().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery7Purok().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery7Purok().isSelected()) {
					view.getComboBoxQuery7Purok().setEnabled(true);
				} else {
					view.getComboBoxQuery7Purok().setEnabled(false);
				}
			}
		});

		view.getCheckBoxQuery7CropType().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (view.getCheckBoxQuery7CropType().isSelected()) {
					view.getComboBoxQuery7CropType().setEnabled(true);
				} else {
					view.getComboBoxQuery7CropType().setEnabled(false);
				}
			}
		});
	}

	public void changeUpperBound(JSpinner lowerSpinner, JSpinner upperSpinner) {
		int lower = Integer.parseInt(lowerSpinner.getValue().toString());
		int upper = Integer.parseInt(upperSpinner.getValue().toString());
		if (lower > upper)
			upperSpinner.setValue(lower);
	}

	public void changeLowerBound(JSpinner lowerSpinner, JSpinner upperSpinner) {
		int lower = Integer.parseInt(lowerSpinner.getValue().toString());
		int upper = Integer.parseInt(upperSpinner.getValue().toString());
		if (upper < lower)
			lowerSpinner.setValue(upper);
	}

	public String appendWhereChecker(String sql) {
		String query = sql;
		if (!query.contains("where"))
			query += "where ";
		else
			query += " and ";
		return query;
	}

	public String appendGroupByChecker(String sql) {
		String query = sql;
		if (!query.contains("group by"))
			query += " group by ";
		else
			query += ", ";

		return query;
	}

	public String appendColumnEntry(String sql, String appendWhat, String appendBefore) {
		String query;
		int index = sql.indexOf(appendBefore);
		String leftHalf = sql.substring(0, index);
		String rightHalf = sql.substring(index);

		leftHalf += appendWhat + ", ";

		query = leftHalf += rightHalf;

		return query;
	}

	public String query1Builder() {
		/*
		 * String sql =
		 * "Select id as ID, mun as Municipality, zone as Zone, brgy as Barangay, "
		 * +
		 * "purok as Purok, house_type_o as 'House Type', nbr as 'Room Count', "
		 * +
		 * "roof as 'Roof Composition', wall as 'Wall Composition', nofw as 'Number of OFW', nnucfam as 'Number of Families', "
		 * +
		 * "calam1_hus_aid_o as 'Tumulong Noong May Bagyo', calam2_hus_aid_o as 'Tumulong Noong May Baha', "
		 * +
		 * "calam3_hus_aid_o as 'Tumulong Noong May Tagtuyot', calam4_hus_aid_o as 'Tumulong Noong Lindol', "
		 * + "calam5_hus_aid_o as 'Tumulong Noong Sumabog ang Bulkan', " +
		 * "calam6_hus_aid_o as 'Tumulong Noong May Landslide', calam7_hus_aid_o as 'Tumulong Noong May Tsunami', "
		 * +
		 * "calam8_hus_aid_o as 'Tumulong Noong May Sunog', calam9_hus_aid_o as 'Tumulong Noong May Forest Fire', "
		 * + "calam10_hus_aid_o as 'Tumulong Noong May Digmaan' from hpq_hh ";
		 */

		String sql = "Select hpq_address.id as ID, mun as Municipality, zone as Zone, brgy as Barangay, "
				+ "purok as Purok, house_type as 'House Type', nbr as 'Room Count', "
				+ "roof as 'Roof Composition', wall as 'Wall Composition', nofw as 'Number of OFW', nnucfam as 'Number of Families' "
				+ "FROM hpq_address join hpq_house_details on hpq_address.id = hpq_house_details.id "
				+ "JOIN hpq_calam on hpq_address.id = hpq_calam.id ";

		if (view.getComboBoxQuery1Municipality().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "mun = " + view.getComboBoxQuery1Municipality().getSelectedItem().toString();
		}

		if (view.getComboBoxQuery1Zone().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "zone = " + view.getComboBoxQuery1Zone().getSelectedItem().toString();
		}

		if (view.getComboBoxQuery1Barangay().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "brgy = " + view.getComboBoxQuery1Barangay().getSelectedItem().toString();
		}

		if (view.getComboBoxQuery1Purok().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "purok = " + view.getComboBoxQuery1Purok().getSelectedItem().toString();
		}

		if (view.getComboBoxQuery1HouseType().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1HouseType().getSelectedItem().toString().equals("Single"))
				sql += "house_type = 1";
			else if (view.getComboBoxQuery1HouseType().getSelectedItem().toString().equals("Duplex"))
				sql += "house_type = 2";
			else if (view.getComboBoxQuery1HouseType().getSelectedItem().toString().equals("Multi-unit"))
				sql += "house_type = 3";
			else if (view.getComboBoxQuery1HouseType().getSelectedItem().toString().equals("Commercial"))
				sql += "house_type = 4";
			else if (view.getComboBoxQuery1HouseType().getSelectedItem().toString().equals("Others"))
				sql += "house_type = 5";
		}

		if (view.getComboBoxQuery1Bagyo().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1Bagyo().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam1 = " + TRUE;
			else if (view.getComboBoxQuery1Bagyo().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam1 = " + FALSE;
		}

		if (!view.getSpinnerQuery1BagyoFrequencyLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam1_hwmny > " + view.getSpinnerQuery1BagyoFrequencyLower().getValue().toString();
		}

		if (!view.getSpinnerQuery1BagyoFrequencyUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam1_hwmny <= " + view.getSpinnerQuery1BagyoFrequencyUpper().getValue().toString();
		}

		if (view.getComboBoxQuery1BagyoAid().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1BagyoAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam1_aid = " + TRUE;
			else if (view.getComboBoxQuery1BagyoAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam1_aid = " + FALSE;
		}

		if (view.getComboBoxQuery1Baha().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1Baha().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam2 = " + TRUE;
			else if (view.getComboBoxQuery1Baha().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam2 = " + FALSE;
		}

		if (!view.getSpinnerQuery1BahaFrequencyLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam2_hwmny > " + view.getSpinnerQuery1BahaFrequencyLower().getValue().toString();
		}

		if (!view.getSpinnerQuery1BahaFrequencyUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam2_hwmny <= " + view.getSpinnerQuery1BahaFrequencyUpper().getValue().toString();
		}

		if (view.getComboBoxQuery1BahaAid().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1BahaAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam2_aid = " + TRUE;
			else if (view.getComboBoxQuery1BahaAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam2_aid = " + FALSE;
		}

		if (view.getComboBoxQuery1Tagtuyot().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1Tagtuyot().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam3 = " + TRUE;
			else if (view.getComboBoxQuery1Tagtuyot().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam3 = " + FALSE;
		}

		if (!view.getSpinnerQuery1TagtuyotFrequencyLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam3_hwmny > " + view.getSpinnerQuery1TagtuyotFrequencyLower().getValue().toString();
		}

		if (!view.getSpinnerQuery1TagtuyotFrequencyUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam3_hwmny <= " + view.getSpinnerQuery1TagtuyotFrequencyUpper().getValue().toString();
		}

		if (view.getComboBoxQuery1TagtuyotAid().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1TagtuyotAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam3_aid = " + TRUE;
			else if (view.getComboBoxQuery1TagtuyotAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam3_aid = " + FALSE;
		}

		if (view.getComboBoxQuery1Lindol().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1Lindol().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam4 = " + TRUE;
			else if (view.getComboBoxQuery1Lindol().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam4 = " + FALSE;
		}

		if (!view.getSpinnerQuery1LindolFrequencyLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam4_hwmny > " + view.getSpinnerQuery1LindolFrequencyLower().getValue().toString();
		}

		if (!view.getSpinnerQuery1LindolFrequencyUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam4_hwmny <= " + view.getSpinnerQuery1LindolFrequencyUpper().getValue().toString();
		}

		if (view.getComboBoxQuery1LindolAid().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1LindolAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam4_aid = " + TRUE;
			else if (view.getComboBoxQuery1LindolAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam4_aid = " + FALSE;
		}

		if (view.getComboBoxQuery1Bulkan().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1Bulkan().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam5 = " + TRUE;
			else if (view.getComboBoxQuery1Bulkan().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam5 = " + FALSE;
		}

		if (!view.getSpinnerQuery1BulkanFrequencyLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam5_hwmny > " + view.getSpinnerQuery1BulkanFrequencyLower().getValue().toString();
		}

		if (!view.getSpinnerQuery1BulkanFrequencyUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam5_hwmny <= " + view.getSpinnerQuery1BulkanFrequencyUpper().getValue().toString();
		}

		if (view.getComboBoxQuery1BulkanAid().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1BulkanAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam5_aid = " + TRUE;
			else if (view.getComboBoxQuery1BulkanAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam5_aid = " + FALSE;
		}

		if (view.getComboBoxQuery1Landslide().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1Landslide().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam6 = " + TRUE;
			else if (view.getComboBoxQuery1Landslide().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam6 = " + FALSE;
		}

		if (!view.getSpinnerQuery1LandslideFrequencyLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam6_hwmny > " + view.getSpinnerQuery1LandslideFrequencyLower().getValue().toString();
		}

		if (!view.getSpinnerQuery1LandslideFrequencyUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam6_hwmny <= " + view.getSpinnerQuery1LandslideFrequencyUpper().getValue().toString();
		}

		if (view.getComboBoxQuery1LandslideAid().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1LandslideAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam6_aid = " + TRUE;
			else if (view.getComboBoxQuery1LandslideAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam6_aid = " + FALSE;
		}

		if (view.getComboBoxQuery1Tsunami().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1Tsunami().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam7 = " + TRUE;
			else if (view.getComboBoxQuery1Tsunami().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam7 = " + FALSE;
		}

		if (!view.getSpinnerQuery1TsunamiFrequencyLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam7_hwmny > " + view.getSpinnerQuery1TsunamiFrequencyLower().getValue().toString();
		}

		if (!view.getSpinnerQuery1TsunamiFrequencyUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam7_hwmny <= " + view.getSpinnerQuery1TsunamiFrequencyUpper().getValue().toString();
		}

		if (view.getComboBoxQuery1TsunamiAid().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1TsunamiAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam7_aid = " + TRUE;
			else if (view.getComboBoxQuery1TsunamiAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam7_aid = " + FALSE;
		}

		if (view.getComboBoxQuery1Sunog().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1Sunog().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam8 = " + TRUE;
			else if (view.getComboBoxQuery1Sunog().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam8 = " + FALSE;
		}

		if (!view.getSpinnerQuery1SunogFrequencyLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam8_hwmny > " + view.getSpinnerQuery1SunogFrequencyLower().getValue().toString();
		}

		if (!view.getSpinnerQuery1SunogFrequencyUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam8_hwmny <= " + view.getSpinnerQuery1SunogFrequencyUpper().getValue().toString();
		}

		if (view.getComboBoxQuery1SunogAid().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1SunogAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam8_aid = " + TRUE;
			else if (view.getComboBoxQuery1SunogAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam8_aid = " + FALSE;
		}

		if (view.getComboBoxQuery1ForestFire().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1ForestFire().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam9 = " + TRUE;
			else if (view.getComboBoxQuery1ForestFire().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam9 = " + FALSE;
		}

		if (!view.getSpinnerQuery1ForestFireFrequencyLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam9_hwmny > " + view.getSpinnerQuery1ForestFireFrequencyLower().getValue().toString();
		}

		if (!view.getSpinnerQuery1ForestFireFrequencyUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam9_hwmny <= " + view.getSpinnerQuery1ForestFireFrequencyUpper().getValue().toString();
		}

		if (view.getComboBoxQuery1ForestFireAid().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1ForestFireAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam9_aid = " + TRUE;
			else if (view.getComboBoxQuery1ForestFireAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam9_aid = " + FALSE;
		}

		if (view.getComboBoxQuery1Digmaan().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1Digmaan().getSelectedItem().toString().equals("Naranasan"))
				sql += "calam10 = " + TRUE;
			else if (view.getComboBoxQuery1Digmaan().getSelectedItem().toString().equals("Hindi Naranasan"))
				sql += "calam10 = " + FALSE;
		}

		if (!view.getSpinnerQuery1DigmaanFrequencyLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam10_hwmny > " + view.getSpinnerQuery1DigmaanFrequencyLower().getValue().toString();
		}

		if (!view.getSpinnerQuery1DigmaanFrequencyUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "calam10_hwmny <= " + view.getSpinnerQuery1DigmaanFrequencyUpper().getValue().toString();
		}

		if (view.getComboBoxQuery1DigmaanAid().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery1DigmaanAid().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "calam10_aid = " + TRUE;
			else if (view.getComboBoxQuery1DigmaanAid().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "calam10_aid = " + FALSE;
		}

		return sql;
	}

	public String query2Builder() {
		String sql = "Select A.id as ID, mun as Municipality, zone as Zone, brgy as Barangay, purok as Purok, "
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
				+ "nprog as 'Bilang ng iba pang Programang Nakinabang ang Sambahayan' "
				+ "FROM hpq_address A JOIN hpq_program_membership PM ON A.id = PM.id "
				+ "JOIN hpq_house_details HD ON HD.id = PM.id ";

		if (view.getComboBoxQuery2Municipality().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "mun = " + view.getComboBoxQuery2Municipality().getSelectedItem().toString();
		}

		if (view.getComboBoxQuery2Zone().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "zone = " + view.getComboBoxQuery2Zone().getSelectedItem().toString();
		}

		if (view.getComboBoxQuery2Barangay().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "brgy = " + view.getComboBoxQuery2Barangay().getSelectedItem().toString();
		}

		if (view.getComboBoxQuery2Purok().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "purok = " + view.getComboBoxQuery2Purok().getSelectedItem().toString();
		}

		if (view.getComboBoxQuery2SLP().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2SLP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_slp = " + TRUE;
			else if (view.getComboBoxQuery2SLP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_slp = " + FALSE;
		}

		if (!view.getSpinnerQuery2SLPNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_slp_nmem > " + view.getSpinnerQuery2SLPNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2SLPNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_slp_nmem <= " + view.getSpinnerQuery2SLPNumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2FFSP().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2FFSP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_fudforsch = " + TRUE;
			else if (view.getComboBoxQuery2FFSP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_fudforsch = " + FALSE;
		}

		if (!view.getSpinnerQuery2FFSPNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_fudforsch_nmem > " + view.getSpinnerQuery2FFSPNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2FFSPNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_fudforsch_nmem <= " + view.getSpinnerQuery2FFSPNumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2FFWP().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2FFWP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_fudforwrk = " + TRUE;
			else if (view.getComboBoxQuery2FFWP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_fudforwrk = " + FALSE;
		}

		if (!view.getSpinnerQuery2FFWPNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_fudforwrk_nmem > " + view.getSpinnerQuery2FFWPNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2FFWPNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_fudforwrk_nmem <= " + view.getSpinnerQuery2FFWPNumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2CFWP().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2CFWP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_cshforwrk = " + TRUE;
			else if (view.getComboBoxQuery2CFWP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_cshforwrk = " + FALSE;
		}

		if (!view.getSpinnerQuery2CFWPNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_cshforwrk_nmem > " + view.getSpinnerQuery2CFWPNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2CFWPNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_cshforwrk_nmem <= " + view.getSpinnerQuery2CFWPNumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2SPISC().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2SPISC().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_spisc = " + TRUE;
			else if (view.getComboBoxQuery2SPISC().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_spisc = " + FALSE;
		}

		if (!view.getSpinnerQuery2SPISCNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_spisc_nmem > " + view.getSpinnerQuery2SPISCNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2SPISCNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_spisc_nmem <= " + view.getSpinnerQuery2SPISCNumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2CCT().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2CCT().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_cct = " + TRUE;
			else if (view.getComboBoxQuery2CCT().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_cct = " + FALSE;
		}

		if (!view.getSpinnerQuery2CCTNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_cct_nmem > " + view.getSpinnerQuery2CCTNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2CCTNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_cct_nmem <= " + view.getSpinnerQuery2CCTNumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2ARCDP().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2ARCDP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_arcdp = " + TRUE;
			else if (view.getComboBoxQuery2ARCDP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_arcdp = " + FALSE;
		}

		if (!view.getSpinnerQuery2ARCDPNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_arcdp_nmem > " + view.getSpinnerQuery2ARCDPNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2ARCDPNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_arcdp_nmem <= " + view.getSpinnerQuery2ARCDPNumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2CBEP().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2CBEP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_cbep = " + TRUE;
			else if (view.getComboBoxQuery2CBEP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_cbep = " + FALSE;
		}

		if (!view.getSpinnerQuery2CBEPNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_cbep_nmem > " + view.getSpinnerQuery2CBEPNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2CBEPNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_cbep_nmem <= " + view.getSpinnerQuery2CBEPNumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2PHOFW().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2PHOFW().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_philheal_ofw = " + TRUE;
			else if (view.getComboBoxQuery2PHOFW().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_philheal_ofw = " + FALSE;
		}

		if (!view.getSpinnerQuery2PHOFWNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_ofw_nmem > " + view.getSpinnerQuery2PHOFWNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2PHOFWNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_ofw_nmem <= " + view.getSpinnerQuery2PHOFWNumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2PHE().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2PHE().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_philheal_empl = " + TRUE;
			else if (view.getComboBoxQuery2PHE().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_philheal_empl = " + FALSE;
		}

		if (!view.getSpinnerQuery2PHENumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_empl_nmem > " + view.getSpinnerQuery2PHENumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2PHENumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_empl_nmem <= " + view.getSpinnerQuery2PHENumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2PHIP().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2PHIP().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_philheal_indiv = " + TRUE;
			else if (view.getComboBoxQuery2PHIP().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_philheal_indiv = " + FALSE;
		}

		if (!view.getSpinnerQuery2PHIPNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_indiv_nmem > " + view.getSpinnerQuery2PHIPNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2PHIPNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_indiv_nmem <= " + view.getSpinnerQuery2PHIPNumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2PHS().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2PHS().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_philheal_spon = " + TRUE;
			else if (view.getComboBoxQuery2PHS().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_philheal_spon = " + FALSE;
		}

		if (!view.getSpinnerQuery2PHSNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_spon_nmem > " + view.getSpinnerQuery2PHSNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2PHSNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_spon_nmem <= " + view.getSpinnerQuery2PHSNumUpper().getValue().toString();
		}

		if (view.getComboBoxQuery2PHL().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery2PHL().getSelectedItem().toString().equals("Nakatanggap"))
				sql += "prog_philheal_life = " + TRUE;
			else if (view.getComboBoxQuery2PHL().getSelectedItem().toString().equals("Hindi Nakatanggap"))
				sql += "prog_philheal_life = " + FALSE;
		}

		if (!view.getSpinnerQuery2PHLNumLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_life_nmem > " + view.getSpinnerQuery2PHLNumLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2PHLNumUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "prog_philheal_life_nmem <= " + view.getSpinnerQuery2PHLNumUpper().getValue().toString();
		}

		if (!view.getSpinnerQuery2OtherProgramsLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "nprog > " + view.getSpinnerQuery2OtherProgramsLower().getValue().toString();
		}

		if (!view.getSpinnerQuery2OtherProgramsUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "nprog <= " + view.getSpinnerQuery2OtherProgramsUpper().getValue().toString();
		}

		return sql;
	}

	public String query3Builder() {
		String sql = "select croptype as 'Uri ng Pananim', COUNT(croptype) as 'Bilang ng Pamilya na Nagtatanim ng Uri ng Tanim' "
				+ "from hpq_crop C JOIN hpq_address A ON C.`main.id`= A.id ";

		
		String group = " group by croptype";

		boolean isMunSelected = view.getCheckBoxQuery3Municipality().isSelected();
		boolean isZoneSelected = view.getCheckBoxQuery3Zone().isSelected();
		boolean isBrgySelected = view.getCheckBoxQuery3Barangay().isSelected();
		boolean isPurokSelected = view.getCheckBoxQuery3Purok().isSelected();
		boolean isCropTypeSelected = view.getCheckBoxQuery3CropType().isSelected();

		if (isMunSelected) {
			sql = appendColumnEntry(sql, "mun as 'Municipality'", "croptype");
			group = appendColumnEntry(group, "mun", "croptype");
		}
		if (isZoneSelected) {
			if (!isMunSelected) {
				sql = appendColumnEntry(sql, "mun as 'Municipality', zone as 'Zone'", "croptype");
				group = appendColumnEntry(group, "mun, zone", "croptype");
			} else {
				sql = appendColumnEntry(sql, "zone as 'Zone'", "croptype");
				group = appendColumnEntry(group, "zone", "croptype");
			}
		}
		if (isBrgySelected) {
			if (!isMunSelected && !isZoneSelected) {
				sql = appendColumnEntry(sql, "mun as 'Municipality', zone as 'Zone', brgy as 'Barangay'", "croptype");
				group = appendColumnEntry(group, "mun, zone, brgy", "croptype");
			} else if (isMunSelected && !isZoneSelected) {
				sql = appendColumnEntry(sql, "zone as 'Zone', brgy as 'Barangay'", "croptype");
				group = appendColumnEntry(group, "zone, brgy", "croptype");
			} else if (isZoneSelected) {
				sql = appendColumnEntry(sql, "brgy as 'Barangay'", "croptype");
				group = appendColumnEntry(group, "brgy", "croptype");
			}
		}
		if (isPurokSelected) {
			if (!isMunSelected && !isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql,
						"mun as 'Municipality', zone as 'Zone', brgy as 'Barangay', purok as 'Purok'", "croptype");
				group = appendColumnEntry(group, "mun, zone, brgy, purok", "croptype");
			} else if (isMunSelected && !isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql, "zone as 'Zone', brgy as 'Barangay', purok as 'Purok'", "croptype");
				group = appendColumnEntry(group, "zone, brgy, purok", "croptype");
			} else if (isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql, "brgy as 'Barangay', purok as 'Purok'", "croptype");
				group = appendColumnEntry(group, "brgy, purok", "croptype");
			} else if (isBrgySelected) {
				sql = appendColumnEntry(sql, "purok as 'Purok'", "croptype");
				group = appendColumnEntry(group, "purok", "croptype");
			}
		}

		if (isMunSelected && view.getComboBoxQuery3Municipality().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "mun = " + view.getComboBoxQuery3Municipality().getSelectedItem().toString();
		}
		if (isZoneSelected && view.getComboBoxQuery3Zone().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "zone = " + view.getComboBoxQuery3Zone().getSelectedItem().toString();
		}
		if (isBrgySelected && view.getComboBoxQuery3Barangay().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "brgy = " + view.getComboBoxQuery3Barangay().getSelectedItem().toString();
		}
		if (isPurokSelected && view.getComboBoxQuery3Purok().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "purok = " + view.getComboBoxQuery3Purok().getSelectedItem().toString();
		}
		if (isCropTypeSelected && view.getComboBoxQuery3CropType().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery3CropType().getSelectedItem().equals("Sugar Cane")) {
				sql += "croptype = 1";
			} else if (view.getComboBoxQuery3CropType().getSelectedItem().equals("Palay")) {
				sql += "croptype = 2";
			} else if (view.getComboBoxQuery3CropType().getSelectedItem().equals("Corn")) {
				sql += "croptype = 3";
			} else if (view.getComboBoxQuery3CropType().getSelectedItem().equals("Coffee")) {
				sql += "croptype = 4";
			} else if (view.getComboBoxQuery3CropType().getSelectedItem().equals("Other Crops")) {
				sql += "croptype = 5";
			}
		}

		sql += group;

		return sql;
	}

	public String query4Builder() {
		String sql = "select mdeady as 'Sanhi ng Pagkamatay', COUNT(mdeady) as 'Bilang ng Sanhi ng Pagkamatay' "
				+ "FROM hpq_death D JOIN hpq_address H ON D.`main.id`= H.id ";

		String group = " group by mdeady";

		boolean isMunSelected = view.getCheckBoxQuery4Municipality().isSelected();
		boolean isZoneSelected = view.getCheckBoxQuery4Zone().isSelected();
		boolean isBrgySelected = view.getCheckBoxQuery4Barangay().isSelected();
		boolean isPurokSelected = view.getCheckBoxQuery4Purok().isSelected();
		boolean isPagkamataySelected = view.getCheckBoxQuery4Pagkamatay().isSelected();

		if (isMunSelected) {
			sql = appendColumnEntry(sql, "mun as 'Municipality'", "mdeady");
			group = appendColumnEntry(group, "mun", "mdeady");
		}
		if (isZoneSelected) {
			if (!isMunSelected) {
				sql = appendColumnEntry(sql, "mun as 'Municipality', zone as 'Zone'", "mdeady");
				group = appendColumnEntry(group, "mun, zone", "mdeady");
			} else {
				sql = appendColumnEntry(sql, "zone as 'Zone'", "mdeady");
				group = appendColumnEntry(group, "zone", "mdeady");
			}
		}
		if (isBrgySelected) {
			if (!isMunSelected && !isZoneSelected) {
				sql = appendColumnEntry(sql, "mun as 'Municipality', zone as 'Zone', brgy as 'Barangay'", "mdeady");
				group = appendColumnEntry(group, "mun, zone, brgy", "mdeady");
			} else if (isMunSelected && !isZoneSelected) {
				sql = appendColumnEntry(sql, "zone as 'Zone', brgy as 'Barangay'", "mdeady");
				group = appendColumnEntry(group, "zone, brgy", "mdeady");
			} else if (isZoneSelected) {
				sql = appendColumnEntry(sql, "brgy as 'Barangay'", "mdeady");
				group = appendColumnEntry(group, "brgy", "mdeady");
			}
		}
		if (isPurokSelected) {
			if (!isMunSelected && !isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql,
						"mun as 'Municipality', zone as 'Zone', brgy as 'Barangay', purok as 'Purok'", "mdeady");
				group = appendColumnEntry(group, "mun, zone, brgy, purok", "mdeady");
			} else if (isMunSelected && !isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql, "zone as 'Zone', brgy as 'Barangay', purok as 'Purok'", "mdeady");
				group = appendColumnEntry(group, "zone, brgy, purok", "mdeady");
			} else if (isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql, "brgy as 'Barangay', purok as 'Purok'", "mdeady");
				group = appendColumnEntry(group, "brgy, purok", "mdeady");
			} else if (isBrgySelected) {
				sql = appendColumnEntry(sql, "purok as 'Purok'", "mdeady");
				group = appendColumnEntry(group, "purok", "mdeady");
			}
		}

		if (isMunSelected && view.getComboBoxQuery4Municipality().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "mun = " + view.getComboBoxQuery4Municipality().getSelectedItem().toString();
		}
		if (isZoneSelected && view.getComboBoxQuery4Zone().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "zone = " + view.getComboBoxQuery4Zone().getSelectedItem().toString();
		}
		if (isBrgySelected && view.getComboBoxQuery4Barangay().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "brgy = " + view.getComboBoxQuery4Barangay().getSelectedItem().toString();
		}
		if (isPurokSelected && view.getComboBoxQuery4Purok().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "purok = " + view.getComboBoxQuery4Purok().getSelectedItem().toString();
		}
		if (isPagkamataySelected && view.getComboBoxQuery4Pagkamatay().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Diseases of the heart")) {
				sql += "mdeady = 1";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Diseases of the vascular system")) {
				sql += "mdeady = 2";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Pneumonia")) {
				sql += "mdeady = 3";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Tuberculosis")) {
				sql += "mdeady = 4";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Cancer")) {
				sql += "mdeady = 5";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Diarrhea")) {
				sql += "mdeady = 6";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Measles")) {
				sql += "mdeady = 7";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem()
					.equals("Complication during pregnancy or childbirth")) {
				sql += "mdeady = 8";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Accident")) {
				sql += "mdeady = 9";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Diabetes")) {
				sql += "mdeady = 10";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Disease of the lungs")) {
				sql += "mdeady = 11";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Disease of the kidney")) {
				sql += "mdeady = 12";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Drowned from flood")) {
				sql += "mdeady = 13";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Victim of Landslide")) {
				sql += "mdeady = 14";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Electrocuted during typhoon")) {
				sql += "mdeady = 15";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Murder")) {
				sql += "mdeady = 16";
			} else if (view.getComboBoxQuery4Pagkamatay().getSelectedItem().equals("Other Causes")) {
				sql += "mdeady = 17";
			}
		}

		sql += group;

		return sql;
	}

	public String query5Builder() {
		String sql = "Select aquaequiptype as 'Gamit sa Pangingisda', "
				+ "SUM(aquani_vol) as 'Bilang ng Nahuling Isda (Kg)' "
				+ "FROM hpq_address join hpq_aquaequip on hpq_address.id = hpq_aquaequip.`main.id` "
				+ "join hpq_aquani on hpq_aquaequip.`main.id` = hpq_aquani.`main.id` ";

		String group = " group by aquaequiptype";

		boolean isMunSelected = view.getCheckBoxQuery5Municipality().isSelected();
		boolean isZoneSelected = view.getCheckBoxQuery5Zone().isSelected();
		boolean isBrgySelected = view.getCheckBoxQuery5Barangay().isSelected();
		boolean isPurokSelected = view.getCheckBoxQuery5Purok().isSelected();
		boolean isKagamitanSelected = view.getCheckBoxQuery5Kagamitan().isSelected();

		if (isMunSelected) {
			sql = appendColumnEntry(sql, "mun as 'Municipality'", "aquaequiptype");
			group = appendColumnEntry(group, "mun", "aquaequiptype");
		}
		if (isZoneSelected) {
			if (!isMunSelected) {
				sql = appendColumnEntry(sql, "mun as 'Municipality', zone as 'Zone'", "aquaequiptype");
				group = appendColumnEntry(group, "mun, zone", "aquaequiptype");
			} else {
				sql = appendColumnEntry(sql, "zone as 'Zone'", "aquaequiptype");
				group = appendColumnEntry(group, "zone", "aquaequiptype");
			}
		}
		if (isBrgySelected) {
			if (!isMunSelected && !isZoneSelected) {
				sql = appendColumnEntry(sql, "mun as 'Municipality', zone as 'Zone', brgy as 'Barangay'",
						"aquaequiptype");
				group = appendColumnEntry(group, "mun, zone, brgy", "aquaequiptype");
			} else if (isMunSelected && !isZoneSelected) {
				sql = appendColumnEntry(sql, "zone as 'Zone', brgy as 'Barangay'", "aquaequiptype");
				group = appendColumnEntry(group, "zone, brgy", "aquaequiptype");
			} else if (isZoneSelected) {
				sql = appendColumnEntry(sql, "brgy as 'Barangay'", "aquaequiptype");
				group = appendColumnEntry(group, "brgy", "aquaequiptype");
			}
		}
		if (isPurokSelected) {
			if (!isMunSelected && !isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql,
						"mun as 'Municipality', zone as 'Zone', brgy as 'Barangay', purok as 'Purok'", "aquaequiptype");
				group = appendColumnEntry(group, "mun, zone, brgy, purok", "aquaequiptype");
			} else if (isMunSelected && !isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql, "zone as 'Zone', brgy as 'Barangay', purok as 'Purok'", "aquaequiptype");
				group = appendColumnEntry(group, "zone, brgy, purok", "aquaequiptype");
			} else if (isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql, "brgy as 'Barangay', purok as 'Purok'", "aquaequiptype");
				group = appendColumnEntry(group, "brgy, purok", "aquaequiptype");
			} else if (isBrgySelected) {
				sql = appendColumnEntry(sql, "purok as 'Purok'", "aquaequiptype");
				group = appendColumnEntry(group, "purok", "aquaequiptype");
			}
		}

		if (isMunSelected && view.getComboBoxQuery5Municipality().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "mun = " + view.getComboBoxQuery5Municipality().getSelectedItem().toString();
		}
		if (isZoneSelected && view.getComboBoxQuery5Zone().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "zone = " + view.getComboBoxQuery5Zone().getSelectedItem().toString();
		}
		if (isBrgySelected && view.getComboBoxQuery5Barangay().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "brgy = " + view.getComboBoxQuery5Barangay().getSelectedItem().toString();
		}
		if (isPurokSelected && view.getComboBoxQuery5Purok().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "purok = " + view.getComboBoxQuery5Purok().getSelectedItem().toString();
		}
		if (isKagamitanSelected && view.getComboBoxQuery5Kagamitan().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			/*
			if (view.getComboBoxQuery5Kagamitan().getSelectedItem().equals("Fish Net")) {
				sql += "aquaequiptype = 1";
			} else if (view.getComboBoxQuery5Kagamitan().getSelectedItem().equals("Electricity")) {
				sql += "aquaequiptype = 2";
			} else if (view.getComboBoxQuery5Kagamitan().getSelectedItem().equals("Bagnet")) {
				sql += "aquaequiptype = 3";
			} else if (view.getComboBoxQuery5Kagamitan().getSelectedItem().equals("Gillnets")) {
				sql += "aquaequiptype = 4";
			} else if (view.getComboBoxQuery5Kagamitan().getSelectedItem().equals("Traps")) {
				sql += "aquaequiptype = 5";
			} else if (view.getComboBoxQuery5Kagamitan().getSelectedItem().equals("Hooks and Line")) {
				sql += "aquaequiptype = 6";
			} else if (view.getComboBoxQuery5Kagamitan().getSelectedItem().equals("Sift Net")) {
				sql += "aquaequiptype = 7";
			} else if (view.getComboBoxQuery5Kagamitan().getSelectedItem().equals("Others")) {
				sql += "aquaequiptype = 8";
			}
			*/
			sql += "aquaequiptype = " + view.getComboBoxQuery5Kagamitan().getSelectedIndex();
		}

		sql += group;

		return sql;
	}

	public String query6Builder() {
		String sql = "Select sum(cropincsh) as 'Kabuuang Kita Mula Sa Ani', "
				+ "sum(crop_vol) as 'Kabuuang Bilang ng Naani', sum(fishincsh) as 'Kabuuang Kita Mula Sa Pangingisda', "
				+ "sum(aquani_vol) as 'Kabuuang Bilang ng Isdang Nahuli' FROM hpq_address H JOIN hpq_crop C "
				+ "ON H.id = C.`main.id` JOIN hpq_aquani A ON C.`main.id` = A.`main.id` JOIN hpq_fishingincome F "
				+ "ON F.id = A.`main.id` JOIN hpq_farmingincome Z ON Z.id = C.`main.id`";

		String group = " group by mun";
		
		boolean isMunSelected = view.getCheckBoxQuery6Municipality().isSelected();
		boolean isZoneSelected = view.getCheckBoxQuery6Zone().isSelected();
		boolean isBrgySelected = view.getCheckBoxQuery6Barangay().isSelected();
		boolean isPurokSelected = view.getCheckBoxQuery6Purok().isSelected();
		
		if (isMunSelected) {
			sql = appendColumnEntry(sql, "mun as 'Municipality'", "sum(cropincsh)");
		}
		if (isZoneSelected) {
			if(!isMunSelected) {
				sql = appendColumnEntry(sql, "mun as 'Municipality', zone as 'Zone'", "sum(cropincsh)");
				group += ", zone";
			} else {
				sql = appendColumnEntry(sql, "zone as 'Zone'", "sum(cropincsh)");
				group += ", zone";
			}
		}
		if (isBrgySelected) {
			if (!isMunSelected && !isZoneSelected) {
				sql = appendColumnEntry(sql, "mun as 'Municipality', zone as 'Zone', brgy as 'Barangay'",
						"sum(cropincsh)");
				group += ", zone, brgy";
			} else if (isMunSelected && !isZoneSelected) {
				sql = appendColumnEntry(sql, "zone as 'Zone', brgy as 'Barangay'", "sum(cropincsh)");
				group += ", zone, brgy";
			} else if (isZoneSelected) {
				sql = appendColumnEntry(sql, "brgy as 'Barangay'", "sum(cropincsh)");
				group += ", brgy";
			}
		}
		if (isPurokSelected) {
			if (!isMunSelected && !isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql, "mun as 'Municipality', zone as 'Zone', brgy as 'Barangay', purok as 'Purok'", "sum(cropincsh)");
				group += ", zone, brgy, purok";
			} else if (isMunSelected && !isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql, "zone as 'Zone', brgy as 'Barangay', purok as 'Purok'", "sum(cropincsh)");
				group += ", zone, brgy, purok";
			} else if (isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql, "brgy as 'Barangay', purok as 'Purok'", "sum(cropincsh)");
				group += ", brgy, purok";
			} else if (isBrgySelected) {
				sql = appendColumnEntry(sql, "purok as 'Purok'", "sum(cropincsh)");
				group += ", purok";
			}
		}

		if (isMunSelected && view.getComboBoxQuery6Municipality().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "mun = " + view.getComboBoxQuery6Municipality().getSelectedItem().toString();
		}
		if (isZoneSelected && view.getComboBoxQuery6Zone().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "zone = " + view.getComboBoxQuery6Zone().getSelectedItem().toString();
		}
		if (isBrgySelected && view.getComboBoxQuery6Barangay().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "brgy = " + view.getComboBoxQuery6Barangay().getSelectedItem().toString();
		}
		if (isPurokSelected && view.getComboBoxQuery6Purok().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "purok = " + view.getComboBoxQuery6Purok().getSelectedItem().toString();
		}
		
		sql += group;
		
		return sql;
	}

	public String query7Builder() {
		String sql = "SELECT A.id as 'Numero ng Sambahayan', memno as 'Numero ng Miyembro', age_yr as 'Edad', occup as 'Trabaho', yrs_in_cropind as 'Bilang ng Taon sa Pagsasaka', nalp as 'Bilang ng Parcela ng Lupa na Sinasaka', ncrop as 'Bilang ng Uri ng Pananim noong Isang Taon', wagcshm as 'Kabuuang Sweldo', "
				+ "agriequip1 as 'Gumagamit ng Beast of Burden', agriequip2 as 'Gumagamit ng Plow', agriequip3 as 'Gumagamit ng Harrow', agriequip4 as 'Gumagamit ng Mower', agriequip5 as 'Gumagamit ng Thresher', agriequip6 as 'Gumagamit ng Insecticide Sprayer', "
				+ "agriequip7 as 'Gumagamit ng Farm Tractor', agriequip8 as 'Gumagamit ng Hand Tractor', agriequip9 as 'Gumagamit ng Mudboat', agriequip10 as 'Gumagamit ng Planter', agriequip11 as 'Gumagamit ng Mechanical Dryer', agriequip12 as 'Gumagamit ng Drying Pavement', "
				+ "agriequip13 as 'Gumagamit ng Feed Mill', agriequip14 as 'Gumagamit ng Harvester', agriequip15 as 'Gumagamit ng Warehouse Granary', agriequip16 as 'Gumagamit ng Farmshed', agriequip17 as 'Gumagamit ng Irrigation Pump', agriequip18 as 'Gumagamit ng iba pang Kagamitan', "
				+ "u_amt_harv as 'Dami ng Ani Kumpara sa Nakaraang Taon', u_low_harv as 'Dahilan ng Pagbaba ng Ani', croptype AS 'Uri ng Pananim', SUM(crop_vol) AS 'Dami ng Ani ng Uri ng Pananim' "
				+ "FROM hpq_address A JOIN hpq_memberoccupationrecord O ON A.id = O.`main.id` JOIN hpq_crop C ON A.id = C.`main.id` JOIN hpq_arcdp_mem D ON A.id = D.`main.id` JOIN hpq_memberfarmingoccupationrecord F ON A.id = F.id JOIN hpq_agriequip E ON A.id = E.id AND D.arcdp_mem_refno = O.memno ";

		String group = " group by A.id, memno, croptype";

		String hasARCDP = view.getComboBoxQuery7ARCDP().getSelectedItem().toString();
		if (hasARCDP.equals("Nakatanggap")) {
			sql += "JOIN hpq_arcdp_mem AM ON F.id = AM.`main.id` AND AM.arcdp_mem_refno = O.memno where F.prog_arcdp = 1";
		} else if (hasARCDP.equals("Hindi Nakatanggap")) {
			sql += "LEFT JOIN hpq_arcdp_mem AM ON F.id = AM.`main.id` AND AM.arcdp_mem_refno = O.memno where A.`main.id` IS NULL";
		}
		boolean isMunSelected = view.getCheckBoxQuery7Municipality().isSelected();
		boolean isZoneSelected = view.getCheckBoxQuery7Zone().isSelected();
		boolean isBrgySelected = view.getCheckBoxQuery7Barangay().isSelected();
		boolean isPurokSelected = view.getCheckBoxQuery7Purok().isSelected();
		boolean isCropTypeSelected = view.getCheckBoxQuery7CropType().isSelected();

		if (isMunSelected) {
			sql = appendColumnEntry(sql, "mun as 'Municipality'", "age_yr");
			group = appendColumnEntry(group, "mun", "memno");
		}
		if (isZoneSelected) {
			if (!isMunSelected) {
				sql = appendColumnEntry(sql, "mun as 'Municipality', zone as 'Zone'", "age_yr");
				group = appendColumnEntry(group, "mun, zone", "memno");
			} else {
				sql = appendColumnEntry(sql, "zone as 'Zone'", "age_yr");
				group = appendColumnEntry(group, "zone", "memno");
			}
		}
		if (isBrgySelected) {
			if (!isMunSelected && !isZoneSelected) {
				sql = appendColumnEntry(sql, "mun as 'Municipality', zone as 'Zone', brgy as 'Barangay'", "age_yr");
				group = appendColumnEntry(group, "mun, zone, brgy", "memno");
			} else if (isMunSelected && !isZoneSelected) {
				sql = appendColumnEntry(sql, "zone as 'Zone', brgy as 'Barangay'", "age_yr");
				group = appendColumnEntry(group, "zone, brgy", "memno");
			} else if (isZoneSelected) {
				sql = appendColumnEntry(sql, "brgy as 'Barangay'", "age_yr");
				group = appendColumnEntry(group, "brgy", "memno");
			}
		}
		if (isPurokSelected) {
			if (!isMunSelected && !isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql,
						"mun as 'Municipality', zone as 'Zone', brgy as 'Barangay', purok as 'Purok'", "age_yr");
				group = appendColumnEntry(group, "mun, zone, brgy, purok", "memno");
			} else if (isMunSelected && !isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql, "zone as 'Zone', brgy as 'Barangay', purok as 'Purok'", "age_yr");
				group = appendColumnEntry(group, "zone, brgy, purok", "memno");
			} else if (isZoneSelected && !isBrgySelected) {
				sql = appendColumnEntry(sql, "brgy as 'Barangay', purok as 'Purok'", "age_yr");
				group = appendColumnEntry(group, "brgy, purok", "memno");
			} else if (isBrgySelected) {
				sql = appendColumnEntry(sql, "purok as 'Purok'", "age_yr");
				group = appendColumnEntry(group, "purok", "memno");
			}
		}

		String item;
		if (view.getComboBoxQuery7BeastOfBurden().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7BeastOfBurden().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip1 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip1 = " + FALSE;
		}

		if (view.getComboBoxQuery7Plow().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7Plow().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip2 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip2 = " + FALSE;
		}

		if (view.getComboBoxQuery7Harrow().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7Harrow().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip3 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip3 = " + FALSE;
		}

		if (view.getComboBoxQuery7Mower().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7Mower().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip4 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip4 = " + FALSE;
		}

		if (view.getComboBoxQuery7Thresher().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7Thresher().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip5 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip5 = " + FALSE;
		}

		if (view.getComboBoxQuery7InsecticideSprayer().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7InsecticideSprayer().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip6 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip6 = " + FALSE;
		}

		if (view.getComboBoxQuery7FarmTractor().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7FarmTractor().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip7 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip7 = " + FALSE;
		}

		if (view.getComboBoxQuery7HandTractor().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7HandTractor().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip8 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip8 = " + FALSE;
		}

		if (view.getComboBoxQuery7Mudboat().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7Mudboat().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip9 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip9 = " + FALSE;
		}

		if (view.getComboBoxQuery7PlanterDryer().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7PlanterDryer().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip10 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip10 = " + FALSE;
		}

		if (view.getComboBoxQuery7MechanicalDryer().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7MechanicalDryer().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip11 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip11 = " + FALSE;
		}

		if (view.getComboBoxQuery7DryingPavement().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7DryingPavement().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip12 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip12 = " + FALSE;
		}

		if (view.getComboBoxQuery7FeedMill().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7FeedMill().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip13 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip13 = " + FALSE;
		}

		if (view.getComboBoxQuery7Harvester().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7Harvester().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip14 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip14 = " + FALSE;
		}

		if (view.getComboBoxQuery7WarehouseGranary().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7WarehouseGranary().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip15 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip15 = " + FALSE;
		}

		if (view.getComboBoxQuery7Farmshed().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7Farmshed().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip16 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip16 = " + FALSE;
		}

		if (view.getComboBoxQuery7IrrigationPump().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7IrrigationPump().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip17 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip17 = " + FALSE;
		}

		if (view.getComboBoxQuery7Others().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7Others().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "agriequip18 = " + TRUE;
			else if (item.equals("Wala"))
				sql += "agriequip18 = " + FALSE;
		}

		if (view.getComboBoxQuery7CropInsurance().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7CropInsurance().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "irfa_crop = " + TRUE;
			else if (item.equals("Wala"))
				sql += "irfa_crop = " + FALSE;
		}

		if (view.getComboBoxQuery7EquipmentInsurance().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			item = view.getComboBoxQuery7EquipmentInsurance().getSelectedItem().toString();
			if (item.equals("Mayroon"))
				sql += "irfa_agriequip = " + TRUE;
			else if (item.equals("Wala"))
				sql += "irfa_agriequip = " + FALSE;
		}
		
		int dahilanIndex = view.getComboBoxQuery7Dahilan().getSelectedIndex();
		if (dahilanIndex != 0) {
			sql = appendWhereChecker(sql);
			sql += "u_low_harv = " + dahilanIndex;
		}

		if (isMunSelected && view.getComboBoxQuery7Municipality().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "mun = " + view.getComboBoxQuery7Municipality().getSelectedItem().toString();
		}
		if (isZoneSelected && view.getComboBoxQuery7Zone().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "zone = " + view.getComboBoxQuery7Zone().getSelectedItem().toString();
		}
		if (isBrgySelected && view.getComboBoxQuery7Barangay().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "brgy = " + view.getComboBoxQuery7Barangay().getSelectedItem().toString();
		}
		if (isPurokSelected && view.getComboBoxQuery7Purok().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			sql += "purok = " + view.getComboBoxQuery7Purok().getSelectedItem().toString();
		}

		if (isCropTypeSelected && view.getComboBoxQuery7CropType().getSelectedIndex() != 0) {
			sql = appendWhereChecker(sql);
			if (view.getComboBoxQuery7CropType().getSelectedItem().equals("Sugar Cane")) {
				sql += "croptype = 1";
			} else if (view.getComboBoxQuery7CropType().getSelectedItem().equals("Palay")) {
				sql += "croptype = 2";
			} else if (view.getComboBoxQuery7CropType().getSelectedItem().equals("Corn")) {
				sql += "croptype = 3";
			} else if (view.getComboBoxQuery7CropType().getSelectedItem().equals("Coffee")) {
				sql += "croptype = 4";
			} else if (view.getComboBoxQuery7CropType().getSelectedItem().equals("Other Crops")) {
				sql += "croptype = 5";
			}
		}

		if (!view.getSpinnerQuery7AgeLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "age_yr >= " + view.getSpinnerQuery7AgeLower().getValue().toString();
		}

		if (!view.getSpinnerQuery7AgeUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "age_yr <= " + view.getSpinnerQuery7AgeUpper().getValue().toString();
		}

		if (!view.getSpinnerQuery7YearFarmingLower().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "yrs_in_cropind >= " + view.getSpinnerQuery7YearFarmingLower().getValue().toString();
		}

		if (!view.getSpinnerQuery7YearFarmingUpper().getValue().toString().equals("-1")) {
			sql = appendWhereChecker(sql);
			sql += "yrs_in_cropind <= " + view.getSpinnerQuery7YearFarmingUpper().getValue().toString();
		}
		sql += group;

		return sql;
	}

	public void modelTableHouseTypeConverter() {
		List<String> columnNames = Arrays.asList(modelTable.getColumnName());
		int columnIndex = columnNames.indexOf("House Type");
		for (int i = 0; i < modelTable.getData().length; i++) {
			if (modelTable.getData()[i][columnIndex].equals("1")) {
				modelTable.getData()[i][columnIndex] = "Single house";
			} else if (modelTable.getData()[i][columnIndex].equals("2")) {
				modelTable.getData()[i][columnIndex] = "Duplex";
			} else if (modelTable.getData()[i][columnIndex].equals("3")) {
				modelTable.getData()[i][columnIndex] = "Multi-unit Residential";
			} else if (modelTable.getData()[i][columnIndex].equals("4")) {
				modelTable.getData()[i][columnIndex] = "Commercial/Industrial/Agricultural";
			} else if (modelTable.getData()[i][columnIndex].equals("5")) {
				modelTable.getData()[i][columnIndex] = "Others";
			}
		}
	}

	public void modelTableRoofCompositionConverter() {
		List<String> columnNames = Arrays.asList(modelTable.getColumnName());
		int columnIndex = columnNames.indexOf("Roof Composition");
		for (int i = 0; i < modelTable.getData().length; i++) {
			if (modelTable.getData()[i][columnIndex].equals("1")) {
				modelTable.getData()[i][columnIndex] = "Strong materials";
			} else if (modelTable.getData()[i][columnIndex].equals("2")) {
				modelTable.getData()[i][columnIndex] = "Light materials";
			} else if (modelTable.getData()[i][columnIndex].equals("3")) {
				modelTable.getData()[i][columnIndex] = "Makeshift materials";
			} else if (modelTable.getData()[i][columnIndex].equals("4")) {
				modelTable.getData()[i][columnIndex] = "Mixed but predominantly strong materials";
			} else if (modelTable.getData()[i][columnIndex].equals("5")) {
				modelTable.getData()[i][columnIndex] = "Mixed but predominantly light materials";
			} else if (modelTable.getData()[i][columnIndex].equals("6")) {
				modelTable.getData()[i][columnIndex] = "Mixed but predominantly makeshift materials";
			} else if (modelTable.getData()[i][columnIndex].equals("7")) {
				modelTable.getData()[i][columnIndex] = "Not Applicable";
			}
		}
	}

	public void modelTableWallCompositionConverter() {
		List<String> columnNames = Arrays.asList(modelTable.getColumnName());
		int columnIndex = columnNames.indexOf("Wall Composition");
		for (int i = 0; i < modelTable.getData().length; i++) {
			if (modelTable.getData()[i][columnIndex].equals("1")) {
				modelTable.getData()[i][columnIndex] = "Strong materials";
			} else if (modelTable.getData()[i][columnIndex].equals("2")) {
				modelTable.getData()[i][columnIndex] = "Light materials";
			} else if (modelTable.getData()[i][columnIndex].equals("3")) {
				modelTable.getData()[i][columnIndex] = "Makeshift materials";
			} else if (modelTable.getData()[i][columnIndex].equals("4")) {
				modelTable.getData()[i][columnIndex] = "Mixed but predominantly strong materials";
			} else if (modelTable.getData()[i][columnIndex].equals("5")) {
				modelTable.getData()[i][columnIndex] = "Mixed but predominantly light materials";
			} else if (modelTable.getData()[i][columnIndex].equals("6")) {
				modelTable.getData()[i][columnIndex] = "Mixed but predominantly makeshift materials";
			} else if (modelTable.getData()[i][columnIndex].equals("7")) {
				modelTable.getData()[i][columnIndex] = "Not Applicable";
			}
		}
	}

	public void modelTableUriNgPananimConverter() {
		List<String> columnNames = Arrays.asList(modelTable.getColumnName());
		int columnIndex = columnNames.indexOf("Uri ng Pananim");
		for (int i = 0; i < modelTable.getData().length; i++) {
			if (modelTable.getData()[i][columnIndex].equals("1")) {
				modelTable.getData()[i][columnIndex] = "Sugar Cane";
			} else if (modelTable.getData()[i][columnIndex].equals("2")) {
				modelTable.getData()[i][columnIndex] = "Palay";
			} else if (modelTable.getData()[i][columnIndex].equals("3")) {
				modelTable.getData()[i][columnIndex] = "Corn";
			} else if (modelTable.getData()[i][columnIndex].equals("4")) {
				modelTable.getData()[i][columnIndex] = "Coffee";
			} else if (modelTable.getData()[i][columnIndex].equals("5")) {
				modelTable.getData()[i][columnIndex] = "Other Crops";
			}
		}
	}

	public void modelTableSanhiNgPagkamatayConverter() {
		List<String> columnNames = Arrays.asList(modelTable.getColumnName());
		int columnIndex = columnNames.indexOf("Sanhi ng Pagkamatay");
		for (int i = 0; i < modelTable.getData().length; i++) {
			if (modelTable.getData()[i][columnIndex].equals("1")) {
				modelTable.getData()[i][columnIndex] = "Diseases of the heart";
			} else if (modelTable.getData()[i][columnIndex].equals("2")) {
				modelTable.getData()[i][columnIndex] = "Diseases of the vascular system";
			} else if (modelTable.getData()[i][columnIndex].equals("3")) {
				modelTable.getData()[i][columnIndex] = "Pneumonia";
			} else if (modelTable.getData()[i][columnIndex].equals("4")) {
				modelTable.getData()[i][columnIndex] = "Tuberculosis";
			} else if (modelTable.getData()[i][columnIndex].equals("5")) {
				modelTable.getData()[i][columnIndex] = "Cancer";
			} else if (modelTable.getData()[i][columnIndex].equals("6")) {
				modelTable.getData()[i][columnIndex] = "Diarrhea";
			} else if (modelTable.getData()[i][columnIndex].equals("7")) {
				modelTable.getData()[i][columnIndex] = "Measles";
			} else if (modelTable.getData()[i][columnIndex].equals("8")) {
				modelTable.getData()[i][columnIndex] = "Complication during pregancy or childbirth";
			} else if (modelTable.getData()[i][columnIndex].equals("9")) {
				modelTable.getData()[i][columnIndex] = "Accident";
			} else if (modelTable.getData()[i][columnIndex].equals("10")) {
				modelTable.getData()[i][columnIndex] = "Diabetes";
			} else if (modelTable.getData()[i][columnIndex].equals("11")) {
				modelTable.getData()[i][columnIndex] = "Disease of the lungs";
			} else if (modelTable.getData()[i][columnIndex].equals("12")) {
				modelTable.getData()[i][columnIndex] = "Disease of the kidney";
			} else if (modelTable.getData()[i][columnIndex].equals("13")) {
				modelTable.getData()[i][columnIndex] = "Drowned from flood";
			} else if (modelTable.getData()[i][columnIndex].equals("14")) {
				modelTable.getData()[i][columnIndex] = "Victim of landslide";
			} else if (modelTable.getData()[i][columnIndex].equals("15")) {
				modelTable.getData()[i][columnIndex] = "Electrocuted during typhoon";
			} else if (modelTable.getData()[i][columnIndex].equals("16")) {
				modelTable.getData()[i][columnIndex] = "Murder";
			} else if (modelTable.getData()[i][columnIndex].equals("17")) {
				modelTable.getData()[i][columnIndex] = "Other causes";
			}
		}
	}

	public void modelTableGamitSaPangingisdaConverter() {
		List<String> columnNames = Arrays.asList(modelTable.getColumnName());
		int columnIndex = columnNames.indexOf("Gamit sa Pangingisda");
		for (int i = 0; i < modelTable.getData().length; i++) {
			if (modelTable.getData()[i][columnIndex].equals("1")) {
				modelTable.getData()[i][columnIndex] = "Fish net";
			} else if (modelTable.getData()[i][columnIndex].equals("2")) {
				modelTable.getData()[i][columnIndex] = "Electricity";
			} else if (modelTable.getData()[i][columnIndex].equals("3")) {
				modelTable.getData()[i][columnIndex] = "Bagnets";
			} else if (modelTable.getData()[i][columnIndex].equals("4")) {
				modelTable.getData()[i][columnIndex] = "Gillnets";
			} else if (modelTable.getData()[i][columnIndex].equals("5")) {
				modelTable.getData()[i][columnIndex] = "Traps";
			} else if (modelTable.getData()[i][columnIndex].equals("6")) {
				modelTable.getData()[i][columnIndex] = "Hooks and line";
			} else if (modelTable.getData()[i][columnIndex].equals("7")) {
				modelTable.getData()[i][columnIndex] = "Sift net";
			} else if (modelTable.getData()[i][columnIndex].equals("8")) {
				modelTable.getData()[i][columnIndex] = "Others";
			}
		}
	}
}
