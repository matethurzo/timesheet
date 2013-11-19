package com.liferay.timesheet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TaskLocalService}.
 * </p>
 *
 * @author    Adorjan
 * @see       TaskLocalService
 * @generated
 */
public class TaskLocalServiceWrapper implements TaskLocalService,
    ServiceWrapper<TaskLocalService> {
    private TaskLocalService _taskLocalService;

    public TaskLocalServiceWrapper(TaskLocalService taskLocalService) {
        _taskLocalService = taskLocalService;
    }

    /**
    * Adds the task to the database. Also notifies the appropriate model listeners.
    *
    * @param task the task
    * @return the task that was added
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.timesheet.model.Task addTask(
        com.liferay.timesheet.model.Task task)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.addTask(task);
    }

    /**
    * Creates a new task with the primary key. Does not add the task to the database.
    *
    * @param taskId the primary key for the new task
    * @return the new task
    */
    public com.liferay.timesheet.model.Task createTask(long taskId) {
        return _taskLocalService.createTask(taskId);
    }

    /**
    * Deletes the task with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param taskId the primary key of the task
    * @return the task that was removed
    * @throws PortalException if a task with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.timesheet.model.Task deleteTask(long taskId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.deleteTask(taskId);
    }

    /**
    * Deletes the task from the database. Also notifies the appropriate model listeners.
    *
    * @param task the task
    * @return the task that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.timesheet.model.Task deleteTask(
        com.liferay.timesheet.model.Task task)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.deleteTask(task);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _taskLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.liferay.timesheet.model.Task fetchTask(long taskId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.fetchTask(taskId);
    }

    /**
    * Returns the task with the primary key.
    *
    * @param taskId the primary key of the task
    * @return the task
    * @throws PortalException if a task with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.timesheet.model.Task getTask(long taskId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.getTask(taskId);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the tasks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of tasks
    * @param end the upper bound of the range of tasks (not inclusive)
    * @return the range of tasks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.timesheet.model.Task> getTasks(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.getTasks(start, end);
    }

    /**
    * Returns the number of tasks.
    *
    * @return the number of tasks
    * @throws SystemException if a system exception occurred
    */
    public int getTasksCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.getTasksCount();
    }

    /**
    * Updates the task in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param task the task
    * @return the task that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.timesheet.model.Task updateTask(
        com.liferay.timesheet.model.Task task)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.updateTask(task);
    }

    /**
    * Updates the task in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param task the task
    * @param merge whether to merge the task with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the task that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.timesheet.model.Task updateTask(
        com.liferay.timesheet.model.Task task, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.updateTask(task, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _taskLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _taskLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _taskLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    public com.liferay.timesheet.model.Task addTask(long companyId,
        long userId, java.util.Date startDate, java.util.Date endDate,
        java.lang.String taskName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.addTask(companyId, userId, startDate, endDate,
            taskName);
    }

    public java.util.List<com.liferay.timesheet.model.Task> getTasks(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return _taskLocalService.getTasks(userId);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public TaskLocalService getWrappedTaskLocalService() {
        return _taskLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedTaskLocalService(TaskLocalService taskLocalService) {
        _taskLocalService = taskLocalService;
    }

    public TaskLocalService getWrappedService() {
        return _taskLocalService;
    }

    public void setWrappedService(TaskLocalService taskLocalService) {
        _taskLocalService = taskLocalService;
    }
}
