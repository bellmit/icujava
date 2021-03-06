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

package com.pig4cloud.pigx.ccxxicu.service.illnessNursing;


import com.baomidou.mybatisplus.extension.service.IService;
import com.pig4cloud.pigx.ccxxicu.api.entity.illnessNursing.ProjectAdviceCorrelation;

import java.util.List;

/**
 * 项目状态和建议的关联表
 *
 * @author pigx code generator
 * @date 2019-09-09 14:38:57
 */
public interface ProjectAdviceCorrelationService extends IService<ProjectAdviceCorrelation> {

	/**
	 * 修改项目的状态的建议关联
	 * @param projectAdviceCorrelations
	 * @return
	 */
	boolean updateCorrelation(List<ProjectAdviceCorrelation> projectAdviceCorrelations);

}
