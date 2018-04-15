import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class traditionwalker extends PApplet {

PFont f;
  
public void setup() {  
  
  f = createFont("Verdana", 30);
  background(0);
  textFont(f);
  textAlign(CENTER);
  fill(0xff3DA4BC);
  text("Tradition Walker!", width * 0.5f, height * 0.1f);
}

  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "traditionwalker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
