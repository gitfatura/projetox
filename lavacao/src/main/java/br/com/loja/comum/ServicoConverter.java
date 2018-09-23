package br.com.loja.comum;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.loja.entity.ServicoEntity;


@FacesConverter(forClass = ServicoEntity.class)
public class ServicoConverter implements Converter {
	  @Override
	    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
	        if (value != null && !value.isEmpty()) {
	            return (ServicoEntity) uiComponent.getAttributes().get(value);
	        }
	        return null;
	    }

	    @Override
	    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
	        if (value instanceof ServicoEntity) {
	        	ServicoEntity servicoEntity = (ServicoEntity) value;
	            if (servicoEntity != null && servicoEntity instanceof ServicoEntity && servicoEntity.getId() != null) {
	                uiComponent.getAttributes().put(servicoEntity.getId().toString(), servicoEntity);
	                return servicoEntity.getId().toString();
	            }
	        }
	        return "";
	    }
		
	
}
