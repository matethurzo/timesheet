package com.liferay.timesheet.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    Istvan Sajtos
 * @generated
 */
public class TaskSessionSoap implements Serializable {
    private long _taskSessionId;
    private Date _endTime;
    private Date _startTime;
    private long _taskId;

    public TaskSessionSoap() {
    }

    public static TaskSessionSoap toSoapModel(TaskSession model) {
        TaskSessionSoap soapModel = new TaskSessionSoap();

        soapModel.setTaskSessionId(model.getTaskSessionId());
        soapModel.setEndTime(model.getEndTime());
        soapModel.setStartTime(model.getStartTime());
        soapModel.setTaskId(model.getTaskId());

        return soapModel;
    }

    public static TaskSessionSoap[] toSoapModels(TaskSession[] models) {
        TaskSessionSoap[] soapModels = new TaskSessionSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TaskSessionSoap[][] toSoapModels(TaskSession[][] models) {
        TaskSessionSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TaskSessionSoap[models.length][models[0].length];
        } else {
            soapModels = new TaskSessionSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TaskSessionSoap[] toSoapModels(List<TaskSession> models) {
        List<TaskSessionSoap> soapModels = new ArrayList<TaskSessionSoap>(models.size());

        for (TaskSession model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TaskSessionSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _taskSessionId;
    }

    public void setPrimaryKey(long pk) {
        setTaskSessionId(pk);
    }

    public long getTaskSessionId() {
        return _taskSessionId;
    }

    public void setTaskSessionId(long taskSessionId) {
        _taskSessionId = taskSessionId;
    }

    public Date getEndTime() {
        return _endTime;
    }

    public void setEndTime(Date endTime) {
        _endTime = endTime;
    }

    public Date getStartTime() {
        return _startTime;
    }

    public void setStartTime(Date startTime) {
        _startTime = startTime;
    }

    public long getTaskId() {
        return _taskId;
    }

    public void setTaskId(long taskId) {
        _taskId = taskId;
    }
}
