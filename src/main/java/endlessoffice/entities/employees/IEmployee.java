package endlessoffice.entities.employees;

//region Module import
import endlessoffice.entities.actions.Action;
//endregion

/**
 * This interface implements Employee methods
 */
public interface IEmployee {

    /**
     * Performs an action by the Employee
     * @param actionToExecute: action to execute
     */
    Action acts(Action actionToExecute);

    /**
     * Adds a task in the Employee planning
     * @param task: task to add
     */
    void addTaskInPlanning(Action task);

    /**
     * Delete a task from the Employee planning
     * @param taskId: id of the task to delete
     */
    void deleteTaskFromPlanning(int taskId);

    /**
     * Update a task from the Employee planning
     * @param taskId: id of the task to update
     */
    void updateTaskFromPlanning(int taskId);
}
