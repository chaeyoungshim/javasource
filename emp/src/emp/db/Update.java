package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con= DriverManager.getConnection(url, user, password);
			if(con!=null) {
				String sql = "update exam_emp set deptno=80 where empno=7202";
				
				pstmt = con.prepareStatement(sql);
				
				int result = pstmt.executeUpdate();
				
				if(result>0) {
					System.out.println("업데이트 성공");
				}
				
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
	}

}
