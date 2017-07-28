package com.mx.uaz.mobileTracking.DAO.Impl;

import java.util.List;

import com.mx.uaz.mobileTracking.DAO.EdificioHistoricoDAO;
import com.mx.uaz.mobileTracking.model.EdificioHistorico;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class EdificioHistoricoDAOImpl extends HibernateDaoSupport implements EdificioHistoricoDAO {

	@Override
	public EdificioHistorico buscar(Integer id) {
		try {
			return (EdificioHistorico) getHibernateTemplate().get(EdificioHistorico.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EdificioHistorico> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EdificioHistorico> buscar(EdificioHistorico edificioHistorico) {
		try {
			System.out.println("buscando en el DAO");
			return getHibernateTemplate().findByExample(edificioHistorico);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(EdificioHistorico edificioHistorico) {
		try {
			getHibernateTemplate().delete(edificioHistorico);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(EdificioHistorico edificioHistorico) {
		try {
			getHibernateTemplate().saveOrUpdate(edificioHistorico);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
