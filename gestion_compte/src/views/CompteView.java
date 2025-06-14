package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Cheque;
import entity.Compte;
import entity.Epargne;
import entity.TypeCompte;

public class CompteView {
   private static Scanner scanner=new Scanner(System.in);

   public static Compte saisie(){
      Compte cp;
      double solde;
        do {
               System.out.println("Entrer le Solde");
               solde=scanner.nextDouble();
        } while (solde<=0);
        int type;
        do {
            var values= TypeCompte.values();
            for (int index = 0; index < values.length; index++) {
               System.out.println(values[index].getValue()+"-"+values[index].name());
            }
             type=scanner.nextInt();
        } while (type!=1 && type!=2 );
        if (type==1) {
            long duree;
            do {
                System.out.println("Entrer la duree de Blocage");
                duree=scanner.nextLong();
             } while (duree<0); 
             cp=new Epargne();
             cp.setSolde(solde);
             ((Epargne)cp).setDuree(duree);
             ((Epargne)cp).caculDateFin();

        }else{
            cp=new Cheque();
            cp.setSolde(solde);
        }
      return cp;
   }

    public static void affiche(ArrayList<Compte> comptes) {
           for (int index = 0; index < comptes.size(); index++) {
              System.out.println(comptes.get(index));
           }
           
    }
}
