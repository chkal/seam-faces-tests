package de.chkal.seam.faces.validation;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ValidationBean {

  private String text1;

  private String text2;

  @Inject
  private FacesContext facesContext;

  public String action() {
    System.out.println("Action meothod got text1=" + text1 + ", text2=" + text2);
    facesContext.addMessage(null, new FacesMessage("Valdiation success!"));
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
