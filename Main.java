public class Main {

    public static void main(String[] args) {
        Compra c1;
        Loja l1;
        double v1;
        String n1;
        String[] a1 = new String[5];
        c1 =  new Compra();
        l1 = new Loja();
        v1 = 5;
        n1 = "Maria";
        for(int i=0; i<5; i++)
            a1[i] = ""+i;
        System.out.println("Main-valor-antes: " + v1);
        System.out.println("Main-compra-antes: " + c1.getValorAtual()); 
        System.out.println("Main-nome-antes: " + n1);
        System.out.print("Main-array-antes: ");
        for(int i=0; i<5; i++)
            System.out.print(a1[i]);        
        System.out.println();
        l1.depositaConta(c1,v1,n1,a1);
        System.out.println("Main-valor-depois: " + v1);
        System.out.println("Main-compra-depois: " + c1.getValorAtual());        
        System.out.println("Main-nome-depois: " + n1);
        System.out.print("Main-array-depois: ");
        for(int i=0; i<5; i++)
            System.out.print(a1[i]);        
        System.out.println();
    }
}
