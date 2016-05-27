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
  JFrame frame;
  JPanel pane = new JPanel();
  private int zX, zY;
  // Ende Attribute
  
  public Drawimg(FrmZeichnen Zf,int x,int y)throws IOException {
    frame = Zf;
    zX = x;
    zY = y;
    JPanel pane = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, x, y, null);
      }
    };
    
    frame.add(pane);
    frame.revalidate();
    
  }
  public void update() {
    JPanel pane = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, zX, zY, null);
      }
    };
    
    frame.repaint();
  }
  public void del(){
    ;
  }
  public void setzePosition (int xPos, int yPos) {
    zX = xPos;
    zY = yPos;
    
  }
  public int liesXPosition() {
    return zX;
  }
  
  /** liefert die y-Koordinate der Figur */
  public int liesYPosition() {
    return zY;
  }
  // Anfang Methoden
  // Ende Methoden
} // end of Drawimg
  