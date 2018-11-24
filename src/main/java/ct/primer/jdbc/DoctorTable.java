package ct.primer.jdbc;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;




/**
 * Write a description of class DoctorTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoctorTable extends JFrame 
{
    JTable table;

    
    DoctorTable() {
 
    DoctorJDBC DJ = new DoctorJDBC();
    Object[][] data = DJ.getDoctorData();
    String[] columnNames = {"Number", "Name", "Salary"};
    JTable table = new JTable(data, columnNames);
    JScrollPane scrollPane = new JScrollPane(table);
    add(scrollPane);
      
      

    }
    
    public static void main(String args[]) {
        DoctorTable dt = new DoctorTable();
        dt.setSize(400, 300);
        dt.setVisible(true);
    }
}
