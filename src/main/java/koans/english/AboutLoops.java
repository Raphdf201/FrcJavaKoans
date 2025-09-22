package koans.english;

public class AboutLoops {
    /**
     * # First loop
     * 
     * Write a method named 'helloNTimes' which has an integer parameter 'times' and displays 'Hello' in the console 'times' times.
     * 
     * ---------   TIPS   --------------
     * 
     * To do things multiple times in Java, you can use the 'while' loop.
     * A while loop looks a lot like an if condition, except it will execute its block of code again and again while the condition stays true. Ex:
     * 
     *     int times = 3;
     *     while (times > 0) {
     *         // It will take 3 executions of this block of code before the condition becomes false.
     *         // So Java will execute it 3 times, and then move on to the rest of the code.
     *         System.out.println("Still executing");
     *         // We can modify the value of an existing variable. We take advantage of this capability here.
     *         times = times -1;
     *     }
     * 
     * Note 3: like of the 'if', within the curly brackets of a 'while', you can write any code, including other 'while' and 'if' !.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * helloNTimes(2) should display:
     * 
     * Hello
     * Hello
     * 
     */


     /**
     * # Printing where we are in a loop
     * 
     * Write a method named 'displayNumbers' with an integer parameter 'n', which displays numbers between 1 and n.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * displayNumbers(3) should display:
     * 
     * 1
     * 2
     * 3
     * 
     */


     /**
     * # Counting in reverse
     * 
     * Write a method named 'displayReverseNumbers' with an integer parameter 'n', which displays numbers between 1 and n in reverse order.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * displayReverseNumbers(3) should display:
     * 
     * 3
     * 2
     * 1
     * 
     */


     /**
     * # Multiples of 7
     * 
     * Write a method named 'sevens' with 1 integer parameter 'n', which displays all multiples of 7 between 1 and n.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * sevens(30) should display:
     * 
     * 7
     * 14
     * 21
     * 28
     * 
     */


     /**
     * # Multiples of 7 or 8
     * 
     * Write a method named 'sevensOrEights' with 1 integer parameter 'n', which displays all multiples of 7 or 8 between 1 and n.
     * 
     * ---------   TIPS   --------------
     * 
     * Reuse the 'isMultiple' method in the AboutMoreMethods class. To reuse a method in an other class, write the class name, then a '.', before calling the method. Ex:
     * 
     *     AboutConsoleAndVariables.sayHelloInConsole();  // Will display 'Hello!' in the console
     *                  ^          ^          ^
     *             class name     dot     method call
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * sevensOrEights(20) should display:
     * 
     * 7
     * 8
     * 14
     * 16
     * 
     */
}
