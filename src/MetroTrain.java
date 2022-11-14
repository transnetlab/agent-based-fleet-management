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

public class MetroTrain extends Agent
{
  /**
   * eventPassengerArrival Dynamic Event Class
   */  
  public static class eventPassengerArrival extends DynamicEvent {
    public int idPassenger;
    public boolean isAssignedAuto;
    public String lastMileOrigin;
  
    /**
     * Constructor<br>
     * Use <code>create_eventPassengerArrival</code> method
     */
    public eventPassengerArrival( MetroTrain _ao_xjal, double _dt_xjal , int idPassenger, boolean isAssignedAuto, String lastMileOrigin ) {
      this( _ao_xjal, _dt_xjal, false
		, idPassenger
		, isAssignedAuto
		, lastMileOrigin );
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventPassengerArrival</code> method
     */
    public eventPassengerArrival( MetroTrain _ao_xjal, double _dt_xjal, TimeUnits _units , int idPassenger, boolean isAssignedAuto, String lastMileOrigin ) {
      this( _ao_xjal, _dt_xjal, _units, false
		, idPassenger
		, isAssignedAuto
		, lastMileOrigin );
    }
  
    /**
     * Constructor<br>
     * Use <code>create_eventPassengerArrival</code> method
     */
    public eventPassengerArrival( MetroTrain _ao_xjal, double _t_xjal, boolean _absolute_xjal , int idPassenger, boolean isAssignedAuto, String lastMileOrigin ) {
      super( _ao_xjal, _t_xjal, _absolute_xjal );
      this.idPassenger = idPassenger;
      this.isAssignedAuto = isAssignedAuto;
      this.lastMileOrigin = lastMileOrigin;
    }
    
    /**
     * Constructor<br>
     * Use <code>create_eventPassengerArrival</code> method
     */
    public eventPassengerArrival( MetroTrain _ao_xjal, double _t_xjal, TimeUnits _units, boolean _absolute_xjal , int idPassenger, boolean isAssignedAuto, String lastMileOrigin ) {
      super( _ao_xjal, _t_xjal, _units, _absolute_xjal );
      this.idPassenger = idPassenger;
      this.isAssignedAuto = isAssignedAuto;
      this.lastMileOrigin = lastMileOrigin;
    }

    @AnyLogicInternalCodegenAPI
    public void execute() {
      super.execute(); // must be called!
      ((MetroTrain) getAgent()).on_eventPassengerArrival_xjal( idPassenger, isAssignedAuto, lastMileOrigin );
    }
  }

  /**
   * assignTrip Dynamic Event Class
   */  
  public static class assignTrip extends DynamicEvent {
    public String station_name;
  
    /**
     * Constructor<br>
     * Use <code>create_assignTrip</code> method
     */
    public assignTrip( MetroTrain _ao_xjal, double _dt_xjal , String station_name ) {
      this( _ao_xjal, _dt_xjal, false
		, station_name );
    }
    
    /**
     * Constructor<br>
     * Use <code>create_assignTrip</code> method
     */
    public assignTrip( MetroTrain _ao_xjal, double _dt_xjal, TimeUnits _units , String station_name ) {
      this( _ao_xjal, _dt_xjal, _units, false
		, station_name );
    }
  
    /**
     * Constructor<br>
     * Use <code>create_assignTrip</code> method
     */
    public assignTrip( MetroTrain _ao_xjal, double _t_xjal, boolean _absolute_xjal , String station_name ) {
      super( _ao_xjal, _t_xjal, _absolute_xjal );
      this.station_name = station_name;
    }
    
    /**
     * Constructor<br>
     * Use <code>create_assignTrip</code> method
     */
    public assignTrip( MetroTrain _ao_xjal, double _t_xjal, TimeUnits _units, boolean _absolute_xjal , String station_name ) {
      super( _ao_xjal, _t_xjal, _units, _absolute_xjal );
      this.station_name = station_name;
    }

    @AnyLogicInternalCodegenAPI
    public void execute() {
      super.execute(); // must be called!
      ((MetroTrain) getAgent()).on_assignTrip_xjal( station_name );
    }
  }

  // Parameters

  public 
int  timeIndex;

