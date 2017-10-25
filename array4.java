import java.util.Scanner;
class array4      
{
	public static void main (String Args[])
	 {
  		Scanner sc = new Scanner(System.in);
  		String [] array = new String [10];
  		int [] calf1 = new int[10];
  		int [] calf2 = new int[10];
  		for (int i=0;i<10;++i)
  		{
  		 System.out.print("\nTeclea el nombre del "+(++i)+" alumno--> ");
  		 --i;
  		 array[i] = sc.nextLine();
  		 System.out.print("Teclea la calificacion del primer parcial: ");
  		 calf1[i] = sc.nextInt();
  		 System.out.print("Teclea la calificacion del segundo parcial: ");
  		 calf2[i] = sc.nextInt();
  		 sc.nextLine();
  		}
      System.out.print("\nAlumno 1P.     2P.   Promedio");
  		for (int i=0;i<10;++i)
  		{
  		 System.out.print("\n");
  		 System.out.print(array[i]+"\t"+calf1[i]+"\t"+calf2[i]
		 +"\t"+((calf1[i]+calf2[i])/2));
  		}
  		System.out.print("\nProgramo por comida :)");  		
  	 }
}