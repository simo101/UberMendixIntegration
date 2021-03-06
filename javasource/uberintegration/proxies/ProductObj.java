// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package uberintegration.proxies;

/**
 * 
 */
public class ProductObj
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productObjMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UberIntegration.ProductObj";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		product_id("product_id"),
		description("description"),
		display_name("display_name"),
		capacity("capacity"),
		image("image");

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

	public ProductObj(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UberIntegration.ProductObj"));
	}

	protected ProductObj(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productObjMendixObject)
	{
		if (productObjMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UberIntegration.ProductObj", productObjMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UberIntegration.ProductObj");

		this.productObjMendixObject = productObjMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProductObj.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static uberintegration.proxies.ProductObj initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return uberintegration.proxies.ProductObj.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static uberintegration.proxies.ProductObj initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new uberintegration.proxies.ProductObj(context, mendixObject);
	}

	public static uberintegration.proxies.ProductObj load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return uberintegration.proxies.ProductObj.initialize(context, mendixObject);
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
	 * @return value of description
	 */
	public final String getdescription()
	{
		return getdescription(getContext());
	}

	/**
	 * @param context
	 * @return value of description
	 */
	public final String getdescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.description.toString());
	}

	/**
	 * Set value of description
	 * @param description
	 */
	public final void setdescription(String description)
	{
		setdescription(getContext(), description);
	}

	/**
	 * Set value of description
	 * @param context
	 * @param description
	 */
	public final void setdescription(com.mendix.systemwideinterfaces.core.IContext context, String description)
	{
		getMendixObject().setValue(context, MemberNames.description.toString(), description);
	}

	/**
	 * @return value of display_name
	 */
	public final String getdisplay_name()
	{
		return getdisplay_name(getContext());
	}

	/**
	 * @param context
	 * @return value of display_name
	 */
	public final String getdisplay_name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.display_name.toString());
	}

	/**
	 * Set value of display_name
	 * @param display_name
	 */
	public final void setdisplay_name(String display_name)
	{
		setdisplay_name(getContext(), display_name);
	}

	/**
	 * Set value of display_name
	 * @param context
	 * @param display_name
	 */
	public final void setdisplay_name(com.mendix.systemwideinterfaces.core.IContext context, String display_name)
	{
		getMendixObject().setValue(context, MemberNames.display_name.toString(), display_name);
	}

	/**
	 * @return value of capacity
	 */
	public final Integer getcapacity()
	{
		return getcapacity(getContext());
	}

	/**
	 * @param context
	 * @return value of capacity
	 */
	public final Integer getcapacity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.capacity.toString());
	}

	/**
	 * Set value of capacity
	 * @param capacity
	 */
	public final void setcapacity(Integer capacity)
	{
		setcapacity(getContext(), capacity);
	}

	/**
	 * Set value of capacity
	 * @param context
	 * @param capacity
	 */
	public final void setcapacity(com.mendix.systemwideinterfaces.core.IContext context, Integer capacity)
	{
		getMendixObject().setValue(context, MemberNames.capacity.toString(), capacity);
	}

	/**
	 * @return value of image
	 */
	public final String getimage()
	{
		return getimage(getContext());
	}

	/**
	 * @param context
	 * @return value of image
	 */
	public final String getimage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.image.toString());
	}

	/**
	 * Set value of image
	 * @param image
	 */
	public final void setimage(String image)
	{
		setimage(getContext(), image);
	}

	/**
	 * Set value of image
	 * @param context
	 * @param image
	 */
	public final void setimage(com.mendix.systemwideinterfaces.core.IContext context, String image)
	{
		getMendixObject().setValue(context, MemberNames.image.toString(), image);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productObjMendixObject;
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
			final uberintegration.proxies.ProductObj that = (uberintegration.proxies.ProductObj) obj;
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
		return "UberIntegration.ProductObj";
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
