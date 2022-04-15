package item.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.dto.ItemDTO;
import item.service.ItemListService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ItemListAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//값 가져오기 => 여기서는 넘긴게 없어서 가져올 값이 없음
		
		//디비 작업 => 서비스 호출해서 하기
		ItemListService service = new ItemListService();
		List<ItemDTO> list = service.listAll(); //똑같은 타입으로 변수에 담기
		
		//페이지 이동, 공유해야 함
		request.setAttribute("list", list);
		
		return new ActionForward(path, false);
	}

}
