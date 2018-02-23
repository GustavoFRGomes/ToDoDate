package xyz.jagedlabs.edge.tododate.data.services;

import java.util.List;

import xyz.jagedlabs.edge.tododate.data.models.ITodoItem;
import xyz.jagedlabs.edge.tododate.data.services.abstractions.ITodoService;

/**
 * Created by ggomes on 2/22/2018.
 */

public class TodoItemService implements ITodoService {

    @Override
    public ITodoItem getItemById(long todoId) {
        return null; // TODO: Search the Internet and/or DB.
    }

    @Override
    public List<ITodoItem> getAllItems() {
        return null; // TODO: Search the Internet and/or DB.
    }

    @Override
    public List<ITodoItem> getTodosByCategory(String category) {
        return null; // TODO: Search the Internet and/or DB.
    }

    @Override
    public List<ITodoItem> getTodosByMultipleCategories(String... categories) {
        return null; // TODO: Search the Internet and/or DB.
    }

    @Override
    public List<ITodoItem> getTodosWithString(String searchString) {
        return null; // TODO: Search the Internet and/or DB.
    }

    @Override
    public List<ITodoItem> getTodosWithMultipleStrings(String... searchStrings) {
        return null; // TODO: Search the Internet and/or DB.
    }
}
