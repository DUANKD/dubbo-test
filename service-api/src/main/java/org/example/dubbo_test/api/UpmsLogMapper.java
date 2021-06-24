package org.example.dubbo_test.api;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UpmsLogMapper extends BaseMapper<UpmsLog> {

    int deleteByPrimaryKey(Integer logId);

    int insertSelective(UpmsLog record);

    UpmsLog selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(UpmsLog record);

    int updateByPrimaryKeyWithBLOBs(UpmsLog record);

    int updateByPrimaryKey(UpmsLog record);
}