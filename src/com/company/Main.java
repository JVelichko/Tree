package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tree<String, Integer> tree = new Tree<>();
        tree.add("", "root", 5);
        tree.add("root", "number1", 3);
        tree.add("root", "number2", 4);
        tree.add("root/number2", "number3", 7);
        System.out.println();
        System.out.println();
        tree.delete("root", "number2");
        tree.delete("", "root");
    }
}