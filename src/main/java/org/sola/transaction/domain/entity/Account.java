package org.sola.transaction.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 账户
 *
 * @author zhanpeng.jiang@hand-china.com 2022/7/16
 */
@Data
@TableName("tbl_account")
public class Account {
    @TableId(type = IdType.ASSIGN_ID)
    private Long accountId;
    private String userCode;
    private BigDecimal balance;
}
