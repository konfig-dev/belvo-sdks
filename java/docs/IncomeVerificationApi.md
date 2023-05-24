# IncomeVerificationApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**verify**](IncomeVerificationApi.md#verify) | **POST** /api/enrich/incomes | Verify incomes |


<a name="verify"></a>
# **verify**
> List&lt;Income&gt; verify(eyodIncomeVerificationRequest).execute();

Verify incomes

Send through your raw data and receive enriched information for each of your user&#39;s income streams.  &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #5bc0de;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; Belvo can process up to 10,000 unique transactions per request. &lt;/div&gt;

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.IncomeVerificationApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    IncomeVerificationApi api = new IncomeVerificationApi(apiClient);
    String language = "language_example"; // Two-letter ISO 639-1 code for the language of the transaction.
    List<EyodIncomeVerificationBodyRequest> transactions = Arrays.asList(); // An array of transaction objects that you want enriched.  **Note:** Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request.
    String dateFrom = "dateFrom_example"; // The date from which you want to start getting incomes for, in `YYYY-MM-DD` format, within the last 365 days. When you use this parameter, you must also send `date_to`.  ⚠️ The value of `date_from` cannot be greater than `date_to`.
    String dateTo = "dateTo_example"; // The date you want to stop getting incomes for, in `YYYY-MM-DD` format, within the last 365 days. When you use this parameter, you must also send `date_from`.  ⚠️ The value of `date_to` cannot be greater than today's date (in other words, no future dates).
    List<EnumInvoiceAllowedIncomeTypesRequest> allowedIncomeTypes = Arrays.asList();
    EnumIncomeMinimumConfidenceLevelRequest minimumConfidenceLevel = EnumIncomeMinimumConfidenceLevelRequest.fromValue("HIGH");
    try {
      List<Income> result = api
              .verify(language, transactions)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .allowedIncomeTypes(allowedIncomeTypes)
              .minimumConfidenceLevel(minimumConfidenceLevel)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling IncomeVerificationApi#verify");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<List<Income>> response = api
              .verify(language, transactions)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .allowedIncomeTypes(allowedIncomeTypes)
              .minimumConfidenceLevel(minimumConfidenceLevel)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncomeVerificationApi#verify");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **eyodIncomeVerificationRequest** | [**EyodIncomeVerificationRequest**](EyodIncomeVerificationRequest.md)|  | |

### Return type

[**List&lt;Income&gt;**](Income.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

