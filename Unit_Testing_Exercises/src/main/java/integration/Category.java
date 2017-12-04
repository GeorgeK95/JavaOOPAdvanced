package integration;

import javax.naming.OperationNotSupportedException;
import java.util.Set;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Category {
    private String name;
    private Set<User> users;
    private Set<Category> categories;

    public Category(String name, Set<User> users, Set<Category> categories) {
        this.name = name;
        this.users = users;
        this.categories = categories;
    }

    void assign(User user) throws OperationNotSupportedException {
        if (user == null) {
            throw new OperationNotSupportedException("User is null.");
        }
        this.users.add(user);
    }

    void assign(Category category) throws OperationNotSupportedException {
        if (category == null) {
            throw new OperationNotSupportedException("Category is null.");
        }
        this.categories.add(category);
    }

    public String getName() {
        return name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public Set<Category> getCategories() {
        return categories;
    }
}
