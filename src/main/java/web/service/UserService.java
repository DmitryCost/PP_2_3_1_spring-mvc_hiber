package web.service;
import web.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> listAll();
    User getById(Long id);
    void delete(Long id);
    void update(Long id, User user);

}
