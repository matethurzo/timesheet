package com.liferay.timesheet.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.timesheet.service.http.TaskServiceSoap}.
 *
 * @author    Adorjan
 * @see       com.liferay.timesheet.service.http.TaskServiceSoap
 * @generated
 */
public class TaskSoap implements Serializable {
    private long _taskId;
    private long _companyId;
    private long _userId;
    private Date _startDate;
    private Date _endDate;
    private String _taskName;

    public TaskSoap() {
    }

    public static TaskSoap toSoapModel(Task model) {
        TaskSoap soapModel = new TaskSoap();

        soapModel.setTaskId(model.getTaskId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setStartDate(model.getStartDate());
        soapModel.setEndDate(model.getEndDate());
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

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public Date getStartDate() {
        return _startDate;
    }

    public void setStartDate(Date startDate) {
        _startDate = startDate;
    }

    public Date getEndDate() {
        return _endDate;
    }

    public void setEndDate(Date endDate) {
        _endDate = endDate;
    }

    public String getTaskName() {
        return _taskName;
    }

    public void setTaskName(String taskName) {
        _taskName = taskName;
    }
}
