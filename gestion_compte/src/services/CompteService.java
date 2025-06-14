package services;

import java.util.ArrayList;

import entity.Compte;

public class CompteService {
      private static ArrayList<Compte> comptes=new ArrayList<>();


      private CompteService(){}
      public static ArrayList<Compte> getComptes() {
        return comptes;
    }

      public static void addCompte(Compte compte){
             comptes.add(compte);
      }

      public static Compte getCompteByNumero(String numero) {
           for (int index = 0; index < comptes.size(); index++) {
            if (comptes.get(index).getNumero().equals(numero)) {
                return comptes.get(index);
            }
           }
           return null;
    }
}
