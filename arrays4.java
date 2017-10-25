import java.util.Scanner;
class arrays4      
{
  public static void main (String Args[])
   {
      Scanner sc = new Scanner(System.in);
      int [][] naci = new int [6][4];
      int [] year={2007, 2008, 2009, 2010};
      int [] toye = new int [4];
      int [] tocd = new int [6];
      String [] ciud={"Mexicali", "Hermosillo", 
      "Chihuahua", "Saltillo", "Monterrey", "Cd.Victoria"};
      int sum=0,sumt=0,mayo=0,meno=99999,yea=0;
      String cdna=" ";
      for(int i=0;i<6;++i){
      	System.out.print("\nNacimientos de "+ciud[i]+"\n");
      	for(int j=0;j<4;++j){
      		System.out.print("Nacimientos en "+year[j]+" --> ");
      		naci[i][j] = sc.nextInt();}}
      System.out.print("\n\t\t\t   Years  \t\tTotal\n");
      System.out.print("     Ciudad     "+year[0]+"\t"+year[1]+"\t"+year[2]+"\t"+year[3]);
      for (int i=0;i<6;++i){
      System.out.print("\n"+ciud[i]);
      	for(int j=0;j<4;++j){
          sum += naci[i][j];
          System.out.print("\t"+naci[i][j]);tocd[i]=sum;}
      System.out.print("\t"+sum);sumt+=sum;sum=0;}
      for(int i=0;i<6;++i)
      	for(int j=0;j<1;++j)
      		{sum += naci[i][j];toye[j]=sum;}
      System.out.print("\nTotal   \t"+sum);sum=0;
      for(int i=0;i<6;++i)
      	for(int j=1;j<2;++j)
      		{sum += naci[i][j];toye[j]=sum;}
      System.out.print("\t"+sum);sum=0;
      for(int i=0;i<6;++i)
      	for(int j=2;j<3;++j)
      		{sum += naci[i][j];toye[j]=sum;}
      System.out.print("\t"+sum);sum=0;
      for(int i=0;i<6;++i)
      	for(int j=3;j<4;++j)
      		{sum += naci[i][j];toye[j]=sum;}
      System.out.print("\t"+sum+"\t"+sumt);
      for(int i=0;i<6;++i)
      		if (tocd[i]>mayo)
      			{mayo=tocd[i];
      			cdna=ciud[i];}
      System.out.print("\n\nLa ciudad con mas nacimientos es "+cdna+" con "+mayo);
      cdna=" ";mayo=0;
      for(int i=0;i<6;++i)
      		if (tocd[i]<meno)
      			{meno=tocd[i];
      			cdna=ciud[i];}
      System.out.print("\nLa ciudad con menos nacimientos es "+cdna+" con "+meno);
      meno=99999;
      	for(int j=0;j<4;++j)
      		if (toye[j]>mayo)
      			{mayo=toye[j];
      			yea=year[j];}
      System.out.print("\nEl ano con mas nacimientos es "+yea+" con "+mayo);
      yea=0;
      	for(int j=0;j<4;++j)
      		if (toye[j]<meno)
      			{meno=toye[j];
      			yea=year[j];}
      System.out.print("\nEl ano con menos nacimientos es "+yea+" con "+meno);
      System.out.print("\nProgramo por comida :)");
   }
}