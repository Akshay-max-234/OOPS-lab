public class Square
{
    double side;
    void getData(double s)
    {
        side=s;
        
    }
    double calArea()
    {
        return side*side;
    }
    public static void main(String[] args) {
        Square r = new Square();
        r.getData(44);
        System.out.println("Area of Square="+r.calArea());
    }
}