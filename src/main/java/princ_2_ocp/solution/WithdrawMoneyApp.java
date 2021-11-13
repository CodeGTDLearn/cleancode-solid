package princ_2_ocp.solution;

import princ_2_ocp.solution.accounts.*;

public class WithdrawMoneyApp {

  public static void main(String[] args) {
//https://mari-azevedo.medium.com/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299

    // PRINCIPIO 02: OPEN-CLOSE
    // You should be able to extend a classes behavior, without modifying it.
    // “as entidades (classes, módulos, funções etc.)
    // devem ser abertas para ampliação, mas fechadas para modificação”
    // De forma mais detalhada, diz que podemos estender o comportamento de uma classe,
    // quando for necessário, por meio de herança/interface/composição,
    // mas não podemos permitir a abertura dessa classe para fazer modificações.

    //SOLUCAO:
    //
    // A cada nova modalidade de Account
    // Precisarei executar as seguintes etapas:
    // A) cria-la 'herdando' a abstracao "WithdrawAbstraction"
    //    OBS: Nenhuma alteracao sera feita (preserva o SOLID 02)

    // FINAL:
    // * VANTAGEM:
    //     PERMITE DIFERENTES IMPLEMENTACOES(METODOS DE WITHDRAW), EM DIFERENTES MODULOS DO 'APP'
    // * DESVANTAGEM:
    //     CASO NECESSITE DE TROCAR ALGUMAS/TODAS IMPLEMENTACOES, HAVERA MUDANCAS EM DIFERENTES MODULOS
    //     ==> P/ TROCAR A DEPENDENCIA, PRECISARA ABRIR/ALTERAR O MODULO/CLASSE
    //     ==> MODIFICA A CLASSE QUE USA A DEPENDENCIA

    // APLICACAO DO CONCEITO EM DIFERENTES LOCAIS/MODULOS/CLASSES - 02 MOVIMENTOS:

    // MODULO 01 - PESSOA JURIDICA:
    // 01) GERA DEPENDENCIA "DENTRO" DA CLASSE:
    WithdrawAbstraction PJwithdraw = new Savings();

    // 02) USA DEPENDENCIA GERADA
    PJwithdraw.withDraw(111);

    // MODULO 02 - PESSOA FISICA:
    // 01) GERA DEPENDENCIA "DENTRO" DA CLASSE:
    WithdrawAbstraction PFwithdraw = new Tfsa();

    // 02) USA DEPENDENCIA GERADA
    PFwithdraw.withDraw(111);


  }
}