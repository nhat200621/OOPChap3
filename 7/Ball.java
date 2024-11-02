public class Ball {
    private float x, y;
    public Ball(float x, float y) {
        this.x = x;
        this.y = y;
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
    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }
    public String toString() {
        return String.format("Ball at (%.2f, %.2f)", x, y);
    }
}

