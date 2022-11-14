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

public class FirstMilePassenger extends Agent
{
  // Parameters

  public 
int  percWantFirstMile;

  /**
   * Returns default value for parameter <code>percWantFirstMile</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _percWantFirstMile_DefaultValue_xjal() {
    final FirstMilePassenger self = this;
    return 0;
  }

  public void set_percWantFirstMile( int value ) {
    if (value == this.percWantFirstMile) {
      return;
    }
    int _oldValue_xjal = this.percWantFirstMile;
    this.percWantFirstMile = value;
    onChange_percWantFirstMile_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter percWantFirstMile.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_percWantFirstMile()</code> method instead.
   */
  protected void onChange_percWantFirstMile() {
    onChange_percWantFirstMile_xjal( percWantFirstMile );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_percWantFirstMile_xjal( int oldValue ) {  
  }


  public 
FirstMileOrigin  origin;

  /**
   * Returns default value for parameter <code>origin</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public FirstMileOrigin _origin_DefaultValue_xjal() {
    final FirstMilePassenger self = this;
    return null;
  }

  public void set_origin( FirstMileOrigin value ) {
    if (value == this.origin) {
      return;
    }
    FirstMileOrigin _oldValue_xjal = this.origin;
    this.origin = value;
    onChange_origin_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter origin.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_origin()</code> method instead.
   */
  protected void onChange_origin() {
    onChange_origin_xjal( origin );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_origin_xjal( FirstMileOrigin oldValue ) {  
  }


  public 
MetroStation  destination;

  /**
   * Returns default value for parameter <code>destination</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public MetroStation _destination_DefaultValue_xjal() {
    final FirstMilePassenger self = this;
    return null;
  }

  public void set_destination( MetroStation value ) {
    if (value == this.destination) {
      return;
    }
    MetroStation _oldValue_xjal = this.destination;
    this.destination = value;
    onChange_destination_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter destination.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_destination()</code> method instead.
   */
  protected void onChange_destination() {
    onChange_destination_xjal( destination );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_destination_xjal( MetroStation oldValue ) {  
  }


  public 
boolean  isAssignedAuto;

  /**
   * Returns default value for parameter <code>isAssignedAuto</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public boolean _isAssignedAuto_DefaultValue_xjal() {
    final FirstMilePassenger self = this;
    return false;
  }

  public void set_isAssignedAuto( boolean value ) {
    if (value == this.isAssignedAuto) {
      return;
    }
    boolean _oldValue_xjal = this.isAssignedAuto;
    this.isAssignedAuto = value;
    onChange_isAssignedAuto_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter isAssignedAuto.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_isAssignedAuto()</code> method instead.
   */
  protected void onChange_isAssignedAuto() {
    onChange_isAssignedAuto_xjal( isAssignedAuto );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_isAssignedAuto_xjal( boolean oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    percWantFirstMile = _percWantFirstMile_DefaultValue_xjal();
    origin = _origin_DefaultValue_xjal();
    destination = _destination_DefaultValue_xjal();
    isAssignedAuto = _isAssignedAuto_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "percWantFirstMile":
      if ( _callOnChange_xjal ) {
        set_percWantFirstMile( ((Number) _value_xjal).intValue() );
      } else {
        percWantFirstMile = ((Number) _value_xjal).intValue();
      }
      return true;
    case "origin":
      if ( _callOnChange_xjal ) {
        set_origin( (FirstMileOrigin) _value_xjal );
      } else {
        origin = (FirstMileOrigin) _value_xjal;
      }
      return true;
    case "destination":
      if ( _callOnChange_xjal ) {
        set_destination( (MetroStation) _value_xjal );
      } else {
        destination = (MetroStation) _value_xjal;
      }
      return true;
    case "isAssignedAuto":
      if ( _callOnChange_xjal ) {
        set_isAssignedAuto( (Boolean) _value_xjal );
      } else {
        isAssignedAuto = (Boolean) _value_xjal;
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
    case "percWantFirstMile": _result_xjal = percWantFirstMile; break;
    case "origin": _result_xjal = origin; break;
    case "destination": _result_xjal = destination; break;
    case "isAssignedAuto": _result_xjal = isAssignedAuto; break;
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
      list.add( "percWantFirstMile" );
      list.add( "origin" );
      list.add( "destination" );
      list.add( "isAssignedAuto" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

  public 
double 
 psngrDestinationTime;
  public 
double 
 requestTime;
  public 
Autos 
 assignedAuto;
  public 
boolean 
 isFMLostDemand;
  public 
boolean 
 canBeServed;
  public 
boolean 
 counted;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( FirstMilePassenger.class );
  
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


  // Events

  public EventCondition eventFMTrip = new EventCondition(this);


  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventCondition _e ) {
    if ( _e == eventFMTrip ) return "eventFMTrip";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testConditionOf( EventCondition _e ) {

    if ( _e == eventFMTrip) return 
inState(TripRequestAccepted); 
;
    return super.testConditionOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventCondition self ) {
    if ( self == eventFMTrip) {

// choose an auto that is at that metro station
Autos auto = randomWhere(main.autos, v -> v.inState(Autos.AtMetroStation) && abs(v.autoOrigin_Lat - this.destination.origin_lat) < 0.00001 && abs(v.autoOrigin_Lon - this.destination.origin_lon) < 0.00001);
FirstMileTrip trip = new FirstMileTrip(this, this.destination, this.origin);
if(auto != null && auto.numFMPsngrsInAuto == 0 && auto.isJointTrip == false) {
	traceln("FM joint trip: " + auto.isJointTrip);
}

if (auto != null && auto.numFMPsngrsInAuto == 0 && auto.isJointTrip == false && this.isAssignedAuto == false) {
	trip.passengr.isAssignedAuto = true;
	this.assignedAuto = auto;
	send (trip, auto);
	double distanceBtwnLoc = main.map.getDistanceByRoute(this.destination.origin_lat, this.destination.origin_lon, this.origin.lat, this.origin.lon);
	double returnDistance = main.map.getDistanceByRoute(this.origin.lat, this.origin.lon, this.destination.origin_lat, this.destination.origin_lon);
	this.psngrDestinationTime = (returnDistance / main.autoSpeed);
	traceln("FM in event trip: " + distanceBtwnLoc + " " + returnDistance + " " + this.psngrDestinationTime);
	this.destination.totalWaitingTime += ((time() - this.requestTime)/60);
	traceln("waited for: " + ((time() - this.requestTime)/60) + " mins");
}
else {
	traceln(this + "not in same region: " + main.numUnserviceable);	
}	 
;
      return ;
    }
    super.executeActionOf( self );
  }
  

	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 1;


  // Statecharts
  public Statechart<firstMilePassenger_statechart_entry_state> firstMilePassenger_statechart_entry = new Statechart<>( this, (short)2 );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( Statechart _s ) {
    if(_s == this.firstMilePassenger_statechart_entry) return "firstMilePassenger_statechart_entry";
    return super.getNameOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getIdOf( Statechart _s ) {
    if(_s == this.firstMilePassenger_statechart_entry) return 0;
    return super.getIdOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( Statechart _s ) {
    if( _s == this.firstMilePassenger_statechart_entry ) {
      enterState( FMPassengers, true );
      return;
    }
    super.executeActionOf( _s );
  }

   // States of all statecharts
   
  public enum firstMilePassenger_statechart_entry_state implements IStatechartState<FirstMilePassenger, firstMilePassenger_statechart_entry_state> {
    FMPassengers,
    GenerateVehicleRequest,
    TripRequestAccepted,
    PassengerPickedUp,
    Travelling,
    WaitForAssignment,
    FMLostDemand,
    emptyVehicle,
    ReachedDestination,
    finalState;

    @AnyLogicInternalCodegenAPI
    private Collection<firstMilePassenger_statechart_entry_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<firstMilePassenger_statechart_entry_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<firstMilePassenger_statechart_entry_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<firstMilePassenger_statechart_entry_state> getSimpleStatesDeep() {
      Collection<firstMilePassenger_statechart_entry_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<firstMilePassenger_statechart_entry_state> getFullState() {
      Set<firstMilePassenger_statechart_entry_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<firstMilePassenger_statechart_entry_state> getStatesInside() {
      Set<firstMilePassenger_statechart_entry_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<firstMilePassenger_statechart_entry_state> getStatechart( FirstMilePassenger _a ) {
      return _a.firstMilePassenger_statechart_entry;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final firstMilePassenger_statechart_entry_state FMPassengers = firstMilePassenger_statechart_entry_state.FMPassengers;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final firstMilePassenger_statechart_entry_state GenerateVehicleRequest = firstMilePassenger_statechart_entry_state.GenerateVehicleRequest;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final firstMilePassenger_statechart_entry_state TripRequestAccepted = firstMilePassenger_statechart_entry_state.TripRequestAccepted;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final firstMilePassenger_statechart_entry_state PassengerPickedUp = firstMilePassenger_statechart_entry_state.PassengerPickedUp;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final firstMilePassenger_statechart_entry_state Travelling = firstMilePassenger_statechart_entry_state.Travelling;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final firstMilePassenger_statechart_entry_state WaitForAssignment = firstMilePassenger_statechart_entry_state.WaitForAssignment;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final firstMilePassenger_statechart_entry_state FMLostDemand = firstMilePassenger_statechart_entry_state.FMLostDemand;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final firstMilePassenger_statechart_entry_state emptyVehicle = firstMilePassenger_statechart_entry_state.emptyVehicle;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final firstMilePassenger_statechart_entry_state ReachedDestination = firstMilePassenger_statechart_entry_state.ReachedDestination;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final firstMilePassenger_statechart_entry_state finalState = firstMilePassenger_statechart_entry_state.finalState;


  @AnyLogicInternalCodegenAPI
  private void enterState( firstMilePassenger_statechart_entry_state self, boolean _destination ) {
    switch( self ) {
      case FMPassengers:
  	    logToDBEnterState(firstMilePassenger_statechart_entry, self);
        // (Simple state (not composite))
        firstMilePassenger_statechart_entry.setActiveState_xjal( FMPassengers );
        {
shapeBody.setFillColor(mediumPurple);
this.setLatLon(this.origin.lat, this.origin.lon);
traceln(this + " FM psngr arriving on: " + getMinute() + " " + time() + " " + origin + " " + destination);
this.requestTime = time();

if (!main.FMqueue.containsKey(this.destination)) {
	main.FMqueue.put(this.destination, new ArrayList<FirstMilePassenger>());
}
ArrayList<FirstMilePassenger> stationFMQueue = main.FMqueue.get(this.destination);
if(!stationFMQueue.contains(this)) {
	stationFMQueue.add(this);
}

this.destination.numPassengersFM += 1;
main.stationWiseFMPsngrCount.put(this.destination, this.destination.numPassengersFM);

this.assignedAuto = null; 
;}
        transition.start();
        return;
      case GenerateVehicleRequest:
  	    logToDBEnterState(firstMilePassenger_statechart_entry, self);
        // (Simple state (not composite))
        firstMilePassenger_statechart_entry.setActiveState_xjal( GenerateVehicleRequest );
        {
traceln(this + "in state GVR"); 
;}
        transition1.start();
        return;
      case TripRequestAccepted:
  	    logToDBEnterState(firstMilePassenger_statechart_entry, self);
        // (Simple state (not composite))
        firstMilePassenger_statechart_entry.setActiveState_xjal( TripRequestAccepted );
        {
traceln(this + " in state TRA");
ArrayList<FirstMilePassenger> station_FMqueue = main.FMqueue.get(this.destination);
station_FMqueue.remove(this);

double toDistance = main.map.getDistanceByRoute(this.origin.lat, this.origin.lon, this.destination.origin_lat, this.destination.origin_lon);
double fromDistance = main.map.getDistanceByRoute(this.destination.origin_lat, this.destination.origin_lon, this.origin.lat, this.origin.lon);
main.writeDistance("FM" + "\t" + this.destination.origin_name + "\t" + this.origin.lat + "\t" + this.origin.lon + "\t" + this.destination.origin_lat + "\t" + this.destination.origin_lon + "\t" + toDistance + "\t" + fromDistance + "\n"); 
;}
        transition2.start();
        return;
      case PassengerPickedUp:
  	    logToDBEnterState(firstMilePassenger_statechart_entry, self);
        // (Simple state (not composite))
        firstMilePassenger_statechart_entry.setActiveState_xjal( PassengerPickedUp );
        {
traceln(this + " in state PPU"); 
;}
        transition5.start();
        return;
      case Travelling:
  	    logToDBEnterState(firstMilePassenger_statechart_entry, self);
        // (Simple state (not composite))
        firstMilePassenger_statechart_entry.setActiveState_xjal( Travelling );
        {
main.numFMPsngrsServed += 1; 
;}
        transition3.start();
        return;
      case WaitForAssignment:
  	    logToDBEnterState(firstMilePassenger_statechart_entry, self);
        // (Simple state (not composite))
        firstMilePassenger_statechart_entry.setActiveState_xjal( WaitForAssignment );
        {
traceln(this + " FM psngr in state WFA"); 
;}
        wait_time_within_threshold.start();
        transition4.start();
        return;
      case FMLostDemand:
  	    logToDBEnterState(firstMilePassenger_statechart_entry, self);
        // (Simple state (not composite))
        firstMilePassenger_statechart_entry.setActiveState_xjal( FMLostDemand );
        {
traceln(this + "FM entered state lost demand");
main.numLostDemandsFM += 1;
this.destination.lostDemandsFM += 1;
main.stationWiseFMLostDemand.put(this.destination, this.destination.lostDemandsFM);
ArrayList<FirstMilePassenger> station_FMqueue = main.FMqueue.get(this.destination);
station_FMqueue.remove(this);
traceln("removing: " + this);
if (station_FMqueue.size() > 0 && !this.isFMLostDemand) {
	traceln("sending msg within");
	send("AutoAvailableForFMPickup", station_FMqueue.get(0));
}
// write the location of lost demand
main.writeLostDemandLocation("FM " + this.origin.lon + "," + this.origin.lat + "," + "POINT(" + this.origin.lon + " " + this.origin.lat + ")\n"); 
;}
        transition6.start();
        return;
      case emptyVehicle:
  	    logToDBEnterState(firstMilePassenger_statechart_entry, self);
        // (Branch)
        if ( 
main.FMqueue.get(this.destination).indexOf(this) < count(main.autos, (v -> v.inState(Autos.AtMetroStation) && abs(v.autoOrigin_Lat - this.destination.origin_lat) < 0.00001 && abs(v.autoOrigin_Lon - this.destination.origin_lon) < 0.00001)) || this.canBeServed == true 
 ) { // vehicle_available
          {
int numAvailableAutos = count(main.autos, (v -> v.inState(Autos.AtMetroStation) && abs(v.autoOrigin_Lat - this.destination.origin_lat) < 0.00001 && abs(v.autoOrigin_Lon - this.destination.origin_lon) < 0.00001));
traceln("FM vehicle available: " + numAvailableAutos + " " + this + " " + main.FMqueue.get(this.destination).indexOf(this)); 
;}
          enterState( TripRequestAccepted, true );
          return;
        }
        // no_vehicle_available (default)
          enterState( WaitForAssignment, true );
        return;
      case ReachedDestination:
  	    logToDBEnterState(firstMilePassenger_statechart_entry, self);
        // (Final State)
        firstMilePassenger_statechart_entry.setActiveState_xjal( ReachedDestination );
        firstMilePassenger_statechart_entry.onDestroy();
        {
traceln("reached Destination MS: " + time()); 
;}
        return;
      case finalState:
  	    logToDBEnterState(firstMilePassenger_statechart_entry, self);
        // (Final State)
        firstMilePassenger_statechart_entry.setActiveState_xjal( finalState );
        firstMilePassenger_statechart_entry.onDestroy();
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( firstMilePassenger_statechart_entry_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case FMPassengers: 
  	    logToDBExitState(firstMilePassenger_statechart_entry, self);
  	    logToDB(firstMilePassenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition) transition.cancel();
        return;
      case GenerateVehicleRequest: 
  	    logToDBExitState(firstMilePassenger_statechart_entry, self);
  	    logToDB(firstMilePassenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition1) transition1.cancel();
        return;
      case TripRequestAccepted: 
  	    logToDBExitState(firstMilePassenger_statechart_entry, self);
  	    logToDB(firstMilePassenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition2) transition2.cancel();
        return;
      case PassengerPickedUp: 
  	    logToDBExitState(firstMilePassenger_statechart_entry, self);
  	    logToDB(firstMilePassenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition5) transition5.cancel();
        return;
      case Travelling: 
  	    logToDBExitState(firstMilePassenger_statechart_entry, self);
  	    logToDB(firstMilePassenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition3) transition3.cancel();
        return;
      case WaitForAssignment: 
  	    logToDBExitState(firstMilePassenger_statechart_entry, self);
  	    logToDB(firstMilePassenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != wait_time_within_threshold) wait_time_within_threshold.cancel();
        if ( !_source || _t != transition4) transition4.cancel();
        return;
      case FMLostDemand: 
  	    logToDBExitState(firstMilePassenger_statechart_entry, self);
  	    logToDB(firstMilePassenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition6) transition6.cancel();
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( firstMilePassenger_statechart_entry_state _destination ) {
    firstMilePassenger_statechart_entry_state _state = firstMilePassenger_statechart_entry.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  
  public TransitionTimeout transition = new TransitionTimeout( this );
  public TransitionTimeout transition1 = new TransitionTimeout( this );
  public TransitionTimeout transition2 = new TransitionTimeout( this );
  public TransitionTimeout transition5 = new TransitionTimeout( this );
  public TransitionTimeout transition3 = new TransitionTimeout( this );
  public TransitionTimeout transition6 = new TransitionTimeout( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionTimeout _t ) {
    if ( _t == transition ) return "transition";
    if ( _t == transition1 ) return "transition1";
    if ( _t == transition2 ) return "transition2";
    if ( _t == transition5 ) return "transition5";
    if ( _t == transition3 ) return "transition3";
    if ( _t == transition6 ) return "transition6";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionTimeout _t ) { 
    if ( _t == transition ) return firstMilePassenger_statechart_entry;
    if ( _t == transition1 ) return firstMilePassenger_statechart_entry;
    if ( _t == transition2 ) return firstMilePassenger_statechart_entry;
    if ( _t == transition5 ) return firstMilePassenger_statechart_entry;
    if ( _t == transition3 ) return firstMilePassenger_statechart_entry;
    if ( _t == transition6 ) return firstMilePassenger_statechart_entry;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionTimeout self ) {
    if ( self == transition ) {
      exitState( FMPassengers, self, true );
          enterState( GenerateVehicleRequest, true );
      return;
    }
    if ( self == transition1 ) {
      exitState( GenerateVehicleRequest, self, true );
          enterState( emptyVehicle, true );
      return;
    }
    if ( self == transition2 ) {
      exitState( TripRequestAccepted, self, true );
          enterState( PassengerPickedUp, true );
      return;
    }
    if ( self == transition5 ) {
      exitState( PassengerPickedUp, self, true );
          enterState( Travelling, true );
      return;
    }
    if ( self == transition3 ) {
      exitState( Travelling, self, true );
      {
traceln(time() + " " + this.psngrDestinationTime + " " + (time() + this.psngrDestinationTime)); 
;}
          enterState( ReachedDestination, true );
      return;
    }
    if ( self == transition6 ) {
      exitState( FMLostDemand, self, true );
          enterState( finalState, true );
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( TransitionTimeout _t ) {
    double _value;
    if ( _t == transition ) {
      _value = 
1 
;
      _value = toModelTime( _value, SECOND );
      return _value;
    }
    if ( _t == transition1 ) {
      _value = 
1 
;
      _value = toModelTime( _value, SECOND );
      return _value;
    }
    if ( _t == transition2 ) {
      _value = 
1 
;
      _value = toModelTime( _value, SECOND );
      return _value;
    }
    if ( _t == transition5 ) {
      _value = 
1 
;
      _value = toModelTime( _value, SECOND );
      return _value;
    }
    if ( _t == transition3 ) {
      _value = 
(time() + this.psngrDestinationTime) 
;
      _value = toModelTime( _value, SECOND );
      return _value;
    }
    if ( _t == transition6 ) {
      _value = 
1 
;
      _value = toModelTime( _value, SECOND );
      return _value;
    }
    return super.evaluateTimeoutOf( _t );
  }

  public TransitionCondition transition4 = new TransitionCondition( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionCondition _t ) {
    if ( _t == transition4 ) return "transition4";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionCondition _t ) { 
    if ( _t == transition4 ) return firstMilePassenger_statechart_entry;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionCondition self ) {
    if ( self == transition4 ) {
      exitState( WaitForAssignment, self, true );
      {
traceln("FM into lost demand state: " + time() + " " + (this.requestTime + main.maxWaitingTime)); 
;}
          enterState( FMLostDemand, true );
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testConditionOf( TransitionCondition _t ) {
    if ( _t == transition4 ) return 
time() > (this.requestTime + main.maxWaitingTime) 
;
    return super.testConditionOf( _t );
  }


  public TransitionMessage wait_time_within_threshold = new TransitionMessage( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionMessage _t ) {
    if ( _t == wait_time_within_threshold ) return "wait_time_within_threshold";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionMessage _t ) { 
    if ( _t == wait_time_within_threshold ) return firstMilePassenger_statechart_entry;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionMessage self, Object _msg ) {
    if ( self == wait_time_within_threshold ) {
      exitState( WaitForAssignment, self, true );
      {
        Object msg = (Object) _msg;
traceln(this + " got msg AutoAvailableForFMPickup"); 
;}
          enterState( GenerateVehicleRequest, true );
      return;
    }
    super.executeActionOf( self, _msg );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testMessageOf( TransitionMessage _t, Object _msg ) {
    if ( _t == wait_time_within_threshold ) {
      
Object 
msg = (Object) _msg;
      Object _g = 
"AutoAvailableForFMPickup" 
;
      return msg.equals( _g );
    }
    return super.testMessageOf( _t, _msg );
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
  protected static final int _shapeBody = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _person = 2;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 3;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 3.0, -1.0, -2.0, -2.0, -2.0, 0.0, -1.0, 0.0, 1.0, 3.0, 4.0, 5.0, 4.0, 6.0, 6.0, 6.0, 5.0, 1.0, 4.0, 4.0, 4.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDY_xjal() {
    return new double[] { 0.0, 4.0, 2.0, 3.0, 3.0, 10.0, 11.0, 11.0, 9.0, 17.0, 17.0, 17.0, 17.0, 9.0, 11.0, 11.0, 10.0, 3.0, 3.0, 2.0, 4.0, 0.0, -3.0, -3.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(person);
  }

  protected ShapeCurve shapeBody;
  protected ShapeGroup person;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    shapeBody = new ShapeCurve(
      true,-2.0, -7.0, 
      null, black,
      24, true, _shapeBody_pointsDX_xjal(), _shapeBody_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    person = new ShapeGroup( FirstMilePassenger.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , shapeBody );

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
  public FirstMilePassenger( Engine engine, Agent owner, AgentList<? extends FirstMilePassenger> ownerPopulation ) {
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
  public FirstMilePassenger() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public FirstMilePassenger( int percWantFirstMile, FirstMileOrigin origin, MetroStation destination, boolean isAssignedAuto ) {
    markParametersAreSet();
    this.percWantFirstMile = percWantFirstMile;
    this.origin = origin;
    this.destination = destination;
    this.isAssignedAuto = isAssignedAuto;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_FirstMilePassenger_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( FirstMilePassenger.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( FirstMilePassenger.this, getElementProperty( "original_joint_fm_lm_shareability.FirstMilePassenger.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( FirstMilePassenger.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentContinuous && tryExt(ExtAgentContinuous.class) == null ) {
      ExtAgentContinuous _e = (ExtAgentContinuous) _ext;
      _e.setAutomaticVerticalRotation( true );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    eventFMTrip.start();
    firstMilePassenger_statechart_entry.start();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_FirstMilePassenger_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_FirstMilePassenger_xjal() {
    isFMLostDemand = 
false 
;
    canBeServed = 
false 
;
    counted = 
false 
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
    firstMilePassenger_statechart_entry.fireEvent( _msg_xjal );
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends FirstMilePassenger> getPopulation() {
    return (AgentList<? extends FirstMilePassenger>) super.getPopulation();
  }

  public List<? extends FirstMilePassenger> agentsInRange( double distance ) {
    return (List<? extends FirstMilePassenger>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    eventFMTrip.onChange();
    firstMilePassenger_statechart_entry.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    eventFMTrip.onDestroy();
    firstMilePassenger_statechart_entry.onDestroy();
    super.onDestroy();
  }



}
