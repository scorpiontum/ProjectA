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
		System.out.print("Input your name : ");		//�Ѻ��Ҫ��;�ѡ�ҹ
		name = in.nextLine();						
		System.out.print("Input your salary : ");	//�Ѻ����Թ��͹��ѡ�ҹ
		salary = in.nextDouble();					
		System.out.print("Input your sales : ");	//�Ѻ����ʹ��¾�ѡ�ҹ
		sales = in.nextDouble();
		
		if(sales > 100000){
			Commission = sales*0.03;
		}else if(sales > 25000){
			Commission = sales*0.02;
		}else{
			Commission = sales*0.01;
		}
		compensation = salary+Commission;
		
		System.out.println("\nname : "+name);
		System.out.println("Commpensation : "+compensation);
		
	}

}
