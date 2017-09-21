package com.mx.uaz.mobileTracking.DAO.Impl;

import java.util.List;

import com.mx.uaz.mobileTracking.DAO.VisitaDAO;
import com.mx.uaz.mobileTracking.model.Visita;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

public class VisitaDAOImpl extends HibernateDaoSupport implements VisitaDAO {

	@Override
	public Visita buscar(Integer id) {
		try {
			return (Visita) getHibernateTemplate().get(Visita.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Visita> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Visita> buscar(Visita visita) {
		try {
			DetachedCriteria criteria = DetachedCriteria.forClass(Visita.class);
			if(visita.getEdificioHistorico() != null){
				criteria.add(Restrictions.eq("edificioHistorico", visita.getEdificioHistorico()));
			}
			if(visita.getUsuario() != null){
				criteria.add(Restrictions.eq("usuario", visita.getUsuario()));
			}
			return getHibernateTemplate().findByCriteria(criteria);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Visita> buscarTodos(Visita visita) {
		try {
			return getHibernateTemplate().findByExample(visita);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}
	
	@Override
	public boolean eliminar(Visita visita) {
		try {
			getHibernateTemplate().delete(visita);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Visita visita) {
		try {
			getHibernateTemplate().saveOrUpdate(visita);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
