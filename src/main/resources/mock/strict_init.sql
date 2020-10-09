/*==============================================================*/
/* Table: SAG_DICT_DETAIL                                       */
/*==============================================================*/
create table SAG_DICT_DETAIL
(
   DICT_KEY             varchar(50) not null  comment '字典KEY',
   DICT_TYPE            varchar(50) not null  comment '字典类型代码',
   DICT_NAME            varchar(200) not null  comment '字典值',
   SHOW_INDEX           numeric(8) not null default 1  comment '显示顺序',
   UPDATE_BY            varchar(22) not null  comment '最后修改人',
   UPDATE_TIME          datetime not null  comment '最后修改时间',
   STATUS               decimal(1) not null default 1  comment '状态',
   primary key (DICT_KEY, DICT_TYPE)
);

alter table SAG_DICT_DETAIL comment '字典明细表';

/*==============================================================*/
/* Table: SAG_DICT_TYPE                                         */
/*==============================================================*/
create table SAG_DICT_TYPE
(
   DICT_TYPE            varchar(50) not null  comment '字典类型代码',
   DICT_TYPE_NAME       varchar(100) not null  comment '字典类型名称',
   COMMENTS             varchar(500)  comment '说明',
   SHOW_INDEX           numeric(8) not null default 1  comment '显示顺序',
   CREATE_BY            varchar(22) not null  comment '创建人',
   CREATE_TIME          datetime not null  comment '创建时间',
   UPDATE_BY            varchar(22) not null  comment '最后修改人',
   UPDATE_TIME          datetime not null  comment '最后修改时间',
   STATUS               decimal(1) not null default 1  comment '状态',
   primary key (DICT_TYPE)
);

alter table SAG_DICT_TYPE comment '字典分类表';

/*==============================================================*/
/* Table: SYS_ORGAN_INFO                                        */
/*==============================================================*/
create table SYS_ORGAN_INFO
(
   ORGAN_ID             varchar(22) not null  comment '机构ID',
   ORGAN_NAME           varchar(100) not null  comment '机构名称',
   ORGAN_CODE           varchar(20) not null  comment '机构代码',
   COST_NO              varchar(20)  comment '成本中心代码',
   ORGAN_PID            varchar(22) not null  comment '父机构ID',
   NODE_ROUTE           varchar(200)  comment '节点路径',
   NODE_LEVEL           numeric(1)  comment '节点等级',
   IS_LEAF              numeric(1)  comment '是否叶子节点',
   SHOW_INDEX           numeric(8) not null default 1  comment '显示顺序',
   CREATE_BY            varchar(22) not null  comment '创建人',
   CREATE_TIME          datetime not null  comment '创建时间',
   UPDATE_BY            varchar(22) not null  comment '最后修改人',
   UPDATE_TIME          datetime not null  comment '最后修改时间',
   STATUS               decimal(1) not null default 1  comment '状态',
   primary key (ORGAN_ID)
);

alter table SYS_ORGAN_INFO comment '机构信息表';

/*==============================================================*/
/* Table: SYS_STAFF_INFO                                        */
/*==============================================================*/
create table SYS_STAFF_INFO
(
   STAFF_ID             varchar(22) not null  comment '员工ID',
   STAFF_CODE           varchar(22) not null  comment '工号',
   STAFF_NAME           varchar(30) not null  comment '姓名',
   ORGAN_ID             varchar(22) not null  comment '部门',
   SEX_TYPE             char(1) not null  comment '性别',
   BIRTHDAY             date  comment '出生日期',
   ENTRY_DATE           date not null  comment '入职日期',
   TERM_DATE            date  comment '离职日期',
   PHOTO                longblob  comment '照片',
   COUNTRY              varchar(10)  comment '国家',
   CENSUS_REGISTER      varchar(150)  comment '籍贯',
   ADDRESS              varchar(250)  comment '家庭地址',
   EMAIL                varchar(100)  comment '邮箱',
   TEL_NO               varchar(20)  comment '移动电话',
   POST                 varchar(20)  comment '岗位',
   POST_GRADE           varchar(20)  comment '职位级别',
   CREATE_BY            varchar(22) not null  comment '创建人',
   CREATE_TIME          datetime not null  comment '创建时间',
   UPDATE_BY            varchar(22) not null  comment '最后修改人',
   UPDATE_TIME          datetime not null  comment '最后修改时间',
   STATUS               decimal(1) not null default 1  comment '状态',
   primary key (STAFF_ID)
);

alter table SYS_STAFF_INFO comment '员工信息表';

alter table SAG_DICT_DETAIL add constraint FK_DICT_TYPE_REF_ITEM foreign key (DICT_TYPE)
      references SAG_DICT_TYPE (DICT_TYPE) on delete restrict on update restrict;
