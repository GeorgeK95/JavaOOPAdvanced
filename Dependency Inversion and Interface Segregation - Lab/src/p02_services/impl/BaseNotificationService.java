package p02_services.impl;

import p02_services.contracts.NotificationService;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class BaseNotificationService implements NotificationService {
    protected boolean isActive;

    public BaseNotificationService(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public void sendNotification() {

    }

}
