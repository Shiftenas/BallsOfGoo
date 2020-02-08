import java.awt.*;

public class BlackBall extends GUIComponent implements Ball {
    private boolean locked = false;
    private Color color;

    public BlackBall(int x, int y) {
        super(x, y, 40, 40);
        color = new Color(0, 0, 0);
    }
    @Override
    public void onPlace() {
        locked = true;
    }

    public boolean canMove() {
        return !locked;
    }
}
