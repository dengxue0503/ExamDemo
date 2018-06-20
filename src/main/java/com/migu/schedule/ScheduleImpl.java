package com.migu.schedule;

import com.migu.schedule.constants.ReturnCodeKeys;
import com.migu.schedule.info.TaskInfo;

import javax.jws.WebService;
import java.util.List;

@WebService
public class ScheduleImpl extends  Schedule {

    @Override
    public int init() {

        return ReturnCodeKeys.E000;
    }

    @Override
    public int registerNode(int nodeId) {
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }
    @Override
    public int unregisterNode(int nodeId) {
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }

    @Override
    public int addTask(int taskId, int consumption) {

        return ReturnCodeKeys.E000;
    }

    @Override
    public int deleteTask(int taskId) {
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }

    @Override
    public int scheduleTask(int threshold) {
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }

    @Override
    public int queryTaskStatus(List<TaskInfo> tasks) {
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }
}
