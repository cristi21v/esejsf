package it.iemme.acad.esejsf.services;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="mioServizio")
@ApplicationScoped
public class ServizioImpl  implements Servizio{
    
    private List<String> lista = new ArrayList<String>();

    @Override
    public void addString(String s) {
        this.lista.add(s);
    }

    @Override
    public List<String> estraiLista() {
        return this.lista;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    @Override
    public void clear() {
        this.lista.clear();
    }
    
    
    
}
