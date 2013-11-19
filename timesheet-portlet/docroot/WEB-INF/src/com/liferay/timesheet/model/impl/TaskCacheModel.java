package com.liferay.timesheet.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.timesheet.model.Task;

import java.io.Serializable;

/**
 * The cache model class for representing Task in entity cache.
 *
 * @author Istvan Sajtos
 * @see Task
 * @generated
 */
public class TaskCacheModel implements CacheModel<Task>, Serializable {
    public long taskId;
    public long userId;
    public String taskName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{taskId=");
        sb.append(taskId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", taskName=");
        sb.append(taskName);
        sb.append("}");

        return sb.toString();
    }

    public Task toEntityModel() {
        TaskImpl taskImpl = new TaskImpl();

        taskImpl.setTaskId(taskId);
        taskImpl.setUserId(userId);

        if (taskName == null) {
            taskImpl.setTaskName(StringPool.BLANK);
        } else {
            taskImpl.setTaskName(taskName);
        }

        taskImpl.resetOriginalValues();

        return taskImpl;
    }
}
