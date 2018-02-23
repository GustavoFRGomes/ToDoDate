package xyz.jagedlabs.edge.tododate.data.services.abstractions;

import java.util.List;

import xyz.jagedlabs.edge.tododate.data.models.ITodoItem;

/**
 * Created by ggomes on 2/23/2018.
 */

public interface ITodoService {
    public ITodoItem getItemById(long todoId);

    public List<ITodoItem> getAllItems();

    public List<ITodoItem> getTodosByCategory(String category);
    public List<ITodoItem> getTodosByMultipleCategories(String... categories);

    public List<ITodoItem> getTodosWithString(String searchString);
    public List<ITodoItem> getTodosWithMultipleStrings(String... searchStrings);
}
