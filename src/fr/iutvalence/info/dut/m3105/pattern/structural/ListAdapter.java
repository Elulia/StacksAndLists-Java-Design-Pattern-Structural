package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ListAdapter<T> implements Stack<T>{
	List<T> liste;
	
	public ListAdapter(List<T> liste){
		this.liste=liste;
	}

	@Override
	public void push(T toPush) {
		this.liste.add(this.liste.size(), toPush);	
	}

	@Override
	public T pop() {
		return this.liste.remove(this.liste.size()-1);
	}

	@Override
	public T peek() {
		return this.liste.get(this.liste.size()-1);
	}

	@Override
	public int size() {
		return this.liste.size();
	}
	
}
