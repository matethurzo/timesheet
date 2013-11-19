package com.liferay.timesheet.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.timesheet.model.TaskSession;
import com.liferay.timesheet.service.TaskSessionLocalServiceUtil;

/**
 * @author Istvan Sajtos
 * @generated
 */
public abstract class TaskSessionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TaskSessionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TaskSessionLocalServiceUtil.getService());
        setClass(TaskSession.class);

        setClassLoader(com.liferay.timesheet.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("taskSessionId");
    }
}
