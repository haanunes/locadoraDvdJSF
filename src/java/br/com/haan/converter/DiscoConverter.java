/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.haan.converter;

import br.com.haan.vo.Disco;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;
import javax.faces.convert.Converter;


 @FacesConverter(value = "DiscoConverter")
public class DiscoConverter  implements Converter {

   
    public DiscoDAO getDAO() {
        return  new DiscoDAO();
    }


    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
         if (value != null) {
            Disco objeto = (Disco) value;
            return objeto.getId()+"";
        }

        return null;
    }
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null && value.trim().length() > 0) {
            Integer id = Integer.valueOf(value);
            return getDAO().getPegarPorId(id);
        }

        return null;
    }
}