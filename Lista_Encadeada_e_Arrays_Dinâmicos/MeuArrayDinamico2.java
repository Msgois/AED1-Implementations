public class MeuArrayDinamico2 {
 private int [] dados ;
 private int tamanho ; // quantos elementos realmente existem

 public MeuArrayDinamico2 ( int capacidadeInicial ) {
 this . dados = new int [ capacidadeInicial ];
 this . tamanho = 0;
 }

/** Dobra a capacidade do array interno . */
private void resize () {
    int [] newdados = new int [(dados.length*2)];
    tamanho=dados.length;
    for(int i=0; i<dados.length;i++){
        newdados[i]=dados[i];
    }
    dados=newdados;
 }

 /** Adiciona ’valor ’ no final do array . */
 public void add ( int valor ) {
 if(tamanho == dados.length){
    resize();
     dados[tamanho]= valor;
     tamanho++;
 }else{
    dados[tamanho]= valor;
    tamanho++;
 }
 }

 /** Retorna o elemento na posicao ’indice ’. */
 public int get ( int indice ) {
 if ( indice < 0 || indice >= tamanho )
 throw new IndexOutOfBoundsException (" Indice invalido : " +

indice ) ;
 return dados [ indice ];
 }

 public int size () {
 return tamanho ;
 }

 /** Imprime o array no formato [a, b, c]. */
 public void imprimir () {
 StringBuilder sb = new StringBuilder ("[") ;
 for (int i = 0; i < tamanho ; i ++) {
 sb . append ( dados [ i ]) ;
 if ( i < tamanho - 1) sb . append (", ") ;
 }
 sb . append ("]") ;



 System . out . println ( sb . toString () ) ;
 }
 /** Remove o elemento na posicao ’indice ’. */
 public void remove ( int indice ) {
 if ( indice < 0 || indice >= tamanho )
 throw new IndexOutOfBoundsException (" Indice invalido : " + indice

) ;
for(int i=indice; i<tamanho-1;i++){
    dados[i]=dados[i+1];
}
tamanho--;
}

// === Teste ===
 public static void main ( String [] args ) {
 MeuArrayDinamico2 arr = new MeuArrayDinamico2 (2) ;
 arr . add (10) ;
 arr . add (20) ;
 arr . imprimir () ; // [10 , 20]
 arr . add (30) ; // deve fazer resize aqui !
 arr . add (40) ;
 arr . imprimir () ; // [10 , 20 , 30 , 40]
 System . out . println (" Tamanho : " + arr . size () ) ; // 4
 arr . remove (1) ; // remove o 20
arr . imprimir () ; // [10 , 30 , 40]
 arr . remove (0) ; // remove o 10             
 arr . imprimir () ; // [30 , 40]
 System . out . println (" Tamanho : " + arr . size () ) ; // 2
 }
}

