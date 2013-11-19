package com.liferay.timesheet.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    Istvan Sajtos
 * @generated
 */
public class TaskSoap implements Serializable {
    private long _taskId;
    private long _userId;
    private String _taskName;

    public TaskSoap() {
    }

    public static TaskSoap toSoapModel(Task model) {
        TaskSoap soapModel = new TaskSoap();

        soapModel.setTaskId(model.getTaskId());
        soapModel.setUserId(model.getUserId());
        soapModel.setTaskName(model.getTaskName());

        return soapModel;
    }

    public static TaskSoap[] toSoapModels(Task[] models) {
        TaskSoap[] soapModels = new TaskSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TaskSoap[][] toSoapModels(Task[][] models) {
        TaskSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TaskSoap[models.length][models[0].length];
        } else {
            soapModels = new TaskSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TaskSoap[] toSoapModels(List<Task> models) {
        List<TaskSoap> soapModels = new ArrayList<TaskSoap>(models.size());

        for (Task model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TaskSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _taskId;
    }

    public void setPrimaryKey(long pk) {
        setTaskId(pk);
    }

    public long getTaskId() {
        return _taskId;
    }

    public void setTaskId(long taskId) {
        _taskId = taskId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getTaskName() {
        return _taskName;
    }

    public void setTaskName(String taskName) {
        _taskName = taskName;
    }
}
