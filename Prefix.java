/** CPSC 331 HW2 Part 2 - Q2
    Shawna McKay
    #30051244
    Program evaluates the result of a Prefix Equation using recursion
**/

import java.util.*;

public class Prefix{


public static int evaluate(Scanner sc) {
    //Checks if the scanner is empty
    if(!sc.hasNext()){
      return 0;
    }
    //Returns an integer if the scanner is a number
    if (sc.hasNextInt()) {
        return sc.nextInt();
    }
    else {
        String operator = sc.next();
        //Recursive calls to evaluate the left and right operands
        int op1 = evaluate(sc);
        int op2 = evaluate(sc);

        if (operator.equals("+")) {
            return op1 + op2;
        } else if (operator.equals("-")) {
            return op1 - op2;
        } else if (operator.equals("*")) {
            return op1 * op2;
        } else if (operator.equals("/")) {
            return op1 / op2;
        }
        return 0;
    }
}

public static void main(String[] args) {
  Prefix p = new Prefix();
  Scanner sc = new Scanner("+ 2 5 - * 3 6");
  System.out.println(p.evaluate(sc));
}


}
