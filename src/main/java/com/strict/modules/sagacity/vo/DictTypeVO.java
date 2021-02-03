/**
 *@Generated by sagacity-quickvo 4.16
 */
package com.strict.modules.sagacity.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @project sqltoy-strict
 * @version 1.0.0
 * ,Remark:字典分类表  
 */
@ApiModel(value="DictTypeVO",description="字典分类表")
public class DictTypeVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 426724547793495250L;
	
/*---begin-auto-generate-don't-update-this-area--*/	
   /**
	 * 字典类型代码
	 */
	@ApiModelProperty(name="DICT_TYPE",value="字典类型代码",allowEmptyValue=false)
	private String dictType;
	
   /**
	 * 字典类型名称
	 */
	@ApiModelProperty(name="DICT_TYPE_NAME",value="字典类型名称",allowEmptyValue=false)
	private String dictTypeName;
	
   /**
	 * 说明
	 */
	@ApiModelProperty(name="COMMENTS",value="说明",allowEmptyValue=true)
	private String comments;
	
   /**
	 * 显示顺序
	 */
	@ApiModelProperty(name="SHOW_INDEX",value="显示顺序",allowEmptyValue=false)
	private Integer showIndex;
	
   /**
	 * 创建人
	 */
	@ApiModelProperty(name="CREATE_BY",value="创建人",allowEmptyValue=false)
	private String createBy;
	
   /**
	 * 创建时间
	 */
	@ApiModelProperty(name="CREATE_TIME",value="创建时间",allowEmptyValue=false)
	private LocalDateTime createTime;
	
   /**
	 * 最后修改人
	 */
	@ApiModelProperty(name="UPDATE_BY",value="最后修改人",allowEmptyValue=false)
	private String updateBy;
	
   /**
	 * 最后修改时间
	 */
	@ApiModelProperty(name="UPDATE_TIME",value="最后修改时间",allowEmptyValue=false)
	private LocalDateTime updateTime;
	
   /**
	 * 状态
	 */
	@ApiModelProperty(name="STATUS",value="状态",allowEmptyValue=false)
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
