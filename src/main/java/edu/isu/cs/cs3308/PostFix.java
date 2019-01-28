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
     * @param infix A string representing an postfix notation expression where
     * each item is separated by a space.
     * @return value of the postfix express or 0 if the postfix expression is null,
     * empty, or contains only whitespace.
     */
    public static int evalPostFix(String infix) {

        if(infix == null)
        {
            return 0;
        }
        else
        {
            LinkedStack<String> stringStack = new LinkedStack<String>();


            //Found a source on how to make a for loop on this found at:
            //https://www.tutorialspoint.com/java/java_string_split.htm
            for(String portion: infix.split(""))
            {
                stringStack.push(portion);
            } stringStack.reverse();

            boolean firstCall = true;
            while(stringStack.size() > 1)
            {
                String tempString;

                tempString = stringStack.pop();

                if(IsInt(tempString))
                {
                    String tempStringTwo;
                    int firstNum = Integer.parseInt(tempString);

                    tempStringTwo = stringStack.pop();
                    if(IsInt(tempStringTwo))
                    {
                        String tempStringThree = stringStack.pop();
                        int secNum = Integer.parseInt(tempStringTwo);

                        if(IsInt(tempStringThree))
                        {
                            if(firstCall)
                            {

                            }
                            else
                            {
                                int thiNum = Integer.parseInt(tempStringThree);
                                String tempStringFour = stringStack.pop();

                            }
                        }
                        else
                        {
                            stringStack.push(evalutae(firstNum,secNum, tempStringThree) + "");
                        }
                    }
                    else
                    {
                        //Do nothing. Illegal opporation.
                    }
                }
                else
                {
                    //Do nothing. It's an illegal argument.
                }
            }




            return Integer.parseInt(stringStack.pop());
        }


    }

    public static boolean IsInt(String input)
    {
        try
        {
            Integer.parseInt(input);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public static int evalutae(int one, int two, String operation)
    {
        int result = 0;

        if (operation.equals("-"))
        {

            result = one - two;
        }
        else if(operation.equals("*"))
        {
            result = one * two;
        }
        else if(operation.equals("/"))
        {
            result = one / two;
        }
        else if(operation.equals("%"))
        {
            result = one % two;
        }

        return result;
    }
}
