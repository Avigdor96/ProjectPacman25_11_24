package Graphic;

import Players.Pacman;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        GamePanel gamePanel = new GamePanel();
        this.setLayout(new BorderLayout());
        TopPanel topPanel = new TopPanel(gamePanel.pacman);
        BottomPanel bottomPanel = new BottomPanel(gamePanel.pacman);
        bottomPanel.setPreferredSize(new Dimension(0, 50));
        this.add(topPanel, BorderLayout.NORTH);
        this.add(gamePanel, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);
        gamePanel.setVisible(true);
        gamePanel.setDoubleBuffered(true);
        this.setSize(715, 920);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setVisible(true);
    }
}
