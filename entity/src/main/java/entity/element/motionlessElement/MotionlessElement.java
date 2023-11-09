package entity.element.motionlessElement;

import entity.Map;
import entity.element.Element;
import entity.element.Position;

/**
 * <h1>The class MotionlessElement</h1>
 * It is used for non-moving elements
 *
 * @author BIRAHEKA
 * @version 1.0
 */
public abstract class MotionlessElement extends Element {
	/**
	 * Instantiates a new MotionlessElement.
	 * @param map
	 * 				The map.
	 * @param position
	 * 				The location of the motionless element.
	 */
	public MotionlessElement(Map map, Position position){
		super(map, position);
	}
}
