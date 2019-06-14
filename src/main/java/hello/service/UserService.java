package hello.service;

import hello.mapper.UserMapper;

import javax.inject.Inject;

public class UserService {
    private UserMapper userMapper;

    @Inject
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User findUserById(Integer id) {
        return userMapper.findById(id);
    }
}
