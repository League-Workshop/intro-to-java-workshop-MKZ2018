int ballX;
int ballY;
int ballX = speed = 50;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
int ellipse;
void setup() {
  size(500,500);
  background(141,300,200);
  minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
PImage backgroundImage;
backgroundImage = loadImage("adorable cat photo.jpg");
}


void draw(){
  fill(0,300,200);
  stroke(40,80,90);
  ellipse(150,110,40,50);
  if(ellipse==height) {
  sound.trigger();
  }
}
  
  
  
  
  
  
  