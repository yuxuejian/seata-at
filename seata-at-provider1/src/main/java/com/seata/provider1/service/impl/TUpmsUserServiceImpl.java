package com.seata.provider1.service.impl;

import com.seata.provider1.entity.TUpmsUser;
import com.seata.provider1.mapper.TUpmsUserMapper;
import com.seata.provider1.service.ITUpmsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yxj
 * @since 2019-08-25
 */
@Service
public class TUpmsUserServiceImpl extends ServiceImpl<TUpmsUserMapper, TUpmsUser> implements ITUpmsUserService {

}
