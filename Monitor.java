package my.Learning;

public class Monitor {
	
	private int height;
	private int breadth;
	private Resolution resolution;
	public Monitor(int height, int breadth, my.Learning.Resolution resolution) {
		super();
		this.height = height;
		this.breadth = breadth;
		this.resolution = resolution;
	}
	
	
	public int getHeight() {
		return height;
		System.out.println("This is Madhan");
	}
	public int getBreadth() {
		return breadth;
	}
	public Resolution getResolution() {
		return resolution;
	}

	
}
