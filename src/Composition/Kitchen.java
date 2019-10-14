package Composition;

public class Kitchen {

    private String isGas;

    public Kitchen(String isGas){
        this.isGas=isGas;
    }

    public String getIsGas() {
        return isGas;
    }

    public String printGas(){
        return isGas + " ,kitchen has gas";
    }
}
