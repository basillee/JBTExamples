// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 05/01/2025 20:38:54
// ******************************************************* 
package org.jbt.example.model.actions;

/** ModelAction class created from MMPM action OpenDoor. */
public class OpenDoor extends jbt.model.task.leaf.action.ModelAction {

	/** Constructor. Constructs an instance of OpenDoor. */
	public OpenDoor(jbt.model.core.ModelTask guard) {
		super(guard);
	}

	/**
	 * Returns a org.jbt.example.execution.actions.OpenDoor task that is able to
	 * run this task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new org.jbt.example.execution.actions.OpenDoor(this, executor,
				parent);
	}
}