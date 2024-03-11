package my.Learning;

public class Calculator {
	
		private int first,second;
		 
		public void setFirst(int first)
		{
		this.first=first;
		}
		 
		public void setSecond(int second)
		{
		this.second=second;
		}
		// This is a comment 
		public int addition()
		{
		return (first+second);
		}
		 
		public int minus()
		{
		return (first-second);
		}
		 
		public int multiply()
		{
		return (first*second);
		}
		 
		public float divide()
		{
		return (first/second);
		System.out.println("Printed");
		}
		}


