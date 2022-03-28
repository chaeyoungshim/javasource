package api;


public class Member {
	private String id;

	public Member(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// id가 같으면 true
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			
			if(id.equals(member.id)) {
				return true;
			}
		}		
		
		return false;
	}
	
	@Override
	public String toString() {
		
		return "id = "+id;
	}
	
}















