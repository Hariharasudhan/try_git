/* A simple Struts1.x "Hello World" Application */
/* Put this JavaFile under the form package */


package form;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm 
{
 
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
 
	public String getMessage() {
		return message;
	}
 
	public void setMessage(String message) {
		this.message = message;
	}
}
