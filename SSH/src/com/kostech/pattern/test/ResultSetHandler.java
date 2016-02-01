package com.kostech.pattern.test;

import java.sql.ResultSet;

public interface ResultSetHandler<T> {

	public T handle(ResultSet rs);
}
