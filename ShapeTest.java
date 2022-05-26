package akxm;
import java.util.Scanner;
class Shape{
	public Shape(int width){
		System.out.println("직선의 길이는 : "+ width);
	}
	Shape(int width, int height){
		System.out.println("사각형의 넓이는 : "+ width*height);
	}
	Shape(int width, int height, int depth){
		System.out.println("직육면체의 부피는 : "+ width*height*depth);
	}
}
public class ShapeTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수치를 입력하시오 (1개 : 직선, 2개 : 직사각형, 3개 : 직육면체)");
		String str = sc.nextLine();
		String[] nums = str.split(" "); // 입력한 값의 개수에 따라 결과를 다르게 출력
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
