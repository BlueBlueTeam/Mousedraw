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

public class Mouse_Draw extends PApplet {

public void setup()
{
  
  surface.setResizable(true);
  background(255);
  fill(255);
  
}

int colorSet, colorSet1, colorSet2 = 0;

public void draw()
{
  if(width < 400 && height < 300)
  {
    surface.setSize(500,400);
  }
  stroke(0);
  fill(colorSet,colorSet1,colorSet2);
  rect(0,0,50,50);
  if(mousePressed && (mouseButton == LEFT))
  {
    noStroke();
    fill(colorSet,colorSet1,colorSet2);
    ellipse(mouseX,mouseY,10,10);
  }
  else if(mousePressed && (mouseButton == RIGHT))
  {
    noStroke();
    fill(255);
    ellipse(mouseX,mouseY,20,20);
  }
  if(keyPressed)
  {
    if(key == 'z') //Reset
    {
      background(255);
    }
    else if(key == 'x') //Color R
    {
      colorSet ++;
    }
    else if(key == 'c') //Color G
    {
      colorSet1 ++;
    }
    else if(key == 'v') //Color B
    {
      colorSet2 ++;
    }
    if(colorSet == 255)
    {
      colorSet = 0;
    }
    if(colorSet1 == 255)
    {
      colorSet1 = 0;
    }
    if(colorSet2 == 255)
    {
      colorSet2 = 0;
    }
  }
}

  public void settings() {  size(800,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Mouse_Draw" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
