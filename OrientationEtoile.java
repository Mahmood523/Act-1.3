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
    public static int recherche_di(String prenom3[],int f, int l, String val){
    int l=prenom3.length;
    int f =0;
    if (l >= f){
      int mid = f + (l - f)/2;
      if (prenom3[mid] == val){
        return mid;
      }
      if (prenom3[mid] .compareTo (val) < 0){
        //recherche dans le sous-tableau à gauche
        return recherche_di(prenom3, f, mid-1, val); 
      }else{
        //recherche dans le sous-tableau à droit
        return recherche_di(prenom3, mid+1, l, val); 
      }
    }
    return -1;
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
        System.out.println("Entrer un mot ");
        val = in.nextLine();
        int res = recherche_di(prenom3,val);
    if (res != -1)
      System.out.println("L'élément se trouve à l'index: " + res);
    else
      System.out.println("L'élément n'existe pas!");

}
}

