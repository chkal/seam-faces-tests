package de.chkal.seam.faces.stage;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.jboss.seam.faces.projectstage.Production;

@Named("stageBean")
@RequestScoped
@Production
public class ProdStageBean {

    public String getMessage() {
        return "PRODUCTION";
    }

}
