package com.zhangyage.common.utils;

public class StringUtil {

	private StringUtil(){};
	
	//字符串转换
	public static String toHtml(String html){
		//判断该字符串是否为空，如果为空返回一个空串
		if (StringUtil.hasText(html)) {
			return "";
		}
		
		//如果匹配到了进行替换
		html = html.replaceAll("\\\\n\\\\r", "\\\\n");
		html = html.replaceAll("\\\\r", "<br/>");
		
		//检索是否又\n
		int i = html.indexOf("\\n");
		if ((i+2)==html.length()) {
			String str = "<p>"+html.substring(0, i)+"<\\p>";
			return str;
		}
		//返回替换后的字符串
		return html;
		
	}
	
	//判断是否时手机号
	public static boolean isPhone(String phone){
		
		//定义手机号规格
		String reg = "^1([3]|[5]|[8]|[9]|[7]|[6])([0-9])\\d{8}$";
		
		//进行判断
		boolean matches = phone.matches(reg);
		
		//返回判断结果
		return matches;
	}
	
	//判断是否时邮箱
	public static boolean isEmail(String email){
		
		//定义邮箱规格
		String reg = "^\\w+@\\w+\\.(com|con|cn)$";
		
		//进行判断
		boolean matches = email.matches(reg);
		
		//返回结果
		return matches;
	}
	
	//判断是否为空串
	public static boolean hasText(String str){
		//为空返回true
		if (str == null || "".equals(str) ||str.trim().length() == 0) {
			return true;
		}
		//否则为false
		return false;
	}
}
