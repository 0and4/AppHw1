package akxm;
import java.util.Scanner;
class Conversion{
	String result="", bin, hex, num;
	int temp;
	String i, n;
	String toBinary(int num){ 
		temp=num;
		bin=Integer.toBinaryString(temp); //10진수를 2진수로 변환
		return bin;
		}
	String toHex(int num) {
		temp=num;
		hex=Integer.toHexString(temp); //10진수를 16진수로 변환
		return hex;
		}
	String binaryToHex(String bin) { 
		temp = Integer.parseInt(bin,2); //입력받은 값을 2진수로 변환
		hex=Integer.toHexString(temp); //2진수를 16진수로 변환
		return hex;
	}
	String hexToBinary(String hex) {
		temp = Integer.parseInt(hex,16); //입력받은 값을 16진수로 변환
		bin=Integer.toBinaryString(temp); //16진수를 2진수로 변환
		return bin;
	}
	String binaryToNum(String bin) {
		temp=Integer.parseInt(bin,2); //입력받은 값을 2진수로 변환
		num=temp+""; //2진수를 10진수로 변환
		return num;
	}
	String hexToNum(String hex) {
		temp = Integer.parseInt(hex,16); //입력받은 값을 16진수로 변환
		num=temp+""; //16진수를 10진수로 변환
		return num;
	}
	void printNum() {System.out.println("10진수: "+num);}
	void printBinary() {System.out.println("2진수: "+bin);}
	void printHex() {System.out.println("16진수: "+hex);}
}
public class ConversionTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Conversion c = new Conversion();
		c.i = sc.next(); //진법 입력
		c.n = sc.next(); //진법에 해당하는 숫자 입력
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
			System.out.println("진법을 다시 입력하세요.");
		}
	}
}