package Graphic;

import Players.Bluish;
import Players.Pacman;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BottomPanel extends JPanel {
    private ImageIcon heartIcon;
    private Pacman pacman;
    private JLabel bottomLabel;


    public BottomPanel(Pacman pacman) {
        this.pacman = pacman;
        heartIcon = new ImageIcon("Pictures/Heart.jpg");
        JLabel jLabel = new JLabel(heartIcon);
        JLabel jLabel1 = new JLabel(heartIcon);
        JLabel jLabel2 = new JLabel(heartIcon);
        }
    }


