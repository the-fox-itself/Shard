package Syntax.Classes;

import Syntax.Methods.input;
import Syntax.Methods.print;

public class Command_Line extends Class {
    public Command_Line() {
        name = "командная_строка";
        print print = new print();
        input input = new input();
        listOfMethods.add(print);
        listOfMethods.add(input);
    }
}