  /**
   * Returns default value for parameter <code>timeIndex</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _timeIndex_DefaultValue_xjal() {
    final MetroTrain self = this;
    return 0;
  }

  public void set_timeIndex( int value ) {
    if (value == this.timeIndex) {
      return;
    }
    int _oldValue_xjal = this.timeIndex;
    this.timeIndex = value;
    onChange_timeIndex_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter timeIndex.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_timeIndex()</code> method instead.
   */
  protected void onChange_timeIndex() {
    onChange_timeIndex_xjal( timeIndex );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_timeIndex_xjal( int oldValue ) {  
  }


  public 
String  lineType;

  /**
   * Returns default value for parameter <code>lineType</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public String _lineType_DefaultValue_xjal() {
    final MetroTrain self = this;
    return null;
  }

  public void set_lineType( String value ) {
    if (value == this.lineType) {
      return;
    }
    String _oldValue_xjal = this.lineType;
    this.lineType = value;
    onChange_lineType_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter lineType.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_lineType()</code> method instead.
   */
  protected void onChange_lineType() {
    onChange_lineType_xjal( lineType );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_lineType_xjal( String oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    timeIndex = _timeIndex_DefaultValue_xjal();
    lineType = _lineType_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "timeIndex":
      if ( _callOnChange_xjal ) {
        set_timeIndex( ((Number) _value_xjal).intValue() );
      } else {
        timeIndex = ((Number) _value_xjal).intValue();
      }
      return true;
    case "lineType":
      if ( _callOnChange_xjal ) {
        set_lineType( (String) _value_xjal );
      } else {
        lineType = (String) _value_xjal;
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
    case "timeIndex": _result_xjal = timeIndex; break;
    case "lineType": _result_xjal = lineType; break;
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
      list.add( "timeIndex" );
      list.add( "lineType" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( MetroTrain.class );
  
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

  public EventCondition eventTrainArrival = new EventCondition(this);
  public EventCondition eventTrainArrivalNS = new EventCondition(this);
  public EventCondition eventTrainArrivalEWRev = new EventCondition(this);
  public EventCondition eventTrainArrivalNS1 = new EventCondition(this);
  public EventCondition event = new EventCondition(this);


  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventCondition _e ) {
    if ( _e == eventTrainArrival ) return "eventTrainArrival";
    if ( _e == eventTrainArrivalNS ) return "eventTrainArrivalNS";
    if ( _e == eventTrainArrivalEWRev ) return "eventTrainArrivalEWRev";
    if ( _e == eventTrainArrivalNS1 ) return "eventTrainArrivalNS1";
    if ( _e == event ) return "event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testConditionOf( EventCondition _e ) {

    if ( _e == eventTrainArrival) return 
true 
;
    if ( _e == eventTrainArrivalNS) return 
true 
;
    if ( _e == eventTrainArrivalEWRev) return 
true 
;
    if ( _e == eventTrainArrivalNS1) return 
true 
;
    if ( _e == event) return 
false 
;
    return super.testConditionOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventCondition self ) {
    if ( self == eventTrainArrival) {

if (lineType.equals("EWL")) {

	traceln("EWL train has arrived! " + time() + timeIndex);
	int numMetroStations = 17;
	int numPsngrArray[] = new int[numMetroStations];
	traceln("EWL Calling function getPsngrCount()");
	int[] poissonArray = getPsngrCount();
	int[] interArrivalTimeArray = getInterArrivalTime();
	
	// store number of passengers in numPsngrArray
	for(int i =0; i<numMetroStations; i++) {
		numPsngrArray[i] = poisson	(poissonArray[i]);
		traceln(poissonArray[i] + " " + numPsngrArray[i]);
	}
	
	//create sub events for train arrival at stations
	traceln("Arrival at 1st station");
	for(int i=0; i<numPsngrArray[0]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[0], SECOND, i, false, "Mysore Road");
		if(i == numPsngrArray[0]-1) {
			create_assignTrip(interArrivalTimeArray[0]+1, "Mysore Road");
		}
	}
	
	for(int i=0; i<numPsngrArray[1]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[1], SECOND, i, false, "Deepanjali Nagar");
		if(i == numPsngrArray[1]-1) {
			create_assignTrip(interArrivalTimeArray[1]+1, "Deepanjali Nagar");
		}
	}
	
	for(int i=0; i<numPsngrArray[2]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[2], SECOND, i, false, "Attiguppe");
		if(i == numPsngrArray[2]-1) {
			create_assignTrip(interArrivalTimeArray[2]+1, "Attiguppe");
		}
	}

	for(int i=0; i<numPsngrArray[3]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[3], SECOND, i, false, "Vijayanagara");
		if(i == numPsngrArray[3]-1) {
			create_assignTrip(interArrivalTimeArray[3]+1, "Vijayanagara");
		}
	}

	for(int i=0; i<numPsngrArray[4]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[4], SECOND, i, false, "Sri Balagangadaranatha Swamy Hosahalli");
		if(i == numPsngrArray[4]-1) {
			create_assignTrip(interArrivalTimeArray[4]+1, "Sri Balagangadaranatha Swamy Hosahalli");
		}
	}

	for(int i=0; i<numPsngrArray[5]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[5], SECOND, i, false, "Magadi Road");
		if(i == numPsngrArray[5]-1) {
			create_assignTrip(interArrivalTimeArray[5]+1, "Magadi Road");
		}
	}

	for(int i=0; i<numPsngrArray[6]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[6], SECOND, i, false, "Krantivira Sangolli Rayanna");
		if(i == numPsngrArray[6]-1) {
			create_assignTrip(interArrivalTimeArray[6]+1, "Krantivira Sangolli Rayanna");
		}
	}

	for(int i=0; i<numPsngrArray[7]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[7], SECOND, i, false, "Nadaprabhu Kempegowda Station");
		if(i == numPsngrArray[7]-1) {
			create_assignTrip(interArrivalTimeArray[7]+1, "Nadaprabhu Kempegowda Station");
		}
	}
	
