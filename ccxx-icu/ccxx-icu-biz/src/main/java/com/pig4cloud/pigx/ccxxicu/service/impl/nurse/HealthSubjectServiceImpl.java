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
package com.pig4cloud.pigx.ccxxicu.service.impl.nurse;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pig4cloud.pigx.ccxxicu.api.entity.nurse.HealthSubject;
import com.pig4cloud.pigx.ccxxicu.mapper.nurse.HealthSubjectMapper;
import com.pig4cloud.pigx.ccxxicu.service.nurse.HealthSubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 护士健康评估题目
 *
 * @author pigx code generator
 * @date 2019-08-05 15:20:07
 */
@Service
public class HealthSubjectServiceImpl extends ServiceImpl<HealthSubjectMapper, HealthSubject> implements HealthSubjectService {


	/**
	 * 查询该科室下所有的项目
	 * @param deptId
	 * @return
	 */
	@Override
	public List<HealthSubject> selectAll(String deptId) {
		return baseMapper.selectAll(deptId);
	}
}
