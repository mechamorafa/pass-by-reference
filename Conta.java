public class Compra {

    private double valorAtual = 0.0;
    
    public double getValorAtual() {
        return valorAtual;
    }
    
    public void confirmar(double valor) {
        System.out.println("      Conta-valor-antes: " + valor);
        System.out.println("      Conta-saldo-antes: " + this.valorAtual);
        valorAtual += valor;
        valor = -11;
        System.out.println("      Conta-valor-depois: " + valor);
        System.out.println("      Conta-saldo-depois: " + this.valorAtual);
    }
    
}
