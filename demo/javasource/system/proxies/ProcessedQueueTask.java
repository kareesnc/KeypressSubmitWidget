// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class ProcessedQueueTask
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject processedQueueTaskMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.ProcessedQueueTask";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sequence("Sequence"),
		Status("Status"),
		QueueId("QueueId"),
		QueueName("QueueName"),
		MicroflowName("MicroflowName"),
		UserActionName("UserActionName"),
		Arguments("Arguments"),
		XASId("XASId"),
		ThreadId("ThreadId"),
		Created("Created"),
		Started("Started"),
		Retried("Retried"),
		ErrorMessage("ErrorMessage");

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

	public ProcessedQueueTask(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "System.ProcessedQueueTask"));
	}

	protected ProcessedQueueTask(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject processedQueueTaskMendixObject)
	{
		if (processedQueueTaskMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("System.ProcessedQueueTask", processedQueueTaskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a System.ProcessedQueueTask");

		this.processedQueueTaskMendixObject = processedQueueTaskMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProcessedQueueTask.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static system.proxies.ProcessedQueueTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.ProcessedQueueTask.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static system.proxies.ProcessedQueueTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.ProcessedQueueTask(context, mendixObject);
	}

	public static system.proxies.ProcessedQueueTask load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.ProcessedQueueTask.initialize(context, mendixObject);
	}

	public static java.util.List<system.proxies.ProcessedQueueTask> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.ProcessedQueueTask> result = new java.util.ArrayList<system.proxies.ProcessedQueueTask>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//System.ProcessedQueueTask" + xpathConstraint))
			result.add(system.proxies.ProcessedQueueTask.initialize(context, obj));
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
	 * @return value of Sequence
	 */
	public final java.lang.Long getSequence()
	{
		return getSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of Sequence
	 */
	public final java.lang.Long getSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Sequence.toString());
	}

	/**
	 * Set value of Sequence
	 * @param sequence
	 */
	public final void setSequence(java.lang.Long sequence)
	{
		setSequence(getContext(), sequence);
	}

	/**
	 * Set value of Sequence
	 * @param context
	 * @param sequence
	 */
	public final void setSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long sequence)
	{
		getMendixObject().setValue(context, MemberNames.Sequence.toString(), sequence);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final system.proxies.QueueTaskStatus getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final system.proxies.QueueTaskStatus getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return system.proxies.QueueTaskStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(system.proxies.QueueTaskStatus status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.QueueTaskStatus status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of QueueId
	 */
	public final java.lang.String getQueueId()
	{
		return getQueueId(getContext());
	}

	/**
	 * @param context
	 * @return value of QueueId
	 */
	public final java.lang.String getQueueId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.QueueId.toString());
	}

	/**
	 * Set value of QueueId
	 * @param queueid
	 */
	public final void setQueueId(java.lang.String queueid)
	{
		setQueueId(getContext(), queueid);
	}

	/**
	 * Set value of QueueId
	 * @param context
	 * @param queueid
	 */
	public final void setQueueId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String queueid)
	{
		getMendixObject().setValue(context, MemberNames.QueueId.toString(), queueid);
	}

	/**
	 * @return value of QueueName
	 */
	public final java.lang.String getQueueName()
	{
		return getQueueName(getContext());
	}

	/**
	 * @param context
	 * @return value of QueueName
	 */
	public final java.lang.String getQueueName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.QueueName.toString());
	}

	/**
	 * Set value of QueueName
	 * @param queuename
	 */
	public final void setQueueName(java.lang.String queuename)
	{
		setQueueName(getContext(), queuename);
	}

	/**
	 * Set value of QueueName
	 * @param context
	 * @param queuename
	 */
	public final void setQueueName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String queuename)
	{
		getMendixObject().setValue(context, MemberNames.QueueName.toString(), queuename);
	}

	/**
	 * @return value of MicroflowName
	 */
	public final java.lang.String getMicroflowName()
	{
		return getMicroflowName(getContext());
	}

	/**
	 * @param context
	 * @return value of MicroflowName
	 */
	public final java.lang.String getMicroflowName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MicroflowName.toString());
	}

	/**
	 * Set value of MicroflowName
	 * @param microflowname
	 */
	public final void setMicroflowName(java.lang.String microflowname)
	{
		setMicroflowName(getContext(), microflowname);
	}

	/**
	 * Set value of MicroflowName
	 * @param context
	 * @param microflowname
	 */
	public final void setMicroflowName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String microflowname)
	{
		getMendixObject().setValue(context, MemberNames.MicroflowName.toString(), microflowname);
	}

	/**
	 * @return value of UserActionName
	 */
	public final java.lang.String getUserActionName()
	{
		return getUserActionName(getContext());
	}

	/**
	 * @param context
	 * @return value of UserActionName
	 */
	public final java.lang.String getUserActionName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UserActionName.toString());
	}

	/**
	 * Set value of UserActionName
	 * @param useractionname
	 */
	public final void setUserActionName(java.lang.String useractionname)
	{
		setUserActionName(getContext(), useractionname);
	}

	/**
	 * Set value of UserActionName
	 * @param context
	 * @param useractionname
	 */
	public final void setUserActionName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String useractionname)
	{
		getMendixObject().setValue(context, MemberNames.UserActionName.toString(), useractionname);
	}

	/**
	 * @return value of Arguments
	 */
	public final java.lang.String getArguments()
	{
		return getArguments(getContext());
	}

	/**
	 * @param context
	 * @return value of Arguments
	 */
	public final java.lang.String getArguments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Arguments.toString());
	}

	/**
	 * Set value of Arguments
	 * @param arguments
	 */
	public final void setArguments(java.lang.String arguments)
	{
		setArguments(getContext(), arguments);
	}

	/**
	 * Set value of Arguments
	 * @param context
	 * @param arguments
	 */
	public final void setArguments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String arguments)
	{
		getMendixObject().setValue(context, MemberNames.Arguments.toString(), arguments);
	}

	/**
	 * @return value of XASId
	 */
	public final java.lang.String getXASId()
	{
		return getXASId(getContext());
	}

	/**
	 * @param context
	 * @return value of XASId
	 */
	public final java.lang.String getXASId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.XASId.toString());
	}

	/**
	 * Set value of XASId
	 * @param xasid
	 */
	public final void setXASId(java.lang.String xasid)
	{
		setXASId(getContext(), xasid);
	}

	/**
	 * Set value of XASId
	 * @param context
	 * @param xasid
	 */
	public final void setXASId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xasid)
	{
		getMendixObject().setValue(context, MemberNames.XASId.toString(), xasid);
	}

	/**
	 * @return value of ThreadId
	 */
	public final java.lang.Long getThreadId()
	{
		return getThreadId(getContext());
	}

	/**
	 * @param context
	 * @return value of ThreadId
	 */
	public final java.lang.Long getThreadId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.ThreadId.toString());
	}

	/**
	 * Set value of ThreadId
	 * @param threadid
	 */
	public final void setThreadId(java.lang.Long threadid)
	{
		setThreadId(getContext(), threadid);
	}

	/**
	 * Set value of ThreadId
	 * @param context
	 * @param threadid
	 */
	public final void setThreadId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long threadid)
	{
		getMendixObject().setValue(context, MemberNames.ThreadId.toString(), threadid);
	}

	/**
	 * @return value of Created
	 */
	public final java.util.Date getCreated()
	{
		return getCreated(getContext());
	}

	/**
	 * @param context
	 * @return value of Created
	 */
	public final java.util.Date getCreated(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Created.toString());
	}

	/**
	 * Set value of Created
	 * @param created
	 */
	public final void setCreated(java.util.Date created)
	{
		setCreated(getContext(), created);
	}

	/**
	 * Set value of Created
	 * @param context
	 * @param created
	 */
	public final void setCreated(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date created)
	{
		getMendixObject().setValue(context, MemberNames.Created.toString(), created);
	}

	/**
	 * @return value of Started
	 */
	public final java.util.Date getStarted()
	{
		return getStarted(getContext());
	}

	/**
	 * @param context
	 * @return value of Started
	 */
	public final java.util.Date getStarted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Started.toString());
	}

	/**
	 * Set value of Started
	 * @param started
	 */
	public final void setStarted(java.util.Date started)
	{
		setStarted(getContext(), started);
	}

	/**
	 * Set value of Started
	 * @param context
	 * @param started
	 */
	public final void setStarted(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date started)
	{
		getMendixObject().setValue(context, MemberNames.Started.toString(), started);
	}

	/**
	 * @return value of Retried
	 */
	public final java.lang.Long getRetried()
	{
		return getRetried(getContext());
	}

	/**
	 * @param context
	 * @return value of Retried
	 */
	public final java.lang.Long getRetried(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Retried.toString());
	}

	/**
	 * Set value of Retried
	 * @param retried
	 */
	public final void setRetried(java.lang.Long retried)
	{
		setRetried(getContext(), retried);
	}

	/**
	 * Set value of Retried
	 * @param context
	 * @param retried
	 */
	public final void setRetried(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long retried)
	{
		getMendixObject().setValue(context, MemberNames.Retried.toString(), retried);
	}

	/**
	 * @return value of ErrorMessage
	 */
	public final java.lang.String getErrorMessage()
	{
		return getErrorMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of ErrorMessage
	 */
	public final java.lang.String getErrorMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ErrorMessage.toString());
	}

	/**
	 * Set value of ErrorMessage
	 * @param errormessage
	 */
	public final void setErrorMessage(java.lang.String errormessage)
	{
		setErrorMessage(getContext(), errormessage);
	}

	/**
	 * Set value of ErrorMessage
	 * @param context
	 * @param errormessage
	 */
	public final void setErrorMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String errormessage)
	{
		getMendixObject().setValue(context, MemberNames.ErrorMessage.toString(), errormessage);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return processedQueueTaskMendixObject;
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
			final system.proxies.ProcessedQueueTask that = (system.proxies.ProcessedQueueTask) obj;
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
		return "System.ProcessedQueueTask";
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
