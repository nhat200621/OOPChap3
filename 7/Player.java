public class Player {
    private String name;
    private float x, y;
    public Player(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public String getName() {
        return name;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void kick(Ball ball, float xDest, float yDest) {
        System.out.printf("%s kicks the ball to (%.2f, %.2f)\n", name, xDest, yDest);
        ball.setX(xDest);
        ball.setY(yDest);
    }
    public String toString() {
        return String.format("Player %s at (%.2f, %.2f)", name, x, y);
    }
}

