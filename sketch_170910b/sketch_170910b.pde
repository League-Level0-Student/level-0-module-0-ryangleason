void setup(){
  size(800, 500);
PImage face= loadImage ("kim jong un.png");
image (face, 0, 0);
PImage nuke= loadImage ("nuke.png");

nuke.resize (150, 100);
image (nuke, 661, 86);
}

void draw(){
  if(mousePressed){
    println("mouseX:" + mouseX);
    println("mouseY:" + mouseY);
  
  }
 
  fill(mouseX, mouseY, 10); 
  ellipse (435, 130, 15, 15);
  ellipse (482, 107, 15, 15);
  fill(0);
  ellipse (435, 130, 5, 5);
  ellipse (482, 107, 5, 5);
  ellipse (487, 165, 30, 30);
  
  
}
