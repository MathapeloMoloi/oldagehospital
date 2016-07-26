/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffs;

/**
 *
 * @author Thapi
 */
import Hospital.Receptionist;
import util.NewHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class LoggingIn {
    
    public boolean authenticate(String recepNo , String username){
        Receptionist recp = getRecepNo(recepNo);
        if(recp != null && recp.getRecepNo().equals(recepNo) && recp.getFirstName().equals(username)){
            return true;
            
        }
         else
        {
            return false;
        }
    }
    public Receptionist getRecepNo(String recepNo){
     Session session;
     session = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx = null;
    Receptionist recp = null;
    try{
        tx = session.getTransaction();
        tx.begin();
        Query query = session.createQuery("from Receptionist where recep_no = '" + recepNo + "'");
        recp = (Receptionist)query.uniqueResult(); 
        tx.commit();
    }catch(Exception e){
        if(tx != null)
            tx.rollback();
        System.out.println("error");
        
    }
    finally{
       session.close();
    }
    return recp;
}
    
}
