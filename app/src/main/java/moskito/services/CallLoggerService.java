package moskito.services;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class CallLoggerService extends IntentService {

    public CallLoggerService() {
        super("CallLoggerService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String state = extras.getString(TelephonyManager.EXTRA_STATE);
                Log.w("MY_DEBUG_TAG", state);
                if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                    String phoneNumber = extras
                            .getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                    Log.w("MY_DEBUG_TAG", phoneNumber);
                }
            }
        }
    }

}
