package database;
import java.sql.*;
import java.util.Scanner;

public class ConnectToDB {

	public static void main(String[] args) {
		
		Connection c = null;
				try{
					Class.forName("org.sqlite.JDBC");
					c = DriverManager.getConnection("jdbc:sqlite:info.db");
					System.out.println("Connected successfully.\n");
					
					// Add users
					System.out.println("Press 1 to add new user.");
					System.out.println("Press 2 to show all users in database.");
					Scanner reader = new Scanner(System.in);
					int processIndex = reader.nextInt();
					switch (processIndex) {
					case 1:
						Scanner UsernameInput = new Scanner(System.in);
						Scanner PasswordInput = new Scanner(System.in);
						System.out.println("Enter username: ");
						String user_name = UsernameInput.nextLine();
						System.out.println("Enter password: ");
						String password = PasswordInput.nextLine();
						String SQLAdd="insert into admins(user_name,password) values('"+user_name+"','"+password+"')";
						Statement stmt=c.createStatement();
						stmt.executeUpdate(SQLAdd);
						c.commit(); // Add // Delete // Update
						System.out.println("New user is added.");
						stmt.close();
						c.close();
						break;
					case  2:
						// Show all users from database
						Statement stmt2=c.createStatement();
						String SqlRead = "select * from admins";
						ResultSet rs = stmt2.executeQuery(SqlRead);
						System.out.println("ID\tUSERNAME\tPASSWORD");
						while(rs.next()){
							int id = rs.getInt("id");
							String UserNameRead = rs.getString("user_name");
							String PasswordRead = rs.getString("password");
							System.out.println(id +"\t"+ UserNameRead+ "\t" + PasswordRead);
						}
						rs.close();
						stmt2.close();
						c.close();
						break;
					}
					}
						
				catch(Exception ex){
					System.out.println("Cannot connect");
					System.exit(0);
						
					}
					
					

				


	}

}
