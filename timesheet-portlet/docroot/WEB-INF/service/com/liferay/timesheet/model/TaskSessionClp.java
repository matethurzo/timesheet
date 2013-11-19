package com.liferay.timesheet.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.timesheet.service.ClpSerializer;
import com.liferay.timesheet.service.TaskSessionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class TaskSessionClp extends BaseModelImpl<TaskSession>
    implements TaskSession {
    private long _taskSessionId;
    private Date _endTime;
    private Date _startTime;
    private long _taskId;
    private BaseModel<?> _taskSessionRemoteModel;

    public TaskSessionClp() {
    }

    public Class<?> getModelClass() {
        return TaskSession.class;
    }

    public String getModelClassName() {
        return TaskSession.class.getName();
    }

    public long getPrimaryKey() {
        return _taskSessionId;
    }

    public void setPrimaryKey(long primaryKey) {
        setTaskSessionId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_taskSessionId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("taskSessionId", getTaskSessionId());
        attributes.put("endTime", getEndTime());
        attributes.put("startTime", getStartTime());
        attributes.put("taskId", getTaskId());

        return attributes;
    }

    @Override
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

    public long getTaskSessionId() {
        return _taskSessionId;
    }

    public void setTaskSessionId(long taskSessionId) {
        _taskSessionId = taskSessionId;

        if (_taskSessionRemoteModel != null) {
            try {
                Class<?> clazz = _taskSessionRemoteModel.getClass();

                Method method = clazz.getMethod("setTaskSessionId", long.class);

                method.invoke(_taskSessionRemoteModel, taskSessionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public Date getEndTime() {
        return _endTime;
    }

    public void setEndTime(Date endTime) {
        _endTime = endTime;

        if (_taskSessionRemoteModel != null) {
            try {
                Class<?> clazz = _taskSessionRemoteModel.getClass();

                Method method = clazz.getMethod("setEndTime", Date.class);

                method.invoke(_taskSessionRemoteModel, endTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public Date getStartTime() {
        return _startTime;
    }

    public void setStartTime(Date startTime) {
        _startTime = startTime;

        if (_taskSessionRemoteModel != null) {
            try {
                Class<?> clazz = _taskSessionRemoteModel.getClass();

                Method method = clazz.getMethod("setStartTime", Date.class);

                method.invoke(_taskSessionRemoteModel, startTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public long getTaskId() {
        return _taskId;
    }

    public void setTaskId(long taskId) {
        _taskId = taskId;

        if (_taskSessionRemoteModel != null) {
            try {
                Class<?> clazz = _taskSessionRemoteModel.getClass();

                Method method = clazz.getMethod("setTaskId", long.class);

                method.invoke(_taskSessionRemoteModel, taskId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getTaskSessionRemoteModel() {
        return _taskSessionRemoteModel;
    }

    public void setTaskSessionRemoteModel(BaseModel<?> taskSessionRemoteModel) {
        _taskSessionRemoteModel = taskSessionRemoteModel;
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

        Class<?> remoteModelClass = _taskSessionRemoteModel.getClass();

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

        Object returnValue = method.invoke(_taskSessionRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            TaskSessionLocalServiceUtil.addTaskSession(this);
        } else {
            TaskSessionLocalServiceUtil.updateTaskSession(this);
        }
    }

    @Override
    public TaskSession toEscapedModel() {
        return (TaskSession) ProxyUtil.newProxyInstance(TaskSession.class.getClassLoader(),
            new Class[] { TaskSession.class }, new AutoEscapeBeanHandler(this));
    }

    public TaskSession toUnescapedModel() {
        return this;
    }

    @Override
    public Object clone() {
        TaskSessionClp clone = new TaskSessionClp();

        clone.setTaskSessionId(getTaskSessionId());
        clone.setEndTime(getEndTime());
        clone.setStartTime(getStartTime());
        clone.setTaskId(getTaskId());

        return clone;
    }

    public int compareTo(TaskSession taskSession) {
        long primaryKey = taskSession.getPrimaryKey();

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

        if (!(obj instanceof TaskSessionClp)) {
            return false;
        }

        TaskSessionClp taskSession = (TaskSessionClp) obj;

        long primaryKey = taskSession.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{taskSessionId=");
        sb.append(getTaskSessionId());
        sb.append(", endTime=");
        sb.append(getEndTime());
        sb.append(", startTime=");
        sb.append(getStartTime());
        sb.append(", taskId=");
        sb.append(getTaskId());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.liferay.timesheet.model.TaskSession");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>taskSessionId</column-name><column-value><![CDATA[");
        sb.append(getTaskSessionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>endTime</column-name><column-value><![CDATA[");
        sb.append(getEndTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>startTime</column-name><column-value><![CDATA[");
        sb.append(getStartTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>taskId</column-name><column-value><![CDATA[");
        sb.append(getTaskId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
