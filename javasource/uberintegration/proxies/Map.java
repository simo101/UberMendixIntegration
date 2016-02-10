// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package uberintegration.proxies;

/**
 * 
 */
public class Map
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mapMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UberIntegration.Map";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		request_id("request_id"),
		href("href");

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

	public Map(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UberIntegration.Map"));
	}

	protected Map(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mapMendixObject)
	{
		if (mapMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UberIntegration.Map", mapMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UberIntegration.Map");

		this.mapMendixObject = mapMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Map.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static uberintegration.proxies.Map initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return uberintegration.proxies.Map.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static uberintegration.proxies.Map initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new uberintegration.proxies.Map(context, mendixObject);
	}

	public static uberintegration.proxies.Map load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return uberintegration.proxies.Map.initialize(context, mendixObject);
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
	 * @return value of request_id
	 */
	public final String getrequest_id()
	{
		return getrequest_id(getContext());
	}

	/**
	 * @param context
	 * @return value of request_id
	 */
	public final String getrequest_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.request_id.toString());
	}

	/**
	 * Set value of request_id
	 * @param request_id
	 */
	public final void setrequest_id(String request_id)
	{
		setrequest_id(getContext(), request_id);
	}

	/**
	 * Set value of request_id
	 * @param context
	 * @param request_id
	 */
	public final void setrequest_id(com.mendix.systemwideinterfaces.core.IContext context, String request_id)
	{
		getMendixObject().setValue(context, MemberNames.request_id.toString(), request_id);
	}

	/**
	 * @return value of href
	 */
	public final String gethref()
	{
		return gethref(getContext());
	}

	/**
	 * @param context
	 * @return value of href
	 */
	public final String gethref(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.href.toString());
	}

	/**
	 * Set value of href
	 * @param href
	 */
	public final void sethref(String href)
	{
		sethref(getContext(), href);
	}

	/**
	 * Set value of href
	 * @param context
	 * @param href
	 */
	public final void sethref(com.mendix.systemwideinterfaces.core.IContext context, String href)
	{
		getMendixObject().setValue(context, MemberNames.href.toString(), href);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mapMendixObject;
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
			final uberintegration.proxies.Map that = (uberintegration.proxies.Map) obj;
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
		return "UberIntegration.Map";
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
