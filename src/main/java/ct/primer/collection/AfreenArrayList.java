package ct.primer.collection;

import java.util.*;

class AfreenArrayList
{   
        
    public static void main(String[] ar)
    {   Scanner in=new Scanner(System.in);
        String name;
        
        ArrayList<String> stringList=new ArrayList<String>();
        
        Iterator itr;
        System.out.println("enter the total number of names ");
        int n=in.nextInt();
        System.out.println("enter names ");
        for(int i=0;i<n;i++)
        {   
            name=in.next();
            //to prevent duplication
            if(!stringList.contains(name))
                stringList.add(name);
            //count++;
            
        }//for
        // for sorting
        Collections.sort(stringList);
        itr=stringList.iterator();
        int index=0;
            while(itr.hasNext())
        {
            String str1=(String)itr.next();
            System.out.println("Name="+str1);
        }//for

    }//main

}//myArray
