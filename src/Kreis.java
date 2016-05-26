
import java.awt.*;  // Color

public class Kreis {
  
  // Attribute
  
  FrmZeichnen kZf;
  Graphics kLw;
  int zX, zY, zR;
  Color zFarbe;
  boolean zSichtbar;
  
  // Konstruktoren
  
  /** Konstruktor */
  public Kreis (FrmZeichnen zf, int xPos, int yPos, int radius, Color farbe) {
    
    // Instanzvariable initialisieren
    kZf = zf;
    kLw= kZf.getGraphics();  // Leinwand = Zeichenflaeche
    zX = xPos;
    zY = yPos;
    zR = radius;
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
    kLw.fillOval (x-zR, y-zR, 2*zR, 2*zR);
    kLw.setColor (Color.black);
    kLw.drawOval (x-zR, y-zR, 2*zR, 2*zR);
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
    kLw.fillOval (x-zR, y-zR, 2*zR, 2*zR);
    kLw.drawOval (x-zR, y-zR, 2*zR, 2*zR);
    kLw.setColor (farbeAlt);
    zSichtbar = false;
  }
  
  /** Farbe ... */
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
  
} // class