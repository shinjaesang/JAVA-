package test;

public class CircleExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;
        pizza=new Circle();
        pizza.radius=10;
        pizza.name="Pizza";
        double area=pizza.getArea();
        System.out.println(pizza.name  + "의 면적은" + area);

        Circle donut = new Circle();
        donut.radius=2;
        donut.name="자바도넛";
        area=donut.getArea();
        System.out.println(donut.name +"의 면적은" + area);
    }
}


