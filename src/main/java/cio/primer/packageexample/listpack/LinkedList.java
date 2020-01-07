//Compile & run in following way from one dir up
// javac -cp . Listpack/LinkedList.java
// java -cp . Listpack/LinkedList 10 20 30 40 50

package cio.primer.packageexample.listpack;

import java.io.IOException;

import cio.primer.packageexample.nodepack.Node;


public class LinkedList
{

	Node headNode, nd, lastNode;

	void createList(String ar[ ])
	{
		int n,j;
		n=ar.length;
		
		System.out.println("Enter the number:");
		for(int i=n-1;i>=0;i--)
		{
			
			
			j=Integer.parseInt(ar[i]);
			if(i==(n-1))
			{
				lastNode = new Node(j,null);
			}
			else
			{	
				nd = new Node(j,lastNode);
				lastNode = nd;
			}
		}
		headNode = nd;
	}


	void display()
	{
		while(headNode != null)
		{
			System.out.println("The integer data member od this node is :" + headNode.i);
			headNode=headNode.nd;
		}
	}
	public static void main(String args[ ]) throws IOException
	{
		
		LinkedList l = new LinkedList();

		l.createList(args);
		l.display();

		
	}
	
}