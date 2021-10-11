package main.com.adventure.settings;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;


    /**
     * Takes a users input and determines which verb to include in the command.
     *
     * @param verbString - the users input.
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) throws InvalidCommandException, EmptyCommandException {
        if (verbString == null) {
            throw new EmptyCommandException();
        }
        CommandVerb action;
        switch (verbString.toUpperCase()) {
            case "TAKE":
                //return TAKE;
                action = TAKE;
                break;
            case "MOVE":
                //return MOVE;
                action = MOVE;
                break;
            case "USE":
                //return USE;
                action = USE;
                break;
            case "DIG":
                //return DIG;
                action = DIG;
                break;
            case "EXAMINE":
                // return EXAMINE;
                action = EXAMINE;
                break;
            case "LOOK":
                // return LOOK;
                action = LOOK;
                break;
            case "HELP":
                // return HELP;
                action = HELP;
                break;
            case "FIGHT":
                //  return FIGHT;
                action = FIGHT;
                break;
            case "INVENTORY":
                //  return INVENTORY;
                action = INVENTORY;
                break;
            default:
                throw new InvalidCommandException();
        }
        return action;
    }
}
