package br.com.loja.comum;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.loja.entity.OrdemServicoEntity;


@FacesConverter(forClass = OrdemServicoEntity.class)
public class OrdemServicConverter implements Converter {
	  @Override
	    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
	        if (value != null && !value.isEmpty()) {
	            return (OrdemServicoEntity) uiComponent.getAttributes().get(value);
	        }
	        return null;
	    }

	    @Override
	    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
	        if (value instanceof OrdemServicoEntity) {
	        	OrdemServicoEntity ordemservicoEntity = (OrdemServicoEntity) value;
	            if (ordemservicoEntity != null && ordemservicoEntity instanceof OrdemServicoEntity && ordemservicoEntity.getId() != null) {
	                uiComponent.getAttributes().put( ordemservicoEntity.getId().toString(), ordemservicoEntity);
	                return ordemservicoEntity.getId().toString();
	            }
	        }
	        return "";
	    }
		
	
}
