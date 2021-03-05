package com.reactnativebackgroundgps

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class BackgroundGpsModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "BackgroundGps"
    }

    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    @ReactMethod
    fun multiply(a: Int, b: Int, promise: Promise) {
    
      promise.resolve(a * b)
    
    }

	@ReactMethod
    public void getModuleList(final Callback callback) {
        try {

            WritableArray list = getList();
            callback.invoke(null, list);

        } catch (Exception e) {
            callback.invoke("Error", null);
        }
    }


   private WritableArray getList() {

        WritableArray listArr = Arguments.createArray();
        listArr.pushString("react-native-fbsdk");
        listArr.pushString("react-native-camera");
        listArr.pushString("react-native-map");

        return listArr;
    }
    
}
