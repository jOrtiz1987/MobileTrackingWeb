package com.mx.uaz.mobileTracking.DAO.Impl;

import java.util.List;

import com.mx.uaz.mobileTracking.DAO.PreferenciaUsuarioDAO;
import com.mx.uaz.mobileTracking.model.PreferenciaUsuario;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class PreferenciaUsuarioDAOImpl extends HibernateDaoSupport implements PreferenciaUsuarioDAO {

	@Override
	public PreferenciaUsuario buscar(Integer id) {
		try {
			return (PreferenciaUsuario) getHibernateTemplate().get(PreferenciaUsuario.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PreferenciaUsuario> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PreferenciaUsuario> buscar(PreferenciaUsuario preferenciaUsuario) {
		try {
			return getHibernateTemplate().findByExample(preferenciaUsuario);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(PreferenciaUsuario preferenciaUsuario) {
		try {
			getHibernateTemplate().delete(preferenciaUsuario);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(PreferenciaUsuario preferenciaUsuario) {
		try {
			getHibernateTemplate().saveOrUpdate(preferenciaUsuario);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
