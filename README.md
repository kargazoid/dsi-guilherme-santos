# Desenvolvimento de Software I
Aulas de Desenvolvimento de Software com o professor João Siles utilizando o Java.

## Baixando e configurando o Java no computador:

- Para usar o Java no computador primeiro é necessário instalar um JDK (Java Development Kit), que é um conjunto de ferramentas usadas para criar e executar um programa em Java.
- Após baixar um JDK compatível com seu sistema, é necessário seguir os passos da instalação.
- Durante a instalação precisamos habilitar as configurações automáticas do **Path** e a variável **Java_Home**, pois isso permite que o sistema reconheça os comandos do Java no terminal.

## Configurações básicas do Java:

- Todo programa criado no Java deve estar dentro de uma ``Class``, que é uma classe.
- O nome da classe principal deve sempre estar igual ao nome do arquivo, por exemplo, se o nome do arquivo é ``Main.java``, o nome da classe principal deve ser ``Main``.
- Toda instrução dada ao java deve terminar com ``;``.
- Exemplo de código escrito em Java criado em aula:
```
package  aula01;

public  class  Main {
	public  Main() {
	}
	public  static  void  main(String[] var0) {
		System.out.println("Hello World");
	}
}
```