package cn.sdadgz.smarthousekeeping.service.impl;

import cn.sdadgz.smarthousekeeping.entity.Service;
import cn.sdadgz.smarthousekeeping.mapper.ServiceMapper;
import cn.sdadgz.smarthousekeeping.service.IServiceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务 服务实现类
 * </p>
 *
 * @author sdadgz
 * @since 2023-05-16
 */
@Service
public class ServiceServiceImpl extends ServiceImpl<ServiceMapper, Service> implements IServiceService {

}
