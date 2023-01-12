package com.groupstudy.groupstudy;

public class Estudo {

    public void run() {
//        Operadores relacionais:
//
//        igual: ==
//        menor: <
//        maior: >
//        maior ou igual: >=
//        menor ou igual: <=
//        Exemplos usando esses operadores

        int idade = 21;
        boolean eEmancipado = true;

        if (idade >= 18) {
            Utils.print("Maior de idade");
        }

        if (idade < 18) {
            Utils.print("Menor de idade de idade");
        }

        if (idade == 0) {
            Utils.print("Recém Nascido");
        }

//        Operadores lógicos:

//        AND: &&
//        OR: ||
//        Exemplos usando esses operadores

        if (idade < 18 && idade > 13) {
            Utils.print("adolescente");
        }

        // Obseravção: Não existe nenhuma regra que impede usar dois operadores juntos, veja que nesse exemplo, usamos os dois operadores: Relacional e lógico
        if (idade > 18 || eEmancipado) {
            Utils.print("Responde pelo seus atos");
        }


//       Tipos de condicionais
//        IF ELSE

//        Com apenas um if
        if (idade >= 18) {
            Utils.print("Maior de idade");
        }

//        Com if e else
        if (idade >= 18) {
            Utils.print("Maior de idade");
        } else {
            Utils.print("Menor de idade");
        }

//        Com mais de um if e else
        if (idade >= 18) {
            Utils.print("Adulto");
        } else if (idade > 13) {
            Utils.print("adolescente");
        } else {
            Utils.print("Criança");
        }

//      Switch

        switch (idade) {
            case 11:
                Utils.print("Tem 11 anos");
                break;
            case 12:
                Utils.print("Tem 12 anos");
            case 13:
                Utils.print("Tem 13 anos");
                break;
            default:
                Utils.print("Idade desconhecida");
        }
    }
}
