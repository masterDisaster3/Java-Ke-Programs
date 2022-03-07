public class Interfaces{

	public static void main(String[] args){

		Shape plain = new Square(4);
		System.out.println(plain.getArea());

		Shape plate = new Circle(5.0f);
		System.out.println(plate.getArea());

	}
}

abstract class Shape{
	abstract float getArea();
}

interface Parallelogram {
	float getPerimeter();
}



class Square extends Shape implements Parallelogram{
	public int s ;
	public Square(int s){ this.s = s;}
	float getArea(){ return this.s * this.s;}
	@Override
	float getPerimeter(){return 4 * this.s;}
}

class Circle extends Shape {
	float radius;
	public Circle(float r){ this.radius = r;}
	float getArea(){return 3.14f * radius * radius; }
}


