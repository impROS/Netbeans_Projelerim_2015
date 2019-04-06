
package final4;
public class Final4 {
    public static void main(String[] args) {
        Point p=new Point(-8,-5);
        Point q=new Point(-3,-3);
        p.translateXY(7, 7);
        System.out.println("p :"+p.toString());
        q.translateXY(9, 8);
        System.out.println("q :"+q.toString());
        q=p;
        p.setXY(-2, -2);
        System.out.println("p :"+p);
        System.out.println("q :"+q);
        q=new Point(-8,-3);
        System.out.println("p.equals(q) :"+p.equals(q));
        System.out.println(p.mirorY());
        System.out.println(q.scaleXY(2));
    }
    
}
