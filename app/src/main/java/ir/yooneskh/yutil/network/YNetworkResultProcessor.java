package ir.yooneskh.yutil.network;

import com.google.gson.JsonObject;

/**
 * Created by Yoones on 05/08/2016.
 */
public interface YNetworkResultProcessor {
    void process(int httpCode, String result);
}
