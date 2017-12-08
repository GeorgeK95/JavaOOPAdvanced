package p02_services;

import p02_services.impl.BaseNotificationService;

public class EmailNotificationService extends BaseNotificationService {

    public EmailNotificationService(boolean isActive) {
        super(isActive);
    }

    public void sendNotification() {

    }

    public boolean isActive() {
        return super.isActive;
    }
}
