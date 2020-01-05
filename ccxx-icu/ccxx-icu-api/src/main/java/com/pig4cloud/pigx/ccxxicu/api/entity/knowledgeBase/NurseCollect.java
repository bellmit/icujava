/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.pigx.ccxxicu.api.entity.knowledgeBase;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 护士个人总结收藏关联表
 *
 * @author pigx code generator
 * @date 2019-11-01 20:38:14
 */
@Data
@TableName("know_nurse_collect")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "护士个人总结收藏关联表")
public class NurseCollect extends Model<NurseCollect> {
private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId
    @ApiModelProperty(value="自增id")
    private Integer id;
    /**
     * 个人总结表id
     */
    @ApiModelProperty(value="个人总结表id")
    private String personalSummaryId;
    /**
     * 护士id
     */
    @ApiModelProperty(value="护士id")
    private String nurseId;
    }
