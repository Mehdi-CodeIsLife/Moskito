package moskito.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import moskito.services.CallLoggerService;

public class CallReceiver extends BroadcastReceiver {
    public CallReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // assumes WordService is a registered service
        context.startService(new Intent(context, CallLoggerService.class));
    }
}
