import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] genes = new int [n];

        System.out.println("---------------------------");
        for (int i=0; i < genes.length; i++){
            genes[i] = sc.nextInt();
        }
        System.out.println("Numero para comparar: ");
        int numero = sc.nextInt();
        int cont = 0;

        for(int i=0; i < genes.length; i++){
                if(numero == genes[i]){
                    cont++;
                }
        }

        if (cont > 1){
                System.out.println("Achei o danado");
        }else if(cont == 1) {
                System.out.println("Não foi suficiente");
        }else if(cont == 0){
                System.out.println("Sumiuu");               
        }

    }
}
