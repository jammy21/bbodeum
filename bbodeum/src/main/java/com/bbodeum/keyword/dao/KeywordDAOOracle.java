package com.bbodeum.keyword.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.bbodeum.exception.FindException;
import com.bbodeum.keyword.vo.Keyword;

import resource.Factory;

public class KeywordDAOOracle implements KeywordDAO{
	private SqlSessionFactory sqlSessionFactory;

	public KeywordDAOOracle() {
		sqlSessionFactory = Factory.getSqlSessionFactory();
	}

	public void insert(Keyword vo) 
			throws FindException {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			Map<String, Object> map = new HashMap<>();
			map.put("keyId", vo.getKeyId());
			map.put("keyName", vo.getKeyName());

			session.selectOne("com.bbodeum.Keyword.dao.KeywordMapper.insert",map);
		}catch(Exception e) {
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}
	
	public static void main(String[] args)  throws FindException {
		KeywordDAOOracle dao = new KeywordDAOOracle();
		Keyword vo = new Keyword(null,"클리커");
		dao.insert(vo);
	}
}
