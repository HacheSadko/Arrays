import java.util.Scanner;
class arrays1         
{
	public static void main (String Args[])
	 {
  		Scanner sc = new Scanner(System.in); 
  		int [][] arraya = new int [3][3];
      int [][] arrayb = new int [3][3];
  //INGRESO DE DATOS
  		System.out.print ("\nDatos del primer Arreglo"+"\n");
      for (int i = 0; i <= 2; ++i)
        for (int j = 0; j <=2; ++j)
          {
            System.out.print ("Teclea un numero --> ");
            arraya[i][j] = sc.nextInt();
          }
      System.out.println ("\nDatos del segundo Arreglo");
      for (int i = 0; i <= 2; ++i)
        for (int j = 0; j <=2; ++j)
          {
            System.out.print ("Teclea un numero --> ");
            arrayb[i][j] = sc.nextInt();
          }
  //DESPLEGADOS DE ARREGLOS
      System.out.print ("\nDesplegado del Arreglo 1: "+"\n");
      for (int k = 0; k <= 2; ++k){
        for (int h = 0; h <=2; ++h)
            System.out.print (arraya[k][h] + "\t");  
            System.out.print ("\n");}   
      System.out.print ("\nDesplegado del Arreglo 2: "+"\n");          
      for (int k = 0; k <= 2; ++k) {                
        for (int h = 0; h <=2; ++h)
            System.out.print (arrayb[k][h] + "\t");
            System.out.print ("\n");}
  //DESPLEGADO DE SUMA DE ARREGLOS
      System.out.print ("\nDesplegado de la suma de arreglos"+"\n");
      for (int k = 0; k <= 2; ++k){
        for (int h = 0; h <=2; ++h)
            System.out.print ( (arraya[k][h] +arrayb[k][h]) + "\t");  
            System.out.print ("\n");} 
  		System.out.print ("\nProgramo por comida :)");
  	 }
}
