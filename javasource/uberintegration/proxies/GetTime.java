// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package uberintegration.proxies;

/**
 * 
 */
public class GetTime
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject getTimeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UberIntegration.GetTime";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		start_latitude("start_latitude"),
		start_longitude("start_longitude"),
		customer_uuid("customer_uuid"),
		product_id("product_id"),
		server_token("server_token");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public GetTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UberIntegration.GetTime"));
	}

	protected GetTime(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject getTimeMendixObject)
	{
		if (getTimeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UberIntegration.GetTime", getTimeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UberIntegration.GetTime");

		this.getTimeMendixObject = getTimeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'GetTime.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static uberintegration.proxies.GetTime initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return uberintegration.proxies.GetTime.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static uberintegration.proxies.GetTime initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new uberintegration.proxies.GetTime(context, mendixObject);
	}

	public static uberintegration.proxies.GetTime load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return uberintegration.proxies.GetTime.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of start_latitude
	 */
	public final Double getstart_latitude()
	{
		return getstart_latitude(getContext());
	}

	/**
	 * @param context
	 * @return value of start_latitude
	 */
	public final Double getstart_latitude(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.start_latitude.toString());
	}

	/**
	 * Set value of start_latitude
	 * @param start_latitude
	 */
	public final void setstart_latitude(Double start_latitude)
	{
		setstart_latitude(getContext(), start_latitude);
	}

	/**
	 * Set value of start_latitude
	 * @param context
	 * @param start_latitude
	 */
	public final void setstart_latitude(com.mendix.systemwideinterfaces.core.IContext context, Double start_latitude)
	{
		getMendixObject().setValue(context, MemberNames.start_latitude.toString(), start_latitude);
	}

	/**
	 * @return value of start_longitude
	 */
	public final Double getstart_longitude()
	{
		return getstart_longitude(getContext());
	}

	/**
	 * @param context
	 * @return value of start_longitude
	 */
	public final Double getstart_longitude(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.start_longitude.toString());
	}

	/**
	 * Set value of start_longitude
	 * @param start_longitude
	 */
	public final void setstart_longitude(Double start_longitude)
	{
		setstart_longitude(getContext(), start_longitude);
	}

	/**
	 * Set value of start_longitude
	 * @param context
	 * @param start_longitude
	 */
	public final void setstart_longitude(com.mendix.systemwideinterfaces.core.IContext context, Double start_longitude)
	{
		getMendixObject().setValue(context, MemberNames.start_longitude.toString(), start_longitude);
	}

	/**
	 * @return value of customer_uuid
	 */
	public final String getcustomer_uuid()
	{
		return getcustomer_uuid(getContext());
	}

	/**
	 * @param context
	 * @return value of customer_uuid
	 */
	public final String getcustomer_uuid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.customer_uuid.toString());
	}

	/**
	 * Set value of customer_uuid
	 * @param customer_uuid
	 */
	public final void setcustomer_uuid(String customer_uuid)
	{
		setcustomer_uuid(getContext(), customer_uuid);
	}

	/**
	 * Set value of customer_uuid
	 * @param context
	 * @param customer_uuid
	 */
	public final void setcustomer_uuid(com.mendix.systemwideinterfaces.core.IContext context, String customer_uuid)
	{
		getMendixObject().setValue(context, MemberNames.customer_uuid.toString(), customer_uuid);
	}

	/**
	 * @return value of product_id
	 */
	public final String getproduct_id()
	{
		return getproduct_id(getContext());
	}

	/**
	 * @param context
	 * @return value of product_id
	 */
	public final String getproduct_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.product_id.toString());
	}

	/**
	 * Set value of product_id
	 * @param product_id
	 */
	public final void setproduct_id(String product_id)
	{
		setproduct_id(getContext(), product_id);
	}

	/**
	 * Set value of product_id
	 * @param context
	 * @param product_id
	 */
	public final void setproduct_id(com.mendix.systemwideinterfaces.core.IContext context, String product_id)
	{
		getMendixObject().setValue(context, MemberNames.product_id.toString(), product_id);
	}

	/**
	 * @return value of server_token
	 */
	public final String getserver_token()
	{
		return getserver_token(getContext());
	}

	/**
	 * @param context
	 * @return value of server_token
	 */
	public final String getserver_token(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.server_token.toString());
	}

	/**
	 * Set value of server_token
	 * @param server_token
	 */
	public final void setserver_token(String server_token)
	{
		setserver_token(getContext(), server_token);
	}

	/**
	 * Set value of server_token
	 * @param context
	 * @param server_token
	 */
	public final void setserver_token(com.mendix.systemwideinterfaces.core.IContext context, String server_token)
	{
		getMendixObject().setValue(context, MemberNames.server_token.toString(), server_token);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return getTimeMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final uberintegration.proxies.GetTime that = (uberintegration.proxies.GetTime) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "UberIntegration.GetTime";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
