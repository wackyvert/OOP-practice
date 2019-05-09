import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.YES_OPTION;


public class Live {
    public static void main(String[]args){
        JPanel animalshit = new JPanel();
        int choice;
        Object[]eat_sleep_walk= { "eat", "sleep", "walk" );
        choice = JOptionPane.showOptionDialog(null, animalshit, "Bank Account",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, eat_sleep_walk, null);

                String animalName = JOptionPane.showInputDialog("What kind of animal do you want?");
                if (animalName=="bird"){
                    Bird newBird = new Bird(animalName);
                    String flyDistance = JOptionPane.showInputDialog("How far should the bird fly?");
                    double flyDistanceDouble = Double.parseDouble(flyDistance);
                    newBird.fly(flyDistanceDouble);
                }
                else {
                    Horse userHorse = new Horse(animalName);
                    JFrame behavior = new JFrame("What do you want the animal to do?");
                    Object[] eat_sleep_walk = { "Eat", "Sleep", "Walk"};
                    int choiece = 0;
                    choice = JOptionPane.showOptionDialog(null, behavior, "Bank Account",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, eat_sleep_walk, null);
                    if (choiece==YES_OPTION){
                        String foodChoice = JOptionPane.showInputDialog("What kind of food should the animal eat?");
                        Horse.eat(foodChoice);
                    }
                }
            }




        }

    }

