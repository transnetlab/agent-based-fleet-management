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

public class Trip extends Agent
{
  // Parameters

  public 
Passengr  passengr;

  /**
   * Returns default value for parameter <code>passengr</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public Passengr _passengr_DefaultValue_xjal() {
    final Trip self = this;
    return null;
  }

  public void set_passengr( Passengr value ) {
    if (value == this.passengr) {
      return;
    }
    Passengr _oldValue_xjal = this.passengr;
    this.passengr = value;
    onChange_passengr_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter passengr.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_passengr()</code> method instead.
   */
  protected void onChange_passengr() {
    onChange_passengr_xjal( passengr );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_passengr_xjal( Passengr oldValue ) {  
  }


  public 
PsngrDestination  psngrdestination;

  /**
   * Returns default value for parameter <code>psngrdestination</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public PsngrDestination _psngrdestination_DefaultValue_xjal() {
    final Trip self = this;
    return null;
  }

  public void set_psngrdestination( PsngrDestination value ) {
    if (value == this.psngrdestination) {
      return;
    }
    PsngrDestination _oldValue_xjal = this.psngrdestination;
    this.psngrdestination = value;
    onChange_psngrdestination_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter psngrdestination.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_psngrdestination()</code> method instead.
   */
  protected void onChange_psngrdestination() {
    onChange_psngrdestination_xjal( psngrdestination );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_psngrdestination_xjal( PsngrDestination oldValue ) {  
  }


  public 
MetroStation  psngr_origin;

  /**
   * Returns default value for parameter <code>psngr_origin</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public MetroStation _psngr_origin_DefaultValue_xjal() {
    final Trip self = this;
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


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    passengr = _passengr_DefaultValue_xjal();
    psngrdestination = _psngrdestination_DefaultValue_xjal();
    psngr_origin = _psngr_origin_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "passengr":
      if ( _callOnChange_xjal ) {
        set_passengr( (Passengr) _value_xjal );
      } else {
        passengr = (Passengr) _value_xjal;
      }
      return true;
    case "psngrdestination":
      if ( _callOnChange_xjal ) {
        set_psngrdestination( (PsngrDestination) _value_xjal );
      } else {
        psngrdestination = (PsngrDestination) _value_xjal;
      }
      return true;
    case "psngr_origin":
      if ( _callOnChange_xjal ) {
        set_psngr_origin( (MetroStation) _value_xjal );
      } else {
        psngr_origin = (MetroStation) _value_xjal;
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
    case "passengr": _result_xjal = passengr; break;
    case "psngrdestination": _result_xjal = psngrdestination; break;
    case "psngr_origin": _result_xjal = psngr_origin; break;
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
      list.add( "passengr" );
      list.add( "psngrdestination" );
      list.add( "psngr_origin" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

  public 
double 
 numLMShare;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Trip.class );
  
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
   
  public enum statechart_state implements IStatechartState<Trip, statechart_state> {
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
    public Statechart<statechart_state> getStatechart( Trip _a ) {
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
  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 1;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return false;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll();
  }

  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
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
  public Trip( Engine engine, Agent owner, AgentList<? extends Trip> ownerPopulation ) {
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
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Trip() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Trip( Passengr passengr, PsngrDestination psngrdestination, MetroStation psngr_origin ) {
    markParametersAreSet();
    this.passengr = passengr;
    this.psngrdestination = psngrdestination;
    this.psngr_origin = psngr_origin;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Trip_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Trip.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Trip.this, getElementProperty( "original_joint_fm_lm_shareability.Trip.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Trip.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    statechart.start();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Trip_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Trip_xjal() {
    numLMShare = 
0 
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

  public AgentList<? extends Trip> getPopulation() {
    return (AgentList<? extends Trip>) super.getPopulation();
  }

  public List<? extends Trip> agentsInRange( double distance ) {
    return (List<? extends Trip>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    statechart.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    statechart.onDestroy();
    super.onDestroy();
  }



}
