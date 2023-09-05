    import java.util.Scanner;

    public class Notas {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual sua nota?");
            double nota = scanner.nextDouble();

            if(nota >= 7){
                System.out.println("Aprovado");
            }
            else if (nota >= 4 && nota < 7 ){
                System.out.println("Exame");

            }
            else{
                System.out.println("Reprovado");
            }
        }




    }