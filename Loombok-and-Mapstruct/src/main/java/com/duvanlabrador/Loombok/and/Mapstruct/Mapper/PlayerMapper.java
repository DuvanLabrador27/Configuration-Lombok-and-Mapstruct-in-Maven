package com.duvanlabrador.Loombok.and.Mapstruct.Mapper;

import com.duvanlabrador.Loombok.and.Mapstruct.DTO.PlayerDTO;
import com.duvanlabrador.Loombok.and.Mapstruct.Entity.PlayerEntity;
import org.mapstruct.*;

//Le indicamos al contenedor de spring que se va a inyectar
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "lastname", target = "lastname"),
            @Mapping(source = "programmingLanguage", target = "programmingLanguage")
    })
    PlayerDTO playerToGetDTO(PlayerEntity playerEntity);
    @InheritInverseConfiguration
    PlayerEntity playerToGetEntity(PlayerDTO playerDTO);

}



