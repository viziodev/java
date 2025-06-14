package entity;

public enum TypeCompte {
   //1        2 
    EPARGNE(1),CHEQUE(2);
   private final int value;
    public int getValue() {
    return value;
}
    private TypeCompte(int value){
     this.value=value;
    }
}
