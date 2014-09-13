/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmc.castell.helpers;

import com.gmc.castell.dao.BaseHibernateDAO;
import com.gmc.castell.model.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author SABADO-MANHANA
 */

@Repository("usuarioDAO")
@Transactional
public class UsuarioDAOH extends BaseHibernateDAO implements UsuarioDAO {

    @Override
    public List<Usuario> list() {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        return criteria.list();
    }

    @Override
    public Usuario get(Long id) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("id", id));
        return (Usuario) criteria.uniqueResult();
    }

    @Override
    public void save(Usuario t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Usuario t) {
        this.getSession().update(t);
    }

    @Override
    public void delete(Usuario t) {
        this.getSession().delete(t);
    }
    
}
