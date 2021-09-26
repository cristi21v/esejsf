package it.iemme.acad.esejsf.utils;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.context.FacesContext;

public class Utilities {
    
    public static Object getBean(String beanName){
        FacesContext fc = FacesContext.getCurrentInstance();
        ELContext elc = fc.getELContext();
        ExpressionFactory ef = fc.getApplication().getExpressionFactory();
        ValueExpression ve = ef.createValueExpression(elc, "#{" + beanName + "}", Object.class);
        return ve.getValue(elc);
    }
    
}
