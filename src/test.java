import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.Random;
/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 26.05.2016
  * @author 
  */

public class test extends JFrame {
  // Anfang Attribute
  final BufferedImage image = ImageIO.read(new File("test.jpg"));
  // Ende Attribute
  
  public test(String title)throws IOException { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    JPanel pane = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
      }
    };
    
    add(pane);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public test
  
  // Anfang Methoden
  
  public static void main(String[] args)throws IOException {
    new test("test");
  } // end of main
  
  // Ende Methoden
} // end of class test