	for(int i=0; i<numPsngrArray[8]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[8], SECOND, i, false, "Sir M Vishweshwariah - Central College");
		if(i == numPsngrArray[8]-1) {
			create_assignTrip(interArrivalTimeArray[8]+1, "Sir M Vishweshwariah - Central College");
		}
	}
	for(int i=0; i<numPsngrArray[9]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[9], SECOND, i, false, "Dr. B R Ambedkar Station");
		if(i == numPsngrArray[9]-1) {
			create_assignTrip(interArrivalTimeArray[9]+1, "Dr. B R Ambedkar Station");
		}
	}
	
	
	for(int i=0; i<numPsngrArray[10]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[10], SECOND, i, false, "Cubbon Park");
		if(i == numPsngrArray[10]-1) {
			create_assignTrip(interArrivalTimeArray[10]+1, "Cubbon Park");
		}
	}
	
	
	for(int i=0; i<numPsngrArray[11]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[11], SECOND, i, false, "Mahatma Gandhi Road");
		if(i == numPsngrArray[11]-1) {
			create_assignTrip(interArrivalTimeArray[11]+1, "Mahatma Gandhi Road");
		}
	}
	for(int i=0; i<numPsngrArray[12]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[12], SECOND, i, false, "Trinity");
		if(i == numPsngrArray[12]-1) {
			create_assignTrip(interArrivalTimeArray[12]+1, "Trinity");
		}
	}
	for(int i=0; i<numPsngrArray[13]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[13], SECOND, i, false, "Halasuru");
		if(i == numPsngrArray[13]-1) {
			create_assignTrip(interArrivalTimeArray[13]+1, "Halasuru");
		}
	}
	for(int i=0; i<numPsngrArray[14]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[14], SECOND, i, false, "Indiranagar");
		if(i == numPsngrArray[14]-1) {
			create_assignTrip(interArrivalTimeArray[14]+1, "Indiranagar");
		}
	}
	for(int i=0; i<numPsngrArray[15]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[15], SECOND, i, false, "Swami Vivekananda Road");
		if(i == numPsngrArray[15]-1) {
			create_assignTrip(interArrivalTimeArray[15]+1, "Swami Vivekananda Road");
		}
	}
	for(int i=0; i<numPsngrArray[16]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[16], SECOND, i, false, "Baiyyappanahalli");
		if(i == numPsngrArray[16]-1) {
			create_assignTrip(interArrivalTimeArray[16]+1, "Baiyyappanahalli");
		}
	}
} 
;
      return ;
    }
    if ( self == eventTrainArrivalNS) {

if (lineType.equals("NSL")) {
	traceln("NSL train has arrived! " + time() + timeIndex);
	int numMetroStations = 24;
	int numPsngrArray[] = new int[numMetroStations];
	
	traceln("NSL Calling function getPsngrCount()");
	int[] poissonArray = getPsngrCountNS();
	int[] interArrivalTimeArray = getInterArrivalTimeNS();
	
	// store number of passengers in numPsngrArray
	for(int i =0; i<numMetroStations; i++) {
		numPsngrArray[i] = poisson	(poissonArray[i]);
		traceln(poissonArray[i] + " " + numPsngrArray[i]);
	}
	
	// create sub events for train arrival at stations
	traceln("Arrival at 1st station");
	for(int i=0; i<numPsngrArray[0]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[0], SECOND, i, false, "Nagasandra");
		if(i == numPsngrArray[0]-1) {
			create_assignTrip(interArrivalTimeArray[0]+1, "Nagasandra");
		}
	}

	for(int i=0; i<numPsngrArray[1]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[1], SECOND, i, false, "Dasarahalli");
		if(i == numPsngrArray[1]-1) {
			create_assignTrip(interArrivalTimeArray[1]+1, "Dasarahalli");
		}
	}

	for(int i=0; i<numPsngrArray[2]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[2], SECOND, i, false, "Jalahalli");
		if(i == numPsngrArray[2]-1) {
			create_assignTrip(interArrivalTimeArray[2]+1, "Jalahalli");
		}
	}

	for(int i=0; i<numPsngrArray[3]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[3], SECOND, i, false, "Peenya Industry");
		if(i == numPsngrArray[3]-1) {
			create_assignTrip(interArrivalTimeArray[3]+1, "Peenya Industry");
		}
	}

	for(int i=0; i<numPsngrArray[4]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[4], SECOND, i, false, "Peenya");
		if(i == numPsngrArray[4]-1) {
			create_assignTrip(interArrivalTimeArray[4]+1, "Peenya");
		}
	}

	for(int i=0; i<numPsngrArray[5]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[5], SECOND, i, false, "Goraguntepalya");
		if(i == numPsngrArray[5]-1) {
			create_assignTrip(interArrivalTimeArray[5]+1, "Goraguntepalya");
		}
	}

	for(int i=0; i<numPsngrArray[6]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[6], SECOND, i, false, "Yeshwantpura");
		if(i == numPsngrArray[6]-1) {
			create_assignTrip(interArrivalTimeArray[6]+1, "Yeshwantpura");
		}
	}

	for(int i=0; i<numPsngrArray[7]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[7], SECOND, i, false, "Sandal Soap Factory");
		if(i == numPsngrArray[7]-1) {
			create_assignTrip(interArrivalTimeArray[7]+1, "Sandal Soap Factory");
		}
	}
	for(int i=0; i<numPsngrArray[8]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[8], SECOND, i, false, "Mahalakshmi");
		if(i == numPsngrArray[8]-1) {
			create_assignTrip(interArrivalTimeArray[8]+1, "Mahalakshmi");
		}
	}
	for(int i=0; i<numPsngrArray[9]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[9], SECOND, i, false, "Rajajinagar");
		if(i == numPsngrArray[9]-1) {
			create_assignTrip(interArrivalTimeArray[9]+1, "Rajajinagar");
		}
	}
	for(int i=0; i<numPsngrArray[10]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[10], SECOND, i, false, "Mahakavi Kuvempu Road");
		if(i == numPsngrArray[10]-1) {
			create_assignTrip(interArrivalTimeArray[10]+1, "Mahakavi Kuvempu Road");
		}
	}
	for(int i=0; i<numPsngrArray[11]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[11], SECOND, i, false, "Srirampura");
		if(i == numPsngrArray[11]-1) {
			create_assignTrip(interArrivalTimeArray[11]+1, "Srirampura");
		}
	}
	for(int i=0; i<numPsngrArray[12]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[12], SECOND, i, false, "Mantri Square");
		if(i == numPsngrArray[12]-1) {
			create_assignTrip(interArrivalTimeArray[12]+1, "Mantri Square");
		}
	}
	for(int i=0; i<numPsngrArray[13]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[13], SECOND, i, false, "Nadaprabhu Kempegowda Station");
		if(i == numPsngrArray[13]-1) {
			create_assignTrip(interArrivalTimeArray[13]+1, "Nadaprabhu Kempegowda Station");
		}
	}
	for(int i=0; i<numPsngrArray[14]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[14], SECOND, i, false, "Chikkapete");
		if(i == numPsngrArray[14]-1) {
			create_assignTrip(interArrivalTimeArray[14]+1, "Chikkapete");
		}
	}
	for(int i=0; i<numPsngrArray[15]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[15], SECOND, i, false, "Krishna Rajendra Market");
		if(i == numPsngrArray[15]-1) {
			create_assignTrip(interArrivalTimeArray[15]+1, "Krishna Rajendra Market");
		}
	}
	for(int i=0; i<numPsngrArray[16]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[16], SECOND, i, false, "National College");
		if(i == numPsngrArray[16]-1) {
			create_assignTrip(interArrivalTimeArray[16]+1, "National College");
		}
	}
	for(int i=0; i<numPsngrArray[17]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[17], SECOND, i, false, "Lalbagh");
		if(i == numPsngrArray[17]-1) {
			create_assignTrip(interArrivalTimeArray[17]+1, "Lalbagh");
		}
	}
	for(int i=0; i<numPsngrArray[18]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[18], SECOND, i, false, "South End Circle");
		if(i == numPsngrArray[18]-1) {
			create_assignTrip(interArrivalTimeArray[18]+1, "South End Circle");
		}
	}
	for(int i=0; i<numPsngrArray[19]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[19], SECOND, i, false, "Jayanagar");
		if(i == numPsngrArray[19]-1) {
			create_assignTrip(interArrivalTimeArray[19]+1, "Jayanagar");
		}
	}
	for(int i=0; i<numPsngrArray[20]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[20], SECOND, i, false, "Rashtriya Vidyalaya Road");
		if(i == numPsngrArray[20]-1) {
			create_assignTrip(interArrivalTimeArray[20]+1, "Rashtriya Vidyalaya Road");
		}
	}
	for(int i=0; i<numPsngrArray[21]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[21], SECOND, i, false, "Banashankari");
		if(i == numPsngrArray[21]-1) {
			create_assignTrip(interArrivalTimeArray[21]+1, "Banashankari");
		}
	}
	for(int i=0; i<numPsngrArray[22]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[22], SECOND, i, false, "J P Nagar");
		if(i == numPsngrArray[22]-1) {
			create_assignTrip(interArrivalTimeArray[22]+1, "J P Nagar");
		}
	}
	for(int i=0; i<numPsngrArray[23]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[23], SECOND, i, false, "Yelachenahalli");
		if(i == numPsngrArray[23]-1) {
			create_assignTrip(interArrivalTimeArray[23]+1, "Yelachenahalli");
		}
	}

}
 
