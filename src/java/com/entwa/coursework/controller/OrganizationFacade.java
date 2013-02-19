/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entwa.coursework.controller;

import com.entwa.coursework.Organization;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Terrorhunt
 */
@Stateless
public class OrganizationFacade extends AbstractFacade<Organization> {
    @PersistenceContext(unitName = "CourseworkPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrganizationFacade() {
        super(Organization.class);
    }
    
}
