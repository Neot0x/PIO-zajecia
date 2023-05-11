package rectangle_exercise;

public class Rectangle {
    
    private double width;
    private double height;
    
    public Rectangle(){
        this(2.0, 2.0);
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return this.width * this.height;
    }
    
    public double getPeri(){
        return 2 * (this.width + this.height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
