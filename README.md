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

## 💁‍♀️ Informações gerais 💁‍♀️

### 🧾 Aplicação 🧾

1 - Rode o arquivo `Application.java`. A `Application.java` vai te pedir para `Informar o número da conta`;

2 - Após inserir o número, ele retornará o número da conta com no `máximo 6 digitos`;

3 - Caso o número tiver `menos que 6 caracters`, ele adicionará `0` para completar os números que faltam;

<strong>Exemplo:</strong>
````
Informe o número da conta:
1
Número da conta: 000001
````

4 - Caso o número tiver `mais de 6 caracters`, o código `tirará os números na frente` para obter `apenas 6 caracters`;

<strong>Exemplo:</strong>
````
Informe o número da conta:
123456789
Número da conta: 456789
````

5 - Caso tiver `a quantidade correta`, o código devolverá do jeito que está.

<strong>Exemplo:</strong>
````
Informe o número da conta:
123456
Número da conta: 123456
````

6 - E se o usuário mandar algo que `não for um número`, ele retornará uma mensagem de erro.

<strong>Exemplo:</strong>
````
Informe o número da conta:
abelha
Número da conta inválido!

````