;
      return ;
    }
    if ( self == eventTrainArrivalEWRev) {

if (lineType.equals("EWLRev")) {

	traceln("EWL rev train has arrived! " + time() + timeIndex);
	int numMetroStations = 17;
	int numPsngrArray[] = new int[numMetroStations];
	traceln("EWL rev Calling function getPsngrCount()");
	int[] poissonArray = getPsngrCountEWRev();
	int[] interArrivalTimeArray = getInterArrivalTimeEWRev();
	
	// store number of passengers in numPsngrArray
	for(int i =0; i<numMetroStations; i++) {
		numPsngrArray[i] = poisson	(poissonArray[i]);
		traceln(poissonArray[i] + " " + numPsngrArray[i]);
	}
	
	//create sub events for train arrival at stations
	traceln("Arrival at 1st station");
	for(int i=0; i<numPsngrArray[0]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[0], SECOND, i, false, "Baiyyappanahalli");
		if(i == numPsngrArray[0]-1) {
			create_assignTrip(interArrivalTimeArray[0]+1, "Baiyyappanahalli");
		}
	}
	
	for(int i=0; i<numPsngrArray[1]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[1], SECOND, i, false, "Swami Vivekananda Road");
		if(i == numPsngrArray[1]-1) {
			create_assignTrip(interArrivalTimeArray[1]+1, "Swami Vivekananda Road");
		}
	}
	
	for(int i=0; i<numPsngrArray[2]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[2], SECOND, i, false, "Indiranagar");
		if(i == numPsngrArray[2]-1) {
			create_assignTrip(interArrivalTimeArray[2]+1, "Indiranagar");
		}
	}

	for(int i=0; i<numPsngrArray[3]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[3], SECOND, i, false, "Halasuru");
		if(i == numPsngrArray[3]-1) {
			create_assignTrip(interArrivalTimeArray[3]+1, "Halasuru");
		}
	}

	for(int i=0; i<numPsngrArray[4]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[4], SECOND, i, false, "Trinity");
		if(i == numPsngrArray[4]-1) {
			create_assignTrip(interArrivalTimeArray[4]+1, "Trinity");
		}
	}

	for(int i=0; i<numPsngrArray[5]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[5], SECOND, i, false, "Mahatma Gandhi Road");
		if(i == numPsngrArray[5]-1) {
			create_assignTrip(interArrivalTimeArray[5]+1, "Mahatma Gandhi Road");
		}
	}

	for(int i=0; i<numPsngrArray[6]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[6], SECOND, i, false, "Cubbon Park");
		if(i == numPsngrArray[6]-1) {
			create_assignTrip(interArrivalTimeArray[6]+1, "Cubbon Park");
		}
	}

	for(int i=0; i<numPsngrArray[7]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[7], SECOND, i, false, "Dr. B R Ambedkar Station");
		if(i == numPsngrArray[7]-1) {
			create_assignTrip(interArrivalTimeArray[7]+1, "Dr. B R Ambedkar Station");
		}
	}
	
	for(int i=0; i<numPsngrArray[8]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[8], SECOND, i, false, "Sir M Vishweshwariah - Central College");
		if(i == numPsngrArray[8]-1) {
			create_assignTrip(interArrivalTimeArray[8]+1, "Sir M Vishweshwariah - Central College");
		}
	}
	for(int i=0; i<numPsngrArray[9]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[9], SECOND, i, false, "Nadaprabhu Kempegowda Station");
		if(i == numPsngrArray[9]-1) {
			create_assignTrip(interArrivalTimeArray[9]+1, "Nadaprabhu Kempegowda Station");
		}
	}
	for(int i=0; i<numPsngrArray[10]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[10], SECOND, i, false, "Krantivira Sangolli Rayanna");
		if(i == numPsngrArray[10]-1) {
			create_assignTrip(interArrivalTimeArray[10]+1, "Krantivira Sangolli Rayanna");
		}
	}
	for(int i=0; i<numPsngrArray[11]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[11], SECOND, i, false, "Magadi Road");
		if(i == numPsngrArray[11]-1) {
			create_assignTrip(interArrivalTimeArray[11]+1, "Magadi Road");
		}
	}
	for(int i=0; i<numPsngrArray[12]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[12], SECOND, i, false, "Sri Balagangadaranatha Swamy Hosahalli");
		if(i == numPsngrArray[12]-1) {
			create_assignTrip(interArrivalTimeArray[12]+1, "Sri Balagangadaranatha Swamy Hosahalli");
		}
	}
	for(int i=0; i<numPsngrArray[13]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[13], SECOND, i, false, "Vijayanagara");
		if(i == numPsngrArray[13]-1) {
			create_assignTrip(interArrivalTimeArray[13]+1, "Vijayanagara");
		}
	}
	for(int i=0; i<numPsngrArray[14]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[14], SECOND, i, false, "Attiguppe");
		if(i == numPsngrArray[14]-1) {
			create_assignTrip(interArrivalTimeArray[14]+1, "Attiguppe");
		}
	}
	for(int i=0; i<numPsngrArray[15]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[15], SECOND, i, false, "Deepanjali Nagar");
		if(i == numPsngrArray[15]-1) {
			create_assignTrip(interArrivalTimeArray[15]+1, "Deepanjali Nagar");
		}
	}
	
	for(int i=0; i<numPsngrArray[16]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[16], SECOND, i, false, "Mysore Road");
		if(i == numPsngrArray[16]-1) {
			create_assignTrip(interArrivalTimeArray[16]+1, "Mysore Road");
		}
	}
} 
;
      return ;
    }
    if ( self == eventTrainArrivalNS1) {

if (lineType.equals("NSLRev")) {
	traceln("NSL rev train has arrived! " + time() + timeIndex);
	int numMetroStations = 24;
	int numPsngrArray[] = new int[numMetroStations];
	
	traceln("NSL rev Calling function getPsngrCount()");
	int[] poissonArray = getPsngrCountNSRev();
	int[] interArrivalTimeArray = getInterArrivalTimeNSRev();
	
	// store number of passengers in numPsngrArray
	for(int i =0; i<numMetroStations; i++) {
		numPsngrArray[i] = poisson	(poissonArray[i]);
		traceln(poissonArray[i] + " " + numPsngrArray[i]);
	}
	
	// create sub events for train arrival at stations
	traceln("Arrival at 1st station");
	for(int i=0; i<numPsngrArray[0]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[0], SECOND, i, false, "Yelachenahalli");
		if(i == numPsngrArray[0]-1) {
			create_assignTrip(interArrivalTimeArray[0]+1, "Yelachenahalli");
		}
	}

	for(int i=0; i<numPsngrArray[1]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[1], SECOND, i, false, "J P Nagar");
		if(i == numPsngrArray[1]-1) {
			create_assignTrip(interArrivalTimeArray[1]+1, "J P Nagar");
		}
	}

	for(int i=0; i<numPsngrArray[2]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[2], SECOND, i, false, "Banashankari");
		if(i == numPsngrArray[2]-1) {
			create_assignTrip(interArrivalTimeArray[2]+1, "Banashankari");
		}
	}

	for(int i=0; i<numPsngrArray[3]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[3], SECOND, i, false, "Rashtriya Vidyalaya Road");
		if(i == numPsngrArray[3]-1) {
			create_assignTrip(interArrivalTimeArray[3]+1, "Rashtriya Vidyalaya Road");
		}
	}

	for(int i=0; i<numPsngrArray[4]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[4], SECOND, i, false, "Jayanagar");
		if(i == numPsngrArray[4]-1) {
			create_assignTrip(interArrivalTimeArray[4]+1, "Jayanagar");
		}
	}

	for(int i=0; i<numPsngrArray[5]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[5], SECOND, i, false, "South End Circle");
		if(i == numPsngrArray[5]-1) {
			create_assignTrip(interArrivalTimeArray[5]+1, "South End Circle");
		}
	}

	for(int i=0; i<numPsngrArray[6]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[6], SECOND, i, false, "Lalbagh");
		if(i == numPsngrArray[6]-1) {
			create_assignTrip(interArrivalTimeArray[6]+1, "Lalbagh");
		}
	}

	for(int i=0; i<numPsngrArray[7]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[7], SECOND, i, false, "National College");
		if(i == numPsngrArray[7]-1) {
			create_assignTrip(interArrivalTimeArray[7]+1, "National College");
		}
	}
	for(int i=0; i<numPsngrArray[8]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[8], SECOND, i, false, "Krishna Rajendra Market");
		if(i == numPsngrArray[8]-1) {
			create_assignTrip(interArrivalTimeArray[8]+1, "Krishna Rajendra Market");
		}
	}
	for(int i=0; i<numPsngrArray[9]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[9], SECOND, i, false, "Chikkapete");
		if(i == numPsngrArray[9]-1) {
			create_assignTrip(interArrivalTimeArray[9]+1, "Chikkapete");
		}
	}
	for(int i=0; i<numPsngrArray[10]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[10], SECOND, i, false, "Nadaprabhu Kempegowda Station");
		if(i == numPsngrArray[10]-1) {
			create_assignTrip(interArrivalTimeArray[10]+1, "Nadaprabhu Kempegowda Station");
		}
	}
	for(int i=0; i<numPsngrArray[11]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[11], SECOND, i, false, "Mantri Square");
		if(i == numPsngrArray[11]-1) {
			create_assignTrip(interArrivalTimeArray[11]+1, "Mantri Square");
		}
	}
	for(int i=0; i<numPsngrArray[12]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[12], SECOND, i, false, "Srirampura");
		if(i == numPsngrArray[12]-1) {
			create_assignTrip(interArrivalTimeArray[12]+1, "Srirampura");
		}
	}
	for(int i=0; i<numPsngrArray[13]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[13], SECOND, i, false, "Mahakavi Kuvempu Road");
		if(i == numPsngrArray[13]-1) {
			create_assignTrip(interArrivalTimeArray[13]+1, "Mahakavi Kuvempu Road");
		}
	}
	for(int i=0; i<numPsngrArray[14]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[14], SECOND, i, false, "Rajajinagar");
		if(i == numPsngrArray[14]-1) {
			create_assignTrip(interArrivalTimeArray[14]+1, "Rajajinagar");
		}
	}
	for(int i=0; i<numPsngrArray[15]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[15], SECOND, i, false, "Mahalakshmi");
		if(i == numPsngrArray[15]-1) {
			create_assignTrip(interArrivalTimeArray[15]+1, "Mahalakshmi");
		}
	}
	for(int i=0; i<numPsngrArray[16]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[16], SECOND, i, false, "Sandal Soap Factory");
		if(i == numPsngrArray[16]-1) {
			create_assignTrip(interArrivalTimeArray[16]+1, "Sandal Soap Factory");
		}
	}
	for(int i=0; i<numPsngrArray[17]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[17], SECOND, i, false, "Yeshwantpura");
		if(i == numPsngrArray[17]-1) {
			create_assignTrip(interArrivalTimeArray[17]+1, "Yeshwantpura");
		}
	}
	for(int i=0; i<numPsngrArray[18]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[18], SECOND, i, false, "Goraguntepalya");
		if(i == numPsngrArray[18]-1) {
			create_assignTrip(interArrivalTimeArray[18]+1, "Goraguntepalya");
		}
	}
	for(int i=0; i<numPsngrArray[19]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[19], SECOND, i, false, "Peenya");
		if(i == numPsngrArray[19]-1) {
			create_assignTrip(interArrivalTimeArray[19]+1, "Peenya");
		}
	}
	for(int i=0; i<numPsngrArray[20]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[20], SECOND, i, false, "Peenya Industry");
		if(i == numPsngrArray[20]-1) {
			create_assignTrip(interArrivalTimeArray[20]+1, "Peenya Industry");
		}
	}
	for(int i=0; i<numPsngrArray[21]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[21], SECOND, i, false, "Jalahalli");
		if(i == numPsngrArray[21]-1) {
			create_assignTrip(interArrivalTimeArray[21]+1, "Jalahalli");
		}
	}
	for(int i=0; i<numPsngrArray[22]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[22], SECOND, i, false, "Dasarahalli");
		if(i == numPsngrArray[22]-1) {
			create_assignTrip(interArrivalTimeArray[22]+1, "Dasarahalli");
		}
	}
	for(int i=0; i<numPsngrArray[23]; i++) {
		create_eventPassengerArrival(interArrivalTimeArray[23], SECOND, i, false, "Nagasandra");
		if(i == numPsngrArray[23]-1) {
			create_assignTrip(interArrivalTimeArray[23]+1, "Nagasandra");
		}
	}
}
 
