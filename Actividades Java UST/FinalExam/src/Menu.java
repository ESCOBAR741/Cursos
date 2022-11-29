import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Menu extends JFrame{

    JPopupMenu popupMenu;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        try {
                            UIManager.setLookAndFeel(info.getClassName());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }

                Menu frame = new Menu ();

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setSize(400, 400);
                frame.setVisible(true);
            }
        });

    }

    public Menu() {

        popupMenu = new JPopupMenu();

        popupMenu.add(createMenu("Displayed Items"));
        this.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent Me) {
                if (Me.isPopupTrigger()) {
                    popupMenu.show(Me.getComponent(), Me.getX(), Me.getY());
                }
            }
        });

    }

    private String createMenu(String displayed_items) {
        return displayed_items;
    }


    public static class JCheckBoxMenu extends JMenu {


        public JCheckBoxMenu(String text, boolean selected) {
            super(text);
            setModel(new JToggleButton.ToggleButtonModel());
            setSelected(selected);
            setFocusable(false);

        }
    }
}
