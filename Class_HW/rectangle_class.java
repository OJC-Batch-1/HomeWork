public class rectangle_class
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(4,5);
        System.out.println("Area = "+rect.Area()+"\nPerimeter = "+rect.getPerimeter());
    }
}
class Rectangle{
    int a,b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int Area(){
        return a*b;
    }
    public int getPerimeter(){
        return 2*(a+b);
    }
    
}