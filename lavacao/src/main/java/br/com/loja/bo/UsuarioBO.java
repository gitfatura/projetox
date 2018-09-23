package br.com.loja.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.dao.UsuarioDAO;
import br.com.loja.entity.UsuarioEntity;
import br.com.loja.interfaces.IAssinaturaBO;

@ApplicationScoped
public class UsuarioBO  implements Serializable, IAssinaturaBO<UsuarioEntity>{

	private static final long serialVersionUID = -6618559401038628743L;

	@Inject
	private UsuarioDAO usuarioDAO;

	public UsuarioEntity logar(UsuarioEntity usuario) {
		return usuarioDAO.logar(usuario);
	}
	 	
	@Override
	public void adiciona(UsuarioEntity t) {
		usuarioDAO.adiciona(t);
	}

	@Override
	public void update(UsuarioEntity t) {
		usuarioDAO.update(t);
	}

	@Override
	public void remove(UsuarioEntity t) {
		usuarioDAO.remove(t);
	}

	@Override
	public UsuarioEntity recuperaById(Long id) {
		return usuarioDAO.recuperaById(id);
	}

	@Override
	public List<UsuarioEntity> recuperaTodos() {
		return usuarioDAO.recuperaTodos();
	}

	@Override
	public List<UsuarioEntity> recuperaItensOrdenado(String recuperaItensOrdenado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioEntity> recuperaItem(String valorARecuperar, String parametro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
