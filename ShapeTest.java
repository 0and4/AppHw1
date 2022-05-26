package akxm;
import java.util.Scanner;
class Shape{
	public Shape(int width){
		System.out.println("������ ���̴� : "+ width);
	}
	Shape(int width, int height){
		System.out.println("�簢���� ���̴� : "+ width*height);
	}
	Shape(int width, int height, int depth){
		System.out.println("������ü�� ���Ǵ� : "+ width*height*depth);
	}
}
public class ShapeTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ġ�� �Է��Ͻÿ� (1�� : ����, 2�� : ���簢��, 3�� : ������ü)");
		String str = sc.nextLine();
		String[] nums = str.split(" "); // �Է��� ���� ������ ���� ����� �ٸ��� ���
		Shape s;
		int[] inums = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			inums[i]=Integer.parseInt(nums[i]);
		}
		if(nums.length==1) {
			s=new Shape(inums[0]);
		}
		if(nums.length==2) {
			s=new Shape(inums[0],inums[1]);
		}
		if(nums.length==3) {
			s=new Shape(inums[0],inums[1],inums[2]);
		}
	}
}
