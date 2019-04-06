
package hiddencast;

public class HiddenCast {

    public static void main(String[] args) {
int i = 123456;
		short x = 0;
		x += i;
		System.out.println(x);

		byte b = 0;
		b += i;
		System.out.println(b);

		float f = 0;
		double d = 10.123456789;
		f += d;
		System.out.println(f);
	}
}