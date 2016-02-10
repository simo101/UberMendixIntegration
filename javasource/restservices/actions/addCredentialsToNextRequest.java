// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.consume.RestConsumer;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class addCredentialsToNextRequest extends CustomJavaAction<Boolean>
{
	private String username;
	private String password;

	public addCredentialsToNextRequest(IContext context, String username, String password)
	{
		super(context);
		this.username = username;
		this.password = password;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		RestConsumer.addCredentialsToNextRequest(username, password);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "addCredentialsToNextRequest";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
