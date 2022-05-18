package solid_4_isp.solution.advanced.interfaces;

// PRINCIPIO 04: INTERFACE SEGREGATION
// Make fine grained interfaces that are client specific.
// muitas interfaces específicas são melhores do que uma interface geral
public interface Client_I extends General_I {

  void addClient();

}