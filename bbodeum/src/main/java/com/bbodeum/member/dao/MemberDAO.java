package com.bbodeum.member.dao;

import com.bbodeum.exception.FindException;
import com.bbodeum.exception.ModifyException;
import com.bbodeum.exception.AddException;
import com.bbodeum.member.vo.Member;

public interface MemberDAO {
	/**
	 * 아이디로 멤버를 검색한다
	 * @param id 아이디
	 * @return Member 멤버vo
	 * @throws 멤버 검색 시 FindException 발생시킨다
	 */
	public Member selectById(String id) throws FindException; 
	
	/**
	 * 새 멤버를 추가한다
	 * @param mem 멤버vo
	 * @throws 멤버 추가 시 AddException 발생시킨다
	 */
	public void insert(Member vo) throws AddException;
	
	/**
	 * 멤버 정보를 업데이트 한다
	 * @param mem 멤버vo
	 * @throws 멤버 수정 시 ModifyException 발생시킨다
	 */
	public void update(Member mem) throws ModifyException;

	/**
	 * 멤버 가입상태를 업데이트 한다
	 * @param memId 아이디
	 * @param memStatus 가입상태 1가입중 -1탈퇴
	 * @throws 멤버 가입상태 수정 시 ModifyException 발생시킨다
	 */
	public void updateStatus(String memId)
		throws ModifyException;
	
}
