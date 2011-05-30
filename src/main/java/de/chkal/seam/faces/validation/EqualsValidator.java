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

  @Inject
  private InputElement<String> text1;

  @Inject
  private InputElement<String> text2;

  @Override
  public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
      throws ValidatorException {

    System.out.println("------------> "+(text1 != null ? text1.getValue() : "not injected"));
    System.out.println("------------> "+(text2 != null ? text2.getValue() : "not injected"));
    
    throw new ValidatorException( new FacesMessage("Failed1", "Failed2") );
    
    
  }

}
