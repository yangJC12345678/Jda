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
package org.jmin.jda.impl.exception;

import org.jmin.jda.JdaException;

/**
 * 缓存异常
 * 
 * @author Chris
 */

public class ObjectCacheException extends JdaException {
  
	/**
	 * 构造函数
	 */
	public ObjectCacheException(){
		this((String)null);
	}
	
	/**
	 * 构造函数
	 */
	public ObjectCacheException(String message) {
		this(message,null);
	}
	
	/**
	 * 构造函数
	 */
	public ObjectCacheException(Throwable cause) {
		this(null,cause);
	}
	
	/**
	 * 构造函数
	 */
	public ObjectCacheException(String message,Throwable cause) {
		super(null,message,cause);
	}
}