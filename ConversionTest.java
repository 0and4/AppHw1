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
		c.i = sc.next();
		c.n = sc.next();
		if(Integer.parseInt(c.i)==10) {
			c.num=c.n;
			c.toBinary(Integer.parseInt(c.n));
			c.toHex(Integer.parseInt(c.n));
			c.printNum();
			c.printBinary();
			c.printHex();
		}
		else if(Integer.parseInt(c.i)==2) {
			c.bin=c.n;
			c.binaryToNum(c.n);
			c.binaryToHex(c.n);
			c.printNum();
			c.printBinary();
			c.printHex();
		}
		else if(Integer.parseInt(c.i)==16) {
			c.hex=c.n;
			c.hexToBinary(c.n);
			c.hexToNum(c.n);
			c.printNum();
			c.printBinary();
			c.printHex();
		}
		else {
			System.out.println("진법을 다시 입력하세요.");
		}
	}

}
