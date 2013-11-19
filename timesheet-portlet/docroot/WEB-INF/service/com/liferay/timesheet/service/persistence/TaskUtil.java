package com.liferay.timesheet.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.timesheet.model.Task;

import java.util.List;

/**
 * The persistence utility for the task service. This utility wraps {@link TaskPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Adorjan
 * @see TaskPersistence
 * @see TaskPersistenceImpl
 * @generated
 */
public class TaskUtil {
    private static TaskPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Task task) {
        getPersistence().clearCache(task);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Task> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Task> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Task> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static Task update(Task task, boolean merge)
        throws SystemException {
        return getPersistence().update(task, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static Task update(Task task, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(task, merge, serviceContext);
    }

    /**
    * Caches the task in the entity cache if it is enabled.
    *
    * @param task the task
    */
    public static void cacheResult(com.liferay.timesheet.model.Task task) {
        getPersistence().cacheResult(task);
    }

    /**
    * Caches the tasks in the entity cache if it is enabled.
    *
    * @param tasks the tasks
    */
    public static void cacheResult(
        java.util.List<com.liferay.timesheet.model.Task> tasks) {
        getPersistence().cacheResult(tasks);
    }

    /**
    * Creates a new task with the primary key. Does not add the task to the database.
    *
    * @param taskId the primary key for the new task
    * @return the new task
    */
    public static com.liferay.timesheet.model.Task create(long taskId) {
        return getPersistence().create(taskId);
    }

    /**
    * Removes the task with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param taskId the primary key of the task
    * @return the task that was removed
    * @throws com.liferay.timesheet.NoSuchTaskException if a task with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.timesheet.model.Task remove(long taskId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.timesheet.NoSuchTaskException {
        return getPersistence().remove(taskId);
    }

    public static com.liferay.timesheet.model.Task updateImpl(
        com.liferay.timesheet.model.Task task, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(task, merge);
    }

    /**
    * Returns the task with the primary key or throws a {@link com.liferay.timesheet.NoSuchTaskException} if it could not be found.
    *
    * @param taskId the primary key of the task
    * @return the task
    * @throws com.liferay.timesheet.NoSuchTaskException if a task with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.timesheet.model.Task findByPrimaryKey(long taskId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.timesheet.NoSuchTaskException {
        return getPersistence().findByPrimaryKey(taskId);
    }

    /**
    * Returns the task with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param taskId the primary key of the task
    * @return the task, or <code>null</code> if a task with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.timesheet.model.Task fetchByPrimaryKey(
        long taskId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(taskId);
    }

    /**
    * Returns all the tasks where userId = &#63;.
    *
    * @param userId the user ID
    * @return the matching tasks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.timesheet.model.Task> findByUserId(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUserId(userId);
    }

    /**
    * Returns a range of all the tasks where userId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userId the user ID
    * @param start the lower bound of the range of tasks
    * @param end the upper bound of the range of tasks (not inclusive)
    * @return the range of matching tasks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.timesheet.model.Task> findByUserId(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUserId(userId, start, end);
    }

    /**
    * Returns an ordered range of all the tasks where userId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userId the user ID
    * @param start the lower bound of the range of tasks
    * @param end the upper bound of the range of tasks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching tasks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.timesheet.model.Task> findByUserId(
        long userId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUserId(userId, start, end, orderByComparator);
    }

    /**
    * Returns the first task in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching task
    * @throws com.liferay.timesheet.NoSuchTaskException if a matching task could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.timesheet.model.Task findByUserId_First(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.timesheet.NoSuchTaskException {
        return getPersistence().findByUserId_First(userId, orderByComparator);
    }

    /**
    * Returns the first task in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching task, or <code>null</code> if a matching task could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.timesheet.model.Task fetchByUserId_First(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUserId_First(userId, orderByComparator);
    }

    /**
    * Returns the last task in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching task
    * @throws com.liferay.timesheet.NoSuchTaskException if a matching task could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.timesheet.model.Task findByUserId_Last(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.timesheet.NoSuchTaskException {
        return getPersistence().findByUserId_Last(userId, orderByComparator);
    }

    /**
    * Returns the last task in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching task, or <code>null</code> if a matching task could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.timesheet.model.Task fetchByUserId_Last(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUserId_Last(userId, orderByComparator);
    }

    /**
    * Returns the tasks before and after the current task in the ordered set where userId = &#63;.
    *
    * @param taskId the primary key of the current task
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next task
    * @throws com.liferay.timesheet.NoSuchTaskException if a task with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.timesheet.model.Task[] findByUserId_PrevAndNext(
        long taskId, long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.timesheet.NoSuchTaskException {
        return getPersistence()
                   .findByUserId_PrevAndNext(taskId, userId, orderByComparator);
    }

    /**
    * Returns all the tasks.
    *
    * @return the tasks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.timesheet.model.Task> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.liferay.timesheet.model.Task> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the tasks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of tasks
    * @param end the upper bound of the range of tasks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of tasks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.timesheet.model.Task> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the tasks where userId = &#63; from the database.
    *
    * @param userId the user ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUserId(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUserId(userId);
    }

    /**
    * Removes all the tasks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of tasks where userId = &#63;.
    *
    * @param userId the user ID
    * @return the number of matching tasks
    * @throws SystemException if a system exception occurred
    */
    public static int countByUserId(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUserId(userId);
    }

    /**
    * Returns the number of tasks.
    *
    * @return the number of tasks
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TaskPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TaskPersistence) PortletBeanLocatorUtil.locate(com.liferay.timesheet.service.ClpSerializer.getServletContextName(),
                    TaskPersistence.class.getName());

            ReferenceRegistry.registerReference(TaskUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(TaskPersistence persistence) {
    }
}
