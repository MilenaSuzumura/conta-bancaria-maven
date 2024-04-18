# 🏦 Conta Bancaria Maven 🏦

Conta Bancaria Maven é uma atividade focada em praticar a ferramenta Maven e na utilização da dependência StringUtils para o acesso a conta bancaria.

<strong>OBS:</strong> ESSA ATIVIDADE FOI DESENVOLVIDA NA TRYBE.

<br>

## 📑 Informações básicas e Orientações 📑

<details>
  <summary><strong>⚙️ Técnologias usadas ⚙️</strong></summary><br>

* Java;
* Maven;
* StringUtils
</details>

<details>
  <summary><strong>⌨️ Instalando Dependências ⌨️</strong></summary><br>

Execute:  `mvn install`
</details>

<br>

## 👥 Informações gerais 👥

### 🏠 Class SmartHouse 🏠

<details>
  <summary><strong>💡 Controle da Lâmpada	💡</strong></summary><br>

1 - Criei um atributo chamado `lampada` do tipo `boolean` para classificar se a lampada está ligada ou apagada;

2 - Para mudar o estado da lampada, utilizei dois métodos: `ligarLampada` e `desligarLampada`;

3 - Para verificar o estado da lampada, basta chamar o método `isLampadaLigada` que retornará `true` ou `false`.

</details>

<details>
  <summary><strong>🌐 Conexão à Internet	🌐</strong></summary><br>

1 - Criei um método chamado `conectarInternet` que irá receber o atributo `connectionRate` do tipo `double` e deverá retornar `true`ou `false`;

2 - Para o atributo `connectionRate` ser true, a taxa de conexão deverá ser maior que 0.5, indicando uma conexão bem-sucedida;

3 - Caso o atributo `connectionRate` for menor ou igual a 0.5, o método deve retornar false, indicando que a conexão falhou.

</details>

<br>

### 👤 Residente 👤

<details>
  <summary><strong>🫂 Criando Residente	🫂</strong></summary><br>

1 - Criei vários atributos chamados: `nome` do tipo `String`, `idade` do tipo `int`, `peso` do tipo `double` e `altura` do tipo `double`;

2 - Criei um constructor para receber os valores do atributos e assim, poder ser acessado.

</details>

<details>
  <summary><strong>🧮 Cálculo do IMC	🧮</strong></summary><br>

1 - Criei um método chamado `calcularImc` que deverá retornar um `double` com o resultado do cálculo do IMC do residente;

2 - Para fazer o cálculo, precisei descobrir o resultado da `alturaAoQuadrado`. Ou seja, multipliquei `altura` pela `altura`;

3 - Após descobrir o valor de `alturaAoQuadrado`, dividi `peso` por `alturaAoQuadrado`.

</details>