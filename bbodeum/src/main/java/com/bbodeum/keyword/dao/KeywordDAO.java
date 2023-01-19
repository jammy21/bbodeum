package com.bbodeum.keyword.dao;

import com.bbodeum.exception.FindException;
import com.bbodeum.keyword.vo.Keyword;

public interface KeywordDAO {
	public void insert(Keyword vo)
			throws FindException;
}
