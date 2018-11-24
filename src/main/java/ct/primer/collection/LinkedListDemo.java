package ct.primer.collection;
import java.util.*;
/**
 * Write a description of class LinkedListDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Node
{
	int i;
	Node nd;	

	Node(int m, Node nd1)
	{
		i=m;
		nd=nd1;
	}
	
}
public class LinkedListDemo
{
    Node headNode, lastNode, tempNode;
    LinkedListDemo(){
        headNode = null;
        lastNode = null;
    }
    
    Node getHeadNode(){
        return headNode;
    }
    void addNode(int nn){
        if(headNode == null)
        {
            headNode = new Node(nn, null);
            lastNode = headNode;
        }
        else {
            tempNode = lastNode;
            lastNode = new Node(nn, null);
            tempNode.nd = lastNode;
        }
    }
    static LinkedListDemo  union(LinkedListDemo LL1, LinkedListDemo LL2){
        LinkedListDemo unionList = new LinkedListDemo();
        //copy from first list to unionlist
        Node lheadNode = LL1.getHeadNode();
        //System.out.println("The Node data inside=" + lheadNode.i);
        while(lheadNode != null) {
            unionList.addNode(lheadNode.i);
            //System.out.println("The Node data inside=" + lheadNode.i);
            lheadNode=lheadNode.nd;
        }
        
        //copy from second list to unionlist
        lheadNode = LL2.getHeadNode();
        Node tempNode1;
        while(lheadNode != null) {
            // search new list for above data
            tempNode1 = unionList.getHeadNode();
            int found = -1;
            while(tempNode1 != null) {
                if(tempNode1.i == lheadNode.i){
                    found++;
                }
                tempNode1=tempNode1.nd;
            }
            if(found == -1){
                unionList.addNode(lheadNode.i);
                //System.out.println("The Node data inside=" + lheadNode.i);
            }
            lheadNode=lheadNode.nd;
        }
        return unionList;
    }
    static LinkedListDemo  intersection(LinkedListDemo LL1, LinkedListDemo LL2){
        LinkedListDemo intersectionList = new LinkedListDemo();

        
        //Check for common element and copy that to new list
        Node lheadNode = LL1.getHeadNode();
        Node tempNode1;
        while(lheadNode != null) {
            // search new list for above data
            tempNode1 = LL2.getHeadNode();
            int found = -1;
            while(tempNode1 != null) {
                if(tempNode1.i == lheadNode.i){
                    found++;
                }
                tempNode1=tempNode1.nd;
            }
            if(found != -1){
                intersectionList.addNode(lheadNode.i);
                //System.out.println("The Node data inside=" + lheadNode.i);
            }
            lheadNode=lheadNode.nd;
        }
        return intersectionList;
    }
    void display(){
        Node localHNode = headNode;
        while(localHNode != null)
		{
			System.out.println("The Node data is :" + localHNode.i);
			localHNode=localHNode.nd;
		}
    }
    public static void main(String args[]) {
      // create a linked list
      LinkedListDemo l1 = new LinkedListDemo();
      l1.addNode(20);
      l1.addNode(41);
      l1.addNode(53);
      l1.addNode(18);
      System.out.println("The Node data for l1:");
      l1.display();
      
      LinkedListDemo l2 = new LinkedListDemo();
      l2.addNode(15);
      l2.addNode(41);
      l2.addNode(53);
      l2.addNode(87);
      System.out.println("The Node data for l2:");
      l2.display();
      
      // Union
      LinkedListDemo l3 = union(l1, l2);
      System.out.println("The Node data after Union:");
      l3.display();
      
      // Intersection
      LinkedListDemo l4 = intersection(l1, l2);
      System.out.println("The Node data after Intersection:");
      l4.display();
    }
}
