/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
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
        
        buildInputPanel();
        buildOutputPanel();
        setLayout(new GridLayout(3,1));
        add(input);
        add(sodaOptions);
        add(output);
    }

    // TODO overwrite start(), stop() and destroy() methods


private void buildSodaOptionsPanel(){
    //declare panel
    sodaOptions = new JPanel();
    //making new label to give instructions
    JLabel sodaMessage = new JLabel ("Select from: ");
    //create radio buttons
    JButton cola = new JButton("Cola");
    JButton lemonLime = new JButton("Lemon Lime");
    JButton grape = new JButton ("Grape Sode");
    JButton rootBeer = new JButton ("Root beer");
    JButton bWater = new JButton ("Bottled Water");
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
    tendered = new JTextField(15);
    JButton enter = new JButton("Enter");
    input.setLayout(new FlowLayout(FlowLayout.LEFT));
    
    input.add(inputMessage);
    input.add(tendered);
    input.add(enter);
    
    
}

private void buildOutputPanel(){
    output = new JPanel();
    JTextField change = new JTextField(10);
    change.setEditable(false);
    JTextField status =  new JTextField(10);
    status.setEditable(false);
    
    
    
    output.add(change);
    output.add(status);
    
}

}
