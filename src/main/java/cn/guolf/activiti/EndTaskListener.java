package cn.guolf.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

import java.util.Map;

/**
 * @author 李仲允
 * @date 2022/4/19 11:27
 */
public class EndTaskListener implements ExecutionListener {
    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {
        System.out.println("delegateTask.getEventName() = " + delegateExecution.getEventName());
        System.out.println("assignee = " + delegateExecution.getCurrentActivityId());
        Map<String, Object> var = delegateExecution.getVariables();
        System.out.println("var = " + var);
    }
}
