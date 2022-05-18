package solid_5_dip.solucao.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

  private String name;

  public Product(String name) {

    this.name = name;
  }

}