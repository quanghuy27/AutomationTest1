package helpers;

import com.aventstack.extentreports.MediaEntityBuilder;
import commons.GlobalVariable;



import java.io.IOException;

public class ReportHelper {

    public static void logFail(String message, String path) {
        try {
            GlobalVariable.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromPath(path).build());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
