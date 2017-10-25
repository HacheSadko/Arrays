import java.util.Arrays;
import java.util.Scanner;
class array6
{
	public static void main (String Args[])
	 {
  		Scanner sc = new Scanner(System.in);
  		int [] num = new int[6];
  		for (int i=0;i<5;++i)
  		{
  		  System.out.print("\nTeclea el "+(++i)+" numero--> ");
  		  --i;
  		  num[i] = sc.nextInt();
  		}
  		Arrays.sort(num);
  		System.out.print("\nOrdenado en Ascendente:"+"\n\n");
  		for (int i=1;i<6;++i) 
  		  System.out.println(num[i]);
  		System.out.print("\nOrdenado en Descendente:"+"\n\n");
  		for (int i=5;i>0;--i) 
  		  System.out.println(num[i]);
  		System.out.print("\nProgramo por comida :)");
  	 }
}