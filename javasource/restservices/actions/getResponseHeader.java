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
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class getResponseHeader extends CustomJavaAction<String>
{
	private IMendixObject __requestResult;
	private restservices.proxies.RequestResult requestResult;
	private String headerName;

	public getResponseHeader(IContext context, IMendixObject requestResult, String headerName)
	{
		super(context);
		this.__requestResult = requestResult;
		this.headerName = headerName;
	}

	@Override
	public String executeAction() throws Exception
	{
		this.requestResult = __requestResult == null ? null : restservices.proxies.RequestResult.initialize(getContext(), __requestResult);

		// BEGIN USER CODE
		return RestConsumer.getResponseHeaderFromRequestResult(requestResult, headerName);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "getResponseHeader";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
