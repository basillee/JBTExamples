// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 04/26/2025 16:56:42
// ******************************************************* 
package org.jbt.example.model.actions;

/** ModelAction class created from MMPM action PassThroughDoor. */
public class PassThroughDoor extends jbt.model.task.leaf.action.ModelAction {
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
	 * Constructor. Constructs an instance of PassThroughDoor.
	 * 
	 * @param PassThroughDoor_InputParameter
	 *            value of the parameter "PassThroughDoor_InputParameter", or
	 *            null in case it should be read from the context. If null,
	 *            <code>PassThroughDoor_InputParameterLoc</code> cannot be null.
	 * @param PassThroughDoor_InputParameterLoc
	 *            in case <code>PassThroughDoor_InputParameter</code> is null,
	 *            this variable represents the place in the context where the
	 *            parameter's value will be retrieved from.
	 */
	public PassThroughDoor(jbt.model.core.ModelTask guard,
			java.lang.Object PassThroughDoor_InputParameter,
			java.lang.String PassThroughDoor_InputParameterLoc) {
		super(guard);
		this.PassThroughDoor_InputParameter = PassThroughDoor_InputParameter;
		this.PassThroughDoor_InputParameterLoc = PassThroughDoor_InputParameterLoc;
	}

	/**
	 * Returns a org.jbt.example.execution.actions.PassThroughDoor task that is
	 * able to run this task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new org.jbt.example.execution.actions.PassThroughDoor(this,
				executor, parent, this.PassThroughDoor_InputParameter,
				this.PassThroughDoor_InputParameterLoc);
	}
}