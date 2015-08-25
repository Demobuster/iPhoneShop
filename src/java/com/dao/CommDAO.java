package com.dao;

import org.hibernate.Session;
import java.util.List;

public class CommDAO { 
    
    public static void persist(final Comments comment) {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(comment);
            session.getTransaction().commit();
         } catch (Exception e) {
              e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) 
                session.close();      
        }
    }
    
    public static List getAllByUser(String user){   
                Session session = null; 
                List list = null;
        	try {
                    session = HibernateUtil.getSessionFactory().openSession(); 
                    session.beginTransaction();
                    list = session.createQuery("SELECT h FROM Comments h WHERE h.user = :user").setParameter("user", user).list();
                    session.close();
                    
                } catch (Exception e) {
                    e.printStackTrace();
              } finally {
                  if (session != null && session.isOpen()) 
                      session.close();
                      return list;
              }
        }
    }


