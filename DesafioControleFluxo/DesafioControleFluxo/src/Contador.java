import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }

        else{
            int contador = parametroDois - parametroUm;
            for(int i = 1; i <= contador; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
