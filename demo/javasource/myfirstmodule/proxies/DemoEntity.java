// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class DemoEntity
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject demoEntityMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.DemoEntity";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Input("Input"),
		Dropdown("Dropdown");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DemoEntity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.DemoEntity"));
	}

	protected DemoEntity(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject demoEntityMendixObject)
	{
		if (demoEntityMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.DemoEntity", demoEntityMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.DemoEntity");

		this.demoEntityMendixObject = demoEntityMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DemoEntity.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.DemoEntity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.DemoEntity.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.DemoEntity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.DemoEntity(context, mendixObject);
	}

	public static myfirstmodule.proxies.DemoEntity load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.DemoEntity.initialize(context, mendixObject);
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
	 * @return value of Input
	 */
	public final java.lang.String getInput()
	{
		return getInput(getContext());
	}

	/**
	 * @param context
	 * @return value of Input
	 */
	public final java.lang.String getInput(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Input.toString());
	}

	/**
	 * Set value of Input
	 * @param input
	 */
	public final void setInput(java.lang.String input)
	{
		setInput(getContext(), input);
	}

	/**
	 * Set value of Input
	 * @param context
	 * @param input
	 */
	public final void setInput(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String input)
	{
		getMendixObject().setValue(context, MemberNames.Input.toString(), input);
	}

	/**
	 * Set value of Dropdown
	 * @param dropdown
	 */
	public final myfirstmodule.proxies.DemoEnum getDropdown()
	{
		return getDropdown(getContext());
	}

	/**
	 * @param context
	 * @return value of Dropdown
	 */
	public final myfirstmodule.proxies.DemoEnum getDropdown(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Dropdown.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.DemoEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Dropdown
	 * @param dropdown
	 */
	public final void setDropdown(myfirstmodule.proxies.DemoEnum dropdown)
	{
		setDropdown(getContext(), dropdown);
	}

	/**
	 * Set value of Dropdown
	 * @param context
	 * @param dropdown
	 */
	public final void setDropdown(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.DemoEnum dropdown)
	{
		if (dropdown != null)
			getMendixObject().setValue(context, MemberNames.Dropdown.toString(), dropdown.toString());
		else
			getMendixObject().setValue(context, MemberNames.Dropdown.toString(), null);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return demoEntityMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.DemoEntity that = (myfirstmodule.proxies.DemoEntity) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.DemoEntity";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
