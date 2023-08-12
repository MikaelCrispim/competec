import java.util.Scanner;

public class velha {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] velha = new int[3][3];
        // int jogada = 0;

        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                System.out.println("Jogada: ");
                velha[i][j] = sc.nextInt();
            }
            
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(velha[i][j] + " ");
            }
        }

        
            if(velha[0][0] == 1 && velha[1][0] == 1 && velha[2][0] == 1){
                    System.out.println("\n X ganhou");
            }else if(velha[0][0] == 0 && velha[1][0] == 0 && velha[2][0] == 0){
                    System.out.println("\n O ganhou");
            }else if(velha[0][1] == 1 && velha[1][1] == 1 && velha[2][1] == 1){
                    System.out.println("\n X ganhou");
            }else if(velha[0][1] == 0 && velha[1][1] == 0 && velha[2][1] == 0){
                    System.out.println("\n O ganhou");
            }else if(velha[0][2] == 1 && velha[1][2] == 1 && velha[2][2] == 1){
                    System.out.println("\n X ganhou");
            }else if(velha[0][2] == 0 && velha[1][2] == 0 && velha[2][2] == 0){
                    System.out.println("\n O ganhou");
            }else if(){
                
            }
        
        
    }
}
