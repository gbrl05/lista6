import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int idadeM = 0;
        int idadeF = 0;
        int cM = 0;
        int cF = 0;
        String sexo;

        for(int i = 1 ; i <= 20 ; i++){
            System.out.print("Digite o sexo M/F:");
            sexo = scanner.nextLine();
            System.out.print("Digite a idade:");
            int idade = scanner.nextInt();
            scanner.nextLine();


            if(sexo.equalsIgnoreCase("M")){
                idadeM = idadeM + idade;
                cM = cM + 1;
            }else if(sexo.equalsIgnoreCase("F")){
                idadeF = idadeF + idade;
                cF = cF + 1;
            }else{
                System.out.println("Resposta Inválida");
                i--;
            }
        }
        double mediaM = idadeM / cM;
        double mediaF = idadeF / cF;

        System.out.println("A média de idade da poupulção masculina é " + mediaM);
        System.out.println("A média de idade da poupulção feminina é " + mediaF);
    }
}