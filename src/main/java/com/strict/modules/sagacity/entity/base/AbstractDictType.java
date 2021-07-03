/**
 *@Generated by sagacity-quickvo 4.18
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
import org.sagacity.sqltoy.config.annotation.OneToMany;

import com.strict.modules.sagacity.entity.DictDetail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @project sqltoy-strict
 * @version 1.0.0 Table: sag_dict_type,Remark:字典分类表
 */
@ApiModel(value = "DictType", description = "字典分类表")
@Entity(tableName = "sag_dict_type", pk_constraint = "PRIMARY")
public abstract class AbstractDictType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 103647142521144288L;

	/**
	 * jdbcType:VARCHAR 字典类型代码
	 */
	@ApiModelProperty(name = "DICT_TYPE", value = "字典类型代码", allowEmptyValue = false)
	@Id(strategy = "generator", generator = "org.sagacity.sqltoy.plugins.id.impl.DefaultIdGenerator")
	@Column(name = "DICT_TYPE", length = 50L, type = java.sql.Types.VARCHAR, nullable = false)
	protected String dictType;

	/**
	 * jdbcType:VARCHAR 字典类型名称
	 */
	@ApiModelProperty(name = "DICT_TYPE_NAME", value = "字典类型名称", allowEmptyValue = false)
	@Column(name = "DICT_TYPE_NAME", length = 100L, type = java.sql.Types.VARCHAR, nullable = false)
	protected String dictTypeName;

	/**
	 * jdbcType:VARCHAR 说明
	 */
	@ApiModelProperty(name = "COMMENTS", value = "说明", allowEmptyValue = true)
	@Column(name = "COMMENTS", length = 500L, type = java.sql.Types.VARCHAR, nullable = true)
	protected String comments;

	/**
	 * jdbcType:DECIMAL 显示顺序
	 */
	@ApiModelProperty(name = "SHOW_INDEX", value = "显示顺序", allowEmptyValue = false)
	@Column(name = "SHOW_INDEX", length = 8L, defaultValue = "1", type = java.sql.Types.INTEGER, nullable = false)
	protected Integer showIndex;

	/**
	 * jdbcType:VARCHAR 创建人
	 */
	@ApiModelProperty(name = "CREATE_BY", value = "创建人", allowEmptyValue = false)
	@Column(name = "CREATE_BY", length = 22L, type = java.sql.Types.VARCHAR, nullable = false)
	protected String createBy;

	/**
	 * jdbcType:DATETIME 创建时间
	 */
	@ApiModelProperty(name = "CREATE_TIME", value = "创建时间", allowEmptyValue = false)
	@Column(name = "CREATE_TIME", length = 19L, type = java.sql.Types.DATE, nullable = false)
	protected LocalDateTime createTime;

	/**
	 * jdbcType:VARCHAR 最后修改人
	 */
	@ApiModelProperty(name = "UPDATE_BY", value = "最后修改人", allowEmptyValue = false)
	@Column(name = "UPDATE_BY", length = 22L, type = java.sql.Types.VARCHAR, nullable = false)
	protected String updateBy;

	/**
	 * jdbcType:DATETIME 最后修改时间
	 */
	@ApiModelProperty(name = "UPDATE_TIME", value = "最后修改时间", allowEmptyValue = false)
	@Column(name = "UPDATE_TIME", length = 19L, type = java.sql.Types.DATE, nullable = false)
	protected LocalDateTime updateTime;

	/**
	 * jdbcType:DECIMAL 状态
	 */
	@ApiModelProperty(name = "STATUS", value = "状态", allowEmptyValue = false)
	@Column(name = "STATUS", length = 1L, defaultValue = "1", type = java.sql.Types.INTEGER, nullable = false)
	protected Integer status;

	/**
	 * 主键关联子表信息
	 */
	@OneToMany(fields = { "dictType" }, mappedFields = { "dictType" })
	protected List<DictDetail> dictDetails = new ArrayList<DictDetail>();

	/** default constructor */
	public AbstractDictType() {
	}

	/** pk constructor */
	public AbstractDictType(String dictType) {
		this.dictType = dictType;
	}

	/**
	 * @param dictType the dictType to set
	 */
	public AbstractDictType setDictType(String dictType) {
		this.dictType = dictType;
		return this;
	}

	/**
	 * @return the DictType
	 */
	public String getDictType() {
		return this.dictType;
	}

	/**
	 * @param dictTypeName the dictTypeName to set
	 */
	public AbstractDictType setDictTypeName(String dictTypeName) {
		this.dictTypeName = dictTypeName;
		return this;
	}

	/**
	 * @return the DictTypeName
	 */
	public String getDictTypeName() {
		return this.dictTypeName;
	}

	/**
	 * @param comments the comments to set
	 */
	public AbstractDictType setComments(String comments) {
		this.comments = comments;
		return this;
	}

	/**
	 * @return the Comments
	 */
	public String getComments() {
		return this.comments;
	}

	/**
	 * @param showIndex the showIndex to set
	 */
	public AbstractDictType setShowIndex(Integer showIndex) {
		this.showIndex = showIndex;
		return this;
	}

	/**
	 * @return the ShowIndex
	 */
	public Integer getShowIndex() {
		return this.showIndex;
	}

	/**
	 * @param createBy the createBy to set
	 */
	public AbstractDictType setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	/**
	 * @return the CreateBy
	 */
	public String getCreateBy() {
		return this.createBy;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public AbstractDictType setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
		return this;
	}

	/**
	 * @return the CreateTime
	 */
	public LocalDateTime getCreateTime() {
		return this.createTime;
	}

	/**
	 * @param updateBy the updateBy to set
	 */
	public AbstractDictType setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	/**
	 * @return the UpdateBy
	 */
	public String getUpdateBy() {
		return this.updateBy;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public AbstractDictType setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	/**
	 * @return the UpdateTime
	 */
	public LocalDateTime getUpdateTime() {
		return this.updateTime;
	}

	/**
	 * @param status the status to set
	 */
	public AbstractDictType setStatus(Integer status) {
		this.status = status;
		return this;
	}

	/**
	 * @return the Status
	 */
	public Integer getStatus() {
		return this.status;
	}

	/**
	 * @return the dictDetails
	 */
	public List<DictDetail> getDictDetails() {
		return this.dictDetails;
	}

	public void setDictDetails(List<DictDetail> dictDetails) {
		this.dictDetails = dictDetails;
	}

	/**
	 * @todo vo columns to String
	 */
	@Override
	public String toString() {
		StringBuilder columnsBuffer = new StringBuilder();
		columnsBuffer.append("dictType=").append(getDictType()).append("\n");
		columnsBuffer.append("dictTypeName=").append(getDictTypeName()).append("\n");
		columnsBuffer.append("comments=").append(getComments()).append("\n");
		columnsBuffer.append("showIndex=").append(getShowIndex()).append("\n");
		columnsBuffer.append("createBy=").append(getCreateBy()).append("\n");
		columnsBuffer.append("createTime=").append(getCreateTime()).append("\n");
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

		public SelectFieldsImpl dictType() {
			if (!fields.contains("dictType")) {
				fields.add("dictType");
			}
			return this;
		}

		public SelectFieldsImpl dictTypeName() {
			if (!fields.contains("dictTypeName")) {
				fields.add("dictTypeName");
			}
			return this;
		}

		public SelectFieldsImpl comments() {
			if (!fields.contains("comments")) {
				fields.add("comments");
			}
			return this;
		}

		public SelectFieldsImpl showIndex() {
			if (!fields.contains("showIndex")) {
				fields.add("showIndex");
			}
			return this;
		}

		public SelectFieldsImpl createBy() {
			if (!fields.contains("createBy")) {
				fields.add("createBy");
			}
			return this;
		}

		public SelectFieldsImpl createTime() {
			if (!fields.contains("createTime")) {
				fields.add("createTime");
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
}
