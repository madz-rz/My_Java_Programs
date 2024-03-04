package my.Learning;

public class Cpu {
private int processor;
private int memory;
public Cpu(int processor, int memory) {
	super();
	this.processor = processor;
	this.memory = memory;
}
public int getProcessor() {
	return processor;
}
public int getMemory() {
	return memory;
}
public void calculateMemory()
{
	System.out.println("function is called from outside as well as from inside");
}

}
