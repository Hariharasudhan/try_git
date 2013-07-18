/* This is the ActionClass in Struts Application */

package helloworldstruts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.HelloWorldForm;
 
//import com.vaannila.form.HelloWorldForm;
 
public class HelloWorldStruts1Action extends Action {
 
@Override
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HelloWorldForm hwForm = (HelloWorldForm) form;
		hwForm.setMessage("Hello World");
		return mapping.findForward("success");
	}
}
