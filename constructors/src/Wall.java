public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(5,4);
    }

    //constructors set using setters
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    //getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //method
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall();
        Wall blueWall= new Wall(6,2);
        System.out.println(wall.getArea());
        System.out.println(blueWall.getArea());


    }
}
