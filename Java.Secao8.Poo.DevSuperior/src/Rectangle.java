public class Rectangle {

    private Double width;
    private Double height;

    public Rectangle(){

    }

    public Rectangle(Double width, Double height){
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    //methods

    public double area(){
        return getWidth() * getHeight();
    }

    public double perimeter(){
        return getWidth() + getWidth() + getHeight() + getHeight();
    }

    public double diagonal(){
        return Math.sqrt(getWidth() * getWidth() + getHeight() * getHeight());
    }

}
