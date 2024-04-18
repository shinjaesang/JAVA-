package test;

public class Circle2Array {

	public static void main(String[] args) {
		Circle2 [] c;
		c= new Circle2[5];
		
		for (int i = 0; i<c.length;i++)
			c[i] = new Circle2(i);
		
		for(int i = 0; i < c.length; i++)
			System.out.print((int)(c[i].getArea()));
		
	}

}
