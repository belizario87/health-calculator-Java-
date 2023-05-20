# Health Calculator

Este projeto consiste em um Calculador de Saúde, proposto como exercício 3.17 do Capítulo 3 do livro "How to Program in Java" por Paul Deitel. O usuário insere seus dados e o programa retorna o cálculo da frequência cardíaca máxima, frequência cardíaca alvo, Índice de Massa Corporal (IMC) e também a classificação do IMC do usuário.

## Sobre o projeto

O tema abordado é a informatização de registros de saúde. Esse assunto tem sido discutido recentemente na mídia devido às preocupações com a privacidade e segurança de dados sensíveis, entre outras razões. A informatização dos registros de saúde pode facilitar o compartilhamento de perfis e históricos de saúde entre vários profissionais de saúde. Isso pode melhorar a qualidade do atendimento médico, ajudar a evitar conflitos e prescrições erradas de medicamentos, reduzir os custos ambulatoriais e salvar vidas.

Neste exercício, foi criada uma classe "HealthProfile" para representar uma pessoa. Os atributos da classe incluem nome, sobrenome, gênero, data de nascimento (com atributos separados para mês, dia e ano), altura (em metros) e peso (em quilogramas) da pessoa. A classe possui um construtor que recebe esses dados. Para cada atributo, são fornecidos métodos de configuração e acesso. A classe também inclui métodos que calculam e retornam a idade em anos, a faixa de frequência cardíaca máxima e a frequência cardíaca alvo (conforme exercício 3.16), além do Índice de Massa Corporal (IMC, conforme exercício 2.33).

A aplicação Java solicita as informações da pessoa, instancia um objeto da classe HealthProfile com esses dados e imprime as informações desse objeto, incluindo nome, sobrenome, gênero, data de nascimento, altura e peso da pessoa. Em seguida, são calculados e impressos a idade em anos, o IMC, a faixa de frequência cardíaca máxima e a frequência cardíaca alvo. Também é exibido o gráfico dos valores de IMC conforme o exercício 2.33.

## Como executar o programa

1. Certifique-se de ter o ambiente Java configurado corretamente em seu sistema.
2. Baixe os arquivos do projeto para o seu computador.
3. Abra o terminal ou prompt de comando e navegue até o diretório onde os arquivos estão localizados.
4. Compile os arquivos Java utilizando o comando `javac` seguido do nome do arquivo principal:

   ```
   javac HealthCalculator.java
   ```

5. Execute o programa usando o comando `java` seguido do nome do arquivo principal:

   ```
   java HealthCalculator
   ```

6. Siga as instruções fornecidas pelo programa para inserir os dados pessoais e visualizar as informações de saúde.

## Requisitos do sistema

- Ambiente Java configurado corretamente.
- Sistema operacional que suporte a execução de aplicativos Java.

## Considerações finais

Este projeto demonstra a aplicação de conceitos de programação Java para criar um Calculador de Saúde que pode ser utilizado para calcular informações úteis sobre uma pessoa, como a frequência cardíaca máxima, frequência cardí



