package org.sola.transaction;

import org.junit.jupiter.api.Test;
import org.sola.transaction.domain.entity.Account;
import org.sola.transaction.domain.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class TransactionApplicationTests {
    @Autowired
    private AccountRepository accountRepository;

    @Test
    void addAccount() {
        createAccount("张三");
        createAccount("李四");
    }

    private void createAccount(String userCode) {
        Account account = new Account();
        account.setUserCode(userCode);
        account.setBalance(BigDecimal.ZERO);
        accountRepository.save(account);
    }

}
