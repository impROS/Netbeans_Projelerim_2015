package final4;
public class Point {
   private int x,y;
   public static Point ORIGIN =new Point(0,0);
   public Point(int x,int y){
   this.x=x;
   this.y=y;
   }
   public boolean equals(Object object){
   if(object == this) return true;
   if(!(object instanceof Point)) return false;
   Point that =(Point)object;
   return(this.x== that.x && this.y==that.y);    
   }
   public void setXY(int x,int y){
   this.x=x;
   this.y=y;
   }
   public Point aynalaX(){
   return new Point(x,-y);
   }
   public void translateXY(int dx,int dy){
   x=x+dx;
   y=y+dy;
   }
   public Point mirorY(){
   return new Point(-x,y);
   }
   public Point mirrorX(){
   return new Point(-x,-y);
   }
   public Point scaleXY(int a){
   return new Point(a*x,a*y);
   }
   public String toString(){
   return new String(" ("+(float)x + ","+(float)y+") ");
   }
}//son
