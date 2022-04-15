package item.service;

import java.sql.Connection;
import java.util.List;

import item.dao.ItemDAO;
import item.dto.ItemDTO;

import static item.dao.JdbcUtil.*;

public class ItemListService {
	public List<ItemDTO> listAll() {
		
		Connection con = getConnection();
		ItemDAO dao = new ItemDAO(con); //디비 연결
		
		List<ItemDTO> list = dao.getList();
		
		close(con);
		
		return list;
	}
}
