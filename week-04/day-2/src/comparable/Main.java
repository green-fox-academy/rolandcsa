package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);
        System.out.println(dominoes);

        List<ToDo> toDoList = new ArrayList<>();
        toDoList.add(new ToDo("washing", false));
        toDoList.add(new ToDo("cleaning", true));
        toDoList.add(new ToDo("cooking", false));
        toDoList.add(new ToDo("reading", false));
        toDoList.add(new ToDo("eating", true));
        toDoList.add(new ToDo("do sports", false));
        toDoList.add(new ToDo("sleeping", true));
        toDoList.add(new ToDo("programming", true));
        toDoList.add(new ToDo("playing darts", false));
        toDoList.add(new ToDo("playing table tennis", true));
        toDoList.add(new ToDo("playing chess", false));


        Collections.sort(toDoList);
        System.out.println(toDoList);
    }
}

