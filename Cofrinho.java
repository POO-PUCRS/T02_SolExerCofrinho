import java.util.ArrayList;

public class Cofrinho{
    private ArrayList<String> moedas;

    public Cofrinho(){
        moedas = new ArrayList<>();
    }

    private int valor(String moeda){
        switch(moeda){
            case "Real":
            return 100;
            case "50":
            return 50;
            case "25":
            return 25;
            case "10":
            return 10;
            case "5":
            return 5;
            default:
            return -1;
        }
    }

    public boolean insereMoeda(String moeda){
        int val = valor(moeda);
        if (val == -1){
            return false;
        }else{
            moedas.add(moeda);
            return true;
        }
    }

    public int getQtdadeMoedas(){
        return moedas.size();
    }

    public int getQtdadeMoedasTipo(String moeda){
        int cont = 0;
        
        for(String umaMoeda:moedas){
            if (umaMoeda.equals(moeda)){
                cont++;
            }
        }
        
        /* Outra forma de escrever o mesmo laço de for
        for(int i=0;i<moedas.size();i++){
            if (moedas.get(i).equals(moeda)){
                cont++;
            }
        }*/
        return cont;
    }

    public double getValorTotal(){
        int valorCentavos = 0;
        for(String moeda:moedas){
            valorCentavos += valor(moeda);
        }
        return valorCentavos/100.0;
    }

    public String retiraMoeda(){
        if (moedas.size() == 0){
            return null;
        }else{
            return moedas.remove(0);
        }
    }
}