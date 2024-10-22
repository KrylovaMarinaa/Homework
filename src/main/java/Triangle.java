class Triangle implements Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2; // полупериметр
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getSpecifications() {
        return  "Треугольник:\n" +
                "Периметр: " + perimeter() + "\n" +
                "Площадь: " + area() + "\n" +
                "Цвет фона: " + getFillColor() + "\n" +
                "Цвет границ: " + getBorderColor();
    }
}