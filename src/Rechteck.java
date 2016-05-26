
/**
 *  Baukasten: Klasse Rechteck
 * 
 *  @author Peter Damann 
 *  @version 08.07.2012
 */

import java.awt.*;  // Color

public class Rechteck {
  
  // Attribute
  
  FrmZeichnen kZf;
  Graphics kLw;
  int zX, zY, zB, zH;
  Color zFarbe;
  boolean zSichtbar;
  
  // Konstruktoren
  
  /** Konstruktor */
  public Rechteck (FrmZeichnen Zf, int xPos, int yPos, int breite, int hoehe, Color farbe)
  {    
    // Instanzvariable initialisieren
    kZf = Zf;
    kLw = kZf.getGraphics();  // Leinwand = Zeichenflaeche
    zX = xPos;
    zY = yPos;
    zB = breite;
    zH = hoehe;
    zFarbe = farbe;
    zSichtbar = false;
  }
  
  // Methoden
  
  /** zeichnet die Figur */
  public void zeichnen() {
    Color farbeAlt;
    farbeAlt = kLw.getColor();
    kLw.setColor (zFarbe);
    int x = zX + kZf.getInsets().left;
    int y = zY + kZf.getInsets().top;
    kLw.fillRect (x, y-zH, zB, zH);
    kLw.setColor (Color.black);
    kLw.drawRect (x, y-zH, zB, zH);
    kLw.setColor (farbeAlt);
    zSichtbar = true;
  }
  
  /** übermalt die Figur mit weißer Farbe */
  public void loeschen() {
    Color farbeAlt;
    farbeAlt = kLw.getColor();
    kLw.setColor (Color.white);
    int x = zX + kZf.getInsets().left;
    int y = zY + kZf.getInsets().top;
    kLw.fillRect (x, y-zH, zB, zH);
    kLw.drawRect (x, y-zH, zB, zH);
    kLw.setColor (farbeAlt);
    zSichtbar = false;
  }
  
  /** Farbe ... */
  public void setzeFarbe (Color farbe) {
    zFarbe = farbe;
  }
  
  /** Bezugspunkt: Ecke unten links */
  public void setzePosition (int xPos, int yPos){ 
      zX = xPos; zY = yPos;       
  }
  
  /** liefert die x-Koordinate der Figur */
  public int liesXPosition() {
    return zX;
  }
  
  /** liefert die y-Koordinate der Figur */
  public int liesYPosition() {
    return zY;
  }
  
} // class
