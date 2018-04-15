PFont f;
  
void setup() {  
  fullScreen();
  f = createFont("Verdana", 30);
  background(0);
  textFont(f);
  textAlign(CENTER);
  fill(#3DA4BC);
  text("Tradition Walker!", width * 0.5, height * 0.1);
}
