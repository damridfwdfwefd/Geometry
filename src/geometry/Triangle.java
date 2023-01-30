package geometry;

public class Triangle extends Shape {
    double h;
    double base;
@Override
public double area (){
    return base * h/2;
}

}
