package com.cupacm.javabackend.mapper;

import com.cupacm.javabackend.model.Loginlog;
import com.cupacm.javabackend.model.LoginlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbg.generated Sat Mar 07 00:25:04 CST 2020
     */
    long countByExample(LoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbg.generated Sat Mar 07 00:25:04 CST 2020
     */
    int deleteByExample(LoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbg.generated Sat Mar 07 00:25:04 CST 2020
     */
    int insert(Loginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbg.generated Sat Mar 07 00:25:04 CST 2020
     */
    int insertSelective(Loginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbg.generated Sat Mar 07 00:25:04 CST 2020
     */
    List<Loginlog> selectByExample(LoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbg.generated Sat Mar 07 00:25:04 CST 2020
     */
    int updateByExampleSelective(@Param("record") Loginlog record, @Param("example") LoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbg.generated Sat Mar 07 00:25:04 CST 2020
     */
    int updateByExample(@Param("record") Loginlog record, @Param("example") LoginlogExample example);
}