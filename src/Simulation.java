package original_joint_fm_lm_shareability;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;

import com.anylogic.libraries.modules.markup_descriptors.*;
import com.anylogic.libraries.processmodeling.*;
import com.anylogic.libraries.pypeline.*;

import com.querydsl.core.Tuple;
import com.querydsl.sql.SQLBindings;
import static original_joint_fm_lm_shareability.DBDescriptor.*;


import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 


public class Simulation extends ExperimentSimulation<Main> {
  @AnyLogicInternalCodegenAPI
  public static String[] COMMAND_LINE_ARGUMENTS_xjal = new String[0];
  {
    setCommandLineArguments_xjal( COMMAND_LINE_ARGUMENTS_xjal );
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Simulation.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  // View areas
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("SansSerif", 0, 24 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text1_Font = new Font("SansSerif", 0, 11 );
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _text1 = 2;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 3;


  protected ShapeText text;
  protected ShapeText text1;
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    text = new ShapeText(
        SHAPE_DRAW_2D, true,40.0, 30.0, 0.0, 0.0, 
        royalBlue,"Agent-based model for efficient last-mile connectivity",
        _text_Font, ALIGNMENT_LEFT );

    text1 = new ShapeText(
        SHAPE_DRAW_2D, true,40.0, 70.0, 0.0, 0.0, 
        black,"To provide efficient last-mile connectivity of metro trips, we propose a system where a fleet of vehicles \r\n(initially parked at metro stations) are assigned last-mile trip requests from passengers in a First In First Out (FIFO) manner. \r\n\r\nTo achieve this, we: \r\na) analyze the exit (demand) data from metro stations along with train arrival schedule; \r\nb) propose a combination of Agent-Based and Event-Based Modelling approaches using a software to model the interaction \r\nbetween passengers and autos; \r\nc) develop an optimization model to minimize the number of lost demands. \r\n\r\nLost demand is calculated based on passengers who have to wait beyond a certain threshold. The optimization model's \r\nimpact on end-to-end commute time of commuters, utilization rate of auto vehicles, and revenues of auto drivers are also studied.",
        _text1_Font, ALIGNMENT_LEFT );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

  @Override
  public int getWindowWidth() {
    return 1280;
  }

  @Override
  public int getWindowHeight() {
    return 1280;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onDestroy_xjal() {
    super.onDestroy_xjal();
  }


  @Override
  @AnyLogicInternalCodegenAPI
  public void initDefaultRandomNumberGenerator(Engine _e) {
    _e.getDefaultRandomGenerator().setSeed( 5 );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Main createRoot( Engine engine ) {
    // Create the root object
    return new Main( engine, null, null );
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupRootParameters( final Main self, boolean callOnChangeActions ) {
    final Main root = self; // for compatibility
    double autoSpeed_xjal;
    autoSpeed_xjal = self._autoSpeed_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_autoSpeed( autoSpeed_xjal );
    } else {
      self.autoSpeed = autoSpeed_xjal;
    }
    int maxWaitingTime_xjal;
    maxWaitingTime_xjal = self._maxWaitingTime_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_maxWaitingTime( maxWaitingTime_xjal );
    } else {
      self.maxWaitingTime = maxWaitingTime_xjal;
    }
    int[] numAutos_xjal;
    numAutos_xjal = self._numAutos_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_numAutos( numAutos_xjal );
    } else {
      self.numAutos = numAutos_xjal;
    }
    int numMetroStations_xjal;
    numMetroStations_xjal = self._numMetroStations_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_numMetroStations( numMetroStations_xjal );
    } else {
      self.numMetroStations = numMetroStations_xjal;
    }
    int numAutosEach_xjal;
    numAutosEach_xjal = self._numAutosEach_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_numAutosEach( numAutosEach_xjal );
    } else {
      self.numAutosEach = numAutosEach_xjal;
    }
    int maxDetourTime_xjal;
    maxDetourTime_xjal = self._maxDetourTime_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_maxDetourTime( maxDetourTime_xjal );
    } else {
      self.maxDetourTime = maxDetourTime_xjal;
    }
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeSimulationRun( Main root ) {
    // Before simulation run code
    
traceln("beginning simulation");
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();  
traceln("simulation start time: " + dtf.format(now));  

 
  }


  /**
   * Engine setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupEngine(Engine engine) {
    engine.setATOL( 1.0E-5 );
    engine.setRTOL( 1.0E-5 );
    engine.setTTOL( 1.0E-5 );
    engine.setHTOL( 0.001 );
    engine.setSolverODE( Engine.SOLVER_ODE_EULER );
    engine.setSolverNAE( Engine.SOLVER_NAE_MODIFIED_NEWTON );
    engine.setSolverDAE( Engine.SOLVER_DAE_RK45_NEWTON );
    engine.setVMethods( 394549 );
    engine.setSimultaneousEventsSelectionMode( Engine.EVENT_SELECTION_LIFO );

    engine.setStartTime( 0.0 );
    engine.setTimeUnit( SECOND );
    engine.setStartDate( toDate( 2021, APRIL, 22, 5, 0, 0 ) );
    engine.setStopTime( 72000.0 );
    engine.setRealTimeMode( true );
    engine.setRealTimeScale( 1.0 );
  }

  /**
   * Experiment setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setup( IExperimentHost _e ) {
    setName( "Majestic_Network : Simulation" );

    // Static initialization of persistent elements
    _createPersistentElementsBP0_xjal();

    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup( Simulation.this, true, 0, 0, 0, 0 , text, text1 );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
    icon = new ShapeModelElementsGroup( Simulation.this, getElementProperty( "original_joint_fm_lm_shareability.Simulation.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    _e.setZoomAndPanningEnabled( true );
    _e.setDeveloperPanelEnabled( true );
    _e.setDeveloperPanelVisibleOnStart( true );
	runAndShowRoot_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onEngineFinished() {
    final Main root = (Main) getEngine().getRoot();
    // After simulation run code

root.getStationWiseStatistics();
root.getLogsTimeWindow();
root.getAutoIdleStats(); 
  }

}
