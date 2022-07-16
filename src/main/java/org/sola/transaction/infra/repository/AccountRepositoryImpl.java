package org.sola.transaction.infra.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.sola.transaction.domain.entity.Account;
import org.sola.transaction.domain.repository.AccountRepository;
import org.sola.transaction.infra.mapper.AccountMapper;
import org.springframework.stereotype.Repository;

/**
 * Description
 *
 * @author zhanpeng.jiang@hand-china.com 2022/7/16
 */
@Repository
public class AccountRepositoryImpl extends ServiceImpl<AccountMapper, Account> implements AccountRepository {
}
