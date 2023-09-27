package br.com.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

  @Getter
  @Setter
  @AllArgsConstructor
public class User {

  private Long id;
  private String name;
  private String username;


}
