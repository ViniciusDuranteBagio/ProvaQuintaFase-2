# ProvaQuintaFase - (Tema: Gestão de Transporte Urbano)

## Como iniciar a prova ?
- Clone esse repositorio
- Crie a branch com o seu nome (altere apenas sua branch)
- Faça as alterações necessarias e envie para sua branch
- Caso não consiga fazer isso na sua branch e enviar, comprima o projeto via zip e envia no ava
- 🎥 Tutorial Git: https://www.youtube.com/watch?v=vvn2ZKnT_e8

### 💬 Qualquer dúvida, fale com o professor. Boa sorte!!

## Ressolvam o problema a baixo: 
Uma cidade está desenvolvendo um sistema para gerenciar os custos mensais de diferentes meios de transporte público urbano. O objetivo do sistema é permitir o cadastro de veículos públicos e o cálculo automático de seus respectivos custos mensais, de acordo com o tipo de veículo e sua forma específica de cálculo.

Os veículos públicos que devem ser contemplados no sistema são: ônibus, táxi, bicicleta compartilhada, trem urbano e patinete elétrico. 

Cada um desses meios de transporte possui regras próprias para o cálculo do custo mensal. Ônibus possuem um custo fixo mensal. Táxis têm um custo fixo mais um custo variável, calculado com base no número de corridas realizadas no mês e no custo de cada corrida. Bicicletas compartilhadas têm seu custo mensal calculado com base na quantidade de bicicletas e no custo mensal de manutenção por unidade. Trens urbanos possuem um custo fixo e um adicional baseado na quantidade de quilômetros rodados no mês, multiplicado por um valor adicional por quilômetro. 
Já os patinetes elétricos são cobrados com base na quantidade de horas de uso no mês, multiplicada pelo custo por hora.

Todos os valores inseridos pelo usuário (como custo fixo, número de corridas, custo por unidade, etc.) devem ser validados para garantir que sejam maiores ou iguais a zero. Caso o usuário informe um valor negativo, o sistema deve exibir uma mensagem informando que o valor é inválido e atribuir automaticamente o valor zero, sem utilizar estruturas como try-catch, pois o tratamento de exceções ainda não foi abordado.

O sistema deve apresentar um menu interativo, que pode ser implementado via terminal ou utilizando JOptionPane, permitindo que o usuário escolha o tipo de veículo a ser cadastrado, insira os dados solicitados e visualize o custo mensal calculado. O programa deve permanecer em execução até que o usuário escolha explicitamente a opção de encerrar o sistema.

Por fim, devem ser implementados testes unitários para verificar o correto funcionamento do sistema, incluindo a criação de cada tipo de veículo e a verificação dos cálculos realizados, bem como a validação de entradas inválidas.

## Como será avaliado ? 
Critérios de Avaliação (Nota: 10 pontos)

✔️ (2 pontos) Criar corretamente a estrutura para armazenar de orientação a objetos.

✔️ (1 ponto) Criar todas as classes solicitadas.

✔️ (2 pontos) Implementar corretamente os atributos e métodos conforme descrito no enunciado.

✔️ (2 pontos) Implementar as validações e retornos padrão.

✔️ (1 ponto) Garantir os cálculos dos salarios corretos.

✔️ (1 ponto) Fazer os testes para garantir que tudo está funcionanco como deveria.

✔️ (1 ponto) Criar o menu interativo.
