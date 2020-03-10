package GameMechanic;

import Syntax.Classes.Class;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class MainVariables {
    public static ArrayList<String> listOfLines = new ArrayList<>();
    public static ArrayList<String> listOfWords = new ArrayList<>();

    public static ArrayList<Class> listOfClasses = new ArrayList<>();

    public static Class nowCompilation;
    public static boolean isMistakeClass;
    public static boolean isMistakeMethod;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    final static JFrame mainFrame = new JFrame();

    final static JButton buttonRun = new JButton("Пуск");

    final static JTextArea textNumbers = new JTextArea(" 1   |\n 2   |\n 3   |");
    public final static JTextArea textCode = new JTextArea(" # Впишите сюда текст программы\n \n ");


    final static int widthOfScreen = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    final static int heightOfScreen = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    final static Font f90 = new Font("", Font.BOLD, 90);
    final static Font f80 = new Font("", Font.BOLD, 80);
    final static Font f70 = new Font("", Font.BOLD, 70);
    final static Font f60 = new Font("", Font.BOLD, 60);
    final static Font f50 = new Font("", Font.BOLD, 50);
    final static Font f45 = new Font("", Font.BOLD, 45);
    final static Font f40 = new Font("", Font.BOLD, 40);
    final static Font f35 = new Font("", Font.BOLD, 35);
    final static Font f32 = new Font("", Font.BOLD, 32);
    final static Font f30 = new Font("", Font.BOLD, 30);
    final static Font f25 = new Font("", Font.BOLD, 25);
    final static Font f20 = new Font("", Font.BOLD, 20);
    final static Font f15 = new Font("CourierNew", 0, 15);

    static void visTrue(Component component) {
        component.setVisible(true);
    }
    static void visFalse(Component component) {
        component.setVisible(false);
    }
    static void setComponentOnFrame(JFrame frame, Component component, Font font, int x, int y, int width, int height) {
        frame.add(component);
        component.setBounds(x, y, width, height);
        component.setFont(font);
        visFalse(component);
    }
}
