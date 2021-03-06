package com.wws.mybatis.enums;

/**
 * @author wws
 * @version 1.0.0
 * @date 2020-01-16 15:13
 **/
public enum SqlMethod {
    /**
     * 根据id删除
     */
    DeleteById("deleteById", "delete from %s where %s = #{%s}"),
    /**
     * 根据id删除
     */
    Insert("insert", "insert into %s(%s) value(%s)"),
    /**
     * 根据id删除
     */
    UpdateById("updateById", "<script>update %s <set>%s</set><where>%s = #{%s}</where></script>"),
    /**
     * 根据id查询
     */
    SelectById("selectById", "select %s from %s where %s = #{id}");


    private String sql;

    private String method;

    SqlMethod(String method, String sql) {
        this.sql = sql;
        this.method = method;
    }

    public String getSql() {
        return sql;
    }

    public String getMethod() {
        return method;
    }
}
