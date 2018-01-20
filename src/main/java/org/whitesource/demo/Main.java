package org.whitesource.demo;

/**
 * @author tom.shapira
 */
public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        String input = args[0];
        System.out.println("You've entered the following text: " + input);
    }

}
