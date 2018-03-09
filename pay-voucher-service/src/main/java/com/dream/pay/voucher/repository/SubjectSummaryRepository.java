package com.dream.pay.voucher.repository;


import com.dream.pay.voucher.model.VoucherSubjectSummaryDO;

import java.util.List;

/**
 * @author mengzhenbin
 * @since 2017/1/13
 */
public interface SubjectSummaryRepository {

    /**
     * 查询最大记录数
     */
    public long selectMaxId(String voucherDate);

    /**
     * 查询最小记录数
     */
    public long selectMinId(String voucherDate);


    /**
     * 分页查询指定日期的日账户汇总记录
     *
     * @param accountingDate 会计日期
     */
    List<VoucherSubjectSummaryDO> selectByVoucherDate(String accountingDate, long startRow, long endRow);

    /**
     * 更新 分页余额新
     *
     * @param voucherSubjectSummaryDO 更新汇总余额
     */
    int update(VoucherSubjectSummaryDO voucherSubjectSummaryDO);

}