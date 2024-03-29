class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle (String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString (){
        return "Triangle [base= " + base + ",heigth=" + height + "," + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}