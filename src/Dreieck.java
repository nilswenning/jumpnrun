
/**
 * Klasse Dreieck
 * 
 * @author Peter Damann 
 * @version 29.06.2012
 */

import java.awt.*;  // Color

public class Dreieck {
  
  // Attribute
  
  private FrmZeichnen kZf;
  private Graphics kLw;
  private int zX, zY, zB, zH;
  private Color zFarbe;
  private boolean zSichtbar;
  
  // Konstruktoren
  
  /** Konstruktor */
  public Dreieck (FrmZeichnen Zf, int xPos, int yPos, int breite, Color farbe)
  {    
    // Instanzvariable initialisieren
    kZf = Zf;
    kLw= kZf.getGraphics();  // Leinwand = Zeichenflaeche
    zX = xPos;
    zY = yPos;
    zB = breite;
    zH = breite / 2;
    zFarbe = farbe;
  }
  
  // Methoden
  
  /** zeichnet die Figur */
  public void zeichnen() {
    kLw= kZf.getGraphics();
    Polygon eckpunkte;
    int x = zX + kZf.getInsets().left;
    int y = zY + kZf.getInsets().top;
    eckpunkte = new Polygon();
    eckpunkte.addPoint (x, y);
    eckpunkte.addPoint (x + zB, y);
    eckpunkte.addPoint (x + zB/2, y - zH);
    
    kLw.setColor (zFarbe);
    kLw.fillPolygon (eckpunkte);
    kLw.setColor (Color.black);
    kLw.drawPolygon (eckpunkte);
    zSichtbar = true;
  }
  
  /** übermalt die Figur mit weißer Farbe */
  public void loeschen() {
    Polygon eckpunkte;
    Color farbeAlt;
    farbeAlt = kLw.getColor();
    kLw.setColor (Color.white);
    int x = zX + kZf.getInsets().left;
    int y = zY + kZf.getInsets().top;
    eckpunkte = new Polygon();
    eckpunkte.addPoint (x, y);
    eckpunkte.addPoint (x + zB, y);
    eckpunkte.addPoint (x + zB/2, y - zH);
    
    kLw.fillPolygon (eckpunkte);
    kLw.drawPolygon (eckpunkte);
    kLw.setColor (farbeAlt);
    zSichtbar = false;
  }
  
  /** Farbe ... */
  public void setzeFarbe (Color farbe) {
    zFarbe = farbe;
    
  }
  
  /** Bezugspunkt: Ecke unten links */
  public void setzePosition (int xPos, int yPos) {
    zX = xPos;
    zY = yPos;
    
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