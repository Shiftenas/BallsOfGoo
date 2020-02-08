import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private Game game;

    public GameFrame(String title) throws HeadlessException {
        super(title);
        this.game = new Game();
    }
}
