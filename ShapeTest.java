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
		String[] nums = str.split(" ");
		Shape s;
		
		if (nums.length==1) {
			s = new Shape(Integer.parseInt(nums[0]));
		}
		if (nums.length==2) {
			s = new Shape(Integer.parseInt(nums[0]),Integer.parseInt(nums[1]));
		}
		if (nums.length==3) {
			s = new Shape(Integer.parseInt(nums[0]),Integer.parseInt(nums[1]),Integer.parseInt(nums[2]));
		}
	}

}
