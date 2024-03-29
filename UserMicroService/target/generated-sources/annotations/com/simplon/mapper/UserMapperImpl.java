package com.simplon.mapper;

import com.simplon.model.dto.UserDto;
import com.simplon.model.entity.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-29T10:44:51+0000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity userDtoToUserEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.idUser( userDto.getIdUser() );
        userEntity.firstName( userDto.getFirstName() );
        userEntity.lastName( userDto.getLastName() );
        userEntity.email( userDto.getEmail() );
        userEntity.username( userDto.getUsername() );
        userEntity.password( userDto.getPassword() );
        userEntity.gender( userDto.getGender() );
        userEntity.bio( userDto.getBio() );
        userEntity.avatar( userDto.getAvatar() );
        userEntity.role( userDto.getRole() );
        userEntity.phone( userDto.getPhone() );

        return userEntity.build();
    }

    @Override
    public UserDto userEntityToUserDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto = UserDto.builder();

        userDto.idUser( userEntity.getIdUser() );
        userDto.firstName( userEntity.getFirstName() );
        userDto.lastName( userEntity.getLastName() );
        userDto.username( userEntity.getUsername() );
        userDto.password( userEntity.getPassword() );
        userDto.email( userEntity.getEmail() );
        userDto.role( userEntity.getRole() );
        userDto.gender( userEntity.getGender() );
        userDto.avatar( userEntity.getAvatar() );
        userDto.bio( userEntity.getBio() );
        userDto.phone( userEntity.getPhone() );

        return userDto.build();
    }
}
