package emp.util;

import java.util.List;
import java.util.Scanner;

import emp.dto.EmpDTO;


public class ConsoleUtil {
	//사원추가와 관련한 정보 입력
	public EmpDTO getNewEmp(Scanner sc) {
		System.out.println("추가할 사원정보 입력 ");
		System.out.println("--------------------------");
		EmpDTO insertDto = new EmpDTO();
		System.out.print("사원번호 : ");
		insertDto.setEmpno(Integer.parseInt(sc.nextLine()));
		System.out.print("사원명 : ");
		insertDto.setEname(sc.nextLine());
		System.out.print("직무 : ");
		insertDto.setJob(sc.nextLine());
		System.out.print("매니저 번호 : ");
		insertDto.setMgr(Integer.parseInt(sc.nextLine()));
		System.out.print("급여 : ");
		insertDto.setSal(Integer.parseInt(sc.nextLine()));
		System.out.print("추가수당 : ");
		insertDto.setComm(Integer.parseInt(sc.nextLine()));
		System.out.print("부서 번호 : ");
		insertDto.setDeptno(Integer.parseInt(sc.nextLine()));
		
		return insertDto;
	}
	
	public void printAddSuccessMessage(EmpDTO newEmp) {
		System.out.println(newEmp.getEname()+" 사원정보 추가 성공");
	}
	public void printAddFailMessage(EmpDTO newEmp) {
		System.out.println(newEmp.getEname()+" 사원정보 추가 실패");
	}
	
	
	public void printEmpList(List<EmpDTO> list) {
		
		System.out.println();
		System.out.println("***** 사원정보 *****");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("사번\t성명\t직무\t매니저번호\t입사일\t급여\t추가수당\t부서번호");
		System.out.println("-------------------------------------------------------------------");
		
		for(EmpDTO dto : list) {
			System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d\n",
					dto.getEmpno(),dto.getEname(),dto.getJob(),dto.getMgr(),dto.getHiredate(),dto.getSal(),dto.getComm(),dto.getDeptno());
		}	
		System.out.println();
	}
	
	public int printRowMessage(Scanner sc) {
		System.out.print("\n조회할 사원번호 입력 >> ");
		int empno = Integer.parseInt(sc.nextLine());
		return empno;
	}
	
	public void printEmpMessage(EmpDTO row) {
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		System.out.println("사번\t성명\t직무\t입사일\t부서번호");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%d\t%s\t%s\t%s\t%d\n",
				row.getEmpno(),row.getEname(),row.getJob(),row.getHiredate(),row.getDeptno());
	}
	
	public EmpDTO getUpdateEmp(Scanner sc) {
		
		EmpDTO dto = new EmpDTO();
		System.out.print("\n수정할 사원번호 입력 >> ");
		dto.setEmpno(Integer.parseInt(sc.nextLine()));
		System.out.print("\n변경할 매니저 번호 입력 >> ");
		dto.setMgr(Integer.parseInt(sc.nextLine()));
		
		return dto;
	}
	
	public void printUpdateSuccessMessage(EmpDTO updateEmp) {
		System.out.println(updateEmp.getEmpno()+" 사원정보 수정 성공");
	}
	public void printUpdateFailMessage(EmpDTO updateEmp) {
		System.out.println(updateEmp.getEmpno()+" 사원정보 수정 실패");
	}
	
	public int removeEmpno(Scanner sc) {
		System.out.print("\n탈퇴할 사원번호 입력 >> ");
		int empno = Integer.parseInt(sc.nextLine());
		return empno;
	}
	public void printRemoveSuccessMessage(int empno) {
		System.out.println(empno+" 사원정보 삭제 성공");
	}
	public void printRemoveFailMessage(int empno) {
		System.out.println(empno+" 사원정보 삭제 실패");
	}
	
	
}
















