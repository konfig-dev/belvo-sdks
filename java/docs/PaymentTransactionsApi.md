# PaymentTransactionsApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetails**](PaymentTransactionsApi.md#getDetails) | **GET** /payments/transactions/{id} | Get details about a payment transaction |
| [**list**](PaymentTransactionsApi.md#list) | **GET** /payments/transactions | List all payment transactions |


<a name="getDetails"></a>
# **getDetails**
> PaymentTransaction getDetails(id).execute();

Get details about a payment transaction

Get the details about a specific payment transaction.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.PaymentTransactionsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    PaymentTransactionsApi api = new PaymentTransactionsApi(apiClient);
    UUID id = UUID.fromString("a3b92311-1888-449f-acaa-49ae28d68fcd"); // The `transaction.id` you want to get detailed information about.
    try {
      PaymentTransaction result = api
              .getDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTransactionsApi#getDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<PaymentTransaction> response = api
              .getDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTransactionsApi#getDetails");
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

### Return type

[**PaymentTransaction**](PaymentTransaction.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="list"></a>
# **list**
> PaymentsTransactionsPaginatedResponse list().page(page).idIn(idIn).createdAt(createdAt).createdAtGt(createdAtGt).createdAtGte(createdAtGte).createdAtLt(createdAtLt).createdAtLte(createdAtLte).createdAtRange(createdAtRange).charge(charge).chargeIn(chargeIn).beneficiary(beneficiary).beneficiaryIn(beneficiaryIn).payer(payer).payerIn(payerIn).transactionType(transactionType).currency(currency).description(description).amount(amount).amountGt(amountGt).amountGte(amountGte).amountLt(amountLt).amountLte(amountLte).amountRange(amountRange).execute();

List all payment transactions

List all payment transactions associated with your Belvo account.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.PaymentTransactionsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    PaymentTransactionsApi api = new PaymentTransactionsApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    String idIn = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264"; // One or more payment `transaction.id`s (comma separated) that you want to get results for.
    String createdAt = "2022-09-15"; // Return results only for this date (in `YYYY-MM-DD` format).
    String createdAtGt = "2022-09-15"; // Return results only after this date (in `YYYY-MM-DD` format).
    String createdAtGte = "2022-09-15"; // Return results only for this date and after (in `YYYY-MM-DD` format).
    String createdAtLt = "2022-09-15"; // Return results only before this date (in `YYYY-MM-DD` format).
    String createdAtLte = "2022-09-15"; // Return results only for this date and before (in `YYYY-MM-DD` format).
    String createdAtRange = "2022-09-15,2022-09-20"; // Return results between this date range (in `YYYY-MM-DD` format).
    String charge = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d"; // The `charge.id` you want to get results for.
    String chargeIn = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264"; // One or more `charge.id`s (comma separated) that you want to get results for.
    String beneficiary = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d"; // The `beneficiary.id` you want to get results for.
    String beneficiaryIn = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264"; // One or more `beneficiary.id`s (comma separated) that you want to get results for.
    String payer = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d"; // The payer's `bank-account.id` you want to get results for.
    String payerIn = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264"; // One or more payer `bank-account.id`s (comma separated) that you want to get results for.
    String transactionType = "INFLOW"; // Return results for a matched value type.
    String currency = "COP"; // Return results for a matched value type.
    String description = "Training shoes"; // Return results for a matched value type.
    String amount = "1000.00"; // Return results only for this value.
    String amountGt = "1000.00"; // Return results only for more than this amount.
    String amountGte = "1000.00"; // Return results only for and more than this amount.
    String amountLt = "1000.00"; // Return results only for less than this amount.
    String amountLte = "1000.00"; // Return results only for this amount or less.
    String amountRange = "1000.00,2000.00"; // Return results between this amount range
    try {
      PaymentsTransactionsPaginatedResponse result = api
              .list()
              .page(page)
              .idIn(idIn)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .charge(charge)
              .chargeIn(chargeIn)
              .beneficiary(beneficiary)
              .beneficiaryIn(beneficiaryIn)
              .payer(payer)
              .payerIn(payerIn)
              .transactionType(transactionType)
              .currency(currency)
              .description(description)
              .amount(amount)
              .amountGt(amountGt)
              .amountGte(amountGte)
              .amountLt(amountLt)
              .amountLte(amountLte)
              .amountRange(amountRange)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTransactionsApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<PaymentsTransactionsPaginatedResponse> response = api
              .list()
              .page(page)
              .idIn(idIn)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .charge(charge)
              .chargeIn(chargeIn)
              .beneficiary(beneficiary)
              .beneficiaryIn(beneficiaryIn)
              .payer(payer)
              .payerIn(payerIn)
              .transactionType(transactionType)
              .currency(currency)
              .description(description)
              .amount(amount)
              .amountGt(amountGt)
              .amountGte(amountGte)
              .amountLt(amountLt)
              .amountLte(amountLte)
              .amountRange(amountRange)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTransactionsApi#list");
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
| **idIn** | **String**| One or more payment &#x60;transaction.id&#x60;s (comma separated) that you want to get results for. | [optional] |
| **createdAt** | **String**| Return results only for this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtGt** | **String**| Return results only after this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtGte** | **String**| Return results only for this date and after (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtLt** | **String**| Return results only before this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtLte** | **String**| Return results only for this date and before (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtRange** | **String**| Return results between this date range (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **charge** | **String**| The &#x60;charge.id&#x60; you want to get results for. | [optional] |
| **chargeIn** | **String**| One or more &#x60;charge.id&#x60;s (comma separated) that you want to get results for. | [optional] |
| **beneficiary** | **String**| The &#x60;beneficiary.id&#x60; you want to get results for. | [optional] |
| **beneficiaryIn** | **String**| One or more &#x60;beneficiary.id&#x60;s (comma separated) that you want to get results for. | [optional] |
| **payer** | **String**| The payer&#39;s &#x60;bank-account.id&#x60; you want to get results for. | [optional] |
| **payerIn** | **String**| One or more payer &#x60;bank-account.id&#x60;s (comma separated) that you want to get results for. | [optional] |
| **transactionType** | **String**| Return results for a matched value type. | [optional] |
| **currency** | **String**| Return results for a matched value type. | [optional] |
| **description** | **String**| Return results for a matched value type. | [optional] |
| **amount** | **String**| Return results only for this value. | [optional] |
| **amountGt** | **String**| Return results only for more than this amount. | [optional] |
| **amountGte** | **String**| Return results only for and more than this amount. | [optional] |
| **amountLt** | **String**| Return results only for less than this amount. | [optional] |
| **amountLte** | **String**| Return results only for this amount or less. | [optional] |
| **amountRange** | **String**| Return results between this amount range | [optional] |

### Return type

[**PaymentsTransactionsPaginatedResponse**](PaymentsTransactionsPaginatedResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

