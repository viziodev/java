package views;

import java.util.List;

import entity.Compte;

public interface CompteView {
      Compte saisie();
     void affiche(List<Compte> comptes);
}
