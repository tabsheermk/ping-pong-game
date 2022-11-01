import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {
	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack(); // resizes the frame according to contents I guess
		this.setVisible(true);
		this.setLocationRelativeTo(null); // makes the frame appear in the middle when run
	}
}
