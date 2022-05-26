package akxm;
import java.util.Scanner;
class Conversion{
	String result="", bin, hex, num;
	int temp;
	String i, n;
	String toBinary(int num){ 
		temp=num;
		bin=Integer.toBinaryString(temp); //10������ 2������ ��ȯ
		return bin;
		}
	String toHex(int num) {
		temp=num;
		hex=Integer.toHexString(temp); //10������ 16������ ��ȯ
		return hex;
		}
	String binaryToHex(String bin) { 
		temp = Integer.parseInt(bin,2); //�Է¹��� ���� 2������ ��ȯ
		hex=Integer.toHexString(temp); //2������ 16������ ��ȯ
		return hex;
	}
	String hexToBinary(String hex) {
		temp = Integer.parseInt(hex,16); //�Է¹��� ���� 16������ ��ȯ
		bin=Integer.toBinaryString(temp); //16������ 2������ ��ȯ
		return bin;
	}
	String binaryToNum(String bin) {
		temp=Integer.parseInt(bin,2); //�Է¹��� ���� 2������ ��ȯ
		num=temp+""; //2������ 10������ ��ȯ
		return num;
	}
	String hexToNum(String hex) {
		temp = Integer.parseInt(hex,16); //�Է¹��� ���� 16������ ��ȯ
		num=temp+""; //16������ 10������ ��ȯ
		return num;
	}
	void printNum() {System.out.println("10����: "+num);}
	void printBinary() {System.out.println("2����: "+bin);}
	void printHex() {System.out.println("16����: "+hex);}
}
public class ConversionTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Conversion c = new Conversion();
		c.i = sc.next(); //���� �Է�
		c.n = sc.next(); //������ �ش��ϴ� ���� �Է�
		int i=Integer.parseInt(c.i);
		int n=Integer.parseInt(c.n);
		if(i==10 || i==2 || i==16) {
			if(i==10) {
				c.num=c.n;
				c.toBinary(n);
				c.toHex(n);
			}
			else if(i==2) {
				c.bin=c.n;
				c.binaryToNum(c.n);
				c.binaryToHex(c.n);
			}
			else if(i==16) {
				c.hex=c.n;
				c.hexToBinary(c.n);
				c.hexToNum(c.n);
			}
			c.printNum();
			c.printBinary();
			c.printHex();
		}
		else {
			System.out.println("������ �ٽ� �Է��ϼ���.");
		}
	}
}