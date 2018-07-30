package com.fxb.osgi.remotetranslateasslt.impl;

import java.util.Dictionary;
import java.util.concurrent.ConcurrentHashMap;

import com.fxb.osgi.translateasslt.service.TranslateService;

/**	
 *
 * @className RemoteTranslateServiceimpl
 * @version 1.0.0
 * @author fxb
 * @date 2018-07-27
 */
public class RemoteTranslateServiceimpl implements TranslateService {
	
	private static final ConcurrentHashMap<String, String> dictionary = new ConcurrentHashMap<String,String>();

	static {
		dictionary.put("cat", "小猫");
		dictionary.put("dog", "小狗");
	}
	
	@Override
	public String translate(String word) {
		System.out.println("RemoteTranslateAsslt service ------->");
		String result = dictionary.get(word);
		if (null == result) {
			result = "未找到你所查单词的意义，请检查单词是否正确";
		}
		return result;
	}

}
