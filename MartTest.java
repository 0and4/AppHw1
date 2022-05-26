package akxm;
import java.util.Scanner;
class Mart{
	Scanner sc = new Scanner(System.in);
	private int purchase;
	private String member;
	String arr[]= {"member1234","member5678"};
	public Mart(int purchase) {
		this.purchase=purchase;
	}
	public Mart(String member, int purchase) {
		this.member=member;
		this.purchase=purchase;
		isMember(member);
	}
	public int getPurchase() {
		return purchase;
	}
	public void setPurchase(int purchase) {
		this.purchase=purchase;
	}
	boolean isMember(String member) {
		boolean m=false;
		for(int i=0;i<arr.length;i++) {
			if (arr[i].equals(member)) {
				m=true;
			}
		}
		return m;
	}
	public void getMember(String member) {
		this.member=member;
	}
	public int Sale() {
		double sale=0;
		int result = 0;
		if(purchase>1000000 || purchase<0) {
			System.out.println("0원 이상 1,000,000원 이하의 금액을 입력하십시오.");
		}
		else {
			if(purchase>=10000 && purchase<50000) { sale=0.95; }
			else if(purchase>=50000 && purchase<100000) { sale=0.9; }
			else if(purchase>=100000) { sale=0.8; }
		}
		if(isMember(member)==true) {
			result=(int)(purchase*(sale-0.1));
			System.out.print("회원 ID : "+member+"의 ");
		}
		else {
			result=(int)(purchase*sale);
		}
		System.out.println("최종 결제액은 "+result+"입니다.");
		return result;
	}
}
public class MartTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Mart A;
		System.out.print("구매할 금액을 입력하세요 : ");
		int purchase=sc.nextInt();
		A=new Mart(purchase);
		A.Sale();
		
		Mart B;
		System.out.print("회원번호와 금액을 입력하세요 : ");
		String member=sc.next();
		purchase=sc.nextInt();
		B=new Mart(member,purchase);
		B.Sale();
	}
}
