import java.util.Scanner;
import core.Container;
import core.DependanceName;
import services.CompteService;
import views.CompteView;

public class App {
       private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {

      Container container =new Container();
      //Dependances
            CompteView compteView=(CompteView)container.getDependency(DependanceName.CompteView);
            CompteService service=(CompteService)container.getDependency(DependanceName.CompteService);
       
         int choix ;
         do {
            choix =menu();
            switch (choix) {
                case 1:
                var compte =compteView.saisie();
               service.addCompte(compte);
           
                break;
                case 2:

                var comptes =service.getComptes();
              
                compteView.affiche(comptes);
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
