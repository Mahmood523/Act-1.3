Activité 1.2.4 : Est-ce un palindrome ?

import java.util.Scanner;
public class Palindrome {

     static boolean estPalindrome(String mot) 
     {
       int i=0, longueur=mot.length()-1;
       boolean egale=true;
   
        while(i<longueur/2 && egale){
           if(mot.charAt(i)==mot.charAt(longueur-i))
              egale = true;
           else
              egale = false;
           i++;
     }
        return egale;
}

public static void main(String a[])
{
      String mot, mot_inverse = "";
       Scanner in = new Scanner(System.in);
  
       System.out.println("Entrer un mot ");
       mot = in.nextLine();
  
       if (estPalindrome(mot))
          System.out.println("'"+mot + "' est un palindrome");
       else
          System.out.println("'"+mot + "' n'est pas un palindrome");
}
}
 
