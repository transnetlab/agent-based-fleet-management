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

public class AutoResourcePool extends Agent
{
  // Parameters

  public 
GISPoint[]  homeLocation;

  /**
   * Returns default value for parameter <code>homeLocation</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public GISPoint[] _homeLocation_DefaultValue_xjal() {
    final AutoResourcePool self = this;
    return null;
  }

  public void set_homeLocation( GISPoint[] value ) {
    if (value == this.homeLocation) {
      return;
    }
    GISPoint[] _oldValue_xjal = this.homeLocation;
    this.homeLocation = value;
    onChange_homeLocation_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter homeLocation.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_homeLocation()</code> method instead.
   */
  protected void onChange_homeLocation() {
    onChange_homeLocation_xjal( homeLocation );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_homeLocation_xjal( GISPoint[] oldValue ) {
	int index;
    {
      com.anylogic.libraries.processmodeling.ResourcePool<Autos> self = resourcePool;
      INode[] _value;
      _value = homeLocation
;
      resourcePool.set_homeNodes( _value );
    }  
  }


  public 
GISRegion  voronoiRegion;

  /**
   * Returns default value for parameter <code>voronoiRegion</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public GISRegion _voronoiRegion_DefaultValue_xjal() {
    final AutoResourcePool self = this;
    return null;
  }

  public void set_voronoiRegion( GISRegion value ) {
    if (value == this.voronoiRegion) {
      return;
    }
    GISRegion _oldValue_xjal = this.voronoiRegion;
    this.voronoiRegion = value;
    onChange_voronoiRegion_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter voronoiRegion.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_voronoiRegion()</code> method instead.
   */
  protected void onChange_voronoiRegion() {
    onChange_voronoiRegion_xjal( voronoiRegion );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_voronoiRegion_xjal( GISRegion oldValue ) {  
  }


  public 
int  capacity;

  /**
   * Returns default value for parameter <code>capacity</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _capacity_DefaultValue_xjal() {
    final AutoResourcePool self = this;
    return 0;
  }

  public void set_capacity( int value ) {
    if (value == this.capacity) {
      return;
    }
    int _oldValue_xjal = this.capacity;
    this.capacity = value;
    onChange_capacity_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter capacity.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_capacity()</code> method instead.
   */
  protected void onChange_capacity() {
    onChange_capacity_xjal( capacity );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_capacity_xjal( int oldValue ) {
	int index;
    {
      com.anylogic.libraries.processmodeling.ResourcePool<Autos> self = resourcePool;
      int _value;
      _value = capacity
;
      resourcePool.set_capacity( _value );
    }  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    homeLocation = _homeLocation_DefaultValue_xjal();
    voronoiRegion = _voronoiRegion_DefaultValue_xjal();
    capacity = _capacity_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "homeLocation":
      if ( _callOnChange_xjal ) {
        set_homeLocation( (GISPoint[]) _value_xjal );
      } else {
        homeLocation = (GISPoint[]) _value_xjal;
      }
      return true;
    case "voronoiRegion":
      if ( _callOnChange_xjal ) {
        set_voronoiRegion( (GISRegion) _value_xjal );
      } else {
        voronoiRegion = (GISRegion) _value_xjal;
      }
      return true;
    case "capacity":
      if ( _callOnChange_xjal ) {
        set_capacity( ((Number) _value_xjal).intValue() );
      } else {
        capacity = ((Number) _value_xjal).intValue();
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
    case "homeLocation": _result_xjal = homeLocation; break;
    case "voronoiRegion": _result_xjal = voronoiRegion; break;
    case "capacity": _result_xjal = capacity; break;
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
      list.add( "homeLocation" );
      list.add( "voronoiRegion" );
      list.add( "capacity" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( AutoResourcePool.class );
  
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


  // Embedded Objects

  public com.anylogic.libraries.processmodeling.ResourcePool<
Autos 
> resourcePool;

  public String getNameOf( Agent ao ) {
    if ( ao == resourcePool ) return "resourcePool";
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
  protected com.anylogic.libraries.processmodeling.ResourcePool<Autos> instantiate_resourcePool_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Autos> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Autos>( getEngine(), this, null ) {
      @Override
      public Agent newUnit(  ) {
        return _resourcePool_newUnit_xjal( this );
      }

      @AnyLogicInternalCodegenAPI
      public SpeedUnits getUnitsForCodeOf_speed() {
        return MPS;
      }
      @Override
      public AgentList population( Autos unit ) {
        return _resourcePool_population_xjal( this, unit );
      }
      @Override
      public void onNewUnit( Autos unit ) {
        _resourcePool_onNewUnit_xjal( this, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_resourcePool_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Autos> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = 
capacity 
;
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = 
main.autoSpeed 
;
    self.homeNodes = 
homeLocation 
;
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
    self.addToCustomPopulation = 
true 
;
    self.forceStatisticsCollection = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_resourcePool_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Autos> self, TableInput _t ) {
  }

  private Agent _resourcePool_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Autos> self ) {
    Agent _value;
    _value = 
new original_joint_fm_lm_shareability.Autos() 
;
    return _value;
  }
  private AgentList _resourcePool_population_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Autos> self, Autos unit ) {
    AgentList _value;
    _value = 
main.autos 
;
    return _value;
  }
  private void _resourcePool_onNewUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Autos> self, Autos unit ) {
    
resourcePool.set_capacity(capacity);
GISPoint gisPoint = (GISPoint)(unit.getHomeLocation());
String gisPointTitle = gisPoint.getTitle();
String gisPointName = gisPointTitle.split(",")[0].strip();

unit.autoOrigin_Lat = gisPoint.getLatitude();
unit.autoOrigin_Lon = gisPoint.getLongitude();
unit.autoOrigin = findFirst(main.metroStation, m -> m.origin_name.equals(gisPointName));

// assign Voronoi regions based on the origin node of auto
unit.autoGISVoronoiRegion = voronoiRegion; 
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
    person = new ShapeGroup( AutoResourcePool.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
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
  public AutoResourcePool( Engine engine, Agent owner, AgentList<? extends AutoResourcePool> ownerPopulation ) {
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
    resourcePool = instantiate_resourcePool_xjal();
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
  public AutoResourcePool() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public AutoResourcePool( GISPoint[] homeLocation, GISRegion voronoiRegion, int capacity ) {
    markParametersAreSet();
    this.homeLocation = homeLocation;
    this.voronoiRegion = voronoiRegion;
    this.capacity = capacity;
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
    setupPlainVariables_AutoResourcePool_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( AutoResourcePool.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( AutoResourcePool.this, getElementProperty( "original_joint_fm_lm_shareability.AutoResourcePool.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Creating non-replicated embedded objects
    setupParameters_resourcePool_xjal( resourcePool, null );
    doBeforeCreate_resourcePool_xjal( resourcePool, null );
    resourcePool.createAsEmbedded();
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( AutoResourcePool.class );
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
    resourcePool.startAsEmbedded();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_AutoResourcePool_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_AutoResourcePool_xjal() {
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

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( resourcePool );
    return list;
  }

  public AgentList<? extends AutoResourcePool> getPopulation() {
    return (AgentList<? extends AutoResourcePool>) super.getPopulation();
  }

  public List<? extends AutoResourcePool> agentsInRange( double distance ) {
    return (List<? extends AutoResourcePool>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    resourcePool.onDestroy();
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    resourcePool.doFinish();
  }



}
