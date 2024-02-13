package Pieces;

import main.Board;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Piece {

    public int col, row;
    public int x, y;

    public boolean isWhite;
    public String name;
    public int value;

    public boolean isFirstMove = true;

    BufferedImage sheet;

    {
        try {
            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("plx.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    protected int sheetScale = sheet.getWidth()/6;

    Image sprite;
    Board board;

    public Piece(Board board){
        this.board = board;
    }
    public boolean isValidMovement(int col, int row) {
        return true;
    }

    public boolean moveColidesWithPiece(int col, int row) {
        return false;
    }

    public void paint(Graphics2D g2d) {
        g2d.drawImage(sprite, x, y, null);
    }
}