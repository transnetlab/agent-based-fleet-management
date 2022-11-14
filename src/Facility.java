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

public class Facility extends Agent
{
  // Parameters

  public 
String  city;

  /**
   * Returns default value for parameter <code>city</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public String _city_DefaultValue_xjal() {
    final Facility self = this;
    return null;
  }

  public void set_city( String value ) {
    if (value == this.city) {
      return;
    }
    String _oldValue_xjal = this.city;
    this.city = value;
    onChange_city_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter city.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_city()</code> method instead.
   */
  protected void onChange_city() {
    onChange_city_xjal( city );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_city_xjal( String oldValue ) {  
  }


  public 
boolean  isHomeFacility;

  /**
   * Returns default value for parameter <code>isHomeFacility</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public boolean _isHomeFacility_DefaultValue_xjal() {
    final Facility self = this;
    return 
false 
;
  }

  public void set_isHomeFacility( boolean value ) {
    if (value == this.isHomeFacility) {
      return;
    }
    boolean _oldValue_xjal = this.isHomeFacility;
    this.isHomeFacility = value;
    onChange_isHomeFacility_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter isHomeFacility.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_isHomeFacility()</code> method instead.
   */
  protected void onChange_isHomeFacility() {
    onChange_isHomeFacility_xjal( isHomeFacility );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_isHomeFacility_xjal( boolean oldValue ) {  
  }


  public 
double  lon;

  /**
   * Returns default value for parameter <code>lon</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _lon_DefaultValue_xjal() {
    final Facility self = this;
    return 0.0;
  }

  public void set_lon( double value ) {
    if (value == this.lon) {
      return;
    }
    double _oldValue_xjal = this.lon;
    this.lon = value;
    onChange_lon_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter lon.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_lon()</code> method instead.
   */
  protected void onChange_lon() {
    onChange_lon_xjal( lon );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_lon_xjal( double oldValue ) {  
  }


  public 
double  lat;

  /**
   * Returns default value for parameter <code>lat</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _lat_DefaultValue_xjal() {
    final Facility self = this;
    return 0.0;
  }

  public void set_lat( double value ) {
    if (value == this.lat) {
      return;
    }
    double _oldValue_xjal = this.lat;
    this.lat = value;
    onChange_lat_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter lat.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_lat()</code> method instead.
   */
  protected void onChange_lat() {
    onChange_lat_xjal( lat );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_lat_xjal( double oldValue ) {  
  }


  public 
int  locIndex;

  /**
   * Returns default value for parameter <code>locIndex</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _locIndex_DefaultValue_xjal() {
    final Facility self = this;
    return 0;
  }

  public void set_locIndex( int value ) {
    if (value == this.locIndex) {
      return;
    }
    int _oldValue_xjal = this.locIndex;
    this.locIndex = value;
    onChange_locIndex_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter locIndex.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_locIndex()</code> method instead.
   */
  protected void onChange_locIndex() {
    onChange_locIndex_xjal( locIndex );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_locIndex_xjal( int oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    city = _city_DefaultValue_xjal();
    isHomeFacility = _isHomeFacility_DefaultValue_xjal();
    lon = _lon_DefaultValue_xjal();
    lat = _lat_DefaultValue_xjal();
    locIndex = _locIndex_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "city":
      if ( _callOnChange_xjal ) {
        set_city( (String) _value_xjal );
      } else {
        city = (String) _value_xjal;
      }
      return true;
    case "isHomeFacility":
      if ( _callOnChange_xjal ) {
        set_isHomeFacility( (Boolean) _value_xjal );
      } else {
        isHomeFacility = (Boolean) _value_xjal;
      }
      return true;
    case "lon":
      if ( _callOnChange_xjal ) {
        set_lon( ((Number) _value_xjal).doubleValue() );
      } else {
        lon = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "lat":
      if ( _callOnChange_xjal ) {
        set_lat( ((Number) _value_xjal).doubleValue() );
      } else {
        lat = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "locIndex":
      if ( _callOnChange_xjal ) {
        set_locIndex( ((Number) _value_xjal).intValue() );
      } else {
        locIndex = ((Number) _value_xjal).intValue();
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
    case "city": _result_xjal = city; break;
    case "isHomeFacility": _result_xjal = isHomeFacility; break;
    case "lon": _result_xjal = lon; break;
    case "lat": _result_xjal = lat; break;
    case "locIndex": _result_xjal = locIndex; break;
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
      list.add( "city" );
      list.add( "isHomeFacility" );
      list.add( "lon" );
      list.add( "lat" );
      list.add( "locIndex" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

  public 
boolean 
 partOfRoute;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Facility.class );
  
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
  protected static final int _STATECHART_COUNT_xjal = 0;


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
  public Facility( Engine engine, Agent owner, AgentList<? extends Facility> ownerPopulation ) {
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
  public Facility() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Facility( String city, boolean isHomeFacility, double lon, double lat, int locIndex ) {
    markParametersAreSet();
    this.city = city;
    this.isHomeFacility = isHomeFacility;
    this.lon = lon;
    this.lat = lat;
    this.locIndex = locIndex;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Facility_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Facility.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Facility.this, getElementProperty( "original_joint_fm_lm_shareability.Facility.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Facility.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Facility_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Facility_xjal() {
    partOfRoute = 
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


  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Facility> getPopulation() {
    return (AgentList<? extends Facility>) super.getPopulation();
  }

  public List<? extends Facility> agentsInRange( double distance ) {
    return (List<? extends Facility>) super.agentsInRange( distance );
  }



}