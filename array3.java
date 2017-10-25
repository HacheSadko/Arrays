import java.util.Scanner;
class array3       
{
	public static void main (String Args[])
	 {
  		Scanner sc = new Scanner(System.in);
  		int [] array = new int[11];
  		int mayo=0, rep=0;
  		System.out.print ("\nDatos del Arreglo"+"\n");
		for (int i = 0;i<10;++i)
  		{
  			System.out.print("Ingresa el "+(++i)+" dato --> ");
  			--i;
  			array[i] = sc.nextInt();
        if (array[i] > mayo)
          mayo = array[i];
      }
      for (int i = 0;i<10;++i)
      {
        if (array[i] == mayo)
        ++rep;
      }
  		System.out.print("\n");
  		for (int i=0;i<10;++i)
  		{
  		System.out.println(array[i]);	
  		}
  		System.out.print("\nEl numero mayor es: "+mayo);
  		System.out.print("\nLa veces que se repiten son: "+rep);
      System.out.print("\nProgramo por comida :)");	
  	 }
}
