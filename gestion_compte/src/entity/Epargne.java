package entity;

import java.time.LocalDate;

public class Epargne extends Compte {
    private LocalDate dateDebut=LocalDate.now();
    private LocalDate dateFin;
    private long duree;//nbreMois
    @Override
    public boolean retrait(Transaction transaction) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retrait'");
    }
    @Override
    public void depot(Transaction transaction) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depot'");
    }
    public LocalDate getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }
    public LocalDate getDateFin() {
        return dateFin;
    }
    public void caculDateFin() {
         this.dateFin=this.dateDebut.plusMonths(this.duree);
    }
    public long getDuree() {
        return duree;
    }
    public void setDuree(long duree) {
        this.duree = duree;
    }
    @Override
    public String toString() {
        return "Epargne [dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", duree=" + duree + ", toString()="
                + super.toString() + "]";
    }
   
}
