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
					System.out.println("Select function"
										+ "\n--------------------"
										+ "\n1 for adding user."
										+ "\n2 for viewing all users."
										+ "\n3 for deleting user."
										+ "\n4 for updating password");
					
					Statement stmt=c.createStatement();
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
						
						stmt.executeUpdate(SQLAdd);
						c.commit(); // Add // Delete // Update
						System.out.println("New user is added.");
						stmt.close();
						c.close();
						break;
					case  2:
						// Show all users from database
						String SqlRead = "select * from admins";
						ResultSet rs = stmt.executeQuery(SqlRead);
						System.out.println("ID\tUSERNAME\tPASSWORD");
						while(rs.next()){
							int id = rs.getInt("id");
							String UserNameRead = rs.getString("user_name");
							String PasswordRead = rs.getString("password");
							System.out.println(id +"\t"+ UserNameRead+ "\t" + PasswordRead);
						}
						rs.close();
						stmt.close();
						c.close();
						break;
					case 3:
						// Delete user
						Scanner IdInput = new Scanner(System.in);
						System.out.println("Enter user ID: ");
						int id = IdInput.nextInt();
						String SQLDelete = "delete from admins where id="+id;
						
						stmt.executeUpdate(SQLDelete);
						stmt.close();
						c.commit();
						c.close();
						System.out.println("User is deleted.");
						break;
					case 4:
						// Update password
						Scanner IdUpdate = new Scanner(System.in);
						Scanner PasswordUpdate = new Scanner(System.in);
						System.out.println("Enter ID: ");
						int IdUp = IdUpdate.nextInt();
						System.out.println("Enter new password: ");
						String PasswordUp = PasswordUpdate.nextLine();
						String SQLupdate = "UPDATE admins set password='"+PasswordUp+"'"
						+"where id="+IdUp;
						
						stmt.executeUpdate(SQLupdate);
						stmt.close();
						c.commit();
						c.close();
						System.out.println("User password is updated.");
						break;
					}
					}
						
				catch(Exception ex){
					System.out.println("Cannot connect");
					System.exit(0);
						
					}
					
					

				


	}

}
