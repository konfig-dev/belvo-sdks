# CategorizationApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**categorizeTransactions**](CategorizationApi.md#categorizeTransactions) | **POST** /api/categorization | Categorize transactions |


<a name="categorizeTransactions"></a>
# **categorizeTransactions**
> Categorization categorizeTransactions(categorizationRequest).execute();

Categorize transactions

Send through your raw transaction data and receive enriched information for each of your transactions.  &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #5bc0de;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; Belvo can process up to 10,000 unique transactions per request. &lt;/div&gt;

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.CategorizationApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    CategorizationApi api = new CategorizationApi(apiClient);
    String language = "language_example"; // Two-letter ISO 639-1 code for the language of the transaction.
    List<CategorizationBodyRequest> transactions = Arrays.asList(); // An array of transaction objects that you want categorized.  **Note:** Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request.
    try {
      Categorization result = api
              .categorizeTransactions(language, transactions)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling CategorizationApi#categorizeTransactions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Categorization> response = api
              .categorizeTransactions(language, transactions)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategorizationApi#categorizeTransactions");
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
| **categorizationRequest** | [**CategorizationRequest**](CategorizationRequest.md)|  | |

### Return type

[**Categorization**](Categorization.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

