package 歐幾里德演算法;

public class 歐幾里德演算法 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		java.util.Scanner IN=new java.util.Scanner(System.in);
		int a,b,i,r;
		a=IN.nextInt();
		b=IN.nextInt();
		r=a%b;
		for(i=0;r!=0;i++){
			System.out.println(r);
			a=b;
			b=r;
			r=a%b;
		}
		System.out.println(b);
	}

}
