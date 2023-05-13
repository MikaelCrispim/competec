import java.util.Scanner;
import java.text.NumberFormat;

public class Aula1 {
    public static void main(String[] args) {
        // Double abacaxi = 7.30;
        // Double maca = 2.;
        // Double pera = 3.;

        // NumberFormat f = NumberFormat.getCurrencyInstance();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Digite quantos Abacaxis você deseja: ");
        // abacaxi *= sc.nextInt();

        // System.out.println("Digite quantas Maçãs você deseja: ");
        // maca *= sc.nextInt();

        // System.out.println("Digite quantas pêras você deseja: ");
        // pera *= sc.nextInt();

        // double result = abacaxi + maca + pera;
        // String resultadoFormat = f.format(result);
        // System.out.println("O valor total das suas compras foi de R$"+resultadoFormat);
        
        Scanner sc = new Scanner(System.in);
        
        // int x,
        // y;

        // System.out.println("Digite a primeira idade: ");
        // x = sc.nextInt();
        // System.out.println("Digite a segunda idade: ");
        // y = sc.nextInt();

        // if(x == y){
        //     System.out.println("Idades iguais");
        // }else if (x > y){
        //     System.out.println("X é mais velho");
        // }else {
        //     System.out.println("Y é mais velho");
        // }

        // Boolean chuva;
        // Boolean nublado;

        // System.out.println("Está chovendo: ");
        // chuva = sc.nextBoolean();
        // System.out.println("Está nublado: ");
        // nublado = sc.nextBoolean();

        // if ( chuva == true || nublado == true){
        //     System.out.println("Está chovendo ou nublado");
        // }else {
        //     System.out.println("Está ensolarado");
        // }

        // Boolean chuva;
        // Boolean guardaChuva;

        // System.out.println("Está chovendo: ");
        // chuva = sc.nextBoolean();
        // System.out.println("Trouxe guarda-chuva: ");
        // guardaChuva = sc.nextBoolean();

        // if (chuva == true && guardaChuva == true){
        //     System.out.println("Está chovendo e eu to de guarda-chuva");
        // }else if(chuva == true && guardaChuva == false){
        //     System.out.println("Está chovendo e eu to sem guarda-chuva");
        // }

        // char opcao;
        // System.out.println("Qual opção você deseja fazer: ");
        // System.out.println("A - DEPOSITO \n __\n B - SAQUE \n __\n C - EMPRESTIMO ");
        // opcao = sc.next().charAt(0);
        // switch(opcao){
        //     case 'a':
        //         System.out.println("Você escolheu a opção deposito, siga...");
        //         break;
        //     case 'b':
        //         System.out.println("Você escolheu a opção saque, siga...");
        //         break;
        //     case 'c':
        //         System.out.println("Você escolheu a opção emprestimo, siga...");
        //         break;
        //     default:
        //         System.out.println("Digite uma opção valida");
        //         break;    
        // }

        int opcao;
        System.out.println("Digite um número: ");
        opcao = sc.nextInt();

        if (opcao % 3 == 0 || opcao % 5 == 0){
            System.out.println("É multiplo de 3 ou 5");
        }else{
            System.out.println("É falso");
        }
    }
}