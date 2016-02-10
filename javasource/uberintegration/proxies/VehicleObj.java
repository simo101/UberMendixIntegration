// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package uberintegration.proxies;

/**
 * 
 */
public class VehicleObj
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject vehicleObjMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UberIntegration.VehicleObj";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		make("make"),
		model("model"),
		license_plate("license_plate"),
		vehicle("UberIntegration.vehicle");

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

	public VehicleObj(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UberIntegration.VehicleObj"));
	}

	protected VehicleObj(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vehicleObjMendixObject)
	{
		if (vehicleObjMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UberIntegration.VehicleObj", vehicleObjMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UberIntegration.VehicleObj");

		this.vehicleObjMendixObject = vehicleObjMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'VehicleObj.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static uberintegration.proxies.VehicleObj initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return uberintegration.proxies.VehicleObj.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static uberintegration.proxies.VehicleObj initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new uberintegration.proxies.VehicleObj(context, mendixObject);
	}

	public static uberintegration.proxies.VehicleObj load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return uberintegration.proxies.VehicleObj.initialize(context, mendixObject);
	}

	public static java.util.List<uberintegration.proxies.VehicleObj> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<uberintegration.proxies.VehicleObj> result = new java.util.ArrayList<uberintegration.proxies.VehicleObj>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UberIntegration.VehicleObj" + xpathConstraint))
			result.add(uberintegration.proxies.VehicleObj.initialize(context, obj));
		return result;
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
	 * @return value of make
	 */
	public final String getmake()
	{
		return getmake(getContext());
	}

	/**
	 * @param context
	 * @return value of make
	 */
	public final String getmake(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.make.toString());
	}

	/**
	 * Set value of make
	 * @param make
	 */
	public final void setmake(String make)
	{
		setmake(getContext(), make);
	}

	/**
	 * Set value of make
	 * @param context
	 * @param make
	 */
	public final void setmake(com.mendix.systemwideinterfaces.core.IContext context, String make)
	{
		getMendixObject().setValue(context, MemberNames.make.toString(), make);
	}

	/**
	 * @return value of model
	 */
	public final String getmodel()
	{
		return getmodel(getContext());
	}

	/**
	 * @param context
	 * @return value of model
	 */
	public final String getmodel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.model.toString());
	}

	/**
	 * Set value of model
	 * @param model
	 */
	public final void setmodel(String model)
	{
		setmodel(getContext(), model);
	}

	/**
	 * Set value of model
	 * @param context
	 * @param model
	 */
	public final void setmodel(com.mendix.systemwideinterfaces.core.IContext context, String model)
	{
		getMendixObject().setValue(context, MemberNames.model.toString(), model);
	}

	/**
	 * @return value of license_plate
	 */
	public final String getlicense_plate()
	{
		return getlicense_plate(getContext());
	}

	/**
	 * @param context
	 * @return value of license_plate
	 */
	public final String getlicense_plate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.license_plate.toString());
	}

	/**
	 * Set value of license_plate
	 * @param license_plate
	 */
	public final void setlicense_plate(String license_plate)
	{
		setlicense_plate(getContext(), license_plate);
	}

	/**
	 * Set value of license_plate
	 * @param context
	 * @param license_plate
	 */
	public final void setlicense_plate(com.mendix.systemwideinterfaces.core.IContext context, String license_plate)
	{
		getMendixObject().setValue(context, MemberNames.license_plate.toString(), license_plate);
	}

	/**
	 * @return value of vehicle
	 */
	public final uberintegration.proxies.RequestResponse getvehicle() throws com.mendix.core.CoreException
	{
		return getvehicle(getContext());
	}

	/**
	 * @param context
	 * @return value of vehicle
	 */
	public final uberintegration.proxies.RequestResponse getvehicle(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		uberintegration.proxies.RequestResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.vehicle.toString());
		if (identifier != null)
			result = uberintegration.proxies.RequestResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of vehicle
	 * @param vehicle
	 */
	public final void setvehicle(uberintegration.proxies.RequestResponse vehicle)
	{
		setvehicle(getContext(), vehicle);
	}

	/**
	 * Set value of vehicle
	 * @param context
	 * @param vehicle
	 */
	public final void setvehicle(com.mendix.systemwideinterfaces.core.IContext context, uberintegration.proxies.RequestResponse vehicle)
	{
		if (vehicle == null)
			getMendixObject().setValue(context, MemberNames.vehicle.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.vehicle.toString(), vehicle.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return vehicleObjMendixObject;
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
			final uberintegration.proxies.VehicleObj that = (uberintegration.proxies.VehicleObj) obj;
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
		return "UberIntegration.VehicleObj";
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