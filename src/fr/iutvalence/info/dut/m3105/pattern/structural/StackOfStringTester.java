package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester {
	
	private Stack<String> chambre;

	public StackOfStringTester(Stack<String> stack) {
		this.chambre = stack;
	}

	public void testStack() {
		System.out.println(this.chambre.size());
		this.chambre.push("a");
		System.out.println(this.chambre.size());
		this.chambre.push("b");
		System.out.println(this.chambre.size());
		System.out.println(this.chambre.peek());
		System.out.println(this.chambre.size());
		System.out.println(this.chambre.pop());
		System.out.println(this.chambre.size());
		System.out.println(this.chambre.pop());
		System.out.println(this.chambre.size());
		
	}

}
