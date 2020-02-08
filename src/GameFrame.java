import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private Game game;
    public GameFrame() throws HeadlessException {
        super();
    }

    public GameFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public GameFrame(String title) throws HeadlessException {
        super(title);
    }

    public GameFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
}
