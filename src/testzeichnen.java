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
    window.setSize(1500,1500);
    img = new Drawimg(window,0,0);
    for (int i = 0 ;i != 1000  ;i++ ) {
      System.out.println(i);
      img = new Drawimg(window,i,i);
      img.del();
    } // end of for
  }        
    
    
    
    
  public static void main(String[] args)throws java.io.IOException {
    new testzeichnen();  
  } // end of main
    
} // end of class testzeichnen
  