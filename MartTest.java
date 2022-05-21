package akxm;
import java.util.Scanner;
class Mart{
	Scanner sc = new Scanner(System.in);
	private int purchase;
	private boolean member;
	private String m;
	String arr[]= {"member1234","member5678"};
	public Mart(int purchase) {
		this.purchase=purchase;
	}
	public Mart(boolean member, int purchase) {
		this.member=member;
		this.purchase=purchase;
	}
	public int getPurchase() {
		return purchase;
	}
	public void setPurchase(int purchase) {
		this.purchase=purchase;
	}
	boolean isMember() {
		for(int i=0;i<arr.length;i++) {
			if (m==arr[i]) {
				member=true;
			}
			else member=false;
		}
		return member;
	}
	public void getMember(boolean member) {
		this.member=member;
	}
	public int Sale() {
		if(purchase<=1000000 && purchase>=0) {
			if(purchase>=10000) {
				purchase-=purchase*0.05;
			}
			else if(purchase>=50000) {
				purchase-=purchase*0.1;
			}
			else if(purchase>=100000) {
				purchase-=purchase*0.2;
			}
			if(isMember()==true) {
				purchase-=purchase*0.1;
				System.out.print("회원 ID : "+m+"의 ");
			}
		}
		else if(purchase>1000000 || purchase<0) {
			System.out.println("0원 이상 1,000,000원 이하의 금액을 입력하십시오.");
		}
		System.out.println("최종 결제액은 "+purchase+"입니다.");
		return purchase;
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
		boolean member=B.isMember();
		purchase=sc.nextInt();
		B=new Mart(member,purchase);
		//회원번호를 boolean형으로 어떻게 입력받아야 하는지 이해하지 못했습니다
	}
}