;
      return ;
    }
    if ( self == event) {

String station_name = "Mysore Road";

MetroStation station = findFirst(main.metroStation, m -> m.origin_name.equals(station_name));
int numTrucksIdle = findAll(main.autos, a -> (a.inState(Autos.AtMetroStation) && abs(a.autoOrigin_Lat - station.origin_lat) < 0.00001 && abs(a.autoOrigin_Lon - station.origin_lon) < 0.00001)).size();

traceln("in event trip numTrucksIdle: " + numTrucksIdle);

if (numTrucksIdle == 0) {
	//traceln("No trucks available");
}
else
{
	int[] exec_order = new int[4*3]; 
	
	traceln("in assign order: " + station.locationQueue + " " + station.locationQueue.size());
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
		for(int l = 0; l<12; l++)
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
			traceln("in assign order: " + j);
			Autos auto = randomWhere(main.autos, v -> v.inState(Autos.AtMetroStation) && abs(v.autoOrigin_Lat - station.origin_lat) < 0.00001 && abs(v.autoOrigin_Lon -station.origin_lon) < 0.00001 && v.hasPassenger == false);
			if (auto != null) {
				traceln("chose auto: " + auto);
				MultiLocationTrip multiLocTrip = new MultiLocationTrip();
				multiLocTrip.lastIndexVisited = -1;
				multiLocTrip.set_destinations(newDests[j]);
				multiLocTrip.set_psngr_origin(station);
				send(multiLocTrip, auto);
				auto.hasPassenger = true;
				j++;
				num++;
			}
			else {
				traceln("auto null: " + j);
				num++;
			}
		}
	}
}
 
