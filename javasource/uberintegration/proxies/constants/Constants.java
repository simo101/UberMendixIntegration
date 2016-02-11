// This file was generated by Mendix Business Modeler 5.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package uberintegration.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the UberIntegration module

	public static String getAuthorizeURL()
	{
		return (String)Core.getConfiguration().getConstantValue("UberIntegration.AuthorizeURL");
	}

	public static String getProductionURL()
	{
		return (String)Core.getConfiguration().getConstantValue("UberIntegration.ProductionURL");
	}

	public static String getSandboxURL()
	{
		return (String)Core.getConfiguration().getConstantValue("UberIntegration.SandboxURL");
	}

	public static String getServerToken()
	{
		return (String)Core.getConfiguration().getConstantValue("UberIntegration.ServerToken");
	}

	public static String getVersion()
	{
		return (String)Core.getConfiguration().getConstantValue("UberIntegration.Version");
	}
}