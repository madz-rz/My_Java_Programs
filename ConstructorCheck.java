package my.Learning;

public class ConstructorCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cpu cpu = new Cpu(5,9);
		Resolution resolution = new Resolution(7,7);
		Monitor monitor = new Monitor(10,9,resolution);
		
		cpu.calculateMemory();
		monitor.getResolution();
		Computer computer = new Computer(cpu,monitor);
		computer.getMonitor().getResolution();
		computer.getCpu().calculateMemory();
	}

}
