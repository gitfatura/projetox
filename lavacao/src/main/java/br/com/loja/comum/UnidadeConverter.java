package br.com.loja.comum;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.loja.entity.UnidadesEntity;


@FacesConverter(forClass = UnidadesEntity.class)
public class UnidadeConverter implements Converter {
	  @Override
	    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
	        if (value != null && !value.isEmpty()) {
	            return (UnidadesEntity) uiComponent.getAttributes().get(value);
	        }
	        return null;
	    }

	    @Override
	    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
	        if (value instanceof UnidadesEntity) {
	        	UnidadesEntity unidadeEntity = (UnidadesEntity) value;
	            if (unidadeEntity != null && unidadeEntity instanceof UnidadesEntity && unidadeEntity.getId() != null) {
	                uiComponent.getAttributes().put( unidadeEntity.getId().toString(), unidadeEntity);
	                return unidadeEntity.getId().toString();
	            }
	        }
	        return "";
	    }
		
	
}
