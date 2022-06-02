public class Point<T> {
    private T x, y;
    private Integer s;

    public Integer getS() {
        return s;
    }

    public void setS(Integer s) {
        this.s = s;
    }

    public T getX() {return x;}
    public T getY() {return y;}

    public void setX(T nx) {x = nx;}
    public void setY(T ny) {y = ny;}

    // Eksempel, bruk:
    public static void main(String[] args) {
        Double dx = 50.0, dy = 50.5;
        // the object
        Point<Double> doublePoint = new Point<Double>();
        doublePoint.setX(dx);
        doublePoint.setY(dy);

        System.out.printf("X: %s, Y: %s\n",
                doublePoint.getX(), doublePoint.getY());
        // Skriver ut: X: 50.0, Y: 50.5
    }
}
