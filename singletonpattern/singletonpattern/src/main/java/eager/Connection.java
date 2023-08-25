package eager;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	private static Connection instance=new Connection();
	private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=your_database_name";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";
	private Connection() {
		try {
            // Đăng ký lớp Driver (chỉ cần thực hiện một lần)
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // Lấy kết nối từ DriverManager
            java.sql.Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
           
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy lớp Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getInstance() {
		return instance;
	};
	
	
}
