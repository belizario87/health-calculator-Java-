
import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var paciente = new HealthProfile();

        System.out.println("Digite o seu nome: ");
        String nomeString = sc.next();
        paciente.setNome(nomeString);

        System.out.println("Digite o seu sobrenome: ");
        String sobreNomeString = sc.next();
        paciente.setSobrenome(sobreNomeString);

        System.out.println("Digite o dia do seu nascimento");
        int diaNascimento = sc.nextInt();
        paciente.setDia(diaNascimento);

        System.out.println("Digite o mes do seu nascimento");
        int mesNascimento = sc.nextInt();
        paciente.setMes(mesNascimento);

        System.out.println("Digite o ano do seu nascimento");
        int anoNascimento = sc.nextInt();
        paciente.setAno(anoNascimento);

        System.out.println("Insira sua altura: ");
        System.out.println("Exemplo -> para 1 metro e 70 centimetros digite 1,70");
        var altura = sc.nextDouble();
        paciente.setAltura(altura);

        System.out.println("Insira seu peso em kg: ");
        System.out.println("Exemplo -> para 80kg e 300 gramas digite 80,300");
        var peso = sc.nextDouble();
        paciente.setPeso(peso);

        displayData(paciente);
    }

    public static void displayData(HealthProfile data) {
        System.out.println("---------------------------------");
        System.out.println("Nome: " + data.getNome());
        System.out.println("sobrenome: " + data.getSobrenome());
        System.out.println("idade: " + data.calcularIdade());
        System.out.printf("Frequencia cardiaca maxima: %dHz %n", data.calcularFrequenciaMaxima());
        System.out.printf("Frequencia cardiaca alvo: %.2fHz %n", data.calcularFrequenciaAlvo());
        System.out.println("IMC: " + data.calcularIMC());
        System.out.println("Classificacao IMC: " + data.getClassificacaoIMC(data.calcularIMC()));

    }

}
