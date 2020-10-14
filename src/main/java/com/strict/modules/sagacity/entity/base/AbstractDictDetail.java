/**
 *@Generated by sagacity-quickvo 4.16
 */
package com.strict.modules.sagacity.entity.base;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.sagacity.sqltoy.callback.SelectFields;
import org.sagacity.sqltoy.config.annotation.Column;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * @project sqltoy-strict
 * @version 1.0.0
 * Table: sag_dict_detail,Remark:字典明细表  
 */
@ApiModel(value="DictDetail",description="字典明细表")
@Entity(tableName="sag_dict_detail",pk_constraint="PRIMARY")
public abstract class AbstractDictDetail implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7182039047385544211L;
	
	/**
	 * jdbcType:VARCHAR
	 * 字典KEY
	 */
	@ApiModelProperty(value="字典KEY",allowEmptyValue=false)
	@Id
	@Column(name="DICT_KEY",length=50L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String dictKey;
	
	/**
	 * jdbcType:VARCHAR
	 * 字典类型代码
	 */
	@ApiModelProperty(value="字典类型代码",allowEmptyValue=false)
	@Id
	@Column(name="DICT_TYPE",length=50L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String dictType;
	
	/**
	 * jdbcType:VARCHAR
	 * 字典值
	 */
	@ApiModelProperty(value="字典值",allowEmptyValue=false)
	@Column(name="DICT_NAME",length=200L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String dictName;
	
	/**
	 * jdbcType:DECIMAL
	 * 显示顺序
	 */
	@ApiModelProperty(value="显示顺序",allowEmptyValue=false)
	@Column(name="SHOW_INDEX",length=8L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	protected Integer showIndex;
	
	/**
	 * jdbcType:VARCHAR
	 * 最后修改人
	 */
	@ApiModelProperty(value="最后修改人",allowEmptyValue=false)
	@Column(name="UPDATE_BY",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String updateBy;
	
	/**
	 * jdbcType:DATETIME
	 * 最后修改时间
	 */
	@ApiModelProperty(value="最后修改时间",allowEmptyValue=false)
	@Column(name="UPDATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime updateTime;
	
	/**
	 * jdbcType:DECIMAL
	 * 状态
	 */
	@ApiModelProperty(value="状态",allowEmptyValue=false)
	@Column(name="STATUS",length=1L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	protected Integer status;
	

	/** default constructor */
	public AbstractDictDetail() {
	}
	
	/** pk constructor */
	public AbstractDictDetail(String dictKey,String dictType)
	{
		this.dictKey=dictKey;
		this.dictType=dictType;
	}

	
	/**
	 *@param dictKey the dictKey to set
	 */
	public AbstractDictDetail setDictKey(String dictKey) {
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
	public AbstractDictDetail setDictType(String dictType) {
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
	public AbstractDictDetail setDictName(String dictName) {
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
	public AbstractDictDetail setShowIndex(Integer showIndex) {
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
	public AbstractDictDetail setUpdateBy(String updateBy) {
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
	public AbstractDictDetail setUpdateTime(LocalDateTime updateTime) {
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
	public AbstractDictDetail setStatus(Integer status) {
		this.status=status;
		return this;
	}
		
	/**
	 *@return the Status
	 */
	public Integer getStatus() {
	    return this.status;
	}



	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("dictKey=").append(getDictKey()).append("\n");
		columnsBuffer.append("dictType=").append(getDictType()).append("\n");
		columnsBuffer.append("dictName=").append(getDictName()).append("\n");
		columnsBuffer.append("showIndex=").append(getShowIndex()).append("\n");
		columnsBuffer.append("updateBy=").append(getUpdateBy()).append("\n");
		columnsBuffer.append("updateTime=").append(getUpdateTime()).append("\n");
		columnsBuffer.append("status=").append(getStatus()).append("\n");
		return columnsBuffer.toString();
	}
	
	/**
	 * @TODO create entityQuery fields
	 */
	public static SelectFieldsImpl select() {
		return new SelectFieldsImpl();
	}
	
	public static class SelectFieldsImpl extends SelectFields {
		private List<String> fields = new ArrayList<String>();

		@Override
		public String[] getSelectFields() {
			String[] result = new String[fields.size()];
			fields.toArray(result);
			return result;
		}
		
	    public SelectFieldsImpl dictKey() {
	    	if (!fields.contains("dictKey")) {
				fields.add("dictKey");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl dictType() {
	    	if (!fields.contains("dictType")) {
				fields.add("dictType");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl dictName() {
	    	if (!fields.contains("dictName")) {
				fields.add("dictName");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl showIndex() {
	    	if (!fields.contains("showIndex")) {
				fields.add("showIndex");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl updateBy() {
	    	if (!fields.contains("updateBy")) {
				fields.add("updateBy");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl updateTime() {
	    	if (!fields.contains("updateTime")) {
				fields.add("updateTime");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl status() {
	    	if (!fields.contains("status")) {
				fields.add("status");
			}
	    	return this;
	    }
    
	}
	
	public static class Fields {
        /**
         * 字典KEY
         */
    	public static String dictKey="dictKey";
    
        /**
         * 字典类型代码
         */
    	public static String dictType="dictType";
    
        /**
         * 字典值
         */
    	public static String dictName="dictName";
    
        /**
         * 显示顺序
         */
    	public static String showIndex="showIndex";
    
        /**
         * 最后修改人
         */
    	public static String updateBy="updateBy";
    
        /**
         * 最后修改时间
         */
    	public static String updateTime="updateTime";
    
        /**
         * 状态
         */
    	public static String status="status";
    
	}
}
