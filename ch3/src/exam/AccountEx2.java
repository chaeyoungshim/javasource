package exam;

import java.util.Scanner;

public class AccountEx2 {

	//멤버변수
	private static Account2[] accountArray = new Account2[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택 >> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo==1) {
				//계좌생성
				createAccount();
			}else if(selectNo==2) {
				//계좌목록 보기
				accountList();
			}else if (selectNo==3) {
				//입금
				deposit();
			}else if (selectNo==4) {
				//출금
				withdraw();
			}else if (selectNo==5) {
				//종료
				run = false;
			}			
		}
	}//main end
	
	//계좌생성
	private static void createAccount() {
		//ano,owner,balance 입력받기
		System.out.print("계좌번호 >> ");
		String ano = sc.nextLine();
		System.out.print("계좌주 >> ");
		String owner = sc.nextLine();
		System.out.print("잔액 >> ");
		int balance = Integer.parseInt(sc.nextLine());
		
		//Account2 객체 생성
		//Account2 account = new Account2(ano, owner, balance);
		//배열에 담아주기
		//accountArray[0] = account;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account2(ano, owner, balance);
				System.out.println("계좌 생성 완료");
				break;
			}
		}		
	}
	
	
	//계좌목록
	private static void accountList() {
		// 지금까지 생성된 모든 계좌목록 보여주기
		
//		--------------------------
//		계좌번호   계좌주   잔액
//		--------------------------
//		110-11     홍길동   200000
//		110-22     성춘향   100000
		
		System.out.println("-------------------------------");
		System.out.println("계좌번호   계좌주   잔액");
		System.out.println("-------------------------------");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				System.out.printf("%s\t%s\t%d\n",
						accountArray[i].getAno(),
						accountArray[i].getOwner(),
						accountArray[i].getBalance());
			}
		}		
	}
	//예금
	private static void deposit() {
		//계좌번호 입력 받기
		System.out.print("계좌번호 >> ");
		String ano = sc.nextLine();
		
		//입금액 입력 받기
		System.out.print("입금액 >> ");
		int amount = Integer.parseInt(sc.nextLine());		
		
		//입력받은 계좌번호가 배열에 들어 있는 지 확인
		Account2 account=findAccount(ano);
		
		//account가 널이 아니면 입금 처리
		if(account!=null) {
			//잔액 = 잔액+예금액
			//account.balance = account.balance + amount;
			account.setBalance(amount+account.getBalance());
		}else {
			System.out.println("계좌번호 확인");
		}
	}
	private static void withdraw() {
		//출금
		//계좌번호 입력 받기
		System.out.print("계좌번호 >> ");
		String ano = sc.nextLine();
		
		//출금액 입력 받기
		System.out.print("출금액 >> ");
		int amount = Integer.parseInt(sc.nextLine());		
		
		//입력받은 계좌번호가 배열에 들어 있는 지 확인
		Account2 account=findAccount(ano);
		
		//account가 널이 아니면 입금 처리
		if(account!=null) {
			//잔액 = 잔액-예금액
			//account.balance = account.balance + amount;
			if(account.getBalance() >= amount) {
				account.setBalance(account.getBalance()-amount);				
			}else {
				System.out.println("잔액 부족");
			}
		}else {
			System.out.println("계좌번호 확인");
		}
		
	}
	private static Account2 findAccount(String ano) {
		//Account2 배열에서 ano와 동일한 Account2 찾기
		
		//for문 
		for(int i=0;i<accountArray.length;i++) {
			//if(null 아닌 경우만)
			if(accountArray[i] != null) {
				//if(Account2 배열에서 ano와 동일한 Account2 찾기)
				if(accountArray[i].getAno().equals(ano)) {
					//찾은 Account2를 리턴
					return accountArray[i];
				}
				
			}
		}
		return null; // 못찾은 경우
	}
}















