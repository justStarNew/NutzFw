/*
 * Copyright (c) 2019- 2019 threefish(https://gitee.com/threefish https://github.com/threefish) All Rights Reserved.
 * 本项目完全开源，商用完全免费。但请勿侵犯作者合法权益，如申请软著等。
 * 最后修改时间：2019/10/07 18:27:07
 * 源 码 地 址：https://gitee.com/threefish/NutzFw
 */

package com.nutzfw.modules.portal.service;


import com.nutzfw.core.common.service.BaseService;
import com.nutzfw.core.common.vo.AjaxResult;
import com.nutzfw.modules.portal.entity.StatisticsConfigure;

/**
 * @author 叶世游
 * @date 2018年06月19日 09时59分20秒
 */
public interface StatisticsConfigureService extends BaseService<StatisticsConfigure> {
    /**
     * 保存统计
     *
     * @param statisticsConfigure
     * @return
     */
    AjaxResult save(StatisticsConfigure statisticsConfigure);

    /**
     * 批量删除统计
     *
     * @param ids
     * @return
     */
    int del(String[] ids);

    /**
     * 预览图像
     *
     * @param string
     * @return
     */
    AjaxResult showNow(String string);
}
