package api;


public class StringCount {

	public static void main(String[] args) {
		String str1 = "aabbccAABBCCaa";
		
		int cnt=count(str1,"aa",0);
		System.out.println("원본 문자열에 aa 패턴이 "+cnt+" 개 나왔습니다.");

	}
	public static int count(String src,String key,int pos) {
		//key에 해당하는 패턴이 몇번 나왔는가?
		int count = 0;
		int index = 0;
		
		if(key == null || key.length() == 0) {
			return -1;
		}
		
		while((index = src.indexOf(key, pos))!=-1) {
			count++;
			pos = index+key.length();
		}
		return count;		
		
	}

}











