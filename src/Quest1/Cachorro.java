package Quest1;

public class Cachorro extends Mamifero {
    
    private boolean lateAlto;
    
    public Cachorro(String n, int p,boolean l) {
        super(n, p);
        setLateAlto(l);
    }
    public boolean getLateAlto(){ return this.lateAlto;}
    
    public void setLateAlto(boolean l){ this.lateAlto=l;}
    
    public void talk(){
        System.out.println("Au Au");
 }
    
}
