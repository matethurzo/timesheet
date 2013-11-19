package com.liferay.timesheet.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.liferay.timesheet.model.TaskSession;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TaskSession in entity cache.
 *
 * @author Istvan Sajtos
 * @see TaskSession
 * @generated
 */
public class TaskSessionCacheModel implements CacheModel<TaskSession>,
    Serializable {
    public long taskSessionId;
    public long endTime;
    public long startTime;
    public long taskId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{taskSessionId=");
        sb.append(taskSessionId);
        sb.append(", endTime=");
        sb.append(endTime);
        sb.append(", startTime=");
        sb.append(startTime);
        sb.append(", taskId=");
        sb.append(taskId);
        sb.append("}");

        return sb.toString();
    }

    public TaskSession toEntityModel() {
        TaskSessionImpl taskSessionImpl = new TaskSessionImpl();

        taskSessionImpl.setTaskSessionId(taskSessionId);

        if (endTime == Long.MIN_VALUE) {
            taskSessionImpl.setEndTime(null);
        } else {
            taskSessionImpl.setEndTime(new Date(endTime));
        }

        if (startTime == Long.MIN_VALUE) {
            taskSessionImpl.setStartTime(null);
        } else {
            taskSessionImpl.setStartTime(new Date(startTime));
        }

        taskSessionImpl.setTaskId(taskId);

        taskSessionImpl.resetOriginalValues();

        return taskSessionImpl;
    }
}
