package services;


import java.util.List;

import entity.Compte;

public interface CompteService {
    List<Compte> getComptes();
    void addCompte(Compte compte);
    Compte getCompteByNumero(String numero);
}
