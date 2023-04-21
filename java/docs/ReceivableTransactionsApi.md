# ReceivableTransactionsApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**delete**](ReceivableTransactionsApi.md#delete) | **DELETE** /receivables/transactions/{id} | Delete a receivable transaction |
| [**getDetails**](ReceivableTransactionsApi.md#getDetails) | **GET** /receivables/transactions/{id} | Get a receivable transaction&#39;s details |
| [**list**](ReceivableTransactionsApi.md#list) | **GET** /receivables/transactions | List all receivable transactions |
| [**retrieve**](ReceivableTransactionsApi.md#retrieve) | **POST** /receivables/transactions | Retrieve receivable transactions for a link |


<a name="delete"></a>
# **delete**
> delete(id).execute();

Delete a receivable transaction

Delete a specific receivable transaction from your Belvo account.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.ReceivableTransactionsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    ReceivableTransactionsApi api = new ReceivableTransactionsApi(apiClient);
    UUID id = UUID.randomUUID(); // The `transaction.id` that you want to delete.
    try {
      api
              .delete(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivableTransactionsApi#delete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      api
              .delete(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivableTransactionsApi#delete");
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
| **id** | **UUID**| The &#x60;transaction.id&#x60; that you want to delete. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |

<a name="getDetails"></a>
# **getDetails**
> ReceivablesTransaction getDetails(id).omit(omit).fields(fields).execute();

Get a receivable transaction&#39;s details

Get the details of a specific receivable transaction.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.ReceivableTransactionsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    ReceivableTransactionsApi api = new ReceivableTransactionsApi(apiClient);
    UUID id = UUID.randomUUID(); // The `transaction.id` you want to get detailed information about.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      ReceivablesTransaction result = api
              .getDetails(id)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivableTransactionsApi#getDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<ReceivablesTransaction> response = api
              .getDetails(id)
              .omit(omit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivableTransactionsApi#getDetails");
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
| **id** | **UUID**| The &#x60;transaction.id&#x60; you want to get detailed information about. | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**ReceivablesTransaction**](ReceivablesTransaction.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="list"></a>
# **list**
> ReceivablesTransactionsPaginatedResponse list().page(page).pageSize(pageSize).omit(omit).fields(fields).link(link).account(account).accountIn(accountIn).createdAtGt(createdAtGt).createdAtGte(createdAtGte).createdAtLt(createdAtLt).createdAtLte(createdAtLte).createdAtRange(createdAtRange).linkIn(linkIn).valueDate(valueDate).valueDateGt(valueDateGt).valueDateGte(valueDateGte).valueDateLt(valueDateLt).valueDateLte(valueDateLte).valueDateRange(valueDateRange).execute();

List all receivable transactions

Get a paginated list of all the existing receivable transactions in your Belvo account. We return up to 100 results per page.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.ReceivableTransactionsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    ReceivableTransactionsApi api = new ReceivableTransactionsApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    Integer pageSize = 100; // Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // The `link.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
    UUID account = UUID.fromString("d979df3a-5d0f-4cc9-9bd4-b75c28b45963"); // The `account.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
    String accountIn = "24ccab1d-3a86-4136-a6eb-e04bf52b356f,beb2b197-3cf7-428d-bef3-f415c0d57509"; // Return receivable transactions only for these `account.id`s.
    String createdAtGt = "2022-05-05"; // Return receivable transactions that were last updated in Belvo's database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtGte = "2022-05-04"; // Return receivable transactions that were last updated in Belvo's database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtLt = "2022-04-01"; // Return receivable transactions that were last updated in Belvo's database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtLte = "2022-03-30"; // Return receivable transactions that were last updated in Belvo's database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtRange = "2022-03-03,2022-05-04"; // Return receivable transactions that were last updated in Belvo's database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String linkIn = "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,cc2b13cf-336e-497c-9fad-e074b580df65"; // Return information for these `link.id`s.
    String valueDate = "2022-05-05"; // Return receivable transactions for exactly this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    String valueDateGt = "2022-05-06"; // Return receivable transactions for after this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    String valueDateGte = "2022-05-04"; // Return receivable transactions for this date or later (`YYYY-MM-DD` or full ISO-8601 timestamp).
    String valueDateLt = "2022-03-02"; // Return receivable transactions for before this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    String valueDateLte = "2022-03-01"; // Return receivable transactions for this date or earlier (`YYYY-MM-DD` or full ISO-8601 timestamp).
    String valueDateRange = "2022-03-01,2022-05-06"; // Return receivable transactions for this date range (`YYYY-MM-DD` or full ISO-8601 timestamp).
    try {
      ReceivablesTransactionsPaginatedResponse result = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .link(link)
              .account(account)
              .accountIn(accountIn)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .linkIn(linkIn)
              .valueDate(valueDate)
              .valueDateGt(valueDateGt)
              .valueDateGte(valueDateGte)
              .valueDateLt(valueDateLt)
              .valueDateLte(valueDateLte)
              .valueDateRange(valueDateRange)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivableTransactionsApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<ReceivablesTransactionsPaginatedResponse> response = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .link(link)
              .account(account)
              .accountIn(accountIn)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .linkIn(linkIn)
              .valueDate(valueDate)
              .valueDateGt(valueDateGt)
              .valueDateGte(valueDateGte)
              .valueDateLt(valueDateLt)
              .valueDateLte(valueDateLte)
              .valueDateRange(valueDateRange)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivableTransactionsApi#list");
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
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  | [optional] [default to 100] |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **link** | **UUID**| The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  | [optional] |
| **account** | **UUID**| The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  | [optional] |
| **accountIn** | **String**| Return receivable transactions only for these &#x60;account.id&#x60;s. | [optional] |
| **createdAtGt** | **String**| Return receivable transactions that were last updated in Belvo&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtGte** | **String**| Return receivable transactions that were last updated in Belvo&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtLt** | **String**| Return receivable transactions that were last updated in Belvo&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtLte** | **String**| Return receivable transactions that were last updated in Belvo&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtRange** | **String**| Return receivable transactions that were last updated in Belvo&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **linkIn** | **String**| Return information for these &#x60;link.id&#x60;s. | [optional] |
| **valueDate** | **String**| Return receivable transactions for exactly this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |
| **valueDateGt** | **String**| Return receivable transactions for after this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |
| **valueDateGte** | **String**| Return receivable transactions for this date or later (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |
| **valueDateLt** | **String**| Return receivable transactions for before this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |
| **valueDateLte** | **String**| Return receivable transactions for this date or earlier (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |
| **valueDateRange** | **String**| Return receivable transactions for this date range (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |

### Return type

[**ReceivablesTransactionsPaginatedResponse**](ReceivablesTransactionsPaginatedResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="retrieve"></a>
# **retrieve**
> ReceivablesTransaction retrieve(receivableTransactionRequest).omit(omit).fields(fields).execute();

Retrieve receivable transactions for a link

Retrieve all receivable transactions for an existing link.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.ReceivableTransactionsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    ReceivableTransactionsApi api = new ReceivableTransactionsApi(apiClient);
    UUID link = UUID.randomUUID(); // The `link.id` that you want to get information for.
    String dateFrom = "dateFrom_example"; // The date from which you want to start getting transactions for, in `YYYY-MM-DD` format.  ⚠️ The value of `date_from` cannot be greater than `date_to`.
    String dateTo = "dateTo_example"; // The date you want to stop getting transactions for, in `YYYY-MM-DD` format.  ⚠️ The value of `date_to` cannot be greater than today's date (in other words, no future dates).
    String token = "token_example"; // The OTP token generated by the bank.
    Boolean saveData = true; // Indicates whether or not to persist the data in Belvo. By default, this is set to `true` and we return a 201 Created response. When set to `false`, the data won't be persisted and we return a 200 OK response.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      ReceivablesTransaction result = api
              .retrieve(link, dateFrom, dateTo)
              .token(token)
              .saveData(saveData)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivableTransactionsApi#retrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<ReceivablesTransaction> response = api
              .retrieve(link, dateFrom, dateTo)
              .token(token)
              .saveData(saveData)
              .omit(omit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivableTransactionsApi#retrieve");
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
| **receivableTransactionRequest** | [**ReceivableTransactionRequest**](ReceivableTransactionRequest.md)|  | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**ReceivablesTransaction**](ReceivablesTransaction.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok (when &#x60;save_data&#x3D;false&#x60;) |  -  |
| **201** | Created (when &#x60;save_data&#x3D;true&#x60;) |  -  |

