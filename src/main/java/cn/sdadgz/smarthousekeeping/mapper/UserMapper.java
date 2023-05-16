package cn.sdadgz.smarthousekeeping.mapper;

import cn.sdadgz.smarthousekeeping.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author sdadgz
 * @since 2023-05-10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
