/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmc.castell.helpers;

import com.gmc.castell.dao.BaseHibernateDAO;
import com.gmc.castell.model.Persona;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author SABADO-MANHANA
 */

@Repository("personaDAO")
@Transactional
public class PersonaDAOH extends BaseHibernateDAO implements PersonaDAO {

    @Override
    public List<Persona> list() {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        return criteria.list();
    }

    @Override
    public Persona get(Long id) {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        criteria.add(Restrictions.eq("id", id));
        return (Persona) criteria.uniqueResult();
    }

    @Override
    public void save(Persona t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Persona t) {
        this.getSession().update(t);
    }

    @Override
    public void delete(Persona t) {
        this.getSession().delete(t);
    }    
}
