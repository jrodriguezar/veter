package ilicensable;

/**
 *
 * @author jrodriguezar
 */
public abstract class Pet implements ISpeaking{

    protected String name;

    public Pet(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public abstract void speak();
}
