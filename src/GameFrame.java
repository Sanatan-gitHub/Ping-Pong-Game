import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{

    GamePanel panel;

    GameFrame(){
        panel = new GamePanel();
        this.add(panel);//add panel to frame
        this.setTitle("Pong Game");//font name
        this.setResizable(false);//sixe fixed
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//allow exit button
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);//for using pack panel can adjusted to resolve the problem
    }
}
