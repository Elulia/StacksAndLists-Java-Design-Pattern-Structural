package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<T> implements List<T>{
	
	private int size;
	private T[] liste;
	
	public ArrayList(){
		this.size=0;
		this.liste = (T[]) new Object[10];
	}

	@Override
	public void add(int yo, T ya) {
		decalageADroite(yo);
		this.liste[yo]=ya;

	}

	@Override
	public T remove(int yo) {
		T yop = this.liste[yo];
		decalageAGauche(yo);
		return yop;
	}

	private void decalageAGauche(int yo) {
		for(int i=yo; i<this.size ;i++){
			this.liste[i]=this.liste[i+1];
		}
		this.size--;
	}

	private void decalageADroite(int yo) {
		for(int i=this.size; i<yo ;i--){
			this.liste[i+1]=this.liste[i];
		}	
		this.size++;
	}
	
	@Override
	public T get(int yo) {
		return this.liste[yo];
	}

	@Override
	public int size() {
		return this.size;
	}

}
