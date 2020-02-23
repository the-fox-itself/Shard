package GameMechanic;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import static GameMechanic.MainVariables.*;

public class MainMechanic {
    void preparation() {
        mainFrame.setSize(1040, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(true);
        mainFrame.setLayout(null);
        DPanel dPanel = new DPanel();
        setComponentOnFrame(mainFrame, dPanel, null, 0, 0, 2000, 2000);

        textNumbers.setEditable(false);
        textNumbers.setOpaque(true);
        textNumbers.setBackground(new Color(0x535252));
        textNumbers.setForeground(new Color(0xE7D5D5D5, true));
        setComponentOnFrame(mainFrame, textNumbers, f15, 0, 0, 40, 500);

        textCode.setCaretColor(new Color(0xFFFFFF));
        textCode.setOpaque(true);
        textCode.setBackground(new Color(0x121111));
        textCode.setForeground(new Color(0xE7FFFFFF, true));
        setComponentOnFrame(mainFrame, textCode, f15, 40, 0, 1000, 500);

        menuStart();
        visTrue(mainFrame);

        textCode.addKeyListener(new FrameKeyListener());
        mainFrame.addKeyListener(new FrameKeyListener());
        mainFrame.addMouseListener(new FrameMouseListener());
        mainFrame.addMouseWheelListener(new FrameMouseWheelListener());
        mainFrame.addMouseMotionListener(new FrameMouseMotionListener());
    }

    void menuStart() {
        visTrue(textNumbers);
        visTrue(textCode);
    }

    private class FrameKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            Runnable runnable = () -> {
                switch (e.getKeyChar()) {
                    case '\b':
                        try {
                            Thread.sleep(1);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        int i2 = textCode.getLineCount()+1;
                        textNumbers.setText(" 1   |");
                        if (i2 > 1) {
                            for (int f = 2; f < i2; f++) {
                                if (f < 10)
                                    textNumbers.setText(textNumbers.getText() + "\n " + f + "   |");
                                else
                                    textNumbers.setText(textNumbers.getText() + "\n " + f + " |");
                            }
                        }
                        break;
                    case '\n':
                        try {
                            Thread.sleep(1);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        int i1 = textCode.getLineCount();
                        textNumbers.setText(" 1   |");
                        if (i1 > 1) {
                            for (int f = 2; f < i1 + 1; f++) {
                                if (f < 10)
                                    textNumbers.setText(textNumbers.getText() + "\n " + f + "   |");
                                else
                                    textNumbers.setText(textNumbers.getText() + "\n " + f + " |");
                            }
                        }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    private class FrameMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    private class FrameMouseWheelListener implements MouseWheelListener {
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }
    }

    private class FrameMouseMotionListener implements MouseMotionListener {
        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }
}
