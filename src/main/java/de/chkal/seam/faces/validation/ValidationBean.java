package de.chkal.seam.faces.validation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ValidationBean {

  private String text1;
  
  private String text2;
  
  public String action() {
    System.out.println("action(): "+text1+" + "+text2);
    return null;
  }

  public String getText1() {
    return text1;
  }

  public void setText1(String text1) {
    this.text1 = text1;
  }

  public String getText2() {
    return text2;
  }

  public void setText2(String text2) {
    this.text2 = text2;
  }
  
}
