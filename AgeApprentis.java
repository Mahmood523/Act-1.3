Activité 1.3.3 : L'âge des apprentis

public class AgeApprentis {

static void tri_selection(int[] ageArray)
{
     for (int i = 0; i < ageArray.length - 1; i++)  
          {
               int index = i;  
               for (int j = i + 1; j < ageArray.length; j++)
               {
                    if (ageArray[j] > ageArray[index]){ 
                         index = j;
                    }
               }
 
               int max = ageArray[index];
               ageArray[index] = ageArray[i]; 
               ageArray[i] = max;
          }

}

static void displayTab(int[] ageArray)
   {    
        for(int i=0; i < ageArray.length; i++)
        {
                System.out.print(ageArray[i] + " ");  
        }
        System.out.println();
    }


public static void main(String a[])
{
       int[] ageArray = {45, 54, 23, 32, 64, 46, 28, 82};
       System.out.println("---Avant le tri selection---"); 
    
        displayTab(ageArray);
 
        // tri des elements de tableau avec le tri selection
        tri_selection(ageArray);
 
        System.out.println("---Apres le tri selection---");  
    
        displayTab(ageArray);
}
}



 
