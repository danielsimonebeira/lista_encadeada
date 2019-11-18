import java.util.*;

public class lista_nao_ordenada {

    private static class LISTA {
        public int num;
        public LISTA prox;
    }


    public static void main(String args[]) {

        Scanner entradaDados = new Scanner(System.in);
        LISTA inicio = null;
        LISTA fim = null;
        LISTA aux;
        LISTA anterior;

        int op, numero, achou;

        do {
            System.out.println("\nMenu de opções\n");
            System.out.println("[1] - Retornar tamanho da lista" +
                                "\n[2] - Buscar elemento na lista" +
                                "\n[3] - Inserir elemento no começo da lista" +
                                "\n[4] - Inserir elemento ao final da lista" +
                                "\n[5] - Remover elemento da lista" +
                                "\n[6] - Imprimir a lista na tela" +
                                "\n[7] - Esvaziar a lista" +
                                "\n[8] - Sair" +
                                "\nDigite sua opção: ");
            op = entradaDados.nextInt();

            if (op < 1 || op > 8) {
                System.out.println("Opção Inválida!");
            } else if (op == 1) {
                Integer tamanhoLista;
                if (inicio == null) {
                    System.out.println("Lista vazia!...");
                } else {
                    System.out.println("Tamanho da lista: ");
                    aux = inicio;
                    while (aux != null) {
                        aux = aux.prox;
                        System.out.println(" = " + aux);
                    }
                }
            } else if (op == 2) {
                System.out.print("\nDigite o elemento a ser procurado: ");
                numero = entradaDados.nextInt();
                aux = inicio;
                anterior = null;
                achou = 0;
                while (aux != null) {
                    if (aux.num == numero) {
                        achou = achou + 1;
                        if (aux == inicio) {
                            System.out.println("Numero encontrado está faz parte do inicio da lista");
                            aux = aux.prox;
                        } else if (aux == fim) {
                            System.out.println("Numero encontrado está faz parte do fim da lista");
                            aux = aux.prox;
                        }
                    }
                }
                if (achou == 0) {
                    System.out.println("Número Não encontrado...");
                } else if (achou == 1) {
                    System.out.println("Número encontrado: " + achou);
                }

            } else if (op == 3) {
                System.out.println("Digite o número a ser inserido no inicio da lista: ");
                LISTA novo = new LISTA();
                novo.num = entradaDados.nextInt();
                if (inicio == null) {
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                } else {
                    novo.prox = inicio;
                    inicio = novo;
                }

                System.out.println("Número inserido no inicio da lista!");
            }

            if (op == 4){
                System.out.println("Digite o numero a ser inserido no fim da lista: ");
                LISTA novo = new LISTA();
                novo.num = entradaDados.nextInt();
                if (inicio == null) {
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                } else {
                    fim.prox = novo;
                    fim = novo;
                    fim.prox = null;
                }
                System.out.println("Número inserido no fim da lista");
            }

            if (op == 5) {
                if (inicio == null) {
                    System.out.println("Lista vazia!...");
                } else {
                    System.out.print("\nDigite o elemento a ser removido: ");
                    numero = entradaDados.nextInt();
                    aux = inicio;
                    anterior = null;
                    achou = 0;
                    while (aux != null) {
                        if (aux.num == numero) {
                            achou = achou + 1;
                            if (aux == inicio) {
                                inicio = aux.prox;
                                aux = inicio;
                            } else if (aux == fim) {
                                anterior.prox = null;
                                fim = anterior;
                                aux = null;
                            } else {
                                anterior.prox = aux.prox;
                                aux = aux.prox;
                            }
                        } else {
                            anterior = aux;
                            aux = aux.prox;
                        }
                    }
                    if (achou == 0) {
                        System.out.println("Número Não encontrado...");
                    } else if (achou ==1) {
                        System.out.println("Número removido 1 vez...");
                    } else {
                        System.out.println("Numero removido" + achou + " veezes");
                    }
                }
            }

            if (op == 6) {
                if (inicio == null) {
                    System.out.println("Lista vazia!...");
                } else {
                    System.out.println("\nConsultando toda a lista\n");
                    aux = inicio;
                    while (aux != null) {
                        System.out.println(aux.num + " ");
                        aux = aux.prox;
                    }
                }
            }

            if (op == 7) {
                if (inicio == null) {
                    System.out.println("Lista vazia...");
                } else {
                    inicio = null;
                    System.out.println("Lista esvaziada...");
                }
            }
        } while (op != 8);
    }
}
