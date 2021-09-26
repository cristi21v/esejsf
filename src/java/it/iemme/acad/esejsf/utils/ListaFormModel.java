package it.iemme.acad.esejsf.utils;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="listaFormModel")
public class ListaFormModel {
    
    private String riferimento;

    public String getRiferimento() {
        return riferimento;
    }

    public void setRiferimento(String riferimento) {
        this.riferimento = riferimento;
    }
    
    
    
}
