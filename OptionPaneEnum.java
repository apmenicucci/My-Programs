import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Dimension;

public class OptionPaneEnum {
    static JFrame f;
    public enum CardSuit {hearts, spades, clubs, diamonds}
    public static void main(String[] args) {
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Welcome.");

        String string = JOptionPane.showInputDialog("Enter an integer:");
        int x = Integer.parseInt(string);
        JOptionPane.showMessageDialog(f, "You entered " + x + ".");

        JOptionPane.showMessageDialog(f, "Now for an \'enum\' demonstration.");
        CardSuit hearts = CardSuit.hearts;
        CardSuit spades = CardSuit.spades;
        CardSuit clubs = CardSuit.clubs;
        CardSuit diamonds = CardSuit.diamonds;
        JOptionPane.showMessageDialog(f, "The four suits are " + hearts + ", " + spades + ", " + clubs + ", and " + diamonds + ".");

        ImageIcon icon = new ImageIcon("C:/Users/261280am/Pictures/testImageIcon3.png");
        UIManager.put("OptionPane.minimumSize", new Dimension(300, 250));
        JOptionPane.showMessageDialog(f, "Large alert.", "ALERT", JOptionPane.WARNING_MESSAGE, icon);
    }
}