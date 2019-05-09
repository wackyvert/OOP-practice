import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class HorseBehavior {
    static String name = JOptionPane.showInputDialog("Name your horse!");
    static Horse userHorse = new Horse(name);
    public static void HorseBehaviorGUI(){

        JFrame parent = new JFrame("What should the horse do?");
        parent.setSize(640, 480);
        JPanel newPanel = new JPanel(new GridBagLayout());
        parent.add(newPanel);
        JButton eat = new JButton("Eat");
        eat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String food = JOptionPane.showInputDialog("What should the horse eat?");
                userHorse.eat(food);
            }
        });
        JButton horse = new JButton("Sleep");
        horse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sleepString = JOptionPane.showInputDialog("How long should the horse sleep for?");
                int sleepTime = parseInt(sleepString);
                userHorse.sleep(sleepTime);
            }
        });
        JButton walk = new JButton("Walk");
        walk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String walkString = JOptionPane.showInputDialog("How far should the horse walk?");
                double walkDistance = parseDouble(walkString);
                userHorse.walk(walkDistance);
            }
        });
    }
}
