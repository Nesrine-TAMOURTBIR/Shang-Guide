package com.example.Shang_Guide;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;

import java.util.Locale;

public class LocaleHelper {

    // الحصول على اللغة الحالية
    public static String getLanguage(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        return locale.getLanguage();
    }

    // تعيين اللغة الجديدة
    public static Context setLocale(Context context, String language) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return updateResources(context, language);
        }

        return updateResourcesLegacy(context, language);
    }

    // التحديث للـ API 24+
    @TargetApi(Build.VERSION_CODES.N)
    private static Context updateResources(Context context, String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);

        Configuration config = new Configuration(context.getResources().getConfiguration());
        config.setLocale(locale);
        config.setLayoutDirection(locale);

        // إعادة تطبيق التغييرات على جميع الموارد
        context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());
        return context.createConfigurationContext(config);
    }

    // التحديث للـ API أقل من 24
    private static Context updateResourcesLegacy(Context context, String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);

        Configuration config = context.getResources().getConfiguration();
        config.locale = locale;
        config.setLayoutDirection(locale);

        context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());

        return context;
    }

    // إعادة تشغيل النشاط لتطبيق تغيير اللغة
    public static void restartActivity(Context context, Class<?> activityClass) {
        Intent intent = new Intent(context, activityClass);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
