package test;

public class MethodOverridingEx {
	static void paint(Shape p) { //Shape p = 업케스팅 되는 부분
		p.draw();
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle1());

	}

}
