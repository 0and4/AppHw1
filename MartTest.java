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
				System.out.print("ȸ�� ID : "+m+"�� ");
			}
		}
		else if(purchase>1000000 || purchase<0) {
			System.out.println("0�� �̻� 1,000,000�� ������ �ݾ��� �Է��Ͻʽÿ�.");
		}
		System.out.println("���� �������� "+purchase+"�Դϴ�.");
		return purchase;
	}
}
public class MartTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Mart A;
		System.out.print("������ �ݾ��� �Է��ϼ��� : ");
		int purchase=sc.nextInt();
		A=new Mart(purchase);
		A.Sale();
		
		Mart B;
		System.out.print("ȸ����ȣ�� �ݾ��� �Է��ϼ��� : ");
		boolean member=B.isMember();
		purchase=sc.nextInt();
		B=new Mart(member,purchase);
		//ȸ����ȣ�� boolean������ ��� �Է¹޾ƾ� �ϴ��� �������� ���߽��ϴ�
	}
}
