package my.Learning;

public class Computer {
	
	private Cpu cpu;
	private Monitor monitor;
	public Computer(Cpu cpu, Monitor monitor) {
		super();
		this.cpu = cpu;
		this.monitor = monitor;
	}
	public Cpu getCpu() {
		return cpu;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	
	

}
