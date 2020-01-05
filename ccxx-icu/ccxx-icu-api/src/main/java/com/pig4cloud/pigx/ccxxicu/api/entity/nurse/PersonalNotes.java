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

package com.pig4cloud.pigx.ccxxicu.api.entity.nurse;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 护士个人笔记
 *
 * @author pigx code generator
 * @date 2019-08-05 09:36:19
 */
@Data
@TableName("nur_personal_notes")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "护士个人笔记")
public class PersonalNotes extends Model<PersonalNotes> {
private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId
    @ApiModelProperty(value="自增id")
    private Integer id;
    /**
     * 护士个人笔记 id
     */
    @ApiModelProperty(value="护士个人笔记 id")
    private String personalNotesId;
    /**
     * 用户表外键id
     */
    @ApiModelProperty(value="用户表外键id")
    private String userId;
    /**
     * 内容
     */
    @ApiModelProperty(value="内容")
    private String content;
    /**
     * 对应的时间
     */
    @ApiModelProperty(value="对应的时间")
    private LocalDateTime createTime;
    /**
     * 删除标识  0是删除 1是正常
     */
    @ApiModelProperty(value="删除标识  0是删除 1是正常")
    private Integer delFlag;
    /**
     * 删除该条数据的用户
     */
    @ApiModelProperty(value="删除该条数据的用户")
    private String delUser;
    /**
     * 删除时间
     */
    @ApiModelProperty(value="删除时间")
    private LocalDateTime delTime;
    }
