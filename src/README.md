1) Considere as estruturas para implementação de uma lista duplamente
encadeada circular, não ordenada.
typedef int TipoChave;
typedef struct { TipoChave Chave; /* outros componentes */ } TipoItem;
typedef struct Celula_str *Ponteiro;
typedef struct Celula_str{TipoItem Item; Ponteiro esq; Ponteiro dir;} Celula;
typedef struct { Ponteiro Primeiro, Ultimo; int Tamanho; } TipoLista;
Construa as funções de manipulação desta estrutura de dados (e também
uma função main para administrar a lista, usando um menu de opções):

A) Fazer (criar) lista vazia.

B) Testar se lista está vazia.

C) Retornar tamanho da lista.

D) Buscar elemento na lista.

E) Inserir elemento ao final da lista.

F) Remover elemento da lista.

G)Imprimir a lista na tela.