;
      return ;
    }
    super.executeActionOf( self );
  }
  

	

  // Dynamic Events 

  /**
   * Creates new dynamic event eventPassengerArrival with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param idPassenger
   * @param isAssignedAuto
   * @param lastMileOrigin
   * @return created dynamic event instance
   */
  public eventPassengerArrival create_eventPassengerArrival(double _dt , int idPassenger, boolean isAssignedAuto, String lastMileOrigin ) {
    return new eventPassengerArrival( this, _dt , idPassenger, isAssignedAuto, lastMileOrigin );
  }
  
  /**
   * Creates new dynamic event eventPassengerArrival with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param _units the time units
   * @param idPassenger
   * @param isAssignedAuto
   * @param lastMileOrigin
   * @return created dynamic event instance
   */
  public eventPassengerArrival create_eventPassengerArrival(double _dt, TimeUnits _units , int idPassenger, boolean isAssignedAuto, String lastMileOrigin ) {
    return new eventPassengerArrival( this, _dt, _units , idPassenger, isAssignedAuto, lastMileOrigin );
  } 

  /**
   * Creates new dynamic event eventPassengerArrival with given parameter values and schedules in the timeout specified
   * @param _t the model time (absolute)
   * @param idPassenger
   * @param isAssignedAuto
   * @param lastMileOrigin
   * @return created dynamic event instance
   */
  @AnyLogicInternalAPI
  public eventPassengerArrival create_eventPassengerArrival_absoluteTime_xjal(double _t , int idPassenger, boolean isAssignedAuto, String lastMileOrigin ) {
    return new eventPassengerArrival( this, _t, true , idPassenger, isAssignedAuto, lastMileOrigin );
  } 
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public void on_eventPassengerArrival_xjal(int idPassenger, boolean isAssignedAuto, String lastMileOrigin ) {

Passengr p = main.add_passengrs();
p.set_psngr_id(idPassenger);
MetroStation station = findFirst(main.metroStation, m -> m.origin_name.equals(lastMileOrigin));
p.set_psngr_origin(station);

double indx = uniform(0,1);
LocationTableFunction func = findFirst(main.locationTableFunctions, f -> f.station.equals(station.origin_name));
int tfindx = (int)func.tableFunction.get(indx);
List<PsngrDestination> destList = filter(main.psngrDestinations, d->(d.name).equals(station.origin_name));
p.set_psngrDestination(destList.get(tfindx));
p.set_destIndex(tfindx+1);
traceln("last mile event at: " + p.psngr_origin + " " + p.psngrDestination);

// add location of passenger to location queue of station for shareability
traceln("locations: " + tfindx + " " + p.psngrDestination + " " + p.psngrDestination.getIndex() + " " + p.getIndex());
traceln("lastMileOrigin " + lastMileOrigin + " " + time());
station.locationQueue.add(tfindx+1);
traceln(station.locationQueue.size());
traceln("locationQueue: " + station.locationQueue); 
;
  }

  /**
   * Creates new dynamic event assignTrip with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param station_name
   * @return created dynamic event instance
   */
  public assignTrip create_assignTrip(double _dt , String station_name ) {
    return new assignTrip( this, _dt , station_name );
  }
  
  /**
   * Creates new dynamic event assignTrip with given parameter values and schedules in the timeout specified
   * @param _dt the timeout
   * @param _units the time units
   * @param station_name
   * @return created dynamic event instance
   */
  public assignTrip create_assignTrip(double _dt, TimeUnits _units , String station_name ) {
    return new assignTrip( this, _dt, _units , station_name );
  } 

  /**
   * Creates new dynamic event assignTrip with given parameter values and schedules in the timeout specified
   * @param _t the model time (absolute)
   * @param station_name
   * @return created dynamic event instance
   */
  @AnyLogicInternalAPI
  public assignTrip create_assignTrip_absoluteTime_xjal(double _t , String station_name ) {
    return new assignTrip( this, _t, true , station_name );
  } 
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public void on_assignTrip_xjal(String station_name ) {

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
			traceln("in assign order: " + j);
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
				traceln("auto null: " + j);
				num++;
			}
		}
	}
} 
;
  }
  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Functions

  
