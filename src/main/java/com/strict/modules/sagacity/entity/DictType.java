/**
 *@Generated by sagacity-quickvo 5.0
 */
package com.strict.modules.sagacity.entity;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import lombok.Data;
import lombok.experimental.Accessors;
import java.time.LocalDateTime;
import org.sagacity.sqltoy.config.annotation.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @project sqltoy-strict
 * @version 1.0.0
 * Table: sag_dict_type,Remark:字典分类表  
 */
@Data
@Accessors(chain = true)
@Entity(tableName="sag_dict_type",pk_constraint="PRIMARY")
public class DictType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 426724547793495250L;
/*---begin-auto-generate-don't-update-this-area--*/	
	/**
	 * jdbcType:VARCHAR
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugins.id.impl.DefaultIdGenerator")
	@Column(name="DICT_TYPE",comment="字典类型代码",length=50L,type=java.sql.Types.VARCHAR,nullable=false)
	private String dictType;
	
	/**
	 * jdbcType:VARCHAR
	 */
	@Column(name="DICT_TYPE_NAME",comment="字典类型名称",length=100L,type=java.sql.Types.VARCHAR,nullable=false)
	private String dictTypeName;
	
	/**
	 * jdbcType:VARCHAR
	 */
	@Column(name="COMMENTS",comment="说明",length=500L,type=java.sql.Types.VARCHAR,nullable=true)
	private String comments;
	
	/**
	 * jdbcType:DECIMAL
	 */
	@Column(name="SHOW_INDEX",comment="显示顺序",length=8L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	private Integer showIndex;
	
	/**
	 * jdbcType:VARCHAR
	 */
	@Column(name="CREATE_BY",comment="创建人",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	private String createBy;
	
	/**
	 * jdbcType:DATETIME
	 */
	@Column(name="CREATE_TIME",comment="创建时间",length=19L,type=java.sql.Types.DATE,nullable=false)
	private LocalDateTime createTime;
	
	/**
	 * jdbcType:VARCHAR
	 */
	@Column(name="UPDATE_BY",comment="最后修改人",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	private String updateBy;
	
	/**
	 * jdbcType:DATETIME
	 */
	@Column(name="UPDATE_TIME",comment="最后修改时间",length=19L,type=java.sql.Types.DATE,nullable=false)
	private LocalDateTime updateTime;
	
	/**
	 * jdbcType:DECIMAL
	 */
	@Column(name="STATUS",comment="状态",length=1L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	private Integer status;
	
	/**
	 * 主键关联子表信息
	 */
	@OneToMany(fields={"dictType"},mappedFields={"dictType"},delete=true)
	private List<DictDetail> dictDetails=new ArrayList<DictDetail>();

	/** default constructor */
	public DictType() {
	}
	
	/** pk constructor */
	public DictType(String dictType)
	{
		this.dictType=dictType;
	}
/*---end-auto-generate-don't-update-this-area--*/
}
