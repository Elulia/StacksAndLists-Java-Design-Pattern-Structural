package fr.iutvalence.info.dut.m3105.pattern.structural;

public class Main
{

	public static void main(String[] args)
	{
		List<String> liste = new ArrayList<String>();
		Stack<String> liste2 = new ListAdapter(liste);
		new StackOfStringTester(liste2).testStack();
	}

}
