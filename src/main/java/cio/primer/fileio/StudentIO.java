package cio.primer.fileio;

/**
 * Write a description of class CricPlayerIO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;


public class StudentIO
{
    String name;
    int roll_no,numberOfSub; 
    float per;
    String[] subject;
    int[] marks;
    int i;
    StudentIO(String nam,int no,int nosub)
    {
      name=nam;
      roll_no=no;
      numberOfSub=nosub;
      
    }
   
    
    void display(PrintWriter outputStream)
    {
       
        outputStream.println("name of student "+name+" roll number "+roll_no+"number of subject "+numberOfSub);
     for(i=0;i<numberOfSub;i++)
     {
        outputStream.println("subject name ="+subject[i]+ " marks= " +marks[i]);
        }
    }
    
    public static void main(String args[ ]) throws IOException
         {
        //BufferedReader in = new BufferedReader( new InputStreamReader (System.in)); 
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {

        inputStream = new BufferedReader(new FileReader("studentIn.txt"));
        outputStream = new PrintWriter(new FileWriter("studentOut.txt"));
        

        String delims = " ";
        String strline1;
        String[] tokens;
        
        
        
        StudentIO myStudent[];
        myStudent = new StudentIO[10];


        for(int i=0; i<2; i++)
        {
            System.out.println(" Enter Student_name Roll_number number_of_subject");
            strline1 = inputStream.readLine();
            tokens = strline1.split(delims);
            System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2]);
            int number_of_subject=Integer.parseInt(tokens[2]);
            myStudent[i] = new StudentIO(tokens[0], Integer.parseInt(tokens[1]), number_of_subject);
            System.out.println("Give the " + number_of_subject+" subject name=");
            strline1 = inputStream.readLine();
            tokens = strline1.split(delims);
            myStudent[i].subject = new String[number_of_subject];
        
            for(int j=0;j<number_of_subject;j++)
            {
             myStudent[i].subject[j]= new String(tokens[j]);
             }
             
            System.out.println("Give the" +number_of_subject+" marks =");
            strline1 = inputStream.readLine();
            tokens = strline1.split(delims);
            System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2]);
            myStudent[i].marks = new int[number_of_subject];
        
            for(int j=0;j<number_of_subject;j++)
            {
             myStudent[i].marks[j]= Integer.parseInt(tokens[j]);
             } 
        }
        for(int i=0;i<2;i++)
        {
            //System.out.println("I am in Display loop");
            myStudent[i].display(outputStream);
          }
        }
        catch (IOException ie) {
        }
        finally{
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
     }          
        
}
