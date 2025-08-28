import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

/**
 * Creates a panel that has each section: north, west, east
 * south, and, center; labeled in different colors
 * <p>
 * <pre>
 *     North  - Red
 *     West   - Pink
 *     South  - Black
 *     East   - Dark green
 *     Center - Green      - size 26 - Helvitica
 * <\pre>
 * 
 * @author  JavaScript7777
 * @version v1.0
 * @see     Constants
 * @since   v0.01 - untested
 */
public class Panel01 extends JPanel {

    /**
     * Sole constructor used for creating the panel
     * 
     * @since v0.01 - untested
     */
    public Panel01() {

            // Prepare panel
        setBounds(Constants.CONTENT_PANE_AREA);
        setLayout(new BorderLayout());

            // Label for north
        JLabel north = new JLabel(Constants.NORTH_LABEL_NAME, SwingConstants.CENTER);
        north.setForeground(Constants.NORTH_COLOR);
        add(north, BorderLayout.NORTH);

            // Label for east
        JLabel east = new JLabel(Constants.EAST_LABEL_NAME, SwingConstants.CENTER);
        east.setForeground(Constants.EAST_COLOR);
        add(east, BorderLayout.EAST);

            // Label for south
        JLabel south = new JLabel(Constants.SOUTH_LABEL_NAME, SwingConstants.CENTER);
        south.setForeground(Constants.SOUTH_COLOR);
        add(south, BorderLayout.SOUTH);
        
            // Label for west
        JLabel west = new JLabel(Constants.WEST_LABEL_NAME, SwingConstants.CENTER);
        west.setForeground(Constants.WEST_COLOR);
        add(west, BorderLayout.WEST);

            // Label for center
        JLabel center = new JLabel(Constants.CENTER_LABEL_NAME, SwingConstants.CENTER);
        center.setForeground(CONSTANTS.CENTER_COLOR);
        center.setFont(Constants.CENTER_FONT);
        add(center, BorderLayout.CENTER);

    }

}