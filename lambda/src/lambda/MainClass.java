package lambda;

public class MainClass {
	public static void main(String[] args) {
		LambdaClass li1 = (String s1, String s2,String s3) -> {System.out.println(s1+"!\t"+s2+"!\t"+s3);};
		li1.method("Hello", "lambda", "world");
		
		// 매개변수가 하나이거나 데이터 타입이 같을 경우 생략 가능
		LambdaClass2 li2 =  (s1) -> {System.out.println("람다 "+s1+" 람다");};
		li2.method("자바");
		
		// 매개변수가 하나이고 실행문이 하나일때 (),{}생략 가능
		LambdaClass2 li3 = s1 -> System.out.println("Hi"+s1);;
		li3.method("하이");	
		
		// 매개변수가 없을때 () 생략 가능
		LambdaClass3 li4 = () -> System.out.println("매개변수가 없습니다.");
		li4.method();
		
		LambdaClass4 li5 = (x,y) -> {
			int result = x+y;
			return result;
		};
		System.out.println(li5.method(3, 5));
	}

}
