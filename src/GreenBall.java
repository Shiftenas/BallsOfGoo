import java.awt.*;

public class GreenBall extends GUIComponent implements Ball {
    private Color color;
    public GreenBall(int x, int y) {
        super(x, y, 40, 40);
        this.color = new Color(36, 110, 14);
    }
    @Override
    public void onPlace() {

    }

    public boolean canMove() {
        return true;
    }
}
