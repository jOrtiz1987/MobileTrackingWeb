package com.mx.uaz.mobileTracking.DAO.Impl;

import java.util.List;

import com.mx.uaz.mobileTracking.DAO.RegistroCoordenadasDAO;
import com.mx.uaz.mobileTracking.model.RegistroCoordendas;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class RegistroCoordenadasDAOImpl extends HibernateDaoSupport implements RegistroCoordenadasDAO {

	@Override
	public RegistroCoordendas buscar(Integer id) {
		try {
			return (RegistroCoordendas) getHibernateTemplate().get(RegistroCoordendas.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RegistroCoordendas> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RegistroCoordendas> buscar(RegistroCoordendas registroCoordenadas) {
		try {
			return getHibernateTemplate().findByExample(registroCoordenadas);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(RegistroCoordendas registroCoordenadas) {
		try {
			getHibernateTemplate().delete(registroCoordenadas);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(RegistroCoordendas registroCoordenadas) {
		try {
			getHibernateTemplate().saveOrUpdate(registroCoordenadas);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
