package com.simplon.NotificationService;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-29T10:45:27+0000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class NotificationMapperImpl implements NotificationMapper {

    @Override
    public NotificationDTO toDTO(Notification e) {
        if ( e == null ) {
            return null;
        }

        NotificationDTO notificationDTO = new NotificationDTO();

        notificationDTO.setIdNotif( e.getIdNotif() );
        notificationDTO.setContentNotif( e.getContentNotif() );
        notificationDTO.setTypeNotif( e.getTypeNotif() );
        notificationDTO.setReadNotif( e.isReadNotif() );
        notificationDTO.setSenderId( e.getSenderId() );
        notificationDTO.setRecipientId( e.getRecipientId() );
        notificationDTO.setDateNotif( e.getDateNotif() );

        return notificationDTO;
    }

    @Override
    public Notification toEntity(NotificationDTO o) {
        if ( o == null ) {
            return null;
        }

        Notification notification = new Notification();

        notification.setIdNotif( o.getIdNotif() );
        notification.setContentNotif( o.getContentNotif() );
        notification.setTypeNotif( o.getTypeNotif() );
        notification.setReadNotif( o.isReadNotif() );
        notification.setSenderId( o.getSenderId() );
        notification.setRecipientId( o.getRecipientId() );
        notification.setDateNotif( o.getDateNotif() );

        return notification;
    }
}
