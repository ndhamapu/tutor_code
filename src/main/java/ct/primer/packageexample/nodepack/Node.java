//Compile in following way from one dir up
// javac -cp . nodepack/Node.java

package ct.primer.packageexample.nodepack;

public class Node
{
	public int i;
	public Node nd;	

	public Node(int m, Node nd1)
	{
		i=m;
		nd=nd1;
	}
}
