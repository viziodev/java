package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public  abstract class Compte {
    private static int nbreCompte;
    private int id;
    private String numero;
    protected LocalDate dateCreation=LocalDate.now();
    protected double solde;
    protected TypeCompte typeCompte;

    protected ArrayList<Transaction>transactions=new ArrayList<>();

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    public abstract boolean retrait(Transaction transaction);
    public abstract void depot( Transaction transaction);
    
    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    protected Compte() {
        id=++nbreCompte;
        numero="NUM_"+id;
    }

    protected Compte(double solde) {
        id=++nbreCompte;
        numero="NUM_"+id;
        this.solde = solde;
    }

    public static int getNbreCompte() {
        return nbreCompte;
    }

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return " id=" + id + ", numero=" + numero + ", dateCreation=" + dateCreation + ", solde=" + solde ;
    }
    




}
