/*
 * Copyright (C) Chris Liao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jmin.jda.impl.persister.date;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.jmin.jda.JdaException;
import org.jmin.jda.JdaTypeConvertFactory;

/**
 * 日期
 *
 * @author Chris
 */
public class UtilDateTimestampHandler extends DateTimestampHandler {
	
	/**
	 * 获得持久化类型
	 */
	public Class getPersisterType(){
		return Date.class;
	}
	
	 /**
   * 设置参数
   */
  public void set(PreparedStatement ps,int index,Object value,int typeCode,JdaTypeConvertFactory convertFactory)throws SQLException{
    try{
	  	Date parameter =(Date)convertFactory.convert(value,this.getPersisterType());
	  	if(parameter== null)
	  		this.setNullParamValue(ps,index,typeCode);
	  	else
	  		ps.setTimestamp(index,new java.sql.Timestamp(parameter.getTime()));
    } catch (Throwable e) {
	 		throw new JdaException(null,e);
	  }
  }
}