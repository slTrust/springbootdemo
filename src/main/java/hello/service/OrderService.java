package hello.service;

import javax.inject.Inject;

public class OrderService {
    private UserService userService;

    @Inject
    public OrderService(UserService userService) {
        this.userService = userService;
    }

    public User placeOrder(Integer id){
        User user = userService.findUserById(id);
        System.out.println(user.getId());
        return user;
    }
}
