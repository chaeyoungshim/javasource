package board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data  //allargs 빼고 다 만들어줌
public class SearchDTO {
	private String criteria;
	private String keyword;
	
	//페이지 나누기 추가
	private int page; //현재 페이지 번호
	private int amount; //한 페이지당 보여줄 게시물 개수
	
	public SearchDTO(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}
}
