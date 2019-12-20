package s073;

public abstract class Mammal { //Mamal non estende nessuna classe quindi estende la classe object, la classe delle classe
    protected int gestation;

    public Mammal(int gestation) { //è il costruttore 
        this.gestation = gestation;
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
}
