 

/**
 * @author Peter Damann
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class FrmZeichnen extends JFrame {
  
    // Attribute
       
    // Konstruktor
  public  FrmZeichnen(){
    setSize (400, 300);
    setLocation (380, 50);
    setTitle ("Zeichenfenster"); 
    setResizable (true);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setVisible(true); 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
    // Methoden: noch keine...      
    
    
  } // class FrmZeichnen
