package xyz.test.jenkinstest;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.print(adder.add(3, 4));
        
        Multiplier multiplier=new Multiplier();
        multiplier.print(multiplier.multiply(5,6));
    }

}
