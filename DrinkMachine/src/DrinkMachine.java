/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



/**
 *
 * @author Zachary Murphy
 */
public class DrinkMachine extends JApplet {

 private JPanel sodaOptions; // to hold the selectrion of sodea buttons
 private JPanel input; //panel where user will input everything
 private JPanel output; // panel where user will receive their change and if something is out of stock
 private JTextField tendered;
 
    public void init() {
        buildSodaOptionsPanel();
        add(sodaOptions);
    }

    // TODO overwrite start(), stop() and destroy() methods


private void buildSodaOptionsPanel(){
    //declare panel
    sodaOptions = new JPanel();
    //making new label to give instructions
    JLabel sodaMessage = new JLabel ("Select from: ");
    //create radio buttons
    JRadioButton cola = new JRadioButton("Cola");
    JRadioButton lemonLime = new JRadioButton("Lemon Lime");
    JRadioButton grape = new JRadioButton ("Grape Sode");
    JRadioButton rootBeer = new JRadioButton ("Root beer");
    JRadioButton bWater = new JRadioButton ("Bottled Water");
    //layout manager for panel
    sodaOptions.setLayout(new FlowLayout(FlowLayout.RIGHT));
    
    //add everything
    sodaOptions.add(sodaMessage);
    sodaOptions.add(cola);
    sodaOptions.add(lemonLime);
    sodaOptions.add(grape);
    sodaOptions.add(rootBeer);
    sodaOptions.add(bWater);
    
}
private void buildInputPanel(){
    input = new JPanel();
    JLabel inputMessage = new JLabel("Enter the amount tendered.");
    
}
}
