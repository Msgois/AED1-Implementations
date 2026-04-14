public class ListaSimples2 {
    private Node head;

    public ListaSimples2() {
        this.head = null;
    }

    /** Insere 'item' no INICIO da lista (O(1)). */
    public void insertFirst(Object item) {

        this.head = new Node(item, this.head);
    }

    public void imprimir() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.item + " -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }
public Node find(Object item) {
    Node atual = head;
    while (atual != null) {
        if (atual.item.equals(item)) { 
            return atual;
        }
        atual = atual.next;
    }
    return null;
}

/** Insere um novo no com 'item' APOS o no 'x'. */
public void insertAfter(Node x, Object item) {
    if (x == null) return;
    Node novo = new Node(item);
    novo.next = x.next;
    x.next = novo;
}
 public static void main(String[] args) {
    ListaSimples2 lista = new ListaSimples2();
    
   
    lista.insertFirst("C");
    lista.insertFirst("B");
    lista.insertFirst("A");
    
    lista.imprimir(); 

    Node noB = lista.find("B");
    if (noB != null) {
        lista.insertAfter(noB, "B2");
    }
    
    lista.imprimir(); 
    Node noZ = lista.find("Z");
    System.out.println("Busca por Z: " + noZ);
}
}