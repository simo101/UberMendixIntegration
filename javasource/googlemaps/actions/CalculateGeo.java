// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package googlemaps.actions;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.UserAction;
import googlemaps.actions.GeoCoder.Location;
import java.io.IOException;
import java.security.AccessControlException;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class CalculateGeo extends CustomJavaAction<String>
{
	private IMendixObject __locationObj;
	private googlemaps.proxies.Location locationObj;
	private String addressString;

	public CalculateGeo(IContext context, IMendixObject locationObj, String addressString)
	{
		super(context);
		this.__locationObj = locationObj;
		this.addressString = addressString;
	}

	@Override
	public String executeAction() throws Exception
	{
		this.locationObj = __locationObj == null ? null : googlemaps.proxies.Location.initialize(getContext(), __locationObj);

		// BEGIN USER CODE
		Location loc;
		try {
			loc = GeoCoder.getLocation(addressString);
		} catch (IOException e) {
			return e.getMessage();
		} catch (AccessControlException e){
		  return "AccessControlException occured: possible reason is emulate cloud security setting";
		}
		
		locationObj.setLatitude(loc.lat);
		locationObj.setLongitude(loc.lon);
		return "";
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "CalculateGeo";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
