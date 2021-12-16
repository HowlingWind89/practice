package veriffApiTests;

import fitekinapi.ResponseHandler;
import utils.FileReaderUtil;
import utils.JsonUtil;

public class VeriffApiTest {

    public String response;

    public void getAuthorizationToken() {

        String requestUrl = "https://demo.veriff.me/";
        String fileName = "src/test/java/jsonFiles/user.json";
        String acceptHeader = "application/json";
        String stringToParse = FileReaderUtil.readFile(fileName);

         response = ResponseHandler.getPostApiResponse(acceptHeader,
                stringToParse,
                requestUrl,
                "",
                200,
                "").asString();
    }
}
