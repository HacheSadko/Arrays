import java.util.Scanner;
class arrays2         
{
	public static void main (String Args[])
	 {
  		Scanner sc = new Scanner(System.in); 
  		String [] array = new String [5];
  		int [][] arrayn = new int[5][3];
  		int prom = 0;
  		String vaciado = " ";
	//INGRESO DE DATOS	
		for (int i=0;i<5;++i)
		{
		   System.out.print ("\nTeclea el nombre del alumno no. "+(++i)+": ");
		   --i;
		   array[i] = sc.nextLine();		   
		   for (int j =0; j < 3; ++j)
		    {
		   	  System.out.print ("\nLa "+(++j)+" calificacion del alumno es: ");
		   	  --j;
		   	  arrayn[i][j] = sc.nextInt();
		    }	   		   
		    vaciado = sc.nextLine(); 
		}
	//DESPLEGADO 
   	 System.out.print("\nAlumno 1P.     2P.     3P.  Promedio");
     for (int i=0;i<=4;++i)
     {
        System.out.print("\n"+array[i]);
        for (int j=0;j<=2;++j)
           {
             System.out.print("\t"+arrayn[i][j]);
             prom += arrayn[i][j];      
           }          
        prom /= 3;
        System.out.print("\t"+prom);
        prom=0;
     }
     for (int i=0;i<5;++i)
      for (int j=0;j<1;++j)
        prom += arrayn[i][j];
     System.out.print("\n\t"+prom/5);
     prom=0;
     //
     for (int i=0;i<5;++i)
      for (int j=1;j<2;++j)
        prom += arrayn[i][j];
     System.out.print("\t"+prom/5);
     prom=0;
     for (int i=0;i<5;++i)
      for (int j=2;j<3;++j)
        prom += arrayn[i][j];
     System.out.print("\t"+prom/5);
    prom=0;
      System.out.print("\nProgramo por comida :)");    	  
	 }
}
