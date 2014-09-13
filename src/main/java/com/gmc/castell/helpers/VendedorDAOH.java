/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmc.castell.helpers;

import com.gmc.castell.dao.BaseHibernateDAO;
import com.gmc.castell.model.Vendedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author SABADO-MANHANA
 */

@Repository("vendedorDAO")
@Transactional
public class VendedorDAOH extends BaseHibernateDAO implements VendedorDAO {

    @Override
    public List<Vendedor> list() {
        Criteria criteria = this.getSession().createCriteria(Vendedor.class);
        return criteria.list();
    }

    @Override
    public Vendedor get(Long id) {
        Criteria criteria = this.getSession().createCriteria(Vendedor.class);
        criteria.add(Restrictions.eq("id", id));
        return (Vendedor) criteria.uniqueResult();
    }

    @Override
    public void save(Vendedor t) {
      this.getSession().save(t);  
    }

    @Override
    public void update(Vendedor t) {
        this.getSession().update(t);
    }

    @Override
    public void delete(Vendedor t) {
        this.getSession().delete(t);
    }
    
}
