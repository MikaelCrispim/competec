import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do arranjo: ");
        int tamanho = sc.nextInt();
        String[] nomes= new String[tamanho];
        String[] novo = new String[tamanho];

        System.out.println("---------------------------");
        for (int i=0; i < nomes.length; i++){
            System.out.println("Informe os nomes dos Pokemons");
            nomes[i] = sc.next();
            // System.out.println(nomes[i]);
        }
        System.out.println("---------------------------");

        for(int i=0; i < nomes.length; i++){
            int result = nomes[i].compareToIgnoreCase(nomes[i+1]);
            if(result > 0){
                result = nomes[1];
                System.out.println(result);
            }
        }

        // for(String s: novo){
        //     System.out.print(s + " ");
        // }
    }
}