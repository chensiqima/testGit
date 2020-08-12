package org.boggler.api.mappers;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.boggler.api.dto.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@DS("master")
public interface MasterMapper {
    @DS("master")
     List<UserDto> getAllList();

    @DS("master")
    Integer getallListCount();
}
