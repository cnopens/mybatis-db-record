<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
		"http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${namespace}">

	<cache ${cache}/>

	<insert id="insert${domainName}" parameterType="${domainName}">
	${insertSQL}
	</insert>
	<update id="update${domainName}" parameterType="${domainName}">
	${updateSQL}
	</update>
	<select id="selectOwn${domainName}" resultType="${domainName}" parameterType="map">
	${queryAllSQL}
		<if test="start !=null">
		${pageWHERESQL}
		</if>
	</select>
	<select id="count${domainName}" resultType="long">
	${countSQL}
	</select>
	<select id="selectOne${domainName}" parameterType="long">
	${queryOneSQL}
	</select>
	<delete id="delete${domainName}" parameterType="long">
	${deleteSQL}
	</delete>
</mapper>