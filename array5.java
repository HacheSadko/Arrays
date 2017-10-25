import java.util.Scanner;
class array5     
{
	public static void main (String Args[])
	 {
  		Scanner sc = new Scanner(System.in);
  		String [] nom = new String [5];
  		int [] large = new int[5];
  		int voca=0,voce=0,voci=0,voco=0,vocu=0;
      
  		for (int i=0;i<5;++i)
  		{
  		 System.out.print("Teclea el "+(++i)+" nombre: ");
  		 --i;
  		 nom[i]= sc.nextLine(); 
  		 large[i] = nom[i].length();
  		}
  		for (int i=0;i<5;++i)
        {
  		  for (int j=0;j<large[i];++j) 
          {
  		      if (nom[i].charAt(j)=='a')
              ++voca;
			  else 	
                if (nom[i].charAt(j)=='e')
                  ++voce;
                else
                  if (nom[i].charAt(j)=='i')
                    ++voci;
                  else
                    if (nom[i].charAt(j)=='o')
                      ++voco;
                    else
                      if (nom[i].charAt(j)=='u')
                        ++vocu;
  		   }
  		  System.out.print("\n"+nom[i]+" tiene: "+voca+"(A), "
  		  +voce+"(E), "+voci+"(I), "+voco+"(O), "+vocu+"(U)");
        voca=0;voce=0;voci=0;voco=0;vocu=0;
        }
        System.out.print("\nProgramo por comida :)");
     } 	 
}