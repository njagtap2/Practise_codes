/*Given an expression string exp, write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example,
the program should print true for exp = “[()]{}{[()()]()}” and false for exp = “[(])”*/

import java.util.Scanner;
import java.util.Stack;

public class MatchingBracesDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Input: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		Boolean popOutput = false;
		char[] ClosingBraces = new char[input.length()];

		Stack myStack = new Stack();
		char[] stringChars = input.toCharArray();
		//push the starting braces in to the stack and pop it if it is closing braces. 
		//If popped braces is not matching one, return false.
		
		for (char each : stringChars) {
			if (each == '[' || each == '(' || each == '{') {
				myStack.push(each);
			}

			if (each == ']') {
				if (myStack.isEmpty() == true) {
					break;
				}
				else if ((char) myStack.pop() == '[')
					popOutput = true;
			}

			else if (each == '}') {
				if (myStack.isEmpty() == true) {
					break;
				} else if ((char) myStack.pop() == '{')
					popOutput = true;
			}

			else if (each == ')') {
				if (myStack.isEmpty() == true)
					break;
				else if ((char) myStack.pop() == '(')
					popOutput = true;
			}
		}
		if (popOutput == true) {
			System.out.println("Balanced string");
		} else
			System.out.println("Not balanced tree");
	}

}
