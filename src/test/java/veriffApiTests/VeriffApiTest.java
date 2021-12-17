package veriffApiTests;

import fitekinapi.ResponseHandler;
import utils.FileReaderUtil;
import utils.FileWriterUtil;

public class VeriffApiTest {

    public static String response;
    public static String configurationResponse;
    public String acceptHeader = "application/json";

    public void getAuthorizationToken() {

        String requestUrl = "https://demo.veriff.me/";
        String fileName = "src/test/java/jsonFiles/user.json";
        String stringToParse = FileReaderUtil.readFile(fileName);

        response = ResponseHandler.getPostApiResponse(acceptHeader,
                stringToParse,
                requestUrl,
                "",
                200,
                "").asString();
    }

    public void getConfiguration() {

        String requestUrl = "https://magic.veriff.me/api/v2/sessions";
        String fileName = FileReaderUtil.readFile(FileWriterUtil.filePath);

        configurationResponse = ResponseHandler.getGetApiResponse(acceptHeader,
                requestUrl,
                "",
                200,
                "Bearer " + fileName).asString();

        System.out.println("Configuration " + configurationResponse);
    }
}
