public class Loja {

    public void depositaConta(Compra c, double v, String n, String[] a) {
        System.out.println("   Loja-nome-antes: " + n);
        System.out.print("   Loja-array-antes: ");
        for(int i=0; i<5; i++)
            System.out.print(a[i]);
        System.out.println();
        c.confirmar(v);
        n = "teste";
        for(int i=0,j=4; i<5; i++,j--)
            a[i] = ""+j;;
        System.out.print("   Loja-array-depois: ");
        for(int i=0; i<5; i++)
            System.out.print(a[i]);
        System.out.println();
        System.out.println("   Loja-nome-depois: " + n);
    }
    
}
