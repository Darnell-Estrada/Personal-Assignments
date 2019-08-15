public class Rectangle{
    private double width;
    private double length;

    public Rectangle(double wid, double len){
        width = wid;
        length = len;
    }

    public void setWidth(double wid){
        width = wid;
    }

    public void setLength(double len){
        length = len;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return width * length;
    }
}