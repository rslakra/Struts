package roseindia.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;

import java.util.List;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import roseindia.net.plugin.HibernatePlugIn;

import roseindia.net.dao.hibernate.Tutorial;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;



public class SearchTutorialAction extends Action
{
  public ActionForward execute(
    ActionMapping mapping,
    ActionForm form,
    HttpServletRequest request,
    HttpServletResponse response) throws Exception{
	SearchTutorialActionForm formObj = (SearchTutorialActionForm)form;

	 System.out.println("Getting session factory");
	 /*Get the servlet context */
	 ServletContext context = request.getSession().getServletContext();
	 /*Retrieve Session Factory */
	 SessionFactory _factory = (SessionFactory)  context.getAttribute(HibernatePlugIn.SESSION_FACTORY_KEY);
	 /*Open Hibernate Session */
	 Session  session = _factory.openSession();
     //Criteria Query Example
     Criteria crit = session.createCriteria(Tutorial.class);
     crit.add(Restrictions.like("shortdesc", "%" + formObj.getKeyword() +"%")); //Like condition

	 //Fetch the result from database
	 List tutorials= crit.list();
	 request.setAttribute("searchresult",tutorials);
	 
	  /*Close session */
      session.close();
	  System.out.println("Hibernate Session Closed");
      return mapping.findForward("success");
  }
}