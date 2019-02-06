package ilicensable;

/**
 *
 * @author jrodriguezar
 */
public class Retriever extends Dog{
    
    public Retriever(License license, String name) {
        super(license, name);
    }
    
    @Override
    public void speak(){
        System.out.println("WOF");
    }
}
