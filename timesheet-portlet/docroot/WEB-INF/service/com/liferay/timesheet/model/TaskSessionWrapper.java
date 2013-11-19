package com.liferay.timesheet.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TaskSession}.
 * </p>
 *
 * @author    Istvan Sajtos
 * @see       TaskSession
 * @generated
 */
public class TaskSessionWrapper implements TaskSession,
    ModelWrapper<TaskSession> {
    private TaskSession _taskSession;

    public TaskSessionWrapper(TaskSession taskSession) {
        _taskSession = taskSession;
    }

    public Class<?> getModelClass() {
        return TaskSession.class;
    }

    public String getModelClassName() {
        return TaskSession.class.getName();
    }

    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("taskSessionId", getTaskSessionId());
        attributes.put("endTime", getEndTime());
        attributes.put("startTime", getStartTime());
        attributes.put("taskId", getTaskId());

        return attributes;
    }

    public void setModelAttributes(Map<String, Object> attributes) {
        Long taskSessionId = (Long) attributes.get("taskSessionId");

        if (taskSessionId != null) {
            setTaskSessionId(taskSessionId);
        }

        Date endTime = (Date) attributes.get("endTime");

        if (endTime != null) {
            setEndTime(endTime);
        }

        Date startTime = (Date) attributes.get("startTime");

        if (startTime != null) {
            setStartTime(startTime);
        }

        Long taskId = (Long) attributes.get("taskId");

        if (taskId != null) {
            setTaskId(taskId);
        }
    }

    /**
    * Returns the primary key of this task session.
    *
    * @return the primary key of this task session
    */
    public long getPrimaryKey() {
        return _taskSession.getPrimaryKey();
    }

    /**
    * Sets the primary key of this task session.
    *
    * @param primaryKey the primary key of this task session
    */
    public void setPrimaryKey(long primaryKey) {
        _taskSession.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the task session ID of this task session.
    *
    * @return the task session ID of this task session
    */
    public long getTaskSessionId() {
        return _taskSession.getTaskSessionId();
    }

    /**
    * Sets the task session ID of this task session.
    *
    * @param taskSessionId the task session ID of this task session
    */
    public void setTaskSessionId(long taskSessionId) {
        _taskSession.setTaskSessionId(taskSessionId);
    }

    /**
    * Returns the end time of this task session.
    *
    * @return the end time of this task session
    */
    public java.util.Date getEndTime() {
        return _taskSession.getEndTime();
    }

    /**
    * Sets the end time of this task session.
    *
    * @param endTime the end time of this task session
    */
    public void setEndTime(java.util.Date endTime) {
        _taskSession.setEndTime(endTime);
    }

    /**
    * Returns the start time of this task session.
    *
    * @return the start time of this task session
    */
    public java.util.Date getStartTime() {
        return _taskSession.getStartTime();
    }

    /**
    * Sets the start time of this task session.
    *
    * @param startTime the start time of this task session
    */
    public void setStartTime(java.util.Date startTime) {
        _taskSession.setStartTime(startTime);
    }

    /**
    * Returns the task ID of this task session.
    *
    * @return the task ID of this task session
    */
    public long getTaskId() {
        return _taskSession.getTaskId();
    }

    /**
    * Sets the task ID of this task session.
    *
    * @param taskId the task ID of this task session
    */
    public void setTaskId(long taskId) {
        _taskSession.setTaskId(taskId);
    }

    public boolean isNew() {
        return _taskSession.isNew();
    }

    public void setNew(boolean n) {
        _taskSession.setNew(n);
    }

    public boolean isCachedModel() {
        return _taskSession.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _taskSession.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _taskSession.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _taskSession.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _taskSession.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _taskSession.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _taskSession.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TaskSessionWrapper((TaskSession) _taskSession.clone());
    }

    public int compareTo(com.liferay.timesheet.model.TaskSession taskSession) {
        return _taskSession.compareTo(taskSession);
    }

    @Override
    public int hashCode() {
        return _taskSession.hashCode();
    }

    public com.liferay.portal.model.CacheModel<com.liferay.timesheet.model.TaskSession> toCacheModel() {
        return _taskSession.toCacheModel();
    }

    public com.liferay.timesheet.model.TaskSession toEscapedModel() {
        return new TaskSessionWrapper(_taskSession.toEscapedModel());
    }

    public com.liferay.timesheet.model.TaskSession toUnescapedModel() {
        return new TaskSessionWrapper(_taskSession.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _taskSession.toString();
    }

    public java.lang.String toXmlString() {
        return _taskSession.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _taskSession.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TaskSessionWrapper)) {
            return false;
        }

        TaskSessionWrapper taskSessionWrapper = (TaskSessionWrapper) obj;

        if (Validator.equals(_taskSession, taskSessionWrapper._taskSession)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public TaskSession getWrappedTaskSession() {
        return _taskSession;
    }

    public TaskSession getWrappedModel() {
        return _taskSession;
    }

    public void resetOriginalValues() {
        _taskSession.resetOriginalValues();
    }
}
