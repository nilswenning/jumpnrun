
/**
 *  Baukasten: Klasse Quadrat
 *  
 *  @Author Peter Damann
 *  @Version 08.07.2012
 */

import java.awt.*;  // Color

public class Quadrat
{
  // Attribute
  
  private FrmZeichnen kZf;
  private Graphics kLw;
  private int zX, zY, zB;
  private Color zFarbe;
  private boolean zSichtbar;
  
  
  // Konstrutor(en)
  
  /** Konstruktor: erzeugt ein Objekt der Klasse Quadrat */
  public Quadrat (FrmZeichnen zf, int xPos, int yPos, int breite, Color farbe)
  {    
    // Instanzvariable initialisieren
    kZf = zf;
    kLw = kZf.getGraphics();  // Leinwand = Zeichenflaeche
    zX = xPos;
    zY = yPos;
    zB = breite;
    zFarbe = farbe;
  }
  
  // Methoden  
  
  /** zeichnet die Figur */
  public void zeichnen() {
    Color farbeAlt;
    farbeAlt = kLw.getColor();
    kLw.setColor (zFarbe);
    int x = zX + kZf.getInsets().left;
    int y = zY + kZf.getInsets().top;
    kLw.fillRect (x, y-zB, zB, zB);
    kLw.setColor (Color.black);
    kLw.drawRect (x, y-zB, zB, zB);
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
    kLw.fillRect (x, y-zB, zB, zB);
    kLw.drawRect (x, y-zB, zB, zB);
    kLw.setColor (farbeAlt);
    zSichtbar = false;
  }
  
  /** zeichnet die Figur in der neuen Farbe */
  public void setzeFarbe (Color farbe) {
    zFarbe = farbe;
    
  }
  
  /** Bezugspunkt: Ecke unten links */
  public void setzePosition (int xPos, int yPos) {
    
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
  
  
}  // Klasse Quadrat
