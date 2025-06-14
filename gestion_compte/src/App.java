import java.util.Scanner;

import services.CompteService;
import views.CompteView;

public class App {
       private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
         int choix ;
         do {
            choix =menu();
            switch (choix) {
                case 1:
                var compte =CompteView.saisie();
                CompteService.addCompte(compte);
                break;
                case 2:
                var comptes =CompteService.getComptes();
                CompteView.affiche(comptes);
                break;
              
            
                default:
                    break;
            }
            
         } while (choix!=3);
    }

    public static  int menu(){
      System.out.println("1-Add Compte");
      System.out.println("2-Lister Compte");
      System.out.println("3-Quiter");
      return scanner.nextInt();
    }
}
