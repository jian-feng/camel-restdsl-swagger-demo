package org.mycompany;

import io.swagger.annotations.ApiModelProperty;

public class ResponseInfo {

	@ApiModelProperty(value = "Hello msg from camel", required = true, example = "sample message")
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
