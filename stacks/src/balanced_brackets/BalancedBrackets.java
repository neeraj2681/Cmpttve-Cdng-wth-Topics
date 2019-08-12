package balanced_brackets;

import java.util.*; // importing utility package

class BalancedBrackets{

    static Integer isBalanced(String s) { // static method to find whether the given string is balanced or not
        ArrayDeque<Character> brackets = new ArrayDeque<>(); //stack to store the open brackets
        ArrayDeque<Integer> position = new ArrayDeque<>(); //stack to store the position of brackets

        for(int j=0; j<s.length(); j++){ //traversing through the string
            if(s.charAt(j)=='(' || s.charAt(j)=='{' || s.charAt(j)=='['){ // if the character is an open bracket of any type i.e. ( or { or [ 
                brackets.offerLast(s.charAt(j)); // push the bracket at top of the stack called bracket
                position.offerLast(j+1); // push the position of the bracket at top of the stack called position
                continue; // continue to next iteration of the loop without going any furthur
            }


            if(!brackets.isEmpty()){ // if the stack containing brackets is empty
                if(s.charAt(j)==')' || s.charAt(j)=='}' || s.charAt(j)==']'){ //if the character at current position is a closing bracket i.e. ) or } or ]
                    if((brackets.peekLast()=='(' && s.charAt(j)==')') || (brackets.peekLast()=='{' && s.charAt(j)=='}') || (brackets.peekLast()=='[' && s.charAt(j)==']')){ // if the character at current position is the closing bracket for bracket at the top of bracket stack
                        position.pollLast(); // remove the element at the top of stack containing positions
                        brackets.pollLast(); // remove the element at the top of stack containing brackets
                    }
                    else 
                    {
                        position.offerLast(j+1); //push the position of the closing bracket to the top of stack containing positions.
                        break; // break out of the for loop (because the string isn't balanced)
                    }
                }
            }

            else
            {
                if(s.charAt(j)==')' || s.charAt(j)=='}' || s.charAt(j)==']'){ // if the current character is a closing bracket
                    position.offerLast(j+1); // push the positing of current bracket at the top of the stack
                    break; // break out of the for loop
                }
            }

        }

            if(position.isEmpty()) // if the position stack is empty
                return 0; 
            else
                return position.pollLast(); //returns the element at the top of the position stack


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            String s = in.next(); // input string
            Integer ans = isBalanced(s); // ans-> contains the value returned by isBalanced Method
            if(ans==0)
                System.out.println("Success");
            else
                System.out.println(ans); // prints the position of the unbalanced bracket

            in.close();
        }

}

