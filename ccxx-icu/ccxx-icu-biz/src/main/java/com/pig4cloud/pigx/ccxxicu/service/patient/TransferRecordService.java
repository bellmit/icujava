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

package com.pig4cloud.pigx.ccxxicu.service.patient;


import com.baomidou.mybatisplus.extension.service.IService;
import com.pig4cloud.pigx.ccxxicu.api.entity.patient.TransferRecord;

/**
 * 患者转科交接记录
 *
 * @author pigx code generator
 * @date 2019-10-04 15:06:56
 */
public interface TransferRecordService extends IService<TransferRecord> {


	TransferRecord oldData(String patientId);


}
