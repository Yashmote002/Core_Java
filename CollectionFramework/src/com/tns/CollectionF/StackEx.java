package com.tns.CollectionF;
//Code for all operations of Stack
import java.util.*;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		//Adding element in stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        //Accessing
        System.out.println("Initial Stack"+st);
        
        //Accessing peek/top element 
        System.out.println("The top element of stack is :"+st.peek());
        
        // Removing element from stack
        System.out.println("Popped element "+st.pop());
        System.out.println("Popped element "+st.pop());
        
//        checking stack is empty ??
        boolean check=st.empty();
        System.out.println("The Stack is empty ?? "+check);
        
        
        System.out.println("The top element of stack is :"+st.peek());
	}

}
