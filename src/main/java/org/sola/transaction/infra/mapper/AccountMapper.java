package org.sola.transaction.infra.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.sola.transaction.domain.entity.Account;

/**
 * Description
 *
 * @author zhanpeng.jiang@hand-china.com 2022/7/16
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