int [] 
 getPsngrCount(  ) { 

List<Tuple> psngrCountList = selectFrom(last_mile_count)
.where(last_mile_count.time_index.eq(this.timeIndex))
.list(last_mile_count.myrd, last_mile_count.djnr, last_mile_count.agpp, last_mile_count.vjn, last_mile_count.hsli, last_mile_count.mird, last_mile_count.brcs, last_mile_count.kgwa, last_mile_count.vswa,
last_mile_count.vdsa, last_mile_count.cbpk , last_mile_count.magr, last_mile_count.tty, last_mile_count.hlru, last_mile_count.idng, last_mile_count.svrd, last_mile_count.byph);

traceln("psngrCountList: " + psngrCountList + psngrCountList.get(0).size());
Object[] arrObj = psngrCountList.get(0).toArray();
int[] arrInt = new int[arrObj.length];
for(int i=0; i<arrObj.length; i++){
    arrInt[i] = (int) arrObj[i];
}
return arrInt; 
  }

  
int [] 
 getInterArrivalTime(  ) { 

List<Integer> interArrivalTimetList = selectFrom(inter_station_duration).list(inter_station_duration.inter_arrival_time);
int[] arr = interArrivalTimetList.stream().mapToInt(i -> i).toArray();
return arr; 
  }

  
int [] 
 getInterArrivalTimeNS(  ) { 

List<Integer> interArrivalTimetList = selectFrom(ns_inter_station_duration).list(ns_inter_station_duration.inter_arrival_time);
int[] arr = interArrivalTimetList.stream().mapToInt(i -> i).toArray();
return arr; 
  }

  
int [] 
 getPsngrCountNS(  ) { 

List<Tuple> psngrCountList = selectFrom(ns_last_mile_count)
.where(ns_last_mile_count.time_index.eq(this.timeIndex))
.list(ns_last_mile_count.ngsa, ns_last_mile_count.dsh, ns_last_mile_count.jlhl, ns_last_mile_count.pyid, ns_last_mile_count.peya, ns_last_mile_count.ypi, ns_last_mile_count.ypm, ns_last_mile_count.ssfy, ns_last_mile_count.mhli,
ns_last_mile_count.rjnr, ns_last_mile_count.kvpr, ns_last_mile_count.spru, ns_last_mile_count.spgd, ns_last_mile_count.kgwa, ns_last_mile_count.ckpe, ns_last_mile_count.krmt, ns_last_mile_count.nlc, ns_last_mile_count.lbgh, ns_last_mile_count.sece, ns_last_mile_count.jyn, ns_last_mile_count.rvr, ns_last_mile_count.bsnk, ns_last_mile_count.jpn, ns_last_mile_count.puth);

traceln("psngrCountList NS: " + psngrCountList + psngrCountList.get(0).size());
Object[] arrObj = psngrCountList.get(0).toArray();
int[] arrInt = new int[arrObj.length];
for(int i=0; i<arrObj.length; i++){
    arrInt[i] = (int) arrObj[i];
}
return arrInt; 
  }

  
int [] 
 getPsngrCountEWRev(  ) { 

List<Tuple> psngrCountList = selectFrom(last_mile_count_purple_rev)
.where(last_mile_count_purple_rev.time_index.eq(this.timeIndex))
.list(last_mile_count_purple_rev.byph, last_mile_count_purple_rev.svrd, last_mile_count_purple_rev.idng, last_mile_count_purple_rev.hlru, last_mile_count_purple_rev.tty, last_mile_count_purple_rev.magr, last_mile_count_purple_rev.cbpk, last_mile_count_purple_rev.vdsa, last_mile_count_purple_rev.vswa, last_mile_count_purple_rev.kgwa, last_mile_count_purple_rev.brcs , last_mile_count_purple_rev.mird, last_mile_count_purple_rev.hsli, last_mile_count_purple_rev.vjn, last_mile_count_purple_rev.agpp, last_mile_count_purple_rev.djnr, last_mile_count_purple_rev.myrd);

traceln("psngrCountList EW Rev: " + psngrCountList + psngrCountList.get(0).size());
Object[] arrObj = psngrCountList.get(0).toArray();
int[] arrInt = new int[arrObj.length];
for(int i=0; i<arrObj.length; i++){
    arrInt[i] = (int) arrObj[i];
}
return arrInt; 
  }

  
int [] 
 getInterArrivalTimeEWRev(  ) { 

List<Integer> interArrivalTimetList = selectFrom(ew_rev_inter_station_duration).list(ew_rev_inter_station_duration.inter_arrival_time);
int[] arr = interArrivalTimetList.stream().mapToInt(i -> i).toArray();
return arr; 
  }

  
int [] 
 getInterArrivalTimeNSRev(  ) { 

List<Integer> interArrivalTimetList = selectFrom(ns_rev_inter_station_duration).list(ns_rev_inter_station_duration.inter_arrival_time);
int[] arr = interArrivalTimetList.stream().mapToInt(i -> i).toArray();
return arr; 
  }

  
