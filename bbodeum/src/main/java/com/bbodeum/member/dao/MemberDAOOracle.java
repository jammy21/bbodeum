package com.bbodeum.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.bbodeum.exception.AddException;
import com.bbodeum.exception.FindException;
import com.bbodeum.exception.ModifyException;
import com.bbodeum.member.vo.Member;

import resource.Factory;

public class MemberDAOOracle implements MemberDAO {
	private SqlSessionFactory sqlSessionFactory;
	
	public MemberDAOOracle() {
		sqlSessionFactory = Factory.getSqlSessionFactory();
	}
	
	@Override
	public Member selectById(String id)
			throws FindException {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			Member mem = session.selectOne("com.bbodeum.member.dao.MemberMapper.selectById", id);
			return mem;
		}catch(Exception e) {
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}

	@Override
	public void insert(Member mem) throws AddException {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			session.selectOne("com.bbodeum.member.dao.MemberMapper.insert", mem);
		}catch(Exception e) {
			e.printStackTrace();
			throw new AddException(e.getMessage());
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}
	
	@Override
	public void update(Member mem) throws ModifyException {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			session.selectOne("com.bbodeum.member.dao.MemberMapper.update", mem);			
		}catch(Exception e) {
			e.printStackTrace();
			throw new ModifyException(e.getMessage());
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}
	@Override
	public void updateStatus(String memId) throws ModifyException {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			session.selectOne("com.bbodeum.member.dao.MemberMapper.updateStatus", memId);			
		}catch(Exception e) {
			e.printStackTrace();
			throw new ModifyException(e.getMessage());
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}
}