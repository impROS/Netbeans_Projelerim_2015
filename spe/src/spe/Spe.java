
package spe;
import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
class spe
{
  public static void main(String args[]) throws IOException{
long start = System.currentTimeMillis();
    File file= new File("p1.png");
    BufferedImage image = ImageIO.read(file);
 int width = image.getWidth(null);
    int height = image.getHeight(null);
int[][] clr=  new int[width][height];
File files= new File("p2.png");
    BufferedImage images = ImageIO.read(files);
 int widthe = images.getWidth(null);
    int heighte = images.getHeight(null);
int[][] clre=  new int[widthe][heighte];
int smw=0;
int smh=0;
int p=0;
//CALUCLATING THE SMALLEST VALUE AMONG WIDTH AND HEIGHT
if(width>widthe){ smw =widthe;}
else {smw=width;}
if(height>heighte){smh=heighte;}
else {smh=height;}
//CHECKING NUMBER OF PIXELS SIMILARITY
for(int a=0;a<smw;a++){
for(int b=0;b<smh;b++){
clre[a][b]=images.getRGB(a,b);
clr[a][b]=image.getRGB(a,b);
if(clr[a][b]==clre[a][b]) {p=p+1;}
}}

float w,h=0;
if(width>widthe) {w=width;}
else {w=widthe;}
if(height>heighte){ h = height;}
else{h = heighte;}
float s = (smw*smh);
//CALUCLATING PERCENTAGE
float x =(100*p)/s;

System.out.println("THE PERCENTAGE SIMILARITY IS APPROXIMATELY ="+x+"%");
long stop = System.currentTimeMillis();
System.out.println("TIME TAKEN IS ="+(stop-start));
  }
}