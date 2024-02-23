import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * A program Sketch.java that is design to make a flower!
   * @author : Simon Tse
   */

  public void settings() {
	// Size of the drawing
    size(600, 600);
  }

  public void setup() {
  // Colour of the background
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
    strokeWeight (1);
    stroke (0);
    fill( 255, 234, 0);
    ellipse(300, 300, 100, 100);

  // Sun
    fill( 255, 234, 0);
    ellipse(100, 100, 50, 50);
    triangle(105, 130, 95, 130, 100, 150);
    triangle(105, 70, 95, 70, 100, 50);
    triangle(130, 105, 130, 95, 150, 100);
    triangle(70, 105, 70, 95, 50, 100);
    triangle(75, 85, 85, 75, 65, 65);
    triangle(125, 85, 115, 75, 135, 65);
    triangle(75, 115, 85, 125, 65, 135);
    triangle(125, 115, 115, 125, 135, 135);

  // ant house
   fill (242, 202, 172);
   triangle(425, 500, 475, 500, 450, 450);
   rect(425, 500, 50, 50);
   fill (102, 94, 71);
   ellipse (450, 550, 10, 25);

  // The ground
   fill( 48, 31, 18);
   rect ( 0, 550, 600, 50);
  }
}
  
