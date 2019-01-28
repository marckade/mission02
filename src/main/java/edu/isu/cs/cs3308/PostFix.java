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

        // If the input is null or the trimmed string is white space.
        if(infix == null || infix.trim().isEmpty())
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

            // Boolean is needed to see if this is the first call.
            boolean firstCall = true;
            while(stringStack.size() > 1)
            {
                //Create tempstring and make it equal to the first pop.
                String tempString;

                tempString = stringStack.pop();

                //If its possible to parse it, continue.
                if(IsInt(tempString))
                {
                    //Create tempstring and make it equal to the second pop.
                    String tempStringTwo;
                    int firstNum = Integer.parseInt(tempString);

                    tempStringTwo = stringStack.pop();

                    //If its possible to parse it.
                    if(IsInt(tempStringTwo))
                    {
                        String tempStringThree = stringStack.pop();
                        int secNum = Integer.parseInt(tempStringTwo);

                        // If its possible to parse.
                        if(IsInt(tempStringThree))
                        {
                            if(firstCall)
                            {
                                //Do nothing, illegal arg.
                            }
                            else
                            {
                                int thiNum = Integer.parseInt(tempStringThree);
                                String tempStringFour = stringStack.pop();

                                stringStack.push(evalutae(secNum,thiNum,tempStringFour) + "");
                                stringStack.push(tempString);

                            }
                        }
                        else
                        {
                            stringStack.push(evalutae(firstNum,secNum, tempStringThree) + "");
                            firstCall = false;
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

    //This method will attempt to parse the string and will return the result of the attempt.
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

    //This method will look at the non-int string and check with opporator the user is putting in. 
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
