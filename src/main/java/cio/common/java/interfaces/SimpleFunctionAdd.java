package cio.common.java.interfaces;
/**
 * This is a functional Interface 
 * @author nikhil
 *
 */
@FunctionalInterface
public interface SimpleFunctionAdd<F,S,R>
{
	R addTheTwo(F f, S s);
	
}