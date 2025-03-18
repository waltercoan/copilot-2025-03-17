package br.com.kasolution.exercicio9;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(new GamePanel());
        pack();
        setLocationRelativeTo(null);
    }
}