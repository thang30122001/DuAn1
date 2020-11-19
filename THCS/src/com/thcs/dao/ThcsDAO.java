package com.thcs.dao;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface ThcsDAO<EntityType, KeyType> {

    abstract public void insert(EntityType entity);

    abstract public void update(EntityType entity);

    abstract public void delete(KeyType id);

    abstract public List<EntityType> selectAll();

    abstract public EntityType selectById(KeyType id);

    abstract List<EntityType> selectBySql(String sql, Object... args);
}
