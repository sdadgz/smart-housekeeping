package cn.sdadgz.smarthousekeeping.service.impl;

import cn.sdadgz.smarthousekeeping.entity.User;
import cn.sdadgz.smarthousekeeping.mapper.UserMapper;
import cn.sdadgz.smarthousekeeping.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author sdadgz
 * @since 2023-05-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
