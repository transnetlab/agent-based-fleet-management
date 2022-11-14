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

public class Passengr extends Agent
{
  // Parameters

  public 
double  percWantLastMile;

  /**
   * Returns default value for parameter <code>percWantLastMile</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _percWantLastMile_DefaultValue_xjal() {
    final Passengr self = this;
    return 0.0;
  }

  public void set_percWantLastMile( double value ) {
    if (value == this.percWantLastMile) {
      return;
    }
    double _oldValue_xjal = this.percWantLastMile;
    this.percWantLastMile = value;
    onChange_percWantLastMile_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter percWantLastMile.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_percWantLastMile()</code> method instead.
   */
  protected void onChange_percWantLastMile() {
    onChange_percWantLastMile_xjal( percWantLastMile );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_percWantLastMile_xjal( double oldValue ) {  
  }


  public 
boolean  isAssignedAuto;

  /**
   * Returns default value for parameter <code>isAssignedAuto</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public boolean _isAssignedAuto_DefaultValue_xjal() {
    final Passengr self = this;
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


  public 
int  psngr_id;

  /**
   * Returns default value for parameter <code>psngr_id</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _psngr_id_DefaultValue_xjal() {
    final Passengr self = this;
    return 0;
  }

  public void set_psngr_id( int value ) {
    if (value == this.psngr_id) {
      return;
    }
    int _oldValue_xjal = this.psngr_id;
    this.psngr_id = value;
    onChange_psngr_id_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter psngr_id.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_psngr_id()</code> method instead.
   */
  protected void onChange_psngr_id() {
    onChange_psngr_id_xjal( psngr_id );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_psngr_id_xjal( int oldValue ) {  
  }


  public 
int  numLastMilePassengers(  ) {
    final Passengr self = this;
    return 
0 
;
  }

  public 
MetroStation  psngr_origin;

  /**
   * Returns default value for parameter <code>psngr_origin</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public MetroStation _psngr_origin_DefaultValue_xjal() {
    final Passengr self = this;
    return null;
  }

  public void set_psngr_origin( MetroStation value ) {
    if (value == this.psngr_origin) {
      return;
    }
    MetroStation _oldValue_xjal = this.psngr_origin;
    this.psngr_origin = value;
    onChange_psngr_origin_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter psngr_origin.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_psngr_origin()</code> method instead.
   */
  protected void onChange_psngr_origin() {
    onChange_psngr_origin_xjal( psngr_origin );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_psngr_origin_xjal( MetroStation oldValue ) {  
  }


  public 
boolean  hasCheckedAutoComebackTime;

  /**
   * Returns default value for parameter <code>hasCheckedAutoComebackTime</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public boolean _hasCheckedAutoComebackTime_DefaultValue_xjal() {
    final Passengr self = this;
    return 
false 
;
  }

  public void set_hasCheckedAutoComebackTime( boolean value ) {
    if (value == this.hasCheckedAutoComebackTime) {
      return;
    }
    boolean _oldValue_xjal = this.hasCheckedAutoComebackTime;
    this.hasCheckedAutoComebackTime = value;
    onChange_hasCheckedAutoComebackTime_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter hasCheckedAutoComebackTime.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_hasCheckedAutoComebackTime()</code> method instead.
   */
  protected void onChange_hasCheckedAutoComebackTime() {
    onChange_hasCheckedAutoComebackTime_xjal( hasCheckedAutoComebackTime );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_hasCheckedAutoComebackTime_xjal( boolean oldValue ) {  
  }


  public 
PsngrDestination  psngrDestination;

  /**
   * Returns default value for parameter <code>psngrDestination</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public PsngrDestination _psngrDestination_DefaultValue_xjal() {
    final Passengr self = this;
    return null;
  }

  public void set_psngrDestination( PsngrDestination value ) {
    if (value == this.psngrDestination) {
      return;
    }
    PsngrDestination _oldValue_xjal = this.psngrDestination;
    this.psngrDestination = value;
    onChange_psngrDestination_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter psngrDestination.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_psngrDestination()</code> method instead.
   */
  protected void onChange_psngrDestination() {
    onChange_psngrDestination_xjal( psngrDestination );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_psngrDestination_xjal( PsngrDestination oldValue ) {  
  }


  public 
boolean  canBeServed;

  /**
   * Returns default value for parameter <code>canBeServed</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public boolean _canBeServed_DefaultValue_xjal() {
    final Passengr self = this;
    return 
false 
;
  }

  public void set_canBeServed( boolean value ) {
    if (value == this.canBeServed) {
      return;
    }
    boolean _oldValue_xjal = this.canBeServed;
    this.canBeServed = value;
    onChange_canBeServed_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter canBeServed.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_canBeServed()</code> method instead.
   */
  protected void onChange_canBeServed() {
    onChange_canBeServed_xjal( canBeServed );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_canBeServed_xjal( boolean oldValue ) {  
  }


  public 
int  destIndex;

  /**
   * Returns default value for parameter <code>destIndex</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _destIndex_DefaultValue_xjal() {
    final Passengr self = this;
    return 0;
  }

  public void set_destIndex( int value ) {
    if (value == this.destIndex) {
      return;
    }
    int _oldValue_xjal = this.destIndex;
    this.destIndex = value;
    onChange_destIndex_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter destIndex.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_destIndex()</code> method instead.
   */
  protected void onChange_destIndex() {
    onChange_destIndex_xjal( destIndex );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_destIndex_xjal( int oldValue ) {  
  }


  public 
boolean  isLostDemand;

  /**
   * Returns default value for parameter <code>isLostDemand</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public boolean _isLostDemand_DefaultValue_xjal() {
    final Passengr self = this;
    return 
false 
;
  }

  public void set_isLostDemand( boolean value ) {
    if (value == this.isLostDemand) {
      return;
    }
    boolean _oldValue_xjal = this.isLostDemand;
    this.isLostDemand = value;
    onChange_isLostDemand_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter isLostDemand.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_isLostDemand()</code> method instead.
   */
  protected void onChange_isLostDemand() {
    onChange_isLostDemand_xjal( isLostDemand );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_isLostDemand_xjal( boolean oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    percWantLastMile = _percWantLastMile_DefaultValue_xjal();
    isAssignedAuto = _isAssignedAuto_DefaultValue_xjal();
    psngr_id = _psngr_id_DefaultValue_xjal();
    psngr_origin = _psngr_origin_DefaultValue_xjal();
    hasCheckedAutoComebackTime = _hasCheckedAutoComebackTime_DefaultValue_xjal();
    psngrDestination = _psngrDestination_DefaultValue_xjal();
    canBeServed = _canBeServed_DefaultValue_xjal();
    destIndex = _destIndex_DefaultValue_xjal();
    isLostDemand = _isLostDemand_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "percWantLastMile":
      if ( _callOnChange_xjal ) {
        set_percWantLastMile( ((Number) _value_xjal).doubleValue() );
      } else {
        percWantLastMile = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "isAssignedAuto":
      if ( _callOnChange_xjal ) {
        set_isAssignedAuto( (Boolean) _value_xjal );
      } else {
        isAssignedAuto = (Boolean) _value_xjal;
      }
      return true;
    case "psngr_id":
      if ( _callOnChange_xjal ) {
        set_psngr_id( ((Number) _value_xjal).intValue() );
      } else {
        psngr_id = ((Number) _value_xjal).intValue();
      }
      return true;
    case "psngr_origin":
      if ( _callOnChange_xjal ) {
        set_psngr_origin( (MetroStation) _value_xjal );
      } else {
        psngr_origin = (MetroStation) _value_xjal;
      }
      return true;
    case "hasCheckedAutoComebackTime":
      if ( _callOnChange_xjal ) {
        set_hasCheckedAutoComebackTime( (Boolean) _value_xjal );
      } else {
        hasCheckedAutoComebackTime = (Boolean) _value_xjal;
      }
      return true;
    case "psngrDestination":
      if ( _callOnChange_xjal ) {
        set_psngrDestination( (PsngrDestination) _value_xjal );
      } else {
        psngrDestination = (PsngrDestination) _value_xjal;
      }
      return true;
    case "canBeServed":
      if ( _callOnChange_xjal ) {
        set_canBeServed( (Boolean) _value_xjal );
      } else {
        canBeServed = (Boolean) _value_xjal;
      }
      return true;
    case "destIndex":
      if ( _callOnChange_xjal ) {
        set_destIndex( ((Number) _value_xjal).intValue() );
      } else {
        destIndex = ((Number) _value_xjal).intValue();
      }
      return true;
    case "isLostDemand":
      if ( _callOnChange_xjal ) {
        set_isLostDemand( (Boolean) _value_xjal );
      } else {
        isLostDemand = (Boolean) _value_xjal;
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
    case "percWantLastMile": _result_xjal = percWantLastMile; break;
    case "isAssignedAuto": _result_xjal = isAssignedAuto; break;
    case "psngr_id": _result_xjal = psngr_id; break;
    case "psngr_origin": _result_xjal = psngr_origin; break;
    case "hasCheckedAutoComebackTime": _result_xjal = hasCheckedAutoComebackTime; break;
    case "psngrDestination": _result_xjal = psngrDestination; break;
    case "canBeServed": _result_xjal = canBeServed; break;
    case "destIndex": _result_xjal = destIndex; break;
    case "isLostDemand": _result_xjal = isLostDemand; break;
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
      list.add( "percWantLastMile" );
      list.add( "isAssignedAuto" );
      list.add( "psngr_id" );
      list.add( "psngr_origin" );
      list.add( "hasCheckedAutoComebackTime" );
      list.add( "psngrDestination" );
      list.add( "canBeServed" );
      list.add( "destIndex" );
      list.add( "isLostDemand" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

  public 
double 
 timeInState;
  public 
double 
 timer;
  public 
double 
 psngrDestinationLat;
  public 
double 
 psngrDestinationLon;
  public 
double 
 psngrDestinationTime;
  public 
double 
 comebackTime;
  public 
double 
 requestTime;
  public 
boolean 
 generateVehicleRequest;
  public 
double 
 nearestAgentDistance;
  public 
boolean 
 inQueue;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Passengr.class );
  
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

  public EventCondition eventTrip = new EventCondition(this);


  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventCondition _e ) {
    if ( _e == eventTrip ) return "eventTrip";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testConditionOf( EventCondition _e ) {

    if ( _e == eventTrip) return 
//inState(TripRequestAccepted);
//false;
this.canBeServed && inState(TripRequestAccepted); 
;
    return super.testConditionOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventCondition self ) {
    if ( self == eventTrip) {
      return ;
    }
    super.executeActionOf( self );
  }
  

	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 1;


  // Statecharts
  public Statechart<passenger_statechart_entry_state> passenger_statechart_entry = new Statechart<>( this, (short)2 );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( Statechart _s ) {
    if(_s == this.passenger_statechart_entry) return "passenger_statechart_entry";
    return super.getNameOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getIdOf( Statechart _s ) {
    if(_s == this.passenger_statechart_entry) return 0;
    return super.getIdOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( Statechart _s ) {
    if( _s == this.passenger_statechart_entry ) {
      enterState( LastMilePassengers, true );
      return;
    }
    super.executeActionOf( _s );
  }

   // States of all statecharts
   
  public enum passenger_statechart_entry_state implements IStatechartState<Passengr, passenger_statechart_entry_state> {
    LastMilePassengers,
    OffboardingTrain,
    GenerateVehicleRequest,
    TripRequestAccepted,
    Travelling,
    WaitForAssignment,
    LostDemand,
    branch,
    ReachedDestination,
    finalState;

    @AnyLogicInternalCodegenAPI
    private Collection<passenger_statechart_entry_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<passenger_statechart_entry_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<passenger_statechart_entry_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<passenger_statechart_entry_state> getSimpleStatesDeep() {
      Collection<passenger_statechart_entry_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<passenger_statechart_entry_state> getFullState() {
      Set<passenger_statechart_entry_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<passenger_statechart_entry_state> getStatesInside() {
      Set<passenger_statechart_entry_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<passenger_statechart_entry_state> getStatechart( Passengr _a ) {
      return _a.passenger_statechart_entry;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final passenger_statechart_entry_state LastMilePassengers = passenger_statechart_entry_state.LastMilePassengers;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final passenger_statechart_entry_state OffboardingTrain = passenger_statechart_entry_state.OffboardingTrain;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final passenger_statechart_entry_state GenerateVehicleRequest = passenger_statechart_entry_state.GenerateVehicleRequest;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final passenger_statechart_entry_state TripRequestAccepted = passenger_statechart_entry_state.TripRequestAccepted;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final passenger_statechart_entry_state Travelling = passenger_statechart_entry_state.Travelling;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final passenger_statechart_entry_state WaitForAssignment = passenger_statechart_entry_state.WaitForAssignment;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final passenger_statechart_entry_state LostDemand = passenger_statechart_entry_state.LostDemand;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final passenger_statechart_entry_state branch = passenger_statechart_entry_state.branch;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final passenger_statechart_entry_state ReachedDestination = passenger_statechart_entry_state.ReachedDestination;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final passenger_statechart_entry_state finalState = passenger_statechart_entry_state.finalState;


  @AnyLogicInternalCodegenAPI
  private void enterState( passenger_statechart_entry_state self, boolean _destination ) {
    switch( self ) {
      case LastMilePassengers:
  	    logToDBEnterState(passenger_statechart_entry, self);
        // (Simple state (not composite))
        passenger_statechart_entry.setActiveState_xjal( LastMilePassengers );
        {
shapeBody.setFillColor(mediumPurple); 
;}
        transition_timeout.start();
        return;
      case OffboardingTrain:
  	    logToDBEnterState(passenger_statechart_entry, self);
        // (Simple state (not composite))
        passenger_statechart_entry.setActiveState_xjal( OffboardingTrain );
        {
this.requestTime = time();
this.psngr_origin.numPassengers += 1;
main.stationWisePsngrCount.put(this.psngr_origin, this.psngr_origin.numPassengers);

 
;}
        transition1.start();
        return;
      case GenerateVehicleRequest:
  	    logToDBEnterState(passenger_statechart_entry, self);
        // (Simple state (not composite))
        passenger_statechart_entry.setActiveState_xjal( GenerateVehicleRequest );
        {
timer = time(SECOND);
traceln(this + "in state generate vehicle request\n" + time());
int totalAutos = main.autos.size();
int numAvailableAutos = count(main.autos, v -> v.inState(Autos.AtMetroStation));

Date modelDate = date();
int sec = getSecond(modelDate);
int min = getMinute(modelDate);

if (!main.queue.containsKey(this.psngr_origin)) {
	main.queue.put(this.psngr_origin, new ArrayList<Passengr>());
}
ArrayList<Passengr> stationQueue = main.queue.get(this.psngr_origin);
if(!stationQueue.contains(this)) {
	stationQueue.add(this);
} 
;}
        transition2.start();
        return;
      case TripRequestAccepted:
  	    logToDBEnterState(passenger_statechart_entry, self);
        // (Simple state (not composite))
        passenger_statechart_entry.setActiveState_xjal( TripRequestAccepted );
        {
ArrayList<Passengr> station_queue = main.queue.get(this.psngr_origin);
station_queue.remove(this);
traceln("psngr req accepted: " + this);
traceln(main.queue.get(this.psngr_origin).size());

double toDistance = main.map.getDistanceByRoute(this.psngr_origin.origin_lat, this.psngr_origin.origin_lon, this.psngrDestination.lat, this.psngrDestination.lon);
double fromDistance = main.map.getDistanceByRoute(this.psngrDestination.lat, this.psngrDestination.lon, this.psngr_origin.origin_lat, this.psngr_origin.origin_lon);
main.writeDistance("LM"  + "\t" + this.psngr_origin.origin_name + "\t" + this.psngr_origin.origin_lat + "\t" + this.psngr_origin.origin_lon + "\t" + this.psngrDestination.lat + "\t" + this.psngrDestination.lon + "\t" + toDistance + "\t" + fromDistance + "\n"); 
;}
        transition.start();
        return;
      case Travelling:
  	    logToDBEnterState(passenger_statechart_entry, self);
        // (Simple state (not composite))
        passenger_statechart_entry.setActiveState_xjal( Travelling );
        {
traceln(this + " is in travelling state " + time() + " " + this.psngrDestination);
main.numLMPsngrsServed += 1; 
;}
        reaching_destination.start();
        return;
      case WaitForAssignment:
  	    logToDBEnterState(passenger_statechart_entry, self);
        // (Simple state (not composite))
        passenger_statechart_entry.setActiveState_xjal( WaitForAssignment );
        {
traceln(this + " in WFA state " + time() + " "+ (this.requestTime + main.maxWaitingTime)); 
;}
        wait_time_exceeds_threshold.start();
        wait_time_within_threshold.start();
        return;
      case LostDemand:
  	    logToDBEnterState(passenger_statechart_entry, self);
        // (Simple state (not composite))
        passenger_statechart_entry.setActiveState_xjal( LostDemand );
        {
traceln("exceed thrsh: " + this + " " + time() + " " + this.requestTime + " " + main.maxWaitingTime);
main.writeLostDemandLocation("LM " + this.psngrDestination.lon + "," + this.psngrDestination.lat + "," + "POINT(" + this.psngrDestination.lon + " " + this.psngrDestination.lat + ")\n");
traceln(this + " LM entered state lost demand");
main.numLostDemands += 1;
this.psngr_origin.lostDemands += 1;
main.stationWiseLostDemand.put(this.psngr_origin, this.psngr_origin.lostDemands);
ArrayList<Passengr> station_queue = main.queue.get(this.psngr_origin);
station_queue.remove(this);

if (station_queue.size() > 0 && !this.isLostDemand) {
	send("AutoAvailableForPickup", station_queue.get(0));
}
ArrayList<FirstMilePassenger> station_FMqueue = main.FMqueue.get(this.psngr_origin);
traceln("locQueue: " + this.psngr_origin.locationQueue);
this.psngr_origin.locationQueue.remove(new Integer(this.destIndex)); 
;}
        transition3.start();
        return;
      case branch:
  	    logToDBEnterState(passenger_statechart_entry, self);
        // (Branch)
        {
traceln(this + " in branch " + main.queue.size() + " " + this.psngr_origin.origin_lat); 
;}
        if ( 
this.canBeServed == true
 
 ) { // vehicleAvailable
          {
int numAvailableAutos = count(main.autos, (v -> v.inState(Autos.AtMetroStation) && abs(v.autoOrigin_Lat - this.psngr_origin.origin_lat) < 0.00001 && abs(v.autoOrigin_Lon - this.psngr_origin.origin_lon) < 0.00001));
traceln("vehicle available: " + numAvailableAutos); 
;}
          enterState( TripRequestAccepted, true );
          return;
        }
        // no_available_vehicle (default)
          {
traceln("no veh available"); 
;}
          enterState( WaitForAssignment, true );
        return;
      case ReachedDestination:
  	    logToDBEnterState(passenger_statechart_entry, self);
        // (Final State)
        passenger_statechart_entry.setActiveState_xjal( ReachedDestination );
        passenger_statechart_entry.onDestroy();
        {
this.isAssignedAuto = false; 
;}
        return;
      case finalState:
  	    logToDBEnterState(passenger_statechart_entry, self);
        // (Final State)
        passenger_statechart_entry.setActiveState_xjal( finalState );
        passenger_statechart_entry.onDestroy();
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( passenger_statechart_entry_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case LastMilePassengers: 
  	    logToDBExitState(passenger_statechart_entry, self);
  	    logToDB(passenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition_timeout) transition_timeout.cancel();
        return;
      case OffboardingTrain: 
  	    logToDBExitState(passenger_statechart_entry, self);
  	    logToDB(passenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition1) transition1.cancel();
        return;
      case GenerateVehicleRequest: 
  	    logToDBExitState(passenger_statechart_entry, self);
  	    logToDB(passenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition2) transition2.cancel();
        {
timeInState += time() - timer; 
;}
        return;
      case TripRequestAccepted: 
  	    logToDBExitState(passenger_statechart_entry, self);
  	    logToDB(passenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition) transition.cancel();
        return;
      case Travelling: 
  	    logToDBExitState(passenger_statechart_entry, self);
  	    logToDB(passenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != reaching_destination) reaching_destination.cancel();
        return;
      case WaitForAssignment: 
  	    logToDBExitState(passenger_statechart_entry, self);
  	    logToDB(passenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != wait_time_exceeds_threshold) wait_time_exceeds_threshold.cancel();
        if ( !_source || _t != wait_time_within_threshold) wait_time_within_threshold.cancel();
        return;
      case LostDemand: 
  	    logToDBExitState(passenger_statechart_entry, self);
  	    logToDB(passenger_statechart_entry, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition3) transition3.cancel();
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( passenger_statechart_entry_state _destination ) {
    passenger_statechart_entry_state _state = passenger_statechart_entry.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  
  public TransitionTimeout transition_timeout = new TransitionTimeout( this );
  public TransitionTimeout transition1 = new TransitionTimeout( this );
  public TransitionTimeout transition2 = new TransitionTimeout( this );
  public TransitionTimeout transition = new TransitionTimeout( this );
  public TransitionTimeout reaching_destination = new TransitionTimeout( this );
  public TransitionTimeout transition3 = new TransitionTimeout( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionTimeout _t ) {
    if ( _t == transition_timeout ) return "transition_timeout";
    if ( _t == transition1 ) return "transition1";
    if ( _t == transition2 ) return "transition2";
    if ( _t == transition ) return "transition";
    if ( _t == reaching_destination ) return "reaching_destination";
    if ( _t == transition3 ) return "transition3";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionTimeout _t ) { 
    if ( _t == transition_timeout ) return passenger_statechart_entry;
    if ( _t == transition1 ) return passenger_statechart_entry;
    if ( _t == transition2 ) return passenger_statechart_entry;
    if ( _t == transition ) return passenger_statechart_entry;
    if ( _t == reaching_destination ) return passenger_statechart_entry;
    if ( _t == transition3 ) return passenger_statechart_entry;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionTimeout self ) {
    if ( self == transition_timeout ) {
      exitState( LastMilePassengers, self, true );
          enterState( OffboardingTrain, true );
      return;
    }
    if ( self == transition1 ) {
      exitState( OffboardingTrain, self, true );
          enterState( GenerateVehicleRequest, true );
      return;
    }
    if ( self == transition2 ) {
      exitState( GenerateVehicleRequest, self, true );
          enterState( branch, true );
      return;
    }
    if ( self == transition ) {
      exitState( TripRequestAccepted, self, true );
          enterState( Travelling, true );
      return;
    }
    if ( self == reaching_destination ) {
      exitState( Travelling, self, true );
          enterState( ReachedDestination, true );
      return;
    }
    if ( self == transition3 ) {
      exitState( LostDemand, self, true );
          enterState( finalState, true );
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( TransitionTimeout _t ) {
    double _value;
    if ( _t == transition_timeout ) {
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
    if ( _t == transition ) {
      _value = 
1 
;
      _value = toModelTime( _value, SECOND );
      return _value;
    }
    if ( _t == reaching_destination ) {
      _value = 
(time(SECOND) + this.psngrDestination.time) 
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
    return super.evaluateTimeoutOf( _t );
  }

  public TransitionCondition wait_time_exceeds_threshold = new TransitionCondition( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionCondition _t ) {
    if ( _t == wait_time_exceeds_threshold ) return "wait_time_exceeds_threshold";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionCondition _t ) { 
    if ( _t == wait_time_exceeds_threshold ) return passenger_statechart_entry;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionCondition self ) {
    if ( self == wait_time_exceeds_threshold ) {
      exitState( WaitForAssignment, self, true );
      {
traceln("tr wait time exceed threshold"); 
;}
          enterState( LostDemand, true );
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testConditionOf( TransitionCondition _t ) {
    if ( _t == wait_time_exceeds_threshold ) return 
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
    if ( _t == wait_time_within_threshold ) return passenger_statechart_entry;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionMessage self, Object _msg ) {
    if ( self == wait_time_within_threshold ) {
      exitState( WaitForAssignment, self, true );
      {
        Object msg = (Object) _msg;
traceln(this + "in psngr state chart; received msg") 
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
"AutoAvailableForPickup" 
;
      return msg.equals( _g );
    }
    return super.testMessageOf( _t, _msg );
  }
  // Functions

  void getAutoDetails(  ) { 

// get nearest auto's location/distance
Autos nearestAutoAgent = getNearestAgentByRoute(filter(main.autos, (v -> v.hasPassenger == false && !(v.inState(Autos.AtMetroStation)) && 
								abs(v.autoOrigin_Lat - this.psngr_origin.origin_lat) < 0.00001 && abs(v.autoOrigin_Lon - this.psngr_origin.origin_lon) < 0.00001)));
// add not null part
int computeCount = 0;
if (nearestAutoAgent != null && computeCount == 0) {
	traceln("nearest auto and psngr origin: " + nearestAutoAgent + " " + this.psngr_origin);
	double distanceToStation = nearestAutoAgent.distanceTo(this.psngr_origin.origin_lat, this.psngr_origin.origin_lon);
	this.comebackTime = (distanceToStation / main.autoSpeed);
	traceln("Calculating for passenger " + this.psngr_id + " at time " + time());
	traceln("distance and comebackTime to the station: " + distanceToStation + " " + this.comebackTime);
	computeCount += 1;
	
}  
  }

  
double 
 getDestinationDistance( double distance ) { 




return 0; 
  }

  void getTripDetails( Trip trip ) { 

traceln("in function body\n"); 
  }
  // Table Functions

  @AnyLogicInternalCodegenAPI
  private final static double[] _tableFunction_Arguments_xjal = _tableFunction_Arguments_xjal();
  @AnyLogicInternalCodegenAPI
  private final static double[] _tableFunction_Arguments_xjal() {
    return new double[] { 0.0, 0.25, 0.5, 0.75, 1.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private final static double[] _tableFunction_Values_xjal = _tableFunction_Values_xjal();
  @AnyLogicInternalCodegenAPI
  private final static double[] _tableFunction_Values_xjal() {
    return new double[] { 0.0, 1.0, 2.0, 3.0, 4.0,  };
  }

  /**
   * tableFunction Table Function
   */
  public final TableFunction tableFunction = new TableFunction( _tableFunction_Arguments_xjal, _tableFunction_Values_xjal, 
       TableFunction.INTERPOLATION_STEP, 1, TableFunction.OUTOFRANGE_ERROR,
       0.0 );
  
  public final double tableFunction( double x ) { return tableFunction.get( x ); }
  // Custom Distributions
  @AnyLogicInternalCodegenAPI
  private final static double[] _customDistribution_Arguments_xjal = _customDistribution_Arguments_xjal();
  @AnyLogicInternalCodegenAPI
  private final static double[] _customDistribution_Arguments_xjal() {
    return new double[] { 0.0, 1.0, 2.0, 3.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private final static double[] _customDistribution_Values_xjal = _customDistribution_Values_xjal();
  @AnyLogicInternalCodegenAPI
  private final static double[] _customDistribution_Values_xjal() {
    return new double[] { 0.25, 0.25, 0.25, 0.25,  };
  }

  /**
   * customDistribution Custom Distribution
   */
  public CustomDistribution customDistribution = new CustomDistribution( _customDistribution_Arguments_xjal, _customDistribution_Values_xjal, this );

  public int customDistribution() { return customDistribution.getInt(); }

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
    person = new ShapeGroup( Passengr.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
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
  public Passengr( Engine engine, Agent owner, AgentList<? extends Passengr> ownerPopulation ) {
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
  public Passengr() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Passengr( double percWantLastMile, boolean isAssignedAuto, int psngr_id, MetroStation psngr_origin, boolean hasCheckedAutoComebackTime, PsngrDestination psngrDestination, boolean canBeServed, int destIndex, boolean isLostDemand ) {
    markParametersAreSet();
    this.percWantLastMile = percWantLastMile;
    this.isAssignedAuto = isAssignedAuto;
    this.psngr_id = psngr_id;
    this.psngr_origin = psngr_origin;
    this.hasCheckedAutoComebackTime = hasCheckedAutoComebackTime;
    this.psngrDestination = psngrDestination;
    this.canBeServed = canBeServed;
    this.destIndex = destIndex;
    this.isLostDemand = isLostDemand;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Passengr_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Passengr.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Passengr.this, getElementProperty( "original_joint_fm_lm_shareability.Passengr.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Passengr.class );
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
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    eventTrip.start();
    passenger_statechart_entry.start();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Passengr_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Passengr_xjal() {
    generateVehicleRequest = 
false 
;
    nearestAgentDistance = 
0 
;
    inQueue = 
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
    
String  msg = (String) _msg_xjal;
    Agent sender = _sender_xjal;
    
if (msg.equals("GenerateVehicleRequestStarted"))
	generateVehicleRequest = true; 
    passenger_statechart_entry.fireEvent( _msg_xjal );
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Passengr> getPopulation() {
    return (AgentList<? extends Passengr>) super.getPopulation();
  }

  public List<? extends Passengr> agentsInRange( double distance ) {
    return (List<? extends Passengr>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    eventTrip.onChange();
    passenger_statechart_entry.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    eventTrip.onDestroy();
    passenger_statechart_entry.onDestroy();
    super.onDestroy();
  }



}
