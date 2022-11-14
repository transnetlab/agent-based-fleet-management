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

public class Autos extends Agent
        implements IResourceUnit
{
  // Parameters

  public 
MetroStation  autoOrigin;

  /**
   * Returns default value for parameter <code>autoOrigin</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public MetroStation _autoOrigin_DefaultValue_xjal() {
    final Autos self = this;
    return null;
  }

  public void set_autoOrigin( MetroStation value ) {
    if (value == this.autoOrigin) {
      return;
    }
    MetroStation _oldValue_xjal = this.autoOrigin;
    this.autoOrigin = value;
    onChange_autoOrigin_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter autoOrigin.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_autoOrigin()</code> method instead.
   */
  protected void onChange_autoOrigin() {
    onChange_autoOrigin_xjal( autoOrigin );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_autoOrigin_xjal( MetroStation oldValue ) {  
  }


  public 
GISRegion  autoGISVoronoiRegion;

  /**
   * Returns default value for parameter <code>autoGISVoronoiRegion</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public GISRegion _autoGISVoronoiRegion_DefaultValue_xjal() {
    final Autos self = this;
    return null;
  }

  public void set_autoGISVoronoiRegion( GISRegion value ) {
    if (value == this.autoGISVoronoiRegion) {
      return;
    }
    GISRegion _oldValue_xjal = this.autoGISVoronoiRegion;
    this.autoGISVoronoiRegion = value;
    onChange_autoGISVoronoiRegion_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter autoGISVoronoiRegion.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_autoGISVoronoiRegion()</code> method instead.
   */
  protected void onChange_autoGISVoronoiRegion() {
    onChange_autoGISVoronoiRegion_xjal( autoGISVoronoiRegion );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_autoGISVoronoiRegion_xjal( GISRegion oldValue ) {  
  }


  public 
double  autoOrigin_Lat;

  /**
   * Returns default value for parameter <code>autoOrigin_Lat</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _autoOrigin_Lat_DefaultValue_xjal() {
    final Autos self = this;
    return 0.0;
  }

  public void set_autoOrigin_Lat( double value ) {
    if (value == this.autoOrigin_Lat) {
      return;
    }
    double _oldValue_xjal = this.autoOrigin_Lat;
    this.autoOrigin_Lat = value;
    onChange_autoOrigin_Lat_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter autoOrigin_Lat.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_autoOrigin_Lat()</code> method instead.
   */
  protected void onChange_autoOrigin_Lat() {
    onChange_autoOrigin_Lat_xjal( autoOrigin_Lat );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_autoOrigin_Lat_xjal( double oldValue ) {  
  }


  public 
double  autoOrigin_Lon;

  /**
   * Returns default value for parameter <code>autoOrigin_Lon</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _autoOrigin_Lon_DefaultValue_xjal() {
    final Autos self = this;
    return 0.0;
  }

  public void set_autoOrigin_Lon( double value ) {
    if (value == this.autoOrigin_Lon) {
      return;
    }
    double _oldValue_xjal = this.autoOrigin_Lon;
    this.autoOrigin_Lon = value;
    onChange_autoOrigin_Lon_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter autoOrigin_Lon.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_autoOrigin_Lon()</code> method instead.
   */
  protected void onChange_autoOrigin_Lon() {
    onChange_autoOrigin_Lon_xjal( autoOrigin_Lon );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_autoOrigin_Lon_xjal( double oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    autoOrigin = _autoOrigin_DefaultValue_xjal();
    autoGISVoronoiRegion = _autoGISVoronoiRegion_DefaultValue_xjal();
    autoOrigin_Lat = _autoOrigin_Lat_DefaultValue_xjal();
    autoOrigin_Lon = _autoOrigin_Lon_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "autoOrigin":
      if ( _callOnChange_xjal ) {
        set_autoOrigin( (MetroStation) _value_xjal );
      } else {
        autoOrigin = (MetroStation) _value_xjal;
      }
      return true;
    case "autoGISVoronoiRegion":
      if ( _callOnChange_xjal ) {
        set_autoGISVoronoiRegion( (GISRegion) _value_xjal );
      } else {
        autoGISVoronoiRegion = (GISRegion) _value_xjal;
      }
      return true;
    case "autoOrigin_Lat":
      if ( _callOnChange_xjal ) {
        set_autoOrigin_Lat( ((Number) _value_xjal).doubleValue() );
      } else {
        autoOrigin_Lat = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "autoOrigin_Lon":
      if ( _callOnChange_xjal ) {
        set_autoOrigin_Lon( ((Number) _value_xjal).doubleValue() );
      } else {
        autoOrigin_Lon = ((Number) _value_xjal).doubleValue();
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
    case "autoOrigin": _result_xjal = autoOrigin; break;
    case "autoGISVoronoiRegion": _result_xjal = autoGISVoronoiRegion; break;
    case "autoOrigin_Lat": _result_xjal = autoOrigin_Lat; break;
    case "autoOrigin_Lon": _result_xjal = autoOrigin_Lon; break;
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
      list.add( "autoOrigin" );
      list.add( "autoGISVoronoiRegion" );
      list.add( "autoOrigin_Lat" );
      list.add( "autoOrigin_Lon" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

  public 
Trip 
 trip;
  public 
double 
 eta;
  public 
FirstMileTrip 
 fm_trip;
  public 
MultiLocationTrip 
 currentTrip;
  public 
int 
 ordersCompleted;
  public 
MultiLocationTrip 
 currentTrip_copy;
  public 
DummyTrip 
 dummyTrip;
  public 
FirstMilePassenger 
 jointPassenger;
  public 
FirstMilePassenger 
 secondFMPassenger;
  public 
FirstMilePassenger 
 thirdFMPassenger;
  public 
double 
 countShare;
  public 
boolean 
 hasPassenger;
  public 
int 
 numTotalTrips;
  public 
int 
 numTotalTripsFM;
  public 
boolean 
 isJointTrip;
  public 
int 
 numFMPsngrsInAuto;
  public 
int 
 numTripPsngrsServed;
  public 
int 
 numTripFMPsngrsServed;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Autos.class );
  
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
  public Statechart<vehicle_statechart_entry_state> vehicle_statechart_entry = new Statechart<>( this, (short)2 );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( Statechart _s ) {
    if(_s == this.vehicle_statechart_entry) return "vehicle_statechart_entry";
    return super.getNameOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getIdOf( Statechart _s ) {
    if(_s == this.vehicle_statechart_entry) return 0;
    return super.getIdOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( Statechart _s ) {
    if( _s == this.vehicle_statechart_entry ) {
      enterState( AtMetroStation, true );
      return;
    }
    super.executeActionOf( _s );
  }

   // States of all statecharts
   
  public enum vehicle_statechart_entry_state implements IStatechartState<Autos, vehicle_statechart_entry_state> {
    AtMetroStation,
    MovingToDestination,
    Offboarding,
    LMRequestsServed,
    MovingToOrigin,
    Pickup,
    MovingToStationFull,
    MovingToStation,
    can_serve_another_LM_request,
    can_serve_FM_request,
    can_serve_another_FM_request;

    @AnyLogicInternalCodegenAPI
    private Collection<vehicle_statechart_entry_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<vehicle_statechart_entry_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<vehicle_statechart_entry_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<vehicle_statechart_entry_state> getSimpleStatesDeep() {
      Collection<vehicle_statechart_entry_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<vehicle_statechart_entry_state> getFullState() {
      Set<vehicle_statechart_entry_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<vehicle_statechart_entry_state> getStatesInside() {
      Set<vehicle_statechart_entry_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<vehicle_statechart_entry_state> getStatechart( Autos _a ) {
      return _a.vehicle_statechart_entry;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final vehicle_statechart_entry_state AtMetroStation = vehicle_statechart_entry_state.AtMetroStation;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final vehicle_statechart_entry_state MovingToDestination = vehicle_statechart_entry_state.MovingToDestination;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final vehicle_statechart_entry_state Offboarding = vehicle_statechart_entry_state.Offboarding;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final vehicle_statechart_entry_state LMRequestsServed = vehicle_statechart_entry_state.LMRequestsServed;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final vehicle_statechart_entry_state MovingToOrigin = vehicle_statechart_entry_state.MovingToOrigin;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final vehicle_statechart_entry_state Pickup = vehicle_statechart_entry_state.Pickup;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final vehicle_statechart_entry_state MovingToStationFull = vehicle_statechart_entry_state.MovingToStationFull;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final vehicle_statechart_entry_state MovingToStation = vehicle_statechart_entry_state.MovingToStation;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final vehicle_statechart_entry_state can_serve_another_LM_request = vehicle_statechart_entry_state.can_serve_another_LM_request;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final vehicle_statechart_entry_state can_serve_FM_request = vehicle_statechart_entry_state.can_serve_FM_request;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final vehicle_statechart_entry_state can_serve_another_FM_request = vehicle_statechart_entry_state.can_serve_another_FM_request;


  @AnyLogicInternalCodegenAPI
  private void enterState( vehicle_statechart_entry_state self, boolean _destination ) {
    switch( self ) {
      case AtMetroStation:
  	    logToDBEnterState(vehicle_statechart_entry, self);
        // (Simple state (not composite))
        vehicle_statechart_entry.setActiveState_xjal( AtMetroStation );
        {
this.hasPassenger = false;
this.numTripPsngrsServed = 0;
this.numTripFMPsngrsServed = 0;
this.countShare = 0;
if (main.queue.containsKey(this.autoOrigin)) {
	ArrayList<Passengr> station_queue = main.queue.get(this.autoOrigin);
	if (station_queue.size() > 0) {
		traceln("asc: case 1");
		for (Passengr q_passengr : station_queue){
			if (time() > (q_passengr.requestTime + main.maxWaitingTime)) {
				// Lost Demand
				q_passengr.isLostDemand = true;
				q_passengr.onChange();
				send("PassengrLostDemand", q_passengr);			
				traceln(q_passengr + "will be lost demand");
				traceln("locQueue: " + q_passengr.psngr_origin.locationQueue);
				q_passengr.psngr_origin.locationQueue.remove(new Integer(q_passengr.destIndex));
			}
		}
		this.autoOrigin.fnAssignTrip(this.autoOrigin.origin_name);
		traceln("auto sending msg");
	}
}

if (main.queue.containsKey(this.autoOrigin) && main.FMqueue.containsKey(this.autoOrigin)) {
	ArrayList<Passengr> station_queue = main.queue.get(this.autoOrigin);
	ArrayList<FirstMilePassenger> station_FMqueue = main.FMqueue.get(this.autoOrigin);
	traceln("asc: case 2");
	if (station_queue.size() == 0 && station_FMqueue.size() > 0) {
		if (time() < (station_FMqueue.get(0).requestTime + main.maxWaitingTime)) {
			traceln("asc: case 2.1");
			traceln(time() + " " + station_FMqueue.get(0).requestTime);
			traceln(station_FMqueue.get(0));
			send("AutoAvailableForFMPickup", station_FMqueue.get(0));
		}
	}
	
	if (station_FMqueue.size() > 0) {
		for (FirstMilePassenger q_FMpassengr : station_FMqueue){
			if (time() > (q_FMpassengr.requestTime + main.maxWaitingTime)) {
				// Lost Demand
				traceln("asc: case 2.2");
				q_FMpassengr.isFMLostDemand = true;
				q_FMpassengr.onChange();
				send("FMPassengrLostDemand", q_FMpassengr);			
				traceln(q_FMpassengr + "will be lost demand");
			}
		}
	}
}

if (main.FMqueue.containsKey(this.autoOrigin)) {
	ArrayList<FirstMilePassenger> station_DFMqueue = main.FMqueue.get(this.autoOrigin);
	for (FirstMilePassenger q_FMpassengr : station_DFMqueue){
		traceln("print FMPsngr: " + q_FMpassengr);
	}
}

// added for FM shareability
if (main.FMqueue.containsKey(this.autoOrigin)) {
	ArrayList<FirstMilePassenger> station_FMqueue = main.FMqueue.get(this.autoOrigin);
	if (station_FMqueue.size() > 0) {
		traceln("asc: case 3");
		for (FirstMilePassenger q_FMpassengr : station_FMqueue) {
			if (time() < (q_FMpassengr.requestTime + main.maxWaitingTime)) {
				traceln("auto can pick: " + q_FMpassengr);
				send("AutoAvailableForFMPickup", q_FMpassengr);
				break;
			}
		}	
	}
}
this.numFMPsngrsInAuto = 0;
this.jointPassenger = null;
this.isJointTrip = false;
 
;}
        Transition_9.start();
        transition.start();
        return;
      case MovingToDestination:
  	    logToDBEnterState(vehicle_statechart_entry, self);
        // (Simple state (not composite))
        vehicle_statechart_entry.setActiveState_xjal( MovingToDestination );
        {
traceln("in state mtd: " + currentTrip + " " + currentTrip.lastIndexVisited);
traceln(currentTrip.destinations[currentTrip.lastIndexVisited+1]);

Facility facility = findFirst(main.facilities, f -> f.city.equals(this.autoOrigin.origin_name) && f.locIndex == currentTrip.destinations[currentTrip.lastIndexVisited+1]);
moveTo(facility);
traceln(this+ " moving to: " + facility);

// record distance of this trip 
if (currentTrip.lastIndexVisited != -1) {
	double distanceBtwnLoc = main.map.getDistanceByRoute(this.getLatitude(), this.getLongitude(), facility.lat, facility.lon);
	traceln("distance: " + distanceBtwnLoc + " " + this.autoOrigin.totalDistanceKM );
	traceln("check coordinates" + this.getLatitude() + " " + this.getLongitude() + " " + facility.lat + " " + facility.lon);
	this.autoOrigin.totalDistanceKM += distanceBtwnLoc/1000;
	main.tripDistance.put(this.autoOrigin, this.autoOrigin.totalDistanceKM);
	this.numTripPsngrsServed += 1;
} 
;}
        Transition_12.start();
        return;
      case Offboarding:
  	    logToDBEnterState(vehicle_statechart_entry, self);
        // (Simple state (not composite))
        vehicle_statechart_entry.setActiveState_xjal( Offboarding );
        Transition_10.start();
        return;
      case LMRequestsServed:
  	    logToDBEnterState(vehicle_statechart_entry, self);
        // (Simple state (not composite))
        vehicle_statechart_entry.setActiveState_xjal( LMRequestsServed );
        {
traceln("all LM requests served"); 
;}
        transition3.start();
        return;
      case MovingToOrigin:
  	    logToDBEnterState(vehicle_statechart_entry, self);
        // (Simple state (not composite))
        vehicle_statechart_entry.setActiveState_xjal( MovingToOrigin );
        {
if (this.numFMPsngrsInAuto == 0) {
		this.numFMPsngrsInAuto += 1;
		if (fm_trip != null) {
			moveTo(fm_trip.psngr_origin.lat, fm_trip.psngr_origin.lon);
			double distanceBtwnLoc = main.map.getDistanceByRoute(this.getLatitude(), this.getLongitude(), fm_trip.psngr_origin.lat, fm_trip.psngr_origin.lon);
			this.autoOrigin.totalDistanceKM += distanceBtwnLoc/1000;
			traceln("check dist: " + distanceBtwnLoc + " " + this.autoOrigin.totalDistanceKM);
			this.numTripFMPsngrsServed = 1;
			this.countShare = 1;
			fm_trip.passengr.assignedAuto = this;
			if (fm_trip.passengr.counted == false) {
				fm_trip.passengr.counted = true;
			}	
		}
		else {
			moveTo(this.jointPassenger.origin.lat, this.jointPassenger.origin.lon);
			double distanceBtwnLoc = main.map.getDistanceByRoute(this.getLatitude(), this.getLongitude(), this.jointPassenger.origin.lat, this.jointPassenger.origin.lon);
			this.autoOrigin.totalDistanceKM += distanceBtwnLoc/1000;
			traceln("check dist: " + distanceBtwnLoc + " " + this.autoOrigin.totalDistanceKM);
			this.numTripFMPsngrsServed = 1;
			this.countShare = 1;
			this.jointPassenger.assignedAuto = this;
			if (this.jointPassenger.counted == false) {
				this.jointPassenger.counted = true;
			}
		}
}
else {
	if (this.numFMPsngrsInAuto == 1) {
		this.numFMPsngrsInAuto += 1;
		moveTo(this.secondFMPassenger.origin.lat, this.secondFMPassenger.origin.lon);
		traceln(this + " in MTO state: moving to pickup second psngr"); 
		double distanceBtwnLoc = main.map.getDistanceByRoute(this.getLatitude(), this.getLongitude(), this.secondFMPassenger.origin.lat, this.secondFMPassenger.origin.lon);
		this.autoOrigin.totalDistanceKM += distanceBtwnLoc/1000;
		traceln("check dist: " + distanceBtwnLoc + " " + this.autoOrigin.totalDistanceKM);
		this.numTripFMPsngrsServed += 1;
		this.countShare = 2;
		this.secondFMPassenger.assignedAuto = this;
		if (this.secondFMPassenger.counted == false) {
			this.secondFMPassenger.counted = true;
		}	
	} 
	else if (this.numFMPsngrsInAuto == 2) {
		this.numFMPsngrsInAuto += 1;
		moveTo(this.thirdFMPassenger.origin.lat, this.thirdFMPassenger.origin.lon);
		traceln(this + " in MTO state: moving to pickup third psngr");
		double distanceBtwnLoc = main.map.getDistanceByRoute(this.getLatitude(), this.getLongitude(), this.thirdFMPassenger.origin.lat, this.thirdFMPassenger.origin.lon);
		this.autoOrigin.totalDistanceKM += distanceBtwnLoc/1000;
		traceln("check dist: " + distanceBtwnLoc + " " + this.autoOrigin.totalDistanceKM);
		this.numTripFMPsngrsServed += 1;
		this.countShare = 3;
		this.thirdFMPassenger.assignedAuto = this;
		if (this.thirdFMPassenger.counted == false) {
			this.thirdFMPassenger.counted = true;
		}
	}
}

traceln("this.numFMPsngrsInAuto: " + this.numFMPsngrsInAuto);
traceln("Auto total trips: " + this + " " + numTotalTrips); 
;}
        Transition_16.start();
        return;
      case Pickup:
  	    logToDBEnterState(vehicle_statechart_entry, self);
        // (Simple state (not composite))
        vehicle_statechart_entry.setActiveState_xjal( Pickup );
        Transition_14.start();
        return;
      case MovingToStationFull:
  	    logToDBEnterState(vehicle_statechart_entry, self);
        // (Simple state (not composite))
        vehicle_statechart_entry.setActiveState_xjal( MovingToStationFull );
        {
traceln(this + " moving to station full"); 
;}
        Transition_15.start();
        return;
      case MovingToStation:
  	    logToDBEnterState(vehicle_statechart_entry, self);
        // (Simple state (not composite))
        vehicle_statechart_entry.setActiveState_xjal( MovingToStation );
        {
moveTo(this.autoOrigin_Lat, this.autoOrigin_Lon);
traceln("to station " + this + " " + currentTrip);
this.hasPassenger = false;

double distanceBtwnLoc = main.map.getDistanceByRoute(this.getLatitude(), this.getLongitude(), this.autoOrigin_Lat, this.autoOrigin_Lon);
this.autoOrigin.totalDistanceKM += distanceBtwnLoc/1000;
main.tripDistance.put(this.autoOrigin, this.autoOrigin.totalDistanceKM);
traceln("check dist: " + distanceBtwnLoc + " " + this.autoOrigin.totalDistanceKM);
 
;}
        Transition_11.start();
        return;
      case can_serve_another_LM_request:
  	    logToDBEnterState(vehicle_statechart_entry, self);
        // (Branch)
        if ( 
currentTrip.lastIndexVisited >= currentTrip.destinations.length-2 
 ) { // transition1
          {
traceln("currentTrip.lastIndexVisited: " + currentTrip.lastIndexVisited + " " + (currentTrip.destinations.length-1));
ordersCompleted++;
main.idle_trucks.add(this); 
;}
          enterState( LMRequestsServed, true );
          return;
        }
        // transition2 (default)
          enterState( MovingToDestination, true );
        return;
      case can_serve_FM_request:
  	    logToDBEnterState(vehicle_statechart_entry, self);
        // (Branch)
        {
traceln("in joint decision branch: " + this + " " + this.autoOrigin);
ArrayList<FirstMilePassenger> stationFMQueue = main.FMqueue.get(this.autoOrigin);
if (stationFMQueue != null && stationFMQueue.size() > 0) {
	// that psngr should be picked whose waiting time is within threshold
	for(int i=0; i<stationFMQueue.size(); i++) {
		// check the waiting time threshold	
		traceln("joint checking initial: " + i + " " + stationFMQueue.get(i));
		traceln("join checking initial: " + time() + " " + (stationFMQueue.get(i).requestTime + main.maxWaitingTime));
		if(time() <= stationFMQueue.get(i).requestTime + main.maxWaitingTime && stationFMQueue.get(i).isAssignedAuto == false) {
			traceln("joint passenger: " + stationFMQueue.get(i));
			FirstMilePassenger fm_psngr = stationFMQueue.get(i);
			traceln(fm_psngr + " " + fm_psngr.origin.lon+ " " + fm_psngr.origin.lat);
			fm_psngr.isAssignedAuto = true; 
			fm_psngr.canBeServed = true;
			fm_psngr.onChange();
			traceln(this + " 1 onChange() called");
			this.jointPassenger = fm_psngr;
			this.isJointTrip = true;
			send("AutoAvailableForFMPickup", fm_psngr);
			break;
		}
    }
}
 
;}
        if ( 
isJointTrip 
 ) { // transition4
          {
traceln("is a joint trip");
main.writeShareabilityStats("FM-LM\t" + this.autoOrigin.origin_name + "\t" + this.numTripPsngrsServed + "\n");
this.secondFMPassenger = null;
this.thirdFMPassenger = null; 
;}
          enterState( MovingToOrigin, true );
          return;
        }
        // transition7 (default)
          enterState( MovingToStation, true );
        return;
      case can_serve_another_FM_request:
  	    logToDBEnterState(vehicle_statechart_entry, self);
        // (Branch)
        {
traceln(this + "in FM decision branch: " + fm_trip + " " + numFMPsngrsInAuto);
ArrayList<FirstMilePassenger> stationFMQueue = main.FMqueue.get(this.autoOrigin);
if (stationFMQueue.size() > 0 && this.numFMPsngrsInAuto == 1) {
	// that psngr should be picked whose waiting time is within threshold
	for(int i=0; i<stationFMQueue.size(); i++) {
		// check the waiting time threshold	
		traceln("1 checking initial: " + i + " " + stationFMQueue.get(i));
		traceln("1 checking initial: " + time() + " " + (stationFMQueue.get(i).requestTime + main.maxWaitingTime));
		if(time() <= stationFMQueue.get(i).requestTime + main.maxWaitingTime && stationFMQueue.get(i).isAssignedAuto == false) {
			double distanceP1ToStation;
			if(this.fm_trip != null) {
				distanceP1ToStation = main.map.getDistanceByRoute(fm_trip.psngr_origin.lat, fm_trip.psngr_origin.lon, this.autoOrigin.origin_lat, this.autoOrigin.origin_lon);
			} else {
				distanceP1ToStation = main.map.getDistanceByRoute(jointPassenger.origin.lat, jointPassenger.origin.lon, this.autoOrigin.origin_lat, this.autoOrigin.origin_lon);
			}
			double distanceP2ToStation = main.map.getDistanceByRoute(stationFMQueue.get(i).origin.lat, stationFMQueue.get(i).origin.lon, this.autoOrigin.origin_lat, this.autoOrigin.origin_lon);
			double distanceP1ToP2 = main.map.getDistanceByRoute(this.getLatitude(), this.getLongitude(), stationFMQueue.get(i).origin.lat, stationFMQueue.get(i).origin.lon);
			double detourDistance = (distanceP1ToP2 + distanceP2ToStation) - distanceP1ToStation;
			traceln("detour dist: " + detourDistance + " " + main.autoSpeed + " " + distanceP1ToStation + " " + distanceP2ToStation + " " + distanceP1ToP2);
			double detourTime = (detourDistance / main.autoSpeed);
			traceln("detourTime: " + detourTime);
			
			if (detourTime <= main.maxDetourTime) {
				traceln("2nd passenger: " + stationFMQueue.get(i));
				FirstMilePassenger fm_psngr = stationFMQueue.get(i);
			    traceln(fm_psngr + " " + fm_psngr.origin.lon+ " " + fm_psngr.origin.lat);
			    fm_psngr.isAssignedAuto = true;
			    fm_psngr.canBeServed = true;
			    fm_psngr.onChange();
			    
			    main.writeFMPDetails(fm_psngr);
			    traceln(this + " 1 onChange() called");
			    this.secondFMPassenger = fm_psngr;
			    send("AutoAvailableForFMPickup", fm_psngr);
			    break;
			}
		}
    }
}


if (stationFMQueue.size() > 0 && this.numFMPsngrsInAuto == 2) {
	// that psngr should be picked whose waiting time is within threshold
	for(int i=0; i<stationFMQueue.size(); i++) {
		// check the waiting time threshold	
		traceln("2 checking initial: " + i + " " + stationFMQueue.get(i));
		traceln("2 checking initial: " + time() + " " + (stationFMQueue.get(i).requestTime + main.maxWaitingTime));
		if(time() <= stationFMQueue.get(i).requestTime + main.maxWaitingTime && stationFMQueue.get(i).isAssignedAuto == false) {
			traceln("2nd psngr is: " + this.secondFMPassenger);
			double distanceP2ToStation = main.map.getDistanceByRoute(this.secondFMPassenger.origin.lat, this.secondFMPassenger.origin.lon, this.autoOrigin.origin_lat, this.autoOrigin.origin_lon);
			double distanceP3ToStation = main.map.getDistanceByRoute(stationFMQueue.get(i).origin.lat, stationFMQueue.get(i).origin.lon, this.autoOrigin.origin_lat, this.autoOrigin.origin_lon);
			double distanceP2ToP3 = main.map.getDistanceByRoute(this.getLatitude(), this.getLongitude(), stationFMQueue.get(i).origin.lat, stationFMQueue.get(i).origin.lon);
			double detourDistance_2 = (distanceP2ToP3 + distanceP3ToStation) - distanceP2ToStation;
			double detourTime_2 = (detourDistance_2 / main.autoSpeed);
			traceln("detourTime_2: " + detourTime_2);
			traceln(this.secondFMPassenger + " " + this.numFMPsngrsInAuto + " " + this.thirdFMPassenger + " " + this.numFMPsngrsInAuto);
			
			// detour time for first passenger
			double distanceP1ToP2;
			double distanceP1ToStation;
			if(this.fm_trip != null) {
				distanceP1ToP2 = main.map.getDistanceByRoute(fm_trip.psngr_origin.lat, fm_trip.psngr_origin.lon, this.secondFMPassenger.origin.lat, this.secondFMPassenger.origin.lon);
				distanceP1ToStation = main.map.getDistanceByRoute(fm_trip.psngr_origin.lat, fm_trip.psngr_origin.lon, this.autoOrigin.origin_lat, this.autoOrigin.origin_lon);
			} else {
				distanceP1ToP2 = main.map.getDistanceByRoute(jointPassenger.origin.lat, jointPassenger.origin.lon, this.secondFMPassenger.origin.lat, this.secondFMPassenger.origin.lon);
				distanceP1ToStation = main.map.getDistanceByRoute(jointPassenger.origin.lat, jointPassenger.origin.lon, this.autoOrigin.origin_lat, this.autoOrigin.origin_lon);
			}
			double detourDistance_1 = (distanceP1ToP2 + distanceP2ToP3 + distanceP3ToStation) - distanceP1ToStation;
			double detourTime_1 = (detourDistance_1 / main.autoSpeed);
			
			traceln("detourTime_1: " + detourTime_1);
			if (detourTime_1 <= main.maxDetourTime && detourTime_2 <= main.maxDetourTime) {
					traceln("3rd possible passenger: " + stationFMQueue.get(i));
					FirstMilePassenger fm_psngr_3 = stationFMQueue.get(i);
				    traceln(fm_psngr_3 + " " + fm_psngr_3.origin.lon+ " " + fm_psngr_3.origin.lat);
				    fm_psngr_3.isAssignedAuto = true; 
				    fm_psngr_3.canBeServed = true;
				    main.writeFMPDetails(fm_psngr_3);
				    fm_psngr_3.onChange();
				    traceln(this + " onChange() called");
				    this.thirdFMPassenger = fm_psngr_3;
				    send("AutoAvailableForFMPickup", fm_psngr_3);
				    break;
			}
		}
    }
}
 
;}
        if ( 
(this.secondFMPassenger != null && this.numFMPsngrsInAuto == 1) || (this.thirdFMPassenger != null && this.numFMPsngrsInAuto == 2) 
 ) { // transition5
          enterState( MovingToOrigin, true );
          return;
        }
        // transition6 (default)
          {
moveTo(this.autoOrigin_Lat, this.autoOrigin_Lon);
double distanceBtwnLoc = main.map.getDistanceByRoute(this.getLatitude(), this.getLongitude(), this.autoOrigin_Lat, this.autoOrigin_Lon);
this.autoOrigin.totalDistanceKM += distanceBtwnLoc/1000;
main.tripDistance.put(this.autoOrigin, this.autoOrigin.totalDistanceKM);
traceln("check dist: " + distanceBtwnLoc + " " + this.autoOrigin.totalDistanceKM);

main.writeShareabilityStats("FM\t" + this.autoOrigin.origin_name + "\t" + this.numFMPsngrsInAuto + "\t" + this.countShare + "\n");

if (this.secondFMPassenger != null) {
	if (this.thirdFMPassenger != null) {
		if (fm_trip!= null)
			main.writeDebug("case1" + "\t" + fm_trip.passengr + "\t" + this.secondFMPassenger + "\t" + this.thirdFMPassenger);
		else
			main.writeDebug("case1" + "\t" + this.jointPassenger + "\t" + this.secondFMPassenger + "\t" + this.thirdFMPassenger);
	} else {
		if (fm_trip!= null)
			main.writeDebug("case2" + "\t" + fm_trip.passengr + "\t" + this.secondFMPassenger);
		else
			main.writeDebug("case2" + "\t" + this.jointPassenger + "\t" + this.secondFMPassenger);
	}	
} else if (fm_trip!=null ){
	main.writeDebug("case3" + "\t" + fm_trip.passengr);
} else { 
	main.writeDebug("case4" + "\t" + this.jointPassenger);
} 
;}
          enterState( MovingToStationFull, true );
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( vehicle_statechart_entry_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case AtMetroStation: 
  	    logToDBExitState(vehicle_statechart_entry, self);
  	    logToDB(vehicle_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Transition_9) Transition_9.cancel();
        if ( !_source || _t != transition) transition.cancel();
        return;
      case MovingToDestination: 
  	    logToDBExitState(vehicle_statechart_entry, self);
  	    logToDB(vehicle_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Transition_12) Transition_12.cancel();
        return;
      case Offboarding: 
  	    logToDBExitState(vehicle_statechart_entry, self);
  	    logToDB(vehicle_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Transition_10) Transition_10.cancel();
        {
// record auto's eta
double autoDistanceToStation = this.distanceTo(this.autoOrigin_Lat, this.autoOrigin_Lon);
double autoComebackTime = (autoDistanceToStation / main.autoSpeed);
this.eta = time() + autoComebackTime;
main.ETAArray.put(this, this.eta);
traceln("ofbd: " + currentTrip);
 
;}
        return;
      case LMRequestsServed: 
  	    logToDBExitState(vehicle_statechart_entry, self);
  	    logToDB(vehicle_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition3) transition3.cancel();
        return;
      case MovingToOrigin: 
  	    logToDBExitState(vehicle_statechart_entry, self);
  	    logToDB(vehicle_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Transition_16) Transition_16.cancel();
        return;
      case Pickup: 
  	    logToDBExitState(vehicle_statechart_entry, self);
  	    logToDB(vehicle_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Transition_14) Transition_14.cancel();
        {
traceln(this + " in state pickup");
this.hasPassenger = true; 
;}
        return;
      case MovingToStationFull: 
  	    logToDBExitState(vehicle_statechart_entry, self);
  	    logToDB(vehicle_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Transition_15) Transition_15.cancel();
        return;
      case MovingToStation: 
  	    logToDBExitState(vehicle_statechart_entry, self);
  	    logToDB(vehicle_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Transition_11) Transition_11.cancel();
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( vehicle_statechart_entry_state _destination ) {
    vehicle_statechart_entry_state _state = vehicle_statechart_entry.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  
  public TransitionTimeout Transition_10 = new TransitionTimeout( this );
  public TransitionTimeout transition3 = new TransitionTimeout( this );
  public TransitionTimeout Transition_14 = new TransitionTimeout( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionTimeout _t ) {
    if ( _t == Transition_10 ) return "Transition_10";
    if ( _t == transition3 ) return "transition3";
    if ( _t == Transition_14 ) return "Transition_14";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionTimeout _t ) { 
    if ( _t == Transition_10 ) return vehicle_statechart_entry;
    if ( _t == transition3 ) return vehicle_statechart_entry;
    if ( _t == Transition_14 ) return vehicle_statechart_entry;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionTimeout self ) {
    if ( self == Transition_10 ) {
      exitState( Offboarding, self, true );
      {
currentTrip.lastIndexVisited++;
traceln(this + " " + "visited " + currentTrip.destinations[currentTrip.lastIndexVisited]);
// flag facility as no longer being part of route
int facIndex = currentTrip.destinations[currentTrip.lastIndexVisited];
main.facilities(facIndex).partOfRoute = false; 
;}
          enterState( can_serve_another_LM_request, true );
      return;
    }
    if ( self == transition3 ) {
      exitState( LMRequestsServed, self, true );
          enterState( can_serve_FM_request, true );
      return;
    }
    if ( self == Transition_14 ) {
      exitState( Pickup, self, true );
          enterState( can_serve_another_FM_request, true );
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( TransitionTimeout _t ) {
    double _value;
    if ( _t == Transition_10 ) {
      _value = 
30 
;
      _value = toModelTime( _value, SECOND );
      return _value;
    }
    if ( _t == transition3 ) {
      _value = 
1 
;
      _value = toModelTime( _value, SECOND );
      return _value;
    }
    if ( _t == Transition_14 ) {
      _value = 
30 
;
      _value = toModelTime( _value, SECOND );
      return _value;
    }
    return super.evaluateTimeoutOf( _t );
  }



  public TransitionMessage Transition_9 = new TransitionMessage( this );
  public TransitionMessage Transition_12 = new TransitionMessage( this );
  public TransitionMessage Transition_16 = new TransitionMessage( this );
  public TransitionMessage Transition_15 = new TransitionMessage( this );
  public TransitionMessage Transition_11 = new TransitionMessage( this );
  public TransitionMessage transition = new TransitionMessage( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionMessage _t ) {
    if ( _t == Transition_9 ) return "Transition_9";
    if ( _t == Transition_12 ) return "Transition_12";
    if ( _t == Transition_16 ) return "Transition_16";
    if ( _t == Transition_15 ) return "Transition_15";
    if ( _t == Transition_11 ) return "Transition_11";
    if ( _t == transition ) return "transition";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionMessage _t ) { 
    if ( _t == Transition_9 ) return vehicle_statechart_entry;
    if ( _t == Transition_12 ) return vehicle_statechart_entry;
    if ( _t == Transition_16 ) return vehicle_statechart_entry;
    if ( _t == Transition_15 ) return vehicle_statechart_entry;
    if ( _t == Transition_11 ) return vehicle_statechart_entry;
    if ( _t == transition ) return vehicle_statechart_entry;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionMessage self, Object _msg ) {
    if ( self == Transition_9 ) {
      exitState( AtMetroStation, self, true );
      {
        MultiLocationTrip msg = (MultiLocationTrip) _msg;
currentTrip = msg;
dummyTrip = new DummyTrip(this.autoOrigin);

// alert all facilities as being part of route
for (int i : currentTrip.destinations) {
	traceln("auto state chart for loop: " + i + " " + this.autoOrigin.origin_name);
	Facility fac = findFirst(main.facilities, f -> (f.locIndex == i) && f.city.equals(this.autoOrigin.origin_name));
	fac.partOfRoute = true;
	Passengr psngr = findFirst(main.passengrs, p -> (p.psngrDestination.lon == fac.lon && p.psngrDestination.lat == fac.lat && p.canBeServed == false && p.isLostDemand == false));
	if (psngr != null) {
		psngr.canBeServed = true;
		traceln("on change called: " + psngr + " " + time());
		psngr.onChange();
		send("AutoAvailableForPickup", psngr);
		
	} else {
		traceln("no psngr");
	}
}
main.idle_trucks.remove(this);
this.numTotalTrips += 1;
this.autoOrigin.numAutoTrips += 1;
main.stationWiseAutoTrips.put(this.autoOrigin, this.autoOrigin.numAutoTrips);
traceln("received msg: " + currentTrip);
processTrip.take(dummyTrip); 
;}
          enterState( MovingToDestination, true );
      return;
    }
    if ( self == Transition_12 ) {
      exitState( MovingToDestination, self, true );
          enterState( Offboarding, true );
      return;
    }
    if ( self == Transition_16 ) {
      exitState( MovingToOrigin, self, true );
      {
traceln(this + " in transition AA1"); 
;}
          enterState( Pickup, true );
      return;
    }
    if ( self == Transition_15 ) {
      exitState( MovingToStationFull, self, true );
      {
if(!(this.isJointTrip)) {
	this.travelling1.stopDelay(fm_trip);
}
else
	travelling.stopDelay(dummyTrip); 
;}
          enterState( AtMetroStation, true );
      return;
    }
    if ( self == Transition_11 ) {
      exitState( MovingToStation, self, true );
      {
travelling.stopDelay(dummyTrip);
currentTrip = null;
main.writeShareabilityStats("LM\t" + this.autoOrigin.origin_name + "\t" + this.numTripPsngrsServed + "\n"); 
;}
          enterState( AtMetroStation, true );
      return;
    }
    if ( self == transition ) {
      exitState( AtMetroStation, self, true );
      {
        FirstMileTrip msg = (FirstMileTrip) _msg;
fm_trip = msg;
trace(this + " now moving to psngr origin " + msg.psngr_origin.lat + " " + msg.psngr_origin.lon + "\n");
this.numTotalTripsFM += 1;
this.autoOrigin.numAutoTrips += 1;
this.autoOrigin.numAutoTripsFM += 1;
main.stationWiseAutoTrips.put(this.autoOrigin, this.autoOrigin.numAutoTrips);
main.stationWiseAutoTripsFM.put(this.autoOrigin, this.autoOrigin.numAutoTripsFM);
 
processTrip1.take(fm_trip);
this.secondFMPassenger = null;
this.thirdFMPassenger = null; 
;}
          enterState( MovingToOrigin, true );
      return;
    }
    super.executeActionOf( self, _msg );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testMessageOf( TransitionMessage _t, Object _msg ) {
    if ( _t == Transition_9 ) {
      if ( !(_msg instanceof MultiLocationTrip) )
        return false;
      
MultiLocationTrip 
msg = (MultiLocationTrip) _msg;
      return true;
    }
    if ( _t == Transition_12 ) {
      return _msg == _ARRIVAL_message_xjal;
    }
    if ( _t == Transition_16 ) {
      return _msg == _ARRIVAL_message_xjal;
    }
    if ( _t == Transition_15 ) {
      return _msg == _ARRIVAL_message_xjal;
    }
    if ( _t == Transition_11 ) {
      return _msg == _ARRIVAL_message_xjal;
    }
    if ( _t == transition ) {
      if ( !(_msg instanceof FirstMileTrip) )
        return false;
      
FirstMileTrip 
msg = (FirstMileTrip) _msg;
      return true;
    }
    return super.testMessageOf( _t, _msg );
  }
  // Embedded Objects

  public com.anylogic.libraries.processmodeling.Seize<
DummyTrip 
> takeVehicle;
  public com.anylogic.libraries.processmodeling.Delay<
DummyTrip 
> travelling;
  public com.anylogic.libraries.processmodeling.Release<
DummyTrip 
> releaseVehicle;
  public com.anylogic.libraries.processmodeling.Enter<
DummyTrip 
> processTrip;
  public com.anylogic.libraries.processmodeling.Seize<
FirstMileTrip 
> takeVehicle1;
  public com.anylogic.libraries.processmodeling.Delay<
FirstMileTrip 
> travelling1;
  public com.anylogic.libraries.processmodeling.Release<
FirstMileTrip 
> releaseVehicle1;
  public com.anylogic.libraries.processmodeling.Sink<
FirstMileTrip 
> sink1;
  public com.anylogic.libraries.processmodeling.Enter<
FirstMileTrip 
> processTrip1;
  public com.anylogic.libraries.processmodeling.Exit<
DummyTrip 
> exit;

  public String getNameOf( Agent ao ) {
    if ( ao == takeVehicle ) return "takeVehicle";
    if ( ao == travelling ) return "travelling";
    if ( ao == releaseVehicle ) return "releaseVehicle";
    if ( ao == processTrip ) return "processTrip";
    if ( ao == takeVehicle1 ) return "takeVehicle1";
    if ( ao == travelling1 ) return "travelling1";
    if ( ao == releaseVehicle1 ) return "releaseVehicle1";
    if ( ao == sink1 ) return "sink1";
    if ( ao == processTrip1 ) return "processTrip1";
    if ( ao == exit ) return "exit";
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
  protected com.anylogic.libraries.processmodeling.Seize<DummyTrip> instantiate_takeVehicle_xjal() {
    com.anylogic.libraries.processmodeling.Seize<DummyTrip> _result_xjal = new com.anylogic.libraries.processmodeling.Seize<DummyTrip>( getEngine(), this, null ) {
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( DummyTrip agent ) {
        return _takeVehicle_resourcePool_xjal( this, agent );
      }
      @Override
      public void onEnter( DummyTrip agent ) {
        _takeVehicle_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_takeVehicle_xjal( final com.anylogic.libraries.processmodeling.Seize<DummyTrip> self, TableInput _t ) {
    self.seizeFromOnePool = 
true 
;
    self.seizePolicy = 
self.SEIZE_UNITS_ONE_BY_ONE 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
    self.destinationType = self._destinationType_DefaultValue_xjal();
    self.entityLocationQueue = self._entityLocationQueue_DefaultValue_xjal();
    self.terminatedTaskProcessing = self._terminatedTaskProcessing_DefaultValue_xjal();
    self.suspendResumeEntities = self._suspendResumeEntities_DefaultValue_xjal();
    self.customizeResourceChoice = self._customizeResourceChoice_DefaultValue_xjal();
    self.taskStartBlocksAreConnected = self._taskStartBlocksAreConnected_DefaultValue_xjal();
    self.taskStartBlocks = self._taskStartBlocks_DefaultValue_xjal();
    self.enableTimeout = self._enableTimeout_DefaultValue_xjal();
    self.enablePreemption = self._enablePreemption_DefaultValue_xjal();
    self.canceledUnitsBehavior = self._canceledUnitsBehavior_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_takeVehicle_xjal( com.anylogic.libraries.processmodeling.Seize<DummyTrip> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<DummyTrip> instantiate_travelling_xjal() {
    com.anylogic.libraries.processmodeling.Delay<DummyTrip> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<DummyTrip>( getEngine(), this, null ) {
      @Override
      public void onEnter( DummyTrip agent, double delayTime ) {
        _travelling_onEnter_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( DummyTrip agent ) {
        _travelling_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( DummyTrip agent ) {
        _travelling_onExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_travelling_xjal( final com.anylogic.libraries.processmodeling.Delay<DummyTrip> self, TableInput _t ) {
    self.type = 
self.MANUAL 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_travelling_xjal( com.anylogic.libraries.processmodeling.Delay<DummyTrip> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Release<DummyTrip> instantiate_releaseVehicle_xjal() {
    com.anylogic.libraries.processmodeling.Release<DummyTrip> _result_xjal = new com.anylogic.libraries.processmodeling.Release<DummyTrip>( getEngine(), this, null ) {
      @Override
      public boolean movingGoHome( DummyTrip agent, Agent unit ) {
        return _releaseVehicle_movingGoHome_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( DummyTrip agent ) {
        _releaseVehicle_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_releaseVehicle_xjal( final com.anylogic.libraries.processmodeling.Release<DummyTrip> self, TableInput _t ) {
    self.releaseMode = self._releaseMode_DefaultValue_xjal();
    self.seizeBlocks = self._seizeBlocks_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_releaseVehicle_xjal( com.anylogic.libraries.processmodeling.Release<DummyTrip> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Enter<DummyTrip> instantiate_processTrip_xjal() {
    com.anylogic.libraries.processmodeling.Enter<DummyTrip> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<DummyTrip>( getEngine(), this, null ) {
      @Override
      public void onEnter( DummyTrip agent ) {
        _processTrip_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_processTrip_xjal( final com.anylogic.libraries.processmodeling.Enter<DummyTrip> self, TableInput _t ) {
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
  private void doBeforeCreate_processTrip_xjal( com.anylogic.libraries.processmodeling.Enter<DummyTrip> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Seize<FirstMileTrip> instantiate_takeVehicle1_xjal() {
    com.anylogic.libraries.processmodeling.Seize<FirstMileTrip> _result_xjal = new com.anylogic.libraries.processmodeling.Seize<FirstMileTrip>( getEngine(), this, null ) {
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( FirstMileTrip agent ) {
        return _takeVehicle1_resourcePool_xjal( this, agent );
      }
      @Override
      public void onEnter( FirstMileTrip agent ) {
        _takeVehicle1_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_takeVehicle1_xjal( final com.anylogic.libraries.processmodeling.Seize<FirstMileTrip> self, TableInput _t ) {
    self.seizeFromOnePool = 
true 
;
    self.seizePolicy = 
self.SEIZE_UNITS_ONE_BY_ONE 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
    self.destinationType = self._destinationType_DefaultValue_xjal();
    self.entityLocationQueue = self._entityLocationQueue_DefaultValue_xjal();
    self.terminatedTaskProcessing = self._terminatedTaskProcessing_DefaultValue_xjal();
    self.suspendResumeEntities = self._suspendResumeEntities_DefaultValue_xjal();
    self.customizeResourceChoice = self._customizeResourceChoice_DefaultValue_xjal();
    self.taskStartBlocksAreConnected = self._taskStartBlocksAreConnected_DefaultValue_xjal();
    self.taskStartBlocks = self._taskStartBlocks_DefaultValue_xjal();
    self.enableTimeout = self._enableTimeout_DefaultValue_xjal();
    self.enablePreemption = self._enablePreemption_DefaultValue_xjal();
    self.canceledUnitsBehavior = self._canceledUnitsBehavior_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_takeVehicle1_xjal( com.anylogic.libraries.processmodeling.Seize<FirstMileTrip> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<FirstMileTrip> instantiate_travelling1_xjal() {
    com.anylogic.libraries.processmodeling.Delay<FirstMileTrip> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<FirstMileTrip>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_travelling1_xjal( final com.anylogic.libraries.processmodeling.Delay<FirstMileTrip> self, TableInput _t ) {
    self.type = 
self.MANUAL 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_travelling1_xjal( com.anylogic.libraries.processmodeling.Delay<FirstMileTrip> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Release<FirstMileTrip> instantiate_releaseVehicle1_xjal() {
    com.anylogic.libraries.processmodeling.Release<FirstMileTrip> _result_xjal = new com.anylogic.libraries.processmodeling.Release<FirstMileTrip>( getEngine(), this, null ) {
      @Override
      public boolean movingGoHome( FirstMileTrip agent, Agent unit ) {
        return _releaseVehicle1_movingGoHome_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( FirstMileTrip agent ) {
        _releaseVehicle1_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_releaseVehicle1_xjal( final com.anylogic.libraries.processmodeling.Release<FirstMileTrip> self, TableInput _t ) {
    self.releaseMode = self._releaseMode_DefaultValue_xjal();
    self.seizeBlocks = self._seizeBlocks_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_releaseVehicle1_xjal( com.anylogic.libraries.processmodeling.Release<FirstMileTrip> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Sink<FirstMileTrip> instantiate_sink1_xjal() {
    com.anylogic.libraries.processmodeling.Sink<FirstMileTrip> _result_xjal = new com.anylogic.libraries.processmodeling.Sink<FirstMileTrip>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_sink1_xjal( final com.anylogic.libraries.processmodeling.Sink<FirstMileTrip> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sink1_xjal( com.anylogic.libraries.processmodeling.Sink<FirstMileTrip> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Enter<FirstMileTrip> instantiate_processTrip1_xjal() {
    com.anylogic.libraries.processmodeling.Enter<FirstMileTrip> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<FirstMileTrip>( getEngine(), this, null ) {
      @Override
      public void onEnter( FirstMileTrip agent ) {
        _processTrip1_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_processTrip1_xjal( final com.anylogic.libraries.processmodeling.Enter<FirstMileTrip> self, TableInput _t ) {
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
  private void doBeforeCreate_processTrip1_xjal( com.anylogic.libraries.processmodeling.Enter<FirstMileTrip> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Exit<DummyTrip> instantiate_exit_xjal() {
    com.anylogic.libraries.processmodeling.Exit<DummyTrip> _result_xjal = new com.anylogic.libraries.processmodeling.Exit<DummyTrip>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_exit_xjal( final com.anylogic.libraries.processmodeling.Exit<DummyTrip> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_exit_xjal( com.anylogic.libraries.processmodeling.Exit<DummyTrip> self, TableInput _t ) {
  }

  private com.anylogic.libraries.processmodeling.ResourcePool _takeVehicle_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Seize<DummyTrip> self, DummyTrip agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
agent.psngr_origin.origin_name.equals("Mysore Road") ? main.autoResourcePools.get(0).resourcePool : agent.psngr_origin.origin_name.equals("Deepanjali Nagar") ? main.autoResourcePools.get(1).resourcePool : agent.psngr_origin.origin_name.equals("Attiguppe") ? main.autoResourcePools.get(2).resourcePool : agent.psngr_origin.origin_name.equals("Vijayanagara") ? main.autoResourcePools.get(3).resourcePool : agent.psngr_origin.origin_name.equals("Sri Balagangadaranatha Swamy Hosahalli") ? main.autoResourcePools.get(4).resourcePool : agent.psngr_origin.origin_name.equals("Magadi Road") ? main.autoResourcePools.get(5).resourcePool : agent.psngr_origin.origin_name.equals("Krantivira Sangolli Rayanna") ? main.autoResourcePools.get(6).resourcePool : agent.psngr_origin.origin_name.equals("Nadaprabhu Kempegowda Station") ? main.autoResourcePools.get(7).resourcePool : agent.psngr_origin.origin_name.equals("Sir M Vishweshwariah - Central College") ? main.autoResourcePools.get(8).resourcePool : agent.psngr_origin.origin_name.equals("Dr. B R Ambedkar Station") ? main.autoResourcePools.get(9).resourcePool : agent.psngr_origin.origin_name.equals("Cubbon Park") ? main.autoResourcePools.get(10).resourcePool : agent.psngr_origin.origin_name.equals("Mahatma Gandhi Road") ? main.autoResourcePools.get(11).resourcePool : agent.psngr_origin.origin_name.equals("Trinity") ? main.autoResourcePools.get(12).resourcePool : agent.psngr_origin.origin_name.equals("Halasuru") ? main.autoResourcePools.get(13).resourcePool : agent.psngr_origin.origin_name.equals("Indiranagar") ? main.autoResourcePools.get(14).resourcePool : agent.psngr_origin.origin_name.equals("Swami Vivekananda Road") ? main.autoResourcePools.get(15).resourcePool : agent.psngr_origin.origin_name.equals("Baiyyappanahalli") ? main.autoResourcePools.get(16).resourcePool : agent.psngr_origin.origin_name.equals("Nagasandra") ? main.autoResourcePools.get(17).resourcePool : agent.psngr_origin.origin_name.equals("Dasarahalli") ? main.autoResourcePools.get(18).resourcePool : agent.psngr_origin.origin_name.equals("Jalahalli") ? main.autoResourcePools.get(19).resourcePool : agent.psngr_origin.origin_name.equals("Peenya Industry") ? main.autoResourcePools.get(20).resourcePool : agent.psngr_origin.origin_name.equals("Peenya") ? main.autoResourcePools.get(21).resourcePool : agent.psngr_origin.origin_name.equals("Goraguntepalya") ? main.autoResourcePools.get(22).resourcePool : agent.psngr_origin.origin_name.equals("Yeshwantpura") ? main.autoResourcePools.get(23).resourcePool : agent.psngr_origin.origin_name.equals("Sandal Soap Factory") ? main.autoResourcePools.get(24).resourcePool : agent.psngr_origin.origin_name.equals("Mahalakshmi") ? main.autoResourcePools.get(25).resourcePool : agent.psngr_origin.origin_name.equals("Rajajinagar") ? main.autoResourcePools.get(26).resourcePool : agent.psngr_origin.origin_name.equals("Mahakavi Kuvempu Road") ? main.autoResourcePools.get(27).resourcePool : agent.psngr_origin.origin_name.equals("Srirampura") ? main.autoResourcePools.get(28).resourcePool : agent.psngr_origin.origin_name.equals("Mantri Square") ? main.autoResourcePools.get(29).resourcePool : agent.psngr_origin.origin_name.equals("Chikkapete") ? main.autoResourcePools.get(30).resourcePool : agent.psngr_origin.origin_name.equals("Krishna Rajendra Market") ? main.autoResourcePools.get(31).resourcePool : agent.psngr_origin.origin_name.equals("National College") ? main.autoResourcePools.get(32).resourcePool : agent.psngr_origin.origin_name.equals("Lalbagh") ? main.autoResourcePools.get(33).resourcePool : agent.psngr_origin.origin_name.equals("South End Circle") ? main.autoResourcePools.get(34).resourcePool :agent.psngr_origin.origin_name.equals("Jayanagar") ? main.autoResourcePools.get(35).resourcePool : agent.psngr_origin.origin_name.equals("Rashtriya Vidyalaya Road") ? main.autoResourcePools.get(36).resourcePool :agent.psngr_origin.origin_name.equals("Banashankari") ? main.autoResourcePools.get(37).resourcePool : agent.psngr_origin.origin_name.equals("J P Nagar") ? main.autoResourcePools.get(38).resourcePool : main.autoResourcePools.get(39).resourcePool 
;
    return _value;
  }
  private void _takeVehicle_onEnter_xjal( final com.anylogic.libraries.processmodeling.Seize<DummyTrip> self, DummyTrip agent ) {
    
traceln(this + " entering takeVehicle block"); 
;
  }
  private void _travelling_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<DummyTrip> self, DummyTrip agent, double delayTime ) {
    
traceln(this + " entering travelling block " + time()); 
;
  }
  private void _travelling_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Delay<DummyTrip> self, DummyTrip agent ) {
    
traceln(this + " at exiting travelling block" + time()); 
;
  }
  private void _travelling_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<DummyTrip> self, DummyTrip agent ) {
    
traceln(this + " on exiting travelling block" + time()); 
;
  }
  private boolean _releaseVehicle_movingGoHome_xjal( final com.anylogic.libraries.processmodeling.Release<DummyTrip> self, DummyTrip agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private void _releaseVehicle_onEnter_xjal( final com.anylogic.libraries.processmodeling.Release<DummyTrip> self, DummyTrip agent ) {
    
traceln(this + " in release block " + time()); 
;
  }
  private void _processTrip_onEnter_xjal( final com.anylogic.libraries.processmodeling.Enter<DummyTrip> self, DummyTrip agent ) {
    
traceln(this + " entered processTrip block " + time()); 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _takeVehicle1_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Seize<FirstMileTrip> self, FirstMileTrip agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
agent.psngrdestination.origin_name.equals("Mysore Road") ? main.autoResourcePools.get(0).resourcePool : agent.psngrdestination.origin_name.equals("Deepanjali Nagar") ? main.autoResourcePools.get(1).resourcePool : agent.psngrdestination.origin_name.equals("Attiguppe") ? main.autoResourcePools.get(2).resourcePool : agent.psngrdestination.origin_name.equals("Vijayanagara") ? main.autoResourcePools.get(3).resourcePool : agent.psngrdestination.origin_name.equals("Sri Balagangadaranatha Swamy Hosahalli") ? main.autoResourcePools.get(4).resourcePool : agent.psngrdestination.origin_name.equals("Magadi Road") ? main.autoResourcePools.get(5).resourcePool : agent.psngrdestination.origin_name.equals("Krantivira Sangolli Rayanna") ? main.autoResourcePools.get(6).resourcePool : agent.psngrdestination.origin_name.equals("Nadaprabhu Kempegowda Station") ? main.autoResourcePools.get(7).resourcePool : agent.psngrdestination.origin_name.equals("Sir M Vishweshwariah - Central College") ? main.autoResourcePools.get(8).resourcePool : agent.psngrdestination.origin_name.equals("Dr. B R Ambedkar Station") ? main.autoResourcePools.get(9).resourcePool : agent.psngrdestination.origin_name.equals("Cubbon Park") ? main.autoResourcePools.get(10).resourcePool : agent.psngrdestination.origin_name.equals("Mahatma Gandhi Road") ? main.autoResourcePools.get(11).resourcePool : agent.psngrdestination.origin_name.equals("Trinity") ? main.autoResourcePools.get(12).resourcePool : agent.psngrdestination.origin_name.equals("Halasuru") ? main.autoResourcePools.get(13).resourcePool : agent.psngrdestination.origin_name.equals("Indiranagar") ? main.autoResourcePools.get(14).resourcePool : agent.psngrdestination.origin_name.equals("Swami Vivekananda Road") ? main.autoResourcePools.get(15).resourcePool : agent.psngrdestination.origin_name.equals("Baiyyappanahalli") ? main.autoResourcePools.get(16).resourcePool : agent.psngrdestination.origin_name.equals("Nagasandra") ? main.autoResourcePools.get(17).resourcePool : agent.psngrdestination.origin_name.equals("Dasarahalli") ? main.autoResourcePools.get(18).resourcePool : agent.psngrdestination.origin_name.equals("Jalahalli") ? main.autoResourcePools.get(19).resourcePool : agent.psngrdestination.origin_name.equals("Peenya Industry") ? main.autoResourcePools.get(20).resourcePool : agent.psngrdestination.origin_name.equals("Peenya") ? main.autoResourcePools.get(21).resourcePool : agent.psngrdestination.origin_name.equals("Goraguntepalya") ? main.autoResourcePools.get(22).resourcePool : agent.psngrdestination.origin_name.equals("Yeshwantpura") ? main.autoResourcePools.get(23).resourcePool : agent.psngrdestination.origin_name.equals("Sandal Soap Factory") ? main.autoResourcePools.get(24).resourcePool : agent.psngrdestination.origin_name.equals("Mahalakshmi") ? main.autoResourcePools.get(25).resourcePool : agent.psngrdestination.origin_name.equals("Rajajinagar") ? main.autoResourcePools.get(26).resourcePool : agent.psngrdestination.origin_name.equals("Mahakavi Kuvempu Road") ? main.autoResourcePools.get(27).resourcePool : agent.psngrdestination.origin_name.equals("Srirampura") ? main.autoResourcePools.get(28).resourcePool : agent.psngrdestination.origin_name.equals("Mantri Square") ? main.autoResourcePools.get(29).resourcePool : agent.psngrdestination.origin_name.equals("Chikkapete") ? main.autoResourcePools.get(30).resourcePool : agent.psngrdestination.origin_name.equals("Krishna Rajendra Market") ? main.autoResourcePools.get(31).resourcePool : agent.psngrdestination.origin_name.equals("National College") ? main.autoResourcePools.get(32).resourcePool : agent.psngrdestination.origin_name.equals("Lalbagh") ? main.autoResourcePools.get(33).resourcePool : agent.psngrdestination.origin_name.equals("South End Circle") ? main.autoResourcePools.get(34).resourcePool :agent.psngrdestination.origin_name.equals("Jayanagar") ? main.autoResourcePools.get(35).resourcePool : agent.psngrdestination.origin_name.equals("Rashtriya Vidyalaya Road") ? main.autoResourcePools.get(36).resourcePool :agent.psngrdestination.origin_name.equals("Banashankari") ? main.autoResourcePools.get(37).resourcePool : agent.psngrdestination.origin_name.equals("J P Nagar") ? main.autoResourcePools.get(38).resourcePool : main.autoResourcePools.get(39).resourcePool 
;
    return _value;
  }
  private void _takeVehicle1_onEnter_xjal( final com.anylogic.libraries.processmodeling.Seize<FirstMileTrip> self, FirstMileTrip agent ) {
    
traceln(this + " entering takeVehicle 1 block"); 
;
  }
  private boolean _releaseVehicle1_movingGoHome_xjal( final com.anylogic.libraries.processmodeling.Release<FirstMileTrip> self, FirstMileTrip agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private void _releaseVehicle1_onEnter_xjal( final com.anylogic.libraries.processmodeling.Release<FirstMileTrip> self, FirstMileTrip agent ) {
    
traceln(this + " in release 1 block"); 
;
  }
  private void _processTrip1_onEnter_xjal( final com.anylogic.libraries.processmodeling.Enter<FirstMileTrip> self, FirstMileTrip agent ) {
    
traceln(this + " entered processTrip 1 block"); 
;
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
  @AnyLogicInternalCodegenAPI
  protected static final Font _text16_Font = new Font("SansSerif", 0, 26 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text17_Font = _text16_Font;
  protected static final Color __ps87_Fill_Color = new Color( 0xFF354B5E, true );
  protected static final Color __ps88_Fill_Color = new Color( 0xFF354B5E, true );
  protected static final Color __ps89_Line_Color = new Color( 0xFF354B5E, true );
  protected static final Color __ps90_Fill_Color = new Color( 0xFF75A6C8, true );
  protected static final Color __ps94_Fill_Color = new Color( 0xFF333556, true );
  @AnyLogicInternalCodegenAPI
  protected static final int __ps86 = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps87 = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps88 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps89 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps90 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps91 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps92 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps93 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps94 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _lorry = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _text16 = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _text17 = 12;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 13;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps87_pointsDX_xjal() {
    return new double[] { 0.0, 0.464, 0.0, -0.464, -0.927, -0.464,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps87_pointsDY_xjal() {
    return new double[] { 0.0, 0.936, 1.404, 0.468, -0.468, -0.936,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps87_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps88_pointsDX_xjal() {
    return new double[] { 0.0, -0.464, -0.927, -0.464, 0.0, 0.464,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps88_pointsDY_xjal() {
    return new double[] { 0.0, 0.936, 0.468, -0.468, -1.404, -0.936,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps88_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps89_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 4.636, 4.636, 4.636, 5.564, 6.027, 6.954, 6.954, 6.027, 5.564, 4.636, 4.636, 4.636, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps89_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 7.956, 7.956, 7.956, 7.956, 7.956, 7.956, 7.956, 7.488, 6.553, 1.404, 0.468, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps89_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps94_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 0.464, 0.927, 0.927, 1.391, 1.391, 1.391, 0.927, 0.927, 0.464, 0.0, 0.0, 0.0, 0.464, 0.464, 0.464, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps94_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 0.0, -0.936, -0.936, -1.404, -3.276, -5.148, -6.083, -6.083, -7.02, -7.02, -7.02, -7.02, -5.148, -3.276, -1.404, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps94_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(lorry, text16, text17);
  }

  protected ShapeRectangle _ps86;
  protected ShapeCurve _ps87;
  protected ShapeCurve _ps88;
  protected ShapeCurve _ps89;
  protected ShapeRoundedRectangle _ps90;
  protected ShapeRectangle _ps91;
  protected ShapeRectangle _ps92;
  protected ShapeRoundedRectangle _ps93;
  protected ShapeCurve _ps94;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _lorry_SetDynamicParams_xjal( ShapeGroup shape ) {
    shape.setScaleX(
0.4 
);
    shape.setScaleY(
0.4 
);
  }
  
  protected ShapeGroup lorry;
  protected ShapeText text16;
  protected ShapeText text17;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    _ps86 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,6.027, -3.744, 0.0, 0.0, 
            null, darkGray,
			0.927, 7.956, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps87 = new ShapeCurve(
      true,12.054, -4.212, 
      null, __ps87_Fill_Color,
      6, true, __ps87_pointsDX_xjal(), __ps87_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps88 = new ShapeCurve(
      true,12.054, 4.68, 
      null, __ps88_Fill_Color,
      6, true, __ps88_pointsDX_xjal(), __ps88_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps89 = new ShapeCurve(
      true,6.954, -3.744, 
      __ps89_Line_Color, steelBlue,
      18, true, __ps89_pointsDX_xjal(), __ps89_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps90 = new ShapeRoundedRectangle(
		true,7.419, -2.809, 0.0, 
        null, __ps90_Fill_Color,
		4.173, 6.083,1.0,  
		1.0, LINE_STYLE_SOLID	 );

    _ps91 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-13.446, -3.744, 0.0, 0.0, 
            null, darkGray,
			0.927, 7.956, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps92 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-12.519, -4.212, 0.0, 0.0, 
            black, silver,
			19.009, 8.892, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps93 = new ShapeRoundedRectangle(
		true,-12.054, -3.276, 0.0, 
        null, white,
		18.081, 7.02,1.0,  
		1.0, LINE_STYLE_SOLID	 );

    _ps94 = new ShapeCurve(
      true,11.591, 3.744, 
      null, __ps94_Fill_Color,
      18, true, __ps94_pointsDX_xjal(), __ps94_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    text16 = new ShapeText(
        SHAPE_DRAW_2D, false,675.0, 590.0, 0.0, 0.0, 
        white,"Map",
        _text16_Font, ALIGNMENT_LEFT );

    text17 = new ShapeText(
        SHAPE_DRAW_2D, false,665.0, 690.0, 0.0, 0.0, 
        white,"Map",
        _text17_Font, ALIGNMENT_LEFT );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    lorry = new ShapeGroup( Autos.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , _ps86
	     , _ps87
	     , _ps88
	     , _ps89
	     , _ps90
	     , _ps91
	     , _ps92
	     , _ps93
	     , _ps94 ) {
      @Override
      public void updateDynamicProperties() {
        _lorry_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

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

	


  @Override
  @AnyLogicInternalCodegenAPI
  public void onArrival() {
    super.onArrival();
    vehicle_statechart_entry.fireEvent( _ARRIVAL_message_xjal );
  }

  /**
   * Constructor
   */
  public Autos( Engine engine, Agent owner, AgentList<? extends Autos> ownerPopulation ) {
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
    takeVehicle = instantiate_takeVehicle_xjal();
    travelling = instantiate_travelling_xjal();
    releaseVehicle = instantiate_releaseVehicle_xjal();
    processTrip = instantiate_processTrip_xjal();
    takeVehicle1 = instantiate_takeVehicle1_xjal();
    travelling1 = instantiate_travelling1_xjal();
    releaseVehicle1 = instantiate_releaseVehicle1_xjal();
    sink1 = instantiate_sink1_xjal();
    processTrip1 = instantiate_processTrip1_xjal();
    exit = instantiate_exit_xjal();
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
  public Autos() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Autos( MetroStation autoOrigin, GISRegion autoGISVoronoiRegion, double autoOrigin_Lat, double autoOrigin_Lon ) {
    markParametersAreSet();
    this.autoOrigin = autoOrigin;
    this.autoGISVoronoiRegion = autoGISVoronoiRegion;
    this.autoOrigin_Lat = autoOrigin_Lat;
    this.autoOrigin_Lon = autoOrigin_Lon;
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
    setupPlainVariables_Autos_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Autos.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Autos.this, getElementProperty( "original_joint_fm_lm_shareability.Autos.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Creating non-replicated embedded objects
    setupParameters_takeVehicle_xjal( takeVehicle, null );
    doBeforeCreate_takeVehicle_xjal( takeVehicle, null );
    takeVehicle.createAsEmbedded();
    setupParameters_travelling_xjal( travelling, null );
    doBeforeCreate_travelling_xjal( travelling, null );
    travelling.createAsEmbedded();
    setupParameters_releaseVehicle_xjal( releaseVehicle, null );
    doBeforeCreate_releaseVehicle_xjal( releaseVehicle, null );
    releaseVehicle.createAsEmbedded();
    setupParameters_processTrip_xjal( processTrip, null );
    doBeforeCreate_processTrip_xjal( processTrip, null );
    processTrip.createAsEmbedded();
    setupParameters_takeVehicle1_xjal( takeVehicle1, null );
    doBeforeCreate_takeVehicle1_xjal( takeVehicle1, null );
    takeVehicle1.createAsEmbedded();
    setupParameters_travelling1_xjal( travelling1, null );
    doBeforeCreate_travelling1_xjal( travelling1, null );
    travelling1.createAsEmbedded();
    setupParameters_releaseVehicle1_xjal( releaseVehicle1, null );
    doBeforeCreate_releaseVehicle1_xjal( releaseVehicle1, null );
    releaseVehicle1.createAsEmbedded();
    setupParameters_sink1_xjal( sink1, null );
    doBeforeCreate_sink1_xjal( sink1, null );
    sink1.createAsEmbedded();
    setupParameters_processTrip1_xjal( processTrip1, null );
    doBeforeCreate_processTrip1_xjal( processTrip1, null );
    processTrip1.createAsEmbedded();
    setupParameters_exit_xjal( exit, null );
    doBeforeCreate_exit_xjal( exit, null );
    exit.createAsEmbedded();
	 // Port connectors with non-replicated objects
    releaseVehicle.in.connect( travelling.out ); // connector6
    exit.in.connect( releaseVehicle.out ); // connector7
    takeVehicle.out.connect( travelling.in ); // connector8
    processTrip.out.connect( takeVehicle.in ); // connector9
    releaseVehicle1.in.connect( travelling1.out ); // connector10
    sink1.in.connect( releaseVehicle1.out ); // connector11
    takeVehicle1.out.connect( travelling1.in ); // connector12
    processTrip1.out.connect( takeVehicle1.in ); // connector13
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Autos.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType && !(tryExt(ExtAgentWithSpatialMetrics.class) instanceof ExtWithSpaceType) ) {
      double _speed;
      _speed = 
main.autoSpeed 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _speed, MPS );
    }
    if ( _ext instanceof ExtAgentContinuous && tryExt(ExtAgentContinuous.class) == null ) {
      ExtAgentContinuous _e = (ExtAgentContinuous) _ext;
      _e.setAutomaticVerticalRotation( true );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    vehicle_statechart_entry.start();
    takeVehicle.startAsEmbedded();
    travelling.startAsEmbedded();
    releaseVehicle.startAsEmbedded();
    processTrip.startAsEmbedded();
    takeVehicle1.startAsEmbedded();
    travelling1.startAsEmbedded();
    releaseVehicle1.startAsEmbedded();
    sink1.startAsEmbedded();
    processTrip1.startAsEmbedded();
    exit.startAsEmbedded();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Autos_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Autos_xjal() {
    hasPassenger = 
false 
;
    numTotalTrips = 
0 
;
    numTotalTripsFM = 
0 
;
    isJointTrip = 
false 
;
    numFMPsngrsInAuto = 
0 
;
    numTripPsngrsServed = 
0 
;
    numTripFMPsngrsServed = 
0 
;
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
    
Object  msg = (Object) _msg_xjal;
    Agent sender = _sender_xjal;
    
traceln(this + "got arrival message from sender " + sender + "at time " + time() + "\n"); 
    vehicle_statechart_entry.fireEvent( _msg_xjal );
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
    list.add( takeVehicle );
    list.add( travelling );
    list.add( releaseVehicle );
    list.add( processTrip );
    list.add( takeVehicle1 );
    list.add( travelling1 );
    list.add( releaseVehicle1 );
    list.add( sink1 );
    list.add( processTrip1 );
    list.add( exit );
    return list;
  }

  public AgentList<? extends Autos> getPopulation() {
    return (AgentList<? extends Autos>) super.getPopulation();
  }

  public List<? extends Autos> agentsInRange( double distance ) {
    return (List<? extends Autos>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    vehicle_statechart_entry.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    vehicle_statechart_entry.onDestroy();
    takeVehicle.onDestroy();
    travelling.onDestroy();
    releaseVehicle.onDestroy();
    processTrip.onDestroy();
    takeVehicle1.onDestroy();
    travelling1.onDestroy();
    releaseVehicle1.onDestroy();
    sink1.onDestroy();
    processTrip1.onDestroy();
    exit.onDestroy();
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    takeVehicle.doFinish();
    travelling.doFinish();
    releaseVehicle.doFinish();
    processTrip.doFinish();
    takeVehicle1.doFinish();
    travelling1.doFinish();
    releaseVehicle1.doFinish();
    sink1.doFinish();
    processTrip1.doFinish();
    exit.doFinish();
  }


  public com.anylogic.libraries.processmodeling.ResourcePool resourcePool() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).resourcePool();
  }

  public com.anylogic.libraries.processmodeling.ResourceType getResourceType() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getResourceType();
  }

  public boolean isBusy() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).isBusy();
  }

  public boolean isIdle() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).isIdle();
  }

  public double getUtilization() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getUtilization();
  }

  public double timeInState(com.anylogic.libraries.processmodeling.ResourceUsageState state) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).timeInState(state);
  }

  public double timeInState(com.anylogic.libraries.processmodeling.ResourceUsageState state, TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).timeInState(state, units);
  }

  public void resetStats() {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).resetStats();
  }

  public boolean isReserved() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).isReserved();
  }

  public Agent getReservedBy() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getReservedBy();
  }

  public Agent getServicedEntity() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getServicedEntity();
  }

  public com.anylogic.libraries.processmodeling.ResourceTaskType currentTaskType() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).currentTaskType();
  }

  public com.anylogic.libraries.processmodeling.ResourceUnitTask currentTask() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).currentTask();
  }

  @AnyLogicInternalAPI
  public void addTask(com.anylogic.libraries.processmodeling.ResourceUnitTask task) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).addTask(task);
  }

  @AnyLogicInternalAPI
  public void removeTask(com.anylogic.libraries.processmodeling.ResourceUnitTask task) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).removeTask(task);
  }

  public void setHomeLocation(INode home) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).setHomeLocation(home);
  }

  public INode getHomeLocation() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getHomeLocation();
  }

  public void setHomePosition(double x, double y) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).setHomePosition(x, y);
  }

  public void setHomePosition(double x, double y, double z) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).setHomePosition(x, y, z);
  }

  public double getHomeX() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getHomeX();
  }

  public double getHomeY() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getHomeY();
  }

  public double getHomeZ() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getHomeZ();
  }

  public double getHomeRotation() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getHomeRotation();
  }

  public void setAttached(boolean attached) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).setAttached(attached);
  }

  public boolean isAttached() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).isAttached();
  }
  
  public double totalDowntime() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalDowntime();
  }

  public double totalRepairTime() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalRepairTime();
  }
	
  public double totalMaintenanceTime() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalMaintenanceTime();
  }

  public double totalBreaksTime() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalBreaksTime();
  }

  public double totalCustomTasksTime() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalCustomTasksTime();
  }

  public double totalDowntime(TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalDowntime(units);
  }

  public double totalRepairTime(TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalRepairTime(units);
  }

  public double totalMaintenanceTime(TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalMaintenanceTime(units);
  }

  public double totalBreaksTime(TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalBreaksTime(units);
  }

  public double totalCustomTasksTime(TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalCustomTasksTime(units);
  }
  
}
