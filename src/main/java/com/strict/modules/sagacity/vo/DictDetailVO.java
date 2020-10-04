/**
 *@Generated by sagacity-quickvo 4.16
 */
package com.strict.modules.sagacity.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @project sqltoy-strict
 * @version 1.0.0
 * ,Remark:字典明细表  
 */
public class DictDetailVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8137101015349347912L;
	
/*---begin-auto-generate-don't-update-this-area--*/	
	/**
	 * 字典KEY
	 */
	private String dictKey;
	
	/**
	 * 字典类型代码
	 */
	private String dictType;
	
	/**
	 * 字典值
	 */
	private String dictName;
	
	/**
	 * 显示顺序
	 */
	private Integer showIndex;
	
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
	 *@param dictKey the dictKey to set
	 */
	public DictDetailVO setDictKey(String dictKey) {
		this.dictKey=dictKey;
		return this;
	}
		
	/**
	 *@return the DictKey
	 */
	public String getDictKey() {
	    return this.dictKey;
	}
	
	/**
	 *@param dictType the dictType to set
	 */
	public DictDetailVO setDictType(String dictType) {
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
	 *@param dictName the dictName to set
	 */
	public DictDetailVO setDictName(String dictName) {
		this.dictName=dictName;
		return this;
	}
		
	/**
	 *@return the DictName
	 */
	public String getDictName() {
	    return this.dictName;
	}
	
	/**
	 *@param showIndex the showIndex to set
	 */
	public DictDetailVO setShowIndex(Integer showIndex) {
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
	 *@param updateBy the updateBy to set
	 */
	public DictDetailVO setUpdateBy(String updateBy) {
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
	public DictDetailVO setUpdateTime(LocalDateTime updateTime) {
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
	public DictDetailVO setStatus(Integer status) {
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
