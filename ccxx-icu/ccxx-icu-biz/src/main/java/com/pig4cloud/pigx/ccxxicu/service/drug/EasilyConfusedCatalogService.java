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

package com.pig4cloud.pigx.ccxxicu.service.drug;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pig4cloud.pigx.ccxxicu.api.entity.drug.EasilyConfusedCatalog;

/**
 * 药品易混淆目录
 *
 * @author pigx code generator
 * @date 2019-09-19 10:41:34
 */
public interface EasilyConfusedCatalogService extends IService<EasilyConfusedCatalog> {

	/**
	 * 查询所有的易混淆药品
	 * @param easilyConfusedCatalog
	 * @return
	 */
	IPage getList(Page page,EasilyConfusedCatalog easilyConfusedCatalog);


}
