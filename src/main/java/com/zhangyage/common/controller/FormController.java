package com.zhangyage.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhangyage.common.utils.StringUtil;

@Controller
public class FormController {

	@RequestMapping("rule.do")
	@ResponseBody
	public int rule(String phone,String email,String html){
		//验证手机号是否正确，成功则打印信息
		if (StringUtil.isPhone(phone)) {
			System.out.println("手机号正确!");
		}else{
			return 1;
		}
		//验证邮箱是否正确，成功则打印信息
		if (StringUtil.isEmail(email)) {
			System.out.println("邮箱正确!");
			
		}else{
			return 2;
		}
		
		//转换文本
		String string = StringUtil.toHtml(html);
		//判断文本是否为空
		if ("".equals(string)) {
			return 3;
		}
		//不为空则打印转换后的字符串
		System.out.println(string);
		return 0;
	}
	
}
