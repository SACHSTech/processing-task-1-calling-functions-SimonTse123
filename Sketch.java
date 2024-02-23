import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  public void setup() {
    background(184, 211, 255);
  }

  
  public void draw() {
	  
  // Stem 
    strokeWeight (30);
    stroke (42, 130, 22);
    line (300, 300, 300, 550);

  // Petals
    strokeWeight (1);
    stroke (0);
    fill (235, 156, 255);
    ellipse (250, 250, 100, 100); 
    ellipse (350, 350, 100, 100);
    ellipse( 250, 350, 100, 100);
    ellipse(350, 250, 100, 100);

  // Middle section of flower
    fill( 255, 234, 0);
    ellipse(300, 300, 100, 100);
  }
}
  
