package task.seventh;

public class Dress {
    private String color;
    private char size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public Dress(String color, char size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dress{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
