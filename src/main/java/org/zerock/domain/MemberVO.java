package org.zerock.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class MemberVO {
	private String userid;
	private String userpw;
	private String username;
	private String email;
	private String nickname;
	private boolean agree;
	private Date regDate;
	private Date updateDate;
	private List<AuthVO> authList;
}