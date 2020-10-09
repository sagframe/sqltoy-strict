# 演示严格分DTO(VO)和POJO(Entity) 的项目实现过程
## 1. 通过tools/quickvo 工具

* 区别在于quickvo.xml的配置,额外增加了entity实体对象生成

```xml
<tasks dist="../../src/main/java" encoding="UTF-8">
		<task active="true" author="zhongxuchen" include="^SAG_\w+" datasource="quickstart" swagger-model="true">
			<entity package="${project.package}.sagacity.entity" substr="Sag" name="#{subName}"/>
			<vo package="${project.package}.sagacity.vo" substr="Sag" name="#{subName}VO" />
		</task>
		<task active="true" author="zhongxuchen" include="^SYS_\w+" datasource="quickstart" swagger-model="true">
			<entity package="${project.package}.system.entity" substr="Sys" name="#{subName}"/>
			<vo package="${project.package}.system.vo" substr="Sys" name="#{subName}VO" />
		</task>
</tasks>
```

## 2. 
