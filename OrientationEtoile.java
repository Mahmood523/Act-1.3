import java.util.Scanner;
import java.util.Arrays;

public class OrientationEtoile {

static void tri_bulle(String[] prenom , String[] prenom3) 
{
        int taille = prenom.length;  
        String tmp = "0";
 
        for(int i=0; i < taille; i++) 
        {
                for(int j=taille; j < (taille-i); j++)
                {  
                        if(prenom[j].compareTo (prenom[j-1] ) < 0)
                        {
                                //echanges des elements
                                tmp = prenom[j-1];  
                                prenom[j-1] = prenom[j];  
                                prenom[j] = tmp;  
                        }
 
                }
                       
        }
}

static void displayTab(String[] prenom)
   {    
        for(int i=0; i < prenom.length; i++)
        {
                System.out.print(prenom[i] + " ");  
        }
        System.out.println();
    }


public static void main(String[] args)
{       String mot = "";
        Scanner in = new Scanner(System.in);

        String[] prenom = {"Alban", "Jim", "Bob", "Albatroz", "Jinto", "Bow", "Hijo", "Manu", "Seb", "Teilo", "Charles", "Xavier"};
        System.out.println("---tableau---"); 
    
        displayTab(prenom);
 
        // tri des elements de tableau avec le tri a bulle
        tri_bulle(prenom);
 
        System.out.println("---tableau---");  
    
        displayTab(prenom);

         
        System.out.println("Entrer un mot ");
        mot = in.nextLine();
        
        String[] prenom2 = new String[] {mot};
        int len = prenom.length + prenom2.length;
        String[] prenom3 = new String[len];
        int position = 0;
        for (String object : prenom)
        {
            prenom3[position] = object;
            position++;
        }
        for (String object : prenom2)
        {
            prenom3[position] = object;
            position++;
        }
        System.out.println("---tableau---");
        displayTab(prenom3);
        tri_bulle(prenom3);
        System.out.println("---tableau---");
        displayTab(prenom3);

}
}
