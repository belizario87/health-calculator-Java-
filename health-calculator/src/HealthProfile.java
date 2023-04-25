
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

/*
(Computadorização dos registros de saúde) Uma questão relacionada à assistência médica discutida ultimamente nos veículos de
comunicação é a computadorização dos registros de saúde. Essa possibilidade está sendo abordada de maneira cautelosa por causa de preo-
cupações quanto à privacidade e à segurança de dados sigilosos, entre outros motivos. [Iremos discutir essas preocupações em exercícios
posteriores.] A computadorização dos registros de saúde pode facilitar que pacientes compartilhem seus perfis e históricos de saúde entre
vários profissionais de saúde. Isso talvez aprimore a qualidade da assistência médica, ajude a evitar conflitos e prescrições erradas de me-
dicamentos, reduza custos em ambulatórios e salve vidas. Neste exercício, você projetará uma classe HealthProfile “inicial” para uma
pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados para mês, dia
e ano de nascimento), altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados.
Para cada atributo, forneça métodos set e get. A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos,
intervalo de frequência cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de índice de massa corporal (IMC; veja
o Exercício 2.33). Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e
então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir
o gráfico de valores IMC do Exercício 2.33 
*/

public class HealthProfile {

    private String nome;
    private String sobrenome;
    private char sexo;
    private int dia;
    private int mes;
    private int ano;
    private double altura;
    private double peso;

    public HealthProfile() {
    };

    public HealthProfile(String nome, String sobrenome, char sexo, int dia, int mes, int ano, double altura,
            double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularIdade() {
        int anoAtual = Year.now().getValue();

        return anoAtual - this.ano;
    }

    public int calcularFrequenciaMaxima() {
        return 220 - calcularIdade();
    }

    public double calcularFrequenciaAlvo() {
        double calculoFrequenciaAlvo = calcularFrequenciaMaxima() * 0.6;

        return calculoFrequenciaAlvo;
    }

    public double calcularIMC() {
        double resultadoIMC = this.peso / (this.altura * this.altura);
        return resultadoIMC;
    }

    public static Map<Double, String> tabela = new HashMap<>();

    {
        tabela.put(18.5, "Abaixo do peso");
        tabela.put(24.9, "Peso normal");
        tabela.put(29.9, "Sobrepeso");
        tabela.put(34.9, "Obesidade grau I");
        tabela.put(39.9, "Obesidade grau II");
        tabela.put(Double.MAX_VALUE, "Obesidade grau III");
    }

    public String getClassificacaoIMC(double resultadoIMC) {

        String classificacao = null;
        for (Map.Entry<Double, String> entrada : tabela.entrySet()) {
            if (resultadoIMC <= entrada.getKey()) {
                classificacao = entrada.getValue();
            }

        }
        return classificacao;
    }

    public void displayData(HealthProfile data) {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("Idade: " + data.calcularIdade());

        System.out.println("Frequencia cardiaca maxima: " + data.calcularFrequenciaMaxima());
        System.out.println("Frequencia cardiaca Alvo: " + data.calcularFrequenciaAlvo());
        System.out.println("IMC: " + data.calcularIMC());
        System.out.println("Classificacao IMC: " + data.getClassificacaoIMC(data.calcularIMC()));

    }

}
