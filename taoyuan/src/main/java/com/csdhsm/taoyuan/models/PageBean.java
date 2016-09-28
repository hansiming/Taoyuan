package com.csdhsm.taoyuan.models;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title: PageBean.java
 * @Package com.csdhsm.taoyuan.models
 * @Description: 用于分页
 * @author: Han
 * @E-mail: 294098789@qq.com
 * @date: 2016年5月18日 下午8:39:21
 * @version:V1.0
 */
public class PageBean<T> {

	/**
	 * @Fields pageIndex : 页号，缺省值为1
	 */
	private int pageIndex = 1;

	/**
	 * @Fields totalPages : 总页数
	 */
	private int totalPages = 1;

	/**
	 * @Fields pageSize : 每页记录数，缺省值为8
	 */
	private int pageSize = 8;

	/**
	 * @Fields totalRecords : 总记录数
	 */
	private int totalRecords = 0;

	/**
	 * @Fields isHavePrePage : 是否有上一页
	 */
	private boolean isHavePrePage = false;

	/**
	 * @Fields isHaveNextPage : 是否有下一页
	 */
	private boolean isHaveNextPage = false;
	
	/**   
	 * @Fields wheres : 条件判断 
	 */ 
	private String wheres;
	
	/**   
	 * @Fields order : 排序 
	 */ 
	private String order;
	
	/**   
	 * @Fields cateId : 分类Id 
	 */ 
	private int cateId;
	
	/**   
	 * @Fields recordStartIndex : 分页开始Index
	 */ 
	private int recordStartIndex = 0;

	/**
	 * @Fields pageDatas : 该页中的数据(List集合)
	 */
	private List<T> pageDatas = new ArrayList<T>();

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
		this.recordStartIndex = (pageIndex - 1) * this.pageSize;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		
		if(totalRecords < 0){
		
			throw new RuntimeException("总记录数不能小于0!");
		}
		//设置总记录数
		this.totalRecords = totalRecords;
		//计算总页数
		this.totalPages = this.totalRecords/this.pageSize;
		
		if(this.totalRecords % this.pageSize != 0) {
			
			this.totalPages++;
		}
		
		//计算是否有上一页
		if(this.pageIndex > 1) {
			
			this.isHavePrePage = true;
		}else{
			
			this.isHavePrePage = false;
		}
		
		//计算是否有下一页
		if(this.pageIndex < this.totalPages){
			
			this.isHaveNextPage = true;
		}else{
			
			this.isHaveNextPage = false;
		}
	}

	public boolean getIsHavePrePage() {
		return isHavePrePage;
	}

	public boolean getIsHaveNextPage() {
		return isHaveNextPage;
	}

	public List<T> getPageDatas() {
		return pageDatas;
	}

	public void setPageDatas(List<T> pageDatas) {
		this.pageDatas = pageDatas;
	}

	public String getWheres() {
		return wheres;
	}

	public void setWheres(String wheres) {
		this.wheres = wheres;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getCateId() {
		return cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public int getRecordStartIndex() {
		return recordStartIndex;
	}
}
