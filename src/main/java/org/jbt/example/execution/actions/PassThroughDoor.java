// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                MUST BE CAREFULLY COMPLETED              
//                                                         
//           ABSTRACT METHODS MUST BE IMPLEMENTED          
//                                                         
// Generated on 04/26/2025 16:56:43
// ******************************************************* 
package org.jbt.example.execution.actions;

/** ExecutionAction class created from MMPM action PassThroughDoor. */
public class PassThroughDoor extends
		jbt.execution.task.leaf.action.ExecutionAction {
	/**
	 * Value of the parameter "PassThroughDoor_InputParameter" in case its value
	 * is specified at construction time. null otherwise.
	 */
	private java.lang.Object PassThroughDoor_InputParameter;
	/**
	 * Location, in the context, of the parameter
	 * "PassThroughDoor_InputParameter" in case its value is not specified at
	 * construction time. null otherwise.
	 */
	private java.lang.String PassThroughDoor_InputParameterLoc;

	/**
	 * Constructor. Constructs an instance of PassThroughDoor that is able to
	 * run a org.jbt.example.model.actions.PassThroughDoor.
	 * 
	 * @param PassThroughDoor_InputParameter
	 *            value of the parameter "PassThroughDoor_InputParameter", or
	 *            null in case it should be read from the context. If null,
	 *            <code>PassThroughDoor_InputParameterLoc<code> cannot be null.
	 * @param PassThroughDoor_InputParameterLoc
	 *            in case <code>PassThroughDoor_InputParameter</code> is null,
	 *            this variable represents the place in the context where the
	 *            parameter's value will be retrieved from.
	 */
	public PassThroughDoor(
			org.jbt.example.model.actions.PassThroughDoor modelTask,
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent,
			java.lang.Object PassThroughDoor_InputParameter,
			java.lang.String PassThroughDoor_InputParameterLoc) {
		super(modelTask, executor, parent);

		this.PassThroughDoor_InputParameter = PassThroughDoor_InputParameter;
		this.PassThroughDoor_InputParameterLoc = PassThroughDoor_InputParameterLoc;
	}

	/**
	 * Returns the value of the parameter "PassThroughDoor_InputParameter", or
	 * null in case it has not been specified or it cannot be found in the
	 * context.
	 */
	public java.lang.Object getPassThroughDoor_InputParameter() {
		if (this.PassThroughDoor_InputParameter != null) {
			return this.PassThroughDoor_InputParameter;
		} else {
			return (java.lang.Object) this.getContext().getVariable(
					this.PassThroughDoor_InputParameterLoc);
		}
	}

	protected void internalSpawn() {
		/*
		 * Do not remove this first line unless you know what it does and you
		 * need not do it.
		 */
		this.getExecutor().requestInsertionIntoList(
				jbt.execution.core.BTExecutor.BTExecutorList.TICKABLE, this);
		/* TODO: this method's implementation must be completed. */
		System.out.println(this.getClass().getCanonicalName() + " spawned");
	}

	protected jbt.execution.core.ExecutionTask.Status internalTick() {
		/*
		 * TODO: this method's implementation must be completed. This function
		 * should only return Status.SUCCESS, Status.FAILURE or Status.RUNNING.
		 * No other values are allowed.
		 */
		Status status = Status.SUCCESS;
		System.out.println(this.getClass().getCanonicalName() + " ticked status = " + status);
		return status;
	}

	protected void internalTerminate() {
		/* TODO: this method's implementation must be completed. */
	}

	protected void restoreState(jbt.execution.core.ITaskState state) {
		/* TODO: this method's implementation must be completed. */
	}

	protected jbt.execution.core.ITaskState storeState() {
		/* TODO: this method's implementation must be completed. */
		return null;
	}

	protected jbt.execution.core.ITaskState storeTerminationState() {
		/* TODO: this method's implementation must be completed. */
		return null;
	}
}