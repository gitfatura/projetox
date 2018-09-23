package br.com.loja.comum;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.loja.entity.CarroEntity;


@FacesConverter(forClass = CarroEntity.class)
public class CarroConverter implements Converter {
	  @Override
	    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
	        if (value != null && !value.isEmpty()) {
	            return (CarroEntity) uiComponent.getAttributes().get(value);
	        }
	        return null;
	    }

	    @Override
	    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
	        if (value instanceof CarroEntity) {
	        	CarroEntity carroEntity = (CarroEntity) value;
	            if (carroEntity != null && carroEntity instanceof CarroEntity && carroEntity.getId() != null) {
	                uiComponent.getAttributes().put(carroEntity.getId().toString(), carroEntity);
	                return carroEntity.getId().toString();
	            }
	        }
	        return "";
	    }
		
	
}
