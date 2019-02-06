package ilicensable;

/**
 *
 * @author jrodriguezar
 */
public class Dog extends Pet implements Ilicensable{
    
    protected License license;

    public Dog(License license, String name) {
        super(name);
        this.license = license;
    }
     
    @Override
    public void speak() {
        System.out.println("WOW");
    }

    @Override
    public License getLicense() {
        return this.license;
    }
}