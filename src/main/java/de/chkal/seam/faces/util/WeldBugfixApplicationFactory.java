package de.chkal.seam.faces.util;

import javax.faces.application.Application;
import javax.faces.application.ApplicationFactory;

public class WeldBugfixApplicationFactory extends ApplicationFactory {

  private Application application;
  private final ApplicationFactory delegate;
  
  public WeldBugfixApplicationFactory(ApplicationFactory delegate) {
    this.delegate = delegate;
  }
  
  @Override
  public Application getApplication() {
    if(application == null) {
      application = delegate.getApplication();
    }
    return application;
  }

  @Override
  public void setApplication(Application application) {
    delegate.setApplication(application);
    this.application = application;;
  }

}
