/**
 *@Generated by sagacity-quickvo 4.16
 */
package com.strict.modules.sagacity.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @project sqltoy-strict
 * @version 1.0.0
 * ,Remark:字典分类表  
 */
public class DictTypeVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 426724547793495250L;
	
/*---begin-auto-generate-don't-update-this-area--*/	
	/**
	 * 字典类型代码
	 */
	private String dictType;
	
	/**
	 * 字典类型名称
	 */
	private String dictTypeName;
	
	/**
	 * 说明
	 */
	private String comments;
	
	/**
	 * 显示顺序
	 */
	private Integer showIndex;
	
	/**
	 * 创建人
	 */
	private String createBy;
	
	/**
	 * 创建时间
	 */
	private LocalDateTime createTime;
	
	/**
	 * 最后修改人
	 */
	private String updateBy;
	
	/**
	 * 最后修改时间
	 */
	private LocalDateTime updateTime;
	
	/**
	 * 状态
	 */
	private Integer status;
	
	
	/**
	 *@param dictType the dictType to set
	 */
	public DictTypeVO setDictType(String dictType) {
		this.dictType=dictType;
		return this;
	}
		
	/**
	 *@return the DictType
	 */
	public String getDictType() {
	    return this.dictType;
	}
	
	/**
	 *@param dictTypeName the dictTypeName to set
	 */
	public DictTypeVO setDictTypeName(String dictTypeName) {
		this.dictTypeName=dictTypeName;
		return this;
	}
		
	/**
	 *@return the DictTypeName
	 */
	public String getDictTypeName() {
	    return this.dictTypeName;
	}
	
	/**
	 *@param comments the comments to set
	 */
	public DictTypeVO setComments(String comments) {
		this.comments=comments;
		return this;
	}
		
	/**
	 *@return the Comments
	 */
	public String getComments() {
	    return this.comments;
	}
	
	/**
	 *@param showIndex the showIndex to set
	 */
	public DictTypeVO setShowIndex(Integer showIndex) {
		this.showIndex=showIndex;
		return this;
	}
		
	/**
	 *@return the ShowIndex
	 */
	public Integer getShowIndex() {
	    return this.showIndex;
	}
	
	/**
	 *@param createBy the createBy to set
	 */
	public DictTypeVO setCreateBy(String createBy) {
		this.createBy=createBy;
		return this;
	}
		
	/**
	 *@return the CreateBy
	 */
	public String getCreateBy() {
	    return this.createBy;
	}
	
	/**
	 *@param createTime the createTime to set
	 */
	public DictTypeVO setCreateTime(LocalDateTime createTime) {
		this.createTime=createTime;
		return this;
	}
		
	/**
	 *@return the CreateTime
	 */
	public LocalDateTime getCreateTime() {
	    return this.createTime;
	}
	
	/**
	 *@param updateBy the updateBy to set
	 */
	public DictTypeVO setUpdateBy(String updateBy) {
		this.updateBy=updateBy;
		return this;
	}
		
	/**
	 *@return the UpdateBy
	 */
	public String getUpdateBy() {
	    return this.updateBy;
	}
	
	/**
	 *@param updateTime the updateTime to set
	 */
	public DictTypeVO setUpdateTime(LocalDateTime updateTime) {
		this.updateTime=updateTime;
		return this;
	}
		
	/**
	 *@return the UpdateTime
	 */
	public LocalDateTime getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 *@param status the status to set
	 */
	public DictTypeVO setStatus(Integer status) {
		this.status=status;
		return this;
	}
		
	/**
	 *@return the Status
	 */
	public Integer getStatus() {
	    return this.status;
	}
/*---end-auto-generate-don't-update-this-area--*/	
}