int [] 
 getPsngrCountNSRev(  ) { 

List<Tuple> psngrCountList = selectFrom(last_mile_count_green_rev)
.where(last_mile_count_green_rev.time_index.eq(this.timeIndex))
.list(last_mile_count_green_rev.puth, last_mile_count_green_rev.jpn, last_mile_count_green_rev.bsnk, last_mile_count_green_rev.rvr, last_mile_count_green_rev.jyn, last_mile_count_green_rev.sece, last_mile_count_green_rev.lbgh,  last_mile_count_green_rev.nlc, last_mile_count_green_rev.krmt, last_mile_count_green_rev.ckpe, last_mile_count_green_rev.kgwa, last_mile_count_green_rev.spgd, last_mile_count_green_rev.spru, last_mile_count_green_rev.kvpr, last_mile_count_green_rev.rjnr, last_mile_count_green_rev.mhli, last_mile_count_green_rev.ssfy, last_mile_count_green_rev.ypm, last_mile_count_green_rev.ypi, last_mile_count_green_rev.peya, last_mile_count_green_rev.pyid, last_mile_count_green_rev.jlhl, last_mile_count_green_rev.dsh, last_mile_count_green_rev.ngsa);

traceln("psngrCountList NS Rev: " + psngrCountList + psngrCountList.get(0).size());
Object[] arrObj = psngrCountList.get(0).toArray();
int[] arrInt = new int[arrObj.length];
for(int i=0; i<arrObj.length; i++){
    arrInt[i] = (int) arrObj[i];
}
return arrInt; 
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
  protected static final Color __ps97_Fill_Color = new Color( 0xFF6B5A28, true );
  protected static final Color __ps98_Fill_Color = new Color( 0xFF6B5A28, true );
  protected static final Color __ps99_Fill_Color = new Color( 0xFFEED57D, true );
  protected static final Color __ps99_Line_Color = new Color( 0xFF604C30, true );
  protected static final Color __ps100_Fill_Color = new Color( 0xFF333556, true );
  protected static final Color __ps101_Fill_Color = new Color( 0xFFF7EAC8, true );
  @AnyLogicInternalCodegenAPI
  protected static final int __ps97 = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps98 = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps99 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps100 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps101 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps102 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps103 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _lorry2 = 8;

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
  protected static final double[] __ps97_pointsDX_xjal() {
    return new double[] { 0.0, -0.508, -1.017, -0.508, 0.0, 0.508,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps97_pointsDY_xjal() {
    return new double[] { 0.0, 1.034, 0.517, -0.517, -1.551, -1.034,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps97_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps98_pointsDX_xjal() {
    return new double[] { 0.0, 0.508, 0.0, -0.508, -1.017, -0.508,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps98_pointsDY_xjal() {
    return new double[] { 0.0, 1.034, 1.551, 0.517, -0.517, -1.034,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps98_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps99_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 2.543, 5.087, 7.629, 7.629, 5.087, 2.543, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps99_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 6.721, 6.721, 6.721, 6.721, 6.721, 6.721, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps99_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps100_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 1.017, 1.017, 1.017, 2.543, 2.543, 2.543, 2.543, 2.543, 2.543, 1.017, 1.017, 1.017, 0.0, 0.0, 0.0, 0.508, 0.508, 0.508, 0.508, 0.508, 0.508, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps100_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, -2.585, -2.585, -3.102, -3.102, -5.687, -5.687, -5.687, -5.687, -5.687, -5.687, -5.687, -5.17, -3.102, -1.034, -2.585, -2.585, -0.517, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps100_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(lorry2);
  }

  protected ShapeCurve _ps97;
  protected ShapeCurve _ps98;
  protected ShapeCurve _ps99;
  protected ShapeCurve _ps100;
  protected ShapeRoundedRectangle _ps101;
  protected ShapeRectangle _ps102;
  protected ShapeRoundedRectangle _ps103;
  protected ShapeGroup lorry2;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    _ps97 = new ShapeCurve(
      true,5.087, 3.619, 
      null, __ps97_Fill_Color,
      6, true, __ps97_pointsDX_xjal(), __ps97_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps98 = new ShapeCurve(
      true,5.087, -4.136, 
      null, __ps98_Fill_Color,
      6, true, __ps98_pointsDX_xjal(), __ps98_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps99 = new ShapeCurve(
      true,2.035, -3.619, 
      __ps99_Line_Color, __ps99_Fill_Color,
      12, true, __ps99_pointsDX_xjal(), __ps99_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps100 = new ShapeCurve(
      true,4.577, 2.585, 
      null, __ps100_Fill_Color,
      24, true, __ps100_pointsDX_xjal(), __ps100_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps101 = new ShapeRoundedRectangle(
		true,2.543, -3.102, 0.0, 
        null, __ps101_Fill_Color,
		1.526, 5.687,1.0,  
		1.0, LINE_STYLE_SOLID	 );

    _ps102 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-10.172, -4.136, 0.0, 0.0, 
            black, silver,
			12.207, 7.755, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps103 = new ShapeRoundedRectangle(
		true,-9.664, -3.102, 0.0, 
        null, white,
		11.189, 5.687,1.0,  
		1.0, LINE_STYLE_SOLID	 );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    lorry2 = new ShapeGroup( MetroTrain.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , _ps97
	     , _ps98
	     , _ps99
	     , _ps100
	     , _ps101
	     , _ps102
	     , _ps103 );

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
  public MetroTrain( Engine engine, Agent owner, AgentList<? extends MetroTrain> ownerPopulation ) {
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
  public MetroTrain() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public MetroTrain( int timeIndex, String lineType ) {
    markParametersAreSet();
    this.timeIndex = timeIndex;
    this.lineType = lineType;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_MetroTrain_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( MetroTrain.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( MetroTrain.this, getElementProperty( "original_joint_fm_lm_shareability.MetroTrain.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( MetroTrain.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    eventTrainArrival.start();
    eventTrainArrivalNS.start();
    eventTrainArrivalEWRev.start();
    eventTrainArrivalNS1.start();
    event.start();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_MetroTrain_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_MetroTrain_xjal() {
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

  public AgentList<? extends MetroTrain> getPopulation() {
    return (AgentList<? extends MetroTrain>) super.getPopulation();
  }

  public List<? extends MetroTrain> agentsInRange( double distance ) {
    return (List<? extends MetroTrain>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    eventTrainArrival.onChange();
    eventTrainArrivalNS.onChange();
    eventTrainArrivalEWRev.onChange();
    eventTrainArrivalNS1.onChange();
    event.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    eventTrainArrival.onDestroy();
    eventTrainArrivalNS.onDestroy();
    eventTrainArrivalEWRev.onDestroy();
    eventTrainArrivalNS1.onDestroy();
    event.onDestroy();
    super.onDestroy();
  }



}
