public class revisaoMatriz {
    public static void main(String [] args){
        int [][] tabela = {{4,6}, {1,7}};

        for(int i=0; i < tabela.length; i++){
            for(int j=0; j < tabela.length; j++){
                System.out.print(tabela[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
}
