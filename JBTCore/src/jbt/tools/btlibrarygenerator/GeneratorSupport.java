package jbt.tools.btlibrarygenerator;

import java.io.File;
import java.io.IOException;

public class GeneratorSupport {

    public static void main(String[] args) throws IOException {
        //定位behaviortree的路径
        String behaviortreeProjectPath = "../src/main/resources/";
        File behaviortreeProjectFilePath = new File(behaviortreeProjectPath).getCanonicalFile();
        System.out.println("behaviortreeProjectFilePath : " +  behaviortreeProjectFilePath.getAbsolutePath());

        {
            {
                String[] argsActionsAndConditionsGenerator = new String[6];
                argsActionsAndConditionsGenerator[0] = "-c";
                argsActionsAndConditionsGenerator[1] = behaviortreeProjectFilePath.getAbsolutePath() + "/mmpm_configuration.xml";
                argsActionsAndConditionsGenerator[2] = "-r";
                argsActionsAndConditionsGenerator[3] = behaviortreeProjectFilePath.getAbsolutePath() + "/";
                argsActionsAndConditionsGenerator[4] = "-o";
                argsActionsAndConditionsGenerator[5] = "true";
                ActionsAndConditionsGenerator.main(argsActionsAndConditionsGenerator);
            }

            {
                String[] argsBTLibraryGenerator = new String[6];
                argsBTLibraryGenerator[0] = "-c";
                argsBTLibraryGenerator[1] = behaviortreeProjectFilePath.getAbsolutePath() + "/bt_common_config.xml";
                argsBTLibraryGenerator[2] = "-r";

                argsBTLibraryGenerator[3] = behaviortreeProjectFilePath.getAbsolutePath() + "";
                argsBTLibraryGenerator[4] = "-o";
                argsBTLibraryGenerator[5] = "true";
                BTLibraryGenerator.main(argsBTLibraryGenerator);
            }
        }
    }
}
