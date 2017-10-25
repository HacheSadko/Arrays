import java.util.Scanner;
class array2         
{
	public static void main (String Args[])
	 {
  		Scanner sc = new Scanner(System.in);
  		int [] array1 = new int[10];
		int [] array2 = new int[10];
		int sum = 0;
  		System.out.print ("\nDatos del primer Arreglo"+"\n");
  		for (int i = 0;i<10;++i)
  		{
  			System.out.print("Ingresa el "+(++i)+" dato --> ");
  			--i;
  			array1[i] = sc.nextInt();
  		}
  		System.out.print ("\nDatos del segundo Arreglo"+"\n");
  		for (int i = 0;i<10;++i)
  		{
  			System.out.print("Ingresa el "+(++i)+" dato --> ");
  			--i;
  			array2[i] = sc.nextInt();
  		}
  		for (int i =0;i<10;++i)
  		{
  			System.out.print("\n"+array1[i]*array2[i]);
  			sum += (array1[i]*array2[i]);
  		}
  		System.out.print("\nEl total de los productos es :"+sum);
 	 }
}