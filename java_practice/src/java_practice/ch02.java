package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch02 {
	//2장. 변수사용
	public static void main(String[] args) {
		
		// 문제 2-1. 2개의 정숫값 82와 17의 합과 차를 구해서 표시 
		System.out.println(82+17);
		System.out.println(82-17);
		  
		System.out.println("82+17 = "+ (82+17));
		System.out.println("82-17 = "+(82-17));
		  
		// 문제 2-2. 2개의 변수 x,y 합과 평균을 표시
		int x; int y;
		  
		x = 63; y = 57;
		  
		System.out.println("x값은 "+x+"입니다.");
		System.out.println("y값은 "+y+"입니다.");
		  
		System.out.println("합계는 "+(x+y)+" 입니다.");
		System.out.println("평균는 "+(x+y)/2+" 입니다.");
		  
		//문제 2-3. 위와 동일한 프로그램에 실숫값을 대입 (실숫값일 때는 int형 X) 
		double a; double b;
		  
		a = 63.2; b = 57.3;
		  
		System.out.println("a값은 "+a+"입니다."); 
		System.out.println("b값은 "+b+"입니다.");
		  
		System.out.println("합계는 "+(a+b)+" 입니다.");
		System.out.println("평균는 "+(a+b)/2+" 입니다.");
		  
		//문제 2-4. 3개의 int형 변수에 각가 값을 대입해서 합계와 평균을 표시
		  
		int q,w,e ; int sum;
		  
		q = 63; w = 57; e = 12;
		  
		sum = q+w+e; System.out.println("q값은 "+q+"입니다.");
		System.out.println("w값은 "+w+"입니다."); 
		System.out.println("e값은 "+e+"입니다.");
		  
		System.out.println("합계는 "+sum+" 입니다.");
		System.out.println("평균는 "+sum/3+" 입니다.");
		  
		//문제 2-5. 키보드에 입력한 정숫값을 표시하는 프로그램을 작성
		Scanner stdIn =new Scanner(System.in);
		 
		System.out.println("정숫값 : "); int s = stdIn.nextInt();
		System.out.println(s+"를 입력했습니다.");
		  
		//문제 2-6. 키보드에서 입력한 정숫값에 10을 더한 값과 10 뺀 값을 출력 
		Scanner scaIn = new Scanner(System.in);
		  
		System.out.println("정숫값 : "); s = scaIn.nextInt();
		 
		System.out.println("10을 더한 값은 : "+(10+s));
		System.out.println("10을 뺸 값은 : "+(s-10));
		  
		//문제 2-7. 키보드에서 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수 값만 표시 //
		Scanner scaIn2 =new Scanner(System.in); 
		System.out.println("정숫값 : "); 
		s = scaIn.nextInt();
		 
		System.out.println("마지막 자릿수를 제외한 값 : "+(s/10));
		System.out.println("마지막 자릿수 값 : "+(s%10));
		 
		//문제 2-8. 2개 실숫값을 입력받아 그 합과 평균 
		System.out.println("실수 c값 : "); 
		double c =scaIn.nextDouble();
		  
		System.out.println("실수 v값 : "); 
		double v = scaIn.nextDouble();
		
		System.out.println("합계는 : " +(c+v)); 
		System.out.println("평균은 : " +(c+v)/2);
		 
		//문제 2-9. 삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하시오
		System.out.println("삼각형의 넓이를 구합니다."); 
		System.out.println("밑변 : "); 
		int width= scaIn.nextInt(); 
		System.out.println("높이 : "); 
		int height = scaIn.nextInt();
		  
		System.out.println("넓이는 : "+(width*height/2));
		  
		//문제 2-10. 구의 겉넓이와 부피를 구하는 프로그램 
		final double PI = 3.1416;
		System.out.println("구의 겉넓이와 부피를 구합니다.");
		
		System.out.println("반지름 :"); 
		double r =scaIn.nextDouble();
		
		System.out.println("겉넓이는 : "+(4*PI*r*r));
		System.out.println("부피는 : "+(4/3.0*PI*r*r*r));
		 
		
		//문제 2-11. 정수의 난수(랜덤으로 생성되는 값)를 생성해서 표시
		Random rand = new Random();
		//한자리 양의 정숫값을 랜덤으로 표시
		int n1 = 1+rand.nextInt(9);
		System.out.println("한 자리 양의 정수 :"+ n1);
		//한자리 음의 정숫값을 랜덤으로 표시
		int n2 = -1-rand.nextInt(9);
		System.out.println("한 자리 음의 정수 :"+n2);
		//두자리 양의 정숫값 랜덤으로 표시
		int n3 = 10+rand.nextInt(90);
		System.out.println("두 자리 양의 정수 :"+n3);
		
		//문제 2-12. 키보드에서 입력한 정숫값을 +5 또는 -5 범위의 랜덤 정숫값을 표시
		Scanner scan =new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("정수값 : ");
		int p =scan.nextInt();
		
		System.out.println("입력값의 +5,-5 난수 값 :"+(p-5+ran.nextInt(11)));
		
		//문제 2-13.  키보드로 입력한 성과 이름으로 인사하는 프로그램
		
		System.out.println("성  : ");
		String lastName = scan.next();
		System.out.println("이름 : ");
		String firstName = scan.next();
		
		System.out.println("안녕하세요 ^_^" + lastName + firstName +"님");
		
		//문제 2-14. 입력한 주소를 표시하는 프로그램
		
		System.out.println("주소 : ");
		String address = scan.nextLine();
		
		System.out.println("주소는" + address +"입니담!_!");
		

		
	}

}
