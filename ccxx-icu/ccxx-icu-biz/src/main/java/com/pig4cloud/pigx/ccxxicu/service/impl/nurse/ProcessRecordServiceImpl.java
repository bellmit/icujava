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

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pig4cloud.pigx.ccxxicu.api.entity.nurse.ProcessRecord;
import com.pig4cloud.pigx.ccxxicu.api.vo.nurseVo.ProcessRecordVo;
import com.pig4cloud.pigx.ccxxicu.mapper.nurse.ProcessRecordMapper;
import com.pig4cloud.pigx.ccxxicu.service.nurse.ProcessRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 流程记录表
 *
 * @author pigx code generator
 * @date 2019-08-07 09:07:45
 */
@Service
public class ProcessRecordServiceImpl extends ServiceImpl<ProcessRecordMapper, ProcessRecord> implements ProcessRecordService {



	@Autowired
	private ProcessRecordMapper processRecordMapper;



	/**
	 * 分页查询流程记录
	 * @param page
	 * @param nurProcessRecord
	 * @return
	 */
	@Override
	public IPage selectPaging(Page page, ProcessRecord nurProcessRecord) {
		return processRecordMapper.selectPaging(page,nurProcessRecord);
	}

	/**
	 * 分页条件全查数据
	 * @param nurProcessRecord
	 * @return
	 */
	@Override
	public List<ProcessRecordVo> selectAll(ProcessRecord nurProcessRecord) {

		return processRecordMapper.selectAll(nurProcessRecord);
	}

}
