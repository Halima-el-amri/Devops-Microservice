package com.simplon.GroupeUserService;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-29T10:45:34+0000",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class GroupUserMapperImpl implements GroupUserMapper {

    @Override
    public GroupUserDTO groupUserToGroupUserDTO(GroupUsers groupUser) {
        if ( groupUser == null ) {
            return null;
        }

        GroupUserDTO groupUserDTO = new GroupUserDTO();

        return groupUserDTO;
    }

    @Override
    public GroupUsers groupUserDTOToGroupUser(GroupUserDTO groupsUerDTO) {
        if ( groupsUerDTO == null ) {
            return null;
        }

        GroupUsers groupUsers = new GroupUsers();

        return groupUsers;
    }
}
