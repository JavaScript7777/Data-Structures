import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Color;
import java.awt.Font;

/**
 * Any universal constants used by either, Driver00 or Panel00
 * 
 * @author  JavaScript7777
 * @version v0.03 - untested
 * @see     Driver00
 * @see     Panel00
 * @since   v0.01 - untested
 */
public class Constants {
    
    /**
     * The size of the content pane of the window
     * 
     * @since v0.01 - untested
     */
    public static final Dimension FRAME_SIZE = new Dimension(500, 500);

    /**
     * The title of the window
     */
    public static final String FRAME_TITLE = "Lab01";

    /**
     * Whether the frame initializes as visible
     */
    public static final boolean FRAME_VISIBILITY = true;

    /**
     * Point for the top left of a container
     * 
     * @since v0.01 - untested
     */
    public static final Point ORIGIN = new Point(0, 0);

    /**
     * Where to place the JFrame on the screen
     * 
     * @since v0.01 - untested
     */
    public static final Point FRAME_LOCATION = new Point(100, 100);

    /**
     * Bounds for the entire content pane of the window
     * 
     * @since v0.01 - untested
     */
    public static final Rectangle CONTENT_PANE_AREA = new Rectangle(ORIGIN, FRAME_SIZE);

    /**
     * The text for the north label
     * 
     * @since v0.02 - untested
     */
    public static final String NORTH_LABEL_NAME = "North";

    /**
     * The text color for the north label, currently red
     * 
     * @since v0.02 - untested
     */
    public static final Color NORTH_COLOR = new Color(255, 0, 0);

    /**
     * The text for the east label
     * 
     * @since v0.02 - untested
     */
    public static final String EAST_LABEL_NAME = "East";

    /**
     * The color of the east label, dark green
     * (Might be inaccurate)
     * 
     * @since v0.02 - untested
     */
    public static final Color EAST_COLOR = new Color(0, 128, 0);

    /**
     * The text for the south label
     * 
     * @since v0.02 - untested
     */
    public static final String SOUTH_LABEL_NAME = "South";

    /**
     * The color of the south label, black
     * 
     * @since v0.02 - untested
     */
    public static final Color SOUTH_COLOR = new Color(0, 0, 0);

    /**
     * The text for the west label
     * 
     * @since v0.02 - untested
     */
    public static final String WEST_LABEL_NAME = "West";

    /**
     * The color of the west label, magenta
     * 
     * @since v0.02 - untested
     */
    public static final Color WEST_COLOR = new Color(255, 0, 255);

    /**
     * The text of the center label
     * 
     * @since v0.02 - untested
     */
    public static final String CENTER_LABEL_NAME = "Center";

    /**
     * The color of the center label, green
     * 
     * @since v0.02 - untested
     */
    public static final Color CENTER_COLOR = new Color(0, 255, 0);

    /**
     * The name of the center label font, Helvetica
     * 
     * @since v0.02 - untested
     */
    public static final String CENTER_FONT_NAME = "Helvetica";

    /**
     * The style of the center label font, Plain
     * 
     * @since v0.02 - untested
     */
    public static final int CENTER_FONT_STYLE = Font.PLAIN;

    /**
     * The size of the center label font, 26
     * 
     * @since v0.02 - untested
     */
    public static final int CENTER_FONT_SIZE = 26;

    /**
     * The font for the center label
     * 
     * @since v0.02 - untested
     */
    public static final FONT CENTER_FONT = new Font(CENTER_FONT_NAME, CENTER_FONT_STYLE, CENTER_FONT_SIZE);

}