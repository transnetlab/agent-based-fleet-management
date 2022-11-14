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

public class MetroStation extends Agent
{
  // Parameters

  public 
String  origin_name;

  /**
   * Returns default value for parameter <code>origin_name</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public String _origin_name_DefaultValue_xjal() {
    final MetroStation self = this;
    return null;
  }

  public void set_origin_name( String value ) {
    if (value == this.origin_name) {
      return;
    }
    String _oldValue_xjal = this.origin_name;
    this.origin_name = value;
    onChange_origin_name_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter origin_name.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_origin_name()</code> method instead.
   */
  protected void onChange_origin_name() {
    onChange_origin_name_xjal( origin_name );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_origin_name_xjal( String oldValue ) {  
  }


  public 
double  origin_lat;

  /**
   * Returns default value for parameter <code>origin_lat</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _origin_lat_DefaultValue_xjal() {
    final MetroStation self = this;
    return 0.0;
  }

  public void set_origin_lat( double value ) {
    if (value == this.origin_lat) {
      return;
    }
    double _oldValue_xjal = this.origin_lat;
    this.origin_lat = value;
    onChange_origin_lat_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter origin_lat.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_origin_lat()</code> method instead.
   */
  protected void onChange_origin_lat() {
    onChange_origin_lat_xjal( origin_lat );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_origin_lat_xjal( double oldValue ) {  
  }


  public 
double  origin_lon;

  /**
   * Returns default value for parameter <code>origin_lon</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _origin_lon_DefaultValue_xjal() {
    final MetroStation self = this;
    return 0.0;
  }

  public void set_origin_lon( double value ) {
    if (value == this.origin_lon) {
      return;
    }
    double _oldValue_xjal = this.origin_lon;
    this.origin_lon = value;
    onChange_origin_lon_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter origin_lon.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_origin_lon()</code> method instead.
   */
  protected void onChange_origin_lon() {
    onChange_origin_lon_xjal( origin_lon );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_origin_lon_xjal( double oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    origin_name = _origin_name_DefaultValue_xjal();
    origin_lat = _origin_lat_DefaultValue_xjal();
    origin_lon = _origin_lon_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "origin_name":
      if ( _callOnChange_xjal ) {
        set_origin_name( (String) _value_xjal );
      } else {
        origin_name = (String) _value_xjal;
      }
      return true;
    case "origin_lat":
      if ( _callOnChange_xjal ) {
        set_origin_lat( ((Number) _value_xjal).doubleValue() );
      } else {
        origin_lat = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "origin_lon":
      if ( _callOnChange_xjal ) {
        set_origin_lon( ((Number) _value_xjal).doubleValue() );
      } else {
        origin_lon = ((Number) _value_xjal).doubleValue();
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
    case "origin_name": _result_xjal = origin_name; break;
    case "origin_lat": _result_xjal = origin_lat; break;
    case "origin_lon": _result_xjal = origin_lon; break;
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
      list.add( "origin_name" );
      list.add( "origin_lat" );
      list.add( "origin_lon" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

  public 
int 
 lostDemands;
  public 
int 
 numAutoTrips;
  public 
int 
 numPassengers;
  public 
double 
 totalDistanceKM;
  public 
double 
 totalWaitingTime;
  public 
int 
 lostDemandsFM;
  public 
int 
 numPassengersFM;
  public 
int 
 numAutoTripsFM;

  // Collection Variables
  public 
ArrayList <
Integer > locationQueue = new ArrayList<Integer>();
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( MetroStation.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }



	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 1;


  // Statecharts
  public Statechart<statechart_state> statechart = new Statechart<>( this, (short)0 );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( Statechart _s ) {
    if(_s == this.statechart) return "statechart";
    return super.getNameOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getIdOf( Statechart _s ) {
    if(_s == this.statechart) return 0;
    return super.getIdOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( Statechart _s ) {
    if( _s == this.statechart ) {
      enterState( state, true );
      return;
    }
    super.executeActionOf( _s );
  }

   // States of all statecharts
   
  public enum statechart_state implements IStatechartState<MetroStation, statechart_state> {
    state;

    @AnyLogicInternalCodegenAPI
    private Collection<statechart_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<statechart_state> getSimpleStatesDeep() {
      Collection<statechart_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<statechart_state> getFullState() {
      Set<statechart_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<statechart_state> getStatesInside() {
      Set<statechart_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<statechart_state> getStatechart( MetroStation _a ) {
      return _a.statechart;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state state = statechart_state.state;


  @AnyLogicInternalCodegenAPI
  private void enterState( statechart_state self, boolean _destination ) {
    switch( self ) {
      case state:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( state );
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( statechart_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case state: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( statechart_state _destination ) {
    statechart_state _state = statechart.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  




  // Embedded Objects

  public com.anylogic.libraries.processmodeling.Enter<
Passengr 
> StationPassengerQueue;
  public com.anylogic.libraries.processmodeling.Exit<
Passengr 
> Finished;
  public com.anylogic.libraries.processmodeling.Queue<
Passengr 
> ArriveAtPickupArea;
  public com.anylogic.libraries.processmodeling.Delay<
Passengr 
> GenerateVehicleRequest;

  public String getNameOf( Agent ao ) {
    if ( ao == StationPassengerQueue ) return "StationPassengerQueue";
    if ( ao == Finished ) return "Finished";
    if ( ao == ArriveAtPickupArea ) return "ArriveAtPickupArea";
    if ( ao == GenerateVehicleRequest ) return "GenerateVehicleRequest";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }


  public String getNameOf( AgentList<?> aolist ) {
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    return super.getAnimationSettingsOf( aolist );
  }


  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Enter<Passengr> instantiate_StationPassengerQueue_xjal() {
    com.anylogic.libraries.processmodeling.Enter<Passengr> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<Passengr>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_StationPassengerQueue_xjal( final com.anylogic.libraries.processmodeling.Enter<Passengr> self, TableInput _t ) {
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
  private void doBeforeCreate_StationPassengerQueue_xjal( com.anylogic.libraries.processmodeling.Enter<Passengr> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Exit<Passengr> instantiate_Finished_xjal() {
    com.anylogic.libraries.processmodeling.Exit<Passengr> _result_xjal = new com.anylogic.libraries.processmodeling.Exit<Passengr>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_Finished_xjal( final com.anylogic.libraries.processmodeling.Exit<Passengr> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_Finished_xjal( com.anylogic.libraries.processmodeling.Exit<Passengr> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Queue<Passengr> instantiate_ArriveAtPickupArea_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Passengr> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Passengr>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_ArriveAtPickupArea_xjal( final com.anylogic.libraries.processmodeling.Queue<Passengr> self, TableInput _t ) {
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.queuing = 
self.QUEUING_LIFO 
;
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
  private void doBeforeCreate_ArriveAtPickupArea_xjal( com.anylogic.libraries.processmodeling.Queue<Passengr> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Passengr> instantiate_GenerateVehicleRequest_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Passengr> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Passengr>( getEngine(), this, null ) {
      @Override
      public double delayTime( Passengr agent ) {
        return _GenerateVehicleRequest_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return SECOND;
      }
      @Override
      public void onEnter( Passengr agent, double delayTime ) {
        _GenerateVehicleRequest_onEnter_xjal( this, agent, delayTime );
      }
      @Override
      public void onExit( Passengr agent ) {
        _GenerateVehicleRequest_onExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_GenerateVehicleRequest_xjal( final com.anylogic.libraries.processmodeling.Delay<Passengr> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
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
  private void doBeforeCreate_GenerateVehicleRequest_xjal( com.anylogic.libraries.processmodeling.Delay<Passengr> self, TableInput _t ) {
  }

  private double _GenerateVehicleRequest_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<Passengr> self, Passengr agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private void _GenerateVehicleRequest_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<Passengr> self, Passengr agent, double delayTime ) {
    
traceln(agent + "is in queue");
agent.receive("GenerateVehicleRequestStarted"); 
;
  }
  private void _GenerateVehicleRequest_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Passengr> self, Passengr agent ) {
    
agent.receive("GenerateVehicleRequestEnded"); 
;
  }
  // Functions

  void fnAssignTrip( String station_name ) { 

MetroStation station = findFirst(main.metroStation, m -> m.origin_name.equals(station_name));
traceln("station is: " + station + " " + time());
int numTrucksIdle = findAll(main.autos, a -> (a.inState(Autos.AtMetroStation) && abs(a.autoOrigin_Lat - station.origin_lat) < 0.00001 && abs(a.autoOrigin_Lon - station.origin_lon) < 0.00001)).size();
traceln("numTrucksIdle: " + numTrucksIdle);

if (numTrucksIdle == 0)
	traceln("No trucks available");
else
{
	int[] exec_order = new int[100*3]; 
	
	traceln("in assign order: " + station.locationQueue + " " + station.locationQueue.size());
	traceln(numTrucksIdle);
	if(station.locationQueue.isEmpty())
		traceln("No Orders available");
	else
	{	
		if (station.locationQueue.size()<3*numTrucksIdle)
		{
			for(int i=0; i<station.locationQueue.size(); i++)
			{
				exec_order[i] = station.locationQueue.get(i);
			}
			station.locationQueue.clear();
		}
		else
		{
			for(int k=0; k<3*numTrucksIdle; k++)
			{
				exec_order[k] = station.locationQueue.get(0);
				traceln(k);
				station.locationQueue.remove(0);
				traceln("second cond: " + station.locationQueue);
			}
		}
		int nonZeroNode = 0;
		for(int l = 0; l<100; l++)
		{
			if (exec_order[l] != 0)
				nonZeroNode++;
		}
		
		int[] exec_order_final = new int[nonZeroNode];
		for(int m = 0; m< nonZeroNode; m++)
		{
			if (exec_order[m] != 0)
				exec_order_final[m] = exec_order[m];
		}
	
		main.pyCom.run(
			"import random", // used in the Order agent
			"from vrp_solver_for_anylogic import FacilityOrderSolver",
			String.format( // pass in distance matrix and home index
				"solver = FacilityOrderSolver(%s, %s, %s)",
				main.pyCom.toJson(main.buildDistanceMatrixSet(exec_order_final, station_name)),
				main.home_index, numTrucksIdle
			)
		);
		traceln("exec_order_final: " + Arrays.toString(exec_order_final));
		traceln("main pyCom: " + main.pyCom);
		int[][] newDests = main.pyCom.runResults(
			int[][].class,
			String.format(
				"solver.solve(%s)['order']", // gets the visit order array from the solution
				Arrays.toString(exec_order_final)
			)
		);
		
		traceln("finished calling solver");
		for(int i=0; i<newDests.length; i++) {
			traceln(newDests[i]);
		}
		
		int num = 0;
		for(int j=0; j<newDests.length;)
		{	
			Autos auto = randomWhere(main.autos, v -> v.inState(Autos.AtMetroStation) && abs(v.autoOrigin_Lat - station.origin_lat) < 0.00001 && abs(v.autoOrigin_Lon -station.origin_lon) < 0.00001 && v.hasPassenger == false);
			if (auto != null) {
				traceln("chose auto: " + auto);
				MultiLocationTrip multiLocTrip = new MultiLocationTrip();
				multiLocTrip.lastIndexVisited = -1;
				multiLocTrip.set_destinations(newDests[j]);
				multiLocTrip.set_psngr_origin(station);
				traceln("multiLocTrip: " + multiLocTrip.destinations);
				traceln(multiLocTrip.psngr_origin);
				traceln(multiLocTrip.lastIndexVisited);
				send(multiLocTrip, auto);
				auto.hasPassenger = true;
				j++;
				num++;
			}
			else {
				num++;
			}
		}
	}
}

 
  }
  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 1280.0, 1280.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  protected static final Color __ps278_Fill_Color = new Color( 0x50000000, true );
  protected static final Color __ps279_Fill_Color = new Color( 0xFFDCB200, true );
  protected static final Color __ps280_Fill_Color = new Color( 0xFF806000, true );
  protected static final Color __ps281_Fill_Color = new Color( 0xFFD0A200, true );
  protected static final Color __ps283_Fill_Color = new Color( 0xFFFFE576, true );
  protected static final Color __ps284_Line_Color = new Color( 0xFF4A3500, true );
  @AnyLogicInternalCodegenAPI
  protected static final int __ps278 = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps279 = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps280 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps281 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps282 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps283 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps284 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _warehouse = 8;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 9;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps278_pointsDX_xjal() {
    return new double[] { 0.0, 2.222, 11.111, 8.889,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps278_pointsDY_xjal() {
    return new double[] { 0.0, 1.143, -3.429, -4.571,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps278_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps279_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 3.333, 6.667, 6.667,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps279_pointsDY_xjal() {
    return new double[] { 0.0, -4.0, -4.571, -0.571, 3.429,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps279_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps280_pointsDX_xjal() {
    return new double[] { 0.0, 4.444, 4.444, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps280_pointsDY_xjal() {
    return new double[] { 0.0, 2.286, -0.571, -2.857,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps280_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps281_pointsDX_xjal() {
    return new double[] { 0.0, 8.889, 8.889, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps281_pointsDY_xjal() {
    return new double[] { 0.0, -4.571, -8.571, -4.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps281_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps282_pointsDX_xjal() {
    return new double[] { 0.0, 8.889, 5.556, -3.333,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps282_pointsDY_xjal() {
    return new double[] { 0.0, -4.571, -8.571, -4.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps282_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps283_pointsDX_xjal() {
    return new double[] { 0.0, 8.889, 5.556, -3.333,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps283_pointsDY_xjal() {
    return new double[] { 0.0, -4.571, -4.0, 0.571,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps283_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps284_pointsDX_xjal() {
    return new double[] { 0.0, 8.889, 8.889, 5.556, 2.222, -6.667, -6.667,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps284_pointsDY_xjal() {
    return new double[] { 0.0, -4.571, -8.571, -12.571, -12.0, -7.429, -3.429,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps284_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(warehouse);
  }

  protected ShapePolyLine _ps278;
  protected ShapePolyLine _ps279;
  protected ShapePolyLine _ps280;
  protected ShapePolyLine _ps281;
  protected ShapePolyLine _ps282;
  protected ShapePolyLine _ps283;
  protected ShapePolyLine _ps284;
  protected ShapeGroup warehouse;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    _ps278 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -1.667, 6.857, 0.0, null, __ps278_Fill_Color,
            4, __ps278_pointsDX_xjal(), __ps278_pointsDY_xjal(), __ps278_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps279 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -8.333, 3.429, 0.0, null, __ps279_Fill_Color,
            5, __ps279_pointsDX_xjal(), __ps279_pointsDY_xjal(), __ps279_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps280 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -7.222, 4.0, 0.0, null, __ps280_Fill_Color,
            4, __ps280_pointsDX_xjal(), __ps280_pointsDY_xjal(), __ps280_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps281 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -1.667, 6.857, 0.0, null, __ps281_Fill_Color,
            4, __ps281_pointsDX_xjal(), __ps281_pointsDY_xjal(), __ps281_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps282 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -1.667, 2.857, 0.0, null, gold,
            4, __ps282_pointsDX_xjal(), __ps282_pointsDY_xjal(), __ps282_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps283 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -5.0, -1.143, 0.0, null, __ps283_Fill_Color,
            4, __ps283_pointsDX_xjal(), __ps283_pointsDY_xjal(), __ps283_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps284 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -1.667, 6.857, 0.0, __ps284_Line_Color, null,
            7, __ps284_pointsDX_xjal(), __ps284_pointsDY_xjal(), __ps284_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    warehouse = new ShapeGroup( MetroStation.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , _ps278
	     , _ps279
	     , _ps280
	     , _ps281
	     , _ps282
	     , _ps283
	     , _ps284 );

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
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
  public MetroStation( Engine engine, Agent owner, AgentList<? extends MetroStation> ownerPopulation ) {
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
    StationPassengerQueue = instantiate_StationPassengerQueue_xjal();
    Finished = instantiate_Finished_xjal();
    ArriveAtPickupArea = instantiate_ArriveAtPickupArea_xjal();
    GenerateVehicleRequest = instantiate_GenerateVehicleRequest_xjal();
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
    main = get_Main();
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public MetroStation() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public MetroStation( String origin_name, double origin_lat, double origin_lon ) {
    markParametersAreSet();
    this.origin_name = origin_name;
    this.origin_lat = origin_lat;
    this.origin_lon = origin_lon;
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
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_MetroStation_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( MetroStation.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( MetroStation.this, getElementProperty( "original_joint_fm_lm_shareability.MetroStation.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Creating non-replicated embedded objects
    setupParameters_StationPassengerQueue_xjal( StationPassengerQueue, null );
    doBeforeCreate_StationPassengerQueue_xjal( StationPassengerQueue, null );
    StationPassengerQueue.createAsEmbedded();
    setupParameters_Finished_xjal( Finished, null );
    doBeforeCreate_Finished_xjal( Finished, null );
    Finished.createAsEmbedded();
    setupParameters_ArriveAtPickupArea_xjal( ArriveAtPickupArea, null );
    doBeforeCreate_ArriveAtPickupArea_xjal( ArriveAtPickupArea, null );
    ArriveAtPickupArea.createAsEmbedded();
    setupParameters_GenerateVehicleRequest_xjal( GenerateVehicleRequest, null );
    doBeforeCreate_GenerateVehicleRequest_xjal( GenerateVehicleRequest, null );
    GenerateVehicleRequest.createAsEmbedded();
	 // Port connectors with non-replicated objects
    ArriveAtPickupArea.in.connect( StationPassengerQueue.out ); // connector
    GenerateVehicleRequest.in.connect( ArriveAtPickupArea.out ); // connector1
    Finished.in.connect( GenerateVehicleRequest.out ); // connector2
    // Creating replicated embedded objects
    setupInitialConditions_xjal( MetroStation.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    statechart.start();
    StationPassengerQueue.startAsEmbedded();
    Finished.startAsEmbedded();
    ArriveAtPickupArea.startAsEmbedded();
    GenerateVehicleRequest.startAsEmbedded();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_MetroStation_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_MetroStation_xjal() {
  }

  // User API -----------------------------------------------------
  public Main get_Main() {
    {
      Agent owner = getOwner();
      if ( owner instanceof Main ) return (Main) owner;
    }
    return null;
  }

  /**
   * Read-only variable. <em>Shouldn't be modified by user.</em>
   */
  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient original_joint_fm_lm_shareability.Main main;

  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    statechart.fireEvent( _msg_xjal );
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
    list.add( StationPassengerQueue );
    list.add( Finished );
    list.add( ArriveAtPickupArea );
    list.add( GenerateVehicleRequest );
    return list;
  }

  public AgentList<? extends MetroStation> getPopulation() {
    return (AgentList<? extends MetroStation>) super.getPopulation();
  }

  public List<? extends MetroStation> agentsInRange( double distance ) {
    return (List<? extends MetroStation>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    statechart.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    statechart.onDestroy();
    StationPassengerQueue.onDestroy();
    Finished.onDestroy();
    ArriveAtPickupArea.onDestroy();
    GenerateVehicleRequest.onDestroy();
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    StationPassengerQueue.doFinish();
    Finished.doFinish();
    ArriveAtPickupArea.doFinish();
    GenerateVehicleRequest.doFinish();
  }



}
