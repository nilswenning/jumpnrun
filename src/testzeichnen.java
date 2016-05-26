/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 26.05.2016
  * @author 
  */

public class testzeichnen {
  FrmZeichnen window;
  Drawimg img;
  
  public testzeichnen()throws java.io.IOException{
    
    window = new FrmZeichnen(); 
    window.setVisible (true);
    
    img = new Drawimg(window);
    }        
    
    
    
    
    public static void main(String[] args)throws java.io.IOException {
    new testzeichnen();  
    } // end of main
    
    } // end of class testzeichnen
  