import java.util.Scanner;
class array9      
{
  public static void main (String Args[])
   {
      Scanner sc = new Scanner(System.in);
      int [] num = new int[10];
      int busc = 0,nohay=0;
      for (int i=0;i<10;++i) 
      {
      	System.out.print("Ingresa el "+(++i)+" dato --> ");
      	--i;
      	num[i]= sc.nextInt();
      }
      System.out.print("\nIngresa el numero que quieres buscar: ");
      busc = sc.nextInt();
      for (int i=0;i<10;++i) 
      	if (busc == num[i])
      		{System.out.print("\nEl numero "+busc+" esta en la pocision "+(++i));
      		--i;}
   		else 
   		   	nohay += 1;
   	  if (nohay == 10)
      System.out.print("\nEl numero buscado no se encuentra en el arreglo");
      System.out.print("\nProgramo por comida :)");
   }
}