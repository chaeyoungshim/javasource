package item.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.service.ItemDeleteService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ItemDeleteAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//값 가져오기
		int num = Integer.parseInt(request.getParameter("num"));
		
		//디비 작업 => 서비스
		ItemDeleteService service = new ItemDeleteService();
		
		//페이지 이동
		if(!service.deleteItem(num)) {
			path = "/delete.jsp";
		}
		
		return new ActionForward(path, true);
	}

}
