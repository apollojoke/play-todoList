package models;

import java.util.*;
import play.data.validation.Constraints.*;

public class Task {
    public static List<Task> allTasks = new ArrayList<Task>();
    public Long id;
    @Required
    public String label;

    public static List<Task> all() {
        return allTasks;
    }

    public static void create(Task task){
        task.id = Long.valueOf(allTasks.size());
        allTasks.add(task);
    }

    public static void delete(Long id){
        allTasks.remove(id.intValue());
    }
}
