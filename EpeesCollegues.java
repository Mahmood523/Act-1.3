

public class EpeesCollegues {



static void tri_bulle(String[] prenom) 
{
        int taille = prenom.length;  
        String tmp = "0";
 
        for(int i=0; i < taille; i++) 
        {
                for(int j=1; j < (taille-i); j++)
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
{
        String[] prenom = {"Alban", "Jim", "Bob", "Albatroz", "Jinto", "Bow", "Hijo", "Manu", "Seb", "Teilo", "Charles", "Xavier"};
        System.out.println("---Avant le tri a bulle---"); 
    
        displayTab(prenom);
 
        // tri des elements de tableau avec le tri a bulle
        tri_bulle(prenom);
 
        System.out.println("---Apres le tri a bulle---");  
    
        displayTab(prenom);
}
}

    