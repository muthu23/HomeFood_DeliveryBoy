package com.foodondoor.delivery.fcm;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.foodondoor.delivery.Application;
import com.foodondoor.delivery.R;
import com.foodondoor.delivery.activities.Splash;


public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMsgService";
    public static Ringtone mRingtone;
    public static Vibrator mVibrator;
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        if (remoteMessage.getData() != null) {
            Log.d(TAG, "From: " + remoteMessage.getFrom());
            Log.d(TAG, "Notification Message Body: " + remoteMessage.getData());
            //Calling method to generate notification
            sendNotification(remoteMessage.getData().get("message"));
        } else {
            Log.d(TAG, "FCM Notification failed");
        }
    }

    private void sendNotification(String messageBody) {
        Log.d(TAG, "messageBody " + messageBody);

        Intent intent = new Intent(getApplicationContext(), Splash.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("Notification", messageBody);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
                intent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, "PUSH");
     /*   NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
        inboxStyle.addLine(messageBody);*/
        NotificationCompat.BigTextStyle inboxStyle = new NotificationCompat.BigTextStyle();
        inboxStyle.bigText(messageBody);


        if (messageBody.equalsIgnoreCase("New order request")||
                messageBody.equalsIgnoreCase("You Have One Incoming Request")){
            playNotificationSound();
        }
        long when = System.currentTimeMillis();         // notification time

        String CHANNEL_ID = "my_channel_01";    // The id of the channel.
        CharSequence name = "Channel human readable title";// The user-visible name of the channel.
        int importance = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N)
            importance = NotificationManager.IMPORTANCE_HIGH;

        Notification notification;
        notification = mBuilder.setWhen(when)
                //                .setAutoCancel(true)
                .setContentTitle(getString(R.string.app_name))
                .setContentIntent(pendingIntent)
//                .setSound(Settings.System.DEFAULT_NOTIFICATION_URI)
                .setStyle(inboxStyle)
                .setAutoCancel(true)
                .setWhen(when)
                .setSmallIcon(getNotificationIcon(mBuilder))
                .setContentText(messageBody)
                .setChannelId(CHANNEL_ID)
                .setVibrate(new long[] {  100, 500, 100, 500})
                .setDefaults(Notification.DEFAULT_VIBRATE | Notification.DEFAULT_LIGHTS)
                .build();

        NotificationManager notificationManager = (NotificationManager)
                getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            android.app.NotificationChannel mChannel = new android.app.NotificationChannel(CHANNEL_ID, name, importance);
            mChannel.setVibrationPattern(new long[] { 100, 500, 100, 500});
            mChannel.enableVibration(true);
            notificationManager.createNotificationChannel(mChannel);
        }

        notificationManager.notify(0, notification);
    }

    public void playNotificationSound() {
        try {
            Uri alarmSound = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + Application.getInstance().getApplicationContext().getPackageName() + "/raw/alert_tone");
            mRingtone = RingtoneManager.getRingtone(Application.getInstance().getApplicationContext(), alarmSound);
            mRingtone.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*private int getNotificationIcon(NotificationCompat.Builder notificationBuilder) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            notificationBuilder.setColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
            return R.drawable.ic_stat_push;
        } else return R.drawable.ic_stat_push;
    }*/

    private int getNotificationIcon(NotificationCompat.Builder notificationBuilder) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            notificationBuilder.setColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
            return R.drawable.ic_push;
        } else {
//            notificationBuilder.setColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
            return R.drawable.ic_push;
        }
    }

}
