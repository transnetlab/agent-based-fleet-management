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

import java.awt.geom.Arc2D;

import java.io.*;
import java.util.stream.Collectors;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.lang.Math;
import java.text.DecimalFormat; 

public class Main extends Agent
{
  /**
   * eventTrainEW Dynamic Event Class
   */  
  public static class eventTrainEW extends DynamicEvent {
    public int time_index;
  
    /**
     * Constructor<br>
     * Use <code>create_eventTrainEW</code> method
     */
    public eventTrainEW( Main _ao_xjal, double _dt_xjal , int time_index ) {
      this( _ao_xjal, _dt_xjal, false
		, time_index );
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventTrainEW</code> method
     */
    public eventTrainEW( Main _ao_xjal, double _dt_xjal, TimeUnits _units , int time_index ) {
      this( _ao_xjal, _dt_xjal, _units, false
		, time_index );
    }
  
    /**
     * Constructor<br>
     * Use <code>create_eventTrainEW</code> method
     */
    public eventTrainEW( Main _ao_xjal, double _t_xjal, boolean _absolute_xjal , int time_index ) {
      super( _ao_xjal, _t_xjal, _absolute_xjal );
      this.time_index = time_index;
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventTrainEW</code> method
     */
    public eventTrainEW( Main _ao_xjal, double _t_xjal, TimeUnits _units, boolean _absolute_xjal , int time_index ) {
      super( _ao_xjal, _t_xjal, _units, _absolute_xjal );
      this.time_index = time_index;
    }

    @AnyLogicInternalCodegenAPI
    public void execute() {
      super.execute(); // must be called!
      ((Main) getAgent()).on_eventTrainEW_xjal( time_index );
    }
  }

  /**
   * eventFMPassengerArrival Dynamic Event Class
   */  
  public static class eventFMPassengerArrival extends DynamicEvent {
    public int idPassenger;
    public boolean isAssignedAuto;
    public String firstMileDestination;
  
    /**
     * Constructor<br>
     * Use <code>create_eventFMPassengerArrival</code> method
     */
    public eventFMPassengerArrival( Main _ao_xjal, double _dt_xjal , int idPassenger, boolean isAssignedAuto, String firstMileDestination ) {
      this( _ao_xjal, _dt_xjal, false
		, idPassenger
		, isAssignedAuto
		, firstMileDestination );
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventFMPassengerArrival</code> method
     */
    public eventFMPassengerArrival( Main _ao_xjal, double _dt_xjal, TimeUnits _units , int idPassenger, boolean isAssignedAuto, String firstMileDestination ) {
      this( _ao_xjal, _dt_xjal, _units, false
		, idPassenger
		, isAssignedAuto
		, firstMileDestination );
    }
  
    /**
     * Constructor<br>
     * Use <code>create_eventFMPassengerArrival</code> method
     */
    public eventFMPassengerArrival( Main _ao_xjal, double _t_xjal, boolean _absolute_xjal , int idPassenger, boolean isAssignedAuto, String firstMileDestination ) {
      super( _ao_xjal, _t_xjal, _absolute_xjal );
      this.idPassenger = idPassenger;
      this.isAssignedAuto = isAssignedAuto;
      this.firstMileDestination = firstMileDestination;
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventFMPassengerArrival</code> method
     */
    public eventFMPassengerArrival( Main _ao_xjal, double _t_xjal, TimeUnits _units, boolean _absolute_xjal , int idPassenger, boolean isAssignedAuto, String firstMileDestination ) {
      super( _ao_xjal, _t_xjal, _units, _absolute_xjal );
      this.idPassenger = idPassenger;
      this.isAssignedAuto = isAssignedAuto;
      this.firstMileDestination = firstMileDestination;
    }

    @AnyLogicInternalCodegenAPI
    public void execute() {
      super.execute(); // must be called!
      ((Main) getAgent()).on_eventFMPassengerArrival_xjal( idPassenger, isAssignedAuto, firstMileDestination );
    }
  }

  /**
   * eventTrainNS Dynamic Event Class
   */  
  public static class eventTrainNS extends DynamicEvent {
    public int time_index;
  
    /**
     * Constructor<br>
     * Use <code>create_eventTrainNS</code> method
     */
    public eventTrainNS( Main _ao_xjal, double _dt_xjal , int time_index ) {
      this( _ao_xjal, _dt_xjal, false
		, time_index );
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventTrainNS</code> method
     */
    public eventTrainNS( Main _ao_xjal, double _dt_xjal, TimeUnits _units , int time_index ) {
      this( _ao_xjal, _dt_xjal, _units, false
		, time_index );
    }
  
    /**
     * Constructor<br>
     * Use <code>create_eventTrainNS</code> method
     */
    public eventTrainNS( Main _ao_xjal, double _t_xjal, boolean _absolute_xjal , int time_index ) {
      super( _ao_xjal, _t_xjal, _absolute_xjal );
      this.time_index = time_index;
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventTrainNS</code> method
     */
    public eventTrainNS( Main _ao_xjal, double _t_xjal, TimeUnits _units, boolean _absolute_xjal , int time_index ) {
      super( _ao_xjal, _t_xjal, _units, _absolute_xjal );
      this.time_index = time_index;
    }

    @AnyLogicInternalCodegenAPI
    public void execute() {
      super.execute(); // must be called!
      ((Main) getAgent()).on_eventTrainNS_xjal( time_index );
    }
  }

  /**
   * eventTrainEWRev Dynamic Event Class
   */  
  public static class eventTrainEWRev extends DynamicEvent {
    public int time_index;
  
    /**
     * Constructor<br>
     * Use <code>create_eventTrainEWRev</code> method
     */
    public eventTrainEWRev( Main _ao_xjal, double _dt_xjal , int time_index ) {
      this( _ao_xjal, _dt_xjal, false
		, time_index );
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventTrainEWRev</code> method
     */
    public eventTrainEWRev( Main _ao_xjal, double _dt_xjal, TimeUnits _units , int time_index ) {
      this( _ao_xjal, _dt_xjal, _units, false
		, time_index );
    }
  
    /**
     * Constructor<br>
     * Use <code>create_eventTrainEWRev</code> method
     */
    public eventTrainEWRev( Main _ao_xjal, double _t_xjal, boolean _absolute_xjal , int time_index ) {
      super( _ao_xjal, _t_xjal, _absolute_xjal );
      this.time_index = time_index;
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventTrainEWRev</code> method
     */
    public eventTrainEWRev( Main _ao_xjal, double _t_xjal, TimeUnits _units, boolean _absolute_xjal , int time_index ) {
      super( _ao_xjal, _t_xjal, _units, _absolute_xjal );
      this.time_index = time_index;
    }

    @AnyLogicInternalCodegenAPI
    public void execute() {
      super.execute(); // must be called!
      ((Main) getAgent()).on_eventTrainEWRev_xjal( time_index );
    }
  }

  /**
   * eventTrainNSRev Dynamic Event Class
   */  
  public static class eventTrainNSRev extends DynamicEvent {
    public int time_index;
  
    /**
     * Constructor<br>
     * Use <code>create_eventTrainNSRev</code> method
     */
    public eventTrainNSRev( Main _ao_xjal, double _dt_xjal , int time_index ) {
      this( _ao_xjal, _dt_xjal, false
		, time_index );
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventTrainNSRev</code> method
     */
    public eventTrainNSRev( Main _ao_xjal, double _dt_xjal, TimeUnits _units , int time_index ) {
      this( _ao_xjal, _dt_xjal, _units, false
		, time_index );
    }
  
    /**
     * Constructor<br>
     * Use <code>create_eventTrainNSRev</code> method
     */
    public eventTrainNSRev( Main _ao_xjal, double _t_xjal, boolean _absolute_xjal , int time_index ) {
      super( _ao_xjal, _t_xjal, _absolute_xjal );
      this.time_index = time_index;
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventTrainNSRev</code> method
     */
    public eventTrainNSRev( Main _ao_xjal, double _t_xjal, TimeUnits _units, boolean _absolute_xjal , int time_index ) {
      super( _ao_xjal, _t_xjal, _units, _absolute_xjal );
      this.time_index = time_index;
    }

    @AnyLogicInternalCodegenAPI
    public void execute() {
      super.execute(); // must be called!
      ((Main) getAgent()).on_eventTrainNSRev_xjal( time_index );
    }
  }

  // Parameters

  public 
double  autoSpeed;

  /**
   * Returns default value for parameter <code>autoSpeed</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _autoSpeed_DefaultValue_xjal() {
    final Main self = this;
    return 
5.9 
;
  }

  public void set_autoSpeed( double value ) {
    if (value == this.autoSpeed) {
      return;
    }
    double _oldValue_xjal = this.autoSpeed;
    this.autoSpeed = value;
    onChange_autoSpeed_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter autoSpeed.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_autoSpeed()</code> method instead.
   */
  protected void onChange_autoSpeed() {
    onChange_autoSpeed_xjal( autoSpeed );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_autoSpeed_xjal( double oldValue ) {
	int index;
    index = 0;
    for ( com.anylogic.libraries.processmodeling.ResourcePool<Autos> self : resourcePool ) {
      
      double _value;
      _value = autoSpeed
;
      self.set_speed( _value );
      index++;
    }  
  }


  public 
int  maxWaitingTime;

  /**
   * Returns default value for parameter <code>maxWaitingTime</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _maxWaitingTime_DefaultValue_xjal() {
    final Main self = this;
    return 
420 
;
  }

  public void set_maxWaitingTime( int value ) {
    if (value == this.maxWaitingTime) {
      return;
    }
    int _oldValue_xjal = this.maxWaitingTime;
    this.maxWaitingTime = value;
    onChange_maxWaitingTime_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter maxWaitingTime.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_maxWaitingTime()</code> method instead.
   */
  protected void onChange_maxWaitingTime() {
    onChange_maxWaitingTime_xjal( maxWaitingTime );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_maxWaitingTime_xjal( int oldValue ) {  
  }


  public 
int[]  numAutos;

  /**
   * Returns default value for parameter <code>numAutos</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int[] _numAutos_DefaultValue_xjal() {
    final Main self = this;
    return 
new int[40] 
;
  }

  public void set_numAutos( int[] value ) {
    if (value == this.numAutos) {
      return;
    }
    int[] _oldValue_xjal = this.numAutos;
    this.numAutos = value;
    onChange_numAutos_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter numAutos.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_numAutos()</code> method instead.
   */
  protected void onChange_numAutos() {
    onChange_numAutos_xjal( numAutos );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_numAutos_xjal( int[] oldValue ) {  
  }


  public 
int  numMetroStations;

  /**
   * Returns default value for parameter <code>numMetroStations</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _numMetroStations_DefaultValue_xjal() {
    final Main self = this;
    return 
40 
;
  }

  public void set_numMetroStations( int value ) {
    if (value == this.numMetroStations) {
      return;
    }
    int _oldValue_xjal = this.numMetroStations;
    this.numMetroStations = value;
    onChange_numMetroStations_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter numMetroStations.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_numMetroStations()</code> method instead.
   */
  protected void onChange_numMetroStations() {
    onChange_numMetroStations_xjal( numMetroStations );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_numMetroStations_xjal( int oldValue ) {  
  }


  public 
int  numAutosEach;

  /**
   * Returns default value for parameter <code>numAutosEach</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _numAutosEach_DefaultValue_xjal() {
    final Main self = this;
    return 0;
  }

  public void set_numAutosEach( int value ) {
    if (value == this.numAutosEach) {
      return;
    }
    int _oldValue_xjal = this.numAutosEach;
    this.numAutosEach = value;
    onChange_numAutosEach_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter numAutosEach.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_numAutosEach()</code> method instead.
   */
  protected void onChange_numAutosEach() {
    onChange_numAutosEach_xjal( numAutosEach );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_numAutosEach_xjal( int oldValue ) {  
  }


  public 
int  maxDetourTime;

  /**
   * Returns default value for parameter <code>maxDetourTime</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _maxDetourTime_DefaultValue_xjal() {
    final Main self = this;
    return 
420 
;
  }

  public void set_maxDetourTime( int value ) {
    if (value == this.maxDetourTime) {
      return;
    }
    int _oldValue_xjal = this.maxDetourTime;
    this.maxDetourTime = value;
    onChange_maxDetourTime_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter maxDetourTime.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_maxDetourTime()</code> method instead.
   */
  protected void onChange_maxDetourTime() {
    onChange_maxDetourTime_xjal( maxDetourTime );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_maxDetourTime_xjal( int oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    autoSpeed = _autoSpeed_DefaultValue_xjal();
    maxWaitingTime = _maxWaitingTime_DefaultValue_xjal();
    numAutos = _numAutos_DefaultValue_xjal();
    numMetroStations = _numMetroStations_DefaultValue_xjal();
    numAutosEach = _numAutosEach_DefaultValue_xjal();
    maxDetourTime = _maxDetourTime_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "autoSpeed":
      if ( _callOnChange_xjal ) {
        set_autoSpeed( ((Number) _value_xjal).doubleValue() );
      } else {
        autoSpeed = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "maxWaitingTime":
      if ( _callOnChange_xjal ) {
        set_maxWaitingTime( ((Number) _value_xjal).intValue() );
      } else {
        maxWaitingTime = ((Number) _value_xjal).intValue();
      }
      return true;
    case "numAutos":
      if ( _callOnChange_xjal ) {
        set_numAutos( (int[]) _value_xjal );
      } else {
        numAutos = (int[]) _value_xjal;
      }
      return true;
    case "numMetroStations":
      if ( _callOnChange_xjal ) {
        set_numMetroStations( ((Number) _value_xjal).intValue() );
      } else {
        numMetroStations = ((Number) _value_xjal).intValue();
      }
      return true;
    case "numAutosEach":
      if ( _callOnChange_xjal ) {
        set_numAutosEach( ((Number) _value_xjal).intValue() );
      } else {
        numAutosEach = ((Number) _value_xjal).intValue();
      }
      return true;
    case "maxDetourTime":
      if ( _callOnChange_xjal ) {
        set_maxDetourTime( ((Number) _value_xjal).intValue() );
      } else {
        maxDetourTime = ((Number) _value_xjal).intValue();
      }
      return true;
    default:
      return super.setParameter( _name_xjal, _value_xjal, _callOnChange_xjal );
    }
  }

  @Override
  public <T> T getParameter(String _name_xjal) {
    Object _result_xjal;
    switch ( _name_xjal ) {
    case "autoSpeed": _result_xjal = autoSpeed; break;
    case "maxWaitingTime": _result_xjal = maxWaitingTime; break;
    case "numAutos": _result_xjal = numAutos; break;
    case "numMetroStations": _result_xjal = numMetroStations; break;
    case "numAutosEach": _result_xjal = numAutosEach; break;
    case "maxDetourTime": _result_xjal = maxDetourTime; break;
    default: _result_xjal = super.getParameter( _name_xjal ); break;
    }
    return (T) _result_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;

  @Override
  public String[] getParameterNames() {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList<>( Arrays.asList( super.getParameterNames() ) );
      list.add( "autoSpeed" );
      list.add( "maxWaitingTime" );
      list.add( "numAutos" );
      list.add( "numMetroStations" );
      list.add( "numAutosEach" );
      list.add( "maxDetourTime" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

  public 
int 
 home_index;
  public 
double 
 numLostDemands;
  public 
int 
 numUnserviceable;
  public 
int 
 numLostDemandsFM;
  public 
double 
 numLMPsngrsServed;
  public 
double 
 numFMPsngrsServed;
  public 
double 
 seed;
  public 
double 
 fm_seed;
  public 
double 
 trip_1;
  public 
double 
 trip_2;
  public 
double 
 trip_3;
  public 
double 
 jointTrip;
  public 
boolean 
 added_data;

  // Collection Variables
  public 
ArrayList <
GISPoint[] > metroLocations = new ArrayList<GISPoint[]>();
  public 
ArrayList <
GISRegion > voronoiRegions = new ArrayList<GISRegion>();
  public 
LinkedHashMap <
Autos , 
Double > ETAArray = new LinkedHashMap<Autos, Double>();
  public 
LinkedHashMap <
MetroStation , 
ArrayList<Passengr> > queue = new LinkedHashMap<MetroStation, ArrayList<Passengr>>();
  public 
LinkedHashMap <
MetroStation , 
Integer > stationWiseLostDemand = new LinkedHashMap<MetroStation, Integer>();
  public 
LinkedHashMap <
MetroStation , 
Integer > stationWiseAutoTrips = new LinkedHashMap<MetroStation, Integer>();
  public 
LinkedHashMap <
MetroStation , 
Integer > stationWisePsngrCount = new LinkedHashMap<MetroStation, Integer>();
  public 
LinkedHashMap <
MetroStation , 
Double > tripDistance = new LinkedHashMap<MetroStation, Double>();
  public 
LinkedHashMap <
MetroStation , 
Double > waitingTime = new LinkedHashMap<MetroStation, Double>();
  public 
ArrayList <
Integer > capacities = new ArrayList<Integer>();
  public 
LinkedHashMap <
MetroStation , 
ArrayList<FirstMilePassenger> > FMqueue = new LinkedHashMap<MetroStation, ArrayList<FirstMilePassenger>>();
  public 
LinkedHashMap <
MetroStation , 
Integer > stationWiseFMLostDemand = new LinkedHashMap<MetroStation, Integer>();
  public 
LinkedHashMap <
MetroStation , 
Integer > stationWiseFMPsngrCount = new LinkedHashMap<MetroStation, Integer>();
  public 
LinkedHashMap <
MetroStation , 
Integer > stationWiseAutoTripsFM = new LinkedHashMap<MetroStation, Integer>();
  public 
ArrayList <
Autos > idle_trucks = new ArrayList<Autos>();
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Main.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }


  // Events

  public EventCondition event = new EventCondition(this);
  public EventTimeout generateFMPassengers = new EventTimeout(this);
  public EventTimeout getHourlyLostDemands = new EventTimeout(this);
  public EventTimeout countAutos = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _scheduleEW_Action_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _scheduleNS_Action_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _scheduleEW_rev_Action_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _scheduleNS_rev_Action_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == generateFMPassengers ) return "generateFMPassengers";
     if( _e == getHourlyLostDemands ) return "getHourlyLostDemands";
     if( _e == countAutos ) return "countAutos";
     if( _e == _scheduleEW_Action_xjal ) return "scheduleEW action";
     if( _e == _scheduleNS_Action_xjal ) return "scheduleNS action";
     if( _e == _scheduleEW_rev_Action_xjal ) return "scheduleEW_rev action";
     if( _e == _scheduleNS_rev_Action_xjal ) return "scheduleNS_rev action";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == generateFMPassengers ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == getHourlyLostDemands ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == countAutos ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _scheduleEW_Action_xjal ) return EVENT_TIMEOUT_MODE_ONCE;
    if ( _e == _scheduleNS_Action_xjal ) return EVENT_TIMEOUT_MODE_ONCE;
    if ( _e == _scheduleEW_rev_Action_xjal ) return EVENT_TIMEOUT_MODE_ONCE;
    if ( _e == _scheduleNS_rev_Action_xjal ) return EVENT_TIMEOUT_MODE_ONCE;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == generateFMPassengers ) {
      _t = 
0 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if ( _e == getHourlyLostDemands ) {
      _t = 
0 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if ( _e == countAutos ) {
      _t = 
60 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if ( _e == _scheduleEW_Action_xjal ) {
      _t = scheduleEW.getTimeOfValue() == time() ? time() : scheduleEW.getTimeOfNextValue();
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if ( _e == _scheduleNS_Action_xjal ) {
      _t = scheduleNS.getTimeOfValue() == time() ? time() : scheduleNS.getTimeOfNextValue();
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if ( _e == _scheduleEW_rev_Action_xjal ) {
      _t = scheduleEW_rev.getTimeOfValue() == time() ? time() : scheduleEW_rev.getTimeOfNextValue();
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if ( _e == _scheduleNS_rev_Action_xjal ) {
      _t = scheduleNS_rev.getTimeOfValue() == time() ? time() : scheduleNS_rev.getTimeOfNextValue();
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == generateFMPassengers) {
      _t = 
3600 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if( _e == getHourlyLostDemands) {
      _t = 
3600 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if( _e == countAutos) {
      _t = 
60 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == generateFMPassengers ) {
      EventTimeout self = _e;

if (time() == 0 && added_data == false) {
	for(int i=0; i<40; i++) {
		add_autoResourcePools(metroLocations.get(i), voronoiRegions.get(i), capacities.get(i));
		
		// initialize table function for each metro station
		add_locationTableFunctions(metroStation.get(i).origin_name);
	}
	added_data = true;
}

if (getHourOfDay() < 23 && getHourOfDay() > 4) {
int[] numFMPsngrArray = getFMPsngrCount();

double min = 1.0;
int max = 3600;
Random rnd = new Random();
rnd.setSeed((long)fm_seed);


for(int i=0; i<numFMPsngrArray[0]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Mysore Road");
}

for(int i=0; i<numFMPsngrArray[1]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Deepanjali Nagar");
}

for(int i=0; i<numFMPsngrArray[2]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Attiguppe");
		
}
for(int i=0; i<numFMPsngrArray[3]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Vijayanagara");
}
for(int i=0; i<numFMPsngrArray[4]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Sri Balagangadaranatha Swamy Hosahalli");
}
for(int i=0; i<numFMPsngrArray[5]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Magadi Road");
}
for(int i=0; i<numFMPsngrArray[6]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Krantivira Sangolli Rayanna");
}
for(int i=0; i<numFMPsngrArray[7]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Nadaprabhu Kempegowda Station");
}
for(int i=0; i<numFMPsngrArray[8]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Sir M Vishweshwariah - Central College");
}
for(int i=0; i<numFMPsngrArray[9]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Dr. B R Ambedkar Station");
}
for(int i=0; i<numFMPsngrArray[10]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Cubbon Park");
}
for(int i=0; i<numFMPsngrArray[11]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Mahatma Gandhi Road");
}
for(int i=0; i<numFMPsngrArray[12]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Trinity");
}
for(int i=0; i<numFMPsngrArray[13]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Halasuru");
}

for(int i=0; i<numFMPsngrArray[14]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Indiranagar");
}

for(int i=0; i<numFMPsngrArray[15]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Swami Vivekananda Road");
}
for(int i=0; i<numFMPsngrArray[16]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Baiyyappanahalli");
}

// NS Line
for(int i=0; i<numFMPsngrArray[17]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Nagasandra");
}
for(int i=0; i<numFMPsngrArray[18]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Dasarahalli");
}
for(int i=0; i<numFMPsngrArray[19]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Jalahalli");
}
for(int i=0; i<numFMPsngrArray[20]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Peenya Industry");
}
for(int i=0; i<numFMPsngrArray[21]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Peenya");
}
for(int i=0; i<numFMPsngrArray[22]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Goraguntepalya");
}
for(int i=0; i<numFMPsngrArray[23]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Yeshwantpura");
}
for(int i=0; i<numFMPsngrArray[24]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Sandal Soap Factory");
}
for(int i=0; i<numFMPsngrArray[25]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Mahalakshmi");
}
for(int i=0; i<numFMPsngrArray[26]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Rajajinagar");
}
for(int i=0; i<numFMPsngrArray[27]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Mahakavi Kuvempu Road");
}
for(int i=0; i<numFMPsngrArray[28]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Srirampura");
}
for(int i=0; i<numFMPsngrArray[29]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Mantri Square");
}
for(int i=0; i<numFMPsngrArray[30]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Chikkapete");
}
for(int i=0; i<numFMPsngrArray[31]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Krishna Rajendra Market");
}
for(int i=0; i<numFMPsngrArray[32]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "National College");
}
for(int i=0; i<numFMPsngrArray[33]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Lalbagh");
}
for(int i=0; i<numFMPsngrArray[34]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "South End Circle");
}
for(int i=0; i<numFMPsngrArray[35]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Jayanagar");
}
for(int i=0; i<numFMPsngrArray[36]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Rashtriya Vidyalaya Road");
}
for(int i=0; i<numFMPsngrArray[37]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Banashankari");
}
for(int i=0; i<numFMPsngrArray[38]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "J P Nagar");
}
for(int i=0; i<numFMPsngrArray[39]; i++) {
		create_eventFMPassengerArrival(rnd.nextInt(max), SECOND, i, false, "Yelachenahalli");
}

} 
;
      return;
    }
    if ( _e == getHourlyLostDemands ) {
      EventTimeout self = _e;

traceln("\nNum Passengers");
writeLogs("\n" + getHourOfDay() + " " + "Num Passengers\n");
for(MetroStation m: stationWisePsngrCount.keySet()) {
	String stationName = m.origin_name;
	int val = stationWisePsngrCount.get(m);
	traceln(stationName + " : " + val);
	writeLogs(stationName + " : " + val + "\n");
}

traceln("\nLost Demands");
writeLogs("\n" + getHourOfDay() + " " + "Lost Demands\n");
for(MetroStation m: stationWiseLostDemand.keySet()) {
	String stationName = m.origin_name;
	int val = stationWiseLostDemand.get(m);
	traceln(stationName + " : " + val);
	writeLogs(stationName + " : " + val + "\n");
}

traceln("\nNum FM Passengers");
writeLogs("\n" + getHourOfDay() + " " + "Num FM Passengers\n");
for(MetroStation m: stationWiseFMPsngrCount.keySet()) {
	String stationName = m.origin_name;
	int val = stationWiseFMPsngrCount.get(m);
	traceln(stationName + " : " + val);
	writeLogs(stationName + " : " + val + "\n");
}

traceln("\nFM Lost Demands");
writeLogs("\n" + getHourOfDay() + " " + "FM Lost Demands\n");
for(MetroStation m: stationWiseFMLostDemand.keySet()) {
	String stationName = m.origin_name;
	int val = stationWiseFMLostDemand.get(m);
	traceln(stationName + " : " + val);
	writeLogs(stationName + " : " + val + "\n");
} 
;
      return;
    }
    if ( _e == countAutos ) {
      EventTimeout self = _e;

for(int i=0; i<40; i++) {
	MetroStation station = metroStation.get(i);
	String station_name = station.origin_name;
	int countAutosAtStation = count(autos, (v -> v.inState(Autos.AtMetroStation) && abs(v.autoOrigin_Lat - station.origin_lat) < 0.00001 && abs(v.autoOrigin_Lon - station.origin_lon) < 0.00001));
	writeAutoCountStats(getHour() + "\t" + getMinute() + "\t" + i + "\t" + station_name + "\t" + String.valueOf(countAutosAtStation) + "\n");
}
 
;
      return;
    }
    if ( _e == _scheduleEW_Action_xjal ) {
      Schedule<Integer> self = this.scheduleEW;
      Integer value = scheduleEW.getValue();
      
traceln("in EW schedule: " + time() + " " + scheduleEW.getDateOfValue(time()) + " "+ scheduleEW.getValue());
create_eventTrainEW(0, scheduleEW.getValue());
 
;
      _scheduleEW_Action_xjal.restartTo( scheduleEW.getTimeOfNextValue() );
      return;
    }
    if ( _e == _scheduleNS_Action_xjal ) {
      Schedule<Integer> self = this.scheduleNS;
      Integer value = scheduleNS.getValue();
      
traceln("in NS schedule: " + time() + " " + scheduleNS.getDateOfValue(time()) + " "+ scheduleNS.getValue());
create_eventTrainNS(0, scheduleNS.getValue()); 
;
      _scheduleNS_Action_xjal.restartTo( scheduleNS.getTimeOfNextValue() );
      return;
    }
    if ( _e == _scheduleEW_rev_Action_xjal ) {
      Schedule<Integer> self = this.scheduleEW_rev;
      Integer value = scheduleEW_rev.getValue();
      
traceln("in EW rev schedule: " + time() + " " + scheduleEW_rev.getDateOfValue(time()) + " "+ scheduleEW_rev.getValue());
create_eventTrainEWRev(0, scheduleEW_rev.getValue());
 
;
      _scheduleEW_rev_Action_xjal.restartTo( scheduleEW_rev.getTimeOfNextValue() );
      return;
    }
    if ( _e == _scheduleNS_rev_Action_xjal ) {
      Schedule<Integer> self = this.scheduleNS_rev;
      Integer value = scheduleNS_rev.getValue();
      
traceln("in NS rev schedule: " + time() + " " + scheduleNS_rev.getDateOfValue(time()) + " "+ scheduleNS_rev.getValue());
create_eventTrainNSRev(0, scheduleNS_rev.getValue()); 
;
      _scheduleNS_rev_Action_xjal.restartTo( scheduleNS_rev.getTimeOfNextValue() );
      return;
    }
    super.executeActionOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventCondition _e ) {
    if ( _e == event ) return "event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testConditionOf( EventCondition _e ) {

    if ( _e == event) return 
false 
;
    return super.testConditionOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventCondition self ) {
    if ( self == event) {

//traceln("adding autos and locations");
for(int i=0; i<40; i++) {
	//traceln("adding res pools");
	//add_autoResourcePools(metroLocations.get(i), voronoiRegions.get(i), capacities.get(i));
		
	// initialize table function for each metro station
	//add_locationTableFunctions(metroStation.get(i).origin_name);
} 
;
      return ;
    }
    super.executeActionOf( self );
  }
  

	

  // Dynamic Events 

  /**
   * Creates new dynamic event eventTrainEW with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param time_index
   * @return created dynamic event instance
   */
  public eventTrainEW create_eventTrainEW(double _dt , int time_index ) {
    return new eventTrainEW( this, _dt , time_index );
  }
  
  /**
   * Creates new dynamic event eventTrainEW with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param _units the time units
   * @param time_index
   * @return created dynamic event instance
   */
  public eventTrainEW create_eventTrainEW(double _dt, TimeUnits _units , int time_index ) {
    return new eventTrainEW( this, _dt, _units , time_index );
  } 

  /**
   * Creates new dynamic event eventTrainEW with given parameter values and schedules in the timeout specified
   * @param _t the model time (absolute)
   * @param time_index
   * @return created dynamic event instance
   */
  @AnyLogicInternalAPI
  public eventTrainEW create_eventTrainEW_absoluteTime_xjal(double _t , int time_index ) {
    return new eventTrainEW( this, _t, true , time_index );
  } 
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public void on_eventTrainEW_xjal(int time_index ) {

traceln("EW time index: " + time_index);
MetroTrain t = add_metroTrains(time_index, "EWL");

//uncomment for full day run
if (time_index == 1 && added_data == false) {
	for(int i=0; i<40; i++) {
		add_autoResourcePools(metroLocations.get(i), voronoiRegions.get(i), capacities.get(i));
		
		// initialize table function for each metro station
		add_locationTableFunctions(metroStation.get(i).origin_name);
	}
	added_data = true;
}  
;
  }

  /**
   * Creates new dynamic event eventFMPassengerArrival with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param idPassenger
   * @param isAssignedAuto
   * @param firstMileDestination
   * @return created dynamic event instance
   */
  public eventFMPassengerArrival create_eventFMPassengerArrival(double _dt , int idPassenger, boolean isAssignedAuto, String firstMileDestination ) {
    return new eventFMPassengerArrival( this, _dt , idPassenger, isAssignedAuto, firstMileDestination );
  }
  
  /**
   * Creates new dynamic event eventFMPassengerArrival with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param _units the time units
   * @param idPassenger
   * @param isAssignedAuto
   * @param firstMileDestination
   * @return created dynamic event instance
   */
  public eventFMPassengerArrival create_eventFMPassengerArrival(double _dt, TimeUnits _units , int idPassenger, boolean isAssignedAuto, String firstMileDestination ) {
    return new eventFMPassengerArrival( this, _dt, _units , idPassenger, isAssignedAuto, firstMileDestination );
  } 

  /**
   * Creates new dynamic event eventFMPassengerArrival with given parameter values and schedules in the timeout specified
   * @param _t the model time (absolute)
   * @param idPassenger
   * @param isAssignedAuto
   * @param firstMileDestination
   * @return created dynamic event instance
   */
  @AnyLogicInternalAPI
  public eventFMPassengerArrival create_eventFMPassengerArrival_absoluteTime_xjal(double _t , int idPassenger, boolean isAssignedAuto, String firstMileDestination ) {
    return new eventFMPassengerArrival( this, _t, true , idPassenger, isAssignedAuto, firstMileDestination );
  } 
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public void on_eventFMPassengerArrival_xjal(int idPassenger, boolean isAssignedAuto, String firstMileDestination ) {

double indx = uniform(0,1);
LocationTableFunction func = findFirst(locationTableFunctions, f -> f.station.equals(firstMileDestination));
int tfindx = (int)func.tableFunction.get(indx);
List<FirstMileOrigin> orgnList = filter(firstMileOrigins, o->(o.name).equals(firstMileDestination));
FirstMileOrigin o = orgnList.get(tfindx);

MetroStation station = findFirst(metroStation, m -> m.origin_name.equals(firstMileDestination));
FirstMilePassenger p = add_firstMilePassengers(1, o, station, false);
traceln("Generating FM passengers: " + this + " " + o.name + " " + station.origin_name);
 
;
  }

  /**
   * Creates new dynamic event eventTrainNS with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param time_index
   * @return created dynamic event instance
   */
  public eventTrainNS create_eventTrainNS(double _dt , int time_index ) {
    return new eventTrainNS( this, _dt , time_index );
  }
  
  /**
   * Creates new dynamic event eventTrainNS with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param _units the time units
   * @param time_index
   * @return created dynamic event instance
   */
  public eventTrainNS create_eventTrainNS(double _dt, TimeUnits _units , int time_index ) {
    return new eventTrainNS( this, _dt, _units , time_index );
  } 

  /**
   * Creates new dynamic event eventTrainNS with given parameter values and schedules in the timeout specified
   * @param _t the model time (absolute)
   * @param time_index
   * @return created dynamic event instance
   */
  @AnyLogicInternalAPI
  public eventTrainNS create_eventTrainNS_absoluteTime_xjal(double _t , int time_index ) {
    return new eventTrainNS( this, _t, true , time_index );
  } 
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public void on_eventTrainNS_xjal(int time_index ) {

traceln("NS time index: " + time_index);
MetroTrain t = add_metroTrains(time_index, "NSL");

if (time_index == 1 && added_data == false) {
	for(int i=0; i<40; i++) {
		add_autoResourcePools(metroLocations.get(i), voronoiRegions.get(i), capacities.get(i));
		
		// initialize table function for each metro station
		add_locationTableFunctions(metroStation.get(i).origin_name);
	}
	added_data = true;
} 
;
  }

  /**
   * Creates new dynamic event eventTrainEWRev with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param time_index
   * @return created dynamic event instance
   */
  public eventTrainEWRev create_eventTrainEWRev(double _dt , int time_index ) {
    return new eventTrainEWRev( this, _dt , time_index );
  }
  
  /**
   * Creates new dynamic event eventTrainEWRev with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param _units the time units
   * @param time_index
   * @return created dynamic event instance
   */
  public eventTrainEWRev create_eventTrainEWRev(double _dt, TimeUnits _units , int time_index ) {
    return new eventTrainEWRev( this, _dt, _units , time_index );
  } 

  /**
   * Creates new dynamic event eventTrainEWRev with given parameter values and schedules in the timeout specified
   * @param _t the model time (absolute)
   * @param time_index
   * @return created dynamic event instance
   */
  @AnyLogicInternalAPI
  public eventTrainEWRev create_eventTrainEWRev_absoluteTime_xjal(double _t , int time_index ) {
    return new eventTrainEWRev( this, _t, true , time_index );
  } 
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public void on_eventTrainEWRev_xjal(int time_index ) {

traceln("EW rev time index: " + time_index);
MetroTrain t = add_metroTrains(time_index, "EWLRev");

if (time_index == 1 && added_data == false) {
	for(int i=0; i<40; i++) {
		add_autoResourcePools(metroLocations.get(i), voronoiRegions.get(i), capacities.get(i));
		
		// initialize table function for each metro station
		add_locationTableFunctions(metroStation.get(i).origin_name);
	}
	added_data = true;
} 
;
  }

  /**
   * Creates new dynamic event eventTrainNSRev with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param time_index
   * @return created dynamic event instance
   */
  public eventTrainNSRev create_eventTrainNSRev(double _dt , int time_index ) {
    return new eventTrainNSRev( this, _dt , time_index );
  }
  
  /**
   * Creates new dynamic event eventTrainNSRev with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param _units the time units
   * @param time_index
   * @return created dynamic event instance
   */
  public eventTrainNSRev create_eventTrainNSRev(double _dt, TimeUnits _units , int time_index ) {
    return new eventTrainNSRev( this, _dt, _units , time_index );
  } 

  /**
   * Creates new dynamic event eventTrainNSRev with given parameter values and schedules in the timeout specified
   * @param _t the model time (absolute)
   * @param time_index
   * @return created dynamic event instance
   */
  @AnyLogicInternalAPI
  public eventTrainNSRev create_eventTrainNSRev_absoluteTime_xjal(double _t , int time_index ) {
    return new eventTrainNSRev( this, _t, true , time_index );
  } 
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public void on_eventTrainNSRev_xjal(int time_index ) {

traceln("NS time index: " + time_index);
MetroTrain t = add_metroTrains(time_index, "NSLRev");

if (time_index == 1 && added_data == false) {
	for(int i=0; i<40; i++) {
		add_autoResourcePools(metroLocations.get(i), voronoiRegions.get(i), capacities.get(i));
		
		// initialize table function for each metro station
		add_locationTableFunctions(metroStation.get(i).origin_name);
	}
	added_data = true;
} 
;
  }
  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  public Schedule<Integer> scheduleEW = new Schedule<Integer>(
    this, true, SUNDAY, 1L * TIME_UNIT_DAY, TIME_UNIT_DAY, toDateInMillis( 2021, APRIL, 21, 5, 5, 10 ), 0, _scheduleEW_Starts_xjal(), null, _scheduleEW_Values_xjal(), false, null, true );
  public Integer scheduleEW() {
    return scheduleEW.getValue();
  }
  @AnyLogicInternalCodegenAPI
  private static long[] _scheduleEW_Starts_xjal() {
    return new long[] { 18000000L, 19800000L, 20700000L, 21600000L, 22500000L, 23400000L, 24300000L, 25200000L, 25800000L, 26400000L, 27000000L, 27600000L, 28200000L, 28620000L, 29040000L, 29460000L, 29880000L, 30180000L, 30480000L, 30780000L, 31080000L, 31380000L, 31680000L, 31980000L, 32220000L, 32460000L, 32700000L, 32940000L, 33180000L, 33420000L, 33660000L, 33840000L, 34080000L, 34260000L, 34500000L, 34680000L, 34920000L, 35100000L, 35340000L, 35580000L, 35820000L, 36060000L, 36300000L, 36540000L, 36780000L, 37080000L, 37380000L, 37680000L, 37980000L, 38280000L, 38580000L, 38940000L, 39300000L, 39780000L, 40260000L, 40740000L, 41220000L, 41700000L, 42180000L, 42660000L, 43260000L, 43860000L, 44460000L, 45060000L, 45660000L, 46260000L, 46860000L, 47460000L, 48060000L, 48660000L, 49260000L, 49860000L, 50460000L, 51060000L, 51660000L, 52260000L, 52860000L, 53460000L, 54060000L, 54660000L, 55260000L, 55860000L, 56460000L, 57060000L, 57660000L, 58140000L, 58620000L, 59100000L, 59580000L, 60060000L, 60540000L, 61020000L, 61500000L, 61980000L, 62460000L, 62820000L, 63180000L, 63540000L, 63900000L, 64140000L, 64380000L, 64620000L, 64800000L, 65040000L, 65220000L, 65460000L, 65640000L, 65880000L, 66060000L, 66300000L, 66540000L, 66780000L, 67020000L, 67260000L, 67500000L, 67740000L, 67980000L, 68220000L, 68460000L, 68700000L, 68940000L, 69180000L, 69420000L, 69660000L, 69900000L, 70140000L, 70380000L, 70620000L, 70860000L, 71100000L, 71340000L, 71580000L, 71820000L, 72060000L, 72300000L, 72540000L, 72780000L, 73020000L, 73260000L, 73500000L, 73800000L, 74100000L, 74400000L, 74700000L, 75000000L, 75300000L, 75600000L, 75900000L, 76200000L, 76500000L, 76860000L, 77220000L, 77580000L, 77940000L, 78420000L, 78900000L, 79380000L, 79980000L, 80580000L, 81180000L, 81900000L, 82620000L, };
  }
  @AnyLogicInternalCodegenAPI
  private static Object[] _scheduleEW_Values_xjal() {
    return new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, };
  }

  public Schedule<Integer> scheduleNS = new Schedule<Integer>(
    this, true, SUNDAY, 1L * TIME_UNIT_DAY, TIME_UNIT_DAY, toDateInMillis( 2021, APRIL, 21, 5, 5, 10 ), 0, _scheduleNS_Starts_xjal(), null, _scheduleNS_Values_xjal(), false, null, true, true );
  public Integer scheduleNS() {
    return scheduleNS.getValue();
  }
  @AnyLogicInternalCodegenAPI
  private static long[] _scheduleNS_Starts_xjal() {
    return new long[] { };
  }
  @AnyLogicInternalCodegenAPI
  private static Object[] _scheduleNS_Values_xjal() {
    return new Object[] { };
  }

  public Schedule<Integer> scheduleEW_rev = new Schedule<Integer>(
    this, true, SUNDAY, 1L * TIME_UNIT_DAY, TIME_UNIT_DAY, toDateInMillis( 2021, APRIL, 21, 5, 5, 10 ), 0, _scheduleEW_rev_Starts_xjal(), null, _scheduleEW_rev_Values_xjal(), false, null, true, true );
  public Integer scheduleEW_rev() {
    return scheduleEW_rev.getValue();
  }
  @AnyLogicInternalCodegenAPI
  private static long[] _scheduleEW_rev_Starts_xjal() {
    return new long[] { };
  }
  @AnyLogicInternalCodegenAPI
  private static Object[] _scheduleEW_rev_Values_xjal() {
    return new Object[] { };
  }

  public Schedule<Integer> scheduleNS_rev = new Schedule<Integer>(
    this, true, SUNDAY, 1L * TIME_UNIT_DAY, TIME_UNIT_DAY, toDateInMillis( 2021, APRIL, 21, 5, 5, 10 ), 0, _scheduleNS_rev_Starts_xjal(), null, _scheduleNS_rev_Values_xjal(), false, null, true, true );
  public Integer scheduleNS_rev() {
    return scheduleNS_rev.getValue();
  }
  @AnyLogicInternalCodegenAPI
  private static long[] _scheduleNS_rev_Starts_xjal() {
    return new long[] { };
  }
  @AnyLogicInternalCodegenAPI
  private static Object[] _scheduleNS_rev_Values_xjal() {
    return new Object[] { };
  }

  // Embedded Objects

  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _autos_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _locationTableFunctions_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  public com.anylogic.libraries.processmodeling.Enter<
Agent 
> PassengerQueue;
  public com.anylogic.libraries.processmodeling.Exit<
Agent 
> Finished;
  public com.anylogic.libraries.processmodeling.Queue<
Agent 
> ArriveAtPickupArea;
  public com.anylogic.libraries.processmodeling.Delay<
Agent 
> GenerateVehicleRequest;
  public com.anylogic.libraries.pypeline.PyCommunicator pyCom;

  public String getNameOf( Agent ao ) {
    if ( ao == PassengerQueue ) return "PassengerQueue";
    if ( ao == Finished ) return "Finished";
    if ( ao == ArriveAtPickupArea ) return "ArriveAtPickupArea";
    if ( ao == GenerateVehicleRequest ) return "GenerateVehicleRequest";
    if ( ao == pyCom ) return "pyCom";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }

  public class _metroStation_Population extends AgentArrayList<MetroStation> {
    _metroStation_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public MetroStation instantiateAgent( int index ) {
    	return instantiate_metroStation_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( MetroStation agent, int index, TableInput tableInput ) {
      setupParameters_metroStation_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( MetroStation agent, int index, TableInput tableInput ) {
      doBeforeCreate_metroStation_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "MetroStation")
  public _metroStation_Population metroStation = new _metroStation_Population( this );
  public class _autos_Population extends AgentArrayList<Autos> {
    _autos_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Autos instantiateAgent( int index ) {
    	return instantiate_autos_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Autos agent, int index, TableInput tableInput ) {
      setupParameters_autos_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Autos agent, int index, TableInput tableInput ) {
      doBeforeCreate_autos_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return true;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Autos")
  public _autos_Population autos = new _autos_Population( this );
  public class _passengrs_Population extends AgentLinkedHashSet<Passengr> {
    _passengrs_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Passengr instantiateAgent( int index ) {
    	return instantiate_passengrs_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Passengr agent, int index, TableInput tableInput ) {
      setupParameters_passengrs_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Passengr agent, int index, TableInput tableInput ) {
      doBeforeCreate_passengrs_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }


    public int AllPassengers() {
      return _passengrs_AllPassengers_xjal();
    }

    public int LastMilePassengers() {
      return _passengrs_LastMilePassengers_xjal();
    }
  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Passengr")
  public _passengrs_Population passengrs = new _passengrs_Population( this );
  public class _metroTrains_Population extends AgentArrayList<MetroTrain> {
    _metroTrains_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public MetroTrain instantiateAgent( int index ) {
    	return instantiate_metroTrains_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( MetroTrain agent, int index, TableInput tableInput ) {
      setupParameters_metroTrains_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( MetroTrain agent, int index, TableInput tableInput ) {
      doBeforeCreate_metroTrains_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "MetroTrain")
  public _metroTrains_Population metroTrains = new _metroTrains_Population( this );
  public class _psngrDestinations_Population extends AgentArrayList<PsngrDestination> {
    _psngrDestinations_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public PsngrDestination instantiateAgent( int index ) {
    	return instantiate_psngrDestinations_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( PsngrDestination agent, int index, TableInput tableInput ) {
      setupParameters_psngrDestinations_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( PsngrDestination agent, int index, TableInput tableInput ) {
      doBeforeCreate_psngrDestinations_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "PsngrDestination")
  public _psngrDestinations_Population psngrDestinations = new _psngrDestinations_Population( this );
  public class _autoResourcePools_Population extends AgentArrayList<AutoResourcePool> {
    _autoResourcePools_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public AutoResourcePool instantiateAgent( int index ) {
    	return instantiate_autoResourcePools_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( AutoResourcePool agent, int index, TableInput tableInput ) {
      setupParameters_autoResourcePools_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( AutoResourcePool agent, int index, TableInput tableInput ) {
      doBeforeCreate_autoResourcePools_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "AutoResourcePool")
  public _autoResourcePools_Population autoResourcePools = new _autoResourcePools_Population( this );
  public class _resourcePool_Population extends AgentArrayList<com.anylogic.libraries.processmodeling.ResourcePool<
Autos 
>> {
    _resourcePool_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public com.anylogic.libraries.processmodeling.ResourcePool<Autos> instantiateAgent( int index ) {
    	return instantiate_resourcePool_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( com.anylogic.libraries.processmodeling.ResourcePool<Autos> agent, int index, TableInput tableInput ) {
      setupParameters_resourcePool_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( com.anylogic.libraries.processmodeling.ResourcePool<Autos> agent, int index, TableInput tableInput ) {
      doBeforeCreate_resourcePool_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "com.anylogic.libraries.processmodeling.ResourcePool<Autos>")
  public _resourcePool_Population resourcePool = new _resourcePool_Population( this );
  public class _firstMilePassengers_Population extends AgentArrayList<FirstMilePassenger> {
    _firstMilePassengers_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public FirstMilePassenger instantiateAgent( int index ) {
    	return instantiate_firstMilePassengers_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( FirstMilePassenger agent, int index, TableInput tableInput ) {
      setupParameters_firstMilePassengers_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( FirstMilePassenger agent, int index, TableInput tableInput ) {
      doBeforeCreate_firstMilePassengers_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "FirstMilePassenger")
  public _firstMilePassengers_Population firstMilePassengers = new _firstMilePassengers_Population( this );
  public class _firstMileOrigins_Population extends AgentArrayList<FirstMileOrigin> {
    _firstMileOrigins_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public FirstMileOrigin instantiateAgent( int index ) {
    	return instantiate_firstMileOrigins_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( FirstMileOrigin agent, int index, TableInput tableInput ) {
      setupParameters_firstMileOrigins_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( FirstMileOrigin agent, int index, TableInput tableInput ) {
      doBeforeCreate_firstMileOrigins_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "FirstMileOrigin")
  public _firstMileOrigins_Population firstMileOrigins = new _firstMileOrigins_Population( this );
  public class _locationTableFunctions_Population extends AgentArrayList<LocationTableFunction> {
    _locationTableFunctions_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public LocationTableFunction instantiateAgent( int index ) {
    	return instantiate_locationTableFunctions_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( LocationTableFunction agent, int index, TableInput tableInput ) {
      setupParameters_locationTableFunctions_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( LocationTableFunction agent, int index, TableInput tableInput ) {
      doBeforeCreate_locationTableFunctions_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "LocationTableFunction")
  public _locationTableFunctions_Population locationTableFunctions = new _locationTableFunctions_Population( this );
  public class _facilities_Population extends AgentArrayList<Facility> {
    _facilities_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Facility instantiateAgent( int index ) {
    	return instantiate_facilities_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Facility agent, int index, TableInput tableInput ) {
      setupParameters_facilities_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Facility agent, int index, TableInput tableInput ) {
      doBeforeCreate_facilities_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Facility")
  public _facilities_Population facilities = new _facilities_Population( this );
  public class _multiLocationTrips_Population extends AgentArrayList<MultiLocationTrip> {
    _multiLocationTrips_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public MultiLocationTrip instantiateAgent( int index ) {
    	return instantiate_multiLocationTrips_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( MultiLocationTrip agent, int index, TableInput tableInput ) {
      setupParameters_multiLocationTrips_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( MultiLocationTrip agent, int index, TableInput tableInput ) {
      doBeforeCreate_multiLocationTrips_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "MultiLocationTrip")
  public _multiLocationTrips_Population multiLocationTrips = new _multiLocationTrips_Population( this );

  public String getNameOf( AgentList<?> aolist ) {
    if( aolist == metroStation ) return "metroStation";
    if( aolist == autos ) return "autos";
    if( aolist == passengrs ) return "passengrs";
    if( aolist == metroTrains ) return "metroTrains";
    if( aolist == psngrDestinations ) return "psngrDestinations";
    if( aolist == autoResourcePools ) return "autoResourcePools";
    if( aolist == resourcePool ) return "resourcePool";
    if( aolist == firstMilePassengers ) return "firstMilePassengers";
    if( aolist == firstMileOrigins ) return "firstMileOrigins";
    if( aolist == locationTableFunctions ) return "locationTableFunctions";
    if( aolist == facilities ) return "facilities";
    if( aolist == multiLocationTrips ) return "multiLocationTrips";
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    if( aolist == autos ) return _autos_animationSettings_xjal;
    return super.getAnimationSettingsOf( aolist );
  }

  /**
   * Returns the agent element at the specified position in metroStation
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public MetroStation metroStation(int index) {
    return metroStation.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection metroStation<br>
   * @return newly created embedded object
   */
  public MetroStation add_metroStation() {
    int index = metroStation.size();
    MetroStation _result_xjal = instantiate_metroStation_xjal( index );
    metroStation.callSetupParameters( _result_xjal, index );
    metroStation.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection metroStation<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>metroStation.size()</code> method <strong>before</strong> this method is called
   * @param origin_name
   * @param origin_lat
   * @param origin_lon
   * @return newly created embedded object
   */
  public MetroStation add_metroStation( String origin_name, double origin_lat, double origin_lon ) {
    int index = metroStation.size();
    MetroStation _result_xjal = instantiate_metroStation_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.origin_name = origin_name;
    _result_xjal.origin_lat = origin_lat;
    _result_xjal.origin_lon = origin_lon;
    // Finish embedded object creation
    metroStation.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection metroStation<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object metroStation - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to metroStation
   */
  public boolean remove_metroStation( MetroStation object ) {
    if( ! metroStation._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in autos
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Autos autos(int index) {
    return autos.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection autos<br>
   * @return newly created embedded object
   */
  public Autos add_autos() {
    int index = autos.size();
    Autos _result_xjal = instantiate_autos_xjal( index );
    autos.callSetupParameters( _result_xjal, index );
    autos.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection autos<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>autos.size()</code> method <strong>before</strong> this method is called
   * @param autoOrigin
   * @param autoGISVoronoiRegion
   * @param autoOrigin_Lat
   * @param autoOrigin_Lon
   * @return newly created embedded object
   */
  public Autos add_autos( MetroStation autoOrigin, GISRegion autoGISVoronoiRegion, double autoOrigin_Lat, double autoOrigin_Lon ) {
    int index = autos.size();
    Autos _result_xjal = instantiate_autos_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.autoOrigin = autoOrigin;
    _result_xjal.autoGISVoronoiRegion = autoGISVoronoiRegion;
    _result_xjal.autoOrigin_Lat = autoOrigin_Lat;
    _result_xjal.autoOrigin_Lon = autoOrigin_Lon;
    // Finish embedded object creation
    autos.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection autos<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object autos - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to autos
   */
  public boolean remove_autos( Autos object ) {
    if( ! autos._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in passengrs
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Passengr passengrs(int index) {
    return passengrs.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection passengrs<br>
   * @return newly created embedded object
   */
  public Passengr add_passengrs() {
    int index = passengrs.size();
    Passengr _result_xjal = instantiate_passengrs_xjal( index );
    passengrs.callSetupParameters( _result_xjal, index );
    passengrs.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection passengrs<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>passengrs.size()</code> method <strong>before</strong> this method is called
   * @param percWantLastMile
   * @param isAssignedAuto
   * @param psngr_id
   * @param psngr_origin
   * @param hasCheckedAutoComebackTime
   * @param psngrDestination
   * @param canBeServed
   * @param destIndex
   * @param isLostDemand
   * @return newly created embedded object
   */
  public Passengr add_passengrs( double percWantLastMile, boolean isAssignedAuto, int psngr_id, MetroStation psngr_origin, boolean hasCheckedAutoComebackTime, PsngrDestination psngrDestination, boolean canBeServed, int destIndex, boolean isLostDemand ) {
    int index = passengrs.size();
    Passengr _result_xjal = instantiate_passengrs_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.percWantLastMile = percWantLastMile;
    _result_xjal.isAssignedAuto = isAssignedAuto;
    _result_xjal.psngr_id = psngr_id;
    _result_xjal.psngr_origin = psngr_origin;
    _result_xjal.hasCheckedAutoComebackTime = hasCheckedAutoComebackTime;
    _result_xjal.psngrDestination = psngrDestination;
    _result_xjal.canBeServed = canBeServed;
    _result_xjal.destIndex = destIndex;
    _result_xjal.isLostDemand = isLostDemand;
    // Finish embedded object creation
    passengrs.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection passengrs<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object passengrs - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to passengrs
   */
  public boolean remove_passengrs( Passengr object ) {
    if( ! passengrs._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in metroTrains
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public MetroTrain metroTrains(int index) {
    return metroTrains.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection metroTrains<br>
   * @return newly created embedded object
   */
  public MetroTrain add_metroTrains() {
    int index = metroTrains.size();
    MetroTrain _result_xjal = instantiate_metroTrains_xjal( index );
    metroTrains.callSetupParameters( _result_xjal, index );
    metroTrains.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection metroTrains<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>metroTrains.size()</code> method <strong>before</strong> this method is called
   * @param timeIndex
   * @param lineType
   * @return newly created embedded object
   */
  public MetroTrain add_metroTrains( int timeIndex, String lineType ) {
    int index = metroTrains.size();
    MetroTrain _result_xjal = instantiate_metroTrains_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.timeIndex = timeIndex;
    _result_xjal.lineType = lineType;
    // Finish embedded object creation
    metroTrains.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection metroTrains<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object metroTrains - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to metroTrains
   */
  public boolean remove_metroTrains( MetroTrain object ) {
    if( ! metroTrains._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in psngrDestinations
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public PsngrDestination psngrDestinations(int index) {
    return psngrDestinations.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection psngrDestinations<br>
   * @return newly created embedded object
   */
  public PsngrDestination add_psngrDestinations() {
    int index = psngrDestinations.size();
    PsngrDestination _result_xjal = instantiate_psngrDestinations_xjal( index );
    psngrDestinations.callSetupParameters( _result_xjal, index );
    psngrDestinations.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection psngrDestinations<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>psngrDestinations.size()</code> method <strong>before</strong> this method is called
   * @param name
   * @param lon
   * @param lat
   * @param time
   * @return newly created embedded object
   */
  public PsngrDestination add_psngrDestinations( String name, double lon, double lat, int time ) {
    int index = psngrDestinations.size();
    PsngrDestination _result_xjal = instantiate_psngrDestinations_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.name = name;
    _result_xjal.lon = lon;
    _result_xjal.lat = lat;
    _result_xjal.time = time;
    // Finish embedded object creation
    psngrDestinations.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection psngrDestinations<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object psngrDestinations - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to psngrDestinations
   */
  public boolean remove_psngrDestinations( PsngrDestination object ) {
    if( ! psngrDestinations._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in autoResourcePools
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public AutoResourcePool autoResourcePools(int index) {
    return autoResourcePools.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection autoResourcePools<br>
   * @return newly created embedded object
   */
  public AutoResourcePool add_autoResourcePools() {
    int index = autoResourcePools.size();
    AutoResourcePool _result_xjal = instantiate_autoResourcePools_xjal( index );
    autoResourcePools.callSetupParameters( _result_xjal, index );
    autoResourcePools.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection autoResourcePools<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>autoResourcePools.size()</code> method <strong>before</strong> this method is called
   * @param homeLocation
   * @param voronoiRegion
   * @param capacity
   * @return newly created embedded object
   */
  public AutoResourcePool add_autoResourcePools( GISPoint[] homeLocation, GISRegion voronoiRegion, int capacity ) {
    int index = autoResourcePools.size();
    AutoResourcePool _result_xjal = instantiate_autoResourcePools_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.homeLocation = homeLocation;
    _result_xjal.voronoiRegion = voronoiRegion;
    _result_xjal.capacity = capacity;
    // Finish embedded object creation
    autoResourcePools.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection autoResourcePools<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object autoResourcePools - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to autoResourcePools
   */
  public boolean remove_autoResourcePools( AutoResourcePool object ) {
    if( ! autoResourcePools._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in resourcePool
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public com.anylogic.libraries.processmodeling.ResourcePool<Autos> resourcePool(int index) {
    return resourcePool.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection resourcePool<br>
   * @return newly created embedded object
   */
  public com.anylogic.libraries.processmodeling.ResourcePool<Autos> add_resourcePool() {
    int index = resourcePool.size();
    com.anylogic.libraries.processmodeling.ResourcePool<Autos> _result_xjal = instantiate_resourcePool_xjal( index );
    resourcePool.callSetupParameters( _result_xjal, index );
    resourcePool.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection resourcePool<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>resourcePool.size()</code> method <strong>before</strong> this method is called
   * @param type
   * @param capacityDefinitionType
   * @param capacity
   * @param capacityBasedOnAttractors
   * @param capacitySchedule
   * @param capacityScheduleOnOff
   * @param shiftGroupSchedules
   * @param shiftGroupSizes
   * @param shiftGroupsPlan
   * @param destroyExcessUnits
   * @param speed
   * @param homeNodes
   * @param showDefaultAnimationStatic
   * @param downtimeSource
   * @param downtimeList
   * @param enableMaintenance
   * @param maintenanceType
   * @param enableFailuresRepairs
   * @param countBusyOnlyTimeToFailure
   * @param repairType
   * @param enableBreaks
   * @param breaksSchedule
   * @param enableCustomTasks
   * @param customTasks
   * @param customizeRequestChoice
   * @param addToCustomPopulation
   * @param forceStatisticsCollection
   * @return newly created embedded object
   */
  public com.anylogic.libraries.processmodeling.ResourcePool<Autos> add_resourcePool( com.anylogic.libraries.processmodeling.ResourceType type, com.anylogic.libraries.processmodeling.ResourcePool.CapacityDefinitionType capacityDefinitionType, int capacity, boolean capacityBasedOnAttractors, Schedule<Integer> capacitySchedule, Schedule<Boolean> capacityScheduleOnOff, Schedule<Integer>[] shiftGroupSchedules, int[] shiftGroupSizes, Schedule<Integer> shiftGroupsPlan, boolean destroyExcessUnits, double speed, INode[] homeNodes, boolean showDefaultAnimationStatic, com.anylogic.libraries.processmodeling.ResourcePool.DowntimeSource downtimeSource, com.anylogic.libraries.processmodeling.Downtime[] downtimeList, boolean enableMaintenance, com.anylogic.libraries.processmodeling.ResourcePool.MaintenanceType maintenanceType, boolean enableFailuresRepairs, boolean countBusyOnlyTimeToFailure, com.anylogic.libraries.processmodeling.ResourcePool.RepairType repairType, boolean enableBreaks, Schedule<Boolean> breaksSchedule, boolean enableCustomTasks, com.anylogic.libraries.processmodeling.DowntimeDescriptor[] customTasks, boolean customizeRequestChoice, boolean addToCustomPopulation, boolean forceStatisticsCollection ) {
    int index = resourcePool.size();
    com.anylogic.libraries.processmodeling.ResourcePool<Autos> _result_xjal = instantiate_resourcePool_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.type = type;
    _result_xjal.capacityDefinitionType = capacityDefinitionType;
    _result_xjal.capacity = capacity;
    _result_xjal.capacityBasedOnAttractors = capacityBasedOnAttractors;
    _result_xjal.capacitySchedule = capacitySchedule;
    _result_xjal.capacityScheduleOnOff = capacityScheduleOnOff;
    _result_xjal.shiftGroupSchedules = shiftGroupSchedules;
    _result_xjal.shiftGroupSizes = shiftGroupSizes;
    _result_xjal.shiftGroupsPlan = shiftGroupsPlan;
    _result_xjal.destroyExcessUnits = destroyExcessUnits;
    _result_xjal.speed = speed;
    _result_xjal.homeNodes = homeNodes;
    _result_xjal.showDefaultAnimationStatic = showDefaultAnimationStatic;
    _result_xjal.downtimeSource = downtimeSource;
    _result_xjal.downtimeList = downtimeList;
    _result_xjal.enableMaintenance = enableMaintenance;
    _result_xjal.maintenanceType = maintenanceType;
    _result_xjal.enableFailuresRepairs = enableFailuresRepairs;
    _result_xjal.countBusyOnlyTimeToFailure = countBusyOnlyTimeToFailure;
    _result_xjal.repairType = repairType;
    _result_xjal.enableBreaks = enableBreaks;
    _result_xjal.breaksSchedule = breaksSchedule;
    _result_xjal.enableCustomTasks = enableCustomTasks;
    _result_xjal.customTasks = customTasks;
    _result_xjal.customizeRequestChoice = customizeRequestChoice;
    _result_xjal.addToCustomPopulation = addToCustomPopulation;
    _result_xjal.forceStatisticsCollection = forceStatisticsCollection;
    // Finish embedded object creation
    resourcePool.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection resourcePool<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object resourcePool - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to resourcePool
   */
  public boolean remove_resourcePool( com.anylogic.libraries.processmodeling.ResourcePool<Autos> object ) {
    if( ! resourcePool._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in firstMilePassengers
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public FirstMilePassenger firstMilePassengers(int index) {
    return firstMilePassengers.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection firstMilePassengers<br>
   * @return newly created embedded object
   */
  public FirstMilePassenger add_firstMilePassengers() {
    int index = firstMilePassengers.size();
    FirstMilePassenger _result_xjal = instantiate_firstMilePassengers_xjal( index );
    firstMilePassengers.callSetupParameters( _result_xjal, index );
    firstMilePassengers.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection firstMilePassengers<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>firstMilePassengers.size()</code> method <strong>before</strong> this method is called
   * @param percWantFirstMile
   * @param origin
   * @param destination
   * @param isAssignedAuto
   * @return newly created embedded object
   */
  public FirstMilePassenger add_firstMilePassengers( int percWantFirstMile, FirstMileOrigin origin, MetroStation destination, boolean isAssignedAuto ) {
    int index = firstMilePassengers.size();
    FirstMilePassenger _result_xjal = instantiate_firstMilePassengers_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.percWantFirstMile = percWantFirstMile;
    _result_xjal.origin = origin;
    _result_xjal.destination = destination;
    _result_xjal.isAssignedAuto = isAssignedAuto;
    // Finish embedded object creation
    firstMilePassengers.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection firstMilePassengers<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object firstMilePassengers - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to firstMilePassengers
   */
  public boolean remove_firstMilePassengers( FirstMilePassenger object ) {
    if( ! firstMilePassengers._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in firstMileOrigins
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public FirstMileOrigin firstMileOrigins(int index) {
    return firstMileOrigins.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection firstMileOrigins<br>
   * @return newly created embedded object
   */
  public FirstMileOrigin add_firstMileOrigins() {
    int index = firstMileOrigins.size();
    FirstMileOrigin _result_xjal = instantiate_firstMileOrigins_xjal( index );
    firstMileOrigins.callSetupParameters( _result_xjal, index );
    firstMileOrigins.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection firstMileOrigins<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>firstMileOrigins.size()</code> method <strong>before</strong> this method is called
   * @param name
   * @param lon
   * @param lat
   * @return newly created embedded object
   */
  public FirstMileOrigin add_firstMileOrigins( String name, double lon, double lat ) {
    int index = firstMileOrigins.size();
    FirstMileOrigin _result_xjal = instantiate_firstMileOrigins_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.name = name;
    _result_xjal.lon = lon;
    _result_xjal.lat = lat;
    // Finish embedded object creation
    firstMileOrigins.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection firstMileOrigins<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object firstMileOrigins - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to firstMileOrigins
   */
  public boolean remove_firstMileOrigins( FirstMileOrigin object ) {
    if( ! firstMileOrigins._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in locationTableFunctions
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public LocationTableFunction locationTableFunctions(int index) {
    return locationTableFunctions.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection locationTableFunctions<br>
   * @return newly created embedded object
   */
  public LocationTableFunction add_locationTableFunctions() {
    int index = locationTableFunctions.size();
    LocationTableFunction _result_xjal = instantiate_locationTableFunctions_xjal( index );
    locationTableFunctions.callSetupParameters( _result_xjal, index );
    locationTableFunctions.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection locationTableFunctions<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>locationTableFunctions.size()</code> method <strong>before</strong> this method is called
   * @param station
   * @return newly created embedded object
   */
  public LocationTableFunction add_locationTableFunctions( String station ) {
    int index = locationTableFunctions.size();
    LocationTableFunction _result_xjal = instantiate_locationTableFunctions_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.station = station;
    // Finish embedded object creation
    locationTableFunctions.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection locationTableFunctions<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object locationTableFunctions - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to locationTableFunctions
   */
  public boolean remove_locationTableFunctions( LocationTableFunction object ) {
    if( ! locationTableFunctions._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in facilities
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Facility facilities(int index) {
    return facilities.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection facilities<br>
   * @return newly created embedded object
   */
  public Facility add_facilities() {
    int index = facilities.size();
    Facility _result_xjal = instantiate_facilities_xjal( index );
    facilities.callSetupParameters( _result_xjal, index );
    facilities.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection facilities<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>facilities.size()</code> method <strong>before</strong> this method is called
   * @param city
   * @param isHomeFacility
   * @param lon
   * @param lat
   * @param locIndex
   * @return newly created embedded object
   */
  public Facility add_facilities( String city, boolean isHomeFacility, double lon, double lat, int locIndex ) {
    int index = facilities.size();
    Facility _result_xjal = instantiate_facilities_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.city = city;
    _result_xjal.isHomeFacility = isHomeFacility;
    _result_xjal.lon = lon;
    _result_xjal.lat = lat;
    _result_xjal.locIndex = locIndex;
    // Finish embedded object creation
    facilities.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection facilities<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object facilities - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to facilities
   */
  public boolean remove_facilities( Facility object ) {
    if( ! facilities._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in multiLocationTrips
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public MultiLocationTrip multiLocationTrips(int index) {
    return multiLocationTrips.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection multiLocationTrips<br>
   * @return newly created embedded object
   */
  public MultiLocationTrip add_multiLocationTrips() {
    int index = multiLocationTrips.size();
    MultiLocationTrip _result_xjal = instantiate_multiLocationTrips_xjal( index );
    multiLocationTrips.callSetupParameters( _result_xjal, index );
    multiLocationTrips.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection multiLocationTrips<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>multiLocationTrips.size()</code> method <strong>before</strong> this method is called
   * @param destinations
   * @param psngr_origin
   * @return newly created embedded object
   */
  public MultiLocationTrip add_multiLocationTrips( int[] destinations, MetroStation psngr_origin ) {
    int index = multiLocationTrips.size();
    MultiLocationTrip _result_xjal = instantiate_multiLocationTrips_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.destinations = destinations;
    _result_xjal.psngr_origin = psngr_origin;
    // Finish embedded object creation
    multiLocationTrips.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection multiLocationTrips<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object multiLocationTrips - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to multiLocationTrips
   */
  public boolean remove_multiLocationTrips( MultiLocationTrip object ) {
    if( ! multiLocationTrips._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }

  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected MetroStation instantiate_metroStation_xjal( final int index ) {
    MetroStation _result_xjal = new MetroStation( getEngine(), this, metroStation );
    
    metroStation._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_metroStation_xjal( final MetroStation self, final int index, TableInput _t ) {
    if (_t != null) {
      self.origin_name = _t.getValue( "origin_name", String.class );
    } else {
    self.origin_name = self._origin_name_DefaultValue_xjal();
    }
    if (_t != null) {
      self.origin_lat = _t.getValue( "origin_lat", double.class );
    } else {
    self.origin_lat = self._origin_lat_DefaultValue_xjal();
    }
    if (_t != null) {
      self.origin_lon = _t.getValue( "origin_lon", double.class );
    } else {
    self.origin_lon = self._origin_lon_DefaultValue_xjal();
    }
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_metroStation_xjal( MetroStation self, final int index, TableInput _t ) {
	double _initial_speed = 
0 
;
	self.setSpeed(_initial_speed, MPS);
    self.setEnvironment( this );

    // Port connections
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected Autos instantiate_autos_xjal( final int index ) {
    Autos _result_xjal = new Autos( getEngine(), this, autos );
    
    autos._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_autos_xjal( final Autos self, final int index, TableInput _t ) {
    self.autoOrigin = self._autoOrigin_DefaultValue_xjal();
    self.autoGISVoronoiRegion = self._autoGISVoronoiRegion_DefaultValue_xjal();
    self.autoOrigin_Lat = self._autoOrigin_Lat_DefaultValue_xjal();
    self.autoOrigin_Lon = self._autoOrigin_Lon_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_autos_xjal( Autos self, final int index, TableInput _t ) {
	double _initial_speed = 
autoSpeed 
;
	self.setSpeed(_initial_speed, MPS);
    self.setEnvironment( this );
    self.setLatLon( 12.980469225049424, 77.57335503965125 );

    // Port connections
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected Passengr instantiate_passengrs_xjal( final int index ) {
    Passengr _result_xjal = new Passengr( getEngine(), this, passengrs );
    
    passengrs._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_passengrs_xjal( final Passengr self, final int index, TableInput _t ) {
    self.percWantLastMile = 
0.01 
;
    self.isAssignedAuto = 
false 
;
    self.psngr_id = self._psngr_id_DefaultValue_xjal();
    self.psngr_origin = self._psngr_origin_DefaultValue_xjal();
    self.hasCheckedAutoComebackTime = self._hasCheckedAutoComebackTime_DefaultValue_xjal();
    self.psngrDestination = self._psngrDestination_DefaultValue_xjal();
    self.canBeServed = self._canBeServed_DefaultValue_xjal();
    self.destIndex = self._destIndex_DefaultValue_xjal();
    self.isLostDemand = self._isLostDemand_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_passengrs_xjal( Passengr self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected MetroTrain instantiate_metroTrains_xjal( final int index ) {
    MetroTrain _result_xjal = new MetroTrain( getEngine(), this, metroTrains );
    
    metroTrains._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_metroTrains_xjal( final MetroTrain self, final int index, TableInput _t ) {
    self.timeIndex = self._timeIndex_DefaultValue_xjal();
    self.lineType = self._lineType_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_metroTrains_xjal( MetroTrain self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected PsngrDestination instantiate_psngrDestinations_xjal( final int index ) {
    PsngrDestination _result_xjal = new PsngrDestination( getEngine(), this, psngrDestinations );
    
    psngrDestinations._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_psngrDestinations_xjal( final PsngrDestination self, final int index, TableInput _t ) {
    if (_t != null) {
      self.name = _t.getValue( "name", String.class );
    } else {
    self.name = self._name_DefaultValue_xjal();
    }
    if (_t != null) {
      self.lon = _t.getValue( "lon", double.class );
    } else {
    self.lon = self._lon_DefaultValue_xjal();
    }
    if (_t != null) {
      self.lat = _t.getValue( "lat", double.class );
    } else {
    self.lat = self._lat_DefaultValue_xjal();
    }
    self.time = self._time_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_psngrDestinations_xjal( PsngrDestination self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Enter<Agent> instantiate_PassengerQueue_xjal() {
    com.anylogic.libraries.processmodeling.Enter<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_PassengerQueue_xjal( final com.anylogic.libraries.processmodeling.Enter<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.locationXYZInNetwork = self._locationXYZInNetwork_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_PassengerQueue_xjal( com.anylogic.libraries.processmodeling.Enter<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Exit<Agent> instantiate_Finished_xjal() {
    com.anylogic.libraries.processmodeling.Exit<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Exit<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_Finished_xjal( final com.anylogic.libraries.processmodeling.Exit<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_Finished_xjal( com.anylogic.libraries.processmodeling.Exit<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Queue<Agent> instantiate_ArriveAtPickupArea_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_ArriveAtPickupArea_xjal( final com.anylogic.libraries.processmodeling.Queue<Agent> self, TableInput _t ) {
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.queuing = self._queuing_DefaultValue_xjal();
    self.enableTimeout = self._enableTimeout_DefaultValue_xjal();
    self.enablePreemption = self._enablePreemption_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = 
false 
;
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_ArriveAtPickupArea_xjal( com.anylogic.libraries.processmodeling.Queue<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Agent> instantiate_GenerateVehicleRequest_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Agent>( getEngine(), this, null ) {
      @Override
      public double delayTime( Agent agent ) {
        return _GenerateVehicleRequest_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return SECOND;
      }
      @Override
      public void onEnter( Agent agent, double delayTime ) {
        _GenerateVehicleRequest_onEnter_xjal( this, agent, delayTime );
      }
      @Override
      public void onExit( Agent agent ) {
        _GenerateVehicleRequest_onExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_GenerateVehicleRequest_xjal( final com.anylogic.libraries.processmodeling.Delay<Agent> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_GenerateVehicleRequest_xjal( com.anylogic.libraries.processmodeling.Delay<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected AutoResourcePool instantiate_autoResourcePools_xjal( final int index ) {
    AutoResourcePool _result_xjal = new AutoResourcePool( getEngine(), this, autoResourcePools );
    
    autoResourcePools._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_autoResourcePools_xjal( final AutoResourcePool self, final int index, TableInput _t ) {
    self.homeLocation = self._homeLocation_DefaultValue_xjal();
    self.voronoiRegion = self._voronoiRegion_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_autoResourcePools_xjal( AutoResourcePool self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Autos> instantiate_resourcePool_xjal( final int index ) {
    com.anylogic.libraries.processmodeling.ResourcePool<Autos> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Autos>( getEngine(), this, resourcePool ) {
      @Override
      public Agent newUnit(  ) {
        return _resourcePool_newUnit_xjal( this, index );
      }

      @AnyLogicInternalCodegenAPI
      public SpeedUnits getUnitsForCodeOf_speed() {
        return MPS;
      }
	};
    
    resourcePool._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_resourcePool_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Autos> self, final int index, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = 
autoSpeed 
;
    self.homeNodes = self._homeNodes_DefaultValue_xjal();
    self.showDefaultAnimationStatic = self._showDefaultAnimationStatic_DefaultValue_xjal();
    self.downtimeSource = self._downtimeSource_DefaultValue_xjal();
    self.downtimeList = self._downtimeList_DefaultValue_xjal();
    self.enableMaintenance = self._enableMaintenance_DefaultValue_xjal();
    self.maintenanceType = self._maintenanceType_DefaultValue_xjal();
    self.enableFailuresRepairs = self._enableFailuresRepairs_DefaultValue_xjal();
    self.countBusyOnlyTimeToFailure = self._countBusyOnlyTimeToFailure_DefaultValue_xjal();
    self.repairType = self._repairType_DefaultValue_xjal();
    self.enableBreaks = self._enableBreaks_DefaultValue_xjal();
    self.breaksSchedule = self._breaksSchedule_DefaultValue_xjal();
    self.enableCustomTasks = self._enableCustomTasks_DefaultValue_xjal();
    self.customTasks = self._customTasks_DefaultValue_xjal();
    self.customizeRequestChoice = self._customizeRequestChoice_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_resourcePool_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Autos> self, final int index, TableInput _t ) {

    // Port connections
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected FirstMilePassenger instantiate_firstMilePassengers_xjal( final int index ) {
    FirstMilePassenger _result_xjal = new FirstMilePassenger( getEngine(), this, firstMilePassengers );
    
    firstMilePassengers._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_firstMilePassengers_xjal( final FirstMilePassenger self, final int index, TableInput _t ) {
    self.percWantFirstMile = self._percWantFirstMile_DefaultValue_xjal();
    self.origin = self._origin_DefaultValue_xjal();
    self.destination = self._destination_DefaultValue_xjal();
    self.isAssignedAuto = self._isAssignedAuto_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_firstMilePassengers_xjal( FirstMilePassenger self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected FirstMileOrigin instantiate_firstMileOrigins_xjal( final int index ) {
    FirstMileOrigin _result_xjal = new FirstMileOrigin( getEngine(), this, firstMileOrigins );
    
    firstMileOrigins._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_firstMileOrigins_xjal( final FirstMileOrigin self, final int index, TableInput _t ) {
    if (_t != null) {
      self.name = _t.getValue( "name", String.class );
    } else {
    self.name = self._name_DefaultValue_xjal();
    }
    if (_t != null) {
      self.lon = _t.getValue( "lon", double.class );
    } else {
    self.lon = self._lon_DefaultValue_xjal();
    }
    if (_t != null) {
      self.lat = _t.getValue( "lat", double.class );
    } else {
    self.lat = self._lat_DefaultValue_xjal();
    }
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_firstMileOrigins_xjal( FirstMileOrigin self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected LocationTableFunction instantiate_locationTableFunctions_xjal( final int index ) {
    LocationTableFunction _result_xjal = new LocationTableFunction( getEngine(), this, locationTableFunctions );
    
    locationTableFunctions._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_locationTableFunctions_xjal( final LocationTableFunction self, final int index, TableInput _t ) {
    self.station = self._station_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_locationTableFunctions_xjal( LocationTableFunction self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected Facility instantiate_facilities_xjal( final int index ) {
    Facility _result_xjal = new Facility( getEngine(), this, facilities );
    
    facilities._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_facilities_xjal( final Facility self, final int index, TableInput _t ) {
    if (_t != null) {
      self.city = _t.getValue( "location", String.class );
    } else {
    self.city = self._city_DefaultValue_xjal();
    }
    if (_t != null) {
      self.isHomeFacility = _t.getValue( "home", boolean.class );
    } else {
    self.isHomeFacility = self._isHomeFacility_DefaultValue_xjal();
    }
    if (_t != null) {
      self.lon = _t.getValue( "x_coordinate", double.class );
    } else {
    self.lon = self._lon_DefaultValue_xjal();
    }
    if (_t != null) {
      self.lat = _t.getValue( "y_coordinate", double.class );
    } else {
    self.lat = self._lat_DefaultValue_xjal();
    }
    if (_t != null) {
      self.locIndex = _t.getValue( "loc_index", int.class );
    } else {
    self.locIndex = self._locIndex_DefaultValue_xjal();
    }
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_facilities_xjal( Facility self, final int index, TableInput _t ) {
    self.setEnvironment( this );
    if (_t != null) {
      self.setLatLon( _t.getValue( "y_coordinate", double.class ), _t.getValue( "x_coordinate", double.class ) );
    } else {
    }

    // Port connections
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pypeline.PyCommunicator instantiate_pyCom_xjal() {
    com.anylogic.libraries.pypeline.PyCommunicator _result_xjal = new com.anylogic.libraries.pypeline.PyCommunicator( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_pyCom_xjal( final com.anylogic.libraries.pypeline.PyCommunicator self, TableInput _t ) {
    self.loadLastWorkingConfig = self._loadLastWorkingConfig_DefaultValue_xjal();
    self.pythonCommandType = self._pythonCommandType_DefaultValue_xjal();
    self.pythonCommand = self._pythonCommand_DefaultValue_xjal();
    self.pythonExecPath = self._pythonExecPath_DefaultValue_xjal();
    self.throwErrorOnFailedAttempt = self._throwErrorOnFailedAttempt_DefaultValue_xjal();
    self.redirectPyOutput = self._redirectPyOutput_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_pyCom_xjal( com.anylogic.libraries.pypeline.PyCommunicator self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected MultiLocationTrip instantiate_multiLocationTrips_xjal( final int index ) {
    MultiLocationTrip _result_xjal = new MultiLocationTrip( getEngine(), this, multiLocationTrips );
    
    multiLocationTrips._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_multiLocationTrips_xjal( final MultiLocationTrip self, final int index, TableInput _t ) {
    self.destinations = self._destinations_DefaultValue_xjal();
    self.psngr_origin = self._psngr_origin_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_multiLocationTrips_xjal( MultiLocationTrip self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }

  private double _GenerateVehicleRequest_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<Agent> self, Agent agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private void _GenerateVehicleRequest_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<Agent> self, Agent agent, double delayTime ) {
    
agent.receive("GenerateVehicleRequestStarted"); 
;
  }
  private void _GenerateVehicleRequest_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Agent> self, Agent agent ) {
    
agent.receive("GenerateVehicleRequestEnded"); 
;
  }
  private Agent _resourcePool_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Autos> self, int index ) {
    Agent _value;
    _value = 
new original_joint_fm_lm_shareability.Autos() 
;
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _passengrs_AllPassengers_xjal() {
    int _value = 0;
    for ( Passengr item : passengrs ) {
      boolean _t = 
item.inState(Passengr.LastMilePassengers); 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _passengrs_LastMilePassengers_xjal() {
    int _value = 0;
    for ( Passengr item : passengrs ) {
      boolean _t = 
item.inState(Passengr.LastMilePassengers); 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  // Functions

  void getGISAreas(  ) { 

ShapeGISMap.Layer[] layers = map.getLayers();
traceln(layers[0]); 
  }

  
double 
 lostDemands(  ) { 

return (numLostDemands + numLostDemandsFM); 
  }

  void totalUtilization(  ) { 

 
  }

  void writeOutput( String argFileContent ) { 

try
{
	String fileContent = argFileContent;
	BufferedWriter writer = new BufferedWriter(new FileWriter("outputLogs.txt", true));
	writer.write(fileContent);
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void getStationWiseStatistics(  ) { 

traceln("\nNum Passengers");
for(MetroStation m: stationWisePsngrCount.keySet()) {
	String stationName = m.origin_name;
	int val = stationWisePsngrCount.get(m);
	traceln(stationName + " : " + val);
}

traceln("\nNum Trips");
for(MetroStation m: stationWiseAutoTrips.keySet()) {
	String stationName = m.origin_name;
	int valTrips = stationWiseAutoTrips.get(m);
	traceln(stationName + " : " + valTrips);
}

traceln("\nLost Demands");
for(MetroStation m: stationWiseLostDemand.keySet()) {
	String stationName = m.origin_name;
	int val = stationWiseLostDemand.get(m);
	traceln(stationName + " : " + val);
}

traceln("\nAverage Trip Distance");
for(MetroStation m1: tripDistance.keySet()) {
	String stationName = m1.origin_name;
	double valDistance = tripDistance.get(m1);
	for(MetroStation m2: stationWiseAutoTrips.keySet()) {
		if(m1.origin_name.equals(m2.origin_name)) {
			int valTrips = stationWiseAutoTrips.get(m2);
			traceln(stationName + " : " + valDistance + " : " + valTrips + " : " + valDistance/valTrips);
		}
	}
}

traceln("\nAverage WaitingTime");
for(MetroStation m1: waitingTime.keySet()) {
	String stationName = m1.origin_name;
	double valWaitTime = waitingTime.get(m1);
	for(MetroStation m2: stationWiseAutoTrips.keySet()) {
		if(m1.origin_name.equals(m2.origin_name)) {
			int valTrips = stationWiseAutoTrips.get(m2);
			traceln(stationName + " : " + valWaitTime/valTrips);
		}
	}
}

traceln("\n Auto Utilization");
for(int i=0; i<40; i++) { 
	traceln(autoResourcePools.get(i).resourcePool.utilization());
}

traceln("\nNum FM Passengers");
for(MetroStation m: stationWiseFMPsngrCount.keySet()) {
	String stationName = m.origin_name;
	int val = stationWiseFMPsngrCount.get(m);
	traceln(stationName + " : " + val);
}

traceln("\nFM Num Trips");
for(MetroStation m: stationWiseAutoTripsFM.keySet()) {
	String stationName = m.origin_name;
	int valTrips = stationWiseAutoTripsFM.get(m);
	traceln(stationName + " : " + valTrips);
}

traceln("\nFM Lost Demands");
for(MetroStation m: stationWiseFMLostDemand.keySet()) {
	String stationName = m.origin_name;
	int val = stationWiseFMLostDemand.get(m);
	traceln(stationName + " : " + val);
}

traceln("numLMPsngrsServed: " + numLMPsngrsServed);
traceln("ending simulation");
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();  
traceln("simulation end time: " + dtf.format(now)); 
  }

  
int [] 
 getFMPsngrCount(  ) { 

traceln("model hour: " + time(HOUR) + " " + getHourOfDay() + " " + getMinute() + " " + getSecond());
List<Tuple> psngrCountList = selectFrom(first_mile_count)
.where(first_mile_count.fm_time_index.eq(getHourOfDay()))
.list(first_mile_count.myrd, first_mile_count.djnr, first_mile_count.agpp, first_mile_count.vjn, first_mile_count.hsli, first_mile_count.mird, first_mile_count.brcs, first_mile_count.kgwa, first_mile_count.vswa,
first_mile_count.vdsa, first_mile_count.cbpk , first_mile_count.magr, first_mile_count.tty, first_mile_count.hlru, first_mile_count.idng, first_mile_count.svrd, first_mile_count.byph, first_mile_count.ngsa, first_mile_count.dsh, first_mile_count.jlhl, first_mile_count.pyid, first_mile_count.peya, first_mile_count.ypi, first_mile_count.ypm, first_mile_count.ssfy, first_mile_count.mhli,
first_mile_count.rjnr, first_mile_count.kvpr, first_mile_count.spru, first_mile_count.spgd, first_mile_count.ckpe, first_mile_count.krmt, first_mile_count.nlc, first_mile_count.lbgh, 
first_mile_count.sece, first_mile_count.jyn, first_mile_count.rvr, first_mile_count.bsnk, first_mile_count.jpn, first_mile_count.puth);

traceln("FM psngrCountList: " + psngrCountList + psngrCountList.get(0).size());
Object[] arrObj = psngrCountList.get(0).toArray();
int[] arrInt = new int[arrObj.length];
for(int i=0; i<arrObj.length; i++){
    arrInt[i] = (int) arrObj[i];
}
return arrInt; 
  }

  void writeLogs( String argFileContent ) { 

try
{
	String fileContent = argFileContent;
	BufferedWriter writer = new BufferedWriter(new FileWriter("hourly_logs.txt", true));
	writer.write(fileContent);
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  
double[][] 
 buildDistanceMatrix(  ) { 


double[][] matrix = new double[facilities.size()][facilities.size()];
for (int i = 0; i < facilities.size(); i++) {
	for (int j = i; j < facilities.size(); j++) {
		matrix[i][j] = facilities(i).distanceByRoute(facilities(j));
		matrix[j][i] = matrix[i][j];
		traceln("matrix: " + i + " " + j + " " + matrix[i][j]);
	}
}
traceln(matrix);
return matrix; 
  }

  
double[][] 
 buildDistanceMatrixSet( int[] locArray, String station_name ) { 

traceln("in buildDistanceMatrixSet: " + locArray + " " + locArray.length + " " + station_name);
List<Integer> list = Arrays.stream(locArray)        
                                    .boxed()          
                                    .collect(Collectors.toList());
list.add(0, 0);
traceln("starting loop: " + list + " " + facilities.size());
List<Facility> selectedLoc = filter(facilities, f -> list.contains(f.locIndex) && f.city.equals(station_name));
traceln("selectedLoc: " + selectedLoc);
for(Facility f: selectedLoc) { 
	traceln("element: "+ f.locIndex  + " " + f.lon + " " + f.lat);
}
double[][] matrix = new double[selectedLoc.size()][selectedLoc.size()];
for (int i = 0; i < selectedLoc.size(); i++) {
	for (int j = i; j < selectedLoc.size(); j++) {
		matrix[i][j] = selectedLoc.get(i).distanceByRoute(selectedLoc.get(j));
		matrix[j][i] = matrix[i][j];
		traceln("matrix: " + i + " " + j + " " + matrix[i][j]);
	}
}
return matrix; 
  }

  void writeStationwiseLostDemand( String argFileContent ) { 

try
{
	String fileContent = argFileContent;
	BufferedWriter writer = new BufferedWriter(new FileWriter("stationwise_lost_demand.txt", true));
	writer.write(fileContent);
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void getLogsTimeWindow(  ) { 

// Get total lost demands
LinkedHashMap<String, Integer> totalLostDemands = new LinkedHashMap<String, Integer>(); 
LinkedHashMap<String, Integer> totalPsngrCount = new LinkedHashMap<String, Integer>(); 
for(MetroStation m: stationWiseFMPsngrCount.keySet()) {
	totalLostDemands.put(m.origin_name, 0);
	totalPsngrCount.put(m.origin_name, 0);
} 

for(String station: totalLostDemands.keySet()) {
	for(MetroStation m1: stationWiseLostDemand.keySet()) {
		if (station.equals(m1.origin_name)) {
			String stationName = station;
			int val = stationWiseLostDemand.get(m1);
			totalLostDemands.put(station, val);
		}
	}
}

for(String station: totalLostDemands.keySet()) {
	for(MetroStation m2: stationWiseFMLostDemand.keySet()) {
		if (station.equals(m2.origin_name)) {
			String stationName = station;
			int val = totalLostDemands.get(station) + stationWiseFMLostDemand.get(m2);
			totalLostDemands.put(station, val);
		}
	}
}

traceln("Total Lost Demands\n");
for(String station: totalLostDemands.keySet()) {
	traceln(station + " : " + totalLostDemands.get(station));
}


LinkedHashMap<String, Integer> map 
    = totalLostDemands.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey(String::compareTo))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (a, b) -> a,
               LinkedHashMap::new
            ));
            
traceln("Sorted Total Lost Demands\n");
for(String m: map.keySet()) {
	traceln(m + " : " + map.get(m));
}  

for(String station: map.keySet()) {
	String stationName = station;
	int val = map.get(station);
}     
writeStationwiseLostDemand(seed + " " + fm_seed + " " + numAutosEach + " ");
for(String station: map.keySet()) {
	writeStationwiseLostDemand(map.get(station) + " "); 
}	
writeStationwiseLostDemand("\n");   

// compute total passenger count
for(String station: totalPsngrCount.keySet()) {
	for(MetroStation m1: stationWisePsngrCount.keySet()) {
		if (station.equals(m1.origin_name)) {
			String stationName = station;
			int val = stationWisePsngrCount.get(m1);
			totalPsngrCount.put(station, val);
		}
	}
}

for(String station: totalPsngrCount.keySet()) {
	for(MetroStation m2: stationWiseFMPsngrCount.keySet()) {
		if (station.equals(m2.origin_name)) {
			String stationName = station;
			int val = totalPsngrCount.get(station) + stationWiseFMPsngrCount.get(m2);
			totalPsngrCount.put(station, val);
		}
	}
} 
LinkedHashMap<String, Integer> psngr_map 
    = totalPsngrCount.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey(String::compareTo))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (a, b) -> a,
               LinkedHashMap::new
            ));
            
writeStationwisePsngrCount(seed + " " + fm_seed+ " " + numAutosEach + " ");
for(String station: map.keySet()) {
	writeStationwisePsngrCount(psngr_map.get(station) + " "); 
}	
writeStationwisePsngrCount("\n");     
writeStationwiseRsrcUtzn();         
  }

  void writeStationwisePsngrCount( String argFileContent ) { 

try
{
	String fileContent = argFileContent;
	BufferedWriter writer = new BufferedWriter(new FileWriter("stationwise_psngr_count.txt", true));
	writer.write(fileContent);
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void writeStationwiseRsrcUtzn(  ) { 

try
{
	BufferedWriter writer = new BufferedWriter(new FileWriter("stationwise_resource_utzn.txt", true));
	writer.write(seed + " " + fm_seed + " " + numAutosEach + " ");
	DecimalFormat df = new DecimalFormat("0.00");
	for(int i=0; i<numMetroStations; i++) {
		writer.write(df.format(autoResourcePools.get(i).resourcePool.utilization()) + " ");
	}
	writer.write("\n");
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void writeLostDemandLocation( String argFileContent ) { 

try
{
	String fileContent = argFileContent;
	BufferedWriter writer = new BufferedWriter(new FileWriter("lost_demand_location.csv", true));
	writer.write(fileContent);
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void writeDistance( String argFileContent ) { 

try
{
	String fileContent = argFileContent;
	BufferedWriter writer = new BufferedWriter(new FileWriter("distance_stats.csv", true));
	writer.write(fileContent);
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void writeShareabilityStats( String argFileContent ) { 

try
{
	String fileContent = argFileContent;
	BufferedWriter writer = new BufferedWriter(new FileWriter("shareability_stats.csv", true));
	writer.write(fileContent);
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void writeAutoStats( String argFileContent ) { 

try
{
	String fileContent = argFileContent;
	BufferedWriter writer = new BufferedWriter(new FileWriter("auto_stats.csv", true));
	writer.write(fileContent);
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void writeFMPDetails( FirstMilePassenger argFileContent ) { 

try
{
	BufferedWriter writer = new BufferedWriter(new FileWriter("FMPDetails.csv", true));
	writer.write(String.valueOf(argFileContent));
	writer.write("\n");
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void writeFMPDetails1( FirstMilePassenger argFileContent ) { 

try
{
	BufferedWriter writer = new BufferedWriter(new FileWriter("FMPDetails1.csv", true));
	writer.write(String.valueOf(argFileContent));
	writer.write("\n");
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void writeFMPDetails2( FirstMilePassenger argFileContent ) { 

try
{
	BufferedWriter writer = new BufferedWriter(new FileWriter("FMPDetails2.csv", true));
	writer.write(String.valueOf(argFileContent));
	writer.write("\n");
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void writeFMPDetails3( FirstMilePassenger argFileContent ) { 

try
{
	BufferedWriter writer = new BufferedWriter(new FileWriter("FMPDetails3.csv", true));
	writer.write(String.valueOf(argFileContent));
	writer.write("\n");
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void writeDebug( String argFileContent ) { 

try
{
	BufferedWriter writer = new BufferedWriter(new FileWriter("writeDebug.csv", true));
	writer.write(String.valueOf(argFileContent));
	writer.write("\n");
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }

  void getAutoIdleStats(  ) { 

for(Autos a: autos) {
	writeAutoStats(a + " " + a.autoOrigin.origin_name + " " + a.timeInState(ResourceUsageState.USAGE_IDLE, MINUTE) + " " + a.getUtilization() + "\n");
} 
  }

  void writeAutoCountStats( String argFileContent ) { 

try
{
	String fileContent = argFileContent;
	BufferedWriter writer = new BufferedWriter(new FileWriter("auto_count_stats.csv", true));
	writer.write(fileContent);
	writer.close();											
}
catch (Exception e)
{
	traceln("Could not write to file.");

} 
  }
  // View areas
  public ViewArea viewQueueLogic = new ViewArea( this, "[Queue Logic]", 0, 2620, 950, 190 );
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 1280.0, 1280.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "viewQueueLogic", this.viewQueueLogic );
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 2 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("Times", 1, 26 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text1_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text2_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text3_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text4_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text5_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text6_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text7_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text8_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text9_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text10_Font = new Font("SansSerif", 0, 10 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text11_Font = _text10_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text12_Font = new Font("SansSerif", 1, 10 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text13_Font = _text10_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text14_Font = _text10_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text15_Font = _text10_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text16_Font = _text10_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text17_Font = _text10_Font;
  @AnyLogicInternalCodegenAPI
  protected static final int _map = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _text1 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle1 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _text2 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _text3 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _text4 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _text5 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle2 = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle3 = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _text6 = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _text7 = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _text8 = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int _text9 = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline = 16;
  @AnyLogicInternalCodegenAPI
  protected static final int _text10 = 17;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline1 = 18;
  @AnyLogicInternalCodegenAPI
  protected static final int _text11 = 19;
  @AnyLogicInternalCodegenAPI
  protected static final int _text12 = 20;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline2 = 21;
  @AnyLogicInternalCodegenAPI
  protected static final int _text13 = 22;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline3 = 23;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline5 = 24;
  @AnyLogicInternalCodegenAPI
  protected static final int _text14 = 25;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline6 = 26;
  @AnyLogicInternalCodegenAPI
  protected static final int _text15 = 27;
  @AnyLogicInternalCodegenAPI
  protected static final int _autos_presentation = 28;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline4 = 29;
  @AnyLogicInternalCodegenAPI
  protected static final int _text16 = 30;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline7 = 31;
  @AnyLogicInternalCodegenAPI
  protected static final int _text17 = 32;
  @AnyLogicInternalCodegenAPI
  protected static final int _NadaprabhuKempegowdaStation = 33;
  @AnyLogicInternalCodegenAPI
  protected static final int _StateBankOfIndia = 34;
  @AnyLogicInternalCodegenAPI
  protected static final int _KrantiviraSangolliRayanna = 35;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Majestic = 36;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Krantivira = 37;
  @AnyLogicInternalCodegenAPI
  protected static final int _Attiguppe = 38;
  @AnyLogicInternalCodegenAPI
  protected static final int _MysoreRoad = 39;
  @AnyLogicInternalCodegenAPI
  protected static final int _DeepanjaliNagar = 40;
  @AnyLogicInternalCodegenAPI
  protected static final int _SriBalagangadaranathaSwamyHosahalli = 41;
  @AnyLogicInternalCodegenAPI
  protected static final int _Vijayanagara = 42;
  @AnyLogicInternalCodegenAPI
  protected static final int _MagadiRoad = 43;
  @AnyLogicInternalCodegenAPI
  protected static final int _SirMVishweshwariah_CentralCollege = 44;
  @AnyLogicInternalCodegenAPI
  protected static final int _Dr_BRAmbedkarStation = 45;
  @AnyLogicInternalCodegenAPI
  protected static final int _CubbonPark = 46;
  @AnyLogicInternalCodegenAPI
  protected static final int _MahatmaGandhiRoad = 47;
  @AnyLogicInternalCodegenAPI
  protected static final int _Trinity = 48;
  @AnyLogicInternalCodegenAPI
  protected static final int _Halasuru = 49;
  @AnyLogicInternalCodegenAPI
  protected static final int _Indiranagar = 50;
  @AnyLogicInternalCodegenAPI
  protected static final int _SwamiVivekanandaRoad = 51;
  @AnyLogicInternalCodegenAPI
  protected static final int _Baiyyappanahalli = 52;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_MagadiRoad = 53;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_BGSHosahalli = 54;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Vijayanagar = 55;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Attiguppe = 56;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_DeepanjaliNagar = 57;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_MysoreRoad = 58;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_MVCentralCollege = 59;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_BRAmbedkarVS = 60;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_CubbonPark = 61;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_MahatmaGandhiRoad = 62;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Trinity = 63;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Halasuru = 64;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Indiranagar = 65;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_SwamiVivekanandaRoad = 66;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Baiyyaappanahalli = 67;
  @AnyLogicInternalCodegenAPI
  protected static final int _Srirampura = 68;
  @AnyLogicInternalCodegenAPI
  protected static final int _Rajajinagar = 69;
  @AnyLogicInternalCodegenAPI
  protected static final int _Mahalakshmi = 70;
  @AnyLogicInternalCodegenAPI
  protected static final int _SandalSoapFactory = 71;
  @AnyLogicInternalCodegenAPI
  protected static final int _Goraguntepalya = 72;
  @AnyLogicInternalCodegenAPI
  protected static final int _Peenya = 73;
  @AnyLogicInternalCodegenAPI
  protected static final int _PeenyaIndustry = 74;
  @AnyLogicInternalCodegenAPI
  protected static final int _Jalahalli = 75;
  @AnyLogicInternalCodegenAPI
  protected static final int _Dasarahalli = 76;
  @AnyLogicInternalCodegenAPI
  protected static final int _Nagasandra = 77;
  @AnyLogicInternalCodegenAPI
  protected static final int _Yeshwantpura = 78;
  @AnyLogicInternalCodegenAPI
  protected static final int _MahakaviKuvempuRoad = 79;
  @AnyLogicInternalCodegenAPI
  protected static final int _MantriSquare = 80;
  @AnyLogicInternalCodegenAPI
  protected static final int _Chikkapete = 81;
  @AnyLogicInternalCodegenAPI
  protected static final int _KrishnaRajendraMarket = 82;
  @AnyLogicInternalCodegenAPI
  protected static final int _NationalCollege = 83;
  @AnyLogicInternalCodegenAPI
  protected static final int _Lalbagh = 84;
  @AnyLogicInternalCodegenAPI
  protected static final int _SouthEndCircle = 85;
  @AnyLogicInternalCodegenAPI
  protected static final int _Jayanagar = 86;
  @AnyLogicInternalCodegenAPI
  protected static final int _RashtriyaVidyalayaRoad = 87;
  @AnyLogicInternalCodegenAPI
  protected static final int _Banashankari = 88;
  @AnyLogicInternalCodegenAPI
  protected static final int _Yelachenahalli = 89;
  @AnyLogicInternalCodegenAPI
  protected static final int _JPNagar = 90;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_MantriSquare = 91;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Srirampura = 92;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_KuvempuRoad = 93;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Rajajinagar = 94;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_SandalSoapFactory = 95;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Yeshwantpur = 96;
  @AnyLogicInternalCodegenAPI
  protected static final int _gisRoute = 97;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Gorguntepalya = 98;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Peenya = 99;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_PeenyaIndustry = 100;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Jalahalli = 101;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Dasarahalli = 102;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Nagasandra = 103;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Chickpete = 104;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_KRMarket = 105;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_NationalCollege = 106;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Lalbagh = 107;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_SouthEnd = 108;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Jayanagar = 109;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_RVRoad = 110;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Banashankari = 111;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_JPNagar = 112;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Yelachenahalli = 113;
  @AnyLogicInternalCodegenAPI
  protected static final int _Voronoi_Mahalaxmi = 114;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 115;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 100.0, 100.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDY_xjal() {
    return new double[] { 0.0, -10.0, -10.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline1_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 100.0, 100.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline1_pointsDY_xjal() {
    return new double[] { 0.0, -10.0, -10.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline1_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline2_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 100.0, 100.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline2_pointsDY_xjal() {
    return new double[] { 0.0, -10.0, -10.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline2_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline3_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 110.0, 110.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline3_pointsDY_xjal() {
    return new double[] { 0.0, -10.0, -10.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline3_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline5_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 300.0, 300.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline5_pointsDY_xjal() {
    return new double[] { 0.0, -10.0, -10.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline5_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline6_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 100.0, 100.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline6_pointsDY_xjal() {
    return new double[] { 0.0, -10.0, -10.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline6_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline4_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 110.0, 110.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline4_pointsDY_xjal() {
    return new double[] { 0.0, -10.0, -10.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline4_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline7_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 110.0, 110.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline7_pointsDY_xjal() {
    return new double[] { 0.0, -10.0, -10.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline7_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_network_xjal() {
	  network.addAll(gisRoute);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(map, rectangle, text, text1, rectangle1, text2, text3, text4, text5, rectangle2, rectangle3, text6, text7, text8, text9, polyline, text10, polyline1, text11, text12, polyline2, text13, polyline3, polyline5, text14, polyline6, text15, autos_presentation, polyline4, text16, polyline7, text17);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _text1:
        if (true) {
          ShapeText self = this.text1;
          
viewQueueLogic.navigateTo(); 
        }
        break;
      case _text2:
        if (true) {
          ShapeText self = this.text2;
          
_origin_VA.navigateTo(); 
        }
        break;
      case _text6:
        if (true) {
          ShapeText self = this.text6;
          
_origin_VA.navigateTo(); 
        }
        break;
      case _text7:
        if (true) {
          ShapeText self = this.text7;
          
viewQueueLogic.navigateTo(); 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  protected ShapeGISMap map;
  protected ShapeRectangle rectangle;
  protected ShapeText text;
  protected ShapeText text1;
  protected ShapeRectangle rectangle1;
  protected ShapeText text2;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text3_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
date() 
);
  }
  
  protected ShapeText text3;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text4_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
date() 
);
  }
  
  protected ShapeText text4;
  protected ShapeText text5;
  protected ShapeRectangle rectangle2;
  protected ShapeRectangle rectangle3;
  protected ShapeText text6;
  protected ShapeText text7;
  protected ShapeText text8;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text9_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
date() 
);
  }
  
  protected ShapeText text9;
  protected ShapePolyLine polyline;
  protected ShapeText text10;
  protected ShapePolyLine polyline1;
  protected ShapeText text11;
  protected ShapeText text12;
  protected ShapePolyLine polyline2;
  protected ShapeText text13;
  protected ShapePolyLine polyline3;
  protected ShapePolyLine polyline5;
  protected ShapeText text14;
  protected ShapePolyLine polyline6;
  protected ShapeText text15;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  protected ShapeEmbeddedObjectPresentation _autos_presentation_createShapeWithStaticProperties_xjal( final Agent _a, final int _index ) {
    ShapeEmbeddedObjectPresentation shape = new ShapeEmbeddedObjectPresentation( Main.this, SHAPE_DRAW_2D3D, true, 12.980469225049424, 77.57335503965125, 0.0, 0.0,
		false, true, _a );

    return shape;
  }

  protected ShapeAgentPopulationGroup autos_presentation;
  protected ShapePolyLine polyline4;
  protected ShapeText text16;
  protected ShapePolyLine polyline7;
  protected ShapeText text17;
  protected GISPoint NadaprabhuKempegowdaStation;
  protected GISPoint StateBankOfIndia;
  protected GISPoint KrantiviraSangolliRayanna;
  protected GISRegion Voronoi_Majestic;
  protected GISRegion Voronoi_Krantivira;
  protected GISPoint Attiguppe;
  protected GISPoint MysoreRoad;
  protected GISPoint DeepanjaliNagar;
  protected GISPoint SriBalagangadaranathaSwamyHosahalli;
  protected GISPoint Vijayanagara;
  protected GISPoint MagadiRoad;
  protected GISPoint SirMVishweshwariah_CentralCollege;
  protected GISPoint Dr_BRAmbedkarStation;
  protected GISPoint CubbonPark;
  protected GISPoint MahatmaGandhiRoad;
  protected GISPoint Trinity;
  protected GISPoint Halasuru;
  protected GISPoint Indiranagar;
  protected GISPoint SwamiVivekanandaRoad;
  protected GISPoint Baiyyappanahalli;
  protected GISRegion Voronoi_MagadiRoad;
  protected GISRegion Voronoi_BGSHosahalli;
  protected GISRegion Voronoi_Vijayanagar;
  protected GISRegion Voronoi_Attiguppe;
  protected GISRegion Voronoi_DeepanjaliNagar;
  protected GISRegion Voronoi_MysoreRoad;
  protected GISRegion Voronoi_MVCentralCollege;
  protected GISRegion Voronoi_BRAmbedkarVS;
  protected GISRegion Voronoi_CubbonPark;
  protected GISRegion Voronoi_MahatmaGandhiRoad;
  protected GISRegion Voronoi_Trinity;
  protected GISRegion Voronoi_Halasuru;
  protected GISRegion Voronoi_Indiranagar;
  protected GISRegion Voronoi_SwamiVivekanandaRoad;
  protected GISRegion Voronoi_Baiyyaappanahalli;
  protected GISPoint Srirampura;
  protected GISPoint Rajajinagar;
  protected GISPoint Mahalakshmi;
  protected GISPoint SandalSoapFactory;
  protected GISPoint Goraguntepalya;
  protected GISPoint Peenya;
  protected GISPoint PeenyaIndustry;
  protected GISPoint Jalahalli;
  protected GISPoint Dasarahalli;
  protected GISPoint Nagasandra;
  protected GISPoint Yeshwantpura;
  protected GISPoint MahakaviKuvempuRoad;
  protected GISPoint MantriSquare;
  protected GISPoint Chikkapete;
  protected GISPoint KrishnaRajendraMarket;
  protected GISPoint NationalCollege;
  protected GISPoint Lalbagh;
  protected GISPoint SouthEndCircle;
  protected GISPoint Jayanagar;
  protected GISPoint RashtriyaVidyalayaRoad;
  protected GISPoint Banashankari;
  protected GISPoint Yelachenahalli;
  protected GISPoint JPNagar;
  protected GISRegion Voronoi_MantriSquare;
  protected GISRegion Voronoi_Srirampura;
  protected GISRegion Voronoi_KuvempuRoad;
  protected GISRegion Voronoi_Rajajinagar;
  protected GISRegion Voronoi_SandalSoapFactory;
  protected GISRegion Voronoi_Yeshwantpur;
  protected GISRoute gisRoute;
  protected GISRegion Voronoi_Gorguntepalya;
  protected GISRegion Voronoi_Peenya;
  protected GISRegion Voronoi_PeenyaIndustry;
  protected GISRegion Voronoi_Jalahalli;
  protected GISRegion Voronoi_Dasarahalli;
  protected GISRegion Voronoi_Nagasandra;
  protected GISRegion Voronoi_Chickpete;
  protected GISRegion Voronoi_KRMarket;
  protected GISRegion Voronoi_NationalCollege;
  protected GISRegion Voronoi_Lalbagh;
  protected GISRegion Voronoi_SouthEnd;
  protected GISRegion Voronoi_Jayanagar;
  protected GISRegion Voronoi_RVRoad;
  protected GISRegion Voronoi_Banashankari;
  protected GISRegion Voronoi_JPNagar;
  protected GISRegion Voronoi_Yelachenahalli;
  protected GISRegion Voronoi_Mahalaxmi;
  protected com.anylogic.engine.markup.GISNetwork network;

  private INetwork[] _getNetworks_xjal;

  @Override
  public INetwork[] getNetworks() {
    return _getNetworks_xjal;
  }

  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    rectangle = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,0.0, 0.0, 0.0, 0.0, 
            null, dodgerBlue,
			950.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text = new ShapeText(
        SHAPE_DRAW_2D3D, true,20.0, 20.0, 0.0, 0.0, 
        white,"Model",
        _text_Font, ALIGNMENT_LEFT );

    text1 = new ShapeText(
        SHAPE_DRAW_2D3D, true,280.0, 20.0, 0.0, 0.0, 
        white,"Logic",
        _text1_Font, ALIGNMENT_LEFT ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _text1, 0, clickx, clicky );
      }
    };

    rectangle1 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,120.0, 0.0, 0.0, 0.0, 
            null, lightSkyBlue,
			140.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text2 = new ShapeText(
        SHAPE_DRAW_2D3D, true,130.0, 20.0, 0.0, 0.0, 
        white,"Animation",
        _text2_Font, ALIGNMENT_LEFT ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _text2, 0, clickx, clicky );
      }
    };

    text3 = new ShapeText(
        SHAPE_DRAW_2D3D, true,400.0, 20.0, 0.0, 0.0, 
        white,"Date",
        _text3_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text3_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text4 = new ShapeText(
        SHAPE_DRAW_2D, true,550.0, 2650.0, 0.0, 0.0, 
        white,"Date",
        _text4_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text4_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text5 = new ShapeText(
        SHAPE_DRAW_2D, true,100.0, 2650.0, 0.0, 0.0, 
        white,"Model",
        _text5_Font, ALIGNMENT_LEFT );

    rectangle2 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,0.0, 2620.0, 0.0, 0.0, 
            null, dodgerBlue,
			950.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    rectangle3 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,280.0, 2620.0, 0.0, 0.0, 
            null, lightSkyBlue,
			110.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text6 = new ShapeText(
        SHAPE_DRAW_2D3D, true,150.0, 2640.0, 0.0, 0.0, 
        white,"Animation",
        _text6_Font, ALIGNMENT_LEFT ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _text6, 0, clickx, clicky );
      }
    };

    text7 = new ShapeText(
        SHAPE_DRAW_2D3D, true,300.0, 2640.0, 0.0, 0.0, 
        white,"Logic",
        _text7_Font, ALIGNMENT_LEFT ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _text7, 0, clickx, clicky );
      }
    };

    text8 = new ShapeText(
        SHAPE_DRAW_2D, true,30.0, 2640.0, 0.0, 0.0, 
        white,"Model",
        _text8_Font, ALIGNMENT_LEFT );

    text9 = new ShapeText(
        SHAPE_DRAW_2D3D, true,410.0, 2640.0, 0.0, 0.0, 
        white,"Date",
        _text9_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text9_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    polyline = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -510.0, 80.0, 0.0, black, null,
            4, _polyline_pointsDX_xjal(), _polyline_pointsDY_xjal(), _polyline_pointsDZ_xjal(), false, 10.0, 1.0, LINE_STYLE_SOLID );

    text10 = new ShapeText(
        SHAPE_DRAW_2D, true,-480.0, 50.0, 0.0, 0.0, 
        black,"Agents",
        _text10_Font, ALIGNMENT_LEFT );

    polyline1 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -330.0, 80.0, 0.0, black, null,
            4, _polyline1_pointsDX_xjal(), _polyline1_pointsDY_xjal(), _polyline1_pointsDZ_xjal(), false, 10.0, 1.0, LINE_STYLE_SOLID );

    text11 = new ShapeText(
        SHAPE_DRAW_2D, true,-310.0, 50.0, 0.0, 0.0, 
        black,"Parameters",
        _text11_Font, ALIGNMENT_LEFT );

    text12 = new ShapeText(
        SHAPE_DRAW_2D, true,-160.0, 50.0, 0.0, 0.0, 
        dodgerBlue,"Decision Variables",
        _text12_Font, ALIGNMENT_LEFT );

    polyline2 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -160.0, 80.0, 0.0, black, null,
            4, _polyline2_pointsDX_xjal(), _polyline2_pointsDY_xjal(), _polyline2_pointsDZ_xjal(), false, 10.0, 1.0, LINE_STYLE_SOLID );

    text13 = new ShapeText(
        SHAPE_DRAW_2D, true,-640.0, 50.0, 0.0, 0.0, 
        black,"Variables",
        _text13_Font, ALIGNMENT_LEFT );

    polyline3 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -680.0, 80.0, 0.0, black, null,
            4, _polyline3_pointsDX_xjal(), _polyline3_pointsDY_xjal(), _polyline3_pointsDZ_xjal(), false, 10.0, 1.0, LINE_STYLE_SOLID );

    polyline5 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -620.0, 550.0, 0.0, black, null,
            4, _polyline5_pointsDX_xjal(), _polyline5_pointsDY_xjal(), _polyline5_pointsDZ_xjal(), false, 10.0, 1.0, LINE_STYLE_SOLID );

    text14 = new ShapeText(
        SHAPE_DRAW_2D, true,-510.0, 520.0, 0.0, 0.0, 
        black,"Collections",
        _text14_Font, ALIGNMENT_LEFT );

    polyline6 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -330.0, 230.0, 0.0, black, null,
            4, _polyline6_pointsDX_xjal(), _polyline6_pointsDY_xjal(), _polyline6_pointsDZ_xjal(), false, 10.0, 1.0, LINE_STYLE_SOLID );

    text15 = new ShapeText(
        SHAPE_DRAW_2D, true,-300.0, 200.0, 0.0, 0.0, 
        black,"Functions",
        _text15_Font, ALIGNMENT_LEFT );

    polyline4 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -180.0, 370.0, 0.0, black, null,
            4, _polyline4_pointsDX_xjal(), _polyline4_pointsDY_xjal(), _polyline4_pointsDZ_xjal(), false, 10.0, 1.0, LINE_STYLE_SOLID );

    text16 = new ShapeText(
        SHAPE_DRAW_2D, true,-140.0, 340.0, 0.0, 0.0, 
        black,"Events",
        _text16_Font, ALIGNMENT_LEFT );

    polyline7 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -180.0, 160.0, 0.0, black, null,
            4, _polyline7_pointsDX_xjal(), _polyline7_pointsDY_xjal(), _polyline7_pointsDZ_xjal(), false, 10.0, 1.0, LINE_STYLE_SOLID );

    text17 = new ShapeText(
        SHAPE_DRAW_2D, true,-140.0, 130.0, 0.0, 0.0, 
        black,"Schedules",
        _text17_Font, ALIGNMENT_LEFT );

    NadaprabhuKempegowdaStation = new GISPoint( map, true, 12.9757079, 77.5728757, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Nadaprabhu Kempegowda Station, Majestic, Fire Emergency Road, Gandhinagar, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560009, India" );

    StateBankOfIndia = new GISPoint( map, true, 12.9824081, 77.5747713, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "State Bank of India, Subedar Chatram Road, Gandhinagar, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560 020, India" );

    KrantiviraSangolliRayanna = new GISPoint( map, true, 12.9758768, 77.5653767, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Krantivira Sangolli Rayanna, Tank Bund Road, Railway Colony, Subhash Nagar, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560053, India" );

    Voronoi_Majestic = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Majestic", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 5.099834995534166E13 );

    Voronoi_Majestic.setVisible( false );
    Voronoi_Krantivira = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Krantivira", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 9.928955823463254E12 );

    Voronoi_Krantivira.setVisible( false );
    Attiguppe = new GISPoint( map, true, 12.9618931, 77.5335788, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Attiguppe, Chord Road, PF Layout, Attiguppe Ward, South Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560040P, India" );

    MysoreRoad = new GISPoint( map, true, 12.9467183, 77.5301588, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Mysore Road, Ganapathy Nagar, Deepanjali Nagar, South Zone, Bengaluru, Bangalore South, Bangalore Urban, Karnataka, 566026, India" );

    DeepanjaliNagar = new GISPoint( map, true, 12.9520578, 77.5370122, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Deepanjali Nagar, Chord Road, Ganapathy Nagar, Deepanjali Nagar, South Zone, Bengaluru, Bangalore South, Bangalore Urban, Karnataka, 566026, India" );

    SriBalagangadaranathaSwamyHosahalli = new GISPoint( map, true, 12.9742933, 77.5456215, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Sri Balagangadaranatha Swamy Hosahalli, Chord Road, Dasarahalli, Agrahara Dasarahalli Ward, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560040, India" );

    Vijayanagara = new GISPoint( map, true, 12.9709559, 77.5374044, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Vijayanagara, Chord Road, Binny Layout, Marenahalli Ward, South Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560040, India" );

    MagadiRoad = new GISPoint( map, true, 12.975632, 77.5553523, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Magadi Road, Binnipete Ward, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560053, India" );

    SirMVishweshwariah_CentralCollege = new GISPoint( map, true, 12.9745197, 77.58422, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Sir M Vishweshwariah - Central College, Post Office Road, Cubbonpet, Sampangiram Nagar Ward, East Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560053, India" );

    Dr_BRAmbedkarStation = new GISPoint( map, true, 12.9787419, 77.5916385, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Dr. B R Ambedkar Station, Vidhana Soudha, Doctor B R Ambedkar Veedhi, Sampangiram Nagar Ward, East Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560001, India" );

    CubbonPark = new GISPoint( map, true, 12.9809575, 77.5975756, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Cubbon Park, Cubbon Road, Tasker Town, Sampangiram Nagar Ward, East Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, BENGALURU, India" );

    MahatmaGandhiRoad = new GISPoint( map, true, 12.9755264, 77.6067902, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Mahatma Gandhi Road, Shantala Nagar, East Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, BENGALURU, India" );

    Trinity = new GISPoint( map, true, 12.9730218, 77.6170205, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Trinity, Mahatma Gandhi Road, Craig Park Layout, Shantala Nagar, East Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560042, India" );

    Halasuru = new GISPoint( map, true, 12.9764992, 77.626686, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Halasuru, Swamy Vivekananda Road (Old Madras Road), Jogupalya, Halasooru, East Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560042, India" );

    Indiranagar = new GISPoint( map, true, 12.9783325, 77.6386612, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Indiranagar, Chinmaya Mission Hospital Road, Indiranagar 1st Stage, Hoysala Nagara, East Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560038, India" );

    SwamiVivekanandaRoad = new GISPoint( map, true, 12.9859306, 77.644897, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Swami Vivekananda Road, Swamy Vivekananda Road (Old Madras Road), Udaya Nagar, Sarvagna Nagar, East Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560016, India" );

    Baiyyappanahalli = new GISPoint( map, true, 12.9907623, 77.6523976, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Baiyyappanahalli, Railway Line Road, Baiyyappanahalli, Benniganahalli Ward, East Zone, Bengaluru, Bangalore East, Bangalore Urban, Karnataka, 560016, India" );

    Voronoi_MagadiRoad = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_MagadiRoad", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 3265079.8634770974 );

    Voronoi_BGSHosahalli = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_BGSHosahalli", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 3291631.125 );

    Voronoi_Vijayanagar = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Vijayanagar", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 1.12494885625E7 );

    Voronoi_Attiguppe = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Attiguppe", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 1.0102182875E7 );

    Voronoi_DeepanjaliNagar = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_DeepanjaliNagar", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 5844553.1875 );

    Voronoi_MysoreRoad = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_MysoreRoad", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 3.2389347637251377E7 );

    Voronoi_MVCentralCollege = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_MVCentralCollege", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 2.5560394386573516E14 );

    Voronoi_BRAmbedkarVS = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_BRAmbedkarVS", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 2539763.183583479 );

    Voronoi_CubbonPark = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_CubbonPark", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 1.16544479375E7 );

    Voronoi_MahatmaGandhiRoad = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_MahatmaGandhiRoad", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 5300496.0625 );

    Voronoi_Trinity = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Trinity", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 1.09917744375E7 );

    Voronoi_Halasuru = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Halasuru", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 8289663.273635905 );

    Voronoi_Indiranagar = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Indiranagar", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 1.552774275E7 );

    Voronoi_SwamiVivekanandaRoad = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_SwamiVivekanandaRoad", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 8106339.9375 );

    Voronoi_Baiyyaappanahalli = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Baiyyaappanahalli", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 4.3420467446883336E7 );

    Srirampura = new GISPoint( map, true, 12.9965731, 77.5632018, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Srirampura, Mahakavi Kuvempu Road, Maruthi Extension, Gayatri Nagara, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560021, India" );

    Rajajinagar = new GISPoint( map, true, 13.0005247, 77.5496568, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Rajajinagar, Chord Road, West of Chord Road II Stage, Nagapura Ward, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560086, India" );

    Mahalakshmi = new GISPoint( map, true, 13.0080952, 77.5487134, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Mahalakshmi, Chord Road(D. R Bendre Road), Rajajinagara 1st R Blockಟ್, Nagapura Ward, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560 055, India" );

    SandalSoapFactory = new GISPoint( map, true, 13.0147204, 77.5540194, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Sandal Soap Factory, Chord Road, Subrahmanya Nagar, Marappana Palya Ward, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560 055, India" );

    Goraguntepalya = new GISPoint( map, true, 13.0284078, 77.5408961, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Goraguntepalya, Tumkur Road, Goragunte Palya, HMT Ward, Rajarajeshwari Nagar Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560022, India" );

    Peenya = new GISPoint( map, true, 13.0330189, 77.533201, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Peenya, Tumkur Road, Peenya Industrial Area, HMT Ward, Rajarajeshwari Nagar Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560057, India" );

    PeenyaIndustry = new GISPoint( map, true, 13.0363176, 77.5254924, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Peenya Industry, Tumkur Road, Peenya Industrial Area, HMT Ward, Rajarajeshwari Nagar Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560057, India" );

    Jalahalli = new GISPoint( map, true, 13.0394442, 77.5197626, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Jalahalli, Tumkur Road, Peenya Industrial Area, HMT Ward, Rajarajeshwari Nagar Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560057, India" );

    Dasarahalli = new GISPoint( map, true, 13.0432956, 77.5125628, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Dasarahalli, Tumkur Road, Peenya Industrial Area, T Dasarahalli, Dasarahalli Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560057, India" );

    Nagasandra = new GISPoint( map, true, 13.0479497, 77.5001349, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Nagasandra, Tumkur Road, Peenya Industrial Area, Bagalakunte, Dasarahalli Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560057, India" );

    Yeshwantpura = new GISPoint( map, true, 13.0233685, 77.549748, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Yeshwantpura, Tumkur Road, HMT Ward, Rajarajeshwari Nagar Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560022, India" );

    MahakaviKuvempuRoad = new GISPoint( map, true, 12.9984882, 77.5568863, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Mahakavi Kuvempu Road, Prakash Nagar Ward, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560021, India" );

    MantriSquare = new GISPoint( map, true, 12.99156925, 77.57078886504445, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Mantri Square, Sampige Road, Subhash Nagar, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560 020, India" );

    Chikkapete = new GISPoint( map, true, 12.966924, 77.5745835, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Chikkapete, AS Char Street, Chikkapete, K R Market Ward, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560053, India" );

    KrishnaRajendraMarket = new GISPoint( map, true, 12.9608788, 77.5746578, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Krishna Rajendra Market, Krishna Rajendra Road, K R Market Ward, West Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 560 002, India" );

    NationalCollege = new GISPoint( map, true, 12.950526, 77.5737033, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "National College, Krishna Rajendra Road, VV Puram, Vishveshwara Puram, South Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 572161, India" );

    Lalbagh = new GISPoint( map, true, 12.9465339, 77.5799954, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Lalbagh, Rashtriya Vidyalaya Road, Yediyuru, Vishveshwara Puram, South Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 572161, India" );

    SouthEndCircle = new GISPoint( map, true, 12.9382617, 77.5800349, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "South End Circle, Rashtriya Vidyalaya Road, Yediyuru, Jayanagar Ward, South Zone, Bengaluru, Bangalore North, Bangalore Urban, Karnataka, 572161, India" );

    Jayanagar = new GISPoint( map, true, 12.9295069, 77.5801653, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Jayanagar, Rashtriya Vidyalaya Road, Jayanagar 8th Block, Pattabhiram Nagar, South Zone, Bengaluru, Bangalore South, Bangalore Urban, Karnataka, - 560011, India" );

    RashtriyaVidyalayaRoad = new GISPoint( map, true, 12.9213268, 77.5802097, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Rashtriya Vidyalaya Road, Jayanagar 8th Block, Shakambari Nagar, South Zone, Bengaluru, Bangalore South, Bangalore Urban, Karnataka, - 560011, India" );

    Banashankari = new GISPoint( map, true, 12.9152242, 77.5735786, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Banashankari, Kanakapura Road, Kadirenahalli, Banashankari Temple ward, South Zone, Bengaluru, Bangalore South, Bangalore Urban, Karnataka, 560070\", India" );

    Yelachenahalli = new GISPoint( map, true, 12.8960498, 77.5701194, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "Yelachenahalli, Kanakapura Road, Yelchenahalli Ward, Bommanahalli Zone, Bengaluru, Bangalore South, Bangalore Urban, Karnataka, 560082, India" );

    JPNagar = new GISPoint( map, true, 12.9074747, 77.5731279, 3, defaultGisFillColor, brown, 1.0, LINE_STYLE_SOLID, "J P Nagar, Kanakapura Road, Kadirenahalli, Banashankari Temple ward, South Zone, Bengaluru, Bangalore South, Bangalore Urban, Karnataka, 560070\", India" );

    Voronoi_MantriSquare = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_MantriSquare", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 7142395.625 );

    Voronoi_Srirampura = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Srirampura", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 3808916.9375 );

    Voronoi_KuvempuRoad = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_KuvempuRoad", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 1762253.25 );

    Voronoi_Rajajinagar = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Rajajinagar", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 5121717.625 );

    Voronoi_SandalSoapFactory = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_SandalSoapFactory", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 8448903.375 );

    Voronoi_Yeshwantpur = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Yeshwantpur", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 1.349255375E7 );

    Voronoi_Gorguntepalya = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Gorguntepalya", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 7128698.8125 );

    Voronoi_Peenya = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Peenya", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 8459613.375 );

    Voronoi_PeenyaIndustry = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_PeenyaIndustry", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 7503319.625 );

    Voronoi_Jalahalli = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Jalahalli", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 8080195.125 );

    Voronoi_Dasarahalli = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Dasarahalli", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 1.18356691875E7 );

  }
  
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP1_xjal() {
    Voronoi_Nagasandra = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Nagasandra", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 4.589177125E7 );

    Voronoi_Chickpete = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Chickpete", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 1412878.4497927756 );

    Voronoi_KRMarket = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_KRMarket", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 2728692.232530007 );

    Voronoi_NationalCollege = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_NationalCollege", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 4714937.115227324 );

    Voronoi_Lalbagh = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Lalbagh", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 4918588.659035329 );

    Voronoi_SouthEnd = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_SouthEnd", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 5240582.876193637 );

    Voronoi_Jayanagar = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Jayanagar", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 6496336.25 );

    Voronoi_RVRoad = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_RVRoad", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 1.2892619994833456E7 );

    Voronoi_Banashankari = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Banashankari", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 6383778.4375 );

    Voronoi_JPNagar = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_JPNagar", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 7304267.659844543 );

    Voronoi_Yelachenahalli = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Yelachenahalli", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_SOLID, "", 4.4609766731199756E7 );

    Voronoi_Mahalaxmi = new GISRegion( map, true, this.<double[]>getElementProperty("Voronoi_Mahalaxmi", IElementDescriptor.LAT_LON_PAIRS), null, black, 1.0, LINE_STYLE_DASHED, "", 4723732.875 );

    gisRoute = new GISRoute( map, true, brown, 1.0, LINE_STYLE_DASHED, true, null, null, this.<GISMarkupSegmentDescriptor[]>getElementProperty("gisRoute", IElementDescriptor.GIS_MARKUP_SEGMENTS) );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    autos_presentation = new ShapeAgentPopulationGroup(this, SHAPE_DRAW_2D3D, true, autos) {
    
      @Override
      public ShapeEmbeddedObjectPresentation createShapeWithStaticProperties_xjal( final Agent _a, int index ) {
        ShapeEmbeddedObjectPresentation _e = _autos_presentation_createShapeWithStaticProperties_xjal( _a, index );
        return _e;
      }
    };
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    map = new ShapeGISMap(
		Main.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0,
			1240.0, 1240.0, "/original_joint_fm_lm_shareability/", new ShapeGISMap.Layer[] {
              new ShapeGISMap.Layer( "roads_clip_Majestic.shp", "roads_clip_Majestic.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "bglr_metro_lines.shp", "bglr_metro_lines.dbf", red, red, 0, true ),
              new ShapeGISMap.Layer( "station_buffer_10m.shp", "station_buffer_10m.dbf", red, red, 0, true ),
              new ShapeGISMap.Layer( "buffer_0.5km.shp", "buffer_0.5km.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Majestic.shp", "voronoi_with_0.5buffer_name_Majestic.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "roads_clip_Krantivira Sangolli Rayanna Railway Station.shp", "roads_clip_Krantivira Sangolli Rayanna Railway Station.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Krantivira Sangolli Rayanna Railway Station.shp", "voronoi_with_0.5buffer_name_Krantivira Sangolli Rayanna Railway Station.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "random_points_in_poly.shp", "random_points_in_poly.dbf", red, red, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Mysore Road.shp", "voronoi_with_0.5buffer_name_Mysore Road.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Deepanjali Nagar.shp", "voronoi_with_0.5buffer_name_Deepanjali Nagar.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Attiguppe.shp", "voronoi_with_0.5buffer_name_Attiguppe.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Vijayanagara.shp", "voronoi_with_0.5buffer_name_Vijayanagara.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Sri Balagangadaranatha Swamy Hosahalli.shp", "voronoi_with_0.5buffer_name_Sri Balagangadaranatha Swamy Hosahalli.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Magadi Road.shp", "voronoi_with_0.5buffer_name_Magadi Road.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Sir M Vishweshwariah - Central College.shp", "voronoi_with_0.5buffer_name_Sir M Vishweshwariah - Central College.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Dr. B R Ambedkar Station, Vidhana Soudha.shp", "voronoi_with_0.5buffer_name_Dr. B R Ambedkar Station, Vidhana Soudha.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Cubbon Park.shp", "voronoi_with_0.5buffer_name_Cubbon Park.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Mahatma Gandhi Road.shp", "voronoi_with_0.5buffer_name_Mahatma Gandhi Road.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Trinity.shp", "voronoi_with_0.5buffer_name_Trinity.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Halasuru.shp", "voronoi_with_0.5buffer_name_Halasuru.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Indiranagar.shp", "voronoi_with_0.5buffer_name_Indiranagar.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Swami Vivekananda Road.shp", "voronoi_with_0.5buffer_name_Swami Vivekananda Road.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Baiyyappanahalli.shp", "voronoi_with_0.5buffer_name_Baiyyappanahalli.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "random_points.shp", "random_points.dbf", black, white, 0, true ),
              new ShapeGISMap.Layer( "buffer_11m_random_points_purple_line.shp", "buffer_11m_random_points_purple_line.dbf", red, red, 0, false ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Mantri Square Sampige Road.shp", "voronoi_with_0.5buffer_name_Mantri Square Sampige Road.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Srirampura.shp", "voronoi_with_0.5buffer_name_Srirampura.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Rajajinagar.shp", "voronoi_with_0.5buffer_name_Rajajinagar.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Mahalakshmi.shp", "voronoi_with_0.5buffer_name_Mahalakshmi.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Sandal Soap Factory.shp", "voronoi_with_0.5buffer_name_Sandal Soap Factory.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Yeshwantpura.shp", "voronoi_with_0.5buffer_name_Yeshwantpura.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Goraguntepalya.shp", "voronoi_with_0.5buffer_name_Goraguntepalya.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Peenya.shp", "voronoi_with_0.5buffer_name_Peenya.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Peenya Industry.shp", "voronoi_with_0.5buffer_name_Peenya Industry.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Jalahalli.shp", "voronoi_with_0.5buffer_name_Jalahalli.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Dasarahalli.shp", "voronoi_with_0.5buffer_name_Dasarahalli.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Nagasandra.shp", "voronoi_with_0.5buffer_name_Nagasandra.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Mahakavi Kuvempu Road.shp", "voronoi_with_0.5buffer_name_Mahakavi Kuvempu Road.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Chikkapete.shp", "voronoi_with_0.5buffer_name_Chikkapete.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Krishna Rajendra Market.shp", "voronoi_with_0.5buffer_name_Krishna Rajendra Market.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_National College.shp", "voronoi_with_0.5buffer_name_National College.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Lalbagh.shp", "voronoi_with_0.5buffer_name_Lalbagh.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_South End Circle.shp", "voronoi_with_0.5buffer_name_South End Circle.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Jayanagar.shp", "voronoi_with_0.5buffer_name_Jayanagar.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Rashtriya Vidyalaya Road.shp", "voronoi_with_0.5buffer_name_Rashtriya Vidyalaya Road.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Banashankari.shp", "voronoi_with_0.5buffer_name_Banashankari.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_J P Nagar.shp", "voronoi_with_0.5buffer_name_J P Nagar.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "voronoi_with_0.5buffer_name_Yelachenahalli.shp", "voronoi_with_0.5buffer_name_Yelachenahalli.dbf", black, null, 0, true ),
              new ShapeGISMap.Layer( "buffer_11m_random_points_purple_line.shp", "buffer_11m_random_points_purple_line.dbf", black, black, 0, false ),
              new ShapeGISMap.Layer( "buffer_11m_random_points.shp", "buffer_11m_random_points.dbf", red, red, 0, false ),
              new ShapeGISMap.Layer( "merge_voronoi_centroids_11m_buffer.shp", "merge_voronoi_centroids_11m_buffer.dbf", red, red, 0, true ), }, 12.98218141544344, 77.57335503965125, 1.25E-5, silver, 
		white, true, 
		TileURLProviderType.ANYLOGIC, 
		new AnyLogicOnlineRouteProvider(RoutingMethod.SHORTEST, RouteProviderTransportType.CAR), 
		24, false );

	network = new com.anylogic.engine.markup.GISNetwork(map, "network", true);
	_getNetworks_xjal = new INetwork[] { 
      network };
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
    _createPersistentElementsBP1_xjal();
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

	


  /**
   * Constructor
   */
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
    PassengerQueue = instantiate_PassengerQueue_xjal();
    Finished = instantiate_Finished_xjal();
    ArriveAtPickupArea = instantiate_ArriveAtPickupArea_xjal();
    GenerateVehicleRequest = instantiate_GenerateVehicleRequest_xjal();
    pyCom = instantiate_pyCom_xjal();
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main( double autoSpeed, int maxWaitingTime, int[] numAutos, int numMetroStations, int numAutosEach, int maxDetourTime ) {
    markParametersAreSet();
    this.autoSpeed = autoSpeed;
    this.maxWaitingTime = maxWaitingTime;
    this.numAutos = numAutos;
    this.numMetroStations = numMetroStations;
    this.numAutosEach = numAutosEach;
    this.maxDetourTime = maxDetourTime;
  }
  
  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
	if (scheduleNS.isInitialized()) {
		new TableElementDatabaseBuilder(this).setSqlQuery("SELECT arrival_time, sequence FROM ns_train_schedule").fillSchedule(
		  scheduleNS,
		  Integer.class,
		  true,
		  true,
		  86400000L,
		  false,
		  false,
		  3600000L
		  );
    }
	if (scheduleEW_rev.isInitialized()) {
		new TableElementDatabaseBuilder(this).setSqlQuery("SELECT arrival_time, sequence FROM ew_rev_train_schedule").fillSchedule(
		  scheduleEW_rev,
		  Integer.class,
		  true,
		  true,
		  86400000L,
		  false,
		  false,
		  3600000L
		  );
    }
	if (scheduleNS_rev.isInitialized()) {
		new TableElementDatabaseBuilder(this).setSqlQuery("SELECT arrival_time, sequence FROM ns_rev_train_schedule").fillSchedule(
		  scheduleNS_rev,
		  Integer.class,
		  true,
		  true,
		  86400000L,
		  false,
		  false,
		  3600000L
		  );
    }
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_network_xjal();
	_initialize_level_xjal();
    level.initialize();
    network.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , level );
    addAll( metroLocations, new GISPoint[][] 
{ 
	new GISPoint[] {MysoreRoad}, 
	new GISPoint[] {DeepanjaliNagar}, 
	new GISPoint[] {Attiguppe}, 
	new GISPoint[] {Vijayanagara}, 
	new GISPoint[] {SriBalagangadaranathaSwamyHosahalli}, 
	new GISPoint[] {MagadiRoad}, 
	new GISPoint[] {KrantiviraSangolliRayanna}, 
	new GISPoint[] {NadaprabhuKempegowdaStation}, 
	new GISPoint[] {SirMVishweshwariah_CentralCollege}, 
	new GISPoint[] {Dr_BRAmbedkarStation}, 
	new GISPoint[] {CubbonPark}, 
	new GISPoint[] {MahatmaGandhiRoad}, 
	new GISPoint[] {Trinity}, 
	new GISPoint[] {Halasuru}, 
	new GISPoint[] {Indiranagar}, 
	new GISPoint[] {SwamiVivekanandaRoad}, 
	new GISPoint[] {Baiyyappanahalli},
	new GISPoint[] {Nagasandra},
	new GISPoint[] {Dasarahalli},
	new GISPoint[] {Jalahalli},
	new GISPoint[] {PeenyaIndustry},
	new GISPoint[] {Peenya},
	new GISPoint[] {Goraguntepalya},
	new GISPoint[] {Yeshwantpura},
	new GISPoint[] {SandalSoapFactory},
	new GISPoint[] {Mahalakshmi},
	new GISPoint[] {Rajajinagar},
	new GISPoint[] {MahakaviKuvempuRoad},
	new GISPoint[] {Srirampura},
	new GISPoint[] {MantriSquare},
	new GISPoint[] {Chikkapete},
	new GISPoint[] {KrishnaRajendraMarket},
	new GISPoint[] {NationalCollege},
	new GISPoint[] {Lalbagh},
	new GISPoint[] {SouthEndCircle},
	new GISPoint[] {Jayanagar},
	new GISPoint[] {RashtriyaVidyalayaRoad},
	new GISPoint[] {Banashankari},
	new GISPoint[] {JPNagar},
	new GISPoint[] {Yelachenahalli}
} 
    );
    addAll( voronoiRegions, new GISRegion[] 
{ Voronoi_MysoreRoad, Voronoi_DeepanjaliNagar, Voronoi_Attiguppe, Voronoi_Vijayanagar, Voronoi_BGSHosahalli, Voronoi_MagadiRoad, Voronoi_Krantivira, Voronoi_Majestic, Voronoi_MVCentralCollege, Voronoi_BRAmbedkarVS, Voronoi_CubbonPark, Voronoi_MahatmaGandhiRoad, Voronoi_Trinity, Voronoi_Halasuru, Voronoi_Indiranagar, Voronoi_SwamiVivekanandaRoad, Voronoi_Baiyyaappanahalli, Voronoi_Nagasandra, Voronoi_Dasarahalli, Voronoi_Jalahalli, Voronoi_PeenyaIndustry, Voronoi_Peenya, Voronoi_Gorguntepalya, Voronoi_Yeshwantpur, Voronoi_SandalSoapFactory, Voronoi_Mahalaxmi, Voronoi_Rajajinagar, Voronoi_KuvempuRoad, Voronoi_Srirampura, Voronoi_MantriSquare, Voronoi_Chickpete, Voronoi_KRMarket, Voronoi_NationalCollege, Voronoi_Lalbagh, Voronoi_SouthEnd, Voronoi_Jayanagar, Voronoi_RVRoad, Voronoi_Banashankari, Voronoi_JPNagar, Voronoi_Yelachenahalli } 
    );
    addAll( capacities, new Integer[] 
// OptQuest
//{numAutos[0], numAutos[1], numAutos[2], numAutos[3], numAutos[4], numAutos[5], numAutos[6], numAutos[7], numAutos[8], numAutos[9], numAutos[10], numAutos[11], numAutos[12], numAutos[13], numAutos[14], numAutos[15], numAutos[16], numAutos[17], numAutos[18], numAutos[19], numAutos[20], numAutos[21], numAutos[22], numAutos[23], numAutos[24], numAutos[25], numAutos[26], numAutos[27], numAutos[28], numAutos[29], numAutos[30], numAutos[31], numAutos[32], numAutos[33], numAutos[34], numAutos[35], numAutos[36], numAutos[37], numAutos[38], numAutos[39]}

// New ILP @ 1200 autos
//{60, 15, 30, 50, 30, 20, 15, 40, 30, 30, 40, 55, 50, 20, 55, 30, 60, 35, 25, 35, 10, 15, 20, 30, 35, 20, 25, 10, 15, 45, 15, 15, 20, 20, 20, 25, 25, 25, 25, 60}

// New ILP @ 1600 autos
//{60, 30, 40, 50, 35, 25, 20, 40, 35, 35, 60, 55, 55, 25, 60, 40, 60, 60, 30, 40, 30, 25, 25, 60, 45, 60, 40, 15, 35, 55, 15, 15, 20, 20, 40, 40, 35, 55, 55, 60}

// New ILP @ 800 autos
{40, 10, 15, 30, 20, 10, 10, 35, 20, 20, 20, 40, 25, 10, 35, 20, 60, 20, 20, 20, 5, 10,	15, 20,	20, 15,	15, 5, 10, 30, 10, 15, 15, 15, 15, 20, 15, 20, 15, 35}

//Proportional to demand
//{51, 15, 25, 40, 27, 20, 21, 60, 40, 31, 29, 55, 31, 17, 60, 26, 60, 27, 27, 25, 6, 10, 16, 31,	29, 27,	33, 14,	16, 49,	31, 27,	28, 22,	17, 29,	18, 35,	25, 50}

//Cplex output updated (lower convex and averaged) @ 1200 autos
//{60, 15, 30, 50, 30, 20, 15, 38, 35, 30, 40, 55, 50, 20, 55, 30, 60, 32, 25, 35, 10, 15, 20, 30, 35, 20, 25, 9, 13, 40, 25, 15, 19, 20, 20, 25, 25, 25, 24, 60}

//Cplex output updated (lower convex and averaged) @ 800 autos
//{40, 10, 15, 30, 20, 10, 10, 35, 20, 20, 20, 40, 25, 10, 35, 20, 60, 20, 20, 20, 5, 10,	15, 20,	20, 15,	16, 5, 10, 30, 10, 14, 15, 15, 15, 20, 15, 20, 15, 35}

//Cplex output updated (lower convex and averaged) @ 1600 autos
//{60, 15, 30, 50, 30, 20, 32, 38, 60, 32, 60, 55, 55, 40, 60, 39, 60, 60, 60, 35, 15, 23, 20, 30, 39, 22, 30, 50, 25, 55, 25, 60, 45, 20, 22, 40, 35, 38, 55, 60}
 
    );
    addAll( idle_trucks, new Autos[] 
{ } 
    );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Main.this, getElementProperty( "original_joint_fm_lm_shareability.Main.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Environments setup
    setupSpace( map );
    disableSteps();
    setNetworkUserDefined();
    // Creating non-replicated embedded objects
    setupParameters_PassengerQueue_xjal( PassengerQueue, null );
    doBeforeCreate_PassengerQueue_xjal( PassengerQueue, null );
    PassengerQueue.createAsEmbedded();
    setupParameters_Finished_xjal( Finished, null );
    doBeforeCreate_Finished_xjal( Finished, null );
    Finished.createAsEmbedded();
    setupParameters_ArriveAtPickupArea_xjal( ArriveAtPickupArea, null );
    doBeforeCreate_ArriveAtPickupArea_xjal( ArriveAtPickupArea, null );
    ArriveAtPickupArea.createAsEmbedded();
    setupParameters_GenerateVehicleRequest_xjal( GenerateVehicleRequest, null );
    doBeforeCreate_GenerateVehicleRequest_xjal( GenerateVehicleRequest, null );
    GenerateVehicleRequest.createAsEmbedded();
    setupParameters_pyCom_xjal( pyCom, null );
    doBeforeCreate_pyCom_xjal( pyCom, null );
    pyCom.createAsEmbedded();
	 // Port connectors with non-replicated objects
    ArriveAtPickupArea.in.connect( PassengerQueue.out ); // connector
    GenerateVehicleRequest.in.connect( ArriveAtPickupArea.out ); // connector1
    Finished.in.connect( GenerateVehicleRequest.out ); // connector2
    // Creating replicated embedded objects
    metroStation.setEnvironment( this );
    metroStation.fillFromTable( new TableInput( this, (java.util.function.Supplier<ResultSet> & Serializable) () -> selectResultSet(
	"SELECT * FROM metro_stations;"
)), null, true, false );
    autos.setEnvironment( this );
    for ( int i = 0; i < autos.size(); i++ ) {
      Autos _a = autos.get(i); 
      setupParameters_autos_xjal( _a, i, null );
      doBeforeCreate_autos_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    passengrs.setEnvironment( this );
    for ( int i = 0; i < passengrs.size(); i++ ) {
      Passengr _a = passengrs.get(i); 
      setupParameters_passengrs_xjal( _a, i, null );
      doBeforeCreate_passengrs_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    metroTrains.setEnvironment( this );
    for ( int i = 0; i < metroTrains.size(); i++ ) {
      MetroTrain _a = metroTrains.get(i); 
      setupParameters_metroTrains_xjal( _a, i, null );
      doBeforeCreate_metroTrains_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    psngrDestinations.setEnvironment( this );
    psngrDestinations.fillFromTable( new TableInput( this, (java.util.function.Supplier<ResultSet> & Serializable) () -> selectResultSet(
	"SELECT * FROM eb_centroids;"
)), null, true, false );
    autoResourcePools.setEnvironment( this );
    for ( int i = 0; i < autoResourcePools.size(); i++ ) {
      AutoResourcePool _a = autoResourcePools.get(i); 
      setupParameters_autoResourcePools_xjal( _a, i, null );
      doBeforeCreate_autoResourcePools_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    for ( int i = 0; i < resourcePool.size(); i++ ) {
      ResourcePool _a = resourcePool.get(i); 
      setupParameters_resourcePool_xjal( _a, i, null );
      doBeforeCreate_resourcePool_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    firstMilePassengers.setEnvironment( this );
    for ( int i = 0; i < firstMilePassengers.size(); i++ ) {
      FirstMilePassenger _a = firstMilePassengers.get(i); 
      setupParameters_firstMilePassengers_xjal( _a, i, null );
      doBeforeCreate_firstMilePassengers_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    firstMileOrigins.setEnvironment( this );
    firstMileOrigins.fillFromTable( new TableInput( this, (java.util.function.Supplier<ResultSet> & Serializable) () -> selectResultSet(
	"SELECT * FROM eb_centroids;"
)), null, true, false );
    locationTableFunctions.setEnvironment( this );
    for ( int i = 0; i < locationTableFunctions.size(); i++ ) {
      LocationTableFunction _a = locationTableFunctions.get(i); 
      setupParameters_locationTableFunctions_xjal( _a, i, null );
      doBeforeCreate_locationTableFunctions_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    facilities.setEnvironment( this );
    facilities.fillFromTable( new TableInput( this, (java.util.function.Supplier<ResultSet> & Serializable) () -> selectResultSet(
	"SELECT * FROM facilities;"
)), null, true, false );
    multiLocationTrips.setEnvironment( this );
    for ( int i = 0; i < multiLocationTrips.size(); i++ ) {
      MultiLocationTrip _a = multiLocationTrips.get(i); 
      setupParameters_multiLocationTrips_xjal( _a, i, null );
      doBeforeCreate_multiLocationTrips_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    setupInitialConditions_xjal( Main.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    generateFMPassengers.start();
    getHourlyLostDemands.start();
    countAutos.start();
    _scheduleEW_Action_xjal.start();
    _scheduleNS_Action_xjal.start();
    _scheduleEW_rev_Action_xjal.start();
    _scheduleNS_rev_Action_xjal.start();
    event.start();
    for (Agent embeddedObject : metroStation) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : autos) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : passengrs) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : metroTrains) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : psngrDestinations) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : autoResourcePools) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : resourcePool) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : firstMilePassengers) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : firstMileOrigins) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : locationTableFunctions) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : facilities) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : multiLocationTrips) {
      embeddedObject.startAsEmbedded();
    }
    PassengerQueue.startAsEmbedded();
    Finished.startAsEmbedded();
    ArriveAtPickupArea.startAsEmbedded();
    GenerateVehicleRequest.startAsEmbedded();
    pyCom.startAsEmbedded();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
    numLostDemands = 
0 
;
    numUnserviceable = 
0 
;
    numLostDemandsFM = 
0 
;
    numLMPsngrsServed = 
0 
;
    numFMPsngrsServed = 
0 
;
    seed = 
5 
;
    fm_seed = 
5 
;
    trip_1 = 
0 
;
    trip_2 = 
0 
;
    trip_3 = 
0 
;
    jointTrip = 
0 
;
    added_data = 
false 
;
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }


  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( metroStation );
    list.add( autos );
    list.add( passengrs );
    list.add( metroTrains );
    list.add( psngrDestinations );
    list.add( PassengerQueue );
    list.add( Finished );
    list.add( ArriveAtPickupArea );
    list.add( GenerateVehicleRequest );
    list.add( autoResourcePools );
    list.add( resourcePool );
    list.add( firstMilePassengers );
    list.add( firstMileOrigins );
    list.add( locationTableFunctions );
    list.add( facilities );
    list.add( pyCom );
    list.add( multiLocationTrips );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    event.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    generateFMPassengers.onDestroy();
    getHourlyLostDemands.onDestroy();
    countAutos.onDestroy();
    _scheduleEW_Action_xjal.onDestroy();
    _scheduleNS_Action_xjal.onDestroy();
    _scheduleEW_rev_Action_xjal.onDestroy();
    _scheduleNS_rev_Action_xjal.onDestroy();
    event.onDestroy();
    for (Agent _item : metroStation) {
      _item.onDestroy();
    }
    for (Agent _item : autos) {
      _item.onDestroy();
    }
    for (Agent _item : passengrs) {
      _item.onDestroy();
    }
    for (Agent _item : metroTrains) {
      _item.onDestroy();
    }
    for (Agent _item : psngrDestinations) {
      _item.onDestroy();
    }
    PassengerQueue.onDestroy();
    Finished.onDestroy();
    ArriveAtPickupArea.onDestroy();
    GenerateVehicleRequest.onDestroy();
    for (Agent _item : autoResourcePools) {
      _item.onDestroy();
    }
    for (Agent _item : resourcePool) {
      _item.onDestroy();
    }
    for (Agent _item : firstMilePassengers) {
      _item.onDestroy();
    }
    for (Agent _item : firstMileOrigins) {
      _item.onDestroy();
    }
    for (Agent _item : locationTableFunctions) {
      _item.onDestroy();
    }
    for (Agent _item : facilities) {
      _item.onDestroy();
    }
    pyCom.onDestroy();
    for (Agent _item : multiLocationTrips) {
      _item.onDestroy();
    }
    map.destroy();
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    for (Agent _item : metroStation) {
      _item.doFinish();
    }
    for (Agent _item : autos) {
      _item.doFinish();
    }
    for (Agent _item : passengrs) {
      _item.doFinish();
    }
    for (Agent _item : metroTrains) {
      _item.doFinish();
    }
    for (Agent _item : psngrDestinations) {
      _item.doFinish();
    }
    PassengerQueue.doFinish();
    Finished.doFinish();
    ArriveAtPickupArea.doFinish();
    GenerateVehicleRequest.doFinish();
    for (Agent _item : autoResourcePools) {
      _item.doFinish();
    }
    for (Agent _item : resourcePool) {
      _item.doFinish();
    }
    for (Agent _item : firstMilePassengers) {
      _item.doFinish();
    }
    for (Agent _item : firstMileOrigins) {
      _item.doFinish();
    }
    for (Agent _item : locationTableFunctions) {
      _item.doFinish();
    }
    for (Agent _item : facilities) {
      _item.doFinish();
    }
    pyCom.doFinish();
    for (Agent _item : multiLocationTrips) {
      _item.doFinish();
    }
  }



}
