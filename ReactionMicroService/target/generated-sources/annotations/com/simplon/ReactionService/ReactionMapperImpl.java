package com.simplon.ReactionService;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-29T10:45:04+0000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class ReactionMapperImpl implements ReactionMapper {

    @Override
    public ReactionDTO toDTO(Reaction reaction) {
        if ( reaction == null ) {
            return null;
        }

        ReactionDTO.ReactionDTOBuilder reactionDTO = ReactionDTO.builder();

        reactionDTO.id( reaction.getId() );
        reactionDTO.userId( reaction.getUserId() );
        reactionDTO.postId( reaction.getPostId() );
        reactionDTO.typeReaction( reaction.getTypeReaction() );
        reactionDTO.dateDeReaction( reaction.getDateDeReaction() );

        return reactionDTO.build();
    }

    @Override
    public Reaction toEntity(ReactionDTO reactionDTO) {
        if ( reactionDTO == null ) {
            return null;
        }

        Reaction.ReactionBuilder reaction = Reaction.builder();

        reaction.id( reactionDTO.getId() );
        reaction.userId( reactionDTO.getUserId() );
        reaction.postId( reactionDTO.getPostId() );
        reaction.typeReaction( reactionDTO.getTypeReaction() );
        reaction.dateDeReaction( reactionDTO.getDateDeReaction() );

        return reaction.build();
    }
}
