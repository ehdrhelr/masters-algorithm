package cs10_week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj1076 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> resistance = new ArrayList<>();

        resistance.add("black");
        resistance.add("brown");
        resistance.add("red");
        resistance.add("orange");
        resistance.add("yellow");
        resistance.add("green");
        resistance.add("blue");
        resistance.add("violet");
        resistance.add("grey");
        resistance.add("white");

        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();

        int firstNum = resistance.indexOf(first);
        int secondNum = resistance.indexOf(second);
        String multiNum = "";
        for (int i = 0; i < resistance.indexOf(third); i++) {
            multiNum += "0";
        }

        String result = "" + firstNum + secondNum + multiNum;
        Long resultInt = Long.parseLong(result);
        System.out.println(resultInt);
    }
}
