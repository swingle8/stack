/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		QueueUsingStack queue = new QueueUsingStack();
		int [] arr = {-1, 2, 3, 5, -1, 6, 9, -1};
		
		for (int i = 0 ; i < arr.length ; i++) {
		    int val = arr[i];
		    if (val == -1)
		        System.out.println(queue.deQueue());
		    else
		        queue.enQueue(val);
		}
	}
}

class QueueUsingStack {
   Stack<Integer> st1 = new Stack<Integer>();
   Stack<Integer> st2 = new Stack<Integer>();
	
	public void enQueue (int value) {
	        st1.push(value);
	}
	
	public int deQueue () {
	        if (st2.isEmpty() && st1.isEmpty())
	            return -9;
	        if (st2.isEmpty()) {
	            while (! st1.isEmpty()) {
	                int stack1Val = st1.pop();
	                st2.push(stack1Val);
	            }
	            return st2.pop();
	        }

	       return st2.pop();
	}
	
	
}


