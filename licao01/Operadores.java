package licao01;

public class Operadores {

    public static void main(String[] args) {

        int x = 5;
        // Fala que o valor da variável x é 5

        x += 3;
        // Ele fala que x é igual a ele mesmo + 3, ou seja, soma 3 ao próprio x e faz x virar esse valor

        x -= 3;
        // Mesma coisa do +, mas com -

        x *= 3;
        // Mesma coisa do + e -, mas com multiplicação (que é feita com * em vez de x ou .)

        x /= 3;
        // Mesma coisa dos anteriores mas é pra divisão 

        x %= 3;
        // Ele divide x por 3 mas em vez de salvar o resultado, ele salva o resto (como se não tivesse feito nada depois da vírgula)

        x &= 3;
        // Faz um AND bit a bit entre x e 3 (x = x & 3)
        // Esse é mais difícil, ele pega o valor binário de x e o valor binário de 3 (0011) e vê quais bits estão ativos

        x |= 3;
        // Faz um OR bit a bit entre x e 3 (x = x | 3)
        // Se qualquer bit estiver ativo em um dos dois, ele fica ativo no resultado

        x ^= 3;
        // Faz um XOR bit a bit entre x e 3 (x = x ^ 3)
        // Só mantém ativo se forem diferentes

        x >>= 3; 
        // Desloca os bits de x 3 posições para a direita (x = x >> 3) 
        // Isso basicamente divide por 2 várias vezes

        x <<= 3;
        // Desloca os bits de x 3 posições para a esquerda (x = x << 3)
        // Isso basicamente multiplica por 2 várias vezes
    }
}