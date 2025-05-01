// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 05/01/2025 20:38:54
// ******************************************************* 
package org.jbt.example;

/**
 * BT library that includes the trees read from the following files:
 * <ul>
 * <li>/Users/liyao/Downloads/JBTExamples/src/main/resources/jbt_example.xbt</li>
 * </ul>
 */
public class ExampleTree implements jbt.execution.core.IBTLibrary {
	/**
	 * Tree generated from file
	 * /Users/liyao/Downloads/JBTExamples/src/main/resources/jbt_example.xbt.
	 */
	private static jbt.model.core.ModelTask jbt_example;

	/* Static initialization of all the trees. */
	static {
		jbt_example = new jbt.model.task.composite.ModelSequence(
				null,
				new jbt.model.task.composite.ModelSelector(
						null,
						new jbt.model.task.composite.ModelSequence(
								null,
								new org.jbt.example.model.conditions.IsDoorClosed(
										null),
								new org.jbt.example.model.actions.OpenDoor(null),
								new org.jbt.example.model.actions.PassThroughDoor(
										null, null,
										"PassThroughDoor_InputParameter")),
						new org.jbt.example.model.actions.PassThroughDoor(null,
								null, "PassThroughDoor_InputParameter")));

	}

	/**
	 * Returns a behaviour tree by its name, or null in case it cannot be found.
	 * It must be noted that the trees that are retrieved belong to the class,
	 * not to the instance (that is, the trees are static members of the class),
	 * so they are shared among all the instances of this class.
	 */
	public jbt.model.core.ModelTask getBT(String name) {
		if (name.equals("jbt_example")) {
			return jbt_example;
		}
		return null;
	}

	/**
	 * Returns an Iterator that is able to iterate through all the elements in
	 * the library. It must be noted that the iterator does not support the
	 * "remove()" operation. It must be noted that the trees that are retrieved
	 * belong to the class, not to the instance (that is, the trees are static
	 * members of the class), so they are shared among all the instances of this
	 * class.
	 */
	public java.util.Iterator<jbt.util.Pair<String, jbt.model.core.ModelTask>> iterator() {
		return new BTLibraryIterator();
	}

	private class BTLibraryIterator
			implements
			java.util.Iterator<jbt.util.Pair<String, jbt.model.core.ModelTask>> {
		static final long numTrees = 1;
		long currentTree = 0;

		public boolean hasNext() {
			return this.currentTree < numTrees;
		}

		public jbt.util.Pair<String, jbt.model.core.ModelTask> next() {
			this.currentTree++;

			if ((this.currentTree - 1) == 0) {
				return new jbt.util.Pair<String, jbt.model.core.ModelTask>(
						"jbt_example", jbt_example);
			}

			throw new java.util.NoSuchElementException();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
