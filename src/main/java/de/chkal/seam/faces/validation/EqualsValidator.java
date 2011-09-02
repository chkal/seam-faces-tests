package de.chkal.seam.faces.validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;

import org.jboss.seam.faces.validation.InputElement;

@FacesValidator("EqualsValidator")
public class EqualsValidator implements Validator {

  private static final long serialVersionUID = 1L;

  @Inject
  private InputElement<String> text1;

  @Inject
  private InputElement<String> text2;

  @Override
  public void validate(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException {

    System.out.println("EqualsValidator: value1=" + (text1 != null ? text1.getValue() : "not injected"));
    System.out.println("EqualsValidator: value2=" + (text2 != null ? text2.getValue() : "not injected"));

    if (text1 == null || text2 == null || !text1.getValue().equals(text2.getValue())) {
      throw new ValidatorException(new FacesMessage("The values are not equal"));
    }

  }

}
