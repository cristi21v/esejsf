package it.iemme.acad.esejsf.controller;

import it.iemme.acad.esejsf.services.Servizio;
import it.iemme.acad.esejsf.services.ServizioImpl;
import it.iemme.acad.esejsf.utils.ListaFormModel;
import it.iemme.acad.esejsf.utils.Utilities;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import lombok.Data;


@ManagedBean(name="eseController")
public class EseController {
    
    @ManagedProperty("#{mioServizio}")
    private Servizio servizio;
    
    public String vaiPaginaTre(){
        System.out.println("Sono passato per il controller e ciao");
        return "paginaTre";
    }
    
    public void inserisci(){
        ListaFormModel lfl = (ListaFormModel) Utilities.getBean("listaFormModel");
        servizio.addString(lfl.getRiferimento());
        lfl.setRiferimento("");
        
    }
    
    public void cancella(){
        servizio.clear();
    }

    public Servizio getServizio() {
        return servizio;
    }

    public void setServizio(Servizio servizio) {
        
        this.servizio = servizio;
    }
    
}
