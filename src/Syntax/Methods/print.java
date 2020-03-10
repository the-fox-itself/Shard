package Syntax.Methods;

import java.util.ArrayList;
import java.util.Arrays;

import static GameMechanic.MainVariables.listOfWords;

public class print extends Method {
    public print() {
        name = "вывод";
    }

    @Override
    public void method() {
        for (int f = 2; f < listOfWords.size(); f++) {
            ArrayList<String> list = new ArrayList<>(Arrays.asList(listOfWords.get(f).split("")));
            if (list.indexOf(")") != -1 && list.indexOf("(") != -1) {
                if (!listOfWords.get(f).equals("()")) {
                    System.out.print(listOfWords.get(f).split("\\(")[1].split("\\)")[0]);
                    break;
                } else {
                    System.out.print("");
                }
            } else if (list.indexOf("(") != -1) {
                if (!listOfWords.get(f).equals("(")) {
                    System.out.print(listOfWords.get(f).split("\\(")[1]);
                } else {
                    System.out.print("");
                }
            } else if (list.indexOf(")") != -1) {
                if (!listOfWords.get(f).equals(")")) {
                    System.out.print(listOfWords.get(f).split("\\)")[0]);
                    break;
                } else {
                    System.out.print("");
                }
            } else {
                System.out.print(listOfWords.get(f));
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
