package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			con = DriverManager.getConnection(url, user, password);
			if(con!=null) {
				String sql = "insert into exam_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) ";
				sql += "values(7209,'Test_USER9','MANAGER',7201,'2016-03-10',1400,NULL,80)";
				
				pstmt = con.prepareStatement(sql);
				
				// insert,update,delete
				int result = pstmt.executeUpdate();
				
				if(result>0) {
					System.out.println("삽입 성공");
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











