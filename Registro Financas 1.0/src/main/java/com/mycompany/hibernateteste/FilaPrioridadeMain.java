package com.mycompany.hibernateteste;

import java.util.Scanner;

class Elemento {
    float valor;
    String categoria;
}

class FilaPrioridade {
    Elemento[] elementos;
    int tamanho;
    int capacidade;

    public FilaPrioridade(int capacidade) {
        this.elementos = new Elemento[capacidade];
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    void trocar(Elemento a, Elemento b) {
        Elemento temp = new Elemento();
        temp.valor = a.valor;
        temp.categoria = a.categoria;

        a.valor = b.valor;
        a.categoria = b.categoria;

        b.valor = temp.valor;
        b.categoria = temp.categoria;
    }

    void empurrar(float valor, String categoria) {
        if (tamanho == capacidade) {
            System.out.println("A fila de prioridades está cheia");
            return;
        }

        Elemento novoElemento = new Elemento();
        novoElemento.valor = valor;
        novoElemento.categoria = categoria;

        elementos[tamanho] = novoElemento;
        int indiceAtual = tamanho;
        tamanho++;

        while (indiceAtual > 0) {
            int indicePai = (indiceAtual - 1) / 2;
            if (elementos[indiceAtual].valor > elementos[indicePai].valor) {
                trocar(elementos[indiceAtual], elementos[indicePai]);
                indiceAtual = indicePai;
            } else {
                break;
            }
        }
    }

    Elemento extrairMaximo() {
        Elemento elementoVazio = new Elemento();
        elementoVazio.valor = 0;

        if (tamanho <= 0) {
            System.out.println("A fila de prioridades está vazia");
            return elementoVazio;
        }

        Elemento maximo = elementos[0];

        elementos[0] = elementos[tamanho - 1];
        tamanho--;

        int indiceAtual = 0;
        while (true) {
            int filhoEsquerdo = 2 * indiceAtual + 1;
            int filhoDireito = 2 * indiceAtual + 2;
            int indiceMaior = indiceAtual;

            if (filhoEsquerdo < tamanho && elementos[filhoEsquerdo].valor > elementos[indiceMaior].valor) {
                indiceMaior = filhoEsquerdo;
            }

            if (filhoDireito < tamanho && elementos[filhoDireito].valor > elementos[indiceMaior].valor) {
                indiceMaior = filhoDireito;
            }

            if (indiceMaior != indiceAtual) {
                trocar(elementos[indiceAtual], elementos[indiceMaior]);
                indiceAtual = indiceMaior;
            } else {
                break;
            }
        }

        return maximo;
    }

    void imprimirFila() {
        System.out.println("Elementos na fila de prioridades:");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Valor=%.2f, Categoria=%s", elementos[i].valor, elementos[i].categoria);
            if (i == 0) {
                System.out.println(" (Alta prioridade)");
            } else {
                System.out.println();
            }
        }
    }
}

public class FilaPrioridadeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a capacidade da fila: ");
        int capacidadeFila = scanner.nextInt();

        FilaPrioridade fila = new FilaPrioridade(capacidadeFila);

        int opcao;
        float valor;
        String categoria;

        do {
            System.out.println("\n1. Inserir elemento na fila");
            System.out.println("2. Extrair elemento de maior valor");
            System.out.println("3. Imprimir fila de prioridades");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor: ");
                    valor = scanner.nextFloat();
                    System.out.print("Digite a categoria: ");
                    categoria = scanner.next();
                    fila.empurrar(valor, categoria);
                    break;

                case 2:
                    System.out.println("Extraindo elemento de maior valor...");
                    Elemento maximo = fila.extrairMaximo();
                    if (maximo.valor != 0) {
                        System.out.printf("Elemento de maior valor: Valor=%.2f, Categoria=%s\n", maximo.valor, maximo.categoria);
                    }
                    break;

                case 3:
                    fila.imprimirFila();
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}