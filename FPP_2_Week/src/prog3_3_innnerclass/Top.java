package prog3_3_innnerclass;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	
	public Top () {
		mid = new Middle();
		midbot = new Middle().new Bottom();
	}

	int readBottom() {
		// implement
		
		return midbot.b;
	}

	class Middle {
		int m = 2;

		int addTopAndBottom() {
			// implement
			return t;
		}

		class Bottom   {
			int b = 3;

			int multiplyAllThree() {
				// implement
				return t + mid.m + b;
			}
		}
	}

	public static void main(String[] args) {
		Top top = new Top();
		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());
	}
}