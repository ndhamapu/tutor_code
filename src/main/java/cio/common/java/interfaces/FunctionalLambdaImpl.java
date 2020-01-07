package cio.common.java.interfaces;

public class FunctionalLambdaImpl {

	public static SimpleFunctionAdd<Integer, Double,Double> addImpl = (Integer i, Double d) -> { return  d + new Double (i); };
	
	
	
	 public static Double executeLambda(Integer f, Double s) {
	 
	 return addImpl.addTheTwo(f, s); 
	 }
	
	public static void main(String[] args) 
	{
		Integer x = 1;
		Double y= 2.0;
		FunctionalLambdaImpl.executeLambda(x,y);
	}
}
