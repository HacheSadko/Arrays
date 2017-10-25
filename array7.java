import java.util.Arrays;
import java.util.Scanner;
class array7      
{
  public static void main (String Args[])
   {
      Scanner sc = new Scanner(System.in);
  	  String [] nom = new String [5];
  	  System.out.print("\nNombres desordenados:"+"\n");
  	  for (int i=0;i<5;++i)
  		{
  		 System.out.print("Teclea el "+(++i)+" nombre: ");
  		 --i;
  		 nom[i]= sc.nextLine(); 
  		}
  	  Arrays.sort(nom);
  	  System.out.print("\nNombres Ordenados:"+"\n");
  	  for (int i=0;i<5;++i) 
  	    System.out.println(nom[i]);
      System.out.print("\nProgramo por comida :)");
   }
}