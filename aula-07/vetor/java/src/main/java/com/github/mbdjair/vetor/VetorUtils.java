package com.github.mbdjair.vetor;

import java.util.*;


/**
 *
 */
public class VetorUtils {
    private VetorUtils() {
    }

    public static int obterMenorTemperatura(int[] teperaturas) {
        int menorTemperatura = Integer.MAX_VALUE;
        for (int temperaturaAtual :
                teperaturas) {
            if (temperaturaAtual < menorTemperatura) {
                menorTemperatura = temperaturaAtual;
            }
        }

        return menorTemperatura;
    }

    public static int obterSomatorioTemperaturasImpar(int[] teperaturas) {
        int somaTemperaturaImpar = 0;
        for (int temperaturaAtual :
                teperaturas) {
            if (temperaturaAtual % 2 == 1) {
                somaTemperaturaImpar = somaTemperaturaImpar + temperaturaAtual;
            }
        }

        return somaTemperaturaImpar;
    }

    public static int obterQuantidadeRepeticaoArray(int[] array, int valorProcurado) {
        int quantidadeRepeticoes = 0;
        for (int valorAtual :
                array) {
            if (valorAtual == valorProcurado) {
                quantidadeRepeticoes = quantidadeRepeticoes + 1;
            }
        }

        return quantidadeRepeticoes;
    }

    public static Map<Character, Integer> obterQuantidadeCadaLetra(String palavra) {
        Map<Character, Integer> quantidadeCadaLetra = new HashMap<>();
        for (char letraAtual : palavra.toCharArray()) {
            if (Character.isLetter(letraAtual)) {
                quantidadeCadaLetra.merge(
                        letraAtual,
                        1,
                        VetorUtils::incrementarQuantidade
                );
            }
        }
        return quantidadeCadaLetra;
    }


    private static int incrementarQuantidade(Integer quantidadeAnterior, Integer valorIncremento) {
        return quantidadeAnterior + valorIncremento;
    }

    public static String quantidadeCadaPalvra(String frase) {
        Map<String, Integer> quantidadeCadaPalavra = new HashMap<>();
        for (String letraAtual : frase.split(" ")) {
            quantidadeCadaPalavra.merge(
                    letraAtual,
                    1,
                    VetorUtils::incrementarQuantidade
            );
        }

        int maiorValorRepeticoes = 0;
        String palavraMaisRepetida = "";
        for (Map.Entry<String, Integer> entradaAtual :
                quantidadeCadaPalavra.entrySet()) {

            Integer valorAtual = entradaAtual.getValue();
            if (maiorValorRepeticoes < valorAtual) {
                maiorValorRepeticoes = valorAtual;
                palavraMaisRepetida = entradaAtual.getKey();
            }
        }

        return palavraMaisRepetida;
    }

    public static Collection<Integer> numeroSorteadoMaisFrequente() {
        Map<Integer, Integer> quantidadeCadaNumeroSorteado = new HashMap<>();
        Random random = new Random();
        for (int i = 1; i <= 1000000; i++) {
           final int numeroSorteado = random.nextInt(1001);
           quantidadeCadaNumeroSorteado.merge(numeroSorteado,1, VetorUtils::incrementarQuantidade);

        }

        int maiorValorRepeticoes = 0;
        List<Integer> numerosMaisSorteados = new ArrayList();
        for (Map.Entry<Integer, Integer> entradaAtual :
                quantidadeCadaNumeroSorteado.entrySet()) {

            Integer valorAtual = entradaAtual.getValue();
            if (maiorValorRepeticoes < valorAtual) {
                numerosMaisSorteados.clear();
            }else if(maiorValorRepeticoes <= valorAtual){
                numerosMaisSorteados.add(entradaAtual.getKey());
            }
        }
        numerosMaisSorteados.add(maiorValorRepeticoes);

        return numerosMaisSorteados;
    }




}
