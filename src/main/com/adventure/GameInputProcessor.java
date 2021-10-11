package main.com.adventure;

import main.com.adventure.settings.Command;
import main.com.adventure.settings.CommandVerb;
import main.com.adventure.settings.EmptyCommandException;
import main.com.adventure.settings.InvalidCommandException;

import java.util.Scanner;

public class GameInputProcessor {

    /**
     * Starts the prompt process to the user.
     * @return the response from the user.
     */


    public String prompt() {
        System.out.println("Enter your next command:");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        return userInput;
    }

    /**
     * Inputs that come into this method represent single action with no object. When building the command, you'll want
     * to supply the first word as the verb and leave the objectName blank
     * @param input - the input from the user
     * @return - the Command object with the proper verb and blank object
     */
    private Command buildSimpleCommand(String input) {
        String[] splitInput = input.split(" ");
        try {
            return new Command(CommandVerb.getVerb(splitInput[0]));
        } catch (InvalidCommandException e) {
            System.out.println("Invalid Command");
        } catch (EmptyCommandException e) {
            System.out.println("Invalid Command");
        }
        return null;
    }


    /**
     * Inputs that come into this method will have an object or objects that the action is acting on. You'll need to
     * include the object as part of the Command object.
     * @param input - the input from the user
     */
    private Command buildCommandWithObject(String input) {
        String[] splitInput = input.split(" ");
        try {
            return new Command(CommandVerb.getVerb(splitInput[0]), splitInput[1]);
        } catch (InvalidCommandException e) {
            System.out.println("Invalid Command");
        } catch (EmptyCommandException e) {
            System.out.println("Invalid Command");
        }
        return null;
    }


    /** DO NOT CHANGE ANYTHING BELOW THIS LINE. **/

    /**
     * Gets the next command from the user.
     * @return a command object
     */
    public Command getNextCommand() {
        String input = prompt();
        return processCommand(input);
    }

    private Command processCommand(String input) {
        if (input.contains(Command.MOVE) ||
                input.contains(Command.USE) ||
                input.contains(Command.TAKE) ||
                input.contains(Command.EXAMINE)
        ) {
            return buildCommandWithObject(input);

        } else {
            return buildSimpleCommand(input);
        }
    }

}
