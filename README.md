# 📘 Desenvolvimento de Software I

Aulas de Desenvolvimento de Software com o professor **João Siles**, utilizando a linguagem **Java**.

---

## ☕ Configuração do Java

Para desenvolver em Java, é necessário instalar o **JDK (Java Development Kit)**, que contém as ferramentas para criar e executar programas.

### 🔽 Passos:

1. Baixar um JDK compatível com seu sistema operacional  
2. Executar a instalação normalmente  
3. Durante a instalação, habilitar:
   - `Path`
   - `JAVA_HOME`  

Essas configurações permitem executar comandos Java diretamente no terminal.

---

## 🧱 Estrutura básica de um programa Java

- Todo programa deve estar dentro de uma **classe (`class`)**
- O nome da classe principal deve ser igual ao nome do arquivo  
  - Exemplo: `Main.java` → `class Main`
- Toda instrução termina com `;`

### 💻 Exemplo:

```java
package aula01;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

## 🔧 Operadores de Atribuição

Os operadores de atribuição permitem modificar o valor de uma variável utilizando o valor atual dela.

### 🧠 Exemplos:

```java
public class OperadoresAtribuicao {
    public static void main(String[] args) {

        int x = 5; // Atribui 5 à variável

        x += 3; // x = x + 3 (soma)
        x -= 3; // x = x - 3 (subtração)
        x *= 3; // x = x * 3 (multiplicação)
        x /= 3; // x = x / 3 (divisão)
        x %= 3; // x = x % 3 (resto da divisão)

        x &= 3; // AND bit a bit
        x |= 3; // OR bit a bit
        x ^= 3; // XOR bit a bit

        x >>= 3; // desloca bits para direita
        x <<= 3; // desloca bits para esquerda
    }
}
```

---

## 📌 Observação

Todos esses operadores seguem a mesma lógica:

> Pegam o valor atual da variável, aplicam uma operação e salvam o resultado nela mesma.

Exemplo:

```java
x += 3; // equivalente a x = x + 3
```

---
