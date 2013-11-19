package com.liferay.timesheet.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.timesheet.service.ClpSerializer;
import com.liferay.timesheet.service.TaskLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class TaskClp extends BaseModelImpl<Task> implements Task {
    private long _taskId;
    private long _userId;
    private String _userUuid;
    private String _taskName;
    private BaseModel<?> _taskRemoteModel;

    public TaskClp() {
    }

    public Class<?> getModelClass() {
        return Task.class;
    }

    public String getModelClassName() {
        return Task.class.getName();
    }

    public long getPrimaryKey() {
        return _taskId;
    }

    public void setPrimaryKey(long primaryKey) {
        setTaskId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_taskId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("taskId", getTaskId());
        attributes.put("userId", getUserId());
        attributes.put("taskName", getTaskName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long taskId = (Long) attributes.get("taskId");

        if (taskId != null) {
            setTaskId(taskId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String taskName = (String) attributes.get("taskName");

        if (taskName != null) {
            setTaskName(taskName);
        }
    }

    public long getTaskId() {
        return _taskId;
    }

    public void setTaskId(long taskId) {
        _taskId = taskId;

        if (_taskRemoteModel != null) {
            try {
                Class<?> clazz = _taskRemoteModel.getClass();

                Method method = clazz.getMethod("setTaskId", long.class);

                method.invoke(_taskRemoteModel, taskId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;

        if (_taskRemoteModel != null) {
            try {
                Class<?> clazz = _taskRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_taskRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    public String getTaskName() {
        return _taskName;
    }

    public void setTaskName(String taskName) {
        _taskName = taskName;

        if (_taskRemoteModel != null) {
            try {
                Class<?> clazz = _taskRemoteModel.getClass();

                Method method = clazz.getMethod("setTaskName", String.class);

                method.invoke(_taskRemoteModel, taskName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getTaskRemoteModel() {
        return _taskRemoteModel;
    }

    public void setTaskRemoteModel(BaseModel<?> taskRemoteModel) {
        _taskRemoteModel = taskRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _taskRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_taskRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            TaskLocalServiceUtil.addTask(this);
        } else {
            TaskLocalServiceUtil.updateTask(this);
        }
    }

    @Override
    public Task toEscapedModel() {
        return (Task) ProxyUtil.newProxyInstance(Task.class.getClassLoader(),
            new Class[] { Task.class }, new AutoEscapeBeanHandler(this));
    }

    public Task toUnescapedModel() {
        return this;
    }

    @Override
    public Object clone() {
        TaskClp clone = new TaskClp();

        clone.setTaskId(getTaskId());
        clone.setUserId(getUserId());
        clone.setTaskName(getTaskName());

        return clone;
    }

    public int compareTo(Task task) {
        long primaryKey = task.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TaskClp)) {
            return false;
        }

        TaskClp task = (TaskClp) obj;

        long primaryKey = task.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{taskId=");
        sb.append(getTaskId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", taskName=");
        sb.append(getTaskName());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.liferay.timesheet.model.Task");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>taskId</column-name><column-value><![CDATA[");
        sb.append(getTaskId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>taskName</column-name><column-value><![CDATA[");
        sb.append(getTaskName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
