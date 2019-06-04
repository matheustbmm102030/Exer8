package Quest2;
import Quest1.*;

public class TestaAnimais {
    public static void main(String [] args){
        
        Papagaio p = new Papagaio("Rosa",true,"Alô");
        p.talk();
        p.imprime();
        
        Arara a = new Arara("Linda",true);
        a.talk();
        a.imprime();
        
        Cachorro c = new Cachorro("Bruce",4,true);
        c.talk();
        c.imprime();
        
        Vaca v = new Vaca("Corneta",4,true);
        v.talk();
        v.imprime();
}    
}
