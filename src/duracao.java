import java.util.Scanner;
import java.util.Locale;

public class duracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int segundosTotais, horas, minutos, segundos;

        System.out.print("Digite a duração em segundos: ");
        segundosTotais = sc.nextInt();
        
        horas = segundosTotais / 3600;
        minutos = (segundosTotais % 3600) / 60;
        segundos = segundosTotais % 60;
        
        sc.close();
        System.out.printf("%s:%s:%s", horas, minutos, segundos);
    }
}
