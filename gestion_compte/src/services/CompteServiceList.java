package services;

import java.util.ArrayList;
import java.util.List;

import entity.Compte;

public class CompteServiceList implements CompteService {
      private  List<Compte> comptes=new ArrayList<>();


      @Override
       public  List<Compte> getComptes() {
        return comptes;
      }


       @Override
      public  void addCompte(Compte compte){
             comptes.add(compte);
      }

       @Override
      public  Compte getCompteByNumero(String numero) {
           for (int index = 0; index < comptes.size(); index++) {
            if (comptes.get(index).getNumero().equals(numero)) {
                return comptes.get(index);
            }
           }
           return null;
    }
}
