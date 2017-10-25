import java.util.Scanner;
class arrays3      
{
  public static void main (String Args[])
   {
      Scanner sc = new Scanner(System.in);
      int [][] num = new int[5][4];
      int sum=0,fil=0,col=0;
      int mayo=0;
      int meno=0;
	  //INGRESSO DE DATOS
      for (int i=0;i<5;++i)
      {
      	 System.out.print("\nColumna no."+(++i)+"\n");
      	 --i;
	     for (int j = 0; j < 4; ++j)
	     {
	     	System.out.print("Ingresa el dato  de la "+(++j)+" fila--> ");
	     	--j;
	     	num[i][j] = sc.nextInt();
	     }
	  }
	  mayo=num[0][0];
	  meno=num[4][3];
	//SUMA COLUMNA     	
	  System.out.print("\n");
	  for (int k=0;k<5;++k)
	  {
	    for (int h=0;h<4;++h)
	    	sum += num[k][h];
	    	System.out.println("La suma de la "+(++k)+" culumna es: "+sum);
	    	--k;
	    	sum=0;
	  }
	  System.out.print("\n");
	  //SUMA FILA
	  for (int k=0;k<4;++k)
	  {
	    for (int h=0;h<5;++h)
	    	sum += num[h][k];
	    System.out.println("La suma de la "+(++k)+" fila es: "+sum);
	    --k;
	    sum=0;
	  }
	//DATO MAYOR COLUMNA
	   System.out.print("\n");
	  for (int k=0;k<5;++k)
	  {
	    for (int h=0;h<4;++h)
	    	if(num[k][h]>mayo)
	    		mayo = num[k][h];
	    System.out.println("EL dato mayor de la "+(++k)+" culumna es: "+mayo);
	    --k;
	    mayo=num[0][0];
	  }
	  System.out.print("\n");
	  //DAtO MENOR COLUMNA
	  for (int k=0;k<5;++k)
	  {
	    for (int h=0;h<4;++h)
	    	if(num[k][h]<meno)
	    		meno = num[k][h];
	    System.out.println("EL dato menor de la "+(++k)+" culumna es: "+meno);
	    --k;
	    meno=num[4][3];
	  }
	//DATO MAYOR FILA
	  System.out.print("\n");
	  for (int k=0;k<4;++k)
	  {
	    for (int h=0;h<5;++h)
	    	if(num[h][k]>mayo)
	    		mayo = num[h][k];
	    System.out.println("La dato mayor de la "+(++k)+" fila es: "+mayo);
	    --k;
	    mayo=num[0][0];
	  }	    
	  System.out.print("\n");
	  //DATO MENOR FILA
	  for (int k=0;k<4;++k)
	  {
	    for (int h=0;h<5;++h)
	    	if(num[h][k]<meno)
	    		meno = num[h][k];
	    System.out.println("La dato menor de la "+(++k)+" fila es: "+meno);
	    --k;
	    meno=num[4][3];
	  }
	//DATO MAYOR ARREGLO
	  System.out.print("\n");
	  for (int i=0;i<5;++i)
	    for (int j=0;j<4;++j)
	    	if(num[i][j]>mayo)
	    	{
	    		mayo = num[i][j];
	    		col = i;
	    		fil = j;
	    	}
	  System.out.println("El dato mayor de todo el arreglo es: "+mayo);
	  System.out.println("Se encuentra en la columna "+(++col)+" y la fila "+(++fil));
	  col=0;
	  fil=0;
		//DATO MENOR ARREGLO
	  for (int i=0;i<5;++i)
	    for (int j=0;j<4;++j)
	    	if(num[i][j]<meno)
	    	{
	    		meno = num[i][j];
	    		col = i;
	    		fil = j;
	    	}
	  System.out.println("El dato menor de todo el arreglo es: "+meno);
	  System.out.println("Se encuentra en la columna "+(++col)+" y la fila "+(++fil));
	  System.out.print("\nProgramo por comida :)");
   }
}