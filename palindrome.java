Activité 1.2.4 : Est-ce un palindrome ?

fonction palindrome (ref Mot :chaine de caracteres) :booléen;
  var resultat :booléen;
      i,n :entiers;

  debut 
      fonction saisie(Mot :chaine de caractere):vide;
          ecrire("Saisir votre mot :");
          lire(Mot);
      finfonction;
    
      n<- longueur(mot);
      resultat<- vrai;
      i<- 0;

      tant que resultat= vrai et i <= n/2 faire

        si (Mot[i] ≠ Mot [n-1-i] ) alors
          resultat<- faux;
        finsi

        i<- i+1
      fintantque 

    si resultat= vrai alors
     ecrire("votre mot est palindrome")
    sinon ecrire("votre mot n'est palindrome")

  fin 
finfonction
 