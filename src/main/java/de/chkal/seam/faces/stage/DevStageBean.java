package de.chkal.seam.faces.stage;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.jboss.seam.faces.projectstage.Development;

@Named("stageBean")
@RequestScoped
@Development
public class DevStageBean {

    public String getMessage() {
        return "DEVELOPMENT";
    }

}
