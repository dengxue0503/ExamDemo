package com.migu.schedule;


import com.migu.schedule.constants.ReturnCodeKeys;
import com.migu.schedule.info.TaskInfo;
import com.sun.javafx.tk.Toolkit;

import java.util.ArrayList;
import java.util.List;

/*
*类名和方法不能修改
 */
public class Schedule {


    public int init() {
        // TODO 方法未实现
        TaskInfo taskinfo=new TaskInfo();
        return ReturnCodeKeys.E001;
    }


    public int registerNode(int nodeId) {
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }

    public int unregisterNode(int nodeId) {
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }


    public int addTask(int taskId, int consumption) {
        // TODO 方法未实现
        if(taskId<0){
            return ReturnCodeKeys.E009;
        }

        return ReturnCodeKeys.E010;
    }


    public int deleteTask(int taskId) {
        // TODO 方法未实现

        return ReturnCodeKeys.E000;
    }


    public int scheduleTask(int threshold) {
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }


    public int queryTaskStatus(List<TaskInfo> tasks) {
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }

}
