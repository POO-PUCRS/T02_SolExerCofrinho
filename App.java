public class App{
    public static void main(String args[]){
        Cofrinho c = new Cofrinho();

        c.insereMoeda("Real");
        c.insereMoeda("50");
        c.insereMoeda("25");
        c.insereMoeda("Real");
        c.insereMoeda("5");
        c.insereMoeda("50");
        c.insereMoeda("Real");
        c.insereMoeda("10");
        c.insereMoeda("Real");
        c.insereMoeda("25");

        System.out.println("Quantidade de moedas inseridas: "+c.getQtdadeMoedas());
        System.out.println("Quantidade de moedas de 1 real: "+c.getQtdadeMoedasTipo("Real"));
        System.out.println("Quantidade de moedas de 50 centavos: "+c.getQtdadeMoedasTipo("50"));
        System.out.println("Valor total: "+c.getValorTotal());
        System.out.println("Moeda retirada: "+c.retiraMoeda());
        System.out.println("Valor total: "+c.getValorTotal());
    }
}