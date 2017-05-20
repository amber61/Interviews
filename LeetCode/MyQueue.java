package leetcode;

import java.util.Stack;

/**
 * Implement the following operations of a queue using stacks.
 * 
 * push(x) -- Push element x to the back of queue. pop() -- Removes the element
 * from in front of queue. peek() -- Get the front element. empty() -- Return
 * whether the queue is empty. Notes: You must use only standard operations of a
 * stack -- which means only push to top, peek/pop from top, size, and is empty
 * operations are valid. Depending on your language, stack may not be supported
 * natively. You may simulate a stack by using a list or deque (double-ended
 * queue), as long as you use only standard operations of a stack. You may
 * assume that all operations are valid (for example, no pop or peek operations
 * will be called on an empty queue).
 *
 */
public class MyQueue {

	Stack<Integer> myStack = null;

	/** Initialize your data structure here. */
	public MyQueue() {
		myStack = new Stack<Integer>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		myStack.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		int size = myStack.size();
		if (size != 0) {
			Stack<Integer> temp = new Stack<Integer>();
			for (int i = 0; i < size; i++) {
				temp.push(myStack.pop());
			}
			int popNum = temp.pop();
			for (int i = 0; i < size - 1; i++) {
				myStack.push(temp.pop());
			}
			return popNum;
		}
		return 0;
	}

	/** Get the front element. */
	public int peek() {
		int size = myStack.size();
		if (size != 0) {
			Stack<Integer> temp = new Stack<Integer>();
			for (int i = 0; i < size; i++) {
				temp.push(myStack.pop());
			}
			int popNum = temp.peek();
			for (int i = 0; i < size; i++) {
				myStack.push(temp.pop());
			}
			return popNum;
		}
		return 0;
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return myStack.empty();
	}
}
