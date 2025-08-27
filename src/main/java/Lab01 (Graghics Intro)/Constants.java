import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Point;

/**
 * Any universal constants used by either, Driver00 or Panel00
 * 
 * @author  JavaScript7777
 * @version v0.01 - untested
 * @see     Driver00
 * @see     Panel00
 */
public class Constants {
    
    /**
     * The size of the content pane of the window
     */
    public static final Dimension FRAME_SIZE = new Dimension(500, 500);

    /**
     * Point for the top left of a container
     */
    public static final Point ORIGIN = new Point(0, 0);

    /**
     * Where to place the JFrame on the screen
     */
    public static final Point FRAME_LOCATION = new Point(100, 100);

    /**
     * Bounds for the entire content pane of the window
     */
    public static final Rectangle CONTENT_PANE_AREA = new Rectangle(ORIGIN, FRAME_SIZE);

}