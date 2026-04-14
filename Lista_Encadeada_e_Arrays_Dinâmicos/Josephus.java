public class Josephus {
    public static void main(String[] args) {
        int N = 6;
        int M = 3;

        // Passo 1: Montar a lista circular
        Node primeiro = new Node(1);
        Node atual = primeiro;
        for (int i = 2; i <= N; i++) {
            Node novo = new Node(i); 
            atual.next = novo;       
            atual = novo;            
        }
        atual.next = primeiro; 

        // Passo 2: Simular a eliminacao
        Node anterior = atual; 
        atual = primeiro;
        System.out.println("Ordem de eliminacao:");
        
        while (atual.next != atual) { 
            
            for (int i = 0; i < M - 1; i++) {
                anterior = atual;
                atual = atual.next;
            }
            System.out.print(atual.item + " ");
            anterior.next = atual.next;
            atual = anterior.next;
        }
        System.out.println("\nSobrevivente: " + atual.item);
    }
}