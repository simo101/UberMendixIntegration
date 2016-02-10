package oauthmodule.actions.custom;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import oauthmodule.proxies.constants.Constants;
import com.mendix.core.Core;
/**
 * HelperClass for retrieving a accesscode from Google Oauth
 * 
 * @Author: Erwin 't Hoen
 * @version: 1.0
 * @since: 2014-10-02
 */
public class GetAccessCodeUber {
	
	private final String OAUTHURI = Constants.getOAuthURI_Uber();
	private final String CLIENTID = Constants.getClientId_Uber();
	private final String CALLBACKURI = Constants.getCallbackURI_Uber();
	
	protected void getCode(String UUIDstate, HttpServletResponse servletResponse) throws IOException{
	Core.getLogger("OAuthSignin").trace("Get token from Uber");
	StringBuilder oauthUrl = new StringBuilder()
			.append(OAUTHURI)
			.append("?response_type=code") // the client id from the api console registration
			.append("&client_id=").append(CLIENTID)

			.append("&state="+UUIDstate)
			.append("&scope=profile%20history_lite%20request");

	Core.getLogger("OAuthSignin").trace("Url used for uber: \n"+oauthUrl.toString());
	servletResponse.sendRedirect(oauthUrl.toString());
	}
}
