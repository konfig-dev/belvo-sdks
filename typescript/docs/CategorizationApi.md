# CategorizationApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categorizeTransactions**](CategorizationApi.md#categorizeTransactions) | **POST** /api/categorization | Categorize transactions


# **categorizeTransactions**

#### **POST** /api/categorization

### Description
Send through your raw transaction data and receive enriched information for each of your transactions.

<div style="background-color:#f4f6f8; border-left: 6px solid #5bc0de;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px">
<strong>Note: </strong> Belvo can process up to 10,000 unique transactions per request.
</div>

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const categorizeTransactionsResponse =
  await belvo.categorization.categorizeTransactions({
    language: "pt",
    transactions: [
      {
        description: "APPL3STORE",
        transaction_id: "3CWE4927CF15355",
        account_holder_type: "INDIVIDUAL",
        account_holder_id: "7890098789087",
        account_id: "BBVACA-89077589",
        account_category: "CREDIT_CARD",
        value_date: "2022-11-18",
        type: "OUTFLOW",
        amount: 650.89,
        currency: "BRL",
        institution: "BBVA",
        mcc: 2345,
      },
    ],
  });

console.log(categorizeTransactionsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categorizationRequest** | **CategorizationRequest**|  |


### Return type

**Categorization**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**403** | Access to Belvo API denied |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


