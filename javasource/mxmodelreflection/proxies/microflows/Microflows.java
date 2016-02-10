// This file was generated by Mendix Business Modeler 5.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MxModelReflection module

	public static boolean aSu_CheckMetamodel(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			return (Boolean)Core.execute(context, "MxModelReflection.ASu_CheckMetamodel", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static boolean bCo_MxObjectMember_CreateCompleteMemberName(IContext context, mxmodelreflection.proxies.MxObjectMember _mxObjectMember)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("MxObjectMember", _mxObjectMember == null ? null : _mxObjectMember.getMendixObject());
			return (Boolean)Core.execute(context, "MxModelReflection.BCo_MxObjectMember_CreateCompleteMemberName", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static boolean bCo_MxObjectReference(IContext context, mxmodelreflection.proxies.MxObjectReference _mxObjectReference)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("MxObjectReference", _mxObjectReference == null ? null : _mxObjectReference.getMendixObject());
			return (Boolean)Core.execute(context, "MxModelReflection.BCo_MxObjectReference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static boolean bCo_MxObjectType(IContext context, mxmodelreflection.proxies.MxObjectType _mxObjectType)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("MxObjectType", _mxObjectType == null ? null : _mxObjectType.getMendixObject());
			return (Boolean)Core.execute(context, "MxModelReflection.BCo_MxObjectType", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static boolean bCo_Token(IContext context, mxmodelreflection.proxies.Token _token)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			return (Boolean)Core.execute(context, "MxModelReflection.BCo_Token", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static boolean bDe_MxObjectType(IContext context, mxmodelreflection.proxies.MxObjectType _mxObjectType)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("MxObjectType", _mxObjectType == null ? null : _mxObjectType.getMendixObject());
			return (Boolean)Core.execute(context, "MxModelReflection.BDe_MxObjectType", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void ch_FindMember(IContext context, mxmodelreflection.proxies.Token _token)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			Core.execute(context, "MxModelReflection.Ch_FindMember", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void ch_FindMemberReference(IContext context, mxmodelreflection.proxies.Token _token)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			Core.execute(context, "MxModelReflection.Ch_FindMemberReference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void ch_FindObjectTypeReference(IContext context, mxmodelreflection.proxies.Token _token)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			Core.execute(context, "MxModelReflection.Ch_FindObjectTypeReference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void ch_FindReference(IContext context, mxmodelreflection.proxies.Token _token)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			Core.execute(context, "MxModelReflection.Ch_FindReference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void ch_Member(IContext context, mxmodelreflection.proxies.Token _token)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			Core.execute(context, "MxModelReflection.Ch_Member", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void ch_ObjecttypeReference(IContext context, mxmodelreflection.proxies.Token _token)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			Core.execute(context, "MxModelReflection.Ch_ObjecttypeReference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void ch_ObjectTypeStart(IContext context, mxmodelreflection.proxies.Token _token)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			Core.execute(context, "MxModelReflection.Ch_ObjectTypeStart", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void ch_Reference(IContext context, mxmodelreflection.proxies.Token _token)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			Core.execute(context, "MxModelReflection.Ch_Reference", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static mxmodelreflection.proxies.MxObjectMember findMember(IContext context, String _memberSearchString, mxmodelreflection.proxies.MxObjectType _mxObjectType)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("MemberSearchString", _memberSearchString);
			params.put("MxObjectType", _mxObjectType == null ? null : _mxObjectType.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "MxModelReflection.FindMember", params);
			return result == null ? null : mxmodelreflection.proxies.MxObjectMember.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static mxmodelreflection.proxies.Microflows findMicroflow(IContext context, String _microflowSearchString)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("MicroflowSearchString", _microflowSearchString);
			IMendixObject result = (IMendixObject)Core.execute(context, "MxModelReflection.FindMicroflow", params);
			return result == null ? null : mxmodelreflection.proxies.Microflows.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static mxmodelreflection.proxies.MxObjectType findObjectType(IContext context, String _objectTypeSearchString, mxmodelreflection.proxies.MxObjectReference _mxObjectReference_optional)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ObjectTypeSearchString", _objectTypeSearchString);
			params.put("MxObjectReference_optional", _mxObjectReference_optional == null ? null : _mxObjectReference_optional.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "MxModelReflection.FindObjectType", params);
			return result == null ? null : mxmodelreflection.proxies.MxObjectType.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static mxmodelreflection.proxies.MxObjectReference findReference(IContext context, String _referenceSearchString, mxmodelreflection.proxies.MxObjectType _mxObjectType_optional)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ReferenceSearchString", _referenceSearchString);
			params.put("MxObjectType_optional", _mxObjectType_optional == null ? null : _mxObjectType_optional.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "MxModelReflection.FindReference", params);
			return result == null ? null : mxmodelreflection.proxies.MxObjectReference.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void iVK_deleteAll(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MxModelReflection.IVK_deleteAll", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void iVK_OpenReferencedMendixObject(IContext context, mxmodelreflection.proxies.MxObjectReference _selection, mxmodelreflection.proxies.MxObjectType _mxObjectType)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Selection", _selection == null ? null : _selection.getMendixObject());
			params.put("MxObjectType", _mxObjectType == null ? null : _mxObjectType.getMendixObject());
			Core.execute(context, "MxModelReflection.IVK_OpenReferencedMendixObject", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void iVK_RecalculateSize(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MxModelReflection.IVK_RecalculateSize", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void iVK_SyncObjects(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MxModelReflection.IVK_SyncObjects", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void iVK_ToggleSelection(IContext context, mxmodelreflection.proxies.Module _module)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Module", _module == null ? null : _module.getMendixObject());
			Core.execute(context, "MxModelReflection.IVK_ToggleSelection", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void oC_FindObjectType(IContext context, mxmodelreflection.proxies.DbSizeEstimate _dbSizeEstimate)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("DbSizeEstimate", _dbSizeEstimate == null ? null : _dbSizeEstimate.getMendixObject());
			Core.execute(context, "MxModelReflection.OC_FindObjectType", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}