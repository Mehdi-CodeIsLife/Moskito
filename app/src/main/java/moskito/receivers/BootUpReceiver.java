package moskito.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import moskito.services.BootUpService;

public class BootUpReceiver extends BroadcastReceiver {
    public BootUpReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, BootUpService.class);  //MyActivity can be anything which you want to start on bootup...
        context.startService(i);
    }
}
