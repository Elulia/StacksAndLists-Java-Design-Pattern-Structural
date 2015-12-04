package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<T> implements Stack<T> {
	
	private T[] araye;
	private int index;
	
	
	public ArrayStack(){
		this.araye = (T[]) new Object[10];
		this.index = -1;
	}

	@Override
	public void push(T toPush) {
		this.index++;
		this.araye[this.index]=toPush;
		
	}

	@Override
	public T pop() {
		this.index--;
		return this.araye[this.index+1];
	}

	@Override
	public T peek() {
		return this.araye[this.index];
	}

	@Override
	public int size() {
		return this.index+1;
	}

}
