public class Cofrinho{
    private final int MAXMOEDAS = 1000;
    private Moeda moedas[];
    private int qtdade;

    public Cofrinho(){
        moedas = new Moeda[MAXMOEDAS];
        qtdade = 0;
    }

    public boolean insere(Moeda moeda){
        if (qtdade == MAXMOEDAS){
            return false;
        }
        moedas[qtdade] = moeda;
        qtdade++;
        return true;
    }

    public Moeda retira(){
        if (qtdade == 0){
            return null;
        }else{
            qtdade--;
            return moedas[qtdade];
        }
    }


    public int getQtdadeMoedas(){
        return qtdade;
    }

    public int getQtdadeMoedasTipo(NomeMoeda nomeMoeda){
        int cont = 0;        
        for(int i=0;i<qtdade;i++){
            if (moedas[i].getNomeMoeda() == nomeMoeda){
                cont++;
            }
        }
        return cont;
    }

    public int getValorTotalCentavos(){
        int valorTotal = 0;        
        for(int i=0;i<qtdade;i++){
            valorTotal = valorTotal + moedas[i].getValorCentavos();
        }
        return valorTotal;
    }

    public double getValorTotalReais(){
        double valorTotal = 0;        
        for(int i=0;i<qtdade;i++){
            valorTotal = valorTotal + moedas[i].getValorReais();
        }
        return valorTotal;
    }
}