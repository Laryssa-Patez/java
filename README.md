# Repositório de Estudos: Java, Spring Boot, Docker e mais

Repositório dedicado aos meus estudos em Java.

Aqui você encontrará estudos práticos envolvendo:

✅ Programação com Java

☕ Fundamentos da linguagem Java

🌱 Desenvolvimento com Spring Boot

🐳 Criação e uso de containers com Docker

☁️ Integração com serviços da AWS

<h2 align="left">🧠 Aprendizados e Aplicações Práticas</h2>
<Sumary>
<details>
<summary>
<strong>JRE e JDK - Compile e execute o seu programa</strong></summary>
<ul><li><em>JVM? JDK? JRE? O que são essas siglas?</em></li>
<li><em>Tipos e variáveis</em></li> 
<li><em>Trabalhando com caracteres</em></li> 
<li><em>Praticando condicionais</em></li>
<li><em>Controlando fluxos com laços</em></li>
</details>

<Sumary>
<details>
<summary>
<strong>Java OO - Entendendo a orientação a objetos</strong></summary>
<ul><li><em>Orientação a objetos: Instância, atributos e referências</em></li>
<li><em>Definindo métodos</em></li> 
<li><em>Composição de objetos</em></li> 
<li><em>Encapsulamento e visibilidade</em></li>
<li><em>Construtores e membros estáticos</em></li>
</details>


<Sumary>
<details>
<summary>
<strong>Java Polimorfismo - Entenda herança e interfaces</strong></summary>
<ul><li><em>Reuse código com classes Herança e Composição</em></li>
<li><em>Implemente interface e métodos abstratas</em></li> 
<li><em>Entenda o que é Polimorfismo</em></li> 
<li><em>Aprenda sobre reescrita e herança de métodos</em></li>
<li><em>Conheça super e protected</em></li>
<div align="center">
<img  style="margin: 10px;" src="https://github.com/LaryssaPatez/java/blob/master/Java%20Polimorfismo%20-%20Entenda%20Heran%C3%A7a%20e%20Interfaces/Image.png?raw=true" alt=""  width="350">
</div>
</details>

<Sumary>
<details>
<summary>
<strong>Java Exceções - aprenda a criar, lançar e controlar exceções</strong></summary>
<ul><li><em>Conheça a pilha de execução</em></li>
<li><em>Use o modo de depuração (debug)</em></li> 
<li><em>Entenda o tratamento de exceções com Try Catch</em></li> 
<li><em>Crie suas próprias exceções checked e unchecked</em></li>
<li><em>Lance as exceções para mudar o fluxo de seu programa</em></li>
</details>
  
<Sumary>
<details>
<summary>
<strong>Threads</strong></summary>
<ul><li><em>add descrição</em></li>
</details>

<details>
<summary>
<strong>QRCodeGenerator</strong></summary>
<ul>
  <li><em>Aplicação desenvolvida em Java com Spring Boot, empacotada com Docker</em></li>
  <li><em>Integração com AWS para armazenamento das imagens de QR Code</em></li>
  <li><em>Geração de QR Codes a partir de URLs enviadas via requisição POST</em></li>
  <li><em>Estudo prático de controllers REST, classes de serviço e integração com bibliotecas de geração de QR Code</em></li>
  <li><em>Envie uma requisição POST para <code>http://localhost:8080/qrcode</code>, contendo no body um JSON com o campo <code>text</code> e a URL que deseja transformar em QR Code.</em></li>
    <ul>
      <li><em>Requisição de exemplo:</em>
        <pre>
  {
    "text": "https://github.com/Laryssa-Patez"
  }
        </pre>
      </li>
    </ul>
  <li><em>A aplicação retornará um link contendo a imagem do QR Code gerado</em></li>
</ul>
</details>
