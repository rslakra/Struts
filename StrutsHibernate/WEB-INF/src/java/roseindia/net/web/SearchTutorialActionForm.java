package roseindia.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;

public class SearchTutorialActionForm extends ActionForm
{
  private String keyword=null;

public void setKeyword(String keyword){
    this.keyword=keyword;
  }

  public String getKeyword(){
    return this.keyword;
  }

   public void reset(ActionMapping mapping, HttpServletRequest request) {
    this.keyword=null;
		}
	 public ActionErrors validate( 
      ActionMapping mapping, HttpServletRequest request ) {
      ActionErrors errors = new ActionErrors();
      
      if( getKeyword() == null || getKeyword().length() < 1 ) {
        errors.add("keyword",new ActionMessage("error.keyword.required"));
		 }

      return errors;
  }

}