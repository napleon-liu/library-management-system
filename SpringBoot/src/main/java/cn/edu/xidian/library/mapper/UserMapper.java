package cn.edu.xidian.library.mapper;

import cn.edu.xidian.library.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    public Integer selectDebt();
}
