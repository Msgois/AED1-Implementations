public class MeuArrayDinamico {
2 private int [] dados ;
3 private int tamanho ; // quantos elementos realmente existem
4
5 public MeuArrayDinamico ( int capacidadeInicial ) {
6 this . dados = new int [ capacidadeInicial ];
7 this . tamanho = 0;
8 }
9
10 /** Dobra a capacidade do array interno . */
11 private void resize () {
12 // TODO 1a: crie um novo array com o dobro do tamanho
13 // TODO 1b: copie cada elemento de ’dados ’ para o novo array
14 // TODO 1c: faca ’dados ’ apontar para o novo array
15 }
16
17 /** Adiciona ’valor ’ no final do array . */
18 public void add ( int valor ) {
19 // TODO 2a: se tamanho == dados . length , chame resize ()
20 // TODO 2b: coloque ’valor ’ na posicao ’tamanho ’
21 // TODO 2c: incremente ’tamanho ’
22 }
23
24 /** Retorna o elemento na posicao ’indice ’. */
25 public int get ( int indice ) {
26 if ( indice < 0 || indice >= tamanho )
27 throw new IndexOutOfBoundsException (" Indice invalido : " +

indice ) ;
28 return dados [ indice ];
29 }
30
31 public int size () {
32 return tamanho ;
33 }
34
35 /** Imprime o array no formato [a, b, c]. */
36 public void imprimir () {
37 StringBuilder sb = new StringBuilder ("[") ;
38 for (int i = 0; i < tamanho ; i ++) {
39 sb . append ( dados [ i ]) ;
40 if ( i < tamanho - 1) sb . append (", ") ;
41 }
42 sb . append ("]") ;

2

43 System . out . println ( sb . toString () ) ;
44 }
45
46 // === Teste ===
47 public static void main ( String [] args ) {
48 MeuArrayDinamico arr = new MeuArrayDinamico (2) ;
49 arr . add (10) ;
50 arr . add (20) ;
51 arr . imprimir () ; // [10 , 20]
52 arr . add (30) ; // deve fazer resize aqui !
53 arr . add (40) ;
54 arr . imprimir () ; // [10 , 20 , 30 , 40]
55 System . out . println (" Tamanho : " + arr . size () ) ; // 4
56 }
57 }