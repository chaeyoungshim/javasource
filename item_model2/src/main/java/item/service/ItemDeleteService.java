package item.service;

import java.sql.Connection;

import item.dao.ItemDAO;

import static item.dao.JdbcUtil.*;

public class ItemDeleteService {
	public boolean deleteItem(int num) {
		
		Connection con = getConnection();
		ItemDAO dao = new ItemDAO(con);
		
		boolean result = dao.delete(num);
		
		if(result) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return result;
	}
}
