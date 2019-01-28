package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.structures.impl.LinkedStack;

/**
 * Postfix expression evaluator.
 *
 * @author Isaac Griffith
 */
public class PostFix {

    /**
     * Evaluates the provided postfix expression and returns the answer. If the
     * provided string is null, empty, or only contains whitespace then return
     * 0;
     *
     * @param postfix A string representing an postfix notation expression where
     * each item is separated by a space.
     * @return value of the postfix express or 0 if the postfix expression is null,
     * empty, or contains only whitespace.
     */
    public static int evalPostFix(String infix) {

        if(infix == null)
        {
            //Do nothing
        }
        else
        {
            LinkedStack<String> stringStack = new LinkedStack<String>();


            //Found a source on how to make a for loop on this found at:
            //https://www.tutorialspoint.com/java/java_string_split.htm
            for(String portion: infix.split(""))
            {
                stringStack.push(portion);
            }

            




        }
    }
}
