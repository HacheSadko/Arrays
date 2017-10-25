import java.util.Scanner;
class array8      
{
  public static void main (String Args[])
   {
      Scanner sc = new Scanner(System.in);
      int [] num = new int[10];
      int sum=0,mult=1;
      for (int i=0;i<10;++i) 
      {
      	System.out.print("Ingresa el "+(++i)+" dato --> ");
      	--i;
      	num[i]= sc.nextInt();
      	sum += num[i];
      	mult *= num[i];
      }
      System.out.print("\nLa suma del arreglo es: "+sum);
      System.out.print("\nLa multiplicacion del arreglo es: "+mult);
      System.out.print("\nProgramo por comida :)");      
   }
}