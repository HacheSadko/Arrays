import java.util.Scanner;
class array1         
{
	public static void main (String Args[])
	 {
  		Scanner sc = new Scanner(System.in); 
  		int [] array = new int[13];
  		String nom = " ";
  		int sum = 0, mayo = 0, meno= 99999; 
  		System.out.print("\nTeclea el nombre del empleado: ");
  		nom = sc.nextLine();
  		System.out.print("\n");
  		for (int i = 0; i < 12 ;++i) 
  			{
  		   	  	System.out.print("Ingresa las ventas del "+(++i)+" mes --> ");
  		   	  	--i;
  		   	  	array[i] = sc.nextInt();
  		   	  	sum += array[i];
  		   	  	if (array[i] > mayo)
  		   	  		mayo = array[i];
  		   	  	if (array[i] < meno)
  		   	  		meno = array[i];
  			}	
  		System.out.print("\nSr."+nom+" sus ventas totales son: "+sum);
  		System.out.print("\nSu mayor venta fue de "+mayo);
  		System.out.println("\nSu menor venta fue de "+meno);
  		System.out.print("Programo por comida :)");
  	 }
}