package com.liferay.timesheet.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.timesheet.model.TaskSession;
import com.liferay.timesheet.service.base.TaskSessionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the task session local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.timesheet.service.TaskSessionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Istvan Sajtos
 * @see com.liferay.timesheet.service.base.TaskSessionLocalServiceBaseImpl
 * @see com.liferay.timesheet.service.TaskSessionLocalServiceUtil
 */
public class TaskSessionLocalServiceImpl
	extends TaskSessionLocalServiceBaseImpl {

	public TaskSession addTaskSession(Date startTime, Date endTime, long taskId)
		throws SystemException {

		long taskSessionId = counterLocalService.increment();

		TaskSession taskSession = taskSessionPersistence.create(taskSessionId);

		taskSession.setStartTime(startTime);
		taskSession.setEndTime(endTime);
		taskSession.setTaskId(taskId);

		taskSessionPersistence.update(taskSession, false);

		return taskSession;
	}

	public List<TaskSession> getTaskSessionsByD_U(Date date, long userId) {

		List<TaskSession> taskSessions = null;
				// taskSessionFinder.findByD_U(date, userId, 0, 20);

		return taskSessions;
	}
}