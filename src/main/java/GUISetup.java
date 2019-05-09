import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUISetup {
    public static void GUISetup() {
        JFrame parent = new JFrame("Create an Animal");
        parent.setSize(640, 480);
        JPanel newPanel = new JPanel(new GridBagLayout());
        parent.add(newPanel);
        JButton bird = new JButton("Bird");
        JButton horse = new JButton("Horse");
        horse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HorseBehavior.HorseBehaviorGUI();
            }
        });
        newPanel.add(bird);
        newPanel.add(horse);
        parent.setVisible(true);
    }
}
