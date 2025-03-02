package a;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
		/**for(int i=0; i<10; i++)
		{
			System.out.print(languages[i] + ' ');
		}*/
		
		
		int n = (int) (Math.random() * 1_000_000);
		n = n * 3;
		System.out.println(n);
		n = n + Integer.parseInt("10101", 2);
		System.out.println(n);
		n = n + Integer.parseInt("FF", 16);
		System.out.println(n);
		n = n * 6;
		System.out.println(n);
		
		
		while(n > 9)
		{
			int aux = n;
			int s = 0;
			while(aux > 0)
			{
				s = s + aux % 10;
				aux = aux / 10;
			}
			n = s;
			System.out.println(s);
		}
		
		System.out.println("Willy-nilly, this semester I will learn " + languages[n]);
		
	}

}
