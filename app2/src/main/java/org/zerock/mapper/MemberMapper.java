package org.zerock.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.zerock.domain.MemberVo;

public interface MemberMapper {
	@Insert("insert into htuser(userid, password, username) values (#{userid}, #{userpw}, #{username})")
	public void create (MemberVo vo) throws Exception;
	
	@Select("select * from htuser where userid = #{userid}")
	public MemberVo read(String userid) throws Exception;
}
