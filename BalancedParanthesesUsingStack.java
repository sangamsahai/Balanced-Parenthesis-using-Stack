import java.util.Stack;

/*This application checks if a given input string is a set of balanced parentheses or not.
 This application uses Stack data structure for its computation.
 * @author - sangam sahai
 * */

public class BalancedParanthesesUsingStack {

	static Stack stack=new Stack();
	static String str=null;
	static char[] str_char_array=null;


	public static boolean checkBalancedParantheses() throws Exception
	{
		//to check for empty string
		if(str.equals(""))
		{
			throw new Exception("Input String is Null !!");
		}
		str_char_array=str.toCharArray();//converting string to character Array

		for(int i=0;i<str_char_array.length;i++)
		{

			try {
				if((str_char_array[i]=='(') || (str_char_array[i]=='{') || (str_char_array[i]=='['))
				{
					stack.push(str_char_array[i]);
				}	



				if((str_char_array[i]==')') && ((Character)stack.peek()=='(')){ stack.pop();}

				if((str_char_array[i]=='}') && ((Character)stack.peek()=='{')){ stack.pop();}

				if((str_char_array[i]==']') && ((Character)stack.peek()=='[')){ stack.pop();}



			} catch (Exception e) {
				// TODO Auto-generated catch block

				return false;
				//If the stack is empty and a peek is attempted , then exception is encountered. This will only happen 
				// for non balanced parenthesis. Hence returning true
			}
		}
		if(stack.empty()==true) return true;
		else
			return false;
	}

	public static void main(String[] args) throws Exception {
		str="(){}";//This value can be had as input from the user

		boolean result=checkBalancedParantheses();
		System.out.println(result);
	}


}
