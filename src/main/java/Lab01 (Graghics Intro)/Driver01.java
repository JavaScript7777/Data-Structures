import javax.swing.JFrame;

/**
 * Creates a label for north, west, east, south, and
 * center, in their corresponding locations on the window
 * 
 * @author  JavaScript7777
 * @version v0.01 - untested
 * @see     Constants
 * @see     Panel00
 */
public class Driver01 {

    /**
     * main method, launches the window
     * 
     * @param args required; does not effect the output
     */
    public static void main(String[] args) {
        JFrame frame = new Frame("Lab 01");
        frame.getContentPane().setPrefferedSize(Constants.FRAME_SIZE);
        frame.pack();
        frame.setLocation(Constants.FRAME_LOCATION);
        frame.add(new Panel00());
        frame.setVisible(true);
    }

}