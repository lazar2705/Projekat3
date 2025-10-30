

public class GameObject {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    public GameObject(int x, int y, int width, int height) {
        if (width < 0) {
            System.out.println("Width ne smije biti manji od nule");
            width = 0;
        }
        if (height < 0) {
            System.out.println("Height ne smije biti manji od nule");
            height = 0;
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public boolean intersects(GameObject other) {
        return this.x < other.x + other.width &&
               this.x + this.width > other.x &&
               this.y < other.y + other.height &&
               this.y + this.height > other.y;
    }

    @Override
    public String toString() {
        return "GameObject @ (" + x + "," + y + ") " + width + "x" + height;
    }
}