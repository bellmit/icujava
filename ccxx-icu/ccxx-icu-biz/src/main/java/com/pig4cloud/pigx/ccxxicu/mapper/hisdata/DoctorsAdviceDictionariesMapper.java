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

package com.pig4cloud.pigx.ccxxicu.mapper.hisdata;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pig4cloud.pigx.ccxxicu.api.entity.hisdata.DoctorsAdviceDictionaries;
import com.pig4cloud.pigx.ccxxicu.api.entity.hisdata.HisDoctorsAdviceProject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  医嘱项目字典表，对医嘱中的一些项目进行描述翻译
 *
 * @author pigx code generator
 * @date 2019-08-28 10:38:59
 */
public interface DoctorsAdviceDictionariesMapper extends BaseMapper<DoctorsAdviceDictionaries> {

	//	<!-- 通过通过条件查询数据查询数据  -->
	DoctorsAdviceDictionaries getLabelName(@Param("test")DoctorsAdviceDictionaries test);



	//	<!-- 条件数据查询  -->
	List<DoctorsAdviceDictionaries> selectAll(@Param("test")DoctorsAdviceDictionaries test);

	/**
	 * 根据doctors_advice_type_id来获取枚举值
	 * @param type
	 * @return
	 */
	List<DoctorsAdviceDictionaries> getLabelNameValueEnumByTypeValue(@Param("type") String type);

}
