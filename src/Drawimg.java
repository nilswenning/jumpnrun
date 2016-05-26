/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 26.05.2016
  * @author 
  */
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
public class Drawimg {
  // Anfang Attribute 
  final BufferedImage image = ImageIO.read(new File("test.jpg"));
  // Ende Attribute
  
  public Drawimg(FrmZeichnen Zf)throws IOException {
    JFrame frame = Zf;
    
    JPanel pane = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
      }
    };
    
    frame.add(pane);
  }

  // Anfang Methoden
  // Ende Methoden
} // end of Drawimg
  