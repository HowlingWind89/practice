package fitekinapi;

public class ApiTest {

    public void getCurrency() {

        String acceptHeader = "application/json";
        String requestUrl = "https://test.fitekin.com/WebApi/api/Currency";
        String authorizationToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJCYWNrT2ZmaWNlVXNlckd1aWQiOiJiNTE0N2E0Mi1kMGFhLTQyZWMtOGY5YS0zNWY0YmRhNzAyNzIiLCJCYWNrT2ZmaWNlQ29tcGFueUd1aWQiOiIzMDlmYTdjOC1lYzQxLTRmNWMtOGRmMC02YTdlYzhhYTBhNjIiLCJMYW5ndWFnZSI6bnVsbCwiRXhwaXJhdGlvbkRhdGUiOiIyMDIxLTA4LTI3VDE3OjMzOjE5LjMwOTU5NzUrMDM6MDAiLCJEYlNlcnZlcklwIjoiMTAuMjI0LjAuMTE1IiwiRGJUeXBlIjoxLCJEYk5hbWUiOiJFbXIiLCJEYlNjaGVtYSI6IkVtcl8zMDlmYTdjOF9lYzQxXzRmNWNfOGRmMF82YTdlYzhhYTBhNjIiLCJCb1JvbGVzIjpbXSwiRW1yUm9sZXMiOls0LDYsMTAxLDksMCwxLDUsMywyLDgsMTAsMTFdLCJVc2VySWQiOjE0LCJHcm91cE1lbWJlcklkIjoxOCwiQ29tcGFueUlkIjoxLCJTZXNzaW9uSWQiOjQ1NTU4LCJMb2dpbk1ldGhvZCI6MCwiY2FwdGNoYVNjb3JlIjpudWxsfQ.869cwFHZjNg-47iW6mTR8ZJqbMQuNiVbKjQ5O_z-HP4";

       String response = ResponseHandler.getGetApiResponse(acceptHeader,
                requestUrl,
                "",
                200,
                authorizationToken).asString();
       System.out.println("Response: " + response);
    }
}
