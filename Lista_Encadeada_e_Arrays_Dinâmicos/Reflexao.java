/*
 * a) Custo da inserção no meio:
 * No Array Dinâmico, inserir no meio é custoso O(n) porque precisamos 
 * "empurrar" todos os elementos seguintes para a direita para abrir espaço. 
 * Na Lista Encadeada, se já temos a referência do nó, basta mudar dois 
 * ponteiros (O(1)), o que é muito mais eficiente para inserções frequentes.
 *
 * b) Custo de acesso por índice:
 * O Array Dinâmico é muito superior aqui (O(1)), pois o computador calcula o 
 * endereço de memória do índice instantaneamente. Na Lista Encadeada, 
 * o acesso é O(n), pois não há como "pular" para o meio; é preciso caminhar 
 * do início até o destino.
 *
 * c) Circularidade:
 * Sim, Josephus poderia ser resolvido com Array, mas seria ineficiente. 
 * Teríamos que usar o operador de módulo (%) para simular o círculo e, 
 * a cada remoção, deslocar todos os elementos para fechar o buraco. 
 * A lista circular é a estrutura natural para este problema, pois a 
 * remoção não exige deslocamento de outros dados.
 */