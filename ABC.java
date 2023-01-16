package college;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class College
{

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws IOException, SQLException {
		
		{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("1.INSERT INTO TABLE");
			System.out.println("2.UPDATE IN TABLE");
			System.out.println("3.READ FROM TABLE");
			System.out.println("4.DELETE FROM TABLE");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:

			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			PreparedStatement ps=con.prepareStatement("insert into College values(?,?,?,?)"); 
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
			do{ 
			System.out.println("Enter block number brand:"); 
			int b_number=br.nextInt(); ; 
			System.out.println("Enter floor number:"); 
			int f_number=br.nextInt(); 
			 
			System.out.println("Enter faculty name:"); 
			String t_name=br.readLine();
			System.out.println("Enter subject name:"); 
			String sub_name=br.readLine()); 
			ps.setString(1,b_number); 
			ps.setString(2,f_number);
			ps.setString(3,t_name);
			ps.setFloat(4,c_name); 
			int i = 0;
			try {
				i = ps.executeUpdate();
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println(i+" records affected");
			System.out.println("Do you want to continue: y/n"); 
			String s=br.readLine(); 
			if(s.startsWith("n")){ 
				break; 
			}
			}while(true);
			
			break;

			case 2:
				Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");	
				BufferedReader br2=new BufferedReader(new InputStreamReader(System.in)); 
				PreparedStatement ps1=con2.prepareStatement("UPDATE College set t_name=? where c_name=?");
				System.out.println("Enter new name of subject:");
				String c_name=br2.readLine(); 
				
				ps1.setString(1, c_name);
				ps1.executeUpdate();
				System.out.println("Values updated");
			break;
			case 3:
				Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");	
				PreparedStatement pstmt1 = con4.prepareStatement("Select * from College");
				
				ResultSet rs= pstmt1.executeQuery();
						ResultSetMetaData md = rs.getMetaData();
				  int columns = md.getColumnCount();
				  ArrayList list = new ArrayList(50);
				  while (rs.next()){
				     HashMap row = new HashMap(columns);
				     for(int i=1; i<=columns; ++i){           
				      row.put(md.getColumnName(i),
				    		  rs.getObject(i));
				     }
				      list.add(row);
				      System.out.println(row);
				  }
				
			case 4:
				
				Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");	
				BufferedReader br3=new BufferedReader(new InputStreamReader(System.in)); 
				PreparedStatement ps2=con3.prepareStatement("delete from College  where t_name=?");
				System.out.println("Enter the teacher's name you want to delete");
				String brand=br3.readLine(); 
			
					ps2.setString(1,t_name);
					ps2.executeUpdate();
					System.out.println("Deletion complete");
			
				break;
			

				 //System.out.println(list);
				
		}
		} 
		catch (NumberFormatException e)
		{
			
			e.printStackTrace();
		}	
		
}
	
	

}
}