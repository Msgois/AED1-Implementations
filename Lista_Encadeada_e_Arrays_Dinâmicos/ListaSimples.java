public class ListaSimples {
    private Node head;

    public ListaSimples() {
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
    public static void main ( String [] args ) {
ListaSimples lista = new ListaSimples () ;
 lista . insertFirst ("C") ;
 lista . insertFirst ("B") ;
 lista . insertFirst ("A") ;


 lista . imprimir () ; // A -> B -> C -> null
 }
 }
