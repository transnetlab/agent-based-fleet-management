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

public class autoOrigin extends Agent
{
  // Parameters
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( autoOrigin.class );
  
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
    return new double[] { 0.0, 4.0, 20.0, 16.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps278_pointsDY_xjal() {
    return new double[] { 0.0, 2.0, -6.0, -8.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps278_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps279_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 6.0, 12.0, 12.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps279_pointsDY_xjal() {
    return new double[] { 0.0, -7.0, -8.0, -1.0, 6.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps279_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps280_pointsDX_xjal() {
    return new double[] { 0.0, 8.0, 8.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps280_pointsDY_xjal() {
    return new double[] { 0.0, 4.0, -1.0, -5.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps280_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps281_pointsDX_xjal() {
    return new double[] { 0.0, 16.0, 16.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps281_pointsDY_xjal() {
    return new double[] { 0.0, -8.0, -15.0, -7.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps281_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps282_pointsDX_xjal() {
    return new double[] { 0.0, 16.0, 10.0, -6.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps282_pointsDY_xjal() {
    return new double[] { 0.0, -8.0, -15.0, -7.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps282_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps283_pointsDX_xjal() {
    return new double[] { 0.0, 16.0, 10.0, -6.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps283_pointsDY_xjal() {
    return new double[] { 0.0, -8.0, -7.0, 1.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps283_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps284_pointsDX_xjal() {
    return new double[] { 0.0, 16.0, 16.0, 10.0, 4.0, -12.0, -12.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps284_pointsDY_xjal() {
    return new double[] { 0.0, -8.0, -15.0, -22.0, -21.0, -13.0, -6.0,  };
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
		SHAPE_DRAW_2D, true, -3.0, 12.0, 0.0, null, __ps278_Fill_Color,
            4, __ps278_pointsDX_xjal(), __ps278_pointsDY_xjal(), __ps278_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps279 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -15.0, 6.0, 0.0, null, __ps279_Fill_Color,
            5, __ps279_pointsDX_xjal(), __ps279_pointsDY_xjal(), __ps279_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps280 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -13.0, 7.0, 0.0, null, __ps280_Fill_Color,
            4, __ps280_pointsDX_xjal(), __ps280_pointsDY_xjal(), __ps280_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps281 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -3.0, 12.0, 0.0, null, __ps281_Fill_Color,
            4, __ps281_pointsDX_xjal(), __ps281_pointsDY_xjal(), __ps281_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps282 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -3.0, 5.0, 0.0, null, gold,
            4, __ps282_pointsDX_xjal(), __ps282_pointsDY_xjal(), __ps282_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps283 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -9.0, -2.0, 0.0, null, __ps283_Fill_Color,
            4, __ps283_pointsDX_xjal(), __ps283_pointsDY_xjal(), __ps283_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps284 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -3.0, 12.0, 0.0, __ps284_Line_Color, null,
            7, __ps284_pointsDX_xjal(), __ps284_pointsDY_xjal(), __ps284_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    warehouse = new ShapeGroup( autoOrigin.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
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
  public autoOrigin( Engine engine, Agent owner, AgentList<? extends autoOrigin> ownerPopulation ) {
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
  public autoOrigin() {
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_autoOrigin_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( autoOrigin.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( autoOrigin.this, getElementProperty( "original_joint_fm_lm_shareability.autoOrigin.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( autoOrigin.class );
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
    setupPlainVariables_autoOrigin_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_autoOrigin_xjal() {
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

  public AgentList<? extends autoOrigin> getPopulation() {
    return (AgentList<? extends autoOrigin>) super.getPopulation();
  }

  public List<? extends autoOrigin> agentsInRange( double distance ) {
    return (List<? extends autoOrigin>) super.agentsInRange( distance );
  }



}
