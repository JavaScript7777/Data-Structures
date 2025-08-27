import javax.swing.JFrame;

/**
 * Creates a label for north, west, east, south, and
 * center, in their corresponding locations on the window
 * 
 * @author  JavaScript7777
 * @version v0.02 - untested
 * @see     Constants
 * @see     Panel00
 * @since   v0.01 - untested
 */
public class Driver01 {

    /**
     * main method, launches the window
     * 
     * @param args required; does not effect the output
     * @since      v0.01 - untested
     */
    public static void main(String[] args) {

            // Create the frame
        JFrame frame = new Frame("Lab 01");
        frame.getContentPane().setPrefferedSize(Constants.FRAME_SIZE);
        frame.pack();
        frame.setLocation(Constants.FRAME_LOCATION);
        frame.add(new Panel00());
        frame.setVisible(true);

    }

}