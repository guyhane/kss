package org.zerock;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.zerock.domain.MemberVo;
import org.zerock.mapper.MemberMapper;

public class MemberMapperTest extends App2ApplicationTests{
	
	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void testRead() throws Exception{
		System.out.println("read test");
		MemberVo vo = mapper.read("system");
		System.out.println(vo.getUsername());
	}

}
