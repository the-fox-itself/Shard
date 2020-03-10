package Compilation;

import Syntax.Classes.Class;
import Syntax.Classes.Command_Line;
import Syntax.Methods.Method;

import java.util.ArrayList;
import java.util.Arrays;

import static GameMechanic.MainVariables.*;

public class Compilation {
    public void compilation() {
        System.out.println(ANSI_GREEN+"Компиляция программы..."+ANSI_RESET);
        listOfLines = new ArrayList<>();
        listOfLines.addAll(Arrays.asList(textCode.getText().split("\n"))); //Присваем переменной listOfLines массив комманд, разделленных знаком "\n".
        for (String eachCommand : listOfLines) { //Делаем следующие действия с каждой коммандой
            listOfWords = new ArrayList<>();
            for (String eachWord : eachCommand.split(" ")) { //Присваеваем переменной listOfWords массив слов в данной комманде, разделенных знаком " ".
                if (!eachWord.equals("") && !eachWord.equals(" ")) {
                    listOfWords.add(eachWord);
                }
            }
            nowCompilation = null;
            for (String word : listOfWords) {
                isMistakeClass = false;
                isMistakeMethod = false;
                if (nowCompilation == null) {
                    isMistakeClass = true;
                    for (Class c : listOfClasses) {
                        if (word.toLowerCase().equals(c.name)) {
                            nowCompilation = c;
                            isMistakeClass = false;
                        }
                    }
                } else {
                    isMistakeMethod = true;
                    for (Method method : nowCompilation.listOfMethods) {
                        if (word.toLowerCase().equals(method.name)) {
                            method.method();
                            isMistakeMethod = false;
                        }
                    }
                }
                if (word.toLowerCase().equals("#")) {
                    String comment = "";
                    for (int x = listOfWords.indexOf(word)+1; x < listOfWords.size(); x++) {
                        if (!comment.equals("")) {
                            comment = comment + " " + listOfWords.get(x);
                        } else {
                            comment = comment+listOfWords.get(x);
                        }
                    }
                    System.out.println("Строка №" + (listOfLines.indexOf(eachCommand) + 1) + " содержит комментарий: " + comment);
                    break;
                } else {
                    if (isMistakeClass || isMistakeMethod) {
                        System.out.println(ANSI_RED+"Ошибка:\nСтрока №" + (listOfLines.indexOf(eachCommand) + 1) + ": " + ANSI_RESET + word + ANSI_RED + " не является командой!" + ANSI_RESET);
                    }
                }
            }
        }
        String reason = "Конец программы.";
        System.out.println(ANSI_GREEN+"Компиляция прошла успешно!"+ANSI_RESET);
        System.out.println(ANSI_GREEN+"Завершение программы..."+ANSI_RESET);
        System.out.println(ANSI_GREEN+"Программа завершена успешно! Причина завершения: " + ANSI_RED+reason + ANSI_RESET);
        System.out.println();
    }
}
