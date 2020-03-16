package com.yx.utils;

import java.util.List;

/**
 * 分页对象类
 * 
 * @author bj
 *
 * @param <T>
 */
public class Page<T> {
	// 总记录数
	private int totalCount;
	// 页号
	private int pageNo;
	// 每页记录数
	private int pageSize;
	// 总页数
	private int totalPage;
	// 数据
	private List<T> ListValue;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getListValue() {
		return ListValue;
	}

	public void setListValue(List<T> listValue) {
		ListValue = listValue;
	}
}
