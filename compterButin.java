import java.util.Scanner;
public class CompterButin {
  
 static void continuer(String OoN)
 {
      boolean ask = true;
      if (OoN ="Oui")
        ask=true;
      else 
        ask=false;
 }
 static void mode_de_calcul(int n1,int n2,Char op)
 { 
   int resultat=0;
   if ( op = +) 
     resultat= n1+n2;
   else
     resultat= n1*n2;
 }
     
  
  static void somme(int resultat)
  {
    int s=0;
    s= s + resultat ;
  }
  
  static void saisie(int n1,int n2,char op)
  {
     Scanner in = new Scanner(System.in);

     System.out.println("Veuillez saisir un nombre: ");
     n1 = in.nextLine();
     System.out.println("Veuillez saisir un deuxième nombre: ");
     n2 = in.nextLine();
     System.out.println("Saisissez vote mode de calcul ");
     op = in.nextLine();
  }

public static void main(String a[])
{
  Scanner in = new Scanner(System.in);
  
  if (continuer(OoN))
     saisie(n1,n2,op);
     mode_de_calcul(n1,n2,op);
     somme(resultat);
     System.out.println("Résultat total : "+ s +". Continuez ? ");
     OoN = in.nextLine();
  else   
     continuer(OoN);
     System.out.println("Merci, à bientôt l'ami ! ");
  
}
}
