import java.util.Scanner;
public class ProjectA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		double salary;
		double sales;
		double Commission;
		double compensation;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input your name : ");
		name = in.nextLine();						//รับค่าชื่อ
		System.out.print("Input your salary : ");
		salary = in.nextDouble();					//รับค่าเงินเดือน
		System.out.print("Input your sales : ");
		sales = in.nextDouble();
		
	}

}
