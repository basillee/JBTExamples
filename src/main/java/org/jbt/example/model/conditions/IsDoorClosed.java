// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 04/26/2025 16:56:43
// ******************************************************* 
package org.jbt.example.model.conditions;

/** ModelCondition class created from MMPM condition IsDoorClosed. */
public class IsDoorClosed extends jbt.model.task.leaf.condition.ModelCondition {

	/** Constructor. Constructs an instance of IsDoorClosed. */
	public IsDoorClosed(jbt.model.core.ModelTask guard) {
		super(guard);
	}

	/**
	 * Returns a org.jbt.example.execution.conditions.IsDoorClosed task that is
	 * able to run this task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new org.jbt.example.execution.conditions.IsDoorClosed(this,
				executor, parent);
	}
}